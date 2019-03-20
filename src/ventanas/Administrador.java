package ventanas;

import java.awt.Image;
import java.awt.Toolkit;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import static ventanas.Login.label_NombreUsuario;

public class Administrador extends javax.swing.JFrame {
    
    String usuario = label_NombreUsuario.getText().toString();

    public Administrador() {
        initComponents();
        setTitle("Administrador");
        setLocationRelativeTo(null);
        label_Usuario.setText("Bienvenido "+usuario);
        
        // Wallpaper
        ImageIcon wallpaper = new ImageIcon("src/images/wallpaperPrincipal.jpg");
        Icon icono = new ImageIcon(wallpaper.getImage().getScaledInstance(label_wallpaper.getWidth(), label_wallpaper.getHeight() , Image.SCALE_DEFAULT));
        label_wallpaper.setIcon(icono);
        this.repaint();
    }
    
    // Establecer icono de ventana
    @Override
    public Image getIconImage(){
        Image retValue = Toolkit.getDefaultToolkit().getImage(ClassLoader.getSystemResource("images/icon.png"));
        return retValue;
        
    }
    
    


    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        label_Usuario = new javax.swing.JLabel();
        button_RegistrarUsuario = new javax.swing.JButton();
        button_GestionarUsuarios = new javax.swing.JButton();
        button_Creatividad = new javax.swing.JButton();
        button_Capturista = new javax.swing.JButton();
        button_Tecnico = new javax.swing.JButton();
        button_Acerca = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        label_wallpaper = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setIconImage(getIconImage());
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        label_Usuario.setFont(new java.awt.Font("Arial", 1, 20)); // NOI18N
        label_Usuario.setForeground(new java.awt.Color(255, 255, 255));
        label_Usuario.setText("jLabel2");
        getContentPane().add(label_Usuario, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 20, -1, -1));

        button_RegistrarUsuario.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/addUser.png"))); // NOI18N
        getContentPane().add(button_RegistrarUsuario, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 70, 120, 100));

        button_GestionarUsuarios.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/informationuser.png"))); // NOI18N
        getContentPane().add(button_GestionarUsuarios, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 70, 120, 100));

        button_Creatividad.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/creatividad.png"))); // NOI18N
        getContentPane().add(button_Creatividad, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 70, 120, 100));

        button_Capturista.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/capturista.png"))); // NOI18N
        getContentPane().add(button_Capturista, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 240, 120, 100));

        button_Tecnico.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/tecnico.png"))); // NOI18N
        getContentPane().add(button_Tecnico, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 240, 120, 100));

        button_Acerca.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/RB003b.png"))); // NOI18N
        getContentPane().add(button_Acerca, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 240, 120, 100));

        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Registrar Usuario");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 170, -1, -1));

        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Gestionar Usuarios");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 170, -1, -1));

        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Creatividad");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(530, 170, -1, -1));

        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("Panel Vista Capturista");
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 340, -1, -1));

        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("Panel Vista Tecnico");
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 340, -1, -1));

        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setText("Acerca de");
        getContentPane().add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(530, 340, -1, -1));

        jLabel7.setFont(new java.awt.Font("Arial", 3, 18)); // NOI18N
        jLabel7.setText("Creado por Robert - Bass ®");
        getContentPane().add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(215, 400, -1, -1));
        getContentPane().add(label_wallpaper, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 10, 650, 420));

        pack();
    }// </editor-fold>//GEN-END:initComponents

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
            java.util.logging.Logger.getLogger(Administrador.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Administrador.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Administrador.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Administrador.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Administrador().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton button_Acerca;
    private javax.swing.JButton button_Capturista;
    private javax.swing.JButton button_Creatividad;
    private javax.swing.JButton button_GestionarUsuarios;
    private javax.swing.JButton button_RegistrarUsuario;
    private javax.swing.JButton button_Tecnico;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel label_Usuario;
    private javax.swing.JLabel label_wallpaper;
    // End of variables declaration//GEN-END:variables
}
