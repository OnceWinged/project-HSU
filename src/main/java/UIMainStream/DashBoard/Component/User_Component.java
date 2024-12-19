package UIMainStream.DashBoard.Component;

import java.awt.Color;
import java.util.LinkedList;

import javax.swing.ImageIcon;
import javax.swing.JOptionPane;

import Functions.ImageFunction;
import Models.Report;
import Models.Request;
import Models.User;

/**
 * @author Pham Trung Duc
 * @author Huynh Kim Ai
 */
public class User_Component extends javax.swing.JPanel {

    private User user;
    private boolean inEditMode = false;

    public User_Component() {
        initComponents();
        secondStageinitComponents();
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
    // <editor-fold defaultstate="collapsed" desc="Generated
    // Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        name = new javax.swing.JLabel();
        birthday = new javax.swing.JLabel();
        cancel = new javax.swing.JButton();
        editButton = new javax.swing.JButton();
        textname = new javax.swing.JTextField();
        textbirthday = new javax.swing.JTextField();
        satisticLabelPending = new javax.swing.JLabel();
        satisticLabelOngoing = new javax.swing.JLabel();
        satisticLabelPendingOutput = new javax.swing.JLabel();
        satisticLabelOngoingOutput = new javax.swing.JLabel();
        userIcon = new javax.swing.JLabel();
        logo = new javax.swing.JLabel();

        setBackground(new java.awt.Color(255, 255, 255));

        name.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        name.setText("Name");

        birthday.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        birthday.setText("Birthday");

        cancel.setBackground(new java.awt.Color(102, 102, 102));
        cancel.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        cancel.setForeground(new java.awt.Color(255, 255, 255));
        cancel.setText("Cancel");
        cancel.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                cancelMouseClicked(evt);
            }
        });

        editButton.setBackground(new java.awt.Color(102, 102, 102));
        editButton.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        editButton.setForeground(new java.awt.Color(255, 255, 255));
        editButton.setText("Edit");
        editButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                editButtonMouseClicked(evt);
            }
        });

        textname.setBackground(new java.awt.Color(200, 200, 200));
        textname.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        textname.setFocusable(false);

        textbirthday.setBackground(new java.awt.Color(200, 200, 200));
        textbirthday.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        textbirthday.setFocusable(false);

        satisticLabelPending.setFont(new java.awt.Font("Comic Sans MS", 2, 12)); // NOI18N
        satisticLabelPending.setText("Number of pending request:");

        satisticLabelOngoing.setFont(new java.awt.Font("Comic Sans MS", 2, 12)); // NOI18N
        satisticLabelOngoing.setText("Number of ongoing request:");

        satisticLabelPendingOutput.setFont(new java.awt.Font("Comic Sans MS", 2, 12)); // NOI18N
        satisticLabelPendingOutput.setText(">0w0< none to count for now.");

        satisticLabelOngoingOutput.setFont(new java.awt.Font("Comic Sans MS", 2, 12)); // NOI18N
        satisticLabelOngoingOutput.setText(">0w0< none to count for now.");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
                layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addGap(19, 19, 19)
                                .addComponent(userIcon, javax.swing.GroupLayout.PREFERRED_SIZE, 200,
                                        javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 45,
                                        Short.MAX_VALUE)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(layout.createSequentialGroup()
                                                .addComponent(satisticLabelPending)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(satisticLabelPendingOutput))
                                        .addGroup(layout.createSequentialGroup()
                                                .addGroup(layout
                                                        .createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING,
                                                                false)
                                                        .addComponent(name, javax.swing.GroupLayout.DEFAULT_SIZE,
                                                                javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                        .addComponent(birthday, javax.swing.GroupLayout.DEFAULT_SIZE,
                                                                147, Short.MAX_VALUE))
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addGroup(layout
                                                        .createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                        .addGroup(layout
                                                                .createParallelGroup(
                                                                        javax.swing.GroupLayout.Alignment.LEADING)
                                                                .addComponent(textname,
                                                                        javax.swing.GroupLayout.Alignment.TRAILING,
                                                                        javax.swing.GroupLayout.PREFERRED_SIZE, 172,
                                                                        javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                .addComponent(textbirthday,
                                                                        javax.swing.GroupLayout.Alignment.TRAILING,
                                                                        javax.swing.GroupLayout.PREFERRED_SIZE, 172,
                                                                        javax.swing.GroupLayout.PREFERRED_SIZE))
                                                        .addGroup(layout.createSequentialGroup()
                                                                .addComponent(cancel,
                                                                        javax.swing.GroupLayout.PREFERRED_SIZE, 80,
                                                                        javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                .addPreferredGap(
                                                                        javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                                                .addComponent(editButton,
                                                                        javax.swing.GroupLayout.PREFERRED_SIZE, 80,
                                                                        javax.swing.GroupLayout.PREFERRED_SIZE))))
                                        .addGroup(layout.createSequentialGroup()
                                                .addComponent(satisticLabelOngoing)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(satisticLabelOngoingOutput)))
                                .addGap(31, 31, 31))
                        .addGroup(layout.createSequentialGroup()
                                .addGap(66, 66, 66)
                                .addComponent(logo, javax.swing.GroupLayout.PREFERRED_SIZE, 173,
                                        javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)));
        layout.setVerticalGroup(
                layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createSequentialGroup()
                                .addGap(55, 55, 55)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                        .addGroup(layout.createSequentialGroup()
                                                .addGroup(layout
                                                        .createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                                        .addComponent(textname, javax.swing.GroupLayout.PREFERRED_SIZE,
                                                                javax.swing.GroupLayout.DEFAULT_SIZE,
                                                                javax.swing.GroupLayout.PREFERRED_SIZE)
                                                        .addComponent(name))
                                                .addGap(18, 18, 18)
                                                .addGroup(layout
                                                        .createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                                        .addComponent(textbirthday,
                                                                javax.swing.GroupLayout.PREFERRED_SIZE,
                                                                javax.swing.GroupLayout.DEFAULT_SIZE,
                                                                javax.swing.GroupLayout.PREFERRED_SIZE)
                                                        .addComponent(birthday))
                                                .addGap(18, 18, 18)
                                                .addGroup(layout
                                                        .createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                                        .addComponent(cancel)
                                                        .addComponent(editButton))
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addGroup(layout
                                                        .createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                                        .addComponent(satisticLabelPending)
                                                        .addComponent(satisticLabelPendingOutput))
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addGroup(layout
                                                        .createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                                        .addComponent(satisticLabelOngoing)
                                                        .addComponent(satisticLabelOngoingOutput)))
                                        .addComponent(userIcon, javax.swing.GroupLayout.PREFERRED_SIZE, 200,
                                                javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(18, 18, 18)
                                .addComponent(logo, javax.swing.GroupLayout.PREFERRED_SIZE, 63,
                                        javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addContainerGap(28, Short.MAX_VALUE)));
    }// </editor-fold>//GEN-END:initComponents

    private void secondStageinitComponents() {
        initIcon();

        user = User.getInstance();
        resetAllTextes();

        // use warping class Integer and its toString() :3333
        LinkedList<Request> pendingList = new LinkedList<Request>();
        LinkedList<Report> ongoingList = new LinkedList<Report>();
        for (Request r : user.getRequests()) {
                if (!r.getStatus())
                        pendingList.add(r);
        }
        for (Report r : user.getReports()) {
                if (!r.getStatus())
                        ongoingList.add(r);
        }
        satisticLabelPendingOutput.setText(Integer.toString(pendingList.size())+" ");
        satisticLabelOngoingOutput.setText(Integer.toString(ongoingList.size())+" ");
    }

    private void initIcon() {
        ImageIcon icon = new ImageIcon(getClass().getResource("/icon/user_Icon.png"));
        userIcon.setSize(200, 200);
        userIcon.setIcon(ImageFunction.scaleImage(userIcon, icon));
    }

    private void editButtonMouseClicked(java.awt.event.MouseEvent evt) {// GEN-FIRST:event_saveMouseClicked
        if (inEditMode) {// in editmode
            setFocusableInfo(!inEditMode);
            JOptionPane.showMessageDialog(this, "User Infor is Updated!");
            updateUserInfo();
            user = User.getInstance();// pull new user
            editButton.setText("Edit");
        } else {// in view mode
            setFocusableInfo(!inEditMode);
            editButton.setText("Save");
        }
        resetAllTextes();
        inEditMode = !inEditMode;
    }// GEN-LAST:event_saveMouseClicked

    private void cancelMouseClicked(java.awt.event.MouseEvent evt) {// GEN-FIRST:event_cancelMouseClicked
        JOptionPane.showMessageDialog(this, "Change canceled!");
        resetAllTextes();
    }// GEN-LAST:event_cancelMouseClicked

    private void resetAllTextes() {
        textname.setText(user.getFullName());
        textbirthday.setText(user.getDateOfBirth());
    }

    private void updateUserInfo() {
        user.setFullName(textname.getText());
        user.setDateOfBirth(textbirthday.getText());
        user.save();
    }

    private void setFocusableInfo(boolean state) {
        textbirthday.setFocusable(state);
        textname.setFocusable(state);
        if (!state) {
            textname.setBackground(new Color(200, 200, 200));
            textbirthday.setBackground(new Color(200, 200, 200));
        } else {
            textname.setBackground(new Color(255, 255, 255));
            textbirthday.setBackground(new Color(255, 255, 255));
        }

    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel birthday;
    private javax.swing.JButton cancel;
    private javax.swing.JButton editButton;
    private javax.swing.JLabel logo;
    private javax.swing.JLabel name;
    private javax.swing.JLabel satisticLabelOngoing;
    private javax.swing.JLabel satisticLabelOngoingOutput;
    private javax.swing.JLabel satisticLabelPending;
    private javax.swing.JLabel satisticLabelPendingOutput;
    private javax.swing.JTextField textbirthday;
    private javax.swing.JTextField textname;
    private javax.swing.JLabel userIcon;
    // End of variables declaration//GEN-END:variables
}
