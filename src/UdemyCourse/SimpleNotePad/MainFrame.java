
package UdemyCourse.SimpleNotePad;

import UdemyCourse.SimpleNotePad.dialog.AboutUsDialog;
import UdemyCourse.SimpleNotePad.util.FileUtils;
import java.io.IOException;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;

/**
 *
 * @author anhnn
 */
public class MainFrame extends javax.swing.JFrame {

    /**
     * Creates new form MainFrame
     */
    public MainFrame() {
        initComponents();
        
        setLocationRelativeTo(null);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        txaContent = new javax.swing.JTextArea();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        mnuNew = new javax.swing.JMenuItem();
        jSeparator2 = new javax.swing.JPopupMenu.Separator();
        mnuOpen = new javax.swing.JMenuItem();
        mnuSave = new javax.swing.JMenuItem();
        jSeparator1 = new javax.swing.JPopupMenu.Separator();
        mnuExit = new javax.swing.JMenuItem();
        jMenu2 = new javax.swing.JMenu();
        mnuContent = new javax.swing.JMenuItem();
        jSeparator3 = new javax.swing.JPopupMenu.Separator();
        mnuAboutUs = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Simple NotePad");
        setSize(new java.awt.Dimension(535, 369));
        getContentPane().setLayout(new java.awt.BorderLayout(5, 5));

        txaContent.setColumns(20);
        txaContent.setRows(5);
        jScrollPane1.setViewportView(txaContent);

        getContentPane().add(jScrollPane1, java.awt.BorderLayout.CENTER);

        jMenu1.setText("File");

        mnuNew.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_N, java.awt.event.InputEvent.CTRL_DOWN_MASK));
        mnuNew.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/new.png"))); // NOI18N
        mnuNew.setText("New");
        mnuNew.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mnuNewActionPerformed(evt);
            }
        });
        jMenu1.add(mnuNew);
        jMenu1.add(jSeparator2);

        mnuOpen.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_O, java.awt.event.InputEvent.CTRL_DOWN_MASK));
        mnuOpen.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/open.png"))); // NOI18N
        mnuOpen.setText("Open");
        mnuOpen.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mnuOpenActionPerformed(evt);
            }
        });
        jMenu1.add(mnuOpen);

        mnuSave.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_S, java.awt.event.InputEvent.CTRL_DOWN_MASK));
        mnuSave.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/save.png"))); // NOI18N
        mnuSave.setText("Save");
        mnuSave.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mnuSaveActionPerformed(evt);
            }
        });
        jMenu1.add(mnuSave);
        jMenu1.add(jSeparator1);

        mnuExit.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_X, java.awt.event.InputEvent.ALT_DOWN_MASK));
        mnuExit.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/exit.png"))); // NOI18N
        mnuExit.setText("Exit");
        mnuExit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mnuExitActionPerformed(evt);
            }
        });
        jMenu1.add(mnuExit);

        jMenuBar1.add(jMenu1);

        jMenu2.setText("Help");

        mnuContent.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_H, java.awt.event.InputEvent.CTRL_DOWN_MASK));
        mnuContent.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/content.png"))); // NOI18N
        mnuContent.setText("Content");
        jMenu2.add(mnuContent);
        jMenu2.add(jSeparator3);

        mnuAboutUs.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_H, java.awt.event.InputEvent.SHIFT_DOWN_MASK | java.awt.event.InputEvent.CTRL_DOWN_MASK));
        mnuAboutUs.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/about.png"))); // NOI18N
        mnuAboutUs.setText("About Us");
        mnuAboutUs.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mnuAboutUsActionPerformed(evt);
            }
        });
        jMenu2.add(mnuAboutUs);

        jMenuBar1.add(jMenu2);

        setJMenuBar(jMenuBar1);
    }// </editor-fold>//GEN-END:initComponents

    private void mnuNewActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mnuNewActionPerformed
        txaContent.setText("");
    }//GEN-LAST:event_mnuNewActionPerformed

    private void mnuSaveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mnuSaveActionPerformed
        JFileChooser chooser = new JFileChooser();
        
        int option = chooser.showSaveDialog(this);
        if (option == JFileChooser.APPROVE_OPTION){
            String data = txaContent.getText();
            
            try {
                FileUtils.save(chooser.getSelectedFile().getAbsolutePath(), data);
                
                JOptionPane.showMessageDialog(this, "File is saved!", 
                        "Information", JOptionPane.INFORMATION_MESSAGE);
            } catch (IOException ex) {
                JOptionPane.showMessageDialog(this, ex.getMessage(), "Error", 
                        JOptionPane.ERROR_MESSAGE);
            }
        }
    }//GEN-LAST:event_mnuSaveActionPerformed

    private void mnuOpenActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mnuOpenActionPerformed
        JFileChooser chooser = new JFileChooser();
        
        int option = chooser.showOpenDialog(this);
        
        if (option == JFileChooser.APPROVE_OPTION){
            try {
                String data = FileUtils.open(chooser.getSelectedFile().getAbsolutePath());
                
                txaContent.setText(data);

            } catch (IOException ex) {
                JOptionPane.showMessageDialog(this, ex.getMessage(), "Error", 
                        JOptionPane.ERROR_MESSAGE);
            }
        }
    }//GEN-LAST:event_mnuOpenActionPerformed

    private void mnuAboutUsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mnuAboutUsActionPerformed
        AboutUsDialog dialog = new AboutUsDialog(this, true);
        
        dialog.setVisible(true);
    }//GEN-LAST:event_mnuAboutUsActionPerformed

    private void mnuExitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mnuExitActionPerformed
        System.exit(0);
    }//GEN-LAST:event_mnuExitActionPerformed

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
            java.util.logging.Logger.getLogger(MainFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(MainFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MainFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MainFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new MainFrame().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JPopupMenu.Separator jSeparator1;
    private javax.swing.JPopupMenu.Separator jSeparator2;
    private javax.swing.JPopupMenu.Separator jSeparator3;
    private javax.swing.JMenuItem mnuAboutUs;
    private javax.swing.JMenuItem mnuContent;
    private javax.swing.JMenuItem mnuExit;
    private javax.swing.JMenuItem mnuNew;
    private javax.swing.JMenuItem mnuOpen;
    private javax.swing.JMenuItem mnuSave;
    private javax.swing.JTextArea txaContent;
    // End of variables declaration//GEN-END:variables
}