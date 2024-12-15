
package UIMainStream.DashBoard.navigation;

import UIMainStream.DashBoard.Component.*;

import UIMainStream.DashBoard.DashBoardContent;
import UIMainStream.DashBoard.DashBoardFrame;
import UIMainStream.MainEntry;
import javax.swing.JScrollPane;
/**
 *
 * @author DELL
 */
public class Navigation_Component extends javax.swing.JPanel {

    String name;

    public Navigation_Component(String name) {
        this.name = name;
        initComponents();
        this.nameBtn.setText(name);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        nameBtn = new javax.swing.JLabel();

        setBackground(new java.awt.Color(204, 204, 255));
        setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                formMouseClicked(evt);
            }
        });

        nameBtn.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        nameBtn.setText("aaaaaaaaa");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(nameBtn)
                .addContainerGap(112, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(nameBtn)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void formMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_formMouseClicked
        DashBoardContent.getInstance().removeAll();
        switch (name) {
            case "User":
                DashBoardContent.getInstance().add(new User_Component());
                DashBoardContent.getInstance().repainting();
                
                break;
            case "Create Request":
                DashBoardContent.getInstance().add(new CreateRequest_Component());
                DashBoardContent.getInstance().repainting();

                break;
            case "Request":
                JScrollPane jScrollPane = new JScrollPane(new Request_Container());
                DashBoardContent.getInstance().add(jScrollPane);
                DashBoardContent.getInstance().repainting();

                break;
            case "Report":
                JScrollPane jScrollPane1 = new JScrollPane(new Report_Container());
                DashBoardContent.getInstance().add(jScrollPane1);
                DashBoardContent.getInstance().repainting();
                break;
            case "Vehicles":
                JScrollPane jScrollPane2 = new JScrollPane(new Vehicles_Container());
                DashBoardContent.getInstance().add(jScrollPane2);
                DashBoardContent.getInstance().repainting();
                break;

            case "Logout":
                DashBoardFrame.getInstance().dispose();
                MainEntry.startUp();
                
                

            default:
                throw new AssertionError();
        }
    }//GEN-LAST:event_formMouseClicked

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel nameBtn;
    // End of variables declaration//GEN-END:variables
}
