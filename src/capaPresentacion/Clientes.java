package capaPresentacion;

import Reportes.ReportClientes;
import capaDatos.Ciudad;
import capaDatos.Cliente;
import capaDatos.tipo_documento;
import capaLogica.SqlCliente;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;


public class Clientes extends javax.swing.JInternalFrame {
    
    SqlCliente modSql = new SqlCliente();
    Cliente mod = new Cliente();
    ValidarCampos validar = new ValidarCampos();
    DefaultTableModel modelo = new DefaultTableModel();
    tipo_documento td;
    Ciudad ciudad;

    public Clientes() {
        initComponents();
        jlbidCliente.setVisible(false);
        listarCliente();
        btnActualizar.setEnabled(false);
        btnEliminar.setEnabled(false);
        txtfecha.setText(fechaActual());
       
        tipo_documento cc = new tipo_documento();
        DefaultComboBoxModel modTipo = new DefaultComboBoxModel(cc.mostrarTipoDoc());
        cbxTipoIden.setModel(modTipo);
        
        Ciudad dd = new Ciudad();
        DefaultComboBoxModel modCiu = new DefaultComboBoxModel(dd.mostrarCiudad());
        cbxCiudad.setModel(modCiu);          
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jlb1 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        btnGuardar = new javax.swing.JButton();
        btnActualizar = new javax.swing.JButton();
        btnEliminar = new javax.swing.JButton();
        btnNuevo = new javax.swing.JButton();
        btnSalir = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        tablaClientes = new javax.swing.JTable();
        jLabel1 = new javax.swing.JLabel();
        txtCorreo = new javax.swing.JTextField();
        jlblCiudad = new javax.swing.JLabel();
        jlblFecha = new javax.swing.JLabel();
        jlblIdentificacion = new javax.swing.JLabel();
        txtIdentificacion = new javax.swing.JTextField();
        jlblIdentificcion = new javax.swing.JLabel();
        jlbNombre = new javax.swing.JLabel();
        txtNombre = new javax.swing.JTextField();
        jlbDireccion = new javax.swing.JLabel();
        txtDireccion = new javax.swing.JTextField();
        jlbTelefono = new javax.swing.JLabel();
        txtTelefono = new javax.swing.JTextField();
        jlblSalir = new javax.swing.JLabel();
        jlblNuevo = new javax.swing.JLabel();
        jlblEliminar = new javax.swing.JLabel();
        jlbActualizar = new javax.swing.JLabel();
        jlblGuardar = new javax.swing.JLabel();
        txtfecha = new javax.swing.JTextField();
        cbxTipoIden = new javax.swing.JComboBox<>();
        cbxCiudad = new javax.swing.JComboBox<>();
        jlbidCliente = new javax.swing.JLabel();
        btnReport = new javax.swing.JToggleButton();
        lblReport = new javax.swing.JLabel();

        setBackground(new java.awt.Color(255, 255, 255));
        setBorder(null);
        setPreferredSize(new java.awt.Dimension(800, 540));
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jlb1.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jlb1.setText("Gestión Clientes");
        getContentPane().add(jlb1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 11, 140, 20));

