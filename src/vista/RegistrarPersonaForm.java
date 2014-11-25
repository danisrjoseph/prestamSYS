
package vista;

import dominio.RegistrarPersona;
import javax.swing.*;
import java.awt.*;
import java.text.ParseException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.text.*;

public class RegistrarPersonaForm extends javax.swing.JInternalFrame {

    public RegistrarPersonaForm() {
        initComponents();
        limpiarPanelFormulario();
    } 
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jSeparator1 = new javax.swing.JSeparator();
        lbFormulario = new javax.swing.JLabel();
        jSeparator2 = new javax.swing.JSeparator();
        panelTipoPersona = new javax.swing.JPanel();
        btnCliente = new javax.swing.JButton();
        btnGarante = new javax.swing.JButton();
        btnAgente = new javax.swing.JButton();
        btnEjecutivo = new javax.swing.JButton();
        panelFormulario = new javax.swing.JPanel();
        panelEjecutivo = new javax.swing.JPanel();
        jLabel25 = new javax.swing.JLabel();
        jSeparator7 = new javax.swing.JSeparator();
        jLabel26 = new javax.swing.JLabel();
        jLabel27 = new javax.swing.JLabel();
        jLabel28 = new javax.swing.JLabel();
        jLabel29 = new javax.swing.JLabel();
        jLabel30 = new javax.swing.JLabel();
        jLabel31 = new javax.swing.JLabel();
        btnCancelarPanelEjecutivo = new javax.swing.JButton();
        btnEnviarPanelEjecutivo = new javax.swing.JButton();
        txtDireccionEjecutivo = new javax.swing.JTextField();
        txtApellidoEjecutivo = new javax.swing.JTextField();
        txtNombreEjecutivo = new javax.swing.JTextField();
        jLabel32 = new javax.swing.JLabel();
        txtSalarioEjecutivo = new javax.swing.JTextField();
        jLabel33 = new javax.swing.JLabel();
        txtCargoEjecutivo = new javax.swing.JTextField();
        txtPasswordEjecutivo = new javax.swing.JPasswordField();
        txtCedulaEjecutivo = new javax.swing.JFormattedTextField();
        txtTelefonoEjecutivo = new javax.swing.JFormattedTextField();
        panelAgente = new javax.swing.JPanel();
        jLabel34 = new javax.swing.JLabel();
        jSeparator8 = new javax.swing.JSeparator();
        jLabel35 = new javax.swing.JLabel();
        jLabel36 = new javax.swing.JLabel();
        jLabel37 = new javax.swing.JLabel();
        jLabel38 = new javax.swing.JLabel();
        jLabel39 = new javax.swing.JLabel();
        jLabel40 = new javax.swing.JLabel();
        jLabel41 = new javax.swing.JLabel();
        jLabel42 = new javax.swing.JLabel();
        btnCancelarPanelAgente = new javax.swing.JButton();
        btnEnviarPanelAgente = new javax.swing.JButton();
        txtSalarioAgente = new javax.swing.JTextField();
        txtDireccionAgente = new javax.swing.JTextField();
        txtApellidoAgente = new javax.swing.JTextField();
        txtNombreAgente = new javax.swing.JTextField();
        txtPasswordAgente = new javax.swing.JPasswordField();
        txtCedulaAgente = new javax.swing.JFormattedTextField();
        txtTelefonoAgente = new javax.swing.JFormattedTextField();
        txtHorarioAgente = new javax.swing.JFormattedTextField();
        panelGarante = new javax.swing.JPanel();
        jLabel11 = new javax.swing.JLabel();
        jSeparator5 = new javax.swing.JSeparator();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();
        btnCancelarPanelGarante = new javax.swing.JButton();
        btnEnviarPanelGarante = new javax.swing.JButton();
        txtIngresosGarante = new javax.swing.JTextField();
        txtDireccionGarante = new javax.swing.JTextField();
        txtApellidoGarante = new javax.swing.JTextField();
        txtNombreGarante = new javax.swing.JTextField();
        txtCedulaGarante = new javax.swing.JFormattedTextField();
        txtTelefonoGarante = new javax.swing.JFormattedTextField();
        panelCliente = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jSeparator4 = new javax.swing.JSeparator();
        jLabel5 = new javax.swing.JLabel();
        txtNombreCliente = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        txtApellidoCliente = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        txtDireccionCliente = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        txtIngresosCliente = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        btnEnviarPanelCliente = new javax.swing.JButton();
        btnCancelarPanelCliente = new javax.swing.JButton();
        txtCedulaCliente = new javax.swing.JFormattedTextField();
        txtTelefonoCliente = new javax.swing.JFormattedTextField();
        jLabel1 = new javax.swing.JLabel();

        setTitle("Registrar Personas");
        setMaximumSize(new java.awt.Dimension(997, 563));
        setMinimumSize(new java.awt.Dimension(997, 563));
        setPreferredSize(new java.awt.Dimension(997, 563));

        jSeparator1.setOrientation(javax.swing.SwingConstants.VERTICAL);

        lbFormulario.setFont(new java.awt.Font("Tahoma", 0, 20)); // NOI18N
        lbFormulario.setText("Formulario de Registro de personas");

        panelTipoPersona.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Tipo de Persona", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 1, 14))); // NOI18N

