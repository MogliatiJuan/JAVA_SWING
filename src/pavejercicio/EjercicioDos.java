package pavejercicio;

import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;
import javax.swing.event.DocumentEvent;
import javax.swing.event.DocumentListener;

public class EjercicioDos extends javax.swing.JFrame {


    public EjercicioDos() {
        initComponents();
        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        RadioButtonEspejo();
        CheckBoxEspejo();
        TextFieldEspejo();
        ComboBoxEspejo();
        SpinnerEspejo();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        opcion2 = new javax.swing.JRadioButton();
        opcion2E = new javax.swing.JRadioButton();
        opcion3 = new javax.swing.JRadioButton();
        opcion5 = new javax.swing.JCheckBox();
        opcion4 = new javax.swing.JCheckBox();
        opcion6 = new javax.swing.JCheckBox();
        opcion7 = new javax.swing.JTextField();
        opcion8 = new javax.swing.JComboBox<>();
        opcion9 = new javax.swing.JSpinner();
        jSeparator1 = new javax.swing.JSeparator();
        jLabel2 = new javax.swing.JLabel();
        opcion1 = new javax.swing.JRadioButton();
        opcion1E = new javax.swing.JRadioButton();
        opcion3E = new javax.swing.JRadioButton();
        opcion4E = new javax.swing.JCheckBox();
        opcion5E = new javax.swing.JCheckBox();
        opcion6E = new javax.swing.JCheckBox();
        opcion7E = new javax.swing.JTextField();
        opcion8E = new javax.swing.JComboBox<>();
        opcion9E = new javax.swing.JSpinner();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Imitador");
        setLocation(new java.awt.Point(1200, 200));

        jPanel1.setBackground(new java.awt.Color(204, 204, 204));

        jLabel1.setBackground(new java.awt.Color(0, 0, 0));
        jLabel1.setText("Original");

        opcion2.setBackground(new java.awt.Color(204, 204, 204));
        buttonGroup1.add(opcion2);
        opcion2.setText("Opcion 2");
        opcion2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                opcion2ActionPerformed(evt);
            }
        });

        opcion2E.setBackground(new java.awt.Color(204, 204, 204));
        opcion2E.setText("Opcion 2");
        opcion2E.setEnabled(false);

        opcion3.setBackground(new java.awt.Color(204, 204, 204));
        buttonGroup1.add(opcion3);
        opcion3.setText("Opcion 3");

        opcion5.setBackground(new java.awt.Color(204, 204, 204));
        opcion5.setText("Opcion 5");

        opcion4.setBackground(new java.awt.Color(204, 204, 204));
        opcion4.setText("Opcion 4");

        opcion6.setBackground(new java.awt.Color(204, 204, 204));
        opcion6.setText("Opcion 6");

        opcion8.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        jLabel2.setBackground(new java.awt.Color(0, 0, 0));
        jLabel2.setText("Espejo");

        opcion1.setBackground(new java.awt.Color(204, 204, 204));
        buttonGroup1.add(opcion1);
        opcion1.setText("Opcion 1");

        opcion1E.setBackground(new java.awt.Color(204, 204, 204));
        opcion1E.setText("Opcion 1");
        opcion1E.setEnabled(false);

        opcion3E.setBackground(new java.awt.Color(204, 204, 204));
        opcion3E.setText("Opcion 3");
        opcion3E.setEnabled(false);

        opcion4E.setBackground(new java.awt.Color(204, 204, 204));
        opcion4E.setText("Opcion 4");
        opcion4E.setEnabled(false);

        opcion5E.setBackground(new java.awt.Color(204, 204, 204));
        opcion5E.setText("Opcion 5");
        opcion5E.setEnabled(false);

        opcion6E.setBackground(new java.awt.Color(204, 204, 204));
        opcion6E.setText("Opcion 6");
        opcion6E.setEnabled(false);

        opcion7E.setEnabled(false);

        opcion8E.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        opcion8E.setEnabled(false);

        opcion9E.setEnabled(false);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jSeparator1, javax.swing.GroupLayout.Alignment.TRAILING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(21, 21, 21)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(opcion3)
                            .addComponent(opcion2)
                            .addComponent(opcion1))
                        .addGap(36, 36, 36)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(opcion4)
                            .addComponent(opcion5)
                            .addComponent(opcion6))
                        .addGap(41, 41, 41)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(opcion7)
                            .addComponent(opcion8, 0, 100, Short.MAX_VALUE)
                            .addComponent(opcion9)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(21, 21, 21)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(opcion1E)
                            .addComponent(opcion2E)
                            .addComponent(opcion3E))
                        .addGap(34, 34, 34)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(opcion4E)
                            .addComponent(opcion5E)
                            .addComponent(opcion6E))
                        .addGap(40, 40, 40)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(opcion9E)
                            .addComponent(opcion8E, 0, 103, Short.MAX_VALUE)
                            .addComponent(opcion7E))))
                .addContainerGap(30, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(14, 14, 14)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(opcion1, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(opcion4)
                                .addComponent(opcion7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(opcion2)
                            .addComponent(opcion5))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(opcion3)
                            .addComponent(opcion6)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(49, 49, 49)
                        .addComponent(opcion8, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(opcion9, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(opcion1E)
                    .addComponent(opcion4E)
                    .addComponent(opcion7E, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(opcion2E)
                    .addComponent(opcion5E)
                    .addComponent(opcion8E, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(opcion3E)
                    .addComponent(opcion6E)
                    .addComponent(opcion9E, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(10, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void opcion2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_opcion2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_opcion2ActionPerformed

    public void RadioButtonEspejo() {
        opcion1.addItemListener(new ItemListener() {
            @Override
            public void itemStateChanged(ItemEvent e) {
                opcion1E.setSelected(opcion1.isSelected());
            }
        });
        opcion2.addItemListener(new ItemListener() {
            @Override
            public void itemStateChanged(ItemEvent e) {
                opcion2E.setSelected(opcion2.isSelected());
            }
        });
        opcion3.addItemListener(new ItemListener() {
            @Override
            public void itemStateChanged(ItemEvent e) {
                opcion3E.setSelected(opcion3.isSelected());
            }
        });
    }

    public void CheckBoxEspejo() {
        opcion4.addItemListener(new ItemListener() {
            @Override
            public void itemStateChanged(ItemEvent e) {
                opcion4E.setSelected(opcion4.isSelected());
            }
        });
        opcion5.addItemListener(new ItemListener() {
            @Override
            public void itemStateChanged(ItemEvent e) {
                opcion5E.setSelected(opcion5.isSelected());
            }
        });
        opcion6.addItemListener(new ItemListener() {
            @Override
            public void itemStateChanged(ItemEvent e) {
                opcion6E.setSelected(opcion6.isSelected());
            }
        });
    }
    
    public void TextFieldEspejo(){
        opcion7.getDocument().addDocumentListener(new DocumentListener() {
        public void insertUpdate(DocumentEvent e) { opcion7E.setText(opcion7.getText()); }
        public void removeUpdate(DocumentEvent e) { opcion7E.setText(opcion7.getText()); }
        public void changedUpdate(DocumentEvent e) { opcion7E.setText(opcion7.getText()); }
    });
    }
    
    public void ComboBoxEspejo(){
        opcion8.addItemListener(e -> opcion8E.setSelectedIndex(opcion8.getSelectedIndex()));
    }
    
    public void SpinnerEspejo(){
        opcion9.addChangeListener(e -> opcion9E.setValue(opcion9.getValue()));
    }
    
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JRadioButton opcion1;
    private javax.swing.JRadioButton opcion1E;
    private javax.swing.JRadioButton opcion2;
    private javax.swing.JRadioButton opcion2E;
    private javax.swing.JRadioButton opcion3;
    private javax.swing.JRadioButton opcion3E;
    private javax.swing.JCheckBox opcion4;
    private javax.swing.JCheckBox opcion4E;
    private javax.swing.JCheckBox opcion5;
    private javax.swing.JCheckBox opcion5E;
    private javax.swing.JCheckBox opcion6;
    private javax.swing.JCheckBox opcion6E;
    private javax.swing.JTextField opcion7;
    private javax.swing.JTextField opcion7E;
    private javax.swing.JComboBox<String> opcion8;
    private javax.swing.JComboBox<String> opcion8E;
    private javax.swing.JSpinner opcion9;
    private javax.swing.JSpinner opcion9E;
    // End of variables declaration//GEN-END:variables
}
