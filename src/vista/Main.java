package vista;
import java.awt.Desktop;
import java.awt.Image;
import java.awt.Toolkit;
import java.io.File;
import java.io.IOException;

public class Main extends javax.swing.JFrame {
    
    public Main() {
        initComponents();
        setLocationRelativeTo(null);
        // creando componentes
        rpf = new RegistrarPersonaForm();
        rsf = new SolicitudForm();
        psf = new ProcesarSolicitudForm();
        cf = new CobrarForm();
        cnf = new ConsultarForm();
        mf = new MantenimientoForm();
        // agregando componentes al escritorio
        escritorio.add(rpf);
        escritorio.add(rsf);
        escritorio.add(psf);
        escritorio.add(cf);
        escritorio.add(cnf);
        escritorio.add(mf);      
    }
    
    @Override
    public Image getIconImage() {
        Image getValue = Toolkit.getDefaultToolkit().getImage(ClassLoader.getSystemResource("recursos/logoInicio.png"));
        return getValue;
    }
   
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        panelCabeza = new javax.swing.JPanel();
        registrarPersonas = new javax.swing.JToggleButton();
        btnSalir = new javax.swing.JToggleButton();
        btnInicio = new javax.swing.JButton();
        btnSolicitud = new javax.swing.JButton();
        btnProcesarSolicitud = new javax.swing.JButton();
        btnCobrar = new javax.swing.JButton();
        btnConsultar = new javax.swing.JButton();
        btnMantenimiento = new javax.swing.JButton();
        btnAyuda = new javax.swing.JButton();
        btnAcercaDe = new javax.swing.JButton();
        lbUsuarioLogueado = new javax.swing.JLabel();
        escritorio = new javax.swing.JDesktopPane();
        panelBienvenido = new javax.swing.JPanel();
        lbBienvenido = new javax.swing.JLabel();
        separadorBienvenido = new javax.swing.JSeparator();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Prestam SYSTEM v 1.0");
        setBackground(new java.awt.Color(105, 124, 168));
        setBounds(new java.awt.Rectangle(0, 0, 0, 0));
        setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        setIconImage(getIconImage());
        setResizable(false);

        panelCabeza.setBackground(new java.awt.Color(68, 109, 178));

