package UIMainStream.DashBoard.Component;

import Models.Time;
import Models.User;

/**
 * @author DELL
 * @author ACER
 */
public class Request_Component extends javax.swing.JPanel {

    public Request_Component(String userId, String id, String vehicleID,
            boolean isAccepted, Time requestedTime, Time submittedTime, String type, char size) {
        initComponents();
        secondStageinitComponents(userId, id, vehicleID, isAccepted, requestedTime, submittedTime, type, size);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    // <editor-fold defaultstate="collapsed" desc="Generated
    // Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        name = new javax.swing.JLabel();
        plate = new javax.swing.JLabel();
        request = new javax.swing.JLabel();
        size = new javax.swing.JLabel();
        date = new javax.swing.JLabel();
        labelName = new javax.swing.JLabel();
        labelBienso = new javax.swing.JLabel();
        labelSize = new javax.swing.JLabel();
        labelType = new javax.swing.JLabel();
        labelsubmit = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        requesttime = new javax.swing.JLabel();
        labelreqeusted = new javax.swing.JLabel();
        status = new javax.swing.JLabel();
        labelstatus = new javax.swing.JLabel();
        idRequest = new javax.swing.JLabel();
        labelID = new javax.swing.JLabel();

        setBackground(new java.awt.Color(255, 255, 255));

        name.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        name.setText("Name");

        plate.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        plate.setText("Plate");

        request.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        request.setText("Type");

        size.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        size.setText("Size");

        date.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        date.setText("Submit Time");

        labelName.setFont(new java.awt.Font("Segoe UI", 2, 14)); // NOI18N
        labelName.setText("jLabel10");

        labelBienso.setFont(new java.awt.Font("Segoe UI", 2, 14)); // NOI18N
        labelBienso.setText("jLabel12");

        labelSize.setFont(new java.awt.Font("Segoe UI", 2, 14)); // NOI18N
        labelSize.setText("jLabel13");

        labelType.setFont(new java.awt.Font("Segoe UI", 2, 14)); // NOI18N
        labelType.setText("jLabel14");

        labelsubmit.setFont(new java.awt.Font("Segoe UI", 2, 14)); // NOI18N
        labelsubmit.setText("jLabel15");

        jSeparator1.setBackground(new java.awt.Color(0, 0, 0));

        requesttime.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        requesttime.setText("Requested Time");

        labelreqeusted.setFont(new java.awt.Font("Segoe UI", 2, 14)); // NOI18N
        labelreqeusted.setText("jLabel2");

        status.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        status.setText("Status");

        labelstatus.setFont(new java.awt.Font("Segoe UI", 2, 14)); // NOI18N
        labelstatus.setText("jLabel3");

        idRequest.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        idRequest.setText("ID Request");

        labelID.setFont(new java.awt.Font("Segoe UI", 2, 14)); // NOI18N
        labelID.setText("jLabel1");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
                layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createSequentialGroup()
                                .addGap(41, 41, 41)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(plate)
                                        .addComponent(name)
                                        .addComponent(size, javax.swing.GroupLayout.PREFERRED_SIZE, 32,
                                                javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(request, javax.swing.GroupLayout.PREFERRED_SIZE, 62,
                                                javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(13, 13, 13)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(labelName, javax.swing.GroupLayout.DEFAULT_SIZE, 136,
                                                Short.MAX_VALUE)
                                        .addComponent(labelBienso, javax.swing.GroupLayout.DEFAULT_SIZE,
                                                javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(labelSize, javax.swing.GroupLayout.DEFAULT_SIZE,
                                                javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(labelType, javax.swing.GroupLayout.DEFAULT_SIZE,
                                                javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                .addGap(40, 40, 40)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                        .addComponent(requesttime, javax.swing.GroupLayout.DEFAULT_SIZE,
                                                javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(date, javax.swing.GroupLayout.DEFAULT_SIZE,
                                                javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(status, javax.swing.GroupLayout.DEFAULT_SIZE,
                                                javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(idRequest, javax.swing.GroupLayout.DEFAULT_SIZE,
                                                javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                .addGap(44, 44, 44)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                        .addComponent(labelsubmit, javax.swing.GroupLayout.DEFAULT_SIZE, 83,
                                                Short.MAX_VALUE)
                                        .addComponent(labelstatus, javax.swing.GroupLayout.DEFAULT_SIZE,
                                                javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(labelID, javax.swing.GroupLayout.DEFAULT_SIZE,
                                                javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(labelreqeusted, javax.swing.GroupLayout.DEFAULT_SIZE,
                                                javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                .addGap(102, 102, 102))
                        .addGroup(layout.createSequentialGroup()
                                .addGap(15, 15, 15)
                                .addComponent(jSeparator1)
                                .addContainerGap()));
        layout.setVerticalGroup(
                layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createSequentialGroup()
                                .addContainerGap(27, Short.MAX_VALUE)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(layout.createSequentialGroup()
                                                .addGroup(layout
                                                        .createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                                        .addComponent(name)
                                                        .addComponent(labelName))
                                                .addGap(29, 29, 29)
                                                .addGroup(layout
                                                        .createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                                        .addComponent(plate)
                                                        .addComponent(labelBienso))
                                                .addGap(33, 33, 33)
                                                .addGroup(layout
                                                        .createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                                        .addComponent(size)
                                                        .addComponent(labelSize))
                                                .addGap(27, 27, 27)
                                                .addGroup(layout
                                                        .createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                                        .addComponent(request)
                                                        .addComponent(labelType)
                                                        .addComponent(idRequest)))
                                        .addGroup(layout.createSequentialGroup()
                                                .addComponent(requesttime)
                                                .addGap(29, 29, 29)
                                                .addComponent(date)
                                                .addGap(33, 33, 33)
                                                .addComponent(status))
                                        .addGroup(layout.createSequentialGroup()
                                                .addComponent(labelreqeusted)
                                                .addGap(29, 29, 29)
                                                .addComponent(labelsubmit)
                                                .addGap(33, 33, 33)
                                                .addComponent(labelstatus)
                                                .addGap(25, 25, 25)
                                                .addComponent(labelID)))
                                .addGap(18, 18, 18)
                                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 16,
                                        javax.swing.GroupLayout.PREFERRED_SIZE)));
    }// </editor-fold>//GEN-END:initComponents

    private void secondStageinitComponents(String userId, String id, String vehicleID,
            boolean isAccepted, Time requestedTime, Time submittedTime, String type, char size) {
        // I am thinking about sending in id and pull everything up, found the right doc
        // and update it here. but I already pull the entire thing in the mother
        // container, so I figure this is a huge waste of performance. let just take
        // needed data as params instead.
        labelName.setText(User.getInstance().getFullName());
        labelID.setText(id);
        if (isAccepted)
            labelstatus.setText("Accepted");
        else
            labelstatus.setText("Pending");
        labelBienso.setText(vehicleID);
        labelSize.setText(Character.toString(size));
        labelType.setText(type);
        // TODO set Time
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel date;
    private javax.swing.JLabel idRequest;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JLabel labelBienso;
    private javax.swing.JLabel labelID;
    private javax.swing.JLabel labelName;
    private javax.swing.JLabel labelSize;
    private javax.swing.JLabel labelType;
    private javax.swing.JLabel labelreqeusted;
    private javax.swing.JLabel labelstatus;
    private javax.swing.JLabel labelsubmit;
    private javax.swing.JLabel name;
    private javax.swing.JLabel plate;
    private javax.swing.JLabel request;
    private javax.swing.JLabel requesttime;
    private javax.swing.JLabel size;
    private javax.swing.JLabel status;
    // End of variables declaration//GEN-END:variables
}
