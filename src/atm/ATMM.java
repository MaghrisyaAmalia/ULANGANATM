/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package atm;
import javax.swing.JOptionPane;
/**
 *
 * @author ASUS
 */
public class ATMM extends javax.swing.JFrame {

    String nomor="";
    int pilih;
    
    /**
     * Creates new form ATMM
     */
    public ATMM() {
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

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        hPin = new javax.swing.JTextField();
        jb0 = new javax.swing.JToggleButton();
        jb1 = new javax.swing.JToggleButton();
        jb2 = new javax.swing.JToggleButton();
        jb3 = new javax.swing.JToggleButton();
        jb4 = new javax.swing.JToggleButton();
        jb5 = new javax.swing.JToggleButton();
        jb6 = new javax.swing.JToggleButton();
        jb7 = new javax.swing.JToggleButton();
        jb8 = new javax.swing.JToggleButton();
        jb9 = new javax.swing.JToggleButton();
        jPanel1 = new javax.swing.JPanel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(null);

        jLabel1.setFont(new java.awt.Font("Times New Roman", 1, 36)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("W E L C O M E");
        getContentPane().add(jLabel1);
        jLabel1.setBounds(120, 0, 260, 60);

        jLabel2.setFont(new java.awt.Font("Times New Roman", 1, 36)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("ATM BANK");
        getContentPane().add(jLabel2);
        jLabel2.setBounds(150, 40, 210, 60);

        jLabel3.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("MASUKKAN PIN ANDA");
        getContentPane().add(jLabel3);
        jLabel3.setBounds(120, 110, 270, 50);

        hPin.setFont(new java.awt.Font("Times New Roman", 0, 24)); // NOI18N
        hPin.setForeground(new java.awt.Color(255, 0, 153));
        hPin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                hPinActionPerformed(evt);
            }
        });
        getContentPane().add(hPin);
        hPin.setBounds(90, 160, 320, 60);