        registrarPersonas.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        registrarPersonas.setIcon(new javax.swing.ImageIcon(getClass().getResource("/recursos/addPerson1.png"))); // NOI18N
        registrarPersonas.setToolTipText("Registrar Nueva Persona");
        registrarPersonas.setBorderPainted(false);
        registrarPersonas.setContentAreaFilled(false);
        registrarPersonas.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        registrarPersonas.setFocusPainted(false);
        registrarPersonas.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                registrarPersonasMouseClicked(evt);
            }
        });

        btnSalir.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        btnSalir.setText("Salir");
        btnSalir.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnSalir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSalirActionPerformed(evt);
            }
        });

        btnInicio.setIcon(new javax.swing.ImageIcon(getClass().getResource("/recursos/logoInicio.png"))); // NOI18N
        btnInicio.setToolTipText("");
        btnInicio.setBorderPainted(false);
        btnInicio.setContentAreaFilled(false);
        btnInicio.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnInicio.setFocusPainted(false);
        btnInicio.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnInicioMouseClicked(evt);
            }
        });

        btnSolicitud.setIcon(new javax.swing.ImageIcon(getClass().getResource("/recursos/solicitud.png"))); // NOI18N
        btnSolicitud.setToolTipText("Registrar Nueva Solicitud de Préstamo");
        btnSolicitud.setBorderPainted(false);
        btnSolicitud.setContentAreaFilled(false);
        btnSolicitud.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnSolicitud.setFocusPainted(false);
        btnSolicitud.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnSolicitudMouseClicked(evt);
            }
        });

        btnProcesarSolicitud.setIcon(new javax.swing.ImageIcon(getClass().getResource("/recursos/procesar.png"))); // NOI18N
        btnProcesarSolicitud.setToolTipText("Procesar Soilicitud de Préstamo");
        btnProcesarSolicitud.setBorderPainted(false);
        btnProcesarSolicitud.setContentAreaFilled(false);
        btnProcesarSolicitud.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnProcesarSolicitud.setFocusPainted(false);
        btnProcesarSolicitud.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnProcesarSolicitudMouseClicked(evt);
            }
        });

        btnCobrar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/recursos/cobros.png"))); // NOI18N
        btnCobrar.setToolTipText("Cobrar un Préstamo");
        btnCobrar.setBorderPainted(false);
        btnCobrar.setContentAreaFilled(false);
        btnCobrar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnCobrar.setFocusPainted(false);
        btnCobrar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnCobrarMouseClicked(evt);
            }
        });

        btnConsultar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/recursos/consultas.png"))); // NOI18N
        btnConsultar.setToolTipText("Hacer una Consulta en la base de datos");
        btnConsultar.setBorderPainted(false);
        btnConsultar.setContentAreaFilled(false);
        btnConsultar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnConsultar.setFocusPainted(false);
        btnConsultar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnConsultarMouseClicked(evt);
            }
        });

        btnMantenimiento.setIcon(new javax.swing.ImageIcon(getClass().getResource("/recursos/mantenimiento.png"))); // NOI18N
        btnMantenimiento.setToolTipText("Mantenimiento");
        btnMantenimiento.setBorderPainted(false);
        btnMantenimiento.setContentAreaFilled(false);
        btnMantenimiento.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnMantenimiento.setFocusPainted(false);
        btnMantenimiento.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnMantenimientoMouseClicked(evt);
            }
        });

        btnAyuda.setIcon(new javax.swing.ImageIcon(getClass().getResource("/recursos/ayuda.png"))); // NOI18N
        btnAyuda.setToolTipText("Ayuda");
        btnAyuda.setBorderPainted(false);
        btnAyuda.setContentAreaFilled(false);
        btnAyuda.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnAyuda.setFocusPainted(false);
        btnAyuda.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnAyudaMouseClicked(evt);
            }
        });

        btnAcercaDe.setIcon(new javax.swing.ImageIcon(getClass().getResource("/recursos/acerca.png"))); // NOI18N
        btnAcercaDe.setToolTipText("Acerca de");
        btnAcercaDe.setBorderPainted(false);
        btnAcercaDe.setContentAreaFilled(false);
        btnAcercaDe.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnAcercaDe.setFocusPainted(false);
        btnAcercaDe.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnAcercaDeMouseClicked(evt);
            }
        });

        lbUsuarioLogueado.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        lbUsuarioLogueado.setForeground(new java.awt.Color(255, 255, 255));
        lbUsuarioLogueado.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        lbUsuarioLogueado.setText("<html><i>ID usuario actual:<b> No Definido</b></i></html>");
        lbUsuarioLogueado.setToolTipText("Usuario actualmente logueado");

        javax.swing.GroupLayout panelCabezaLayout = new javax.swing.GroupLayout(panelCabeza);
        panelCabeza.setLayout(panelCabezaLayout);
        panelCabezaLayout.setHorizontalGroup(
            panelCabezaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelCabezaLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(btnInicio, javax.swing.GroupLayout.PREFERRED_SIZE, 94, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(registrarPersonas, javax.swing.GroupLayout.PREFERRED_SIZE, 84, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(btnSolicitud, javax.swing.GroupLayout.PREFERRED_SIZE, 84, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(btnProcesarSolicitud, javax.swing.GroupLayout.PREFERRED_SIZE, 84, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(btnCobrar, javax.swing.GroupLayout.PREFERRED_SIZE, 84, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(btnConsultar, javax.swing.GroupLayout.PREFERRED_SIZE, 84, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(panelCabezaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panelCabezaLayout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(btnMantenimiento, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(btnAyuda, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(lbUsuarioLogueado))
                .addGap(18, 18, 18)
                .addGroup(panelCabezaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(btnSalir, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnAcercaDe, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE))
                .addContainerGap())
        );
        panelCabezaLayout.setVerticalGroup(
            panelCabezaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelCabezaLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(panelCabezaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panelCabezaLayout.createSequentialGroup()
                        .addGroup(panelCabezaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(btnSalir)
                            .addComponent(lbUsuarioLogueado, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(15, 15, 15)
                        .addGroup(panelCabezaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(btnMantenimiento, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                            .addComponent(btnAcercaDe, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnAyuda, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(panelCabezaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addComponent(btnCobrar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btnConsultar, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(panelCabezaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addComponent(btnSolicitud, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(registrarPersonas, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btnInicio, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btnProcesarSolicitud, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 90, Short.MAX_VALUE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        escritorio.setBackground(new java.awt.Color(0, 89, 135));
        escritorio.setAutoscrolls(true);
        escritorio.setPreferredSize(new java.awt.Dimension(997, 563));
        escritorio.setLayout(new java.awt.BorderLayout());

        panelBienvenido.setBackground(new java.awt.Color(204, 204, 255));
        panelBienvenido.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        panelBienvenido.setMaximumSize(new java.awt.Dimension(400, 300));
        panelBienvenido.setMinimumSize(new java.awt.Dimension(400, 300));
        panelBienvenido.setPreferredSize(new java.awt.Dimension(400, 300));

        lbBienvenido.setFont(new java.awt.Font("Tahoma", 0, 20)); // NOI18N
        lbBienvenido.setText("Bienvenid@");

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/recursos/logoFondo.png"))); // NOI18N

        javax.swing.GroupLayout panelBienvenidoLayout = new javax.swing.GroupLayout(panelBienvenido);
        panelBienvenido.setLayout(panelBienvenidoLayout);
        panelBienvenidoLayout.setHorizontalGroup(
            panelBienvenidoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelBienvenidoLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lbBienvenido)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(separadorBienvenido, javax.swing.GroupLayout.DEFAULT_SIZE, 864, Short.MAX_VALUE)
                .addContainerGap())
            .addGroup(panelBienvenidoLayout.createSequentialGroup()
                .addGap(196, 196, 196)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 588, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        panelBienvenidoLayout.setVerticalGroup(
            panelBienvenidoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelBienvenidoLayout.createSequentialGroup()
                .addGroup(panelBienvenidoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panelBienvenidoLayout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(lbBienvenido))
                    .addGroup(panelBienvenidoLayout.createSequentialGroup()
                        .addGap(34, 34, 34)
                        .addComponent(separadorBienvenido, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 498, Short.MAX_VALUE)
                .addContainerGap())
        );

        escritorio.add(panelBienvenido, java.awt.BorderLayout.CENTER);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panelCabeza, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(escritorio, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(panelCabeza, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(escritorio, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        getAccessibleContext().setAccessibleDescription("Sistema de Gestión de Financieras");

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnSalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSalirActionPerformed
        System.exit(0);
    }//GEN-LAST:event_btnSalirActionPerformed

    private void btnInicioMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnInicioMouseClicked
        limpiarEscritorio();
    }//GEN-LAST:event_btnInicioMouseClicked

    private void registrarPersonasMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_registrarPersonasMouseClicked
        limpiarEscritorio();
        rpf.show();
    }//GEN-LAST:event_registrarPersonasMouseClicked

    private void btnSolicitudMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnSolicitudMouseClicked
        limpiarEscritorio();
        rsf.show();
    }//GEN-LAST:event_btnSolicitudMouseClicked

    private void btnProcesarSolicitudMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnProcesarSolicitudMouseClicked
        limpiarEscritorio();
        psf.show();
    }//GEN-LAST:event_btnProcesarSolicitudMouseClicked

    private void btnCobrarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnCobrarMouseClicked
        limpiarEscritorio();
        cf.show();
    }//GEN-LAST:event_btnCobrarMouseClicked

    private void btnConsultarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnConsultarMouseClicked
        limpiarEscritorio();
        cnf.show();
    }//GEN-LAST:event_btnConsultarMouseClicked

    private void btnMantenimientoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnMantenimientoMouseClicked
        limpiarEscritorio();
        mf.show();
    }//GEN-LAST:event_btnMantenimientoMouseClicked

    private void btnAyudaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnAyudaMouseClicked
        
        try {
            File path = new File("src/recursos/manual.pdf");
            Desktop.getDesktop().open(path);
        } catch (IOException ex) {
            ex.printStackTrace();
        }
    }//GEN-LAST:event_btnAyudaMouseClicked

    private void btnAcercaDeMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnAcercaDeMouseClicked
        String mensaje = "\n\nVersión: 1.0\n"
                + "Fecha: 26 de Septiembre 2014 09:46\n\n"                
                + "Autor: Danis Ramírez Joseph\n"               
                + "Copyright 2014 PrestamSYS\n\n\n";
        javax.swing.JOptionPane.showMessageDialog(null, mensaje, "Acerca de - PrestamSYS",
                javax.swing.JOptionPane.INFORMATION_MESSAGE);
    }//GEN-LAST:event_btnAcercaDeMouseClicked

    public void limpiarEscritorio () {
        rpf.hide();
        rsf.hide();
        psf.hide();
        cf.hide();
        cnf.hide();
        mf.hide();
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAcercaDe;
    private javax.swing.JButton btnAyuda;
    private javax.swing.JButton btnCobrar;
    private javax.swing.JButton btnConsultar;
    private javax.swing.JButton btnInicio;
    private javax.swing.JButton btnMantenimiento;
    private javax.swing.JButton btnProcesarSolicitud;
    private javax.swing.JToggleButton btnSalir;
    private javax.swing.JButton btnSolicitud;
    private javax.swing.JDesktopPane escritorio;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel lbBienvenido;
    private javax.swing.JLabel lbUsuarioLogueado;
    private javax.swing.JPanel panelBienvenido;
    private javax.swing.JPanel panelCabeza;
    private javax.swing.JToggleButton registrarPersonas;
    private javax.swing.JSeparator separadorBienvenido;
    // End of variables declaration//GEN-END:variables
    private RegistrarPersonaForm rpf;
    private SolicitudForm rsf;
    private ProcesarSolicitudForm psf;
    private CobrarForm cf;
    private ConsultarForm cnf;
    private MantenimientoForm mf;

    void setUsuarioLogueado(Object e, String idUsuarioActual) {
        String tabla = String.valueOf(e);
        lbUsuarioLogueado.setText("<html><i>Usuario actual : </i><b>" + tabla + ", ID " + idUsuarioActual + "</b></html>");
    }
}