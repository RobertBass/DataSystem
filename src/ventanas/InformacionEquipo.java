package ventanas;

import clases.Conexion;
import java.awt.Color;
import java.awt.Image;
import java.awt.Toolkit;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.WindowConstants;
import java.sql.*;
import javax.swing.JOptionPane;

public class InformacionEquipo extends javax.swing.JFrame {

    int IdCliente_update = 0, IdEquipo = 0;
    String user = "", nom_cliente = "", dia = "", mes = "", anio = "", num_mes = "";

    public InformacionEquipo() {
        initComponents();
        user = Login.user;
        IdEquipo = Informacion_Cliente.IdEquipo;
        IdCliente_update = GestionarClientes.IdCliente_update;
        //nom_cliente = Informacion_Cliente.

        setSize(670, 530);

        setResizable(false);
        setLocationRelativeTo(null);

        setDefaultCloseOperation(WindowConstants.DISPOSE_ON_CLOSE);

        // Wallpaper
        ImageIcon wallpaper = new ImageIcon("src/images/wallpaperPrincipal.jpg");
        Icon icono = new ImageIcon(wallpaper.getImage().getScaledInstance(jLabel_Wallpaper.getWidth(), jLabel_Wallpaper.getHeight(), Image.SCALE_DEFAULT));
        jLabel_Wallpaper.setIcon(icono);
        this.repaint();

        // Consulta a la base de datos para obtener datos del cliente
        try {

            Connection cn = Conexion.conectar();
            PreparedStatement pst = cn.prepareStatement("select * from clientes where id_cliente = '" + IdCliente_update + "'");

            ResultSet rs = pst.executeQuery();

            if (rs.next()) {

                setTitle("Informacion de Equipo del Cliente " + rs.getString("nombre_cliente") + " - Sesion de " + user);
                txt_nombreCliente.setText(rs.getString("nombre_cliente"));

            }

            cn.close();

        } catch (SQLException e) {
            System.err.println("Error en cargar cliente");
            System.err.println(e);
            JOptionPane.showMessageDialog(null, "Error, contacte al administrador");
        }

        // Consulta a la base de datos para obtener datos del equipo registrado del cliente
        try {

            Connection cn2 = Conexion.conectar();
            PreparedStatement pst2 = cn2.prepareStatement("select * from equipos where id_equipo = '" + IdEquipo + "'");
            ResultSet rs2 = pst2.executeQuery();

            if (rs2.next()) {

                dia = rs2.getString("dia_ingreso");
                num_mes = rs2.getString("mes_ingreso");
                anio = rs2.getString("año_ingreso");

                switch (num_mes) {
                    case "1":
                        mes = "enero";
                        break;

                    case "2":
                        mes = "febrero";
                        break;

                    case "3":
                        mes = "marzo";
                        break;

                    case "4":
                        mes = "Abril";
                        break;

                    case "5":
                        mes = "mayo";
                        break;

                    case "6":
                        mes = "junio";
                        break;

                    case "7":
                        mes = "julio";
                        break;

                    case "8":
                        mes = "Agosto";
                        break;

                    case "9":
                        mes = "septiembre";
                        break;

                    case "10":
                        mes = "octubre";
                        break;

                    case "11":
                        mes = "noviembre";
                        break;

                    case "12":
                        mes = "diciembre";
                        break;

                    default:
                        System.out.println("Error en mes ingresado a la base de datos");
                        break;
                }

                txt_fecha.setText(dia + " de " + mes + " de " + anio);
                txt_modelo.setText(rs2.getString("modelo"));
                txt_serie.setText(rs2.getString("serie"));
                txt_observaciones.setText(rs2.getString("observaciones"));
                txt_comentarios.setText(rs2.getString("comentarios_tecnico"));
                txt_utlimaModificacion.setText(rs2.getString("ultima_modificacion"));
                cmb_estatus.setSelectedItem(rs2.getString("estatus"));
                cmb_marca.setSelectedItem(rs2.getString("marca"));
                cmb_tipoEquipo.setSelectedItem(rs2.getString("tipo_equipo"));
                jLabel_revisionTecnicaDe.setText("Comentarios y actualización de " + rs2.getString("revision_tecnica"));

            }

            cn2.close();

        } catch (SQLException e) {

            System.err.println("Error en cargar información del equipo");
            System.err.println(e);
            JOptionPane.showMessageDialog(null, "Error, contacte al administrador");

        }

    }

