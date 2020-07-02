package ventanas;

import clases.Conexion;
import java.sql.*;
import com.itextpdf.text.BaseColor;
import com.itextpdf.text.Document;
import com.itextpdf.text.DocumentException;
import com.itextpdf.text.pdf.PdfPTable;
import com.itextpdf.text.pdf.PdfWriter;
import com.itextpdf.text.Chunk;
import com.itextpdf.text.Font;
import com.itextpdf.text.FontFactory;
import com.itextpdf.text.Paragraph;
import java.awt.Image;
import java.awt.Toolkit;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;
import javax.swing.WindowConstants;

public class Capturista extends javax.swing.JFrame {

    String user, nombre_usuario;
    int sesion_usuario;

    public Capturista() {
        initComponents();
        user = Login.user;
        sesion_usuario = Administrador.sesion_usuario;

        setSize(550, 380);
        setResizable(false);
        setTitle("Capturista - Sesion de " + user);
        setLocationRelativeTo(null);

        if (sesion_usuario == 1) {
            setDefaultCloseOperation(WindowConstants.DISPOSE_ON_CLOSE);
        } else {
            setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        }

        // Wallpaper
        ImageIcon wallpaper = new ImageIcon("src/images/wallpaperPrincipal.jpg");
        Icon icono = new ImageIcon(wallpaper.getImage().getScaledInstance(jLabel_Wallpaper.getWidth(), jLabel_Wallpaper.getHeight(), Image.SCALE_DEFAULT));
        jLabel_Wallpaper.setIcon(icono);
        this.repaint();

        try {
            Connection cn = Conexion.conectar();
            PreparedStatement pst = cn.prepareStatement("select nombre_usuario from usuarios where username = '" + user + "'");
            ResultSet rs = pst.executeQuery();

            if (rs.next()) {
                nombre_usuario = rs.getString("nombre_usuario");
                jLabel_NombreUsuario.setText("Bienvenido " + nombre_usuario);
            }
        } catch (SQLException e) {
            System.err.println("Error en consultar nombre de Capturista");
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

        jLabel_NombreUsuario = new javax.swing.JLabel();
        button_RegistrarCliente = new javax.swing.JButton();
        button_GestionarClientes = new javax.swing.JButton();
        button_Imprimir = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel_Wallpaper = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setIconImage(getIconImage());
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel_NombreUsuario.setFont(new java.awt.Font("Arial", 1, 20)); // NOI18N
        jLabel_NombreUsuario.setForeground(new java.awt.Color(255, 255, 255));
        jLabel_NombreUsuario.setText("jLabel1");
        getContentPane().add(jLabel_NombreUsuario, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, -1, -1));

        button_RegistrarCliente.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/add.png"))); // NOI18N
        button_RegistrarCliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                button_RegistrarClienteActionPerformed(evt);
            }
        });
        getContentPane().add(button_RegistrarCliente, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 80, 120, 100));

        button_GestionarClientes.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/informationuser.png"))); // NOI18N
        button_GestionarClientes.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                button_GestionarClientesActionPerformed(evt);
            }
        });
        getContentPane().add(button_GestionarClientes, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 80, 120, 100));

        button_Imprimir.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/impresora.png"))); // NOI18N
        button_Imprimir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                button_ImprimirActionPerformed(evt);
            }
        });
        getContentPane().add(button_Imprimir, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 80, 120, 100));

        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Registrar Cliente");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 180, -1, -1));

        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("Gestionar Clientes");
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 180, -1, -1));

        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("Imprimir");
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 180, -1, -1));

        jLabel7.setFont(new java.awt.Font("Arial", 3, 18)); // NOI18N
        jLabel7.setText("Creado por Robert - Bass ®");
        getContentPane().add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 310, -1, -1));
        getContentPane().add(jLabel_Wallpaper, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 550, 380));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void button_RegistrarClienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_button_RegistrarClienteActionPerformed

        RegistrarClientes registrarCliente = new RegistrarClientes();
        registrarCliente.setVisible(true);

    }//GEN-LAST:event_button_RegistrarClienteActionPerformed

    private void button_GestionarClientesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_button_GestionarClientesActionPerformed

        GestionarClientes gestionarClientes = new GestionarClientes();
        gestionarClientes.setVisible(true);

    }//GEN-LAST:event_button_GestionarClientesActionPerformed

    private void button_ImprimirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_button_ImprimirActionPerformed

        Document documento = new Document();

        try {

            String ruta = System.getProperty("user.home");
            PdfWriter.getInstance(documento, new FileOutputStream(ruta + "/Desktop/Lista Clientes.pdf"));

            com.itextpdf.text.Image header = com.itextpdf.text.Image.getInstance("src/images/BannerPDF.jpg");
            header.scaleToFit(650, 1000);
            header.setAlignment(Chunk.ALIGN_CENTER);

            Paragraph parrafo = new Paragraph();
            parrafo.setAlignment(Paragraph.ALIGN_CENTER);
            parrafo.add("Lista de Clientes. \n \n");
            parrafo.setFont(FontFactory.getFont("Calibri", 18, Font.BOLD, BaseColor.DARK_GRAY));

            documento.open();
            documento.add(header);
            documento.add(parrafo);

            PdfPTable tabla = new PdfPTable(5);
            tabla.addCell("Id");
            tabla.addCell("Nombre");
            tabla.addCell("Email");
            tabla.addCell("Telefono");
            tabla.addCell("Direccion");

            try {

                Connection cn = Conexion.conectar();
                PreparedStatement pst = cn.prepareStatement("select * from clientes");
                ResultSet rs = pst.executeQuery();

                if (rs.next()) {
                    
                    do {
                        
                        tabla.addCell(rs.getString(1));
                        tabla.addCell(rs.getString(2));
                        tabla.addCell(rs.getString(3));
                        tabla.addCell(rs.getString(4));
                        tabla.addCell(rs.getString(5));
                        
                    } while (rs.next());
                    
                    documento.add(tabla);

                }

            } catch (SQLException e) {
                
                System.err.print("Error al generar lista de clientes " + e);
                JOptionPane.showMessageDialog(null, "Error de conexion a la base de datos, consulta al administrador");
                
            }
            
            documento.close();
            JOptionPane.showMessageDialog(null, "Lista de Clientes generada correctamente");

        } catch (Exception e) {

            System.err.print("Error al generar el documento " + e);
            JOptionPane.showMessageDialog(null, "Error al generar el documento, consulta al administrador");
            
        }

    }//GEN-LAST:event_button_ImprimirActionPerformed

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
            java.util.logging.Logger.getLogger(Capturista.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Capturista.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Capturista.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Capturista.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Capturista().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton button_GestionarClientes;
    private javax.swing.JButton button_Imprimir;
    private javax.swing.JButton button_RegistrarCliente;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel_NombreUsuario;
    private javax.swing.JLabel jLabel_Wallpaper;
    // End of variables declaration//GEN-END:variables
}
