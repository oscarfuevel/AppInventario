package capaPresentacion;

import Reportes.ReportProductos;
import capaDatos.Categoria;
import capaDatos.Producto;
import capaDatos.Proveedor;
import capaLogica.SqlProducto;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

public class Productos extends javax.swing.JInternalFrame {
    
    SqlProducto modSql = new SqlProducto();
    Producto mod = new Producto();
    Proveedor modprv = new Proveedor();
    ValidarCampos validar = new ValidarCampos();
    DefaultTableModel modelo = new DefaultTableModel();
    Categoria ctg = new Categoria();
    
    public Productos() {
        initComponents();
        jlbIdPrd.setVisible(false);
        listarProducto();
        btnActualizar.setEnabled(false);
        btnEliminar.setEnabled(false);
        txtFecha.setText(fechaActual());
        
        Categoria cc = new Categoria();
        Proveedor pp = new Proveedor();
        DefaultComboBoxModel modCat = new DefaultComboBoxModel(cc.mostrarCategoria());
        cbxCategoria.setModel(modCat);
         
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jlb1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jlbNombre = new javax.swing.JLabel();
        txtNombre = new javax.swing.JTextField();
        lblCategoria = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        txtFecha = new javax.swing.JTextField();
        cbxCategoria = new javax.swing.JComboBox<>();
        jLabel3 = new javax.swing.JLabel();
        txtPrecioC = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        txtStock = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        tablaProducto = new javax.swing.JTable();
        jlbIdPrd = new javax.swing.JLabel();
        btnGuardar = new javax.swing.JButton();
        jlblGuardar = new javax.swing.JLabel();
        btnActualizar = new javax.swing.JButton();
        jlbActualizar = new javax.swing.JLabel();
        btnEliminar = new javax.swing.JButton();
        jlblEliminar = new javax.swing.JLabel();
        btnSalir = new javax.swing.JButton();
        jlblSalir = new javax.swing.JLabel();
        btnNuevo = new javax.swing.JButton();
        jlblNuevo = new javax.swing.JLabel();
        btnReport = new javax.swing.JToggleButton();
        lblReport = new javax.swing.JLabel();
        jlbidPro = new javax.swing.JLabel();

        setBorder(null);
        setPreferredSize(new java.awt.Dimension(800, 540));
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jlb1.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jlb1.setText("Gestión Productos  ");
        getContentPane().add(jlb1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 11, 140, 20));
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(285, 63, 390, -1));

        jPanel1.setBackground(new java.awt.Color(221, 229, 226));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jlbNombre.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jlbNombre.setText("Nombre : ");
        jPanel1.add(jlbNombre, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 50, -1, -1));

        txtNombre.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        txtNombre.setHorizontalAlignment(javax.swing.JTextField.RIGHT);
        txtNombre.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtNombreKeyTyped(evt);
            }
        });
        jPanel1.add(txtNombre, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 70, 320, 30));

        lblCategoria.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        lblCategoria.setText("Categoría: ");
        jPanel1.add(lblCategoria, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 50, -1, -1));

        jLabel6.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel6.setText("Fecha: ");
        jPanel1.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 110, -1, -1));

        txtFecha.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        txtFecha.setHorizontalAlignment(javax.swing.JTextField.RIGHT);
        jPanel1.add(txtFecha, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 130, 140, 30));

        jPanel1.add(cbxCategoria, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 70, 200, 30));

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel3.setText("Precio Compra: ");
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 110, -1, -1));

        txtPrecioC.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        txtPrecioC.setHorizontalAlignment(javax.swing.JTextField.RIGHT);
        txtPrecioC.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtPrecioCKeyTyped(evt);
            }
        });
        jPanel1.add(txtPrecioC, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 130, 140, 30));

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel4.setText("Stock:");
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 110, -1, -1));

        txtStock.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        txtStock.setHorizontalAlignment(javax.swing.JTextField.RIGHT);
        txtStock.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtStockKeyTyped(evt);
            }
        });
        jPanel1.add(txtStock, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 130, 110, 30));

        tablaProducto.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Id", "Nombre", "Categoria", "Precio Compra", "Fecha", "Stock"
            }
        ));
        tablaProducto.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tablaProductoMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tablaProducto);
        if (tablaProducto.getColumnModel().getColumnCount() > 0) {
            tablaProducto.getColumnModel().getColumn(0).setPreferredWidth(15);
            tablaProducto.getColumnModel().getColumn(2).setPreferredWidth(20);
            tablaProducto.getColumnModel().getColumn(3).setPreferredWidth(35);
            tablaProducto.getColumnModel().getColumn(4).setPreferredWidth(30);
            tablaProducto.getColumnModel().getColumn(5).setPreferredWidth(20);
        }

        jPanel1.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 180, 720, 230));
        jPanel1.add(jlbIdPrd, new org.netbeans.lib.awtextra.AbsoluteConstraints(640, 70, 40, 30));

        btnGuardar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/Guar.png"))); // NOI18N
        btnGuardar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnGuardarActionPerformed(evt);
            }
        });
        jPanel1.add(btnGuardar, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 420, 50, 40));

        jlblGuardar.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jlblGuardar.setText("Guardar");
        jPanel1.add(jlblGuardar, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 460, 50, -1));

        btnActualizar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/Actualizar.png"))); // NOI18N
        btnActualizar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnActualizarActionPerformed(evt);
            }
        });
        jPanel1.add(btnActualizar, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 420, 50, 40));

        jlbActualizar.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jlbActualizar.setText("Actualizar");
        jPanel1.add(jlbActualizar, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 460, 50, -1));

        btnEliminar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/Elim.png"))); // NOI18N
        btnEliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEliminarActionPerformed(evt);
            }
        });
        jPanel1.add(btnEliminar, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 420, 50, 40));

        jlblEliminar.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jlblEliminar.setText("Eliminar");
        jPanel1.add(jlblEliminar, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 460, 50, -1));

        btnSalir.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/Salir.png"))); // NOI18N
        btnSalir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSalirActionPerformed(evt);
            }
        });
        jPanel1.add(btnSalir, new org.netbeans.lib.awtextra.AbsoluteConstraints(660, 420, 50, -1));

        jlblSalir.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jlblSalir.setText("Cerrar");
        jPanel1.add(jlblSalir, new org.netbeans.lib.awtextra.AbsoluteConstraints(660, 460, 50, -1));

        btnNuevo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/Nuevo.png"))); // NOI18N
        btnNuevo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnNuevoActionPerformed(evt);
            }
        });
        jPanel1.add(btnNuevo, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 420, 50, -1));

        jlblNuevo.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jlblNuevo.setText("Nuevo");
        jPanel1.add(jlblNuevo, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 460, 50, -1));

        btnReport.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/Excel2.png"))); // NOI18N
        btnReport.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnReportActionPerformed(evt);
            }
        });
        jPanel1.add(btnReport, new org.netbeans.lib.awtextra.AbsoluteConstraints(530, 420, 50, 40));

        lblReport.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblReport.setText("Reporte");
        jPanel1.add(lblReport, new org.netbeans.lib.awtextra.AbsoluteConstraints(530, 460, 50, -1));
        jPanel1.add(jlbidPro, new org.netbeans.lib.awtextra.AbsoluteConstraints(610, 70, 40, 30));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 790, 510));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void tablaProductoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tablaProductoMouseClicked
        
        int fila = tablaProducto.rowAtPoint(evt.getPoint());
        jlbIdPrd.setText(tablaProducto.getValueAt(fila,0).toString());
        txtNombre.setText(tablaProducto.getValueAt(fila, 1).toString());
        cbxCategoria.setSelectedIndex(Integer.parseInt(tablaProducto.getValueAt(fila, 2).toString()));
        txtPrecioC.setText(tablaProducto.getValueAt(fila, 3).toString());
        txtFecha.setText(fechaActual());
        txtStock.setText(tablaProducto.getValueAt(fila, 5).toString());
        
        btnGuardar.setEnabled(false);
        btnActualizar.setEnabled(true);
        btnEliminar.setEnabled(true);
        
    }//GEN-LAST:event_tablaProductoMouseClicked

    private void btnGuardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGuardarActionPerformed
        
        ctg = (Categoria) cbxCategoria.getSelectedItem();
        
        if(txtNombre.getText().equals("") || cbxCategoria.getSelectedItem().equals("") || txtPrecioC.getText().equals("") || txtStock.getText().equals("") || txtFecha.getText().equals("")){
           
            JOptionPane.showMessageDialog(null, "Hay campos vacios, Debe llenar todos los campos");
        }else{
            
            mod.setNombre(txtNombre.getText());
            mod.setIdCategoria(ctg.getIdCategoria());
            mod.setPrecioCompra(Integer.parseInt(txtPrecioC.getText()));
            mod.setStock(Integer.parseInt(txtStock.getText()));
            mod.setFecha(txtFecha.getText());
            
            if(modSql.crearProducto(mod)){
                
                JOptionPane.showMessageDialog(null, "Producto Guardado Exitosamente");
                limpiarCampos();
                LimpiarTabla();
                listarProducto();
                
            } else {
                System.out.println("Error al guardar");
                JOptionPane.showMessageDialog(null, "Error al guardar Producto");
            }  
        }    
    }//GEN-LAST:event_btnGuardarActionPerformed

    private void btnNuevoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnNuevoActionPerformed
        limpiarCampos();
        txtFecha.setText(fechaActual());
        btnGuardar.setEnabled(true);
        btnActualizar.setEnabled(false);
        btnEliminar.setEnabled(false);
    }//GEN-LAST:event_btnNuevoActionPerformed

    private void btnSalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSalirActionPerformed
        this.dispose();
    }//GEN-LAST:event_btnSalirActionPerformed

    private void btnEliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEliminarActionPerformed
        
        if(jlbIdPrd.getText().equals("")){
            JOptionPane.showMessageDialog(null, "Debe seleccionar un Producto");
            
        }else{
        
            int resultado = JOptionPane.showConfirmDialog(Productos.this,
                    "¿Está¡ seguro de querer eliminar este Producto?", "Confirmación", JOptionPane.YES_NO_OPTION);

            if (resultado == JOptionPane.YES_OPTION) {
                int id = Integer.parseInt(jlbIdPrd.getText());

                modSql.EliminarProducto(id);

                JOptionPane.showMessageDialog(Productos.this,
                        String.format("El producto con Id %s se ha eliminado de forma satisfactoria.", id),
                        "Mensaje", JOptionPane.INFORMATION_MESSAGE);

                limpiarCampos();
                LimpiarTabla();
                listarProducto();
                txtFecha.setText(fechaActual());

            }else {
                    System.out.println("Error al Eliminar");
                    JOptionPane.showMessageDialog(null, "Error al Eliminar Producto");
            }  
        }
    }//GEN-LAST:event_btnEliminarActionPerformed

    private void btnActualizarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnActualizarActionPerformed
        
        ctg = (Categoria) cbxCategoria.getSelectedItem();
        
        if("".equals(jlbIdPrd.getText())){
            JOptionPane.showMessageDialog(null, "Debe seleccionar un Producto");
            
        }else{
            
            if(!"".equals(txtNombre.getText()) || !"".equals(txtStock.getText()) || !"".equals(txtPrecioC.getText()) || !"".equals(txtFecha.getText())){
            
                mod.setIdProducto(Integer.parseInt(jlbIdPrd.getText()));
                mod.setNombre(txtNombre.getText());
                mod.setIdCategoria(ctg.getIdCategoria());
                mod.setPrecioCompra(Integer.parseInt(txtPrecioC.getText()));
                mod.setStock(Integer.parseInt(txtStock.getText()));
                mod.setFecha(txtFecha.getText());

                if(modSql.ModificarProducto(mod)){

                JOptionPane.showMessageDialog(null, "Registro Modificado Exitosamente");
                limpiarCampos();
                LimpiarTabla();
                listarProducto();
                txtFecha.setText(fechaActual());
                
            }else {
                System.out.println("Error al Modificar");
                JOptionPane.showMessageDialog(null, "Error al Modificar el Cliente");
                }  
            }
        }
    }//GEN-LAST:event_btnActualizarActionPerformed

    private void btnReportActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnReportActionPerformed
        
        ReportProductos.reporte();
    }//GEN-LAST:event_btnReportActionPerformed

    private void txtNombreKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtNombreKeyTyped
        //validar.textKeyPress(evt);
    }//GEN-LAST:event_txtNombreKeyTyped

    private void txtPrecioCKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtPrecioCKeyTyped
        validar.numberKeyPress(evt);
    }//GEN-LAST:event_txtPrecioCKeyTyped

    private void txtStockKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtStockKeyTyped
        validar.numberKeyPress(evt);
    }//GEN-LAST:event_txtStockKeyTyped
    
    private void listarProducto() {
  
        List<Producto> listarPrd = modSql.listarProducto();
        modelo = (DefaultTableModel) tablaProducto.getModel();
        Object[] obj = new Object[6];
        
        for (int i = 0; i < listarPrd.size(); i++) {
            obj[0] = listarPrd.get(i).getIdProducto();
            obj[1] = listarPrd.get(i).getNombre();
            obj[2] = listarPrd.get(i).getIdCategoria();
            obj[3] = listarPrd.get(i).getPrecioCompra();
            obj[4] = listarPrd.get(i).getFecha();
            obj[5] = listarPrd.get(i).getStock();
            
            
            modelo.addRow(obj);
        }
        tablaProducto.setModel(modelo);
    }
    
    public void LimpiarTabla(){
        for(int i = 0; i<modelo.getRowCount(); i++){
            modelo.removeRow(i);
            i = i-1;
        }
    }
    
    private void limpiarCampos() {
        txtNombre.setText("");
        cbxCategoria.setSelectedIndex(0);
        //cbxProveedor.setSelectedIndex(0);
        txtPrecioC.setText("");
        txtStock.setText("");
        txtFecha.setText("");
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
    private javax.swing.JComboBox<String> cbxCategoria;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel jlb1;
    private javax.swing.JLabel jlbActualizar;
    private javax.swing.JLabel jlbIdPrd;
    private javax.swing.JLabel jlbNombre;
    private javax.swing.JLabel jlbidPro;
    private javax.swing.JLabel jlblEliminar;
    private javax.swing.JLabel jlblGuardar;
    private javax.swing.JLabel jlblNuevo;
    private javax.swing.JLabel jlblSalir;
    private javax.swing.JLabel lblCategoria;
    private javax.swing.JLabel lblReport;
    private javax.swing.JTable tablaProducto;
    private javax.swing.JTextField txtFecha;
    private javax.swing.JTextField txtNombre;
    private javax.swing.JTextField txtPrecioC;
    private javax.swing.JTextField txtStock;
    // End of variables declaration//GEN-END:variables

}