        jb0.setFont(new java.awt.Font("Times New Roman", 0, 24)); // NOI18N
        jb0.setForeground(new java.awt.Color(255, 0, 153));
        jb0.setText("0");
        jb0.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jb0ActionPerformed(evt);
            }
        });
        getContentPane().add(jb0);
        jb0.setBounds(220, 470, 70, 50);

        jb1.setFont(new java.awt.Font("Times New Roman", 0, 24)); // NOI18N
        jb1.setForeground(new java.awt.Color(255, 0, 153));
        jb1.setText("1");
        jb1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jb1ActionPerformed(evt);
            }
        });
        getContentPane().add(jb1);
        jb1.setBounds(90, 240, 70, 50);

        jb2.setFont(new java.awt.Font("Times New Roman", 0, 24)); // NOI18N
        jb2.setForeground(new java.awt.Color(255, 0, 153));
        jb2.setText("2");
        jb2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jb2ActionPerformed(evt);
            }
        });
        getContentPane().add(jb2);
        jb2.setBounds(220, 240, 70, 50);

        jb3.setFont(new java.awt.Font("Times New Roman", 0, 24)); // NOI18N
        jb3.setForeground(new java.awt.Color(255, 0, 153));
        jb3.setText("3");
        jb3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jb3ActionPerformed(evt);
            }
        });
        getContentPane().add(jb3);
        jb3.setBounds(340, 240, 70, 50);

        jb4.setFont(new java.awt.Font("Times New Roman", 0, 24)); // NOI18N
        jb4.setForeground(new java.awt.Color(255, 0, 153));
        jb4.setText("4");
        jb4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jb4ActionPerformed(evt);
            }
        });
        getContentPane().add(jb4);
        jb4.setBounds(90, 310, 70, 50);

        jb5.setFont(new java.awt.Font("Times New Roman", 0, 24)); // NOI18N
        jb5.setForeground(new java.awt.Color(255, 0, 153));
        jb5.setText("5");
        jb5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jb5ActionPerformed(evt);
            }
        });
        getContentPane().add(jb5);
        jb5.setBounds(220, 310, 70, 50);

        jb6.setFont(new java.awt.Font("Times New Roman", 0, 24)); // NOI18N
        jb6.setForeground(new java.awt.Color(255, 0, 153));
        jb6.setText("6");
        jb6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jb6ActionPerformed(evt);
            }
        });
        getContentPane().add(jb6);
        jb6.setBounds(340, 310, 70, 50);

        jb7.setFont(new java.awt.Font("Times New Roman", 0, 24)); // NOI18N
        jb7.setForeground(new java.awt.Color(255, 0, 153));
        jb7.setText("7");
        jb7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jb7ActionPerformed(evt);
            }
        });
        getContentPane().add(jb7);
        jb7.setBounds(90, 390, 70, 50);

        jb8.setFont(new java.awt.Font("Times New Roman", 0, 24)); // NOI18N
        jb8.setForeground(new java.awt.Color(255, 0, 153));
        jb8.setText("8");
        jb8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jb8ActionPerformed(evt);
            }
        });
        getContentPane().add(jb8);
        jb8.setBounds(220, 390, 70, 50);

        jb9.setFont(new java.awt.Font("Times New Roman", 0, 24)); // NOI18N
        jb9.setForeground(new java.awt.Color(255, 0, 153));
        jb9.setText("9");
        jb9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jb9ActionPerformed(evt);
            }
        });
        getContentPane().add(jb9);
        jb9.setBounds(340, 390, 70, 50);

        jPanel1.setBackground(new java.awt.Color(255, 0, 153));
        jPanel1.setForeground(new java.awt.Color(255, 0, 153));

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 500, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 570, Short.MAX_VALUE)
        );

        getContentPane().add(jPanel1);
        jPanel1.setBounds(0, 0, 500, 570);

        setBounds(0, 0, 519, 611);
    }// </editor-fold>//GEN-END:initComponents

    private void hPinActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_hPinActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_hPinActionPerformed

    private void jb9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jb9ActionPerformed
        // TODO add your handling code here:
        nomor+="9";
        hPin.setText(nomor);
        pilih+=1;
        pengecekan();
    }//GEN-LAST:event_jb9ActionPerformed

    private void jb1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jb1ActionPerformed
        // TODO add your handling code here:
        nomor+="1";
        hPin.setText(nomor);
        pilih+=1;
        pengecekan();
    }//GEN-LAST:event_jb1ActionPerformed

    private void jb2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jb2ActionPerformed
        // TODO add your handling code here:
        nomor+="2";
        hPin.setText(nomor);
        pilih+=1;
        pengecekan();
    }//GEN-LAST:event_jb2ActionPerformed

    private void jb3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jb3ActionPerformed
        // TODO add your handling code here:
        nomor+="3";
        hPin.setText(nomor);
        pilih+=1;
        pengecekan();
    }//GEN-LAST:event_jb3ActionPerformed

    private void jb4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jb4ActionPerformed
        // TODO add your handling code here:
        nomor+="4";
        hPin.setText(nomor);
        pilih+=1;
        pengecekan();
    }//GEN-LAST:event_jb4ActionPerformed

    private void jb5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jb5ActionPerformed
        // TODO add your handling code here:
        nomor+="5";
        hPin.setText(nomor);
        pilih+=1;
        pengecekan();
    }//GEN-LAST:event_jb5ActionPerformed

    private void jb6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jb6ActionPerformed
        // TODO add your handling code here:
        nomor+="6";
        hPin.setText(nomor);
        pilih+=1;
        pengecekan();
    }//GEN-LAST:event_jb6ActionPerformed

    private void jb7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jb7ActionPerformed
        // TODO add your handling code here:
        nomor+="7";
        hPin.setText(nomor);
        pilih+=1;
        pengecekan();
    }//GEN-LAST:event_jb7ActionPerformed

    private void jb8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jb8ActionPerformed
        // TODO add your handling code here:
        nomor+="8";
        hPin.setText(nomor);
        pilih+=1;
        pengecekan();
    }//GEN-LAST:event_jb8ActionPerformed

    private void jb0ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jb0ActionPerformed
        // TODO add your handling code here:
        nomor+="0";
        hPin.setText(nomor);
        pilih+=1;
        pengecekan();
    }//GEN-LAST:event_jb0ActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
   
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ATMM().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField hPin;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JToggleButton jb0;
    private javax.swing.JToggleButton jb1;
    private javax.swing.JToggleButton jb2;
    private javax.swing.JToggleButton jb3;
    private javax.swing.JToggleButton jb4;
    private javax.swing.JToggleButton jb5;
    private javax.swing.JToggleButton jb6;
    private javax.swing.JToggleButton jb7;
    private javax.swing.JToggleButton jb8;
    private javax.swing.JToggleButton jb9;
    // End of variables declaration//GEN-END:variables

    private void pengecekan() {
        if(pilih == 4){
            String pin=hPin.getText();
            if("1234".equals(pin)){
                new Home().show();
                this.dispose();
            }
            else{
                JOptionPane.showMessageDialog(null, "Pin ERROR");
                hPin.setText("");
                pilih=0;
                nomor="";
            }
        }
    }
}
