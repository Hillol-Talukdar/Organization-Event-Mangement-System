/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package organizationeventmangementsystem;

import DatabaseConnector.DatabaseManager;
import java.awt.Color;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import net.proteanit.sql.DbUtils;

/**
 *
 * @author Hillol Talukdar
 */
public class Reservation extends javax.swing.JFrame {

    /**
     * Creates new form Reservation
     */
    
    DatabaseManager databaseManager;
    DefaultTableModel model;
    
    public Reservation() {
        initComponents();
        
        jPanel1.setFocusable(true);
        
        loadtypeComboBox();
        
        read();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        reservationJTable = new javax.swing.JTable();
        jLabel2 = new javax.swing.JLabel();
        dateOfEventjLabel = new javax.swing.JLabel();
        serviceTypejLabel = new javax.swing.JLabel();
        staffFirstNameJLabel = new javax.swing.JLabel();
        customerFirstNamejLabel = new javax.swing.JLabel();
        staffFirstNamejTextField = new javax.swing.JTextField();
        customerNumberJTextField = new javax.swing.JTextField();
        DeletejButton = new javax.swing.JButton();
        clearjButton = new javax.swing.JButton();
        dateOfEventjDateChooser = new com.toedter.calendar.JDateChooser();
        dateofReservattionjDateChooser = new com.toedter.calendar.JDateChooser();
        InsertjButton1 = new javax.swing.JButton();
        organaizationNamejLabel = new javax.swing.JLabel();
        serviceTypejComboBox = new javax.swing.JComboBox<>();
        organaizationNameJComboBox = new javax.swing.JComboBox<>();
        customerNamejLabel1 = new javax.swing.JLabel();
        customerLastNamejTextField = new javax.swing.JTextField();
        searchJTextField = new javax.swing.JTextField();
        staffLastNameJLabel = new javax.swing.JLabel();
        staffLastNamejTextField = new javax.swing.JTextField();
        customerLastNamejLabel1 = new javax.swing.JLabel();
        customerFirstNamejTextField = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setBackground(new java.awt.Color(0, 153, 153));
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowActivated(java.awt.event.WindowEvent evt) {
                formWindowActivated(evt);
            }
        });

        jPanel1.setBackground(new java.awt.Color(0, 153, 153));

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 36)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Reservation");

        reservationJTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Reservation Id", "Date Of Reservation", "Date Of Event", "Service Id", "Staff Id", "Customer Id"
            }
        ));
        jScrollPane1.setViewportView(reservationJTable);

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 13)); // NOI18N
        jLabel2.setText("Date of Reservattion");

        dateOfEventjLabel.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        dateOfEventjLabel.setText("Date Of Event");

        serviceTypejLabel.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        serviceTypejLabel.setText("Service Type");

        staffFirstNameJLabel.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        staffFirstNameJLabel.setText("Staff First Name");

        customerFirstNamejLabel.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        customerFirstNamejLabel.setText("Customer First Name");

        staffFirstNamejTextField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                staffFirstNamejTextFieldActionPerformed(evt);
            }
        });

        customerNumberJTextField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                customerNumberJTextFieldActionPerformed(evt);
            }
        });

        DeletejButton.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        DeletejButton.setText("Delete");
        DeletejButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                DeletejButtonActionPerformed(evt);
            }
        });

        clearjButton.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        clearjButton.setText("Clear");
        clearjButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                clearjButtonActionPerformed(evt);
            }
        });

        InsertjButton1.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        InsertjButton1.setText("Insert");
        InsertjButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                InsertjButton1ActionPerformed(evt);
            }
        });

        organaizationNamejLabel.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        organaizationNamejLabel.setText("Org. Name");

        serviceTypejComboBox.setMaximumRowCount(50);
        serviceTypejComboBox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                serviceTypejComboBoxActionPerformed(evt);
            }
        });

        organaizationNameJComboBox.setMaximumRowCount(50);
        organaizationNameJComboBox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                organaizationNameJComboBoxActionPerformed(evt);
            }
        });

        customerNamejLabel1.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        customerNamejLabel1.setText("Customer Contact No");

        customerLastNamejTextField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                customerLastNamejTextFieldActionPerformed(evt);
            }
        });

        searchJTextField.setForeground(new java.awt.Color(153, 153, 153));
        searchJTextField.setText("Search");
        searchJTextField.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                searchJTextFieldFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                searchJTextFieldFocusLost(evt);
            }
        });
        searchJTextField.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                searchJTextFieldKeyReleased(evt);
            }
        });

        staffLastNameJLabel.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        staffLastNameJLabel.setText("Staff Last Name");

        staffLastNamejTextField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                staffLastNamejTextFieldActionPerformed(evt);
            }
        });

        customerLastNamejLabel1.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        customerLastNamejLabel1.setText("Customer Last Name");

        customerFirstNamejTextField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                customerFirstNamejTextFieldActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(315, 315, 315)
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 429, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(searchJTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(customerLastNamejLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 149, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(customerLastNamejTextField))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                    .addComponent(staffLastNameJLabel, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(serviceTypejLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(staffFirstNameJLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(organaizationNamejLabel, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(dateOfEventjLabel, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jLabel2, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 146, Short.MAX_VALUE))
                                .addGap(7, 7, 7)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                    .addComponent(staffFirstNamejTextField, javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(serviceTypejComboBox, javax.swing.GroupLayout.Alignment.LEADING, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(organaizationNameJComboBox, javax.swing.GroupLayout.Alignment.LEADING, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(dateOfEventjDateChooser, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 166, Short.MAX_VALUE)
                                    .addComponent(dateofReservattionjDateChooser, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(staffLastNamejTextField)))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(customerFirstNamejLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 149, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(customerFirstNamejTextField))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(customerNamejLabel1)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(customerNumberJTextField)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 10, Short.MAX_VALUE)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 699, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(InsertjButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 104, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(DeletejButton, javax.swing.GroupLayout.PREFERRED_SIZE, 105, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(clearjButton, javax.swing.GroupLayout.PREFERRED_SIZE, 104, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(26, 26, 26))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(25, 25, 25)
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(36, 36, 36))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(searchJTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)))
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                        .addGap(90, 90, 90))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(dateofReservattionjDateChooser, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(dateOfEventjDateChooser, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(dateOfEventjLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(organaizationNamejLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(organaizationNameJComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(serviceTypejLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(serviceTypejComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(staffFirstNameJLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(staffFirstNamejTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(staffLastNameJLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(staffLastNamejTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(customerFirstNamejLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(customerFirstNamejTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(customerLastNamejLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(customerLastNamejTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(customerNamejLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(customerNumberJTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(InsertjButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(DeletejButton, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(clearjButton, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addContainerGap(40, Short.MAX_VALUE))))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(0, 0, 0))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(0, 0, 0))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void formWindowActivated(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowActivated
        this.setSize(1400, 750);
    }//GEN-LAST:event_formWindowActivated

    private void DeletejButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_DeletejButtonActionPerformed
        
        try
        {
           int row = reservationJTable.getSelectedRow();
           delete(row);
        }
        catch (Exception e) 
        {
            JOptionPane.showMessageDialog(null, "No index selected", "Warning", JOptionPane.WARNING_MESSAGE);  
        }
    }//GEN-LAST:event_DeletejButtonActionPerformed

    private void clearjButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_clearjButtonActionPerformed
        clear();
    }//GEN-LAST:event_clearjButtonActionPerformed

    private void staffFirstNamejTextFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_staffFirstNamejTextFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_staffFirstNamejTextFieldActionPerformed

    private void customerNumberJTextFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_customerNumberJTextFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_customerNumberJTextFieldActionPerformed

    private void InsertjButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_InsertjButton1ActionPerformed
        // TODO add your handling code here:
        try 
        {
            organaization org = new organaization();
            Service service = new Service();
            Staff staff = new Staff();
            Customer customer = new Customer();
            
            SimpleDateFormat sdf = new SimpleDateFormat("dd-MM-yyyy");
                    
            String dateofReservattion = sdf.format(dateofReservattionjDateChooser.getDate());
            String dateOfEvent = sdf.format(dateOfEventjDateChooser.getDate());
            
            String organaizationName = organaizationNameJComboBox.getSelectedItem().toString();
            int organaizationId = org.getOrganaizationId(organaizationName);
            
            String serviceType = serviceTypejComboBox.getSelectedItem().toString();
            
            int serviceId = service.getServiceId(serviceType, organaizationId);
                                
            String staffFirstName = staffFirstNamejTextField.getText();
            String staffLastName = staffLastNamejTextField.getText();
            
            int staffId = staff.getStaffeId(staffFirstName, staffLastName, organaizationId);
            
            String customerFirstName = customerFirstNamejTextField.getText();
            String customerLastName = customerLastNamejTextField.getText();
            String curstomerContactNumber = customerNumberJTextField.getText();
            
            int customerId = customer.getCustomerId(customerFirstName, customerLastName, curstomerContactNumber);
                

            if (dateofReservattion.isEmpty() || dateOfEvent.isEmpty() || organaizationName.isEmpty() || serviceType.isEmpty()
                || staffFirstName.isEmpty() || staffLastName.isEmpty() || customerFirstName.isEmpty() 
                || customerLastName.isEmpty() || curstomerContactNumber.isEmpty()) 
            {
                JOptionPane.showMessageDialog(null, "Some Field is still Empty", "Warning", JOptionPane.WARNING_MESSAGE);
            }
            else if(serviceId == -1)
            {
                JOptionPane.showMessageDialog(null, "Invalid Service Type", "Warning", JOptionPane.WARNING_MESSAGE);
            }
            else if(staffId == -1)
            {
                JOptionPane.showMessageDialog(null, "Invalid Staff information", "Warning", JOptionPane.WARNING_MESSAGE);
            }
            else if(customerId == -1)
            {
                JOptionPane.showMessageDialog(null, "Invalid customer information", "Warning", JOptionPane.WARNING_MESSAGE);
            }
            else 
            {

                model = (DefaultTableModel) reservationJTable.getModel();

                databaseManager = DatabaseManager.getInstance();
                String query = "INSERT INTO "
                       + "tbl_reservation(res_dateOfReservation, res_dateOfEvent,  serviceId, staffId, customerId)"
                       + " VALUES (?,?,?,?,?)";
                PreparedStatement pst = databaseManager.getPreparedStatement(query);

                pst.setString(1, dateofReservattion);
                pst.setString(2, dateOfEvent);
                pst.setInt(3, serviceId);
                pst.setInt(4, staffId);
                pst.setInt(5, customerId);

                pst.executeUpdate();

                JOptionPane.showMessageDialog(null, "Data inserted successfully!");

                read();
                clear();
            }

        } 
        catch (Exception e) 
        {
            JOptionPane.showMessageDialog(null, e, "Warning", JOptionPane.WARNING_MESSAGE);
        }
        
        
    }//GEN-LAST:event_InsertjButton1ActionPerformed

    private void customerLastNamejTextFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_customerLastNamejTextFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_customerLastNamejTextFieldActionPerformed

    private void serviceTypejComboBoxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_serviceTypejComboBoxActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_serviceTypejComboBoxActionPerformed

    private void organaizationNameJComboBoxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_organaizationNameJComboBoxActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_organaizationNameJComboBoxActionPerformed

    private void searchJTextFieldFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_searchJTextFieldFocusGained
        // TODO add your handling code here:

        if(searchJTextField.getText().equals("Search"))
        {
            searchJTextField.setText("");
            searchJTextField.setForeground(Color.BLACK);
        }
    }//GEN-LAST:event_searchJTextFieldFocusGained

    private void searchJTextFieldFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_searchJTextFieldFocusLost
        // TODO add your handling code here:
        if(searchJTextField.getText().equals(""))
        {
            searchJTextField.setText("Search");
            searchJTextField.setForeground(Color.GRAY);
        }
    }//GEN-LAST:event_searchJTextFieldFocusLost

    private void searchJTextFieldKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_searchJTextFieldKeyReleased
        // TODO add your handling code here:

        ResultSet rs;
        DatabaseManager staffData = DatabaseManager.getInstance();
        PreparedStatement pst;
        String search = searchJTextField.getText();

        try
        {

            String query = "Select * from tbl_reservation where reservationId Like '%" + search
            + "%' or res_dateOfReservation Like '%" + search
            + "%' or res_dateOfEvent Like '%" + search
            + "%' or serviceId Like '%" + search
            + "%' or staffId Like '%" + search
            + "%' or customerId Like '%" + search + "%'";

            pst = staffData.getPreparedStatement(query);
            rs = pst.executeQuery();
            reservationJTable.setModel(DbUtils.resultSetToTableModel(rs));

        }
        catch (Exception e)
        {
            JOptionPane.showMessageDialog(null, "Please Check Database.Something is Wrong!!", "Warning", JOptionPane.WARNING_MESSAGE);
        }
    }//GEN-LAST:event_searchJTextFieldKeyReleased

    private void staffLastNamejTextFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_staffLastNamejTextFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_staffLastNamejTextFieldActionPerformed

    private void customerFirstNamejTextFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_customerFirstNamejTextFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_customerFirstNamejTextFieldActionPerformed

    private void clear()
    {
        organaization org = new organaization();
        
        organaizationNameJComboBox.removeAllItems();;
        org.setOrganaizationComboBox(this.organaizationNameJComboBox);
        
        dateofReservattionjDateChooser.setCalendar(null);
        dateOfEventjDateChooser.setCalendar(null);
        loadtypeComboBox();
        staffFirstNamejTextField.setText(null);
        staffLastNamejTextField.setText(null);
        customerFirstNamejTextField.setText(null);
        customerLastNamejTextField.setText(null);
        customerNumberJTextField.setText(null);
    }
    
    private void delete(int row) 
    {

        Object index = reservationJTable.getValueAt(row, 0);

        try 
        {
            DatabaseManager reservationData = DatabaseManager.getInstance();

            String query = "DELETE FROM tbl_reservation Where staffId = " + index;
            PreparedStatement pst = reservationData.getPreparedStatement(query);

            pst.executeUpdate();

            JOptionPane.showMessageDialog(null, "Data Deleted Successfully!", "Connection Status", JOptionPane.INFORMATION_MESSAGE);

            read();
        }
        catch (Exception e) 
        {
            JOptionPane.showMessageDialog(null, "Please Check The Connection Settings!\nOr Fill The From Correctly", "Error!", JOptionPane.ERROR_MESSAGE);
        }
    }

    private void read() 
    {
        organaization org = new organaization();
        
        organaizationNameJComboBox.removeAllItems();;
        org.setOrganaizationComboBox(this.organaizationNameJComboBox);
        
        model = (DefaultTableModel) reservationJTable.getModel();
        
        while (model.getRowCount() > 0)
        {
            model.removeRow(0);
        }

        DatabaseManager reservationData = DatabaseManager.getInstance();

        if (reservationData.checkConnection()) 
        {
            String query = "Select * From tbl_reservation";
            ResultSet rset = null;
            try 
            {
                rset = reservationData.getResult(query);
            } 
            catch (SQLException ex) 
            {
                JOptionPane.showMessageDialog(null, "Please Check Database.Something is Wrong!!", "Warning", JOptionPane.WARNING_MESSAGE);
                Logger.getLogger(Reservation.class.getName()).log(Level.SEVERE, null, ex);
            }
            
            
            try 
            {
                while (rset.next()) 
                { 
                    int id = rset.getInt("reservationId");
                    String dateofReservattion = rset.getString("res_dateOfReservation");
                    String dateOfEvent = rset.getString("res_dateOfEvent");
                    String serviceId = rset.getString("serviceId");
                    String staffId = rset.getString("staffId");
                    String customerId = rset.getString("customerId");
                    

                    Object[] row = {id, dateofReservattion, dateOfEvent, serviceId, staffId, customerId};

                    model = (DefaultTableModel) reservationJTable.getModel();

                    model.addRow(row);

                }
            } 
            catch (SQLException ex) 
            {
                JOptionPane.showMessageDialog(null, "Please Check Database.Something is Wrong!!", "Warning", JOptionPane.WARNING_MESSAGE);
                Logger.getLogger(Reservation.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }
    
    
    public int getReservationId(int serviceId)
    {
        DatabaseManager reservationData = DatabaseManager.getInstance();
        int reservationId = -1;
        
        if(reservationData.checkConnection())
        {
            ResultSet rset = null;
            try
            {
                String query = "Select ReservationId from tbl_reservation where serviceId = "+"'"+serviceId+"';";

                rset = reservationData.getResult(query);
            } 
            catch (SQLException ex) 
            {
                JOptionPane.showMessageDialog(null, "Please Check Database.Something is Wrong!!", "Warning", JOptionPane.WARNING_MESSAGE);
                Logger.getLogger(Reservation.class.getName()).log(Level.SEVERE, null, ex);
            }
            
            try 
            {
                while(rset.next())
                {
                   reservationId = Integer.parseInt(rset.getString("ReservationId"));
                }
                
            } 
            catch (SQLException ex) 
            {
               JOptionPane.showMessageDialog(null, "Please Check Database.Something is Wrong!!", "Warning", JOptionPane.WARNING_MESSAGE);
               Logger.getLogger(Reservation.class.getName()).log(Level.SEVERE, null, ex);
            }
       }
       return reservationId;
       
    }
    
    private void loadtypeComboBox()
    {
        serviceTypejComboBox.setModel(new DefaultComboBoxModel<> (ServiceType.values()));
    }
    
    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Reservation.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Reservation.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Reservation.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Reservation.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Reservation().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton DeletejButton;
    private javax.swing.JButton InsertjButton1;
    private javax.swing.JButton clearjButton;
    private javax.swing.JLabel customerFirstNamejLabel;
    private javax.swing.JTextField customerFirstNamejTextField;
    private javax.swing.JLabel customerLastNamejLabel1;
    private javax.swing.JTextField customerLastNamejTextField;
    private javax.swing.JLabel customerNamejLabel1;
    private javax.swing.JTextField customerNumberJTextField;
    private com.toedter.calendar.JDateChooser dateOfEventjDateChooser;
    private javax.swing.JLabel dateOfEventjLabel;
    private com.toedter.calendar.JDateChooser dateofReservattionjDateChooser;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JComboBox<String> organaizationNameJComboBox;
    private javax.swing.JLabel organaizationNamejLabel;
    private javax.swing.JTable reservationJTable;
    private javax.swing.JTextField searchJTextField;
    private javax.swing.JComboBox<ServiceType> serviceTypejComboBox;
    private javax.swing.JLabel serviceTypejLabel;
    private javax.swing.JLabel staffFirstNameJLabel;
    private javax.swing.JTextField staffFirstNamejTextField;
    private javax.swing.JLabel staffLastNameJLabel;
    private javax.swing.JTextField staffLastNamejTextField;
    // End of variables declaration//GEN-END:variables
}
