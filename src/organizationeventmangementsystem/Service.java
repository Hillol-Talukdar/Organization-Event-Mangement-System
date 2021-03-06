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
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import net.proteanit.sql.DbUtils;

/**
 *
 * @author Hillol Talukdar
 */
public class Service extends javax.swing.JFrame {

    /**
     * Creates new form Service
     */
    DatabaseManager databaseManager;
    DefaultTableModel model;
    
    public Service() {
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
        servicejTable = new javax.swing.JTable();
        feesjLabel = new javax.swing.JLabel();
        TypejLabel = new javax.swing.JLabel();
        organaizationNamejLabel = new javax.swing.JLabel();
        feesjTextField = new javax.swing.JTextField();
        clearjButton = new javax.swing.JButton();
        deleteJButton = new javax.swing.JButton();
        insertjButton1 = new javax.swing.JButton();
        searchJTextField = new javax.swing.JTextField();
        organaizationNameJComboBox = new javax.swing.JComboBox<>();
        typeJComboBox = new javax.swing.JComboBox<>();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowActivated(java.awt.event.WindowEvent evt) {
                formWindowActivated(evt);
            }
        });

        jPanel1.setBackground(new java.awt.Color(0, 153, 153));

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 36)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Service");

        servicejTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Service Id", "Type", "Fees", "Organaization Id"
            }
        ));
        jScrollPane1.setViewportView(servicejTable);

        feesjLabel.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        feesjLabel.setText("Fees");

        TypejLabel.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        TypejLabel.setText("Type");

        organaizationNamejLabel.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        organaizationNamejLabel.setText("organaization Name");

        feesjTextField.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N

        clearjButton.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        clearjButton.setText("Clear");
        clearjButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                clearjButtonActionPerformed(evt);
            }
        });

        deleteJButton.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        deleteJButton.setText("Delete");
        deleteJButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                deleteJButtonActionPerformed(evt);
            }
        });

        insertjButton1.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        insertjButton1.setText("Insert");
        insertjButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                insertjButton1ActionPerformed(evt);
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

        organaizationNameJComboBox.setMaximumRowCount(50);

        typeJComboBox.setMaximumRowCount(50);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(searchJTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(insertjButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(deleteJButton, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(clearjButton, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(TypejLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 112, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(feesjLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(organaizationNamejLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(organaizationNameJComboBox, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(typeJComboBox, 0, 224, Short.MAX_VALUE)
                                    .addComponent(feesjTextField, javax.swing.GroupLayout.DEFAULT_SIZE, 224, Short.MAX_VALUE))))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 822, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(26, 26, 26))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(139, 139, 139)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 853, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(24, 24, 24)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(typeJComboBox, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(TypejLabel, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(feesjTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(feesjLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(organaizationNamejLabel, javax.swing.GroupLayout.DEFAULT_SIZE, 44, Short.MAX_VALUE)
                    .addComponent(organaizationNameJComboBox))
                .addGap(153, 153, 153)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(clearjButton, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(deleteJButton, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(insertjButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(111, 111, 111))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(104, 104, 104)
                .addComponent(searchJTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(80, Short.MAX_VALUE))
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
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void formWindowActivated(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowActivated
        // TODO add your handling code here:
        
        this.setSize(1400, 750);
    }//GEN-LAST:event_formWindowActivated

    private void deleteJButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_deleteJButtonActionPerformed
        // TODO add your handling code here:
       try
       {
           int row = servicejTable.getSelectedRow();
           delete(row);
       }
       catch (Exception e) 
       {
            JOptionPane.showMessageDialog(null, "No index selected", "Warning", JOptionPane.WARNING_MESSAGE);  
       }
        
    }//GEN-LAST:event_deleteJButtonActionPerformed

    private void clearjButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_clearjButtonActionPerformed
        // TODO add your handling code here:
       clear();
    }//GEN-LAST:event_clearjButtonActionPerformed

    private void insertjButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_insertjButton1ActionPerformed
        // TODO add your handling code here:
        
        try 
        {
            organaization org = new organaization();
            
            String type = typeJComboBox.getSelectedItem().toString();
            String fee = feesjTextField.getText();
            int fees = Integer.parseInt(fee);
            String organaizationName = organaizationNameJComboBox.getSelectedItem().toString();
            int organaizationId = org.getOrganaizationId(organaizationName);
            

            if (type.isEmpty() || fee.isEmpty() || organaizationName.isEmpty()) 
            {
                JOptionPane.showMessageDialog(null, "Some Field is still Empty", "Warning", JOptionPane.WARNING_MESSAGE);
            } 
            else 
            {

                model = (DefaultTableModel) servicejTable.getModel();

                databaseManager = DatabaseManager.getInstance();
                String query = "INSERT INTO tbl_service(ser_type,ser_fees,organaizationId) VALUES (?,?,?)";
                PreparedStatement pst = databaseManager.getPreparedStatement(query);

                pst.setString(1, type);
                pst.setInt(2, fees);
                pst.setInt(3, organaizationId);
  
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
    }//GEN-LAST:event_insertjButton1ActionPerformed

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
        DatabaseManager serviceData = DatabaseManager.getInstance();
        PreparedStatement pst;
        String search = searchJTextField.getText();

        try 
        {
            
            String query = "Select * from tbl_service where serviceId Like '%" + search
                                + "%' or ser_type Like '%" + search 
                                + "%' or ser_fees Like '%" + search 
                                + "%' or organaizationId Like '%" + search + "%'";
               
                pst = serviceData.getPreparedStatement(query);
                rs = pst.executeQuery();
                servicejTable.setModel(DbUtils.resultSetToTableModel(rs));
            
        } 
        catch (Exception e) 
        {
            JOptionPane.showMessageDialog(null, "Please Check Database.Something is Wrong!!", "Warning", JOptionPane.WARNING_MESSAGE);
        }
    }//GEN-LAST:event_searchJTextFieldKeyReleased
    
    private void clear()
    {
        organaization org = new organaization();
        
        organaizationNameJComboBox.removeAllItems();;
        org.setOrganaizationComboBox(this.organaizationNameJComboBox);
        
        feesjTextField.setText(null);
        loadtypeComboBox();
    }
    
    private void delete(int row) 
    {

        Object index = servicejTable.getValueAt(row, 0);

        try {
            DatabaseManager serviceData = DatabaseManager.getInstance();

            String query = "DELETE FROM tbl_service Where serviceId = " + index;
            PreparedStatement pst = serviceData.getPreparedStatement(query);

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
        
        model = (DefaultTableModel) servicejTable.getModel();
        
        while (model.getRowCount() > 0)
        {
            model.removeRow(0);
        }

        DatabaseManager serviceData = DatabaseManager.getInstance();

        if (serviceData.checkConnection()) 
        {
            String query = "Select * From tbl_service";
            ResultSet rset = null;
            try 
            {
                rset = serviceData.getResult(query);
            } 
            catch (SQLException ex) 
            {
                JOptionPane.showMessageDialog(null, "Please Check Database.Something is Wrong!!", "Warning", JOptionPane.WARNING_MESSAGE);
                Logger.getLogger(Service.class.getName()).log(Level.SEVERE, null, ex);
            }
            
            
            try 
            {
                while (rset.next()) 
                {
                    int id = rset.getInt("serviceId");
                    String type = rset.getString("ser_type");
                    int fees = rset.getInt("ser_fees");
                    int organaizationId = rset.getInt("organaizationId");
                    

                    Object[] row = {id, type, fees, organaizationId};

                    model = (DefaultTableModel) servicejTable.getModel();

                    model.addRow(row);

                }
            } 
            catch (SQLException ex) 
            {
                JOptionPane.showMessageDialog(null, "Please Check Database.Something is Wrong!!", "Warning", JOptionPane.WARNING_MESSAGE);
                Logger.getLogger(Service.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }
    
    
    public int getServiceId(String serviceType, int organaizationId)
    {
        DatabaseManager serviceData = DatabaseManager.getInstance();
        int serviceId = -1;
        
        if(serviceData.checkConnection())
        {
            ResultSet rset = null;
            try
            {
                String query = "Select serviceId from tbl_service where ser_type = "+"'"+serviceType+"'"
                        + "and organaizationId = "+"'"+organaizationId+"';";
                rset = serviceData.getResult(query);
            } 
            catch (SQLException ex) 
            {
                JOptionPane.showMessageDialog(null, "Please Check Database.Something is Wrong!!", "Warning", JOptionPane.WARNING_MESSAGE);
                Logger.getLogger(Service.class.getName()).log(Level.SEVERE, null, ex);
            }
            
            try 
            {
                while(rset.next())
                {
                   serviceId = Integer.parseInt(rset.getString("serviceId"));
                }
                
            } 
            catch (SQLException ex) 
            {
               JOptionPane.showMessageDialog(null, "Please Check Database.Something is Wrong!!", "Warning", JOptionPane.WARNING_MESSAGE);
               Logger.getLogger(Service.class.getName()).log(Level.SEVERE, null, ex);
            }
       }
       return serviceId;
       
    }
    
    public int getServiceId(int organaizationId)
    {
        DatabaseManager serviceData = DatabaseManager.getInstance();
        int serviceId = -1;
        
        if(serviceData.checkConnection())
        {
            ResultSet rset = null;
            try
            {
                String query = "Select serviceId from tbl_service where organaizationId = "+"'"+organaizationId+"';";

                rset = serviceData.getResult(query);
            } 
            catch (SQLException ex) 
            {
                JOptionPane.showMessageDialog(null, "Please Check Database.Something is Wrong!!", "Warning", JOptionPane.WARNING_MESSAGE);
                Logger.getLogger(Service.class.getName()).log(Level.SEVERE, null, ex);
            }
            
            try 
            {
                while(rset.next())
                {
                   serviceId = Integer.parseInt(rset.getString("serviceId"));
                }
                
            } 
            catch (SQLException ex) 
            {
               JOptionPane.showMessageDialog(null, "Please Check Database.Something is Wrong!!", "Warning", JOptionPane.WARNING_MESSAGE);
               Logger.getLogger(Service.class.getName()).log(Level.SEVERE, null, ex);
            }
       }
       return serviceId;
       
    }
    
    public void setServiceComboBox(JComboBox serviceComboBox)
    {
        DatabaseManager serviceData = DatabaseManager.getInstance();
        
        if(serviceData.checkConnection())
        {
            ResultSet rset = null;
            try 
            {
                String query = "Select * from tbl_service";
                rset = serviceData.getResult(query);
            } 
            catch (SQLException ex) 
            {
                JOptionPane.showMessageDialog(null, "Please Check Database.Something is Wrong!!", "Warning", JOptionPane.WARNING_MESSAGE);
                Logger.getLogger(Service.class.getName()).log(Level.SEVERE, null, ex);
            }
            
            try 
            {
                while(rset.next())
                {    
                   String serviceName = rset.getString("ser_type");
                   serviceComboBox.addItem(serviceName);
                }
            }
            catch (SQLException ex) 
            {
                JOptionPane.showMessageDialog(null, "Please Check Database.Something is Wrong!!", "Warning", JOptionPane.WARNING_MESSAGE);
                Logger.getLogger(Service.class.getName()).log(Level.SEVERE, null, ex);
           }
        }
    }
    
    
    private void loadtypeComboBox()
    {
        typeJComboBox.setModel(new DefaultComboBoxModel<> (ServiceType.values()));
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
            java.util.logging.Logger.getLogger(Service.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Service.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Service.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Service.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Service().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel TypejLabel;
    private javax.swing.JButton clearjButton;
    private javax.swing.JButton deleteJButton;
    private javax.swing.JLabel feesjLabel;
    private javax.swing.JTextField feesjTextField;
    private javax.swing.JButton insertjButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JComboBox<String> organaizationNameJComboBox;
    private javax.swing.JLabel organaizationNamejLabel;
    private javax.swing.JTextField searchJTextField;
    private javax.swing.JTable servicejTable;
    private javax.swing.JComboBox<ServiceType> typeJComboBox;
    // End of variables declaration//GEN-END:variables
}
