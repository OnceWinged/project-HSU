package UIMainStream.DashBoard.Component;

import Models.DataBase;
import Models.Report;
import Models.User;
import Models.Vehicle;

/**
 * @author DELL
 * @author ACER
 */
public class Report_Component extends javax.swing.JPanel {
    Report report;

    public Report_Component() {
        initComponents();
    }

    public Report_Component(Report report) {
        initComponents();
        secondStageinitComponents(report);

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
    // Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        labelstatus2 = new javax.swing.JLabel();
        labelnameText = new javax.swing.JLabel();
        labelTypeText = new javax.swing.JLabel();
        status = new javax.swing.JLabel();
        labelName = new javax.swing.JLabel();
        labelType = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        labelExpectedTimeText = new javax.swing.JLabel();
        labelExpectedTime = new javax.swing.JLabel();
        labelstatus = new javax.swing.JLabel();
        idReportText = new javax.swing.JLabel();
        labelId = new javax.swing.JLabel();
        confirmButton = new javax.swing.JButton();
        labelPlateText = new javax.swing.JLabel();
        labelPlate = new javax.swing.JLabel();
        hangarPosText = new javax.swing.JLabel();
        hangarPos = new javax.swing.JLabel();

        setBackground(new java.awt.Color(255, 255, 255));

        labelstatus2.setFont(new java.awt.Font("Segoe UI", 2, 14)); // NOI18N
        labelstatus2.setText("Drive in");

        labelnameText.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        labelnameText.setText("Name");

        labelTypeText.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        labelTypeText.setText("Type Vehicle");

        status.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        status.setText("Status ");

        labelName.setFont(new java.awt.Font("Segoe UI", 2, 14)); // NOI18N
        labelName.setText("userfull name");

        labelType.setFont(new java.awt.Font("Segoe UI", 2, 14)); // NOI18N
        labelType.setText("type");

        jSeparator1.setBackground(new java.awt.Color(0, 0, 0));

        labelExpectedTimeText.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        labelExpectedTimeText.setText("Expected Time");

        labelExpectedTime.setFont(new java.awt.Font("Segoe UI", 2, 14)); // NOI18N
        labelExpectedTime.setText("hh/dd/mm/yy");

        labelstatus.setFont(new java.awt.Font("Segoe UI", 2, 14)); // NOI18N
        labelstatus.setText("on going");

        idReportText.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        idReportText.setText("Report ID");

        labelId.setFont(new java.awt.Font("Segoe UI", 2, 14)); // NOI18N
        labelId.setText("0");

        confirmButton.setBackground(new java.awt.Color(102, 102, 102));
        confirmButton.setForeground(new java.awt.Color(255, 255, 255));
        confirmButton.setText("Confirm this Request is Finished");
        confirmButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                confirmButtonActionPerformed(evt);
            }
        });

        labelPlateText.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        labelPlateText.setText("Plate");

        labelPlate.setFont(new java.awt.Font("Segoe UI", 2, 14)); // NOI18N
        labelPlate.setText("hh/dd/mm/yy");

        hangarPosText.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        hangarPosText.setText("Hangar Position");

        hangarPos.setFont(new java.awt.Font("Segoe UI", 2, 14)); // NOI18N
        hangarPos.setText("---");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
                layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(layout.createSequentialGroup()
                                                .addGap(14, 14, 14)
                                                .addGroup(layout
                                                        .createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING,
                                                                false)
                                                        .addComponent(idReportText,
                                                                javax.swing.GroupLayout.Alignment.LEADING,
                                                                javax.swing.GroupLayout.DEFAULT_SIZE,
                                                                javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                        .addComponent(labelExpectedTimeText,
                                                                javax.swing.GroupLayout.Alignment.LEADING,
                                                                javax.swing.GroupLayout.DEFAULT_SIZE,
                                                                javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                        .addComponent(labelTypeText,
                                                                javax.swing.GroupLayout.Alignment.LEADING)
                                                        .addComponent(labelnameText,
                                                                javax.swing.GroupLayout.Alignment.LEADING,
                                                                javax.swing.GroupLayout.PREFERRED_SIZE, 108,
                                                                javax.swing.GroupLayout.PREFERRED_SIZE)
                                                        .addComponent(labelPlateText,
                                                                javax.swing.GroupLayout.Alignment.LEADING,
                                                                javax.swing.GroupLayout.PREFERRED_SIZE, 137,
                                                                javax.swing.GroupLayout.PREFERRED_SIZE))
                                                .addGap(18, 18, 18)
                                                .addGroup(layout
                                                        .createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                        .addGroup(layout.createSequentialGroup()
                                                                .addGroup(layout.createParallelGroup(
                                                                        javax.swing.GroupLayout.Alignment.TRAILING,
                                                                        false)
                                                                        .addComponent(labelName,
                                                                                javax.swing.GroupLayout.Alignment.LEADING,
                                                                                javax.swing.GroupLayout.DEFAULT_SIZE,
                                                                                186, Short.MAX_VALUE)
                                                                        .addComponent(labelType,
                                                                                javax.swing.GroupLayout.Alignment.LEADING,
                                                                                javax.swing.GroupLayout.DEFAULT_SIZE,
                                                                                javax.swing.GroupLayout.DEFAULT_SIZE,
                                                                                Short.MAX_VALUE))
                                                                .addPreferredGap(
                                                                        javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                                .addGroup(layout.createParallelGroup(
                                                                        javax.swing.GroupLayout.Alignment.LEADING,
                                                                        false)
                                                                        .addGroup(layout.createSequentialGroup()
                                                                                .addComponent(status)
                                                                                .addPreferredGap(
                                                                                        javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                                                                .addComponent(labelstatus,
                                                                                        javax.swing.GroupLayout.PREFERRED_SIZE,
                                                                                        84,
                                                                                        javax.swing.GroupLayout.PREFERRED_SIZE))
                                                                        .addComponent(hangarPosText,
                                                                                javax.swing.GroupLayout.DEFAULT_SIZE,
                                                                                javax.swing.GroupLayout.DEFAULT_SIZE,
                                                                                Short.MAX_VALUE))
                                                                .addPreferredGap(
                                                                        javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                                .addGroup(layout.createParallelGroup(
                                                                        javax.swing.GroupLayout.Alignment.LEADING)
                                                                        .addComponent(labelstatus2,
                                                                                javax.swing.GroupLayout.DEFAULT_SIZE,
                                                                                93, Short.MAX_VALUE)
                                                                        .addComponent(hangarPos,
                                                                                javax.swing.GroupLayout.Alignment.TRAILING,
                                                                                javax.swing.GroupLayout.DEFAULT_SIZE,
                                                                                93, Short.MAX_VALUE)))
                                                        .addGroup(layout.createSequentialGroup()
                                                                .addGroup(layout.createParallelGroup(
                                                                        javax.swing.GroupLayout.Alignment.LEADING)
                                                                        .addComponent(labelExpectedTime,
                                                                                javax.swing.GroupLayout.PREFERRED_SIZE,
                                                                                186,
                                                                                javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                        .addComponent(labelPlate,
                                                                                javax.swing.GroupLayout.PREFERRED_SIZE,
                                                                                186,
                                                                                javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                        .addGroup(layout.createSequentialGroup()
                                                                                .addComponent(labelId,
                                                                                        javax.swing.GroupLayout.PREFERRED_SIZE,
                                                                                        186,
                                                                                        javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                                .addPreferredGap(
                                                                                        javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                                                .addComponent(confirmButton,
                                                                                        javax.swing.GroupLayout.PREFERRED_SIZE,
                                                                                        220,
                                                                                        javax.swing.GroupLayout.PREFERRED_SIZE)))
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
                                        .addComponent(labelnameText)
                                        .addComponent(labelName, javax.swing.GroupLayout.PREFERRED_SIZE, 25,
                                                javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(status)
                                        .addComponent(labelstatus)
                                        .addComponent(labelstatus2))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                        .addComponent(labelTypeText)
                                        .addGroup(layout.createSequentialGroup()
                                                .addGroup(layout
                                                        .createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                                        .addComponent(labelType, javax.swing.GroupLayout.DEFAULT_SIZE,
                                                                javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                        .addComponent(hangarPosText)
                                                        .addComponent(hangarPos))
                                                .addGap(1, 1, 1)))
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(labelExpectedTimeText)
                                        .addComponent(labelExpectedTime, javax.swing.GroupLayout.PREFERRED_SIZE, 25,
                                                javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(labelPlateText)
                                        .addComponent(labelPlate, javax.swing.GroupLayout.PREFERRED_SIZE, 25,
                                                javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(idReportText)
                                        .addComponent(labelId)
                                        .addComponent(confirmButton))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 11,
                                        Short.MAX_VALUE)
                                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 10,
                                        javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addContainerGap()));
    }// </editor-fold>//GEN-END:initComponents

    private void confirmButtonActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_confirmButtonActionPerformed
        report.setStatus(true);

        Vehicle veh = new Vehicle(report.getVehicleID());
        veh.reconstuct();

        if (report.getType().equals("Drive In")) {
            veh.setOccupiedPosition(true);
        } else {
            veh.setOccupiedPosition(false);
        }
        System.out.println("detected vessels move!");

        report.userBond();
        report.save();
        veh.userBond();
        veh.save();// TODO commented for testing, uncomment this on demo
        secondStageinitComponents(report);
    }// GEN-LAST:event_confirmButtonActionPerformed

    private void secondStageinitComponents(Report report) {
        this.report = report;

        Vehicle vehicle = new Vehicle(report.getVehicleID());
        vehicle.reconstuct();// pull it from database

        labelName.setText(User.getInstance().getFullName());
        labelId.setText(report.getId());
        labelPlate.setText(vehicle.getVehicleLicensedPlate());
        labelType.setText(vehicle.getType().name());
        // get the object, as an enum it have .name()
        // that return a String name of the constant.
        labelExpectedTime.setText(report.getExpectedTime().toString());

        if (report.getStatus()) {
            labelstatus.setText("Completed.");
            confirmButton.setVisible(false);
        } else {
            labelstatus.setText("On progress.");
            confirmButton.setVisible(true);
        }
        labelstatus2.setText(report.getType());
        hangarPos.setText(vehicle.getOccupiedPosition());
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton confirmButton;
    private javax.swing.JLabel hangarPos;
    private javax.swing.JLabel hangarPosText;
    private javax.swing.JLabel idReportText;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JLabel labelExpectedTime;
    private javax.swing.JLabel labelExpectedTimeText;
    private javax.swing.JLabel labelId;
    private javax.swing.JLabel labelName;
    private javax.swing.JLabel labelPlate;
    private javax.swing.JLabel labelPlateText;
    private javax.swing.JLabel labelType;
    private javax.swing.JLabel labelTypeText;
    private javax.swing.JLabel labelnameText;
    private javax.swing.JLabel labelstatus;
    private javax.swing.JLabel labelstatus2;
    private javax.swing.JLabel status;
    // End of variables declaration//GEN-END:variables
}
