package capaPresentacion;

import Reportes.ReportProductos;
import capaDatos.Salida;
import capaLogica.Conexion;
import capaLogica.SqlSalida;
import java.awt.Desktop;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import org.apache.poi.ss.usermodel.BorderStyle;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.CellStyle;
import org.apache.poi.ss.usermodel.FillPatternType;
import org.apache.poi.ss.usermodel.Font;
import org.apache.poi.ss.usermodel.HorizontalAlignment;
import org.apache.poi.ss.usermodel.IndexedColors;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.VerticalAlignment;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.util.CellRangeAddress;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ReporteSalidas extends javax.swing.JInternalFrame {

    SqlSalida sqlSalida = new SqlSalida();
    DefaultTableModel modelo = new DefaultTableModel();
    
    public ReporteSalidas() {
        initComponents();
        listarSalidas();
        jlbIdSalida.setVisible(false);
    }

    private void listarSalidas() {
  
        List<Salida> listarSaida = sqlSalida.listarSalidas();
        modelo = (DefaultTableModel) tableSalidas.getModel();
        Object[] obj = new Object[4];
        
        for (int i = 0; i < listarSaida.size(); i++) {
            obj[0] = listarSaida.get(i).getIdSalida();
            obj[1] = listarSaida.get(i).getNombre();
            obj[2] = listarSaida.get(i).getFactura();
            obj[3] = listarSaida.get(i).getFecha();
            
            modelo.addRow(obj);
        }
        tableSalidas.setModel(modelo);
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tableSalidas = new javax.swing.JTable();
        btnSalir = new javax.swing.JButton();
        jlblSalir = new javax.swing.JLabel();
        jlbIdSalida = new javax.swing.JLabel();
        btnRemisionPdf = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        btnReporteExcel = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();

        setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 95, 10), 3));

        jPanel1.setBackground(new java.awt.Color(221, 229, 226));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("SALIDAS GENERADAS");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 10, 220, 20));

        tableSalidas.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Remisión", "Cliente", "No Factura", "Fecha"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tableSalidas.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tableSalidasMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tableSalidas);
        if (tableSalidas.getColumnModel().getColumnCount() > 0) {
            tableSalidas.getColumnModel().getColumn(0).setResizable(false);
            tableSalidas.getColumnModel().getColumn(1).setResizable(false);
            tableSalidas.getColumnModel().getColumn(2).setResizable(false);
            tableSalidas.getColumnModel().getColumn(3).setResizable(false);
        }

        jPanel1.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 60, 620, 280));

        btnSalir.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/Salir.png"))); // NOI18N
        btnSalir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSalirActionPerformed(evt);
            }
        });
        jPanel1.add(btnSalir, new org.netbeans.lib.awtextra.AbsoluteConstraints(650, 360, 60, 50));

        jlblSalir.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jlblSalir.setText("Cerrar");
        jPanel1.add(jlblSalir, new org.netbeans.lib.awtextra.AbsoluteConstraints(650, 410, 60, 20));
        jPanel1.add(jlbIdSalida, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 20, 50, 30));

        btnRemisionPdf.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/PDF2.png"))); // NOI18N
        btnRemisionPdf.setBorder(null);
        btnRemisionPdf.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRemisionPdfActionPerformed(evt);
            }
        });
        jPanel1.add(btnRemisionPdf, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 360, 60, 50));

        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("Ver Remisión");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 410, 80, -1));

        btnReporteExcel.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/Excel2.png"))); // NOI18N
        btnReporteExcel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnReporteExcelActionPerformed(evt);
            }
        });
        jPanel1.add(btnReporteExcel, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 360, 60, 50));

        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel3.setText("Reporte Excel");
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 410, 80, -1));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 808, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 573, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnSalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSalirActionPerformed
        this.dispose();
    }//GEN-LAST:event_btnSalirActionPerformed

    private void tableSalidasMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tableSalidasMouseClicked
        int fila = tableSalidas.rowAtPoint(evt.getPoint());
        jlbIdSalida.setText(tableSalidas.getValueAt(fila, 0).toString());
    }//GEN-LAST:event_tableSalidasMouseClicked

    private void btnRemisionPdfActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRemisionPdfActionPerformed
        
        if(jlbIdSalida.getText().equals("")){
            JOptionPane.showMessageDialog(null, "Seleccione la remisión que quiere abrir!!");
        }else{
            try {
                int id = Integer.parseInt(jlbIdSalida.getText());
                String home = System.getProperty("user.home");
                File file = new File(home + "/Downloads/Salidas/remision" +id+".pdf");
                Desktop.getDesktop().open(file);
            } catch (IOException | NumberFormatException e) {
                System.out.println(e.toString());
            }
        }
    }//GEN-LAST:event_btnRemisionPdfActionPerformed

    private void btnReporteExcelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnReporteExcelActionPerformed
        reporte();
    }//GEN-LAST:event_btnReporteExcelActionPerformed

    public static void reporte() {
 
        Workbook book = new XSSFWorkbook();
        Sheet sheet = book.createSheet("Productos");
 
        try {
 
            CellStyle tituloEstilo = book.createCellStyle();
            tituloEstilo.setAlignment(HorizontalAlignment.CENTER);
            tituloEstilo.setVerticalAlignment(VerticalAlignment.CENTER);
            Font fuenteTitulo = book.createFont();
            fuenteTitulo.setFontName("Arial");
            fuenteTitulo.setBold(true);
            fuenteTitulo.setFontHeightInPoints((short) 14);
            tituloEstilo.setFont(fuenteTitulo);
 
            Row filaTitulo = sheet.createRow(1);
            Cell celdaTitulo = filaTitulo.createCell(1);
            celdaTitulo.setCellStyle(tituloEstilo);
            celdaTitulo.setCellValue("Reporte Salidas");
 
            sheet.addMergedRegion(new CellRangeAddress(1, 2, 1, 3));
 
            String[] cabecera = new String[]{"Remision", "Cliente", "No Factura", "Fecha"};
 
            CellStyle headerStyle = book.createCellStyle();
            headerStyle.setFillForegroundColor(IndexedColors.LIGHT_BLUE.getIndex());
            headerStyle.setFillPattern(FillPatternType.SOLID_FOREGROUND);
            headerStyle.setBorderBottom(BorderStyle.THIN);
            headerStyle.setBorderLeft(BorderStyle.THIN);
            headerStyle.setBorderRight(BorderStyle.THIN);
            headerStyle.setBorderBottom(BorderStyle.THIN);
 
            Font font = book.createFont();
            font.setFontName("Arial");
            font.setBold(true);
            font.setColor(IndexedColors.WHITE.getIndex());
            font.setFontHeightInPoints((short) 12);
            headerStyle.setFont(font);
 
            Row filaEncabezados = sheet.createRow(4);
 
            for (int i = 0; i < cabecera.length; i++) {
                Cell celdaEnzabezado = filaEncabezados.createCell(i);
                celdaEnzabezado.setCellStyle(headerStyle);
                celdaEnzabezado.setCellValue(cabecera[i]);
            }
 
            Conexion con = new Conexion();
            PreparedStatement ps;
            ResultSet rs;
            Connection conn = con.getConexion();
 
            int numFilaDatos = 5;
 
            CellStyle datosEstilo = book.createCellStyle();
            datosEstilo.setBorderBottom(BorderStyle.THIN);
            datosEstilo.setBorderLeft(BorderStyle.THIN);
            datosEstilo.setBorderRight(BorderStyle.THIN);
            datosEstilo.setBorderBottom(BorderStyle.THIN);
 
            ps = conn.prepareStatement("SELECT idsalida, nomcliente, num_factura, fecha FROM salida");
            rs = ps.executeQuery();
 
            int numCol = rs.getMetaData().getColumnCount();
 
            while (rs.next()) {
                Row filaDatos = sheet.createRow(numFilaDatos);
 
                for (int a = 0; a < numCol; a++) {
 
                    Cell CeldaDatos = filaDatos.createCell(a);
                    CeldaDatos.setCellStyle(datosEstilo);
                    CeldaDatos.setCellValue(rs.getString(a + 1));
                }
 
 
                numFilaDatos++;
            }
            sheet.autoSizeColumn(0);
            sheet.autoSizeColumn(1);
            sheet.autoSizeColumn(2);
            sheet.autoSizeColumn(3);
            sheet.autoSizeColumn(4);
            
            sheet.setZoom(150);
            String fileName = "Reporte Remisiones Generadas";
            String home = System.getProperty("user.home");
            File file = new File(home + "/Downloads/Reportes/" + fileName + ".xlsx");
            FileOutputStream fileOut = new FileOutputStream(file);
            book.write(fileOut);
            fileOut.close();
            Desktop.getDesktop().open(file);
            JOptionPane.showMessageDialog(null, "Reporte Generado");
 
        } catch (FileNotFoundException ex) {
            Logger.getLogger(ReportProductos.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IOException | SQLException ex) {
            Logger.getLogger(ReportProductos.class.getName()).log(Level.SEVERE, null, ex);
        }
 
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnRemisionPdf;
    private javax.swing.JButton btnReporteExcel;
    private javax.swing.JButton btnSalir;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel jlbIdSalida;
    private javax.swing.JLabel jlblSalir;
    private javax.swing.JTable tableSalidas;
    // End of variables declaration//GEN-END:variables
}
