package UIMainStream.DashBoard.Component;

import Models.*;

/**
 * @author DELL
 * @author ACER
 */
public class Request_Component extends javax.swing.JPanel {
    Request request;

    public Request_Component() {
        initComponents();
    }

    public Request_Component(Request request) {
        initComponents();
        secondStageinitComponents(request);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
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
        plate = new javax.swing.JLabel();
        requestTypeText = new javax.swing.JLabel();
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
        trashButton = new javax.swing.JButton();

        setBackground(new java.awt.Color(255, 255, 255));

        name.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        name.setText("Owner");

        plate.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        plate.setText("Plate");

        requestTypeText.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        requestTypeText.setText("Type");

        size.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        size.setText("Size");

        date.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
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

        requesttime.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        requesttime.setText("Requested Time");

        labelreqeusted.setFont(new java.awt.Font("Segoe UI", 2, 14)); // NOI18N
        labelreqeusted.setText("jLabel2");

        status.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        status.setText("Status");

        labelstatus.setFont(new java.awt.Font("Segoe UI", 2, 14)); // NOI18N
        labelstatus.setText("jLabel3");

        idRequest.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        idRequest.setText("Request ID");

        labelID.setFont(new java.awt.Font("Segoe UI", 2, 14)); // NOI18N
        labelID.setText("jLabel1");

        trashButton.setBackground(new java.awt.Color(102, 102, 102));
        trashButton.setForeground(new java.awt.Color(255, 255, 255));
        trashButton.setText("Abort this!");
        trashButton.setActionCommand("");
        trashButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                trashButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
                layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(jSeparator1)
                                .addContainerGap())
                        .addGroup(layout.createSequentialGroup()
                                .addGap(14, 14, 14)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                        .addComponent(trashButton)
                                        .addGroup(layout.createSequentialGroup()
                                                .addGroup(layout
                                                        .createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                        .addComponent(name, javax.swing.GroupLayout.Alignment.TRAILING,
                                                                javax.swing.GroupLayout.PREFERRED_SIZE, 138,
                                                                javax.swing.GroupLayout.PREFERRED_SIZE)
                                                        .addComponent(plate, javax.swing.GroupLayout.Alignment.TRAILING,
                                                                javax.swing.GroupLayout.PREFERRED_SIZE, 138,
                                                                javax.swing.GroupLayout.PREFERRED_SIZE)
                                                        .addComponent(requesttime)
                                                        .addComponent(date, javax.swing.GroupLayout.PREFERRED_SIZE, 137,
                                                                javax.swing.GroupLayout.PREFERRED_SIZE))
                                                .addGap(62, 62, 62)
                                                .addGroup(layout
                                                        .createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING,
                                                                false)
                                                        .addComponent(labelreqeusted,
                                                                javax.swing.GroupLayout.Alignment.LEADING,
                                                                javax.swing.GroupLayout.DEFAULT_SIZE,
                                                                javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                        .addComponent(labelBienso,
                                                                javax.swing.GroupLayout.Alignment.LEADING,
                                                                javax.swing.GroupLayout.DEFAULT_SIZE, 154,
                                                                Short.MAX_VALUE)
                                                        .addComponent(labelName,
                                                                javax.swing.GroupLayout.Alignment.LEADING,
                                                                javax.swing.GroupLayout.DEFAULT_SIZE,
                                                                javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                        .addComponent(labelsubmit, javax.swing.GroupLayout.DEFAULT_SIZE,
                                                                javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addGroup(layout
                                                        .createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                        .addComponent(status, javax.swing.GroupLayout.PREFERRED_SIZE,
                                                                104, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                        .addComponent(idRequest, javax.swing.GroupLayout.PREFERRED_SIZE,
                                                                104, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                        .addComponent(requestTypeText,
                                                                javax.swing.GroupLayout.PREFERRED_SIZE, 104,
                                                                javax.swing.GroupLayout.PREFERRED_SIZE)
                                                        .addComponent(size, javax.swing.GroupLayout.PREFERRED_SIZE, 104,
                                                                javax.swing.GroupLayout.PREFERRED_SIZE))
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addGroup(layout
                                                        .createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING,
                                                                false)
                                                        .addComponent(labelSize,
                                                                javax.swing.GroupLayout.Alignment.LEADING,
                                                                javax.swing.GroupLayout.DEFAULT_SIZE, 115,
                                                                Short.MAX_VALUE)
                                                        .addComponent(labelstatus,
                                                                javax.swing.GroupLayout.Alignment.LEADING,
                                                                javax.swing.GroupLayout.DEFAULT_SIZE,
                                                                javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                        .addComponent(labelID, javax.swing.GroupLayout.DEFAULT_SIZE,
                                                                javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                        .addComponent(labelType, javax.swing.GroupLayout.DEFAULT_SIZE,
                                                                javax.swing.GroupLayout.DEFAULT_SIZE,
                                                                Short.MAX_VALUE))))
                                .addContainerGap(21, Short.MAX_VALUE)));
        layout.setVerticalGroup(
                layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createSequentialGroup()
                                .addGap(24, 24, 24)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(name)
                                        .addComponent(labelName)
                                        .addComponent(size)
                                        .addComponent(labelSize))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(plate)
                                        .addComponent(labelBienso)
                                        .addComponent(requestTypeText)
                                        .addComponent(labelType))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                        .addGroup(layout.createSequentialGroup()
                                                .addGroup(layout
                                                        .createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                                        .addComponent(labelreqeusted)
                                                        .addComponent(status)
                                                        .addComponent(labelstatus))
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addGroup(layout
                                                        .createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                                        .addComponent(labelsubmit)
                                                        .addComponent(idRequest)
                                                        .addComponent(labelID)))
                                        .addGroup(layout.createSequentialGroup()
                                                .addComponent(requesttime)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(date)))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 21,
                                        Short.MAX_VALUE)
                                .addComponent(trashButton)
                                .addGap(18, 18, 18)
                                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 16,
                                        javax.swing.GroupLayout.PREFERRED_SIZE)));
    }// </editor-fold>//GEN-END:initComponents

    private void trashButtonActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_trashButtonActionPerformed
        if (request.getStatus()) // then the actual intended input is for clear button
        {// request only enter abort state AFTER it is accepted so I can ignore that here
            DataBase.userBond(request, true);
            java.awt.Container g = getParent();
            g.remove(this);
            if (g.getComponentCount() == 0)
                g.add(new Empty_Screen());
            g.revalidate();
            g.repaint();
            return;
        }
        request.abort(true);
        DataBase.userBond(request, false);
        request.save();

        System.out.println("A tranfering request was aborted!");
        reload();
    }// GEN-LAST:event_trashButtonActionPerformed

    public void reload() {
        secondStageinitComponents(request);
    }

    private void secondStageinitComponents(Request request) {
        this.request = request;
        // create veh and add id
        Vehicle vehicle = new Vehicle(request.getVehicleID());
        DataBase.vormit(vehicle);// pull it from database
        User user = new User(vehicle.getUserID());
        user.reconstruct();

        labelName.setText(user.getFullName());
        labelID.setText(request.getId());
        labelBienso.setText(vehicle.getVehicleLicensedPlate());
        labelSize.setText(Character.toString(vehicle.getSize()));
        labelType.setText(vehicle.getType().name());
        // get the object, as an enum it have .name()

        // that return a String name of the constant.

        labelreqeusted.setText(request.getRequestedTime().toString());
        labelsubmit.setText(request.getSubmittedTime().toString());
        if (request.aborted()) {
            labelstatus.setText("Aborted.");
            trashButton.setText("Clear this.");
            trashButton.setBackground(new java.awt.Color(102, 102, 102));
        } else if (request.getStatus()) {
            labelstatus.setText("Accepted");
            trashButton.setText("Clear this.");
            trashButton.setBackground(new java.awt.Color(102, 102, 102));
        } else {
            labelstatus.setText("Pending");
            trashButton.setText("Abort this!");
            trashButton.setBackground(new java.awt.Color(255, 0, 50));
        }

        User master = User.getInstance();
        if (master.getAdminRight() && !master.getId().equals(user.getId())) {
            // view is admin but not owner of the docs. desable confirm
            trashButton.setVisible(false);
            trashButton.setEnabled(false);
        }
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
    private javax.swing.JLabel requestTypeText;
    private javax.swing.JLabel requesttime;
    private javax.swing.JLabel size;
    private javax.swing.JLabel status;
    private javax.swing.JButton trashButton;
    // End of variables declaration//GEN-END:variables
}
