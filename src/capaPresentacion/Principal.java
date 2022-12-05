package capaPresentacion;

import capaDatos.usuarios;

public class Principal extends javax.swing.JFrame {
    
    //private static final int CODIGO_SALIDA_SATISFACTORIA = 0;
    usuarios mod;

    public Principal() {
        initComponents();
        setLocationRelativeTo(null);
   
        Salidas exit = new Salidas();
        escritorio.add(exit);
        exit.show();
        
    }

    public Principal(usuarios mod) {
        this.mod = mod;
        initComponents();
        setLocationRelativeTo(null);
        this.mod = mod;

        lblNombre.setText("Bienvenid@ : " + mod.getNombre());

        if (mod.getId_tipo() == 1) {
            btnSalidas.setEnabled(false);
            ReporteSalidas repor = new ReporteSalidas();
            escritorio.add(repor);
            repor.show();
        } else if (mod.getId_tipo() == 2) {
            mniCrearUsuario.setVisible(false);
            Salidas exit = new Salidas();
            escritorio.add(exit);
            exit.show();
        }
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jpnlPrincipal = new javax.swing.JPanel();
        escritorio = new javax.swing.JDesktopPane();
        jpnlEscritorio = new javax.swing.JPanel();
        jlblTitulo = new javax.swing.JLabel();
        jlblSub = new javax.swing.JLabel();
        btnClientes = new javax.swing.JButton();
        btnProveedores = new javax.swing.JButton();
        btnProductos = new javax.swing.JButton();
        btnSalidas = new javax.swing.JButton();
        lblNombre = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        mniCrearUsuario = new javax.swing.JMenuItem();
        mniSalir = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Sistema de Gestión de Inventario");
        setIconImages(null);
        setResizable(false);

        jpnlPrincipal.setBackground(new java.awt.Color(94, 113, 112));
        jpnlPrincipal.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 95, 10), 3));
        jpnlPrincipal.setForeground(new java.awt.Color(255, 255, 255));
        jpnlPrincipal.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        escritorio.setBackground(new java.awt.Color(255, 255, 255));
        escritorio.setForeground(new java.awt.Color(0, 0, 0));
        escritorio.setPreferredSize(new java.awt.Dimension(810, 520));

        jpnlEscritorio.setBackground(new java.awt.Color(94, 113, 112));
        jpnlEscritorio.setPreferredSize(new java.awt.Dimension(740, 530));

        javax.swing.GroupLayout jpnlEscritorioLayout = new javax.swing.GroupLayout(jpnlEscritorio);
        jpnlEscritorio.setLayout(jpnlEscritorioLayout);
        jpnlEscritorioLayout.setHorizontalGroup(
            jpnlEscritorioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 808, Short.MAX_VALUE)
        );
        jpnlEscritorioLayout.setVerticalGroup(
            jpnlEscritorioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 520, Short.MAX_VALUE)
        );

        escritorio.setLayer(jpnlEscritorio, javax.swing.JLayeredPane.DEFAULT_LAYER);

        javax.swing.GroupLayout escritorioLayout = new javax.swing.GroupLayout(escritorio);
        escritorio.setLayout(escritorioLayout);
        escritorioLayout.setHorizontalGroup(
            escritorioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(escritorioLayout.createSequentialGroup()
                .addComponent(jpnlEscritorio, javax.swing.GroupLayout.PREFERRED_SIZE, 808, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        escritorioLayout.setVerticalGroup(
            escritorioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jpnlEscritorio, javax.swing.GroupLayout.DEFAULT_SIZE, 520, Short.MAX_VALUE)
        );

        jpnlPrincipal.add(escritorio, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 110, 800, 520));

        jlblTitulo.setFont(new java.awt.Font("Tahoma", 1, 20)); // NOI18N
        jlblTitulo.setForeground(new java.awt.Color(255, 95, 10));
        jlblTitulo.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jlblTitulo.setText("SISTEMA DE GESTION DE INVENTARIO");
        jlblTitulo.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jpnlPrincipal.add(jlblTitulo, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 10, 410, 30));

        jlblSub.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jlblSub.setForeground(new java.awt.Color(255, 95, 10));
        jlblSub.setText("DOTACIONES Y SUMINISTROS NOI SAS");
        jpnlPrincipal.add(jlblSub, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 40, -1, -1));

        btnClientes.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        btnClientes.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/Cliente.png"))); // NOI18N
        btnClientes.setText("CLIENTES");
        btnClientes.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 95, 10), 3));
        btnClientes.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnClientesActionPerformed(evt);
            }
        });
        jpnlPrincipal.add(btnClientes, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 140, 220, 80));

        btnProveedores.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        btnProveedores.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/Provee.png"))); // NOI18N
        btnProveedores.setText("PROVEEDORES");
        btnProveedores.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 95, 10), 3));
        btnProveedores.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnProveedoresActionPerformed(evt);
            }
        });
        jpnlPrincipal.add(btnProveedores, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 240, 220, -1));

        btnProductos.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        btnProductos.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/Produc.png"))); // NOI18N
        btnProductos.setText("  PRODUCTOS");
        btnProductos.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 95, 10), 3));
        btnProductos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnProductosActionPerformed(evt);
            }
        });
        jpnlPrincipal.add(btnProductos, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 340, 220, 80));

        btnSalidas.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        btnSalidas.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/Salir2.png"))); // NOI18N
        btnSalidas.setText("GENERAR SALIDA");
        btnSalidas.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 95, 10), 3));
        btnSalidas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSalidasActionPerformed(evt);
            }
        });
        jpnlPrincipal.add(btnSalidas, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 440, 220, 80));

        lblNombre.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        lblNombre.setForeground(new java.awt.Color(255, 255, 255));
        lblNombre.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jpnlPrincipal.add(lblNombre, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 70, 360, 20));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/LogoNoi.png"))); // NOI18N
        jpnlPrincipal.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 10, 130, 110));

        jButton1.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/ReportSalida_1.png"))); // NOI18N
        jButton1.setText("REPORTE SALIDAS");
        jButton1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 95, 10), 3));
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jpnlPrincipal.add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 540, 220, 80));

        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Elaborado por: Oscar Fuentes");
        jpnlPrincipal.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 660, 190, -1));

        jMenu1.setText("Archivo");

        mniCrearUsuario.setText("Crear Usuario");
        mniCrearUsuario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mniCrearUsuarioActionPerformed(evt);
            }
        });
        jMenu1.add(mniCrearUsuario);

        mniSalir.setText("Salir");
        mniSalir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mniSalirActionPerformed(evt);
            }
        });
        jMenu1.add(mniSalir);

        jMenuBar1.add(jMenu1);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jpnlPrincipal, javax.swing.GroupLayout.PREFERRED_SIZE, 1106, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jpnlPrincipal, javax.swing.GroupLayout.PREFERRED_SIZE, 680, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnSalidasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSalidasActionPerformed

        Salidas exit = new Salidas();
        escritorio.add(exit);
        exit.show();
        
    }//GEN-LAST:event_btnSalidasActionPerformed

    private void btnClientesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnClientesActionPerformed
        
        Clientes newCliente = new Clientes();
        escritorio.add(newCliente);
        newCliente.show();
    }//GEN-LAST:event_btnClientesActionPerformed

    private void btnProveedoresActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnProveedoresActionPerformed
        Proveedores newProveedor = new Proveedores();
        escritorio.add(newProveedor);
        newProveedor.show();
    }//GEN-LAST:event_btnProveedoresActionPerformed

    private void btnProductosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnProductosActionPerformed
        
        Productos newProducto = new Productos();
        escritorio.add(newProducto);
        newProducto.show();
    }//GEN-LAST:event_btnProductosActionPerformed

    private void mniCrearUsuarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mniCrearUsuarioActionPerformed
        CrearUsuario usuario = new CrearUsuario();
        escritorio.add(usuario);
        usuario.show();
    }//GEN-LAST:event_mniCrearUsuarioActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        ReporteSalidas newRepor = new ReporteSalidas();
        escritorio.add(newRepor);
        newRepor.show();
    }//GEN-LAST:event_jButton1ActionPerformed

    private void mniSalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mniSalirActionPerformed
        this.dispose();
    }//GEN-LAST:event_mniSalirActionPerformed

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
                if ("Windows".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Principal().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    public javax.swing.JButton btnClientes;
    private javax.swing.JButton btnProductos;
    private javax.swing.JButton btnProveedores;
    private javax.swing.JButton btnSalidas;
    private javax.swing.JDesktopPane escritorio;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JLabel jlblSub;
    private javax.swing.JLabel jlblTitulo;
    private javax.swing.JPanel jpnlEscritorio;
    private javax.swing.JPanel jpnlPrincipal;
    private javax.swing.JLabel lblNombre;
    private javax.swing.JMenuItem mniCrearUsuario;
    private javax.swing.JMenuItem mniSalir;
    // End of variables declaration//GEN-END:variables
}
