package UIMainStream.DashBoard;

import java.awt.BorderLayout;
import java.awt.Component;
import java.util.LinkedList;

/**
 *
 * @author DELL
 */
public class DashBoardContent extends javax.swing.JPanel {

    private static DashBoardContent instance;
    private LinkedList<Component> componentsList = new LinkedList<>();

    private DashBoardContent() {
        initComponents();
        setLayout(new BorderLayout());

    }

    public static DashBoardContent getInstance() {
        if (instance == null) {
            instance = new DashBoardContent();
        }
        return instance;
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

    public void repainting() {
        this.revalidate();
        this.repaint();
    }

    public LinkedList<Component> getComponentsList() {
        return componentsList;
    }

    @Override
    public Component add(Component comp) {
        componentsList.add(comp);
        return super.add(comp);
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    // End of variables declaration//GEN-END:variables
}
