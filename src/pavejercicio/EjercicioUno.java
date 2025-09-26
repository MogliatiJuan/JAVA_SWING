
package pavejercicio;

import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;


public class EjercicioUno extends javax.swing.JFrame {

 
    public EjercicioUno() {
        initComponents();
        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        //setLocationRelativeTo(600,2);
    }

 
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        lblSistemaOp = new javax.swing.JLabel();
        rdbWindows = new javax.swing.JRadioButton();
        rdbLinux = new javax.swing.JRadioButton();
        rdbMac = new javax.swing.JRadioButton();
        lblEspecialidad = new javax.swing.JLabel();
        chkProg = new javax.swing.JCheckBox();
        chkDiseno = new javax.swing.JCheckBox();
        chkAdmin = new javax.swing.JCheckBox();
        lblHoras = new javax.swing.JLabel();
        sldHoras = new javax.swing.JSlider();
        lblHorasValor = new javax.swing.JLabel();
        btnGenerar = new javax.swing.JButton();
        jSeparator1 = new javax.swing.JSeparator();
        jSeparator2 = new javax.swing.JSeparator();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Mini Encuesta");
        setBounds(new java.awt.Rectangle(0, 0, 0, 0));
        setLocation(new java.awt.Point(1200, 200));
        setName("Ventana"); // NOI18N
        setPreferredSize(new java.awt.Dimension(429, 550));

        lblSistemaOp.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblSistemaOp.setText("Elige un sistema operativo");
        lblSistemaOp.setName(""); // NOI18N

        buttonGroup1.add(rdbWindows);
        rdbWindows.setText("Windows");

        buttonGroup1.add(rdbLinux);
        rdbLinux.setSelected(true);
        rdbLinux.setText("Linux");
        rdbLinux.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rdbLinuxActionPerformed(evt);
            }
        });

        buttonGroup1.add(rdbMac);
        rdbMac.setText("Mac");

        lblEspecialidad.setText("Elige tu especialidad");
        lblEspecialidad.setToolTipText("");

        chkProg.setText("Programación");

        chkDiseno.setText("Diseño Gráfico");
        chkDiseno.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                chkDisenoActionPerformed(evt);
            }
        });

        chkAdmin.setText("Administración");
        chkAdmin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                chkAdminActionPerformed(evt);
            }
        });

        lblHoras.setText("Horas que dedicas en el ordenador");
        lblHoras.setToolTipText("");

        sldHoras.setMajorTickSpacing(1);
        sldHoras.setMaximum(10);
        sldHoras.setPaintTicks(true);
        sldHoras.setToolTipText("");
        sldHoras.setValue(4);
        sldHoras.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                sldHorasStateChanged(evt);
            }
        });

        lblHorasValor.setText("4");
        lblHorasValor.setToolTipText("");

        btnGenerar.setText("Generar");
        btnGenerar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnGenerarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(72, 72, 72)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(103, 103, 103)
                                .addComponent(btnGenerar))
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addComponent(lblSistemaOp, javax.swing.GroupLayout.PREFERRED_SIZE, 210, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(6, 6, 6)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(chkDiseno)
                                            .addComponent(chkProg)
                                            .addComponent(chkAdmin)))
                                    .addComponent(lblEspecialidad, javax.swing.GroupLayout.PREFERRED_SIZE, 182, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(28, 28, 28)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(lblHoras, javax.swing.GroupLayout.PREFERRED_SIZE, 216, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(lblHorasValor, javax.swing.GroupLayout.PREFERRED_SIZE, 14, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(sldHoras, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(36, 36, 36)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jSeparator1, javax.swing.GroupLayout.DEFAULT_SIZE, 356, Short.MAX_VALUE)
                            .addComponent(jSeparator2)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(108, 108, 108)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(rdbWindows, javax.swing.GroupLayout.PREFERRED_SIZE, 102, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(rdbMac)
                            .addComponent(rdbLinux))))
                .addContainerGap(34, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addComponent(lblSistemaOp, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(rdbWindows)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(rdbLinux)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(rdbMac)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(2, 2, 2)
                .addComponent(lblEspecialidad, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(chkProg)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(chkDiseno)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(chkAdmin)
                .addGap(19, 19, 19)
                .addComponent(jSeparator2, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(lblHoras)
                .addGap(18, 18, 18)
                .addComponent(lblHorasValor)
                .addGap(8, 8, 8)
                .addComponent(sldHoras, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(btnGenerar)
                .addContainerGap(34, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void sldHorasStateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_sldHorasStateChanged
        lblHorasValor.setText(String.valueOf(sldHoras.getValue()));
    }//GEN-LAST:event_sldHorasStateChanged

    private void btnGenerarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGenerarActionPerformed

        // 1) SO elegido
        String so = "";
        if (rdbWindows.isSelected())      so = "Windows";
        else if (rdbLinux.isSelected())   so = "Linux";
        else if (rdbMac.isSelected())     so = "Mac";

        // 2) Especialidades
        List<String> esp = new ArrayList<>();
        if (chkProg.isSelected())   esp.add("Programación");
        if (chkDiseno.isSelected()) esp.add("Diseño gráfico");
        if (chkAdmin.isSelected())  esp.add("Administración");
        String especialidades = esp.isEmpty() ? "Ninguna" : String.join(", ", esp);

        // 3) Horas
        int horas = sldHoras.getValue();

        // Mostrar
        JOptionPane.showMessageDialog(
            this,
            "SO: " + so + "\nEspecialidad: " + especialidades + "\nHoras: " + horas,
            "Resultado de la encuesta",
            JOptionPane.INFORMATION_MESSAGE
        );
    }//GEN-LAST:event_btnGenerarActionPerformed

    private void rdbLinuxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rdbLinuxActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_rdbLinuxActionPerformed

    private void chkDisenoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_chkDisenoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_chkDisenoActionPerformed

    private void chkAdminActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_chkAdminActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_chkAdminActionPerformed

    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnGenerar;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JCheckBox chkAdmin;
    private javax.swing.JCheckBox chkDiseno;
    private javax.swing.JCheckBox chkProg;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JLabel lblEspecialidad;
    private javax.swing.JLabel lblHoras;
    private javax.swing.JLabel lblHorasValor;
    private javax.swing.JLabel lblSistemaOp;
    private javax.swing.JRadioButton rdbLinux;
    private javax.swing.JRadioButton rdbMac;
    private javax.swing.JRadioButton rdbWindows;
    private javax.swing.JSlider sldHoras;
    // End of variables declaration//GEN-END:variables
}
