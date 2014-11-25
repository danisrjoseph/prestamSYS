/*
 class AutentificarForm para manejar la presentacion de la pantalla de inicio 
 Author: DANIS
*/

package vista;

import dominio.AutUsuario;
import com.sun.glass.events.KeyEvent;
import data.RegistroDA;
import java.awt.Image;
import java.awt.Toolkit;

public class AutentificarForm extends javax.swing.JFrame {

    public AutentificarForm() {
        RegistroDA.crearDB();
        initComponents();
        setLocationRelativeTo(null);
    }
    
     @Override
    public Image getIconImage() {
        Image getValue = Toolkit.getDefaultToolkit().getImage(ClassLoader.getSystemResource("recursos/logoInicio.png"));
        return getValue;
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        lbUsuario = new javax.swing.JLabel();
        lbContrasena = new javax.swing.JLabel();
        txtUsuario = new javax.swing.JTextField();
        txtContrasena = new javax.swing.JPasswordField();
        cbEmpleado = new javax.swing.JComboBox();
        lbLogo = new javax.swing.JLabel();
        jsSeparador = new javax.swing.JSeparator();
        lbEslogan = new javax.swing.JLabel();
        btnEntrar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Autentificar");
        setIconImage(getIconImage());
        setMaximumSize(new java.awt.Dimension(500, 300));
        setMinimumSize(new java.awt.Dimension(500, 300));
        setPreferredSize(new java.awt.Dimension(500, 300));
        setResizable(false);

        lbUsuario.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        lbUsuario.setText("Usuario");

        lbContrasena.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        lbContrasena.setText("Contraseña");

        txtUsuario.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtUsuarioKeyTyped(evt);
            }
        });

        txtContrasena.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtContrasenaKeyTyped(evt);
            }
        });

        cbEmpleado.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        cbEmpleado.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Agente", "Ejecutivo" }));
        cbEmpleado.setToolTipText("Pulsa para elegir el tipo de usuario.");
        cbEmpleado.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        cbEmpleado.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                cbEmpleadoKeyTyped(evt);
            }
        });

        lbLogo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/recursos/fondoAutForm.png"))); // NOI18N

        jsSeparador.setOrientation(javax.swing.SwingConstants.VERTICAL);

        lbEslogan.setFont(new java.awt.Font("Lucida Handwriting", 1, 15)); // NOI18N
        lbEslogan.setForeground(new java.awt.Color(75, 87, 113));
        lbEslogan.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lbEslogan.setText("<html><center>El Sistema<br />que Gestiona<br /> tu Financiera</center></html");

        btnEntrar.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        btnEntrar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/recursos/entrar.png"))); // NOI18N
        btnEntrar.setToolTipText("Pulsar para validar sus datos y entrar al sistema");
        btnEntrar.setBorderPainted(false);
        btnEntrar.setContentAreaFilled(false);
        btnEntrar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnEntrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEntrarActionPerformed(evt);
            }
        });
        btnEntrar.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                btnEntrarKeyTyped(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(10, 10, 10)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnEntrar, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 74, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lbLogo, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lbEslogan, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(10, 10, 10)
                        .addComponent(jsSeparador, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(lbUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(10, 10, 10)
                                .addComponent(txtUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(lbContrasena, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(10, 10, 10)
                                .addComponent(txtContrasena, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(100, 100, 100)
                                .addComponent(cbEmpleado, javax.swing.GroupLayout.PREFERRED_SIZE, 94, javax.swing.GroupLayout.PREFERRED_SIZE))))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(10, 10, 10)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(lbLogo, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(40, 40, 40)
                        .addComponent(lbEslogan, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jsSeparador, javax.swing.GroupLayout.PREFERRED_SIZE, 250, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(40, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addGap(60, 60, 60)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lbUsuario)
                    .addComponent(txtUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(20, 20, 20)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lbContrasena, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtContrasena, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(20, 20, 20)
                .addComponent(cbEmpleado, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btnEntrar)
                .addGap(53, 53, 53))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents
    // metodo para validar al presionar la tecla ENTER
    private void txtUsuarioKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtUsuarioKeyTyped
        //se asegura de capturar la tecla ENTER, y descarta las otras 
        char cTeclaPresionada = evt.getKeyChar();
        //da clic al bonton de entrar al detectar la tecla Enter
        if (cTeclaPresionada == KeyEvent.VK_ENTER) {
            //ejecuta el boton de aceptar (dar clic)
            btnEntrar.doClick();
        }//terminar if        
    }//GEN-LAST:event_txtUsuarioKeyTyped
    // metodo para validar al presionar la tecla ENTER
    private void txtContrasenaKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtContrasenaKeyTyped
        //se asegura de capturar la tecla ENTER, y descarta las otras 
        char cTeclaPresionada = evt.getKeyChar();
        //da clic al bonton de entrar al detectar la tecla Enter
        if (cTeclaPresionada == KeyEvent.VK_ENTER) {
            //ejecuta el boton de aceptar (dar clic)
            btnEntrar.doClick();
        }//terminar if
    }//GEN-LAST:event_txtContrasenaKeyTyped
    // metodo para validar al presionar la tecla ENTER
    private void cbEmpleadoKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_cbEmpleadoKeyTyped
        //se asegura de capturar la tecla ENTER, y descarta las otras 
        char cTeclaPresionada = evt.getKeyChar();
        //da clic al bonton de entrar al detectar la tecla Enter
        if (cTeclaPresionada == KeyEvent.VK_ENTER) {
            //ejecuta el boton de aceptar (dar clic)
            btnEntrar.doClick();
        }//terminar if
    }//GEN-LAST:event_cbEmpleadoKeyTyped

    private void btnEntrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEntrarActionPerformed
        if (validarTeclas(txtUsuario.getText(), txtContrasena.getText())) {
            String idUsuarioActual = AutUsuario.obtenerAcceso(
                    txtUsuario.getText(),
                    txtContrasena.getText(),
                    cbEmpleado.getSelectedItem());
            if (idUsuarioActual.equals("")) {
                idUsuarioActual = "undefined";
            }
            if (idUsuarioActual.equals("undefined")) {
                javax.swing.JOptionPane.showMessageDialog(null,
                        "Usuario y/o Contraseña incorrecto! ",
                        "Error",
                        javax.swing.JOptionPane.ERROR_MESSAGE);
            } else {
                this.setVisible(false);
                javax.swing.JOptionPane.showMessageDialog(null, "Datos de logueo: " + String.valueOf(cbEmpleado.getSelectedItem()) +", ID "+ idUsuarioActual);
                Main main = new Main();
                main.setVisible(true);
                main.limpiarEscritorio();
                main.setUsuarioLogueado(cbEmpleado.getSelectedItem(), idUsuarioActual);
            }
        } else {
            javax.swing.JOptionPane.showMessageDialog(null,
                    "Ingrese un dato Numérico en \'Usuario\' y su Contraseña! ",
                    "Error",
                    javax.swing.JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_btnEntrarActionPerformed
    // metodo para validar al presionar la tecla ENTER
    private void btnEntrarKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_btnEntrarKeyTyped
        //se asegura de capturar la tecla ENTER, y descarta las otras 
        char cTeclaPresionada = evt.getKeyChar();
        //da clic al bonton de entrar al detectar la tecla Enter
        if (cTeclaPresionada == KeyEvent.VK_ENTER) {
            //ejecuta el boton de aceptar (dar clic)
            btnEntrar.doClick();
        }//terminar if
    }//GEN-LAST:event_btnEntrarKeyTyped

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnEntrar;
    private javax.swing.JComboBox cbEmpleado;
    private javax.swing.JSeparator jsSeparador;
    private javax.swing.JLabel lbContrasena;
    private javax.swing.JLabel lbEslogan;
    private javax.swing.JLabel lbLogo;
    private javax.swing.JLabel lbUsuario;
    private javax.swing.JPasswordField txtContrasena;
    private javax.swing.JTextField txtUsuario;
    // End of variables declaration//GEN-END:variables

    private boolean validarTeclas(String user, String pass) {
        if (user.equals("") || pass.equals("")) {
            return false;
        } else {
            try {
                Integer.parseInt(user);
                return true;
            } catch (NumberFormatException nfe) {
                return false;
            }
        }
    }

}