        jPanel1.setBackground(new java.awt.Color(221, 229, 226));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        btnGuardar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/Guar.png"))); // NOI18N
        btnGuardar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnGuardarActionPerformed(evt);
            }
        });
        jPanel1.add(btnGuardar, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 430, 50, 40));

        btnActualizar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/Actualizar.png"))); // NOI18N
        btnActualizar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnActualizarActionPerformed(evt);
            }
        });
        jPanel1.add(btnActualizar, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 430, 50, 40));

        btnEliminar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/Elim.png"))); // NOI18N
        btnEliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEliminarActionPerformed(evt);
            }
        });
        jPanel1.add(btnEliminar, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 430, 50, 40));

        btnNuevo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/Nuevo.png"))); // NOI18N
        btnNuevo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnNuevoActionPerformed(evt);
            }
        });
        jPanel1.add(btnNuevo, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 430, 50, -1));

        btnSalir.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/Salir.png"))); // NOI18N
        btnSalir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSalirActionPerformed(evt);
            }
        });
        jPanel1.add(btnSalir, new org.netbeans.lib.awtextra.AbsoluteConstraints(660, 430, 50, -1));

        tablaClientes.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Id", "Nombre", "Tipo Docum", "Identificación", "Dirección", "Teléfono", "Ciudad", "Correo", "Fecha"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Integer.class, java.lang.String.class, java.lang.Object.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.Object.class, java.lang.String.class, java.lang.String.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        tablaClientes.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tablaClientesMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tablaClientes);
        if (tablaClientes.getColumnModel().getColumnCount() > 0) {
            tablaClientes.getColumnModel().getColumn(0).setMaxWidth(60);
            tablaClientes.getColumnModel().getColumn(2).setMaxWidth(60);
            tablaClientes.getColumnModel().getColumn(6).setMaxWidth(60);
        }

        jPanel1.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 240, 740, 178));

        jLabel1.setText("Correo: ");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 170, -1, -1));
        jPanel1.add(txtCorreo, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 190, 290, 28));

        jlblCiudad.setText("Ciudad: ");
        jPanel1.add(jlblCiudad, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 110, -1, -1));

        jlblFecha.setText("Fecha: ");
        jPanel1.add(jlblFecha, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 170, -1, -1));

        jlblIdentificacion.setText("No Identificación: ");
        jPanel1.add(jlblIdentificacion, new org.netbeans.lib.awtextra.AbsoluteConstraints(550, 50, -1, -1));

        txtIdentificacion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtIdentificacionActionPerformed(evt);
            }
        });
        txtIdentificacion.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtIdentificacionKeyTyped(evt);
            }
        });
        jPanel1.add(txtIdentificacion, new org.netbeans.lib.awtextra.AbsoluteConstraints(550, 70, 190, 30));

        jlblIdentificcion.setText("Tipo de Identificación: ");
        jPanel1.add(jlblIdentificcion, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 50, 110, -1));

        jlbNombre.setText("Nombre o Razón Social: ");
        jPanel1.add(jlbNombre, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 50, -1, -1));

        txtNombre.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtNombreKeyTyped(evt);
            }
        });
        jPanel1.add(txtNombre, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 70, 300, 30));

        jlbDireccion.setText("Dirección: ");
        jPanel1.add(jlbDireccion, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 110, -1, -1));
        jPanel1.add(txtDireccion, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 130, 260, 30));

        jlbTelefono.setText("Telefono: ");
        jPanel1.add(jlbTelefono, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 110, -1, -1));
        jPanel1.add(txtTelefono, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 130, 170, 30));

        jlblSalir.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jlblSalir.setText("Cerrar");
        jPanel1.add(jlblSalir, new org.netbeans.lib.awtextra.AbsoluteConstraints(660, 470, 50, -1));

        jlblNuevo.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jlblNuevo.setText("Nuevo");
        jPanel1.add(jlblNuevo, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 470, 50, -1));

        jlblEliminar.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jlblEliminar.setText("Eliminar");
        jPanel1.add(jlblEliminar, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 470, 50, -1));

        jlbActualizar.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jlbActualizar.setText("Actualizar");
        jPanel1.add(jlbActualizar, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 470, 50, -1));

        jlblGuardar.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jlblGuardar.setText("Guardar");
        jPanel1.add(jlblGuardar, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 470, 50, -1));

        txtfecha.setHorizontalAlignment(javax.swing.JTextField.RIGHT);
        jPanel1.add(txtfecha, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 190, 100, 30));

        cbxTipoIden.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbxTipoIdenActionPerformed(evt);
            }
        });
        jPanel1.add(cbxTipoIden, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 70, 170, 30));

        jPanel1.add(cbxCiudad, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 130, 140, 30));
        jPanel1.add(jlbidCliente, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 190, 40, 30));

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

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 830, 900));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnGuardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGuardarActionPerformed

        td = (tipo_documento) cbxTipoIden.getSelectedItem();
        ciudad = (Ciudad) cbxCiudad.getSelectedItem();
        
        if(txtIdentificacion.getText().equals("") || cbxTipoIden.getSelectedItem().equals("") || txtNombre.getText().equals("") || cbxCiudad.getSelectedItem().equals("") || txtDireccion.getText().equals("") || txtTelefono.getText().equals("") || txtCorreo.getText().equals("")){
           
            JOptionPane.showMessageDialog(null, "Hay campos vacios, Debe llenar todos los campos");
        }else{
            
            mod.setDocumen(txtIdentificacion.getText());
            mod.setIdTipoDocumen(td.getIdTipoDoc());
            mod.setNombre(txtNombre.getText());
            mod.setIdciudad(ciudad.getIdCiudad());
            mod.setDireccion(txtDireccion.getText());
            mod.setTelefono(txtTelefono.getText());
            mod.setCorreo(txtCorreo.getText());
            mod.setFecha(txtfecha.getText());
           
            if(modSql.crearCliente(mod)){
                
                JOptionPane.showMessageDialog(null, "Cliente Creado Exitosamente");
                limpiarCampos();
                LimpiarTabla();
                listarCliente();
                txtfecha.setText(fechaActual());
                txtNombre.requestFocus();
                
            } else {
                System.out.println("Error al guardar");
                JOptionPane.showMessageDialog(null, "Error al crear el Registro");
            }  
        }    
    }//GEN-LAST:event_btnGuardarActionPerformed

    private void btnSalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSalirActionPerformed
        this.dispose();
    }//GEN-LAST:event_btnSalirActionPerformed

    private void tablaClientesMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tablaClientesMouseClicked
        
        int fila = tablaClientes.rowAtPoint(evt.getPoint());
        jlbidCliente.setText(tablaClientes.getValueAt(fila,0).toString());
        txtNombre.setText(tablaClientes.getValueAt(fila, 1).toString());
        cbxTipoIden.setSelectedIndex(Integer.parseInt(tablaClientes.getValueAt(fila, 2).toString()));
        txtIdentificacion.setText(tablaClientes.getValueAt(fila, 3).toString());
        txtDireccion.setText(tablaClientes.getValueAt(fila, 4).toString());
        txtTelefono.setText(tablaClientes.getValueAt(fila, 5).toString());
        cbxCiudad.setSelectedIndex(Integer.parseInt(tablaClientes.getValueAt(fila, 6).toString()));
        txtCorreo.setText(tablaClientes.getValueAt(fila, 7).toString());
        txtfecha.setText(fechaActual());
        
        btnGuardar.setEnabled(false);
        btnActualizar.setEnabled(true);
        btnEliminar.setEnabled(true);
        
    }//GEN-LAST:event_tablaClientesMouseClicked

    private void btnEliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEliminarActionPerformed
        
        if(jlbidCliente.getText().equals("")){
            JOptionPane.showMessageDialog(null, "Debe seleccionar un cliente");
            
        }else{
            int resultado = JOptionPane.showConfirmDialog(Clientes.this,
                    "¿Está¡ seguro de querer eliminar este cliente?", "Confirmación", JOptionPane.YES_NO_OPTION);

            if (resultado == JOptionPane.YES_OPTION) {
                int id = Integer.parseInt(jlbidCliente.getText());

                SqlCliente eliminar = new SqlCliente();
                eliminar.EliminarCliente(id);

                JOptionPane.showMessageDialog(Clientes.this,
                        String.format("El cliente con Id %s se ha eliminado de forma satisfactoria.", id),
                        "Mensaje", JOptionPane.INFORMATION_MESSAGE);

                limpiarCampos();
                LimpiarTabla();
                listarCliente();
                txtfecha.setText(fechaActual());

            }
        }
    }//GEN-LAST:event_btnEliminarActionPerformed

    private void btnActualizarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnActualizarActionPerformed
        
        td = (tipo_documento) cbxTipoIden.getSelectedItem();
        ciudad = (Ciudad) cbxCiudad.getSelectedItem();
        
        if(jlbidCliente.getText().equals("")){
            JOptionPane.showMessageDialog(null, "Debe seleccionar un cliente");
            
        }else{
            
            if(!"".equals(txtIdentificacion.getText()) || !"".equals(cbxTipoIden.getSelectedItem()) || !"".equals(txtNombre.getText()) || !"".equals(cbxCiudad.getSelectedItem()) || !"".equals(txtDireccion.getText()) || !"".equals(txtTelefono.getText()) || !"".equals(txtCorreo.getText()) || !"".equals(txtfecha.getText())){
            
                mod.setIdCliente(Integer.parseInt(jlbidCliente.getText()));
                mod.setDocumen(txtIdentificacion.getText());
                mod.setIdTipoDocumen(td.getIdTipoDoc());
                mod.setNombre(txtNombre.getText());
                mod.setIdciudad(ciudad.getIdCiudad());
                mod.setDireccion(txtDireccion.getText());
                mod.setTelefono(txtTelefono.getText());
                mod.setCorreo(txtCorreo.getText());
                mod.setFecha(txtfecha.getText());

                modSql.ModificarCliente(mod);

                JOptionPane.showMessageDialog(null, "Registro Modificado Exitosamente");
                limpiarCampos();
                LimpiarTabla();
                listarCliente();
                txtfecha.setText(fechaActual());
                
            }else {
                System.out.println("Error al Modificar");
                JOptionPane.showMessageDialog(null, "Error al Modificar el Cliente");
            }  
        }
    }//GEN-LAST:event_btnActualizarActionPerformed

    private void btnNuevoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnNuevoActionPerformed
        limpiarCampos();
        btnGuardar.setEnabled(true);
        btnActualizar.setEnabled(false);
        btnEliminar.setEnabled(false);
        LimpiarTabla();
        listarCliente();
        txtNombre.requestFocus();
        txtfecha.setText(fechaActual());
    }//GEN-LAST:event_btnNuevoActionPerformed

    private void btnReportActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnReportActionPerformed

        ReportClientes.reporte();
    }//GEN-LAST:event_btnReportActionPerformed

    private void txtNombreKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtNombreKeyTyped
        validar.textKeyPress(evt);
    }//GEN-LAST:event_txtNombreKeyTyped

    private void txtIdentificacionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtIdentificacionActionPerformed

    }//GEN-LAST:event_txtIdentificacionActionPerformed

    private void txtIdentificacionKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtIdentificacionKeyTyped
        
        //validar.numberKeyPress(evt);
    }//GEN-LAST:event_txtIdentificacionKeyTyped

    private void cbxTipoIdenActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbxTipoIdenActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cbxTipoIdenActionPerformed

    public void listarCliente(){
        
        List<Cliente> listarCli = modSql.listarCliente();
        modelo = (DefaultTableModel) tablaClientes.getModel();
        Object[] obj = new Object[9];
        for (int i = 0; i < listarCli.size(); i++) {
            obj[0] = listarCli.get(i).getIdCliente();
            obj[1] = listarCli.get(i).getNombre();
            obj[2] = listarCli.get(i).getIdTipoDocumen();
            obj[3] = listarCli.get(i).getDocumen();
            obj[4] = listarCli.get(i).getDireccion();
            obj[5] = listarCli.get(i).getTelefono();
            obj[6] = listarCli.get(i).getIdciudad();
            obj[7] = listarCli.get(i).getCorreo();
            obj[8] = listarCli.get(i).getFecha();
            
            modelo.addRow(obj);
        }
        tablaClientes.setModel(modelo);
    }
    
    public void LimpiarTabla(){
        for(int i = 0; i<modelo.getRowCount(); i++){
            modelo.removeRow(i);
            i = i-1;
        }
    }
    
    public static String fechaActual(){

    Date fecha = new Date();
    SimpleDateFormat formato = new SimpleDateFormat("dd/MM/YYYY");
    return formato.format(fecha);
    }
    
    private void limpiarCampos() {
        jlbidCliente.setText("");
        txtIdentificacion.setText("");
        txtNombre.setText("");
        txtDireccion.setText("");
        txtTelefono.setText("");
        txtCorreo.setText("");
        txtfecha.setText("");
        cbxTipoIden.setSelectedIndex(0);
        cbxCiudad.setSelectedIndex(0);
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnActualizar;
    private javax.swing.JButton btnEliminar;
    private javax.swing.JButton btnGuardar;
    private javax.swing.JButton btnNuevo;
    private javax.swing.JToggleButton btnReport;
    private javax.swing.JButton btnSalir;
    private javax.swing.JComboBox<String> cbxCiudad;
    private javax.swing.JComboBox<String> cbxTipoIden;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel jlb1;
    private javax.swing.JLabel jlbActualizar;
    private javax.swing.JLabel jlbDireccion;
    private javax.swing.JLabel jlbNombre;
    private javax.swing.JLabel jlbTelefono;
    private javax.swing.JLabel jlbidCliente;
    private javax.swing.JLabel jlblCiudad;
    private javax.swing.JLabel jlblEliminar;
    private javax.swing.JLabel jlblFecha;
    private javax.swing.JLabel jlblGuardar;
    private javax.swing.JLabel jlblIdentificacion;
    private javax.swing.JLabel jlblIdentificcion;
    private javax.swing.JLabel jlblNuevo;
    private javax.swing.JLabel jlblSalir;
    private javax.swing.JLabel lblReport;
    private javax.swing.JTable tablaClientes;
    private javax.swing.JTextField txtCorreo;
    private javax.swing.JTextField txtDireccion;
    private javax.swing.JTextField txtIdentificacion;
    private javax.swing.JTextField txtNombre;
    private javax.swing.JTextField txtTelefono;
    private javax.swing.JTextField txtfecha;
    // End of variables declaration//GEN-END:variables


}


