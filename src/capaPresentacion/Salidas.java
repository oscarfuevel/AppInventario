package capaPresentacion;

import capaDatos.Cliente;
import capaDatos.DetalleSalida;
import capaDatos.Producto;
import capaDatos.Proveedor;
import capaDatos.Salida;
import capaLogica.SqlCliente;
import capaLogica.SqlProducto;
import capaLogica.SqlSalida;
import com.itextpdf.text.BaseColor;
import com.itextpdf.text.Chunk;
import com.itextpdf.text.Document;
import com.itextpdf.text.DocumentException;
import com.itextpdf.text.Element;
import com.itextpdf.text.Font;
import com.itextpdf.text.Image;
import com.itextpdf.text.Paragraph;
import com.itextpdf.text.Phrase;
import com.itextpdf.text.pdf.PdfPCell;
import com.itextpdf.text.pdf.PdfPTable;
import com.itextpdf.text.pdf.PdfWriter;
import com.sun.glass.events.KeyEvent;
import java.awt.Desktop;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

public class Salidas extends javax.swing.JInternalFrame {

    SqlProducto modSql = new SqlProducto();
    SqlCliente cli = new SqlCliente();
    Producto mod = new Producto();
    Proveedor modprv = new Proveedor();
    Cliente cl = new Cliente();
    Salida sal = new Salida();
    SqlSalida salSql = new SqlSalida();
    DetalleSalida detalle = new DetalleSalida();
    DefaultTableModel modelo = new DefaultTableModel();
    ValidarCampos val = new ValidarCampos();
    int item;

    public Salidas() {
        initComponents();
        btnEliminar.setEnabled(false);
        txtFecha.setText(fechaActual());
       
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel3 = new javax.swing.JLabel();
        jlb1 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jlbStockDisp = new javax.swing.JLabel();
        txtStokDisp = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        txtFecha = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        txtNumFactura = new javax.swing.JTextField();
        jlblProducto = new javax.swing.JLabel();
        jlblCantidad = new javax.swing.JLabel();
        txtCantidad = new javax.swing.JTextField();
        jlblProveedor = new javax.swing.JLabel();
        btnEliminar = new javax.swing.JButton();
        btnRtrarSalida = new javax.swing.JButton();
        txtIdProducto = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        txtNombreProduc = new javax.swing.JTextField();
        jlbDespacho = new javax.swing.JLabel();
        jlblEliminar = new javax.swing.JLabel();
        jlblModificar = new javax.swing.JLabel();
        txtNombreCliente = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        txtIdentific = new javax.swing.JTextField();
        jlbTelefono = new javax.swing.JLabel();
        txtTelefono = new javax.swing.JTextField();
        jlblCorreo = new javax.swing.JLabel();
        txtCorreo = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        btnSalir = new javax.swing.JButton();
        jlblSalir = new javax.swing.JLabel();
        btnNuevo = new javax.swing.JButton();
        jlblNuevo = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        tableSalida = new javax.swing.JTable();

        jLabel3.setText("jLabel3");

        setBorder(null);
        setPreferredSize(new java.awt.Dimension(800, 540));
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jlb1.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jlb1.setText("Registrar Salida ");
        getContentPane().add(jlb1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 11, 120, 20));

