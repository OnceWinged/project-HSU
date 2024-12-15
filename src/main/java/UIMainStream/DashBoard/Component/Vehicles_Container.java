package UIMainStream.DashBoard.Component;

import java.awt.GridLayout;
import java.util.LinkedList;

import Models.User;
import Models.Vehicle;

/**
 * @author DELL
 */
public class Vehicles_Container extends javax.swing.JPanel {

    public Vehicles_Container() {
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
                        .addGap(0, 339, Short.MAX_VALUE));
        layout.setVerticalGroup(
                layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGap(0, 203, Short.MAX_VALUE));
    }// </editor-fold>//GEN-END:initComponents
     // Variables declaration - do not modify//GEN-BEGIN:variables
     // End of variables declaration//GEN-END:variables

    private void secondStageinitComponents() {
        this.setLayout(new GridLayout(0, 1, 0, 0));
        addComponents();
    }

    private void addComponents() {

        LinkedList<Vehicle> veh = User.getInstance().getVehicles();
        for (Vehicle v : veh) {
            this.add(new Vehicles_Component(v));
        }
        // for (int i = 0; i <= 3; i++) {
        // this.add(new Vehicles_Component());
        // }
    }
}