        btnCliente.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        btnCliente.setIcon(new javax.swing.ImageIcon(getClass().getResource("/recursos/cliente.png"))); // NOI18N
        btnCliente.setText("Cliente");
        btnCliente.setToolTipText("Registrar Nuevo Cliente");
        btnCliente.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        btnCliente.setBorderPainted(false);
        btnCliente.setContentAreaFilled(false);
        btnCliente.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnCliente.setFocusPainted(false);
        btnCliente.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnClienteMouseClicked(evt);
            }
        });

        btnGarante.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        btnGarante.setIcon(new javax.swing.ImageIcon(getClass().getResource("/recursos/garante.png"))); // NOI18N
        btnGarante.setText("Garante");
        btnGarante.setToolTipText("Registrar Nuevo Garante");
        btnGarante.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        btnGarante.setBorderPainted(false);
        btnGarante.setContentAreaFilled(false);
        btnGarante.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnGarante.setFocusPainted(false);
        btnGarante.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnGaranteMouseClicked(evt);
            }
        });

        btnAgente.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        btnAgente.setIcon(new javax.swing.ImageIcon(getClass().getResource("/recursos/agente.png"))); // NOI18N
        btnAgente.setText("Agente");
        btnAgente.setToolTipText("Registrar Nuevo Agente");
        btnAgente.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        btnAgente.setBorderPainted(false);
        btnAgente.setContentAreaFilled(false);
        btnAgente.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnAgente.setFocusPainted(false);
        btnAgente.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnAgenteMouseClicked(evt);
            }
        });

        btnEjecutivo.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        btnEjecutivo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/recursos/ejecutivo.png"))); // NOI18N
        btnEjecutivo.setText("Ejecutivo");
        btnEjecutivo.setToolTipText("Registrar Nuevo Ejecutivo");
        btnEjecutivo.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        btnEjecutivo.setBorderPainted(false);
        btnEjecutivo.setContentAreaFilled(false);
        btnEjecutivo.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnEjecutivo.setFocusPainted(false);
        btnEjecutivo.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnEjecutivoMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout panelTipoPersonaLayout = new javax.swing.GroupLayout(panelTipoPersona);
        panelTipoPersona.setLayout(panelTipoPersonaLayout);
        panelTipoPersonaLayout.setHorizontalGroup(
            panelTipoPersonaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelTipoPersonaLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(panelTipoPersonaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnCliente, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnGarante, javax.swing.GroupLayout.DEFAULT_SIZE, 198, Short.MAX_VALUE)
                    .addComponent(btnAgente, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnEjecutivo, javax.swing.GroupLayout.DEFAULT_SIZE, 198, Short.MAX_VALUE))
                .addContainerGap())
        );
        panelTipoPersonaLayout.setVerticalGroup(
            panelTipoPersonaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelTipoPersonaLayout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addComponent(btnCliente)
                .addGap(18, 18, 18)
                .addComponent(btnGarante)
                .addGap(18, 18, 18)
                .addComponent(btnAgente)
                .addGap(18, 18, 18)
                .addComponent(btnEjecutivo)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        panelFormulario.setBackground(new java.awt.Color(228, 201, 255));
        panelFormulario.setMaximumSize(new java.awt.Dimension(675, 406));
        panelFormulario.setMinimumSize(new java.awt.Dimension(675, 406));
        panelFormulario.setPreferredSize(new java.awt.Dimension(675, 406));
        panelFormulario.setLayout(null);

        panelEjecutivo.setBackground(new java.awt.Color(203, 233, 215));

        jLabel25.setFont(new java.awt.Font("Tahoma", 0, 20)); // NOI18N
        jLabel25.setText("Nuevo Ejecutivo");

        jLabel26.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel26.setText("Nombres");

        jLabel27.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel27.setText("Apellidos");

        jLabel28.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel28.setText("Cédula #");

        jLabel29.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel29.setText("Dirección");

        jLabel30.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel30.setText("Teléfono");

        jLabel31.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel31.setText("Contraseña");

        btnCancelarPanelEjecutivo.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        btnCancelarPanelEjecutivo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/recursos/cancelar.png"))); // NOI18N
        btnCancelarPanelEjecutivo.setToolTipText("Borrar Campos");
        btnCancelarPanelEjecutivo.setBorderPainted(false);
        btnCancelarPanelEjecutivo.setContentAreaFilled(false);
        btnCancelarPanelEjecutivo.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnCancelarPanelEjecutivo.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnCancelarPanelEjecutivoMouseClicked(evt);
            }
        });

        btnEnviarPanelEjecutivo.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        btnEnviarPanelEjecutivo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/recursos/guardar.png"))); // NOI18N
        btnEnviarPanelEjecutivo.setToolTipText("Guardar Ejecutivo");
        btnEnviarPanelEjecutivo.setBorderPainted(false);
        btnEnviarPanelEjecutivo.setContentAreaFilled(false);
        btnEnviarPanelEjecutivo.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnEnviarPanelEjecutivo.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnEnviarPanelEjecutivoMouseClicked(evt);
            }
        });

        txtApellidoEjecutivo.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtApellidoEjecutivoKeyTyped(evt);
            }
        });

        txtNombreEjecutivo.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtNombreEjecutivoKeyTyped(evt);
            }
        });

        jLabel32.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel32.setText("Salario");

        txtSalarioEjecutivo.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtSalarioEjecutivoKeyTyped(evt);
            }
        });

        jLabel33.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel33.setText("Cargo");

        try {
            txtCedulaEjecutivo.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("###-#######-#")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }

        try {
            txtTelefonoEjecutivo.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("(###)-###-####")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }

        javax.swing.GroupLayout panelEjecutivoLayout = new javax.swing.GroupLayout(panelEjecutivo);
        panelEjecutivo.setLayout(panelEjecutivoLayout);
        panelEjecutivoLayout.setHorizontalGroup(
            panelEjecutivoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelEjecutivoLayout.createSequentialGroup()
                .addGroup(panelEjecutivoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panelEjecutivoLayout.createSequentialGroup()
                        .addGap(20, 20, 20)
                        .addComponent(jLabel25)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jSeparator7, javax.swing.GroupLayout.PREFERRED_SIZE, 460, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 33, Short.MAX_VALUE))
                    .addGroup(panelEjecutivoLayout.createSequentialGroup()
                        .addGap(112, 112, 112)
                        .addGroup(panelEjecutivoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(panelEjecutivoLayout.createSequentialGroup()
                                .addComponent(jLabel26)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(txtNombreEjecutivo, javax.swing.GroupLayout.PREFERRED_SIZE, 251, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelEjecutivoLayout.createSequentialGroup()
                                .addGroup(panelEjecutivoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel29)
                                    .addComponent(jLabel30)
                                    .addComponent(jLabel28)
                                    .addComponent(jLabel27)
                                    .addComponent(jLabel32)
                                    .addComponent(jLabel33)
                                    .addComponent(jLabel31))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 77, Short.MAX_VALUE)
                                .addGroup(panelEjecutivoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelEjecutivoLayout.createSequentialGroup()
                                        .addComponent(btnCancelarPanelEjecutivo)
                                        .addGap(41, 41, 41)
                                        .addComponent(btnEnviarPanelEjecutivo, javax.swing.GroupLayout.PREFERRED_SIZE, 61, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(panelEjecutivoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(txtCargoEjecutivo, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 251, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(txtSalarioEjecutivo, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 251, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(txtDireccionEjecutivo, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 251, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(txtApellidoEjecutivo, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 251, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(txtPasswordEjecutivo, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 251, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addComponent(txtTelefonoEjecutivo, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txtCedulaEjecutivo, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 150, Short.MAX_VALUE)))
                .addContainerGap())
        );
        panelEjecutivoLayout.setVerticalGroup(
            panelEjecutivoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelEjecutivoLayout.createSequentialGroup()
                .addGroup(panelEjecutivoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panelEjecutivoLayout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel25))
                    .addGroup(panelEjecutivoLayout.createSequentialGroup()
                        .addGap(34, 34, 34)
                        .addComponent(jSeparator7, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(18, 18, 18)
                .addGroup(panelEjecutivoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txtNombreEjecutivo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel26))
                .addGap(18, 18, 18)
                .addGroup(panelEjecutivoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel27)
                    .addComponent(txtApellidoEjecutivo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(panelEjecutivoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel28)
                    .addComponent(txtCedulaEjecutivo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(panelEjecutivoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel29)
                    .addComponent(txtDireccionEjecutivo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(panelEjecutivoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel30)
                    .addComponent(txtTelefonoEjecutivo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(panelEjecutivoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel32)
                    .addComponent(txtSalarioEjecutivo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(panelEjecutivoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel33)
                    .addComponent(txtCargoEjecutivo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(panelEjecutivoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel31)
                    .addComponent(txtPasswordEjecutivo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(panelEjecutivoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnEnviarPanelEjecutivo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnCancelarPanelEjecutivo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(73, 73, 73))
        );

        panelFormulario.add(panelEjecutivo);
        panelEjecutivo.setBounds(10, 10, 660, 430);

        panelAgente.setBackground(new java.awt.Color(255, 214, 214));

        jLabel34.setFont(new java.awt.Font("Tahoma", 0, 20)); // NOI18N
        jLabel34.setText("Nuevo Agente");

        jLabel35.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel35.setText("Nombres");

        jLabel36.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel36.setText("Apellidos");

        jLabel37.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel37.setText("Cédula #");

        jLabel38.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel38.setText("Dirección");

        jLabel39.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel39.setText("Teléfono");

        jLabel40.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel40.setText("Salario");

        jLabel41.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel41.setText("Horario");

        jLabel42.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel42.setText("Contraseña");

        btnCancelarPanelAgente.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        btnCancelarPanelAgente.setIcon(new javax.swing.ImageIcon(getClass().getResource("/recursos/cancelar.png"))); // NOI18N
        btnCancelarPanelAgente.setToolTipText("Borrar Campos");
        btnCancelarPanelAgente.setBorderPainted(false);
        btnCancelarPanelAgente.setContentAreaFilled(false);
        btnCancelarPanelAgente.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnCancelarPanelAgente.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnCancelarPanelAgenteMouseClicked(evt);
            }
        });

        btnEnviarPanelAgente.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        btnEnviarPanelAgente.setIcon(new javax.swing.ImageIcon(getClass().getResource("/recursos/guardar.png"))); // NOI18N
        btnEnviarPanelAgente.setToolTipText("Guardar Agente");
        btnEnviarPanelAgente.setBorderPainted(false);
        btnEnviarPanelAgente.setContentAreaFilled(false);
        btnEnviarPanelAgente.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnEnviarPanelAgente.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnEnviarPanelAgenteMouseClicked(evt);
            }
        });

        txtSalarioAgente.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtSalarioAgenteKeyTyped(evt);
            }
        });

        txtApellidoAgente.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtApellidoAgenteKeyTyped(evt);
            }
        });

        txtNombreAgente.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtNombreAgenteKeyTyped(evt);
            }
        });

        try {
            txtCedulaAgente.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("###-#######-#")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }

        try {
            txtTelefonoAgente.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("(###)-###-####")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }

        javax.swing.GroupLayout panelAgenteLayout = new javax.swing.GroupLayout(panelAgente);
        panelAgente.setLayout(panelAgenteLayout);
        panelAgenteLayout.setHorizontalGroup(
            panelAgenteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelAgenteLayout.createSequentialGroup()
                .addGroup(panelAgenteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panelAgenteLayout.createSequentialGroup()
                        .addGap(20, 20, 20)
                        .addComponent(jLabel34)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jSeparator8, javax.swing.GroupLayout.PREFERRED_SIZE, 475, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 36, Short.MAX_VALUE))
                    .addGroup(panelAgenteLayout.createSequentialGroup()
                        .addGap(112, 112, 112)
                        .addGroup(panelAgenteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(panelAgenteLayout.createSequentialGroup()
                                .addComponent(btnCancelarPanelAgente)
                                .addGap(36, 36, 36)
                                .addComponent(btnEnviarPanelAgente))
                            .addGroup(panelAgenteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addGroup(panelAgenteLayout.createSequentialGroup()
                                    .addComponent(jLabel35)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(txtNombreAgente, javax.swing.GroupLayout.PREFERRED_SIZE, 251, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelAgenteLayout.createSequentialGroup()
                                    .addGroup(panelAgenteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(jLabel38)
                                        .addComponent(jLabel39)
                                        .addComponent(jLabel37)
                                        .addComponent(jLabel36)
                                        .addComponent(jLabel40)
                                        .addComponent(jLabel41)
                                        .addComponent(jLabel42))
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 77, Short.MAX_VALUE)
                                    .addGroup(panelAgenteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(txtSalarioAgente, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 251, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(txtDireccionAgente, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 251, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(txtApellidoAgente, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 251, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(txtPasswordAgente, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 251, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(txtCedulaAgente, javax.swing.GroupLayout.PREFERRED_SIZE, 97, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(txtTelefonoAgente, javax.swing.GroupLayout.PREFERRED_SIZE, 97, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(txtHorarioAgente, javax.swing.GroupLayout.PREFERRED_SIZE, 152, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 150, Short.MAX_VALUE)))
                .addContainerGap())
        );
        panelAgenteLayout.setVerticalGroup(
            panelAgenteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelAgenteLayout.createSequentialGroup()
                .addGroup(panelAgenteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panelAgenteLayout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel34))
                    .addGroup(panelAgenteLayout.createSequentialGroup()
                        .addGap(34, 34, 34)
                        .addComponent(jSeparator8, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(18, 18, 18)
                .addGroup(panelAgenteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txtNombreAgente, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel35))
                .addGap(18, 18, 18)
                .addGroup(panelAgenteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel36)
                    .addComponent(txtApellidoAgente, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(panelAgenteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel37)
                    .addComponent(txtCedulaAgente, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(panelAgenteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel38)
                    .addComponent(txtDireccionAgente, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(panelAgenteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel39)
                    .addComponent(txtTelefonoAgente, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(panelAgenteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel40)
                    .addComponent(txtSalarioAgente, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(panelAgenteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel41)
                    .addComponent(txtHorarioAgente, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(panelAgenteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel42)
                    .addComponent(txtPasswordAgente, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(panelAgenteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnEnviarPanelAgente, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnCancelarPanelAgente, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(73, 73, 73))
        );

        panelFormulario.add(panelAgente);
        panelAgente.setBounds(10, 10, 660, 430);

        panelGarante.setBackground(new java.awt.Color(178, 211, 233));

        jLabel11.setFont(new java.awt.Font("Tahoma", 0, 20)); // NOI18N
        jLabel11.setText("Nuevo Garante");

        jLabel12.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel12.setText("Nombres");

        jLabel13.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel13.setText("Apellidos");

        jLabel14.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel14.setText("Cédula #");

        jLabel15.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel15.setText("Dirección");

        jLabel16.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel16.setText("Teléfono");

        jLabel17.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel17.setText("Ingresos");

        btnCancelarPanelGarante.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        btnCancelarPanelGarante.setIcon(new javax.swing.ImageIcon(getClass().getResource("/recursos/cancelar.png"))); // NOI18N
        btnCancelarPanelGarante.setToolTipText("Borrar Campos");
        btnCancelarPanelGarante.setBorderPainted(false);
        btnCancelarPanelGarante.setContentAreaFilled(false);
        btnCancelarPanelGarante.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnCancelarPanelGarante.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnCancelarPanelGaranteMouseClicked(evt);
            }
        });

        btnEnviarPanelGarante.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        btnEnviarPanelGarante.setIcon(new javax.swing.ImageIcon(getClass().getResource("/recursos/guardar.png"))); // NOI18N
        btnEnviarPanelGarante.setToolTipText("Guardar Garante");
        btnEnviarPanelGarante.setBorderPainted(false);
        btnEnviarPanelGarante.setContentAreaFilled(false);
        btnEnviarPanelGarante.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnEnviarPanelGarante.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnEnviarPanelGaranteMouseClicked(evt);
            }
        });

        txtIngresosGarante.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtIngresosGaranteKeyTyped(evt);
            }
        });

        txtApellidoGarante.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtApellidoGaranteKeyTyped(evt);
            }
        });

        txtNombreGarante.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtNombreGaranteKeyTyped(evt);
            }
        });

        try {
            txtCedulaGarante.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("###-#######-#")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }

        try {
            txtTelefonoGarante.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("(###)-###-####")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }
        txtTelefonoGarante.setText("(   )-   -        ");
        txtTelefonoGarante.setToolTipText("");

        javax.swing.GroupLayout panelGaranteLayout = new javax.swing.GroupLayout(panelGarante);
        panelGarante.setLayout(panelGaranteLayout);
        panelGaranteLayout.setHorizontalGroup(
            panelGaranteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelGaranteLayout.createSequentialGroup()
                .addGroup(panelGaranteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panelGaranteLayout.createSequentialGroup()
                        .addGap(20, 20, 20)
                        .addComponent(jLabel11)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jSeparator5, javax.swing.GroupLayout.PREFERRED_SIZE, 468, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(panelGaranteLayout.createSequentialGroup()
                        .addGap(112, 112, 112)
                        .addGroup(panelGaranteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(panelGaranteLayout.createSequentialGroup()
                                .addGroup(panelGaranteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel17)
                                    .addComponent(jLabel16)
                                    .addComponent(jLabel15)
                                    .addComponent(jLabel12))
                                .addGap(75, 75, 75)
                                .addGroup(panelGaranteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(txtNombreGarante, javax.swing.GroupLayout.PREFERRED_SIZE, 251, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txtApellidoGarante, javax.swing.GroupLayout.PREFERRED_SIZE, 251, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(panelGaranteLayout.createSequentialGroup()
                                        .addGap(1, 1, 1)
                                        .addGroup(panelGaranteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                            .addComponent(txtIngresosGarante, javax.swing.GroupLayout.PREFERRED_SIZE, 251, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(txtDireccionGarante, javax.swing.GroupLayout.PREFERRED_SIZE, 251, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addGroup(panelGaranteLayout.createSequentialGroup()
                                                .addComponent(btnCancelarPanelGarante)
                                                .addGap(18, 18, 18)
                                                .addComponent(btnEnviarPanelGarante))
                                            .addComponent(txtCedulaGarante, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 97, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(txtTelefonoGarante, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 97, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                            .addComponent(jLabel13)
                            .addComponent(jLabel14))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 165, Short.MAX_VALUE)))
                .addContainerGap())
        );
        panelGaranteLayout.setVerticalGroup(
            panelGaranteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelGaranteLayout.createSequentialGroup()
                .addGroup(panelGaranteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panelGaranteLayout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel11))
                    .addGroup(panelGaranteLayout.createSequentialGroup()
                        .addGap(34, 34, 34)
                        .addComponent(jSeparator5, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(27, 27, 27)
                .addGroup(panelGaranteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel12)
                    .addComponent(txtNombreGarante, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(27, 27, 27)
                .addGroup(panelGaranteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel13)
                    .addComponent(txtApellidoGarante, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(27, 27, 27)
                .addGroup(panelGaranteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel14)
                    .addComponent(txtCedulaGarante, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(27, 27, 27)
                .addGroup(panelGaranteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel15)
                    .addComponent(txtDireccionGarante, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(27, 27, 27)
                .addGroup(panelGaranteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel16)
                    .addComponent(txtTelefonoGarante, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(27, 27, 27)
                .addGroup(panelGaranteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel17)
                    .addComponent(txtIngresosGarante, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(26, 26, 26)
                .addGroup(panelGaranteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnEnviarPanelGarante, javax.swing.GroupLayout.DEFAULT_SIZE, 67, Short.MAX_VALUE)
                    .addComponent(btnCancelarPanelGarante, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );

        panelFormulario.add(panelGarante);
        panelGarante.setBounds(10, 10, 660, 430);

        panelCliente.setBackground(new java.awt.Color(202, 210, 233));

        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 20)); // NOI18N
        jLabel2.setText("Nuevo Cliente");

        jLabel5.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel5.setText("Nombres");

        txtNombreCliente.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtNombreClienteKeyTyped(evt);
            }
        });

        jLabel6.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel6.setText("Apellidos");

        txtApellidoCliente.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtApellidoClienteKeyTyped(evt);
            }
        });

        jLabel7.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel7.setText("Dirección");

        jLabel8.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel8.setText("Cédula #");

        txtIngresosCliente.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtIngresosClienteKeyTyped(evt);
            }
        });

        jLabel9.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel9.setText("Ingresos");

        jLabel10.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel10.setText("Teléfono");

        btnEnviarPanelCliente.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        btnEnviarPanelCliente.setIcon(new javax.swing.ImageIcon(getClass().getResource("/recursos/guardar.png"))); // NOI18N
        btnEnviarPanelCliente.setToolTipText("Guardar Cliente");
        btnEnviarPanelCliente.setBorderPainted(false);
        btnEnviarPanelCliente.setContentAreaFilled(false);
        btnEnviarPanelCliente.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnEnviarPanelCliente.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnEnviarPanelClienteMouseClicked(evt);
            }
        });

        btnCancelarPanelCliente.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        btnCancelarPanelCliente.setIcon(new javax.swing.ImageIcon(getClass().getResource("/recursos/cancelar.png"))); // NOI18N
        btnCancelarPanelCliente.setToolTipText("Borrar Campos");
        btnCancelarPanelCliente.setBorderPainted(false);
        btnCancelarPanelCliente.setContentAreaFilled(false);
        btnCancelarPanelCliente.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnCancelarPanelCliente.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnCancelarPanelClienteMouseClicked(evt);
            }
        });

        try {
            txtCedulaCliente.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("###-#######-#")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }

        try {
            txtTelefonoCliente.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("(###)-###-####")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }

        javax.swing.GroupLayout panelClienteLayout = new javax.swing.GroupLayout(panelCliente);
        panelCliente.setLayout(panelClienteLayout);
        panelClienteLayout.setHorizontalGroup(
            panelClienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelClienteLayout.createSequentialGroup()
                .addGroup(panelClienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panelClienteLayout.createSequentialGroup()
                        .addGap(20, 20, 20)
                        .addComponent(jLabel2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jSeparator4, javax.swing.GroupLayout.PREFERRED_SIZE, 480, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(panelClienteLayout.createSequentialGroup()
                        .addGap(112, 112, 112)
                        .addGroup(panelClienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel6)
                            .addGroup(panelClienteLayout.createSequentialGroup()
                                .addGroup(panelClienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel9)
                                    .addComponent(jLabel10)
                                    .addComponent(jLabel7)
                                    .addComponent(jLabel5)
                                    .addComponent(jLabel8))
                                .addGap(75, 75, 75)
                                .addGroup(panelClienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(txtNombreCliente, javax.swing.GroupLayout.PREFERRED_SIZE, 251, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txtApellidoCliente, javax.swing.GroupLayout.PREFERRED_SIZE, 251, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txtCedulaCliente, javax.swing.GroupLayout.PREFERRED_SIZE, 97, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(panelClienteLayout.createSequentialGroup()
                                        .addGap(1, 1, 1)
                                        .addGroup(panelClienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addGroup(panelClienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                                .addComponent(txtIngresosCliente, javax.swing.GroupLayout.PREFERRED_SIZE, 251, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addComponent(txtDireccionCliente, javax.swing.GroupLayout.PREFERRED_SIZE, 251, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addGroup(panelClienteLayout.createSequentialGroup()
                                                    .addComponent(btnCancelarPanelCliente)
                                                    .addGap(18, 18, 18)
                                                    .addComponent(btnEnviarPanelCliente)))
                                            .addComponent(txtTelefonoCliente, javax.swing.GroupLayout.PREFERRED_SIZE, 97, javax.swing.GroupLayout.PREFERRED_SIZE))))))))
                .addContainerGap(32, Short.MAX_VALUE))
        );
        panelClienteLayout.setVerticalGroup(
            panelClienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelClienteLayout.createSequentialGroup()
                .addGroup(panelClienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panelClienteLayout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel2))
                    .addGroup(panelClienteLayout.createSequentialGroup()
                        .addGap(34, 34, 34)
                        .addComponent(jSeparator4, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(27, 27, 27)
                .addGroup(panelClienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(txtNombreCliente, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(27, 27, 27)
                .addGroup(panelClienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(txtApellidoCliente, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(27, 27, 27)
                .addGroup(panelClienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel8)
                    .addComponent(txtCedulaCliente, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(27, 27, 27)
                .addGroup(panelClienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7)
                    .addComponent(txtDireccionCliente, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(27, 27, 27)
                .addGroup(panelClienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel10)
                    .addComponent(txtTelefonoCliente, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(27, 27, 27)
                .addGroup(panelClienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel9)
                    .addComponent(txtIngresosCliente, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(26, 26, 26)
                .addGroup(panelClienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnEnviarPanelCliente, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnCancelarPanelCliente, javax.swing.GroupLayout.DEFAULT_SIZE, 67, Short.MAX_VALUE))
                .addContainerGap())
        );

        panelFormulario.add(panelCliente);
        panelCliente.setBounds(10, 10, 660, 430);

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/recursos/flechaDerechaTrans.png"))); // NOI18N
        panelFormulario.add(jLabel1);
        jLabel1.setBounds(0, 0, 680, 450);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(lbFormulario)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jSeparator2, javax.swing.GroupLayout.PREFERRED_SIZE, 384, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(0, 7, Short.MAX_VALUE)
                        .addComponent(panelFormulario, javax.swing.GroupLayout.PREFERRED_SIZE, 683, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 17, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(panelTipoPersona, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(lbFormulario))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(35, 35, 35)
                        .addComponent(jSeparator2, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 424, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(42, 42, 42))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(panelFormulario, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(panelTipoPersona, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(26, 26, 26))))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnClienteMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnClienteMouseClicked
        limpiarPanelFormulario();
        panelCliente.setVisible(true);
    }//GEN-LAST:event_btnClienteMouseClicked

    private void btnGaranteMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnGaranteMouseClicked
        limpiarPanelFormulario();
        panelGarante.setVisible(true);
    }//GEN-LAST:event_btnGaranteMouseClicked

    private void btnAgenteMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnAgenteMouseClicked
       
        if(RegistrarPersona.verificarPassEjecutivo(capturarPassword())){
            limpiarPanelFormulario();
            panelAgente.setVisible(true);
        } else {
            JOptionPane.showMessageDialog(null, "Contraseña Ejecutiva Incorrecta! ", "Error",
                        JOptionPane.ERROR_MESSAGE);
        }
       
    }//GEN-LAST:event_btnAgenteMouseClicked

    private void btnEjecutivoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnEjecutivoMouseClicked
        
        if (RegistrarPersona.verificarPassEjecutivo(capturarPassword())) {
            limpiarPanelFormulario();
            panelEjecutivo.setVisible(true);
        } else {
            JOptionPane.showMessageDialog(null, "Contraseña Ejecutiva Incorrecta! ", "Error",
                    JOptionPane.ERROR_MESSAGE);
        }

    }//GEN-LAST:event_btnEjecutivoMouseClicked

    private void btnCancelarPanelClienteMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnCancelarPanelClienteMouseClicked
        limpiarCampos("cliente");        
    }//GEN-LAST:event_btnCancelarPanelClienteMouseClicked

    private void btnCancelarPanelGaranteMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnCancelarPanelGaranteMouseClicked
        limpiarCampos("garante");        
    }//GEN-LAST:event_btnCancelarPanelGaranteMouseClicked

    private void btnCancelarPanelEjecutivoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnCancelarPanelEjecutivoMouseClicked
        limpiarCampos("ejecutivo");
    }//GEN-LAST:event_btnCancelarPanelEjecutivoMouseClicked

    private void btnEnviarPanelClienteMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnEnviarPanelClienteMouseClicked
        RegistrarPersona.registrarCliente(Double.parseDouble(txtIngresosCliente.getText()), 
                txtCedulaCliente.getText(),
                txtNombreCliente.getText(),
                txtApellidoCliente.getText(),
                txtDireccionCliente.getText(),
                txtTelefonoCliente.getText());
        limpiarCampos("cliente");
    }//GEN-LAST:event_btnEnviarPanelClienteMouseClicked

    private void btnEnviarPanelEjecutivoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnEnviarPanelEjecutivoMouseClicked
        RegistrarPersona.registrarEjecutivo(txtCargoEjecutivo.getText(),
                txtPasswordEjecutivo.getText(),
                Double.parseDouble(txtSalarioEjecutivo.getText()),
                txtCedulaEjecutivo.getText(),
                txtNombreEjecutivo.getText(),
                txtApellidoEjecutivo.getText(),
                txtDireccionEjecutivo.getText(),
                txtTelefonoEjecutivo.getText());
        limpiarCampos("ejecutivo");
    }//GEN-LAST:event_btnEnviarPanelEjecutivoMouseClicked

    private void btnEnviarPanelGaranteMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnEnviarPanelGaranteMouseClicked
        RegistrarPersona.registrarGarante(Double.parseDouble(txtIngresosGarante.getText()),
                txtCedulaGarante.getText(),
                txtNombreGarante.getText(),
                txtApellidoGarante.getText(),
                txtDireccionGarante.getText(),
                txtTelefonoGarante.getText());
        limpiarCampos("garante");
    }//GEN-LAST:event_btnEnviarPanelGaranteMouseClicked

    private void txtIngresosClienteKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtIngresosClienteKeyTyped
        char c = evt.getKeyChar();
        if (c < '0' || c > '9') {
            evt.consume();
        }
    }//GEN-LAST:event_txtIngresosClienteKeyTyped

    private void txtNombreClienteKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtNombreClienteKeyTyped
        char c = evt.getKeyChar();
        if ((c < 'a' || c > 'z') && (c < 'A' || c > 'Z') && c != ' ') {
            evt.consume();
        }
    }//GEN-LAST:event_txtNombreClienteKeyTyped

    private void txtApellidoClienteKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtApellidoClienteKeyTyped
        char c = evt.getKeyChar();
        if ((c < 'a' || c > 'z') && (c < 'A' || c > 'Z') && c != ' ') {
            evt.consume();
        }
    }//GEN-LAST:event_txtApellidoClienteKeyTyped

    private void txtNombreGaranteKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtNombreGaranteKeyTyped
        char c = evt.getKeyChar();
        if ((c < 'a' || c > 'z') && (c < 'A' || c > 'Z') && c != ' ') {
            evt.consume();
        }
    }//GEN-LAST:event_txtNombreGaranteKeyTyped

    private void txtApellidoGaranteKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtApellidoGaranteKeyTyped
        char c = evt.getKeyChar();
        if ((c < 'a' || c > 'z') && (c < 'A' || c > 'Z') && c != ' ') {
            evt.consume();
        }
    }//GEN-LAST:event_txtApellidoGaranteKeyTyped

    private void txtIngresosGaranteKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtIngresosGaranteKeyTyped
        char c = evt.getKeyChar();
        if (c < '0' || c > '9') {
            evt.consume();
        }
    }//GEN-LAST:event_txtIngresosGaranteKeyTyped

    private void btnEnviarPanelAgenteMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnEnviarPanelAgenteMouseClicked
        RegistrarPersona.registrarAgente(txtHorarioAgente.getText(),
            txtPasswordAgente.getText(),
            Double.parseDouble(txtSalarioAgente.getText()),
            txtCedulaAgente.getText(),
            txtNombreAgente.getText(),
            txtApellidoAgente.getText(),
            txtDireccionAgente.getText(),
            txtTelefonoAgente.getText());
        limpiarCampos("agente");
    }//GEN-LAST:event_btnEnviarPanelAgenteMouseClicked

    private void btnCancelarPanelAgenteMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnCancelarPanelAgenteMouseClicked
        limpiarCampos("agente");
    }//GEN-LAST:event_btnCancelarPanelAgenteMouseClicked

    private void txtNombreAgenteKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtNombreAgenteKeyTyped
        char c = evt.getKeyChar();
        if ((c < 'a' || c > 'z') && (c < 'A' || c > 'Z') && c != ' ') {
            evt.consume();
        }
    }//GEN-LAST:event_txtNombreAgenteKeyTyped

    private void txtApellidoAgenteKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtApellidoAgenteKeyTyped
        char c = evt.getKeyChar();
        if ((c < 'a' || c > 'z') && (c < 'A' || c > 'Z') && c != ' ') {
            evt.consume();
        }
    }//GEN-LAST:event_txtApellidoAgenteKeyTyped

    private void txtSalarioAgenteKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtSalarioAgenteKeyTyped
        char c = evt.getKeyChar();
        if (c < '0' || c > '9') {
            evt.consume();
        }
    }//GEN-LAST:event_txtSalarioAgenteKeyTyped

    private void txtNombreEjecutivoKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtNombreEjecutivoKeyTyped
        char c = evt.getKeyChar();
        if ((c < 'a' || c > 'z') && (c < 'A' || c > 'Z') && c != ' ') {
            evt.consume();
        }
    }//GEN-LAST:event_txtNombreEjecutivoKeyTyped

    private void txtApellidoEjecutivoKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtApellidoEjecutivoKeyTyped
        char c = evt.getKeyChar();
        if ((c < 'a' || c > 'z') && (c < 'A' || c > 'Z') && c != ' ') {
            evt.consume();
        }
    }//GEN-LAST:event_txtApellidoEjecutivoKeyTyped

    private void txtSalarioEjecutivoKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtSalarioEjecutivoKeyTyped
        char c = evt.getKeyChar();
        if (c < '0' || c > '9') {
            evt.consume();
        }
    }//GEN-LAST:event_txtSalarioEjecutivoKeyTyped


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAgente;
    private javax.swing.JButton btnCancelarPanelAgente;
    private javax.swing.JButton btnCancelarPanelCliente;
    private javax.swing.JButton btnCancelarPanelEjecutivo;
    private javax.swing.JButton btnCancelarPanelGarante;
    private javax.swing.JButton btnCliente;
    private javax.swing.JButton btnEjecutivo;
    private javax.swing.JButton btnEnviarPanelAgente;
    private javax.swing.JButton btnEnviarPanelCliente;
    private javax.swing.JButton btnEnviarPanelEjecutivo;
    private javax.swing.JButton btnEnviarPanelGarante;
    private javax.swing.JButton btnGarante;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel25;
    private javax.swing.JLabel jLabel26;
    private javax.swing.JLabel jLabel27;
    private javax.swing.JLabel jLabel28;
    private javax.swing.JLabel jLabel29;
    private javax.swing.JLabel jLabel30;
    private javax.swing.JLabel jLabel31;
    private javax.swing.JLabel jLabel32;
    private javax.swing.JLabel jLabel33;
    private javax.swing.JLabel jLabel34;
    private javax.swing.JLabel jLabel35;
    private javax.swing.JLabel jLabel36;
    private javax.swing.JLabel jLabel37;
    private javax.swing.JLabel jLabel38;
    private javax.swing.JLabel jLabel39;
    private javax.swing.JLabel jLabel40;
    private javax.swing.JLabel jLabel41;
    private javax.swing.JLabel jLabel42;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JSeparator jSeparator4;
    private javax.swing.JSeparator jSeparator5;
    private javax.swing.JSeparator jSeparator7;
    private javax.swing.JSeparator jSeparator8;
    private javax.swing.JLabel lbFormulario;
    private javax.swing.JPanel panelAgente;
    private javax.swing.JPanel panelCliente;
    private javax.swing.JPanel panelEjecutivo;
    private javax.swing.JPanel panelFormulario;
    private javax.swing.JPanel panelGarante;
    private javax.swing.JPanel panelTipoPersona;
    private javax.swing.JTextField txtApellidoAgente;
    private javax.swing.JTextField txtApellidoCliente;
    private javax.swing.JTextField txtApellidoEjecutivo;
    private javax.swing.JTextField txtApellidoGarante;
    private javax.swing.JTextField txtCargoEjecutivo;
    private javax.swing.JFormattedTextField txtCedulaAgente;
    private javax.swing.JFormattedTextField txtCedulaCliente;
    private javax.swing.JFormattedTextField txtCedulaEjecutivo;
    private javax.swing.JFormattedTextField txtCedulaGarante;
    private javax.swing.JTextField txtDireccionAgente;
    private javax.swing.JTextField txtDireccionCliente;
    private javax.swing.JTextField txtDireccionEjecutivo;
    private javax.swing.JTextField txtDireccionGarante;
    private javax.swing.JFormattedTextField txtHorarioAgente;
    private javax.swing.JTextField txtIngresosCliente;
    private javax.swing.JTextField txtIngresosGarante;
    private javax.swing.JTextField txtNombreAgente;
    private javax.swing.JTextField txtNombreCliente;
    private javax.swing.JTextField txtNombreEjecutivo;
    private javax.swing.JTextField txtNombreGarante;
    private javax.swing.JPasswordField txtPasswordAgente;
    private javax.swing.JPasswordField txtPasswordEjecutivo;
    private javax.swing.JTextField txtSalarioAgente;
    private javax.swing.JTextField txtSalarioEjecutivo;
    private javax.swing.JFormattedTextField txtTelefonoAgente;
    private javax.swing.JFormattedTextField txtTelefonoCliente;
    private javax.swing.JFormattedTextField txtTelefonoEjecutivo;
    private javax.swing.JFormattedTextField txtTelefonoGarante;
    // End of variables declaration//GEN-END:variables
    MaskFormatter mascara;
    private void limpiarPanelFormulario() {
        panelCliente.setVisible(false);
        panelGarante.setVisible(false);
        panelAgente.setVisible(false);
        panelEjecutivo.setVisible(false);
        
    }

    private String capturarPassword() {
        JPasswordField jpf = new JPasswordField();
        JLabel tit1 = new JLabel("Autorización Requerida");
        JLabel tit2 = new JLabel("Ingrese Contraseña Ejecutiva");
        JOptionPane.showConfirmDialog(null, new Object[]{tit1, tit2, jpf}, 
                "Confirmando Ejecutivo", JOptionPane.OK_CANCEL_OPTION);
        char p[] = jpf.getPassword();
        String pass = new String(p);
        
        return pass;
    }

    private void limpiarCampos(String tipo) {
        switch (tipo) {
            case "cliente":
                txtApellidoCliente.setText("");
                txtCedulaCliente.setText("");
                txtDireccionCliente.setText("");
                txtIngresosCliente.setText("");
                txtNombreCliente.setText("");
                txtTelefonoCliente.setText("");
                break;
            case "garante":
                txtApellidoGarante.setText("");
                txtCedulaGarante.setText("");
                txtDireccionGarante.setText("");
                txtIngresosGarante.setText("");
                txtNombreGarante.setText("");
                txtTelefonoGarante.setText("");
                break;
            case "agente":

                txtApellidoAgente.setText("");
                txtCedulaAgente.setText("");
                txtDireccionAgente.setText("");
                txtNombreAgente.setText("");
                txtSalarioAgente.setText("");
                txtHorarioAgente.setText("");
                txtPasswordAgente.setText("");
                txtTelefonoAgente.setText("");
                break;
            case "ejecutivo":
                txtApellidoEjecutivo.setText("");
                txtCedulaEjecutivo.setText("");
                txtDireccionEjecutivo.setText("");
                txtNombreEjecutivo.setText("");
                txtSalarioEjecutivo.setText("");
                txtCargoEjecutivo.setText("");
                txtPasswordEjecutivo.setText("");
                txtTelefonoEjecutivo.setText("");
                break;
        }
    }   
}