        jPanel1.setBackground(new java.awt.Color(221, 229, 226));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jlbStockDisp.setText("Stock Disponible: ");
        jPanel1.add(jlbStockDisp, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 90, -1, -1));

        txtStokDisp.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jPanel1.add(txtStokDisp, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 110, 50, 29));

        jLabel6.setText("Fecha: ");
        jPanel1.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 210, -1, -1));

        txtFecha.setHorizontalAlignment(javax.swing.JTextField.RIGHT);
        jPanel1.add(txtFecha, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 230, 110, 30));

        jLabel2.setText("Número de Factura:");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 210, -1, -1));

        txtNumFactura.setHorizontalAlignment(javax.swing.JTextField.RIGHT);
        jPanel1.add(txtNumFactura, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 230, 130, 30));

        jlblProducto.setText("Producto: ");
        jPanel1.add(jlblProducto, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 90, -1, -1));

        jlblCantidad.setText("Cantidad a Despachar: ");
        jPanel1.add(jlblCantidad, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 90, -1, -1));

        txtCantidad.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtCantidad.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtCantidadKeyPressed(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtCantidadKeyTyped(evt);
            }
        });
        jPanel1.add(txtCantidad, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 110, 50, 30));

        jlblProveedor.setText("Cliente: ");
        jPanel1.add(jlblProveedor, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 150, -1, -1));

        btnEliminar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/Elim.png"))); // NOI18N
        btnEliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEliminarActionPerformed(evt);
            }
        });
        jPanel1.add(btnEliminar, new org.netbeans.lib.awtextra.AbsoluteConstraints(690, 40, 60, 50));

        btnRtrarSalida.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/Registro.png"))); // NOI18N
        btnRtrarSalida.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRtrarSalidaActionPerformed(evt);
            }
        });
        jPanel1.add(btnRtrarSalida, new org.netbeans.lib.awtextra.AbsoluteConstraints(690, 120, 60, 50));

        txtIdProducto.setHorizontalAlignment(javax.swing.JTextField.RIGHT);
        txtIdProducto.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtIdProductoKeyPressed(evt);
            }
        });
        jPanel1.add(txtIdProducto, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 110, 50, 30));

        jLabel1.setText("Id : ");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 90, -1, -1));
        jPanel1.add(txtNombreProduc, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 110, 190, 30));

        jlbDespacho.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jlbDespacho.setText("Adicione productos para el despacho : ");
        jPanel1.add(jlbDespacho, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 60, 230, -1));

        jlblEliminar.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jlblEliminar.setText("Eliminar");
        jPanel1.add(jlblEliminar, new org.netbeans.lib.awtextra.AbsoluteConstraints(690, 90, 60, -1));

        jlblModificar.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jlblModificar.setText("Registrar");
        jPanel1.add(jlblModificar, new org.netbeans.lib.awtextra.AbsoluteConstraints(690, 170, 60, -1));
        jPanel1.add(txtNombreCliente, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 170, 200, 30));

        jLabel4.setText("C.C / NIT :");
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 150, -1, -1));

        txtIdentific.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtIdentificKeyPressed(evt);
            }
        });
        jPanel1.add(txtIdentific, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 170, 200, 30));

        jlbTelefono.setText("Teléfono : ");
        jPanel1.add(jlbTelefono, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 150, -1, -1));
        jPanel1.add(txtTelefono, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 170, 170, 30));

        jlblCorreo.setText("Correo Electrónico : ");
        jPanel1.add(jlblCorreo, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 210, -1, -1));
        jPanel1.add(txtCorreo, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 230, 230, 30));

        jLabel5.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel5.setText("Salida");
        jPanel1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(700, 180, 40, 20));

        btnSalir.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/Salir.png"))); // NOI18N
        btnSalir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSalirActionPerformed(evt);
            }
        });
        jPanel1.add(btnSalir, new org.netbeans.lib.awtextra.AbsoluteConstraints(690, 290, 60, 50));

        jlblSalir.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jlblSalir.setText("Cerrar");
        jPanel1.add(jlblSalir, new org.netbeans.lib.awtextra.AbsoluteConstraints(690, 340, 60, 20));

        btnNuevo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/Nuevo.png"))); // NOI18N
        btnNuevo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnNuevoActionPerformed(evt);
            }
        });
        jPanel1.add(btnNuevo, new org.netbeans.lib.awtextra.AbsoluteConstraints(690, 211, 60, 50));

        jlblNuevo.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jlblNuevo.setText("Nuevo");
        jPanel1.add(jlblNuevo, new org.netbeans.lib.awtextra.AbsoluteConstraints(690, 260, 60, -1));

        tableSalida.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Id Producto", "Nombre ", "Cantidad"
            }
        ));
        jScrollPane2.setViewportView(tableSalida);
        if (tableSalida.getColumnModel().getColumnCount() > 0) {
            tableSalida.getColumnModel().getColumn(0).setMaxWidth(80);
            tableSalida.getColumnModel().getColumn(2).setMaxWidth(70);
        }

        jPanel1.add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 280, 610, 180));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 800, 500));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnNuevoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnNuevoActionPerformed
        LimpiarSalida();
        LimpiarTabla();
        btnEliminar.setEnabled(false);
        txtIdProducto.requestFocus();
    }//GEN-LAST:event_btnNuevoActionPerformed

    private void btnSalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSalirActionPerformed
        this.dispose();
    }//GEN-LAST:event_btnSalirActionPerformed

    private void txtIdentificKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtIdentificKeyPressed

        if(evt.getKeyCode() == KeyEvent.VK_ENTER){
            if(!"".equals(txtIdentific.getText())){
                String ced = txtIdentific.getText();
                cl = cli.BuscarCliente(ced);
                if(cl.getNombre() != null){
                    txtNombreCliente.setText("" + cl.getNombre());
                    txtTelefono.setText("" + cl.getTelefono());
                    txtCorreo.setText("" + cl.getCorreo());
                }else{
                    txtIdentific.setText("");
                    JOptionPane.showMessageDialog(null, "El Cliente No existe");
                }
            }
        }
    }//GEN-LAST:event_txtIdentificKeyPressed

    private void txtIdProductoKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtIdProductoKeyPressed

        if(evt.getKeyCode() == KeyEvent.VK_ENTER ){
            if(!"".equals(txtIdProducto.getText())){
                String cod = txtIdProducto.getText();
                mod = modSql.BuscarProd(Integer.parseInt(cod));

                if(mod.getNombre() != null){
                    txtNombreProduc.setText(""+mod.getNombre());
                    txtStokDisp.setText(""+mod.getStock());
                    txtCantidad.requestFocus();
                }else{
                    JOptionPane.showMessageDialog(null, "El producto no existe");
                    LimpiarSalida();
                    txtIdProducto.requestFocus();
                }
            }else{
                JOptionPane.showMessageDialog(null, "Ingrese El codigo del producto");
                txtCantidad.requestFocus();
            }
        }
    }//GEN-LAST:event_txtIdProductoKeyPressed

    private void btnRtrarSalidaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRtrarSalidaActionPerformed

        if(tableSalida.getRowCount() > 0){
            if(!"".equals(txtNombreCliente.getText())){
                JOptionPane.showMessageDialog(null, "Salida Generada");
                RegistrarSalida();
                RegistrarDetalle();
                ActualizarStock();
                pdf();
                LimpiarTabla();
                LimpiarClienteVenta();
            }else{
                JOptionPane.showMessageDialog(null, "Debes Buscar el Cliente");
            }
        }else{
            JOptionPane.showMessageDialog(null, "No hay productos cargados");
        }
    }//GEN-LAST:event_btnRtrarSalidaActionPerformed

    private void btnEliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEliminarActionPerformed
        int fila = tableSalida.getSelectedRow();
        if(fila<0){
            JOptionPane.showMessageDialog(null, "Seleccione un item para Elimnar");
        }
        else if(tableSalida.getRowCount() > 0){
            modelo = (DefaultTableModel) tableSalida.getModel();
            modelo.removeRow(tableSalida.getSelectedRow());
            txtIdProducto.requestFocus();
            //btnEliminar.setEnabled(false);
        }else{
            JOptionPane.showMessageDialog(null, "No hay productos cargados para quitar");
            btnEliminar.setEnabled(false);
        }

    }//GEN-LAST:event_btnEliminarActionPerformed

    private void txtCantidadKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtCantidadKeyTyped
        val.numberKeyPress(evt);
    }//GEN-LAST:event_txtCantidadKeyTyped

    private void txtCantidadKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtCantidadKeyPressed

        if(evt.getKeyCode() == KeyEvent.VK_ENTER ){
            if(!"".equals(txtCantidad.getText())){
                String cod = txtIdProducto.getText();
                String descr = txtNombreProduc.getText();
                int cantid = Integer.parseInt(txtCantidad.getText());
                int stock = Integer.parseInt(txtStokDisp.getText());
                if(stock >= cantid){
                    item = item + 1;
                    modelo = (DefaultTableModel) tableSalida.getModel();

                    for(int i = 0; i<tableSalida.getRowCount(); i++){
                        if(tableSalida.getValueAt(i, 1).equals(txtNombreProduc.getText())){
                            JOptionPane.showMessageDialog(null, "El producto ya esta Registrado");
                            return;
                        }
                    }
                    ArrayList lista = new ArrayList();
                    lista.add(item);
                    lista.add(cod);
                    lista.add(descr);
                    lista.add(cantid);

                    Object[] obj = new Object[3];
                    obj[0] = lista.get(1);
                    obj[1] = lista.get(2);
                    obj[2] = lista.get(3);
                    modelo.addRow(obj);
                    tableSalida.setModel(modelo);
                    LimpiarSalida();
                    txtIdProducto.requestFocus();
                    btnEliminar.setEnabled(true);
                }else{
                    JOptionPane.showMessageDialog(null, "Stock no disponible");
                }
            }else{
                JOptionPane.showMessageDialog(null, "Ingrese la cantidad");
            }
        }
    }//GEN-LAST:event_txtCantidadKeyPressed

    private void LimpiarSalida(){
        txtIdProducto.setText("");
        txtNombreProduc.setText("");
        txtStokDisp.setText("");
        txtCantidad.setText("");
    }
    
    private void RegistrarSalida(){
        
        String cliente = txtNombreCliente.getText();
        String telefono = txtTelefono.getText();
        String correo = txtCorreo.getText();
        String factura = txtNumFactura.getText();
        String fecha = txtFecha.getText();
        
        sal.setNombre(cliente);
        sal.setTelefono(telefono);
        sal.setCorreo(correo);
        sal.setFactura(factura);
        sal.setFecha(fecha);
        salSql.registrarSalida(sal);
    }
    
    private void RegistrarDetalle(){
        
        int id = salSql.IdSalida();
        
        for (int i = 0; i < tableSalida.getRowCount(); i++) {
            String cod = tableSalida.getValueAt(i, 0).toString();
            String nombre = tableSalida.getValueAt(i, 1).toString();
            String canti = tableSalida.getValueAt(i, 2).toString();
           
            detalle.setCodiPro(cod);
            detalle.setNombre(nombre);
            detalle.setCantidad(canti);
            detalle.setId(id);
            salSql.RegistrarDetalle(detalle);
        }
    }
    
    private void ActualizarStock(){
        for (int i = 0; i < tableSalida.getRowCount(); i++) {
            String cod = tableSalida.getValueAt(i, 0).toString();
            int cant = Integer.parseInt(tableSalida.getValueAt(i, 2).toString());
            mod = modSql.BuscarProd(Integer.parseInt(cod));
            int stockActual = mod.getStock() - cant;
            salSql.ActualizarStock(stockActual, cod);
        }
    }
    
    private void LimpiarTabla(){
        modelo = (DefaultTableModel) tableSalida.getModel();
        int fila = tableSalida.getRowCount();
        for (int i = 0; i < fila; i++) {
            modelo.removeRow(0);
        }
    }
    
    private void LimpiarClienteVenta() {
        txtIdentific.setText("");
        txtNombreCliente.setText("");
        txtTelefono.setText("");
        txtCorreo.setText("");
        txtNumFactura.setText("");
        txtFecha.setText("");
    }
    
    public static String fechaActual(){

    Date fecha = new Date();
    SimpleDateFormat formato = new SimpleDateFormat("dd/MM/YYYY");
    return formato.format(fecha);
    }
    
    private void pdf(){
        try {
            int id = salSql.IdSalida();
            
            FileOutputStream archivo;
            String home = System.getProperty("user.home");
            File file = new File(home + "/Downloads/Salidas/remision" +id+".pdf");
            archivo = new FileOutputStream(file);
            Document doc = new Document();
            PdfWriter.getInstance(doc, archivo);
            doc.open();
            Image img = Image.getInstance("src/image/LogoNoi.png");
            
            Paragraph fecha = new Paragraph();
            Font letra = new Font(Font.FontFamily.TIMES_ROMAN, 10, Font.BOLD, BaseColor.BLUE);
            fecha.add(Chunk.NEWLINE);
            Date date = new Date();
            fecha.add("Remisión: "+ id + "\n" + "Fecha: " + new SimpleDateFormat("dd-MM-yyyy").format(date)+"\n\n");
            
            PdfPTable encabezado = new PdfPTable(4);
            encabezado.setWidthPercentage(100);
            encabezado.getDefaultCell().setBorder(0);
            float[] ColumnaEncabezado = new float[]{20f, 30f, 70f, 40f};
            encabezado.setWidths(ColumnaEncabezado);
            encabezado.setHorizontalAlignment(Element.ALIGN_LEFT);
            
            encabezado.addCell(img);
            
            String nit = "901251921-3";
            String nombre = "Dotaciones y Suministros Noi";
            String telefono = "6012222222";
            String direccion = "Cra 101 No 83 - 90";
            
            encabezado.addCell("");
            encabezado.addCell("Nit: " + nit + "\nNombre: " + nombre + "\nTeléfono: " + telefono + "\nDirección: " + direccion);
            encabezado.addCell(fecha);
            doc.add(encabezado);
            
            Paragraph datosCli = new Paragraph();
            datosCli.add(Chunk.NEWLINE);
            datosCli.add("Datos del Cliente" + "\n\n");
            datosCli.setAlignment(Element.ALIGN_CENTER);
            doc.add(datosCli);
            
            PdfPTable tableDatos = new PdfPTable(5);
            tableDatos.setWidthPercentage(100);
            tableDatos.getDefaultCell().setBorder(0);
            float[] ColumnaDatosCli = new float[]{20f, 45f, 20f, 35f, 20f};
            tableDatos.setWidths(ColumnaDatosCli);
            tableDatos.setHorizontalAlignment(Element.ALIGN_LEFT);
            PdfPCell cl1 = new PdfPCell(new Phrase("CC/Nit", letra));
            PdfPCell cl2 = new PdfPCell(new Phrase("Nombre", letra));
            PdfPCell cl3 = new PdfPCell(new Phrase("Teléfono", letra));
            PdfPCell cl4 = new PdfPCell(new Phrase("Correo", letra));
            PdfPCell cl5 = new PdfPCell(new Phrase("Factura", letra));
            cl1.setBorder(0);
            cl2.setBorder(0);
            cl3.setBorder(0);
            cl4.setBorder(0);
            cl5.setBorder(0);
            tableDatos.addCell(cl1);
            tableDatos.addCell(cl2);
            tableDatos.addCell(cl3);
            tableDatos.addCell(cl4);
            tableDatos.addCell(cl5);
            tableDatos.addCell(txtIdentific.getText());
            tableDatos.addCell(txtNombreCliente.getText());
            tableDatos.addCell(txtTelefono.getText());
            tableDatos.addCell(txtCorreo.getText());
            tableDatos.addCell(txtNumFactura.getText());
            
            doc.add(tableDatos);
            
            //Tabla Productos
            
            Paragraph datosPro = new Paragraph();
            datosPro.add(Chunk.NEWLINE);
            datosPro.add("Datos productos Despachados:" + "\n\n");
            datosPro.setAlignment(Element.ALIGN_CENTER);
            doc.add(datosPro);
            
            PdfPTable tableProd = new PdfPTable(3);
            tableProd.setWidthPercentage(100);
            tableProd.getDefaultCell().setBorder(0);
            float[] ColumnaDatosProd = new float[]{30f, 70f, 40f};
            tableProd.setWidths(ColumnaDatosProd);
            tableProd.setHorizontalAlignment(Element.ALIGN_LEFT);
            
            PdfPCell prod1 = new PdfPCell(new Phrase("Id Producto", letra));
            PdfPCell prod2 = new PdfPCell(new Phrase("Nombre", letra));
            PdfPCell prod3 = new PdfPCell(new Phrase("Cantidad", letra));

            prod1.setBorder(0);
            prod2.setBorder(0);
            prod3.setBorder(0);
            
            prod1.setBackgroundColor(BaseColor.CYAN);
            prod2.setBackgroundColor(BaseColor.CYAN);        
            prod3.setBackgroundColor(BaseColor.CYAN);
                    
            tableProd.addCell(prod1);
            tableProd.addCell(prod2);
            tableProd.addCell(prod3);
            
            for (int i = 0; i < tableSalida.getRowCount(); i++) {
                String idP = tableSalida.getValueAt(i, 0).toString();
                String nom = tableSalida.getValueAt(i, 1).toString();
                String cantidad = tableSalida.getValueAt(i, 2).toString();
                tableProd.addCell(idP);
                tableProd.addCell(nom);
                tableProd.addCell(cantidad);
            }
            
            doc.add(tableProd);
            
            Paragraph firma = new Paragraph();
            firma.add(Chunk.NEWLINE);
            firma.add("Firma: ____________________________________ \n\n\n");
            firma.setAlignment(Element.ALIGN_CENTER);
            doc.add(firma);
            
            doc.close();
            archivo.close();
            Desktop.getDesktop().open(file);
            
        } catch (DocumentException | IOException e) {
            System.out.println(e.toString());
        }
    }
    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnEliminar;
    private javax.swing.JButton btnNuevo;
    private javax.swing.JButton btnRtrarSalida;
    private javax.swing.JButton btnSalir;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JLabel jlb1;
    private javax.swing.JLabel jlbDespacho;
    private javax.swing.JLabel jlbStockDisp;
    private javax.swing.JLabel jlbTelefono;
    private javax.swing.JLabel jlblCantidad;
    private javax.swing.JLabel jlblCorreo;
    private javax.swing.JLabel jlblEliminar;
    private javax.swing.JLabel jlblModificar;
    private javax.swing.JLabel jlblNuevo;
    private javax.swing.JLabel jlblProducto;
    private javax.swing.JLabel jlblProveedor;
    private javax.swing.JLabel jlblSalir;
    private javax.swing.JTable tableSalida;
    private javax.swing.JTextField txtCantidad;
    private javax.swing.JTextField txtCorreo;
    private javax.swing.JTextField txtFecha;
    private javax.swing.JTextField txtIdProducto;
    private javax.swing.JTextField txtIdentific;
    private javax.swing.JTextField txtNombreCliente;
    private javax.swing.JTextField txtNombreProduc;
    private javax.swing.JTextField txtNumFactura;
    private javax.swing.JTextField txtStokDisp;
    private javax.swing.JTextField txtTelefono;
    // End of variables declaration//GEN-END:variables

    
}