    // Establecer icono de ventana
    @Override
    public Image getIconImage() {
        Image retValue = Toolkit.getDefaultToolkit().getImage(ClassLoader.getSystemResource("images/icon.png"));
        return retValue;

    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel_titulo = new javax.swing.JLabel();
        jLabel_nombre = new javax.swing.JLabel();
        jLabel_nombre1 = new javax.swing.JLabel();
        jLabel_nombre2 = new javax.swing.JLabel();
        jLabel_nombre3 = new javax.swing.JLabel();
        jLabel_nombre4 = new javax.swing.JLabel();
        jLabel_nombre5 = new javax.swing.JLabel();
        jLabel_nombre6 = new javax.swing.JLabel();
        jLabel_nombre7 = new javax.swing.JLabel();
        jLabel_nombre8 = new javax.swing.JLabel();
        jLabel_revisionTecnicaDe = new javax.swing.JLabel();
        txt_nombreCliente = new javax.swing.JTextField();
        txt_modelo = new javax.swing.JTextField();
        txt_serie = new javax.swing.JTextField();
        txt_utlimaModificacion = new javax.swing.JTextField();
        txt_fecha = new javax.swing.JTextField();
        cmb_tipoEquipo = new javax.swing.JComboBox<>();
        cmb_marca = new javax.swing.JComboBox<>();
        cmb_estatus = new javax.swing.JComboBox<>();
        jScrollPane = new javax.swing.JScrollPane();
        txt_observaciones = new javax.swing.JTextPane();
        jScrollPane1 = new javax.swing.JScrollPane();
        txt_comentarios = new javax.swing.JTextPane();
        jButton_actualizar = new javax.swing.JButton();
        jLabel_footer = new javax.swing.JLabel();
        jLabel_Wallpaper = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setIconImage(getIconImage());
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel_titulo.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jLabel_titulo.setForeground(new java.awt.Color(255, 255, 255));
        jLabel_titulo.setText("Información del Equipo");
        getContentPane().add(jLabel_titulo, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 10, -1, -1));

