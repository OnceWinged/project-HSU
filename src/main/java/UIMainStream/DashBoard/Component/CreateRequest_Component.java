package UIMainStream.DashBoard.Component;

import javax.swing.JOptionPane;

import Functions.TextFunction;
import Models.DataBase;
import Models.Report;
import Models.Request;
import Models.Time;
import Models.User;
import Models.Vehicle;
import Models.eVesselType;

public class CreateRequest_Component extends javax.swing.JPanel {

	public CreateRequest_Component() {
		initComponents();
		resetAllTextes();
		this.addCustomDateEventListener();
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
		textbienso.setText("XX-XXX-XXX");

		requestedDay.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N

		requestedYear.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
		requestedYear.setEnabled(false);
		requestedYear.setFocusable(false);

		requestedMonth.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N

		DecorativeLabel1.setText(": 00 of ");

		DecorativeLabel2.setText("/");

		DecorativeLabel3.setText("/");

		checkBoxIn.setBackground(new java.awt.Color(255, 255, 255));
		checkBoxIn.setText("Drive In");
		checkBoxIn.addChangeListener(new javax.swing.event.ChangeListener() {
			public void stateChanged(javax.swing.event.ChangeEvent evt) {
				checkBoxInStateChanged(evt);
			}
		});

		checkBoxOut.setBackground(new java.awt.Color(255, 255, 255));
		checkBoxOut.setText("Drive Out");
		checkBoxOut.addChangeListener(new javax.swing.event.ChangeListener() {
			public void stateChanged(javax.swing.event.ChangeEvent evt) {
				checkBoxOutStateChanged(evt);
			}
		});

		demoHintLabel.setFont(new java.awt.Font("Segoe UI", 2, 10)); // NOI18N
		demoHintLabel.setText("for demo, can only be 1 vessel to registered for transfering every hours.");
		demoHintLabel.setToolTipText("");

		javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
		this.setLayout(layout);
		layout.setHorizontalGroup(
				layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
						.addGroup(layout.createSequentialGroup()
								.addGap(69, 69, 69)
								.addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
										.addComponent(plateLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 72,
												javax.swing.GroupLayout.PREFERRED_SIZE)
										.addComponent(typeLabel)
										.addComponent(requestedTimeLabel)
										.addGroup(layout.createSequentialGroup()
												.addComponent(checkBoxIn)
												.addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED,
														javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
												.addComponent(checkBoxOut)))
								.addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 200,
										Short.MAX_VALUE)
								.addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
										.addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
												.addComponent(type, javax.swing.GroupLayout.PREFERRED_SIZE, 183,
														javax.swing.GroupLayout.PREFERRED_SIZE)
												.addComponent(textbienso, javax.swing.GroupLayout.PREFERRED_SIZE, 183,
														javax.swing.GroupLayout.PREFERRED_SIZE)
												.addGroup(layout.createSequentialGroup()
														.addComponent(cancel)
														.addGap(31, 31, 31)
														.addComponent(create)))
										.addGroup(layout.createSequentialGroup()
												.addComponent(requestedHour, javax.swing.GroupLayout.PREFERRED_SIZE, 34,
														javax.swing.GroupLayout.PREFERRED_SIZE)
												.addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
												.addComponent(DecorativeLabel1)
												.addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
												.addComponent(requestedDay, javax.swing.GroupLayout.PREFERRED_SIZE, 34,
														javax.swing.GroupLayout.PREFERRED_SIZE)
												.addGap(3, 3, 3)
												.addComponent(DecorativeLabel2)
												.addGap(4, 4, 4)
												.addComponent(requestedMonth, javax.swing.GroupLayout.PREFERRED_SIZE,
														34, javax.swing.GroupLayout.PREFERRED_SIZE)
												.addGap(3, 3, 3)
												.addComponent(DecorativeLabel3)
												.addGap(4, 4, 4)
												.addComponent(requestedYear, javax.swing.GroupLayout.PREFERRED_SIZE, 45,
														javax.swing.GroupLayout.PREFERRED_SIZE)))
								.addGap(77, 77, 77))
						.addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
								.addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
								.addComponent(demoHintLabel)
								.addGap(62, 62, 62)));
		layout.setVerticalGroup(
				layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
						.addGroup(layout.createSequentialGroup()
								.addGap(72, 72, 72)
								.addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
										.addComponent(typeLabel)
										.addComponent(type, javax.swing.GroupLayout.PREFERRED_SIZE,
												javax.swing.GroupLayout.DEFAULT_SIZE,
												javax.swing.GroupLayout.PREFERRED_SIZE))
								.addGap(26, 26, 26)
								.addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
										.addComponent(requestedTimeLabel)
										.addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
												.addComponent(requestedHour, javax.swing.GroupLayout.PREFERRED_SIZE,
														javax.swing.GroupLayout.DEFAULT_SIZE,
														javax.swing.GroupLayout.PREFERRED_SIZE)
												.addComponent(requestedDay, javax.swing.GroupLayout.PREFERRED_SIZE,
														javax.swing.GroupLayout.DEFAULT_SIZE,
														javax.swing.GroupLayout.PREFERRED_SIZE)
												.addComponent(requestedMonth, javax.swing.GroupLayout.PREFERRED_SIZE,
														javax.swing.GroupLayout.DEFAULT_SIZE,
														javax.swing.GroupLayout.PREFERRED_SIZE)
												.addComponent(requestedYear, javax.swing.GroupLayout.PREFERRED_SIZE,
														javax.swing.GroupLayout.DEFAULT_SIZE,
														javax.swing.GroupLayout.PREFERRED_SIZE)
												.addComponent(DecorativeLabel1)
												.addComponent(DecorativeLabel2)
												.addComponent(DecorativeLabel3)))
								.addGap(2, 2, 2)
								.addComponent(demoHintLabel)
								.addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
								.addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
										.addComponent(textbienso, javax.swing.GroupLayout.PREFERRED_SIZE,
												javax.swing.GroupLayout.DEFAULT_SIZE,
												javax.swing.GroupLayout.PREFERRED_SIZE)
										.addComponent(plateLabel))
								.addGap(18, 18, 18)
								.addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
										.addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
												.addComponent(cancel)
												.addComponent(create))
										.addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
												.addComponent(checkBoxIn)
												.addComponent(checkBoxOut)))
								.addContainerGap(232, Short.MAX_VALUE)));
	}// </editor-fold>//GEN-END:initComponents

	private void checkBoxOutStateChanged(javax.swing.event.ChangeEvent evt) {// GEN-FIRST:event_checkBoxOutStateChanged
		if (checkBoxOut.isSelected()) {
			checkBoxIn.setSelected(false);
		} else {
			checkBoxIn.setSelected(true);
		}
	}// GEN-LAST:event_checkBoxOutStateChanged

	private void checkBoxInStateChanged(javax.swing.event.ChangeEvent evt) {// GEN-FIRST:event_checkBoxInStateChanged
		if (checkBoxIn.isSelected()) {
			checkBoxOut.setSelected(false);
		} else {
			checkBoxOut.setSelected(true);
		}
	}// GEN-LAST:event_checkBoxInStateChanged

	/**
	 *
	 *
	 *
	 *
	 *
	 *
	 *
	 *
	 *
	 *
	 *
	 *
	 *
	 *
	 *
	 *
	 *
	 *
	 *
	 *
	 * @param evt
	 */

	private void createMouseClicked(java.awt.event.MouseEvent evt) {// GEN-FIRST:event_createMouseClicked
		String hour = requestedHour.getText();
		String day = requestedDay.getText();
		String month = requestedMonth.getText();
		String year = requestedYear.getText();

		Time requestedTime = new Time(hour, "0", day, month, year);
		// create req and vehcle + save them to dataBank
		createRequest(createVehicle(), requestedTime);
		JOptionPane.showMessageDialog(this, "Document successfully submited at : " + new Time() + "\n");
		resetAllTextes();
	}// GEN-LAST:event_createMouseClicked

	private void cancelMouseClicked(java.awt.event.MouseEvent evt) {// GEN-FIRST:event_cancelMouseClicked
		JOptionPane.showMessageDialog(this, "All choices cancled!");
		resetAllTextes();
	}// GEN-LAST:event_cancelMouseClicked

	public void resetAllTextes() {
		textbienso.setText("XX-XXX-XXX");
		checkBoxIn.setSelected(true);
		checkBoxOut.setSelected(false);
		type.setSelectedIndex(0);

		Time now = new Time();// Get current time as default, and move forward 5h as default
		requestedHour.setText(Integer.toString(now.getHour()));
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
		// TODO---
		// report generating should be elsewhere
		// for demo it is instantly acceptedreq
		requestedTime.setHour(requestedTime.getHour());
		new Report(request, requestedTime).save();
		// --------

		DataBase.userBond(request);
		request.save();
		return request;
	}

	private Vehicle createVehicle() {
		eVesselType selectedType = (eVesselType) type.getSelectedItem();

		eVesselType vType = selectedType;
		String hType = selectedType.getHangarType();
		char size = selectedType.getSize();

		String plate = textbienso.getText();
		String uId = User.getInstance().getId();
		Vehicle vehicle = new Vehicle(uId, plate, hType, size, vType);

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

	private void addCustomDateEventListener() {
		TextFunction.addDateInputClamper(requestedHour, 0, 24, 2);
		TextFunction.addDateInputClamper(requestedDay, 1, requestedMonth, requestedYear, 2);
		TextFunction.addDateInputClamper(requestedMonth, 1, 12, 2);
		TextFunction.addDateInputClamper(requestedYear, new Time().getYear(), 2030, 4);
		// overkill, but meh.
	}
}
