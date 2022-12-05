package capaPresentacion;

import capaDatos.hash;
import capaDatos.usuarios;
import capaLogica.SqlUsuario;
import com.sun.glass.events.KeyEvent;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import javax.swing.JOptionPane;

public class Login extends javax.swing.JFrame {

    public Login() {
        initComponents();
        setLocationRelativeTo(null);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jpnPrincipal = new javax.swing.JPanel();
        jpnFormulario = new javax.swing.JPanel();
        jlblBienvenido = new javax.swing.JLabel();
        jlblUsuario = new javax.swing.JLabel();
        txtUsuario = new javax.swing.JTextField();
        jlblPass = new javax.swing.JLabel();
        btnIniciar = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();
        jpswPass = new javax.swing.JPasswordField();
        jlblTitulo = new javax.swing.JLabel();
        jlblTitulo2 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Ingresar al Sistema");
        setResizable(false);

        jpnPrincipal.setBackground(new java.awt.Color(94, 113, 112));
        jpnPrincipal.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 95, 10), 3));

        jpnFormulario.setBackground(new java.awt.Color(94, 113, 112));

        jlblBienvenido.setBackground(new java.awt.Color(102, 102, 102));
        jlblBienvenido.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jlblBienvenido.setForeground(new java.awt.Color(255, 95, 10));
        jlblBienvenido.setText("BIENVENIDO");

        jlblUsuario.setBackground(new java.awt.Color(102, 102, 102));
        jlblUsuario.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jlblUsuario.setForeground(new java.awt.Color(255, 255, 255));
        jlblUsuario.setText("Usuario: ");

        jlblPass.setBackground(new java.awt.Color(102, 102, 102));
        jlblPass.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jlblPass.setForeground(new java.awt.Color(255, 255, 255));
        jlblPass.setText("Contraseña: ");

        btnIniciar.setBackground(new java.awt.Color(204, 204, 204));
        btnIniciar.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        btnIniciar.setText("Iniciar Sesión");
        btnIniciar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnIniciarActionPerformed(evt);
            }
        });
        btnIniciar.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                btnIniciarKeyPressed(evt);
            }
        });

        jLabel5.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/Seg.png"))); // NOI18N

        javax.swing.GroupLayout jpnFormularioLayout = new javax.swing.GroupLayout(jpnFormulario);
        jpnFormulario.setLayout(jpnFormularioLayout);
        jpnFormularioLayout.setHorizontalGroup(
            jpnFormularioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jpnFormularioLayout.createSequentialGroup()
                .addGroup(jpnFormularioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jpnFormularioLayout.createSequentialGroup()
                        .addGap(53, 53, 53)
                        .addGroup(jpnFormularioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jlblUsuario)
                            .addComponent(jlblPass)
                            .addComponent(txtUsuario)
                            .addComponent(btnIniciar, javax.swing.GroupLayout.DEFAULT_SIZE, 252, Short.MAX_VALUE)
                            .addComponent(jpswPass)))
                    .addGroup(jpnFormularioLayout.createSequentialGroup()
                        .addGap(108, 108, 108)
                        .addGroup(jpnFormularioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jlblBienvenido)
                            .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 116, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(59, Short.MAX_VALUE))
        );
        jpnFormularioLayout.setVerticalGroup(
            jpnFormularioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jpnFormularioLayout.createSequentialGroup()
                .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 103, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jlblBienvenido)
                .addGap(31, 31, 31)
                .addComponent(jlblUsuario)
                .addGap(18, 18, 18)
                .addComponent(txtUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jlblPass)
                .addGap(18, 18, 18)
                .addComponent(jpswPass, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 43, Short.MAX_VALUE)
                .addComponent(btnIniciar, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(47, 47, 47))
        );

        jlblTitulo.setBackground(new java.awt.Color(255, 255, 255));
        jlblTitulo.setFont(new java.awt.Font("Arial", 1, 24)); // NOI18N
        jlblTitulo.setForeground(new java.awt.Color(255, 95, 10));
        jlblTitulo.setText("DOTACIONES Y SUMINISTROS NOI SAS");

        jlblTitulo2.setBackground(new java.awt.Color(255, 255, 255));
        jlblTitulo2.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        jlblTitulo2.setForeground(new java.awt.Color(255, 95, 10));
        jlblTitulo2.setText("SISTEMA DE GESTION DE INVENTARIO");

        javax.swing.GroupLayout jpnPrincipalLayout = new javax.swing.GroupLayout(jpnPrincipal);
        jpnPrincipal.setLayout(jpnPrincipalLayout);
        jpnPrincipalLayout.setHorizontalGroup(
            jpnPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jpnPrincipalLayout.createSequentialGroup()
                .addGroup(jpnPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jpnPrincipalLayout.createSequentialGroup()
                        .addGap(197, 197, 197)
                        .addComponent(jlblTitulo2))
                    .addGroup(jpnPrincipalLayout.createSequentialGroup()
                        .addGap(138, 138, 138)
                        .addComponent(jlblTitulo, javax.swing.GroupLayout.PREFERRED_SIZE, 467, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jpnPrincipalLayout.createSequentialGroup()
                        .addGap(186, 186, 186)
                        .addComponent(jpnFormulario, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(132, Short.MAX_VALUE))
        );
        jpnPrincipalLayout.setVerticalGroup(
            jpnPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jpnPrincipalLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jlblTitulo)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jlblTitulo2)
                .addGap(18, 18, 18)
                .addComponent(jpnFormulario, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(40, 40, 40))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jpnPrincipal, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jpnPrincipal, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnIniciarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnIniciarActionPerformed
        
        SqlUsuario modSql = new SqlUsuario();
        usuarios mod = new usuarios();

        Date date = new Date();
        DateFormat FechaHora = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");

        String pass = new String(jpswPass.getPassword());

        if (!txtUsuario.getText().equals("") && !pass.equals("")) {

            String nuevoPass = hash.sha1(pass);

            mod.setUsuario(txtUsuario.getText());
            mod.setPassword(nuevoPass);
            mod.setLast_session(FechaHora.format(date));

            if (modSql.login(mod)) {

                Principal home = new Principal(mod);
                dispose();
                home.setVisible(true);

            } else {
                JOptionPane.showMessageDialog(null, "Datos Incorrectos");
            }
        } else {
            JOptionPane.showMessageDialog(null, "Debe ingresar sus datos");
        }
    }//GEN-LAST:event_btnIniciarActionPerformed

    private void btnIniciarKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_btnIniciarKeyPressed
        
        if(evt.getKeyCode() == KeyEvent.VK_ENTER ){
            SqlUsuario modSql = new SqlUsuario();
        usuarios mod = new usuarios();

        Date date = new Date();
        DateFormat FechaHora = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");

        String pass = new String(jpswPass.getPassword());

        if (!txtUsuario.getText().equals("") && !pass.equals("")) {

            String nuevoPass = hash.sha1(pass);

            mod.setUsuario(txtUsuario.getText());
            mod.setPassword(nuevoPass);
            mod.setLast_session(FechaHora.format(date));

            if (modSql.login(mod)) {

                Principal home = new Principal(mod);
                dispose();
                home.setVisible(true);

            } else {
                JOptionPane.showMessageDialog(null, "Datos Incorrectos");
            }
        } else {
            JOptionPane.showMessageDialog(null, "Debe ingresar sus datos");
        }
        }
    }//GEN-LAST:event_btnIniciarKeyPressed

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
            @Override
            public void run() {
                new Login().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnIniciar;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jlblBienvenido;
    private javax.swing.JLabel jlblPass;
    private javax.swing.JLabel jlblTitulo;
    private javax.swing.JLabel jlblTitulo2;
    private javax.swing.JLabel jlblUsuario;
    private javax.swing.JPanel jpnFormulario;
    private javax.swing.JPanel jpnPrincipal;
    private javax.swing.JPasswordField jpswPass;
    private javax.swing.JTextField txtUsuario;
    // End of variables declaration//GEN-END:variables
}
