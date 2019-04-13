
package ventanas;

import java.awt.Image;
import java.awt.Toolkit;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import java.sql.*;
import clases.Conexion;
import javax.swing.JOptionPane;


public class Login extends javax.swing.JFrame {
    
    public static String user = "";
    public static String nUsuario="";
    String pass = "";

    public Login() {
        initComponents();
        setSize(400,550);
        setResizable(false);
        setTitle("Acceso al Sistema");
        setLocationRelativeTo(null);
        
        // Wallpaper
        ImageIcon wallpaper = new ImageIcon("src/images/wallpaperPrincipal.jpg");
        Icon icono = new ImageIcon(wallpaper.getImage().getScaledInstance(label_wallpaper.getWidth(), label_wallpaper.getHeight() , Image.SCALE_DEFAULT));
        label_wallpaper.setIcon(icono);
        this.repaint();
        
        // Logo
        ImageIcon wLogo = new ImageIcon("src/images/DS.png");
        Icon iLogo = new ImageIcon(wLogo.getImage().getScaledInstance(label_Logo.getWidth(), label_Logo.getHeight(), Image.SCALE_DEFAULT));
        label_Logo.setIcon(iLogo);
        this.repaint();
        
        label_NombreUsuario.setVisible(false);
        
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

        label_Logo = new javax.swing.JLabel();
        txt_User = new javax.swing.JTextField();
        txt_Password = new javax.swing.JPasswordField();
        acceder = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        label_NombreUsuario = new javax.swing.JLabel();
        label_wallpaper = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setIconImage(getIconImage());
        setResizable(false);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        getContentPane().add(label_Logo, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 10, 270, 270));

        txt_User.setBackground(new java.awt.Color(153, 153, 255));
        txt_User.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        txt_User.setForeground(new java.awt.Color(255, 255, 255));
        txt_User.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txt_User.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        getContentPane().add(txt_User, new org.netbeans.lib.awtextra.AbsoluteConstraints(95, 330, 210, -1));

        txt_Password.setBackground(new java.awt.Color(153, 153, 255));
        txt_Password.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        txt_Password.setForeground(new java.awt.Color(255, 255, 255));
        txt_Password.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txt_Password.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        getContentPane().add(txt_Password, new org.netbeans.lib.awtextra.AbsoluteConstraints(95, 370, 210, -1));

        acceder.setBackground(new java.awt.Color(153, 153, 255));
        acceder.setFont(new java.awt.Font("Arial Narrow", 1, 18)); // NOI18N
        acceder.setForeground(new java.awt.Color(255, 255, 255));
        acceder.setText("Acceder");
        acceder.setBorder(null);
        acceder.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                accederActionPerformed(evt);
            }
        });
        getContentPane().add(acceder, new org.netbeans.lib.awtextra.AbsoluteConstraints(95, 420, 210, 28));

        jLabel1.setFont(new java.awt.Font("Dialog", 3, 12)); // NOI18N
        jLabel1.setText("Creado por Robert - Bass ®");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 480, -1, -1));
        getContentPane().add(label_NombreUsuario, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 520, 120, 20));
        getContentPane().add(label_wallpaper, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 400, 550));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void accederActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_accederActionPerformed
        user = txt_User.getText().trim();
        pass = txt_Password.getText().trim();
        
        if(!user.equals("") || !pass.equals("")){
            try {
                Connection cn = Conexion.conectar();
                PreparedStatement pst = cn.prepareStatement("select tipo_nivel, estatus, nombre_usuario from usuarios where username = '" + user
                + "' and password = '" + pass + "'");
                
                ResultSet rs= pst.executeQuery();
                
                if (rs.next()) {
                    String tipo_nivel = rs.getString("tipo_nivel");
                    String estatus = rs.getString("estatus");
                    String nombre_usuario = rs.getString("nombre_usuario");
                    label_NombreUsuario.setText(nombre_usuario);
                    
                    if(tipo_nivel.equalsIgnoreCase("Administrador") && estatus.equalsIgnoreCase("Activo")){
                        dispose();
                        new Administrador().setVisible(true);
                    }else if(tipo_nivel.equalsIgnoreCase("Capturista") && estatus.equalsIgnoreCase("Activo")){
                        dispose();
                        new Capturista().setVisible(true);
                    }else if(tipo_nivel.equalsIgnoreCase("Tecnico") && estatus.equalsIgnoreCase("Activo")){
                        dispose();
                        new Tecnico().setVisible(true);
                    }
                    
                } else {
                    JOptionPane.showMessageDialog(null,"Datos de Acceso Incorrectos");
                    txt_User.setText("");
                    txt_Password.setText("");
                }
            } catch (Exception e) {
                System.err.println("Error en el boton acceder"+e);
                JOptionPane.showMessageDialog(null,"Error al iniciar sesion, contacte al Administrador");
            }
            
        }else{
            JOptionPane.showMessageDialog(null,"Debes llenar todos los campos");
        }
    }//GEN-LAST:event_accederActionPerformed


    public static void main(String args[]) {
        /* Set the Metal look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Metal (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Metal".equals(info.getName())) {
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

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Login().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton acceder;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel label_Logo;
    public static javax.swing.JLabel label_NombreUsuario;
    private javax.swing.JLabel label_wallpaper;
    private javax.swing.JPasswordField txt_Password;
    private javax.swing.JTextField txt_User;
    // End of variables declaration//GEN-END:variables
}
