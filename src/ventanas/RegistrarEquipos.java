
package ventanas;

import java.sql.*;
import clases.Conexion;
import java.awt.Color;
import java.util.Calendar;
import java.awt.Image;
import java.awt.Toolkit;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;
import javax.swing.WindowConstants;


public class RegistrarEquipos extends javax.swing.JFrame {

    int IdCliente_update = 0;
    String user = "", nom_cliente = "";

    public RegistrarEquipos() {
        initComponents();
        user = Login.user;
        IdCliente_update = GestionarClientes.IdCliente_update;
        
        setSize(650, 450);
        setResizable(false);
        setLocationRelativeTo(null);
        
        setDefaultCloseOperation(WindowConstants.DISPOSE_ON_CLOSE);
        
        // Wallpaper
        ImageIcon wallpaper = new ImageIcon("src/images/wallpaperPrincipal.jpg");
        Icon icono = new ImageIcon(wallpaper.getImage().getScaledInstance(jLabel_Wallpaper.getWidth(), jLabel_Wallpaper.getHeight(), Image.SCALE_DEFAULT));
        jLabel_Wallpaper.setIcon(icono);
        this.repaint();
        
        try {
            
            Connection cn = Conexion.conectar();
            PreparedStatement pst = cn.prepareStatement("select nombre_cliente from clientes where id_cliente = '" + IdCliente_update + "'");
            ResultSet rs = pst.executeQuery();
            
            if (rs.next()) {
                
                nom_cliente = rs.getString("nombre_cliente");
                
                
            }
            
        } catch (SQLException e) {
            
            System.err.println(e);
            
        }
        
        setTitle("Registrar Equipo para " + nom_cliente);
        txt_cliente.setText(nom_cliente);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        jTextPane_observaciones = new javax.swing.JTextPane();
        jLabel_titulo = new javax.swing.JLabel();
        jLabel_nombre = new javax.swing.JLabel();
        jLabel_tipo = new javax.swing.JLabel();
        jLabel_marca = new javax.swing.JLabel();
        jLabel_modelo = new javax.swing.JLabel();
        jLabel_serie = new javax.swing.JLabel();
        jLabel_obervaciones = new javax.swing.JLabel();
        txt_cliente = new javax.swing.JTextField();
        txt_modelo = new javax.swing.JTextField();
        txt_serie = new javax.swing.JTextField();
        cmb_tipo = new javax.swing.JComboBox<>();
        cmb_marca = new javax.swing.JComboBox<>();
        jButton_registrar = new javax.swing.JButton();
        jLabel_footer = new javax.swing.JLabel();
        jLabel_Wallpaper = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setIconImage(getIconImage());
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jScrollPane1.setViewportView(jTextPane_observaciones);

        getContentPane().add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 80, 330, 230));

        jLabel_titulo.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jLabel_titulo.setForeground(new java.awt.Color(255, 255, 255));
        jLabel_titulo.setText("Registro de Equipo");
        getContentPane().add(jLabel_titulo, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 10, -1, -1));

        jLabel_nombre.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel_nombre.setForeground(new java.awt.Color(255, 255, 255));
        jLabel_nombre.setText("Nombre del Cliente:");
        getContentPane().add(jLabel_nombre, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 60, -1, -1));

        jLabel_tipo.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel_tipo.setForeground(new java.awt.Color(255, 255, 255));
        jLabel_tipo.setText("Tipo de Equipo:");
        getContentPane().add(jLabel_tipo, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 120, -1, -1));

        jLabel_marca.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel_marca.setForeground(new java.awt.Color(255, 255, 255));
        jLabel_marca.setText("Marca:");
        getContentPane().add(jLabel_marca, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 180, -1, -1));

        jLabel_modelo.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel_modelo.setForeground(new java.awt.Color(255, 255, 255));
        jLabel_modelo.setText("Modelo:");
        getContentPane().add(jLabel_modelo, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 240, -1, -1));

        jLabel_serie.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel_serie.setForeground(new java.awt.Color(255, 255, 255));
        jLabel_serie.setText("Numero de Serie:");
        getContentPane().add(jLabel_serie, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 300, -1, -1));

        jLabel_obervaciones.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel_obervaciones.setForeground(new java.awt.Color(255, 255, 255));
        jLabel_obervaciones.setText("Daño reportado y Observaciones:");
        getContentPane().add(jLabel_obervaciones, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 60, -1, -1));

        txt_cliente.setEditable(false);
        txt_cliente.setBackground(new java.awt.Color(153, 153, 255));
        txt_cliente.setFont(new java.awt.Font("Arial", 1, 16)); // NOI18N
        txt_cliente.setForeground(new java.awt.Color(255, 255, 255));
        txt_cliente.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txt_cliente.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        getContentPane().add(txt_cliente, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 80, 210, -1));

        txt_modelo.setBackground(new java.awt.Color(153, 153, 255));
        txt_modelo.setFont(new java.awt.Font("Arial", 1, 16)); // NOI18N
        txt_modelo.setForeground(new java.awt.Color(255, 255, 255));
        txt_modelo.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txt_modelo.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        getContentPane().add(txt_modelo, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 260, 210, -1));

        txt_serie.setBackground(new java.awt.Color(153, 153, 255));
        txt_serie.setFont(new java.awt.Font("Arial", 1, 16)); // NOI18N
        txt_serie.setForeground(new java.awt.Color(255, 255, 255));
        txt_serie.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txt_serie.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        getContentPane().add(txt_serie, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 320, 210, -1));

        cmb_tipo.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Laptop", "Desktop", "Tablet", "Smartphone", "Impresora", "Multifuncional" }));
        getContentPane().add(cmb_tipo, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 140, -1, -1));

        cmb_marca.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Acer", "Alienware", "Apple", "Asus", "Brother", "Dell", "HP", "Lenovo" }));
        getContentPane().add(cmb_marca, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 200, -1, -1));

        jButton_registrar.setBackground(new java.awt.Color(153, 153, 255));
        jButton_registrar.setFont(new java.awt.Font("Arial Narrow", 1, 18)); // NOI18N
        jButton_registrar.setForeground(new java.awt.Color(255, 255, 255));
        jButton_registrar.setText("Registrar Equipo");
        jButton_registrar.setBorder(null);
        jButton_registrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_registrarActionPerformed(evt);
            }
        });
        getContentPane().add(jButton_registrar, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 320, 210, 35));

        jLabel_footer.setFont(new java.awt.Font("Arial", 3, 18)); // NOI18N
        jLabel_footer.setText("Creado por Robert - Bass ®");
        getContentPane().add(jLabel_footer, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 380, -1, -1));
        getContentPane().add(jLabel_Wallpaper, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 650, 450));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton_registrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_registrarActionPerformed
        
        int validacion = 0;
        String tipo_equipo, marca, modelo, num_serie, dia_ingreso, mes_ingreso, anio_ingreso, estatus, observaciones;
        
        tipo_equipo = cmb_tipo.getSelectedItem().toString();
        marca = cmb_marca.getSelectedItem().toString();
        modelo = txt_modelo.getText().trim();
        num_serie = txt_serie.getText().trim();
        observaciones = jTextPane_observaciones.getText();
        estatus = "Nuevo Ingreso";
        
        Calendar calendar = Calendar.getInstance();
        
        dia_ingreso = Integer.toString(calendar.get(Calendar.DATE));
        mes_ingreso = Integer.toString(calendar.get(Calendar.MONTH));
        anio_ingreso = Integer.toString(calendar.get(Calendar.YEAR));
        
        if(modelo.equals("")){
            txt_modelo.setBackground(Color.red);
            validacion++;
        } if(num_serie.equals("")){
            txt_serie.setBackground(Color.red);
            validacion++;
        } if(observaciones.equals("")){
            jTextPane_observaciones.setText("Sin Observaciones.");
        }
        
        if (validacion == 0) {
            
            try {
                
                Connection cn = Conexion.conectar();
                PreparedStatement pst = cn.prepareStatement("insert into equipos values (?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?)");
                pst.setInt(1, 0);
                pst.setInt(2, IdCliente_update);
                pst.setString(3, tipo_equipo);
                pst.setString(4, marca);
                pst.setString(5, modelo);
                pst.setString(6, num_serie);
                pst.setString(7, dia_ingreso);
                pst.setString(8, mes_ingreso);
                pst.setString(9, anio_ingreso);
                pst.setString(10, observaciones);
                pst.setString(11, estatus);
                pst.setString(12, user);
                pst.setString(13, "");
                pst.setString(14, "");
                
                pst.executeUpdate();
                cn.close();
                
                txt_cliente.setBackground(Color.green);
                txt_modelo.setBackground(Color.green);
                txt_serie.setBackground(Color.green);
                
                JOptionPane.showMessageDialog(null, "Registro Exitoso !!!");
                this.dispose();
                
            } catch (SQLException e) {
                
                System.err.println("Error en regristrar equipo " + e);
                JOptionPane.showMessageDialog(null, "Error al registrar equipo!! Contacte al Administrador");
            }
            
        } else{
            
            JOptionPane.showMessageDialog(null, "Debes llenar todos los campos");
            
        }
        
        
    }//GEN-LAST:event_jButton_registrarActionPerformed

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
            java.util.logging.Logger.getLogger(RegistrarEquipos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(RegistrarEquipos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(RegistrarEquipos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(RegistrarEquipos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new RegistrarEquipos().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox<String> cmb_marca;
    private javax.swing.JComboBox<String> cmb_tipo;
    private javax.swing.JButton jButton_registrar;
    private javax.swing.JLabel jLabel_Wallpaper;
    private javax.swing.JLabel jLabel_footer;
    private javax.swing.JLabel jLabel_marca;
    private javax.swing.JLabel jLabel_modelo;
    private javax.swing.JLabel jLabel_nombre;
    private javax.swing.JLabel jLabel_obervaciones;
    private javax.swing.JLabel jLabel_serie;
    private javax.swing.JLabel jLabel_tipo;
    private javax.swing.JLabel jLabel_titulo;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextPane jTextPane_observaciones;
    private javax.swing.JTextField txt_cliente;
    private javax.swing.JTextField txt_modelo;
    private javax.swing.JTextField txt_serie;
    // End of variables declaration//GEN-END:variables

    // Establecer icono de ventana
    @Override
    public Image getIconImage() {
        Image retValue = Toolkit.getDefaultToolkit().getImage(ClassLoader.getSystemResource("images/icon.png"));
        return retValue;

    }

}
