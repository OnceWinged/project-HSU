
package UIMainStream.DashBoard;

import UIMainStream.DashBoard.Component.User_Component;
import UIMainStream.DashBoard.navigation.Navigation_Container;
import java.awt.BorderLayout;

/**
 * @author Pham Trung Duc - Acer
 * @author Huynh Kim AI - Dell
 */
public class DashBoardFrame extends javax.swing.JFrame {
    private static DashBoardFrame instance;

    private DashBoardFrame() {
        initComponents();
        setLayout(new BorderLayout(20, 0));

        add(new Navigation_Container(), BorderLayout.WEST);
        add(DashBoardContent.getInstance(), BorderLayout.CENTER);
        setResizable(false);

        DashBoardContent.getInstance().add(new User_Component());
        DashBoardContent.getInstance().repainting();
        System.out.println("directing to user page");
    }

    public static DashBoardFrame getInstance() {
        return (instance == null) ? instance = new DashBoardFrame() : instance;
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    // <editor-fold defaultstate="collapsed" desc="Generated
    // Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(255, 255, 255));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
                layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGap(0, 895, Short.MAX_VALUE));
        layout.setVerticalGroup(
                layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGap(0, 360, Short.MAX_VALUE));

        pack();
    }// </editor-fold>//GEN-END:initComponents
     // Variables declaration - do not modify//GEN-BEGIN:variables
     // End of variables declaration//GEN-END:variables
}
