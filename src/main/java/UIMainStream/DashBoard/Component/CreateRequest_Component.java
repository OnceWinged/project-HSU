package UIMainStream.DashBoard.Component;

import javax.swing.JOptionPane;

import Models.DataBase;
import Models.Request;
import Models.Time;
import Models.User;
import Models.Vehicle;
import Models.eVesselType;

public class CreateRequest_Component extends javax.swing.JPanel {

    public final int suggestedDelay = 5;

        public CreateRequest_Component() {
                initComponents();
                checkBoxIn.setSelected(true);// preset document type.
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
        // <editor-fold defaultstate="collapsed" desc="Generated
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        typeLabel = new javax.swing.JLabel();
        requestedHour = new javax.swing.JTextField();
        requestedTimeLabel = new javax.swing.JLabel();
        type = new javax.swing.JComboBox<eVesselType>(eVesselType.values());
        cancel = new javax.swing.JButton();
        create = new javax.swing.JButton();
        plateLabel = new javax.swing.JLabel();
        textbienso = new javax.swing.JTextField();
        requestedDay = new javax.swing.JTextField();
        requestedYear = new javax.swing.JTextField();
        requestedMonth = new javax.swing.JTextField();
        DecorativeLabel1 = new javax.swing.JLabel();
        DecorativeLabel2 = new javax.swing.JLabel();
        DecorativeLabel3 = new javax.swing.JLabel();
        checkBoxIn = new javax.swing.JCheckBox();
        checkBoxOut = new javax.swing.JCheckBox();
        demoHintLabel = new javax.swing.JLabel();

        setBackground(new java.awt.Color(255, 255, 255));

        typeLabel.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        typeLabel.setText("Type Vehicle");

        requestedHour.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        requestedHour.setText("23");

        requestedTimeLabel.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        requestedTimeLabel.setText("I expected to have this happend at:");

        type.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N

        cancel.setBackground(new java.awt.Color(102, 102, 102));
        cancel.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        cancel.setForeground(new java.awt.Color(255, 255, 255));
        cancel.setText("Cancel");
        cancel.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                cancelMouseClicked(evt);
            }
        });

        create.setBackground(new java.awt.Color(102, 102, 102));
        create.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        create.setForeground(new java.awt.Color(255, 255, 255));
        create.setText("Create ");
        create.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                createMouseClicked(evt);
            }
        });

        plateLabel.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        plateLabel.setText("Plate");

        textbienso.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N

        requestedDay.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        requestedDay.setText("15");

        requestedYear.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        requestedYear.setText("2024");
        requestedYear.setEnabled(false);
        requestedYear.setFocusable(false);

        requestedMonth.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        requestedMonth.setText("12");

        DecorativeLabel1.setText(": 00 of ");

        DecorativeLabel2.setText("/");

        DecorativeLabel3.setText("/");

        checkBoxIn.setBackground(new java.awt.Color(255, 255, 255));
        checkBoxIn.setText("Drive In");
        checkBoxIn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                checkBoxInMouseClicked(evt);
            }
        });

        checkBoxOut.setBackground(new java.awt.Color(255, 255, 255));
        checkBoxOut.setText("Drive Out");
        checkBoxOut.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                checkBoxOutMouseClicked(evt);
            }
        });

        demoHintLabel.setFont(new java.awt.Font("Segoe UI", 2, 10)); // NOI18N
        demoHintLabel.setText("for demo, only 1 vessel is registered for transfering per hours.");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(69, 69, 69)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(plateLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 72, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(typeLabel)
                    .addComponent(requestedTimeLabel)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(checkBoxIn)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(checkBoxOut)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 200, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(type, javax.swing.GroupLayout.PREFERRED_SIZE, 183, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(textbienso, javax.swing.GroupLayout.PREFERRED_SIZE, 183, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGroup(layout.createSequentialGroup()
                            .addComponent(cancel)
                            .addGap(31, 31, 31)
                            .addComponent(create)))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(requestedHour, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(DecorativeLabel1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(requestedDay, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(3, 3, 3)
                        .addComponent(DecorativeLabel2)
                        .addGap(4, 4, 4)
                        .addComponent(requestedMonth, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(3, 3, 3)
                        .addComponent(DecorativeLabel3)
                        .addGap(4, 4, 4)
                        .addComponent(requestedYear, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(77, 77, 77))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(demoHintLabel)
                .addGap(62, 62, 62))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(72, 72, 72)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(typeLabel)
                    .addComponent(type, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(26, 26, 26)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(requestedTimeLabel)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(requestedHour, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(requestedDay, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(requestedMonth, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(requestedYear, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(DecorativeLabel1)
                        .addComponent(DecorativeLabel2)
                        .addComponent(DecorativeLabel3)))
                .addGap(2, 2, 2)
                .addComponent(demoHintLabel)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(textbienso, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(plateLabel))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(cancel)
                        .addComponent(create))
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(checkBoxIn)
                        .addComponent(checkBoxOut)))
                .addContainerGap(232, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

        private void checkBoxOutMouseClicked(java.awt.event.MouseEvent evt) {// GEN-FIRST:event_checkBoxOutMouseClicked
                checkBoxIn.setSelected(false);
        }// GEN-LAST:event_checkBoxOutMouseClicked

    private void checkBoxInMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_checkBoxInMouseClicked
        checkBoxOut.setSelected(false);
    }//GEN-LAST:event_checkBoxInMouseClicked

    private void requestedHourMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_requestedHourMouseClicked
        // TODO add your handling code here:
        
    }//GEN-LAST:event_requestedHourMouseClicked

        private void createMouseClicked(java.awt.event.MouseEvent evt) {// GEN-FIRST:event_createMouseClicked
                JOptionPane.showMessageDialog(this, "Document successfully submited at : \n");// TODO

        Time requestedTime = new Time(requestedHour.getText(), requestedDay.getText(), requestedMonth.getText(),
                requestedYear.getText());

                // create req and vehcle + save them to dataBank
                createRequest(createVehicle(), requestedTime);

        resetAllTextes();
    }// GEN-LAST:event_createMouseClicked

    private void cancelMouseClicked(java.awt.event.MouseEvent evt) {// GEN-FIRST:event_cancelMouseClicked
        JOptionPane.showMessageDialog(this, "All choices cancled!");
        resetAllTextes();
    }// GEN-LAST:event_cancelMouseClicked

    public void resetAllTextes() {
        textbienso.setText("XX-XXX-XXX");
        checkBoxIn.setSelected(false);
        checkBoxOut.setSelected(false);
        type.setSelectedIndex(0);

        Time now = new Time();// Get current time as default, and move forward 5h as default
        requestedHour.setText(Integer.toString(now.getHour() + suggestedDelay));
        requestedDay.setText(Integer.toString(now.getDay()));
        requestedMonth.setText(Integer.toString(now.getMonth()));
        requestedYear.setText(Integer.toString(now.getYear()));
    }

        private Request createRequest(Vehicle vehicle, Time requestedTime) {
                Time submittedTime = new Time();
                String type;

        if (checkBoxIn.isSelected()) {
            type = "Drive In";
        } else {
            type = "Drive Out";
        }
        Request request = new Request(User.getInstance().getId(), vehicle.getId(),
                requestedTime, submittedTime, type);
        request.save();
        return request;
    }

    private Vehicle createVehicle() {
        Vehicle vehicle = new Vehicle();
        eVesselType selectedType = (eVesselType) type.getSelectedItem();

        vehicle.setType(selectedType);
        vehicle.setHangarType(selectedType.getHangarType());
        vehicle.setSize(selectedType.getSize());

        vehicle.setVehicleLicensedPlate(textbienso.getText());
        vehicle.setUserID(User.getInstance().getId());
        DataBase.IdDistributor(vehicle);

        vehicle.save();
        return vehicle;
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel DecorativeLabel1;
    private javax.swing.JLabel DecorativeLabel2;
    private javax.swing.JLabel DecorativeLabel3;
    private javax.swing.JButton cancel;
    private javax.swing.JCheckBox checkBoxIn;
    private javax.swing.JCheckBox checkBoxOut;
    private javax.swing.JButton create;
    private javax.swing.JLabel demoHintLabel;
    private javax.swing.JLabel plateLabel;
    private javax.swing.JTextField requestedDay;
    private javax.swing.JTextField requestedHour;
    private javax.swing.JTextField requestedMonth;
    private javax.swing.JLabel requestedTimeLabel;
    private javax.swing.JTextField requestedYear;
    private javax.swing.JTextField textbienso;
    private javax.swing.JComboBox<eVesselType> type;
    private javax.swing.JLabel typeLabel;
    // End of variables declaration//GEN-END:variables

    private boolean checkValidHours(String hour) {
        try {
            int hourValue = Integer.parseInt(hour);
            return hourValue >= 0 && hourValue <= 24;
        } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(null, "Invalid hours !");
        }
        return false;
    }

    private boolean checkDate(String day, String month) {
        int monthValue = 0;
        int dayValue = 0;

        try { // 
            monthValue = Integer.parseInt(month);
        } catch (NumberFormatException e) {
            //JOptionPane.showMessageDialog(null, "Invalid month !");
            return false;
        }

        try { // 
            dayValue = Integer.parseInt(day);
        } catch (NumberFormatException e) {
            //JOptionPane.showMessageDialog(null, "Invalid day !");
            return false;
        }
        
        boolean checkedDay = checkValidDay(dayValue);
        boolean checkedMonth = checkValidMonth(monthValue);

        if (!checkedDay || !checkedMonth) {
            //JOptionPane.showMessageDialog(null, "Invalid input !");
            return false;
        } else {
            switch (monthValue) {
                case 1, 3, 5, 7, 8, 10, 12:
                    return dayValue >= 1 && dayValue <= 31;
                case 2:
                    return dayValue >= 1 && dayValue <= 29;
                default:
                    return dayValue >= 1 && dayValue <= 30;
            }
        }
    }

    private boolean checkValidDay(int dayValue) {
        return dayValue >= 1 && dayValue <= 31;
    }

    private boolean checkValidMonth(int monthValue) {
        return monthValue >= 1 && monthValue <= 12;
    }
}
