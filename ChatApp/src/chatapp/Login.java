package chatapp;


import java.awt.Color;
import java.io.IOException;
import java.net.Socket;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author ting
 */
public class Login extends javax.swing.JFrame {

    /**
     * Creates new form Chatroom
     */
    public Login() {
        initComponents();
        this.setTitle("Welcome to the Amazing Chat System!");
        jProgressBar1.setVisible(false);
        loadingLabel.setVisible(false);
        hostLbl.setVisible(false);
        ErrorTb.setVisible(false);
        errorPortTb.setVisible(false);
        errorUserNameTb.setVisible(false);
        
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        usernameTb = new javax.swing.JTextField();
        enterBtn = new javax.swing.JButton();
        ErrorTb = new javax.swing.JLabel();
        jProgressBar1 = new javax.swing.JProgressBar();
        loadingLabel = new javax.swing.JLabel();
        portNoTb = new javax.swing.JTextField();
        errorPortTb = new javax.swing.JLabel();
        errorUserNameTb = new javax.swing.JLabel();
        hostTb = new javax.swing.JTextField();
        hostLbl = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setText("Welcome to Chatroom");

        jLabel2.setText("Username:");

        usernameTb.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        usernameTb.setToolTipText("");
        usernameTb.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                usernameTbActionPerformed(evt);
            }
        });

        enterBtn.setText("Join Chatroom");
        enterBtn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                enterBtnMouseClicked(evt);
            }
        });
        enterBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                enterBtnActionPerformed(evt);
            }
        });

        ErrorTb.setForeground(new java.awt.Color(255, 102, 102));

        jProgressBar1.setForeground(new java.awt.Color(0, 255, 0));

        loadingLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        loadingLabel.setText("Connected!");

        portNoTb.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        portNoTb.setToolTipText("");
        portNoTb.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                portNoTbActionPerformed(evt);
            }
        });

        errorPortTb.setForeground(new java.awt.Color(255, 51, 51));
        errorPortTb.setText("Require port number!");

        errorUserNameTb.setForeground(new java.awt.Color(255, 51, 51));
        errorUserNameTb.setText("Require username!");

        hostTb.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        hostTb.setText("localhost");

        hostLbl.setForeground(new java.awt.Color(255, 51, 51));
        hostLbl.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        hostLbl.setText("Required server address!");

        jLabel3.setText("Server Address");

        jLabel4.setText("Port number");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addGap(102, 102, 102))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(enterBtn)
                            .addComponent(errorPortTb))
                        .addGap(104, 104, 104))))
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(133, 133, 133)
                        .addComponent(jLabel4)
                        .addGap(119, 119, 119)
                        .addComponent(ErrorTb))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(90, 90, 90)
                        .addComponent(hostLbl))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(68, 68, 68)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(usernameTb, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(52, 52, 52)
                                .addComponent(errorUserNameTb))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(71, 71, 71)
                                .addComponent(jLabel2))
                            .addComponent(hostTb, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(portNoTb, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(127, 127, 127)
                        .addComponent(jLabel3))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(53, 53, 53)
                        .addComponent(jProgressBar1, javax.swing.GroupLayout.PREFERRED_SIZE, 227, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(128, 128, 128)
                        .addComponent(loadingLabel)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addGap(18, 18, 18)
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(usernameTb, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(errorUserNameTb)
                .addGap(18, 18, 18)
                .addComponent(jLabel3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(hostTb, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(hostLbl)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(37, 37, 37)
                        .addComponent(ErrorTb))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel4)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(portNoTb, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(errorPortTb)
                .addGap(18, 18, 18)
                .addComponent(enterBtn)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jProgressBar1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(loadingLabel)
                .addContainerGap(24, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void usernameTbActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_usernameTbActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_usernameTbActionPerformed

    private void enterBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_enterBtnActionPerformed
        // TODO add your handling code here:
        int port = 1500;                    //default port
        errorUserNameTb.setVisible(false);
        errorPortTb.setVisible(false);
        hostLbl.setVisible(false);
        if(usernameTb.getText().equals("")) {
            errorUserNameTb.setVisible(true);
            return;
        }
        if(hostLbl.getText().equals("")){
            hostLbl.setText("Required server address!");
            hostLbl.setVisible(true);
            return;
        }
        if(portNoTb.getText().equals("")){
            errorPortTb.setText("Required Port Number!");
            errorPortTb.setVisible(true);
            return;
        }
        
        try {
            port = Integer.parseInt(portNoTb.getText());
        }
        catch(NumberFormatException e) {
            errorPortTb.setText("Invalid Port Number!");
            errorPortTb.setVisible(true);
            return;
        } 
        
        initConnection("localhost", port);
        
        
    }//GEN-LAST:event_enterBtnActionPerformed

    private void enterBtnMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_enterBtnMouseClicked
        // TODO add your handling code here:
        
        
    }//GEN-LAST:event_enterBtnMouseClicked

    private void portNoTbActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_portNoTbActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_portNoTbActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Login().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel ErrorTb;
    private javax.swing.JButton enterBtn;
    private javax.swing.JLabel errorPortTb;
    private javax.swing.JLabel errorUserNameTb;
    private javax.swing.JLabel hostLbl;
    private javax.swing.JTextField hostTb;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JProgressBar jProgressBar1;
    private javax.swing.JLabel loadingLabel;
    private javax.swing.JTextField portNoTb;
    private javax.swing.JTextField usernameTb;
    // End of variables declaration//GEN-END:variables

    private void initConnection(String serverAddress, int port) {
        
        // Open Progress bar
        enterBtn.setEnabled(false);
        usernameTb.setEditable(false);
        jProgressBar1.setForeground(Color.green);
        jProgressBar1.setVisible(true);
        loadingLabel.setVisible(true);
        jProgressBar1.setValue(50);
        
        // Get connection
        Socket s;
        try {
            s = new Socket(serverAddress, port);
            
            loadingLabel.setText("Connected!");

            // create the Client object
            ClientConnection client = new ClientConnection(hostTb.getText(), usernameTb.getText(), s.getPort(), s);

            // tell server that this username is connected
            client.getSOutput().writeObject(client.getUserName());
            
            // Get uniqueID from server
            int uniqueId = (Integer)client.getSInput().readObject();
            
            client.setId(uniqueId);
            
            this.setVisible(false);
            new Chatroom(client).setVisible(true);
        } catch (IOException ex) {
            jProgressBar1.setValue(100);
            loadingLabel.setText("Connection Failed..");
            jProgressBar1.setForeground(Color.red);
            usernameTb.setEditable(true);
            enterBtn.setEnabled(true);
            return;
        } catch (ClassNotFoundException ex) {
            
        }
        
    }
}