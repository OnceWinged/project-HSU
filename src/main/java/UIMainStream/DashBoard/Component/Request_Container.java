package UIMainStream.DashBoard.Component;

import java.awt.GridLayout;
import java.util.LinkedList;

import Models.DataBase;
import Models.Request;
import Models.User;

/**
 * @author DELL
 */
public class Request_Container extends javax.swing.JPanel {
    public Request_Container() {
        initComponents();
        secondStageinitComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    // <editor-fold defaultstate="collapsed" desc="Generated
    // Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        setBackground(new java.awt.Color(255, 255, 255));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
                layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGap(0, 400, Short.MAX_VALUE));
        layout.setVerticalGroup(
                layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGap(0, 300, Short.MAX_VALUE));
    }// </editor-fold>//GEN-END:initComponents

    private void secondStageinitComponents() {
        this.setLayout(new GridLayout(0, 1, 0, 0));
        addComponents();
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    // End of variables declaration//GEN-END:variables

    private void addComponents() {

        User user = User.getInstance();
        LinkedList<Request> req;
        if (user.getAdminRight()) {
            req = user.getRequests();
        } else {
            req = DataBase.blindlyFetchDataBase(DataBase.getRequestsbankPth(), Request.class);
        }
        if (req.isEmpty()) {
            this.add(new Empty_Screen());
            return;
        }
        for (Request r : req) {
            this.add(new Request_Component(r));
        }
    }
}
