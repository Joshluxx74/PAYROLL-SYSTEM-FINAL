/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package payroll.system;

import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.JOptionPane;
import static payroll.system.db.Database.st;
import static payroll.system.db.Database.updatep;

/**
 *
 * @author dell
 */
public class UpdatePassword extends javax.swing.JFrame {

    /**
     * Creates new form UpdatePassword
     */
    public UpdatePassword() {
        initComponents();
        this.setLocationRelativeTo(null);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        userid = new javax.swing.JTextField();
        oldp = new javax.swing.JPasswordField();
        newp = new javax.swing.JPasswordField();
        rnewp = new javax.swing.JPasswordField();
        jButton1 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Update Password");
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel2.setFont(new java.awt.Font("Agency FB", 1, 36)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("UPDATE PASSWORD");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 5, 240, 50));

        jLabel3.setFont(new java.awt.Font("Agency FB", 1, 18)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("ENTER ID");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 130, 50, 30));

        jLabel4.setFont(new java.awt.Font("Agency FB", 1, 18)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("ENTER OLD PASSWORD");
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 170, -1, 30));

        jLabel5.setFont(new java.awt.Font("Agency FB", 1, 18)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("ENTER NEW PASSWORD");
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 210, -1, 30));

        jLabel6.setFont(new java.awt.Font("Agency FB", 1, 18)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setText("RE-ENTER NEW PASSWORD");
        getContentPane().add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 250, -1, 30));

        userid.setFont(new java.awt.Font("Arial for oup 97", 1, 14)); // NOI18N
        getContentPane().add(userid, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 130, 200, 30));

        oldp.setFont(new java.awt.Font("Arial for oup 97", 1, 14)); // NOI18N
        getContentPane().add(oldp, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 170, 200, 30));

        newp.setFont(new java.awt.Font("Arial for oup 97", 1, 14)); // NOI18N
        getContentPane().add(newp, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 210, 200, 30));

        rnewp.setFont(new java.awt.Font("Arial for oup 97", 1, 14)); // NOI18N
        rnewp.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rnewpActionPerformed(evt);
            }
        });
        getContentPane().add(rnewp, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 250, 200, 30));

        jButton1.setFont(new java.awt.Font("Agency FB", 1, 18)); // NOI18N
        jButton1.setText("SUBMIT");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 350, 150, 30));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/payroll/system/33870hd.jpg"))); // NOI18N
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 65, 600, 390));

        jPanel2.setBackground(new java.awt.Color(26, 26, 31));

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 600, Short.MAX_VALUE)
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 70, Short.MAX_VALUE)
        );

        getContentPane().add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 600, 70));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void rnewpActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rnewpActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_rnewpActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        try{
        String s1=userid.getText();
        String s3=String.valueOf(oldp.getPassword());
        String s2=String.valueOf(newp.getPassword());
        String s4=String.valueOf(rnewp.getPassword());
        updatep.setString(1,s2);
        updatep.setString(2,s1);
        updatep.executeUpdate();
          //if(st.next())
        //    {
                new AdminPanel().setVisible(true);
         //   }
           // else
            //{
             //   JOptionPane.showMessageDialog(null,"Invalid Credentials");
           // }
        }
        catch(SQLException ex)
        {
            JOptionPane.showMessageDialog(null,ex);

        }
        
        new MainScreen().setVisible(true);
        dispose();// TODO add your handling code here:
    }//GEN-LAST:event_jButton1ActionPerformed

    /**
     * @param args the command line arguments
     */
    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPasswordField newp;
    private javax.swing.JPasswordField oldp;
    private javax.swing.JPasswordField rnewp;
    private javax.swing.JTextField userid;
    // End of variables declaration//GEN-END:variables
}