
import javax.swing.JOptionPane;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Siti Afiyah
 */
public class Frame extends javax.swing.JFrame {

    /**
     * Creates new form Frame
     */
    String str, str1;
        int choice, z, pin = 1234, counter=0, a=3;
        int t,s,tab=50000;
    
    public Frame() {
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
        jButton1 = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(null);

        jLabel1.setText("SELAMAT DATANG");
        getContentPane().add(jLabel1);
        jLabel1.setBounds(140, 50, 130, 30);

        jLabel2.setText("ANJUNGAN TUNAI MANDIRI  ");
        getContentPane().add(jLabel2);
        jLabel2.setBounds(130, 80, 170, 30);

        jLabel3.setText("BNI SYARIAH-BOJONEGORO");
        getContentPane().add(jLabel3);
        jLabel3.setBounds(120, 110, 210, 30);

        jButton1.setText("OK");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1);
        jButton1.setBounds(160, 200, 73, 23);

        jLabel4.setText("Masukan 4 Digit PIN Anda");
        getContentPane().add(jLabel4);
        jLabel4.setBounds(130, 160, 170, 30);

        setBounds(0, 0, 416, 339);
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
  
                str = JOptionPane.showInputDialog (null, "Masukkan 4 Digit PIN Anda : ",
                        "ATM BNI SYARIAH-BOJONEGORO",0);

                if (pin ==1234) //cek pin
                {
                    new Frame1().setVisible(true);
                    dispose();
                }
              
                else if (counter<3){   //jika pin salah
                    a--; //menghitung kesalahan login dan memberikan kesempatan login
                    JOptionPane.showMessageDialog(null,"Pin Salah !\nPastikan PIN yang anda masukkan benar","ERROR",0);
                    JOptionPane.showMessageDialog(null,"\nKesempatan login " +
                        a + " kali lagi" + "\n");
                }

                else {
                    JOptionPane.showMessageDialog(null,"Untuk bantuan nasabah,\nsilahkan menghubungi call center 555123 (Gratis)","Kartu ATM anda diblokir!",0);
                    System.exit(0);
                }
                // }

            //            while (1==1);
            // }
        // catch (NumberFormatException e)
       
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton1ActionPerformed

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
            java.util.logging.Logger.getLogger(Frame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Frame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Frame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Frame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Frame().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    // End of variables declaration//GEN-END:variables
}