        jLabel_nombre.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel_nombre.setForeground(new java.awt.Color(255, 255, 255));
        jLabel_nombre.setText("Nombre del Cliente:");
        getContentPane().add(jLabel_nombre, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 60, -1, -1));

        jLabel_nombre1.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel_nombre1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel_nombre1.setText("Tipo de Equipo:");
        getContentPane().add(jLabel_nombre1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 120, -1, -1));

        jLabel_nombre2.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel_nombre2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel_nombre2.setText("Marca:");
        getContentPane().add(jLabel_nombre2, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 180, -1, -1));

        jLabel_nombre3.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel_nombre3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel_nombre3.setText("Modelo:");
        getContentPane().add(jLabel_nombre3, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 240, -1, -1));

        jLabel_nombre4.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel_nombre4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel_nombre4.setText("Serie:");
        getContentPane().add(jLabel_nombre4, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 300, -1, -1));

        jLabel_nombre5.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel_nombre5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel_nombre5.setText("Fecha de Ingreso:");
        getContentPane().add(jLabel_nombre5, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 60, -1, -1));

        jLabel_nombre6.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel_nombre6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel_nombre6.setText("Ultima Modificacion:");
        getContentPane().add(jLabel_nombre6, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 360, -1, -1));

        jLabel_nombre7.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel_nombre7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel_nombre7.setText("Estatus:");
        getContentPane().add(jLabel_nombre7, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, 60, -1, -1));

        jLabel_nombre8.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel_nombre8.setForeground(new java.awt.Color(255, 255, 255));
        jLabel_nombre8.setText("Daño Reportado y Observaciones:");
        getContentPane().add(jLabel_nombre8, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 110, -1, -1));

        jLabel_revisionTecnicaDe.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel_revisionTecnicaDe.setForeground(new java.awt.Color(255, 255, 255));
        jLabel_revisionTecnicaDe.setText("Comentarios y Actualizaciones:");
        getContentPane().add(jLabel_revisionTecnicaDe, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 260, -1, -1));

        txt_nombreCliente.setBackground(new java.awt.Color(153, 153, 255));
        txt_nombreCliente.setFont(new java.awt.Font("Arial", 1, 16)); // NOI18N
        txt_nombreCliente.setForeground(new java.awt.Color(255, 255, 255));
        txt_nombreCliente.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txt_nombreCliente.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        txt_nombreCliente.setEnabled(false);
        getContentPane().add(txt_nombreCliente, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 80, 210, -1));

        txt_modelo.setBackground(new java.awt.Color(153, 153, 255));
        txt_modelo.setFont(new java.awt.Font("Arial", 1, 16)); // NOI18N
        txt_modelo.setForeground(new java.awt.Color(255, 255, 255));
        txt_modelo.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txt_modelo.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        getContentPane().add(txt_modelo, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 260, 210, -1));

        txt_serie.setBackground(new java.awt.Color(153, 153, 255));
        txt_serie.setFont(new java.awt.Font("Arial", 1, 16)); // NOI18N
        txt_serie.setForeground(new java.awt.Color(255, 255, 255));
        txt_serie.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txt_serie.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        getContentPane().add(txt_serie, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 320, 210, -1));

        txt_utlimaModificacion.setBackground(new java.awt.Color(153, 153, 255));
        txt_utlimaModificacion.setFont(new java.awt.Font("Arial", 1, 16)); // NOI18N
        txt_utlimaModificacion.setForeground(new java.awt.Color(255, 255, 255));
        txt_utlimaModificacion.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txt_utlimaModificacion.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        txt_utlimaModificacion.setEnabled(false);
        getContentPane().add(txt_utlimaModificacion, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 380, 210, -1));

        txt_fecha.setBackground(new java.awt.Color(153, 153, 255));
        txt_fecha.setFont(new java.awt.Font("Arial", 1, 16)); // NOI18N
        txt_fecha.setForeground(new java.awt.Color(255, 255, 255));
        txt_fecha.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txt_fecha.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        txt_fecha.setEnabled(false);
        getContentPane().add(txt_fecha, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 80, 180, -1));

        cmb_tipoEquipo.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Laptop", "Desktop", "Tablet", "Smartphone", "Impresora", "Multifuncional" }));
        getContentPane().add(cmb_tipoEquipo, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 140, -1, -1));

        cmb_marca.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Acer", "Alienware", "Apple", "Asus", "Brother", "Dell", "HP", "Lenovo" }));
        getContentPane().add(cmb_marca, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 200, -1, -1));

        cmb_estatus.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Nuevo Ingreso", "No Reparado", "En Revision", "Reparado", "Entregado" }));
        getContentPane().add(cmb_estatus, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, 80, -1, -1));

        jScrollPane.setViewportView(txt_observaciones);

        getContentPane().add(jScrollPane, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 130, 330, 120));

        txt_comentarios.setEditable(false);
        jScrollPane1.setViewportView(txt_comentarios);

        getContentPane().add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 280, 330, 120));

        jButton_actualizar.setBackground(new java.awt.Color(153, 153, 255));
        jButton_actualizar.setFont(new java.awt.Font("Arial Narrow", 1, 18)); // NOI18N
        jButton_actualizar.setForeground(new java.awt.Color(255, 255, 255));
        jButton_actualizar.setText("Actualizar Equipo");
        jButton_actualizar.setBorder(null);
        jButton_actualizar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_actualizarActionPerformed(evt);
            }
        });
        getContentPane().add(jButton_actualizar, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 400, 210, 35));

        jLabel_footer.setFont(new java.awt.Font("Arial", 3, 18)); // NOI18N
        jLabel_footer.setText("Creado por Robert - Bass ®");
        getContentPane().add(jLabel_footer, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 460, -1, -1));
        getContentPane().add(jLabel_Wallpaper, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 670, 530));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton_actualizarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_actualizarActionPerformed

        int validacion = 0;
        String tipo, marca, modelo, serie, estatus, reporte;

        tipo = cmb_tipoEquipo.getSelectedItem().toString();
        marca = cmb_marca.getSelectedItem().toString();
        modelo = txt_modelo.getText().trim();
        serie = txt_serie.getText().trim();
        estatus = cmb_estatus.getSelectedItem().toString();
        reporte = txt_observaciones.getText();

        if (modelo.equals("")) {
            txt_modelo.setBackground(Color.RED);
            validacion++;
        }
        if (txt_serie.equals("")) {
            txt_serie.setBackground(Color.RED);
            validacion++;
        }
        if (txt_observaciones.equals("")) {
            txt_modelo.setText("Sin observaciones");
            validacion++;
        }

        if (validacion == 0) {
            try {

                Connection cn = Conexion.conectar();
                PreparedStatement pst = cn.prepareStatement("update equipos set tipo_equipo = ?, marca = ?, modelo = ?, serie = ?, estatus = ?, observaciones = ?, ultima_modificacion = ? where id_equipo = '" + IdEquipo + "'");

                pst.setString(1, tipo);
                pst.setString(2, marca);
                pst.setString(3, modelo);
                pst.setString(4, serie);
                pst.setString(5, estatus);
                pst.setString(6, reporte);
                pst.setString(7, user);

                pst.executeUpdate();

                cn.close();

                Limpiar();

                txt_nombreCliente.setBackground(Color.GREEN);
                txt_modelo.setBackground(Color.GREEN);
                txt_serie.setBackground(Color.GREEN);
                txt_fecha.setBackground(Color.GREEN);
                txt_utlimaModificacion.setText(user);

                JOptionPane.showMessageDialog(null, "Actualizacion Correcta");
                this.dispose();

            } catch (SQLException e) {
                System.err.println("Error al actualizar equipo " + e);
                JOptionPane.showMessageDialog(null, "Error al actualizar el equipo, Contacte al Administrador");
            }
        } else {
            JOptionPane.showMessageDialog(null, "Debes llenar todos los campos");
        }


    }//GEN-LAST:event_jButton_actualizarActionPerformed

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
            java.util.logging.Logger.getLogger(InformacionEquipo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(InformacionEquipo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(InformacionEquipo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(InformacionEquipo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new InformacionEquipo().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox<String> cmb_estatus;
    private javax.swing.JComboBox<String> cmb_marca;
    private javax.swing.JComboBox<String> cmb_tipoEquipo;
    private javax.swing.JButton jButton_actualizar;
    private javax.swing.JLabel jLabel_Wallpaper;
    private javax.swing.JLabel jLabel_footer;
    private javax.swing.JLabel jLabel_nombre;
    private javax.swing.JLabel jLabel_nombre1;
    private javax.swing.JLabel jLabel_nombre2;
    private javax.swing.JLabel jLabel_nombre3;
    private javax.swing.JLabel jLabel_nombre4;
    private javax.swing.JLabel jLabel_nombre5;
    private javax.swing.JLabel jLabel_nombre6;
    private javax.swing.JLabel jLabel_nombre7;
    private javax.swing.JLabel jLabel_nombre8;
    private javax.swing.JLabel jLabel_revisionTecnicaDe;
    private javax.swing.JLabel jLabel_titulo;
    private javax.swing.JScrollPane jScrollPane;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextPane txt_comentarios;
    private javax.swing.JTextField txt_fecha;
    private javax.swing.JTextField txt_modelo;
    private javax.swing.JTextField txt_nombreCliente;
    private javax.swing.JTextPane txt_observaciones;
    private javax.swing.JTextField txt_serie;
    private javax.swing.JTextField txt_utlimaModificacion;
    // End of variables declaration//GEN-END:variables

    public void Limpiar() {
        txt_nombreCliente.setText("");
        txt_modelo.setText("");
        txt_serie.setText("");
        txt_comentarios.setText("");
        txt_fecha.setText("");
        txt_utlimaModificacion.setText("");
        cmb_estatus.setSelectedIndex(0);
        cmb_marca.setSelectedIndex(0);
        cmb_tipoEquipo.setSelectedIndex(0);
    }

}
