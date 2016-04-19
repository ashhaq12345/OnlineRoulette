
package OnlineRoulette;

import java.io.BufferedReader;
import java.io.DataOutputStream;
import java.io.InputStreamReader;
import java.io.ObjectOutputStream;
import java.net.ServerSocket;
import java.net.Socket;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Random;
import java.util.Arrays;
public class server {
public static int connected=0;
    
    public static void main(String[] args) throws Exception {
        
       ServerSocket welcomeSocket = new ServerSocket(6789);
        System.out.println(welcomeSocket.isClosed());
        ObjectOutputStream oos[]=new ObjectOutputStream[4];
        int i=0;
        int result[]=new int[10];
        Random randomGenerator = new Random();

        for(i=0;i<10;i++){
            result[i]=randomGenerator.nextInt(4)+1;
        }
        SThread s;
        for(i=0;;i++) {
            Socket connectionSocket = welcomeSocket.accept();
            BufferedReader inFromClient =
                    new BufferedReader(new InputStreamReader(
                    connectionSocket.getInputStream()));
            DataOutputStream outToClient =
                    new DataOutputStream(
                    connectionSocket.getOutputStream());
            System.out.println("Client : "+i+" Connected");
            s=new SThread(inFromClient, outToClient, i,result);
            s.start();     
        }
    }
    
}
class SThread extends Thread{

    BufferedReader inFromClient;
    DataOutputStream outToClient;
    String clientSentence;
    private static Connection connect = null;
    private static Statement statement = null;
    private static PreparedStatement preparedStatement = null;
    private static ResultSet resultSet = null;
    int srcid;
    int co=0;
    
    int result[]=new int[10];
    public SThread(BufferedReader in, DataOutputStream out,int a,int[] b) {
        inFromClient = in;
        outToClient = out;
        srcid = a;
        result=b;
    }

    @Override
    public void run() {
        
        while (true) {
            try {
                System.out.println(Arrays.toString(result));
                clientSentence = inFromClient.readLine();
                System.out.println("From Client : "+(srcid+1)+" : "+clientSentence);
                if(clientSentence.contains("-"))
                {
                    String id[]=clientSentence.split("-");
                    Class.forName("com.mysql.jdbc.Driver");
                    connect = DriverManager.getConnection("jdbc:mysql://127.0.0.1/test10?user=root");
                    preparedStatement = connect.prepareStatement("select*from info where name='"+id[0]+"' and pass='"+id[1]+"'");
                    resultSet = preparedStatement.executeQuery();
                    int found=0;
                    int coin=0;
                    while(resultSet.next()){
                       found=1;
                       coin=Integer.parseInt(resultSet.getString("coin"));
                    }
                    if(found==1){
                        outToClient.writeBytes("Go to another Frame:"+coin+":"+id[0]+'\n');
                        System.out.println(coin);
                       
                    } 
                    else
                        outToClient.writeBytes("User not found"+'\n'); 
                }
                else if (clientSentence.contains("_")){
                     String id[]=clientSentence.split("_");
                     System.out.println(clientSentence);
                    Class.forName("com.mysql.jdbc.Driver");
                    connect = DriverManager.getConnection("jdbc:mysql://127.0.0.1/test10?user=root");
                    preparedStatement = connect.prepareStatement("INSERT INTO info(name,pass) values('"+id[0]+"','"+id[1]+"')");
                     preparedStatement.executeUpdate();
                   
                   
                        outToClient.writeBytes("Sign Up Completed"+'\n'); 
                    
                }
                else if(clientSentence.contains(":")){
                    server.connected++;
                      String id[]=clientSentence.split(":");
                     System.out.println(clientSentence);
                     int number=Integer.parseInt(id[0]);
                     int bet=Integer.parseInt(id[1]);
                     int coin=0;
                     Class.forName("com.mysql.jdbc.Driver");
                    connect = DriverManager.getConnection("jdbc:mysql://127.0.0.1/test10?user=root");
                    preparedStatement = connect.prepareStatement("select*from info where name='"+id[2]+"'");
                    resultSet = preparedStatement.executeQuery();
                    while(resultSet.next()){
                     coin=Integer.parseInt(resultSet.getString("coin"));
                    /* while(server.connected<2){
                          outToClient.writeBytes("Please wait"+'\n');
                     }*/
                    }
                     if(number==result[co]){
                         coin=coin+bet*4;
                         outToClient.writeBytes("You Win:"+coin+":"+result[co]+'\n');
                     }
                     else{
                         coin=coin-bet;
                         outToClient.writeBytes("You Lose:"+coin+":"+result[co]+'\n');
                     }
                      connect = DriverManager.getConnection("jdbc:mysql://127.0.0.1/test10?user=root");
                        preparedStatement = connect.prepareStatement("UPDATE info set coin='"+coin+"'where name='"+id[2]+"'");
                     preparedStatement.executeUpdate();
                     co++;
                   
                   
                        
                     
                }
            } 
            catch (SQLException ex) {
                System.out.println(ex.getMessage());
            }
            catch (Exception ex) {
                System.out.println(ex.getMessage());
            }
        }
    }
    }