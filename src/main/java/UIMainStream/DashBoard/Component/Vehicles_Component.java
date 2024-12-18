package UIMainStream.DashBoard.Component;

import javax.swing.ImageIcon;

import Functions.ImageFunction;
import Models.Vehicle;

/**
 * @author DELL
 */
public class Vehicles_Component extends javax.swing.JPanel {

    public Vehicles_Component() {
        initComponents();
    }

    public Vehicles_Component(Vehicle vehicle) {
        initComponents();
        secondStageinitComponents(vehicle);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The
     * content of this method is always regenerated by the Form Editor.
     */
    // <editor-fold defaultstate="collapsed" desc="Generated
    // <editor-fold defaultstate="collapsed" desc="Generated
    // <editor-fold defaultstate="collapsed" desc="Generated
    // <editor-fold defaultstate="collapsed" desc="Generated
    // <editor-fold defaultstate="collapsed" desc="Generated
    // <editor-fold defaultstate="collapsed" desc="Generated
    // <editor-fold defaultstate="collapsed" desc="Generated
    // <editor-fold defaultstate="collapsed" desc="Generated
    // Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        name = new javax.swing.JLabel();
        type = new javax.swing.JLabel();
        bienso = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        Vitridau = new javax.swing.JLabel();
        labelvitridau = new javax.swing.JLabel();
        labelsize = new javax.swing.JLabel();
        labeltype = new javax.swing.JLabel();
        labelbienso = new javax.swing.JLabel();
        vehIcon = new javax.swing.JLabel();

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

        labelvitridau.setFont(new java.awt.Font("Comic Sans MS", 3, 18)); // NOI18N
        labelvitridau.setForeground(new java.awt.Color(153, 51, 255));
        labelvitridau.setText("[WM-2]");
        labelvitridau.setToolTipText("");

        labelsize.setFont(new java.awt.Font("Segoe UI", 2, 14)); // NOI18N
        labelsize.setText("jLabel1");

        labeltype.setFont(new java.awt.Font("Segoe UI", 2, 14)); // NOI18N
        labeltype.setText("jLabel3");

        labelbienso.setFont(new java.awt.Font("Segoe UI", 2, 14)); // NOI18N
        labelbienso.setText("jLabel4");

        vehIcon.setMaximumSize(new java.awt.Dimension(142, 142));
        vehIcon.setMinimumSize(new java.awt.Dimension(142, 142));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
                layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                        .addGroup(layout.createSequentialGroup()
                                                .addGap(14, 14, 14)
                                                .addGroup(layout
                                                        .createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING,
                                                                false)
                                                        .addComponent(type, javax.swing.GroupLayout.DEFAULT_SIZE,
                                                                javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                        .addComponent(name, javax.swing.GroupLayout.DEFAULT_SIZE,
                                                                javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                        .addComponent(bienso, javax.swing.GroupLayout.PREFERRED_SIZE,
                                                                132, javax.swing.GroupLayout.PREFERRED_SIZE))
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addGroup(layout
                                                        .createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING,
                                                                false)
                                                        .addComponent(labelsize, javax.swing.GroupLayout.DEFAULT_SIZE,
                                                                javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                        .addComponent(labelbienso, javax.swing.GroupLayout.DEFAULT_SIZE,
                                                                javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                        .addComponent(labeltype, javax.swing.GroupLayout.PREFERRED_SIZE,
                                                                140, javax.swing.GroupLayout.PREFERRED_SIZE))
                                                .addGroup(layout
                                                        .createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                        .addGroup(layout.createSequentialGroup()
                                                                .addGap(37, 37, 37)
                                                                .addComponent(labelvitridau,
                                                                        javax.swing.GroupLayout.PREFERRED_SIZE, 105,
                                                                        javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                .addPreferredGap(
                                                                        javax.swing.LayoutStyle.ComponentPlacement.RELATED,
                                                                        37, Short.MAX_VALUE)
                                                                .addComponent(vehIcon,
                                                                        javax.swing.GroupLayout.PREFERRED_SIZE, 142,
                                                                        javax.swing.GroupLayout.PREFERRED_SIZE))
                                                        .addGroup(layout.createSequentialGroup()
                                                                .addPreferredGap(
                                                                        javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                                .addComponent(Vitridau)
                                                                .addGap(0, 0, Short.MAX_VALUE))))
                                        .addGroup(layout.createSequentialGroup()
                                                .addContainerGap()
                                                .addComponent(jSeparator1)))
                                .addContainerGap()));
        layout.setVerticalGroup(
                layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createSequentialGroup()
                                .addGap(26, 26, 26)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(type)
                                        .addComponent(labeltype)
                                        .addComponent(Vitridau))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(vehIcon, javax.swing.GroupLayout.PREFERRED_SIZE, 142,
                                                javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGroup(layout
                                                .createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                                .addGroup(layout.createSequentialGroup()
                                                        .addGap(4, 4, 4)
                                                        .addComponent(labelvitridau,
                                                                javax.swing.GroupLayout.DEFAULT_SIZE,
                                                                javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                                .addGroup(layout.createSequentialGroup()
                                                        .addGroup(layout
                                                                .createParallelGroup(
                                                                        javax.swing.GroupLayout.Alignment.BASELINE)
                                                                .addComponent(bienso)
                                                                .addComponent(labelbienso))
                                                        .addGap(18, 18, 18)
                                                        .addGroup(layout
                                                                .createParallelGroup(
                                                                        javax.swing.GroupLayout.Alignment.BASELINE)
                                                                .addComponent(name)
                                                                .addComponent(labelsize)))))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED,
                                        javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 16,
                                        javax.swing.GroupLayout.PREFERRED_SIZE)));
    }// </editor-fold>//GEN-END:initComponents

    private void secondStageinitComponents(Vehicle vehicle) {
        initIcon(vehicle);

        labeltype.setText(vehicle.getType().name());
        labelsize.setText(Character.toString(vehicle.getSize()));
        labelbienso.setText(vehicle.getVehicleLicensedPlate());
        labelvitridau.setText(vehicle.getOccupiedPosition());

        // not working
        // JScrollPane scrollPane = new JScrollPane(this);
        // scrollPane.getVerticalScrollBar().setUnitIncrement(100);
    }

    private void initIcon(Vehicle vehicle) {
        String type;
        String state = "_Icon";
        type = vehicle.getHangarType();
        if (vehicle.getOccupiedPosition().equals("Unhangared")) {
            state += "_Colorless";
        }
        ImageIcon vehicleIcon = new ImageIcon(getClass().getResource("/icon/" + type + state + ".png"));
        vehIcon.setSize(142, 142);
        vehIcon.setIcon(ImageFunction.scaleImage(vehIcon, vehicleIcon));
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel Vitridau;
    private javax.swing.JLabel bienso;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JLabel labelbienso;
    private javax.swing.JLabel labelsize;
    private javax.swing.JLabel labeltype;
    private javax.swing.JLabel labelvitridau;
    private javax.swing.JLabel name;
    private javax.swing.JLabel type;
    private javax.swing.JLabel vehIcon;
    // End of variables declaration//GEN-END:variables
}
