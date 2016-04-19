
package OnlineRoulette;

import java.io.BufferedReader;
import java.io.DataOutputStream;
import java.io.InputStreamReader;
import java.net.InetAddress;
import java.net.Socket;


public class clientLog extends javax.swing.JFrame {
    public static String request="";
    public static DataOutputStream outToServer;
    public static InetAddress inetAddress ;
    public static Socket clientSocket;
    public static BufferedReader inFromServer;
    public clientLog() {
        
        initComponents();
        num.setVisible(false);
        bet.setVisible(false);
        play.setVisible(false);
        coin.setVisible(false);
        wc.setVisible(false);
        n.setVisible(false);
        b.setVisible(false);
        
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jTextField1 = new javax.swing.JTextField();
        jTextField2 = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        coin = new javax.swing.JLabel();
        up = new javax.swing.JButton();
        num = new javax.swing.JComboBox();
        bet = new javax.swing.JComboBox();
        play = new javax.swing.JButton();
        wc = new javax.swing.JLabel();
        n = new javax.swing.JLabel();
        b = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jButton1.setText("Sign In");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jLabel1.setText("Username");

        jLabel2.setText("Password");

        coin.setText("Coin");

        up.setText("Sign Up");
        up.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                upActionPerformed(evt);
            }
        });

        num.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "1", "2", "3", "4", "5" }));
        num.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                numActionPerformed(evt);
            }
        });

        bet.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "10", "20", "30", "40", "50" }));

        play.setText("Play");
        play.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                playActionPerformed(evt);
            }
        });

        wc.setText("Welcome");

        n.setText("Number");

        b.setText("Bet");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(54, 54, 54)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGap(0, 66, Short.MAX_VALUE)
                        .addComponent(n)
                        .addGap(18, 18, 18)
                        .addComponent(num, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(b)
                        .addGap(12, 12, 12)
                        .addComponent(bet, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(123, 123, 123))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(play, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel3, javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel1)
                                    .addComponent(jLabel2))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(jTextField2, javax.swing.GroupLayout.DEFAULT_SIZE, 234, Short.MAX_VALUE)
                                    .addComponent(jTextField1)))
                            .addComponent(jButton1, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 293, Short.MAX_VALUE)
                            .addComponent(up, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(32, 32, 32)
                .addComponent(wc, javax.swing.GroupLayout.PREFERRED_SIZE, 105, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(coin, javax.swing.GroupLayout.PREFERRED_SIZE, 99, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(40, 40, 40))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(coin, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(wc))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(num, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(bet, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(n)
                    .addComponent(b))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTextField2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2))
                .addGap(18, 18, 18)
                .addComponent(jButton1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(up)
                .addGap(18, 18, 18)
                .addComponent(play)
                .addContainerGap(29, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
            String s=jTextField1.getText()+"-"+jTextField2.getText();
            try{
                outToServer.writeBytes(s+'\n');
                s=inFromServer.readLine();
                if(s.contains("Go"))
                {
                   String id[]=s.split(":");
                   jLabel1.setVisible(false);
                   jLabel2.setVisible(false);
                   jTextField1.setVisible(false);
                   jTextField2.setVisible(false);
                   jButton1.setVisible(false);
                   up.setVisible(false);
                   num.setVisible(true);
                   bet.setVisible(true);
                   play.setVisible(true);
                   coin.setVisible(true);
                   wc.setVisible(true);
                   n.setVisible(true);
                   b.setVisible(true);
                   coin.setText("Coin: "+id[1]);
                   wc.setText("Welcome: "+id[2]);
                   jLabel3.setText("Signed In. Bet Your Number to play");
                }
                else if(s.contains("User"))
                {
                    jLabel3.setText(s);
                }
            }
            catch(Exception ex)
            {
                
            }
    }//GEN-LAST:event_jButton1ActionPerformed

    private void numActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_numActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_numActionPerformed

    private void upActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_upActionPerformed
        // TODO add your handling code here:
         String s=jTextField1.getText()+"_"+jTextField2.getText();
         try{
                outToServer.writeBytes(s+'\n');
                s=inFromServer.readLine();
                if(s.contains("Up"))
                {
                   
                   jLabel3.setText("Sign Up Completed. Please Sign In To Continue");
                }
                
            }
            catch(Exception ex)
            {
                
            }
    }//GEN-LAST:event_upActionPerformed

    private void playActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_playActionPerformed
        // TODO add your handling code here:
        String aa[]=wc.getText().split(" ");
        String s=num.getSelectedItem()+":"+bet.getSelectedItem()+":"+aa[1];
         try{
                outToServer.writeBytes(s+'\n');
                s=inFromServer.readLine();
                if(s.contains("Win"))
                {
                   String aaa[]=s.split(":");
                   jLabel3.setText("U Win!! Correct Number W "+aaa[2]);
                   coin.setText("Coin: "+aaa[1]);
                }
                else if(s.contains("Lose"))
                {
                   String aaa[]=s.split(":");
                   jLabel3.setText("U Lose!! Correct Number Was "+aaa[2]);
                   coin.setText("Coin: "+aaa[1]);
                }
               /* else if(s.contains("wait"))
                {
                   
                   jLabel3.setText("Please wait for other player");
                   s=inFromServer.readLine();
                    if(s.contains("Win"))
                {
                   String aaa[]=s.split(":");
                   jLabel3.setText("U Win!!");
                   coin.setText("Coin: "+aaa[1]);
                }
                else if(s.contains("Lose"))
                {
                   String aaa[]=s.split(":");
                   jLabel3.setText("U Lose!!");
                   coin.setText("Coin: "+aaa[1]);
                }
                   
                  
                }*/
                
            }
            catch(Exception ex)
            {
                
            }
        
    }//GEN-LAST:event_playActionPerformed

    
    public static void main(String args[])throws Exception{
        inetAddress = InetAddress.getLocalHost();
       
        System.out.println(inetAddress);

        clientSocket = new Socket(inetAddress, 6789);
        outToServer =
                new DataOutputStream(clientSocket.getOutputStream());

        inFromServer =
                new BufferedReader(new InputStreamReader(clientSocket.getInputStream()));
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new clientLog().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel b;
    private javax.swing.JComboBox bet;
    private javax.swing.JLabel coin;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTextField jTextField2;
    private javax.swing.JLabel n;
    private javax.swing.JComboBox num;
    private javax.swing.JButton play;
    private javax.swing.JButton up;
    private javax.swing.JLabel wc;
    // End of variables declaration//GEN-END:variables
}
