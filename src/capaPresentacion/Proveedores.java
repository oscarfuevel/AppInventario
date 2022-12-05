package capaPresentacion;

import Reportes.ReportProveedores;
import capaDatos.Ciudad;
import capaDatos.Proveedor;
import capaDatos.tipo_documento;
import capaLogica.SqlCliente;
import capaLogica.SqlProveedor;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

public class Proveedores extends javax.swing.JInternalFrame {
    
    SqlProveedor modSql = new SqlProveedor();
    SqlCliente cliente = new SqlCliente();
    Proveedor mod = new Proveedor();
    ValidarCampos validar = new ValidarCampos();
    DefaultTableModel modelo = new DefaultTableModel();
    tipo_documento td = new tipo_documento();
    Ciudad ciudad = new Ciudad();

    public Proveedores() {
        initComponents();
        jlbidprovee.setVisible(false);
        listarProveedor();
        btnActualizar.setEnabled(false);
        btnEliminar.setEnabled(false);
        txtFecha.setText(fechaActual());
        
        tipo_documento cc = new tipo_documento();
        DefaultComboBoxModel modTipo = new DefaultComboBoxModel(cc.mostrarTipoDoc());
        cbxTipoIdentif.setModel(modTipo);
        
        Ciudad dd = new Ciudad();
        DefaultComboBoxModel modCiu = new DefaultComboBoxModel(dd.mostrarCiudad());
        cbxCiudad.setModel(modCiu);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jlb1 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tablaProve = new javax.swing.JTable();
        btnGuardar = new javax.swing.JButton();
        jlblGuardar = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jLabel6 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        cbxTipoIdentif = new javax.swing.JComboBox<>();
        jlbNombre = new javax.swing.JLabel();
        txtNombre = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        txtIdentificacion = new javax.swing.JTextField();
        jlbDireccion = new javax.swing.JLabel();
        txtDireccion = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        txtTelefono = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        cbxCiudad = new javax.swing.JComboBox<>();
        jLabel1 = new javax.swing.JLabel();
        txtFecha = new javax.swing.JTextField();
        txtCorreo = new javax.swing.JTextField();
        jlbidprovee = new javax.swing.JLabel();
        btnActualizar = new javax.swing.JButton();
        jlbActualizar = new javax.swing.JLabel();
        btnSalir = new javax.swing.JButton();
        jlblSalir = new javax.swing.JLabel();
        btnNuevo = new javax.swing.JButton();
        jlblNuevo = new javax.swing.JLabel();
        btnEliminar = new javax.swing.JButton();
        jlblEliminar = new javax.swing.JLabel();
        btnReport = new javax.swing.JToggleButton();
        lblReport = new javax.swing.JLabel();

        setBorder(null);
        setPreferredSize(new java.awt.Dimension(800, 540));
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jlb1.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jlb1.setText("Gestión Proveedores ");
        getContentPane().add(jlb1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 11, 190, -1));

