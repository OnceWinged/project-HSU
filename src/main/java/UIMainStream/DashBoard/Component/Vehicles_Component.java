package UIMainStream.DashBoard.Component;

/**
 * @author DELL
 */
public class Vehicles_Component extends javax.swing.JPanel {
    public Vehicles_Component() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        name = new javax.swing.JLabel();
        type = new javax.swing.JLabel();
        bienso = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        Vitridau = new javax.swing.JLabel();
        labelvitridau = new javax.swing.JLabel();
        labelsize = new javax.swing.JLabel();
        labeltype = new javax.swing.JLabel();
        labelbiéno = new javax.swing.JLabel();

        setBackground(new java.awt.Color(255, 255, 255));

        name.setBackground(new java.awt.Color(255, 255, 255));
        name.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        name.setText("Size");

        type.setBackground(new java.awt.Color(255, 255, 255));
        type.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        type.setText("Vehicle's Type");

        bienso.setBackground(new java.awt.Color(255, 255, 255));
        bienso.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        bienso.setText("Plate");

        jSeparator1.setBackground(new java.awt.Color(0, 0, 0));

        Vitridau.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        Vitridau.setText("Hangared Posistion");

        labelvitridau.setFont(new java.awt.Font("Segoe UI", 2, 14)); // NOI18N
        labelvitridau.setText("jLabel2");

        labelsize.setFont(new java.awt.Font("Segoe UI", 2, 14)); // NOI18N
        labelsize.setText("jLabel1");

        labeltype.setFont(new java.awt.Font("Segoe UI", 2, 14)); // NOI18N
        labeltype.setText("jLabel3");

        labelbiéno.setFont(new java.awt.Font("Segoe UI", 2, 14)); // NOI18N
        labelbiéno.setText("jLabel4");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(63, 63, 63)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(name)
                                        .addGap(164, 164, 164))
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(bienso, javax.swing.GroupLayout.PREFERRED_SIZE, 63, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(135, 135, 135))
                                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                        .addComponent(Vitridau)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)))
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(labelbiéno, javax.swing.GroupLayout.DEFAULT_SIZE, 170, Short.MAX_VALUE)
                                    .addComponent(labelsize, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(labelvitridau, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(type)
                                .addGap(18, 18, 18)
                                .addComponent(labeltype, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 488, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(26, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(type)
                    .addComponent(labeltype))
                .addGap(30, 30, 30)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(name)
                    .addComponent(labelsize))
                .addGap(28, 28, 28)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(bienso)
                    .addComponent(labelbiéno))
                .addGap(27, 27, 27)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Vitridau)
                    .addComponent(labelvitridau))
                .addGap(57, 57, 57)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 12, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(26, 26, 26))
        );
    }// </editor-fold>//GEN-END:initComponents

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel Vitridau;
    private javax.swing.JLabel bienso;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JLabel labelbiéno;
    private javax.swing.JLabel labelsize;
    private javax.swing.JLabel labeltype;
    private javax.swing.JLabel labelvitridau;
    private javax.swing.JLabel name;
    private javax.swing.JLabel type;
    // End of variables declaration//GEN-END:variables
}
