/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package login;

import javax.swing.*;
import java.awt.*;
import java.awt.event.KeyEvent;
import java.io.*;
import java.util.*;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Gigabyte
 */
public class LogIn extends javax.swing.JFrame {

    /**
     * Creates new form LogIn
     */
    public LogIn() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        m1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        pass01 = new javax.swing.JPasswordField();
        name01 = new javax.swing.JTextField();
        b1 = new javax.swing.JButton();
        b2 = new javax.swing.JButton();
        m3 = new javax.swing.JLabel();
        Title = new javax.swing.JLabel();
        jcheck_01 = new javax.swing.JCheckBox();
        b3 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Grade Gateway");

        jPanel1.setBackground(new java.awt.Color(53, 99, 91));

        m1.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        m1.setForeground(new java.awt.Color(229, 241, 227));
        m1.setText("User ID         :");

        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(229, 241, 227));
        jLabel2.setText("Password      :");

        pass01.setToolTipText("Enter your Password");
        pass01.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                pass01KeyPressed(evt);
            }
        });

        name01.setToolTipText("Enter your User ID");

        b1.setBackground(new java.awt.Color(163, 205, 158));
        b1.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        b1.setText("Log in");
        b1.setMultiClickThreshhold(2L);
        b1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b1ActionPerformed(evt);
            }
        });

        b2.setBackground(new java.awt.Color(163, 205, 158));
        b2.setText("Sign Up");
        b2.setBorder(null);
        b2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b2ActionPerformed(evt);
            }
        });

        m3.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        m3.setForeground(new java.awt.Color(229, 241, 227));
        m3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        m3.setText("Haven't an Account? then");

        Title.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        Title.setForeground(new java.awt.Color(229, 241, 227));
        Title.setText("Welcome to Grade Gateway");

        jcheck_01.setBackground(new java.awt.Color(53, 99, 91));
        jcheck_01.setForeground(new java.awt.Color(255, 255, 255));
        jcheck_01.setText("Show Password");
        jcheck_01.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jcheck_01ActionPerformed(evt);
            }
        });

        b3.setBackground(new java.awt.Color(163, 205, 158));
        b3.setText("Exit");
        b3.setBorder(null);
        b3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b3ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap(174, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jcheck_01, javax.swing.GroupLayout.PREFERRED_SIZE, 139, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Title, javax.swing.GroupLayout.PREFERRED_SIZE, 348, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(0, 164, Short.MAX_VALUE))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(m3, javax.swing.GroupLayout.PREFERRED_SIZE, 166, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(b2, javax.swing.GroupLayout.PREFERRED_SIZE, 91, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(m1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 99, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(b1, javax.swing.GroupLayout.PREFERRED_SIZE, 96, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(name01)
                                .addComponent(pass01, javax.swing.GroupLayout.PREFERRED_SIZE, 179, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(b3, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(45, 45, 45))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap(109, Short.MAX_VALUE)
                .addComponent(Title, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(25, 25, 25)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(m1, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(name01, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(5, 5, 5)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(pass01, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jcheck_01)
                .addGap(41, 41, 41)
                .addComponent(b1, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(b2, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(m3, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(b3, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(40, 40, 40))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        setSize(new java.awt.Dimension(702, 465));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void b2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_b2ActionPerformed
        // TODO add your handling code here:
        // another jFrame will open
        SignUp newframe = new SignUp();
        newframe.show();// to open new JFrame
        dispose();// to close current JFrame        
    }//GEN-LAST:event_b2ActionPerformed

    private void b1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_b1ActionPerformed
        // TODO add your handling code here:
        String userName, pass;
        userName = name01.getText();
        pass = pass01.getText();

        if (userName.equals("") && pass.equals("")) {
            JOptionPane.showMessageDialog(null, "Please fillup User ID and Password properly.", "Message", 2);
        } else if (userName.equals("")) {
            JOptionPane.showMessageDialog(null, "Please fillup User ID properly.", "Message", 2);
        } else if (pass.equals("")) {
            JOptionPane.showMessageDialog(null, "Please fillup Password properly.", "Message", 2);
        }
        // To login, if user gave any id and pass
        if (userName.length() != 0 && pass.length() != 0) {
            try {
                FileReader fr = new FileReader("Registration.txt");
                BufferedReader br = new BufferedReader(fr);
                Scanner scan = new Scanner(br);
                
                String info = "";
                while(scan.hasNextLine())
                {
                    info = info.concat(scan.nextLine() + "\n");
                }
                String[] s2 = info.split("\n");
                System.out.println(s2);

                String userName_x = s2[2];
                String pass_x = s2[3];

                if (userName.equals(userName_x) && pass.equals(pass_x)) {
                    // new Jframe will open from here
                    WorkBench wbench = new WorkBench();
                    wbench.show();
                    scan.close();
                    dispose(); // login will dispose here...
                } else {
                    JOptionPane.showMessageDialog(null, "Oops! wrong Password. Please try again", "Message", 2);
                }
                scan.close();

            } catch (FileNotFoundException ex) {
                JOptionPane.showMessageDialog(null, "Sorry You haven't create an ID. Please Sign Up first",
                        "Message", 2);
            }
        }

    }//GEN-LAST:event_b1ActionPerformed

    private void jcheck_01ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jcheck_01ActionPerformed
        // TODO add your handling code here:
        if (jcheck_01.isSelected()) {
            pass01.setEchoChar((char) 0);
        } else {
            pass01.setEchoChar('*');
        }
    }//GEN-LAST:event_jcheck_01ActionPerformed

    private void b3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_b3ActionPerformed
        // TODO add your handling code here:
        System.exit(0);
    }//GEN-LAST:event_b3ActionPerformed

    private void pass01KeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_pass01KeyPressed
        // TODO add your handling code here:
        String name, pass;
        name = name01.getText();
        pass = pass01.getText();

        if (evt.getKeyCode() == KeyEvent.VK_ENTER) {
            if (name.length() != 0 && pass.length() != 0) {
                try {
                    FileReader fr = new FileReader("Myfile.txt");
                    BufferedReader br = new BufferedReader(fr);
                    Scanner scan = new Scanner(br);

                    String name_x = scan.nextLine();
                    String pass_x = scan.nextLine();

                    if (name.equals(name_x) && pass.equals(pass_x)) {
                        // new Jframe will open from here
                        WorkBench wbench = new WorkBench();
                        wbench.show();
                        scan.close();
                        dispose(); // login will dispose here...
                    } else {
                        JOptionPane.showMessageDialog(null, "Oops! wrong Password. Please try again", "Message", 2);
                    }
                    scan.close();

                } catch (FileNotFoundException ex) {
                    JOptionPane.showMessageDialog(null, "Sorry You haven't create an ID. Please Sign Up first",
                            "Message", 2);
                }
            }
        }
    }//GEN-LAST:event_pass01KeyPressed

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
            java.util.logging.Logger.getLogger(LogIn.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(LogIn.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(LogIn.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(LogIn.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new LogIn().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel Title;
    private javax.swing.JButton b1;
    private javax.swing.JButton b2;
    private javax.swing.JButton b3;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JCheckBox jcheck_01;
    private javax.swing.JLabel m1;
    private javax.swing.JLabel m3;
    private javax.swing.JTextField name01;
    private javax.swing.JPasswordField pass01;
    // End of variables declaration//GEN-END:variables
}