        tablaProve.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Id", "Nombre", "Tipo Ident", "Identificación", "Dirección", "Teléfono", "Ciudad", "Correo", "Fecha"
            }
        ));
        tablaProve.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tablaProveMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tablaProve);
        if (tablaProve.getColumnModel().getColumnCount() > 0) {
            tablaProve.getColumnModel().getColumn(0).setPreferredWidth(20);
            tablaProve.getColumnModel().getColumn(2).setMaxWidth(70);
            tablaProve.getColumnModel().getColumn(5).setMaxWidth(90);
            tablaProve.getColumnModel().getColumn(6).setMaxWidth(60);
            tablaProve.getColumnModel().getColumn(8).setMaxWidth(80);
        }

        getContentPane().add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 241, 740, 178));

        btnGuardar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/Guar.png"))); // NOI18N
        btnGuardar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnGuardarActionPerformed(evt);
            }
        });
        getContentPane().add(btnGuardar, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 430, 50, 40));

        jlblGuardar.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jlblGuardar.setText("Guardar");
        getContentPane().add(jlblGuardar, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 470, 50, -1));

        jPanel1.setBackground(new java.awt.Color(221, 229, 226));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel6.setText("Fecha: ");
        jPanel1.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 170, -1, -1));

        jLabel2.setText("Tipo de Identificación: ");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 40, 110, -1));

        jPanel1.add(cbxTipoIdentif, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 60, 200, 30));

        jlbNombre.setText("Nombre o Razón Social: ");
        jPanel1.add(jlbNombre, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 40, -1, -1));

        txtNombre.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtNombreKeyTyped(evt);
            }
        });
        jPanel1.add(txtNombre, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 60, 290, 30));

        jLabel5.setText("No Identificación: ");
        jPanel1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(560, 40, -1, -1));

        txtIdentificacion.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtIdentificacionKeyTyped(evt);
            }
        });
        jPanel1.add(txtIdentificacion, new org.netbeans.lib.awtextra.AbsoluteConstraints(560, 60, 210, 30));

        jlbDireccion.setText("Dirección: ");
        jPanel1.add(jlbDireccion, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 100, -1, -1));
        jPanel1.add(txtDireccion, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 120, 270, 30));

        jLabel3.setText("Telefono: ");
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 100, -1, -1));
        jPanel1.add(txtTelefono, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 120, 175, 30));

        jLabel4.setText("Ciudad: ");
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, 100, -1, -1));

        jPanel1.add(cbxCiudad, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, 120, 160, 30));

        jLabel1.setText("Correo: ");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 170, -1, -1));
        jPanel1.add(txtFecha, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 190, 110, 30));
        jPanel1.add(txtCorreo, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 190, 270, 30));
        jPanel1.add(jlbidprovee, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 190, 40, 30));

        btnActualizar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/Actualizar.png"))); // NOI18N
        btnActualizar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnActualizarActionPerformed(evt);
            }
        });
        jPanel1.add(btnActualizar, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 430, 50, 40));

        jlbActualizar.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jlbActualizar.setText("Actualizar");
        jPanel1.add(jlbActualizar, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 470, 50, -1));

        btnSalir.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/Salir.png"))); // NOI18N
        btnSalir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSalirActionPerformed(evt);
            }
        });
        jPanel1.add(btnSalir, new org.netbeans.lib.awtextra.AbsoluteConstraints(650, 430, 50, -1));

        jlblSalir.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jlblSalir.setText("Cerrar");
        jPanel1.add(jlblSalir, new org.netbeans.lib.awtextra.AbsoluteConstraints(650, 470, 50, -1));

        btnNuevo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/Nuevo.png"))); // NOI18N
        btnNuevo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnNuevoActionPerformed(evt);
            }
        });
        jPanel1.add(btnNuevo, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 430, 50, -1));

        jlblNuevo.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jlblNuevo.setText("Nuevo");
        jPanel1.add(jlblNuevo, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 470, 50, -1));

        btnEliminar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/Elim.png"))); // NOI18N
        btnEliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEliminarActionPerformed(evt);
            }
        });
        jPanel1.add(btnEliminar, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 430, 40, 40));

        jlblEliminar.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jlblEliminar.setText("Eliminar");
        jPanel1.add(jlblEliminar, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 470, 40, -1));

        btnReport.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/Excel2.png"))); // NOI18N
        btnReport.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnReportActionPerformed(evt);
            }
        });
        jPanel1.add(btnReport, new org.netbeans.lib.awtextra.AbsoluteConstraints(550, 430, 50, 40));

        lblReport.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblReport.setText("Reporte");
        jPanel1.add(lblReport, new org.netbeans.lib.awtextra.AbsoluteConstraints(550, 470, 50, -1));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(-10, 0, 800, 510));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnGuardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGuardarActionPerformed
        
        td = (tipo_documento) cbxTipoIdentif.getSelectedItem();
        ciudad = (Ciudad) cbxCiudad.getSelectedItem();
        
        if(txtIdentificacion.getText().equals("") || cbxTipoIdentif.getSelectedItem().equals("") || txtNombre.getText().equals("") || cbxCiudad.getSelectedItem().equals("") || txtDireccion.getText().equals("") || txtTelefono.getText().equals("") || txtCorreo.getText().equals("")){
           
            JOptionPane.showMessageDialog(null, "Hay campos vacios, Debe llenar todos los campos");
        }else{
            
            mod.setDocumen(txtIdentificacion.getText());
            mod.setIdTipoDocumen(td.getIdTipoDoc());
            mod.setNombre(txtNombre.getText());
            mod.setIdciudad(ciudad.getIdCiudad());
            mod.setDireccion(txtDireccion.getText());
            mod.setTelefono(txtTelefono.getText());
            mod.setCorreo(txtCorreo.getText());
            mod.setFecha(txtFecha.getText());
            
            if(modSql.crearProveedor(mod)){
                
                JOptionPane.showMessageDialog(null, "Registro Guardado Exitosamente");
                limpiarCampos();
                LimpiarTabla();
                listarProveedor();
                txtFecha.setText(fechaActual());
                txtNombre.requestFocus();
                
            } else {
                System.out.println("Error al guardar");
                JOptionPane.showMessageDialog(null, "Error al guardar Registro");
            }  
        }    
    }//GEN-LAST:event_btnGuardarActionPerformed

    private void btnSalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSalirActionPerformed
        this.dispose();
    }//GEN-LAST:event_btnSalirActionPerformed

    private void btnEliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEliminarActionPerformed
        
        if(jlbidprovee.getText().equals("")){
            JOptionPane.showMessageDialog(null, "Debe seleccionar un Proveedor");
            
        }else{
        
            int resultado = JOptionPane.showConfirmDialog(Proveedores.this,
                    "¿Está¡ seguro de querer eliminar este cliente?", "Confirmación", JOptionPane.YES_NO_OPTION);

            if (resultado == JOptionPane.YES_OPTION) {
                int id = Integer.parseInt(jlbidprovee.getText());

                modSql.EliminarProveedor(id);

                JOptionPane.showMessageDialog(Proveedores.this,
                        String.format("El cliente con Id %s se ha eliminado de forma satisfactoria.", id),
                        "Mensaje", JOptionPane.INFORMATION_MESSAGE);

                limpiarCampos();
                LimpiarTabla();
                listarProveedor();
                txtFecha.setText(fechaActual());
            }
        }
    }//GEN-LAST:event_btnEliminarActionPerformed

    private void btnActualizarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnActualizarActionPerformed
        
        td = (tipo_documento) cbxTipoIdentif.getSelectedItem();
        ciudad = (Ciudad) cbxCiudad.getSelectedItem();
        
        if(jlbidprovee.getText().equals("")){
            JOptionPane.showMessageDialog(null, "Debe seleccionar un cliente");
            
        }else{
            
            if(!"".equals(txtIdentificacion.getText()) || !"".equals(cbxTipoIdentif.getSelectedItem()) || !"".equals(txtNombre.getText()) || !"".equals(cbxCiudad.getSelectedItem()) || !"".equals(txtDireccion.getText()) || !"".equals(txtTelefono.getText()) || !"".equals(txtCorreo.getText()) || !"".equals(txtFecha.getText())){
            
                mod.setIdProveedor(Integer.parseInt(jlbidprovee.getText()));
                mod.setDocumen(txtIdentificacion.getText());
                mod.setIdTipoDocumen(td.getIdTipoDoc());
                mod.setNombre(txtNombre.getText());
                mod.setIdciudad(ciudad.getIdCiudad());
                mod.setDireccion(txtDireccion.getText());
                mod.setTelefono(txtTelefono.getText());
                mod.setCorreo(txtCorreo.getText());
                mod.setFecha(txtFecha.getText());

                if(modSql.ModificarProveedor(mod)){

                    JOptionPane.showMessageDialog(null, "Registro Modificado Exitosamente");
                    limpiarCampos();
                    LimpiarTabla();
                    listarProveedor();
                    txtFecha.setText(fechaActual());
               
                }else {
                    System.out.println("Error al Modificar");
                    JOptionPane.showMessageDialog(null, "Error al Modificar el Cliente");
                } 
            }
        }
    }//GEN-LAST:event_btnActualizarActionPerformed

    private void tablaProveMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tablaProveMouseClicked
        int fila = tablaProve.rowAtPoint(evt.getPoint());
        jlbidprovee.setText(tablaProve.getValueAt(fila,0).toString());
        txtNombre.setText(tablaProve.getValueAt(fila, 1).toString());
        cbxTipoIdentif.setSelectedIndex(Integer.parseInt((tablaProve.getValueAt(fila, 2).toString())));
        txtIdentificacion.setText(tablaProve.getValueAt(fila, 3).toString());
        txtDireccion.setText(tablaProve.getValueAt(fila, 4).toString());
        txtTelefono.setText(tablaProve.getValueAt(fila, 5).toString());
        cbxCiudad.setSelectedIndex(Integer.parseInt(tablaProve.getValueAt(fila, 6).toString()));
        txtCorreo.setText(tablaProve.getValueAt(fila, 7).toString());
        txtFecha.setText(fechaActual());
        
        btnGuardar.setEnabled(false);
        btnActualizar.setEnabled(true);
        btnEliminar.setEnabled(true);
    }//GEN-LAST:event_tablaProveMouseClicked

    private void btnNuevoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnNuevoActionPerformed
        
        limpiarCampos();
        btnGuardar.setEnabled(true);
        btnActualizar.setEnabled(false);
        btnEliminar.setEnabled(false);
        LimpiarTabla();
        listarProveedor();
        txtFecha.setText(fechaActual());
        txtNombre.requestFocus();
    }//GEN-LAST:event_btnNuevoActionPerformed

    private void btnReportActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnReportActionPerformed

        ReportProveedores.reporte();
    }//GEN-LAST:event_btnReportActionPerformed

    private void txtNombreKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtNombreKeyTyped
        validar.textKeyPress(evt);
    }//GEN-LAST:event_txtNombreKeyTyped

    private void txtIdentificacionKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtIdentificacionKeyTyped
        //validar.numberKeyPress(evt);
    }//GEN-LAST:event_txtIdentificacionKeyTyped
       
    public void listarProveedor(){
        
        List<Proveedor> listarPrv = modSql.listarProveedor();
        modelo = (DefaultTableModel) tablaProve.getModel();
        Object[] obj = new Object[9];
        for (int i = 0; i < listarPrv.size(); i++) {
            obj[0] = listarPrv.get(i).getIdProveedor();
            obj[1] = listarPrv.get(i).getNombre();
            obj[2] = listarPrv.get(i).getIdTipoDocumen();
            obj[3] = listarPrv.get(i).getDocumen();
            obj[4] = listarPrv.get(i).getDireccion();
            obj[5] = listarPrv.get(i).getTelefono();
            obj[6] = listarPrv.get(i).getIdciudad();
            obj[7] = listarPrv.get(i).getCorreo();
            obj[8] = listarPrv.get(i).getFecha();
            
            modelo.addRow(obj);
        }
        tablaProve.setModel(modelo);
    }
    
    public void LimpiarTabla(){
        for(int i = 0; i<modelo.getRowCount(); i++){
            modelo.removeRow(i);
            i = i-1;
        }
    }
    
    private void limpiarCampos() {
        jlbidprovee.setText("");
        txtIdentificacion.setText("");
        txtNombre.setText("");
        txtDireccion.setText("");
        txtTelefono.setText("");
        txtCorreo.setText("");
        txtFecha.setText("");
        cbxTipoIdentif.setSelectedIndex(0);
        cbxCiudad.setSelectedIndex(0);
    }
    
    public static String fechaActual(){

    Date fecha = new Date();
    SimpleDateFormat formato = new SimpleDateFormat("dd/MM/YYYY");
    return formato.format(fecha);
}

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnActualizar;
    private javax.swing.JButton btnEliminar;
    private javax.swing.JButton btnGuardar;
    private javax.swing.JButton btnNuevo;
    private javax.swing.JToggleButton btnReport;
    private javax.swing.JButton btnSalir;
    private javax.swing.JComboBox<String> cbxCiudad;
    private javax.swing.JComboBox<String> cbxTipoIdentif;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel jlb1;
    private javax.swing.JLabel jlbActualizar;
    private javax.swing.JLabel jlbDireccion;
    private javax.swing.JLabel jlbNombre;
    private javax.swing.JLabel jlbidprovee;
    private javax.swing.JLabel jlblEliminar;
    private javax.swing.JLabel jlblGuardar;
    private javax.swing.JLabel jlblNuevo;
    private javax.swing.JLabel jlblSalir;
    private javax.swing.JLabel lblReport;
    private javax.swing.JTable tablaProve;
    private javax.swing.JTextField txtCorreo;
    private javax.swing.JTextField txtDireccion;
    private javax.swing.JTextField txtFecha;
    private javax.swing.JTextField txtIdentificacion;
    private javax.swing.JTextField txtNombre;
    private javax.swing.JTextField txtTelefono;
    // End of variables declaration//GEN-END:variables
}
