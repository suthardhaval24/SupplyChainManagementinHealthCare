/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package userinterface.ManufacturerRole;

import Business.Enterprise.Enterprise;
import Business.Inventory.HospitalInventory;
import Business.Inventory.ManufactureInventory;
import Business.ManufacturerEnterprise.Organization.ManufacturerOrganization;
import Business.Organization.Organization;
import Business.SupplierEnterprise.Organization.SupplierOrganization;
import Business.UserAccount.UserAccount;
import Business.WorkQueue.WorkRequest;
import java.awt.CardLayout;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author parkh
 */
public class ManufacturerWorkAreaJPanel extends javax.swing.JPanel {

    /**
     * Creates new form ManufacturerWorkAreaJPanel
     */
    private JPanel userProcessContainer;
    private ManufacturerOrganization organization;
    private Enterprise enterprise;
    private UserAccount userAccount;
    private ManufactureInventory manuDir;
    private WorkRequest request;
    public ManufacturerWorkAreaJPanel(JPanel userProcessContainer, UserAccount account, Organization organization, Enterprise enterprise,ManufactureInventory manuDir) {
        initComponents();
        this.userProcessContainer = userProcessContainer;
        this.organization =(ManufacturerOrganization) organization;
        this.enterprise = enterprise;
        this.userAccount = account;
        this.manuDir = manuDir;
        valueLabel.setText(enterprise.getName());
        nameLabel.setText(userAccount.getUsername());
        populateOrderTable();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        refreshTestJButton = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        supplierWorkRequestJTable = new javax.swing.JTable();
        assignTextField = new javax.swing.JButton();
        manageBtn = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();
        nameLabel = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        enterpriseLabel = new javax.swing.JLabel();
        valueLabel = new javax.swing.JLabel();

        setBackground(new java.awt.Color(255, 255, 255));
        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        refreshTestJButton.setText("Refresh");
        refreshTestJButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                refreshTestJButtonActionPerformed(evt);
            }
        });
        add(refreshTestJButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 440, -1, -1));

        supplierWorkRequestJTable.setBorder(javax.swing.BorderFactory.createEtchedBorder(null, new java.awt.Color(204, 204, 204)));
        supplierWorkRequestJTable.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        supplierWorkRequestJTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Item", "Quantity", "Priority", "Sender", "Assign", "Status", "Request date", "Resolve date"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Object.class, java.lang.Integer.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        supplierWorkRequestJTable.setCellSelectionEnabled(true);
        supplierWorkRequestJTable.setRowHeight(25);
        supplierWorkRequestJTable.setRowMargin(5);
        supplierWorkRequestJTable.setSelectionBackground(new java.awt.Color(110, 89, 222));
        jScrollPane2.setViewportView(supplierWorkRequestJTable);

        add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 270, 626, 137));

        assignTextField.setText("Assign Me");
        assignTextField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                assignTextFieldActionPerformed(evt);
            }
        });
        add(assignTextField, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 440, -1, -1));

        manageBtn.setText("Manage Inventory");
        manageBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                manageBtnActionPerformed(evt);
            }
        });
        add(manageBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 440, -1, -1));

        jLabel5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/userinterface/ManufacturerRole/images/Manufacturer.jpeg"))); // NOI18N
        add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(770, 100, 200, 200));

        nameLabel.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        nameLabel.setText("<Name Label>");
        add(nameLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(770, 310, 430, 30));

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel1.setText("Manufacture Order Request Status");
        add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 230, -1, -1));

        jPanel1.setBackground(new java.awt.Color(110, 89, 222));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        enterpriseLabel.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        enterpriseLabel.setText("Manufacturer :");
        jPanel1.add(enterpriseLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 110, 150, 30));

        valueLabel.setText("<value>");
        jPanel1.add(valueLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 110, 240, 26));

        add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1770, 180));
    }// </editor-fold>//GEN-END:initComponents

    private void refreshTestJButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_refreshTestJButtonActionPerformed
        
       // populateRequestTable();
    }//GEN-LAST:event_refreshTestJButtonActionPerformed

    private void assignTextFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_assignTextFieldActionPerformed
        // TODO add your handling code here:
        int flag=0;
        int selectedRow = supplierWorkRequestJTable.getSelectedRow();
        if (selectedRow >= 0) {
            request = (WorkRequest) supplierWorkRequestJTable.getValueAt(selectedRow, 0);
            if (request.getStatus().equalsIgnoreCase("Completed")) {
                JOptionPane.showMessageDialog(null, "Request Already Processed");
                return;
            }else{
                request.setReceiver(userAccount);
                request.setStatus("With Manufacturer Team");
                populateOrderTable();
                CardLayout layout = (CardLayout) userProcessContainer.getLayout();
                userProcessContainer.add("ManageInventoryJPanel", new ManageInventoryJPanel(userProcessContainer, userAccount, enterprise, request, manuDir,flag));
                layout.next(userProcessContainer);
            }
        }else {
            JOptionPane.showMessageDialog(null, "Choose a request to process");
            return;
        }
    }//GEN-LAST:event_assignTextFieldActionPerformed

    private void manageBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_manageBtnActionPerformed
        // TODO add your handling code here:
        int flag=1;
        CardLayout layout = (CardLayout) userProcessContainer.getLayout();
        userProcessContainer.add("ManageInventoryJPanel", new ManageInventoryJPanel(userProcessContainer, userAccount, enterprise, request, manuDir,flag));
        layout.next(userProcessContainer);
    }//GEN-LAST:event_manageBtnActionPerformed

public void populateOrderTable() {
        DefaultTableModel model = (DefaultTableModel) supplierWorkRequestJTable.getModel();

        model.setRowCount(0);
        for (WorkRequest request : organization.getWorkQueue().getWorkRequestList()) {
            System.out.println("Request="+request);
            Object[] row = new Object[8];
            row[0] = request;
            row[1] = request.getQuantity();
            row[2] = request.getPriority();
            row[3] = request.getSender();
            row[4] = request.getReceiver() == null ? null : request.getReceiver().getEmployee().getName();
            row[5] = request.getStatus();
            DateFormat dateformat = new SimpleDateFormat("MM/dd/yyyy");
            row[6] = dateformat.format(request.getRequestDate());
            if (request.getResolveDate() != null) {
                row[7] = dateformat.format(request.getResolveDate());
            } else {
                row[7] = "";
            }

            model.addRow(row);
        }
    }    
    
    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton assignTextField;
    private javax.swing.JLabel enterpriseLabel;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JButton manageBtn;
    private javax.swing.JLabel nameLabel;
    private javax.swing.JButton refreshTestJButton;
    private javax.swing.JTable supplierWorkRequestJTable;
    private javax.swing.JLabel valueLabel;
    // End of variables declaration//GEN-END:variables
}