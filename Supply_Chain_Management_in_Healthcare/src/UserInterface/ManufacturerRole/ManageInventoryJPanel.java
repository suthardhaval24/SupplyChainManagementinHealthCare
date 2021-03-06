/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package userinterface.ManufacturerRole;

import Business.Enterprise.Enterprise;
import Business.Inventory.Catalog;
import Business.Inventory.Category;
import Business.Inventory.HospitalInventory;
import Business.Inventory.Item;
import Business.Inventory.ManufactureInventory;
import Business.UserAccount.UserAccount;
import Business.WorkQueue.WorkRequest;
import java.awt.CardLayout;
import java.util.Date;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Krina Thakkar
 */
public class ManageInventoryJPanel extends javax.swing.JPanel {

    private JPanel userProcessContainer;
    private Enterprise enterprise;
    private UserAccount userAccount;
    private HospitalInventory catDir;
    private ManufactureInventory manuDir;
    private WorkRequest workRequest;
    private int flag;

    /**
     * Creates new form ManageInventoryJPanel
     */
    public ManageInventoryJPanel(JPanel userProcessContainer, UserAccount account, Enterprise enterprise, WorkRequest request, ManufactureInventory manuDir, int flag) {
        initComponents();
        this.catDir = catDir;
        this.userProcessContainer = userProcessContainer;
        this.enterprise = enterprise;
        this.userAccount = account;
        this.workRequest = request;
        this.manuDir = manuDir;
        nameLabel.setText(userAccount.getUsername());
        this.flag = flag;
        populateItems();
        if (flag == 0) {
            addItemBtn.setEnabled(false);
            shipSupplierBtn.setEnabled(true);
        }
        if (flag == 1) {
            addItemBtn.setEnabled(true);
            shipSupplierBtn.setEnabled(false);
        }
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        InventoryJTable = new javax.swing.JTable();
        addItemBtn = new javax.swing.JButton();
        shipSupplierBtn = new javax.swing.JButton();
        backBtn = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        nameLabel = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();

        setBackground(new java.awt.Color(255, 255, 255));
        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        InventoryJTable.setBorder(javax.swing.BorderFactory.createEtchedBorder(null, new java.awt.Color(204, 204, 204)));
        InventoryJTable.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        InventoryJTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Catalog", "Category", "Item", "Quantity"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.Integer.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        InventoryJTable.setToolTipText("Hospital Inventory");
        InventoryJTable.setColumnSelectionAllowed(true);
        InventoryJTable.setRowHeight(25);
        InventoryJTable.setRowMargin(5);
        InventoryJTable.setSelectionBackground(new java.awt.Color(110, 89, 222));
        jScrollPane1.setViewportView(InventoryJTable);

        add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(48, 267, 550, 150));

        addItemBtn.setText("Add Item");
        addItemBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addItemBtnActionPerformed(evt);
            }
        });
        add(addItemBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(286, 448, 90, -1));

        shipSupplierBtn.setText("Ship to Supplier");
        shipSupplierBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                shipSupplierBtnActionPerformed(evt);
            }
        });
        add(shipSupplierBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(426, 448, -1, -1));

        backBtn.setText("<< Back");
        backBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                backBtnActionPerformed(evt);
            }
        });
        add(backBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(151, 448, 90, -1));

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel1.setText("Manufacturer Inventory");
        add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 220, -1, -1));

        nameLabel.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        nameLabel.setText("<Name Label>");
        add(nameLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(860, 320, 440, 30));

        jLabel5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/userinterface/ManufacturerRole/images/Manufacturer.jpeg"))); // NOI18N
        add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(860, 70, 200, 230));

        jPanel1.setBackground(new java.awt.Color(110, 89, 222));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel3.setText("Manage Manufacturer Inventory");
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 30, 440, 40));

        add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1770, 180));
    }// </editor-fold>//GEN-END:initComponents

    private void addItemBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addItemBtnActionPerformed
        // TODO add your handling code here:
        CardLayout layout = (CardLayout) userProcessContainer.getLayout();
        userProcessContainer.add("AddItemJPanel", new AddItemsJPanel(userProcessContainer, userAccount, enterprise, manuDir));
        layout.next(userProcessContainer);
    }//GEN-LAST:event_addItemBtnActionPerformed

    private void backBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backBtnActionPerformed
        // TODO add your handling code here:
        userProcessContainer.remove(this);
        CardLayout layout = (CardLayout) userProcessContainer.getLayout();
        layout.previous(userProcessContainer);
    }//GEN-LAST:event_backBtnActionPerformed

    private void shipSupplierBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_shipSupplierBtnActionPerformed
        boolean c = true;
        int final_count = 0;
        String dr_catalog = workRequest.getCatalog();
        String dr_category = workRequest.getCategory();
        String dr_item = workRequest.getItem();
        int dr_quantity = workRequest.getQuantity();
        int selectedRow = InventoryJTable.getSelectedRow();
        if (selectedRow >= 0) {
            if (workRequest.getStatus() != "Completed") {
                for (Catalog catalog : manuDir.getCatalogDir()) {
                    for (Category cateory : catalog.getCategoryDir()) {
                        for (Item item : cateory.getItemDir()) {
                            if (catalog.getCatalogName().equalsIgnoreCase(dr_catalog)
                                    && cateory.getCategoryName().equalsIgnoreCase(dr_category)
                                    && item.getName().equalsIgnoreCase(dr_item)&& c) {
                                if (item.getQuantity() >= dr_quantity) {
                                    final_count = item.getQuantity() - dr_quantity;
                                    //System.out.println(final_count);
                                    item.setQuantity(final_count);
                                    workRequest.setStatus("Completed");
                                    workRequest.setResolveDate(new Date());
                                    c = false;
                                    populateItems();
                                    JOptionPane.showMessageDialog(null, "Item sent Successfully");
                                } else {
                                    JOptionPane.showMessageDialog(null, "Not enough quantity of " + dr_item + ",Request " + dr_quantity + " to supplier");
                                    break;
                                }
                            } else {
                                JOptionPane.showMessageDialog(null, "Please select correct item");
                            }
                        }
                    }
                }

                JOptionPane.showMessageDialog(null, "Choose a request to process");
                return;
            }

    }//GEN-LAST:event_shipSupplierBtnActionPerformed

    }

    public void populateItems() {
        DefaultTableModel model = (DefaultTableModel) InventoryJTable.getModel();
        model.setRowCount(0);

        for (Catalog catalog : manuDir.getCatalogDir()) {
            Object[] row = new Object[4];
            row[0] = catalog.getCatalogName();
            for (Category category : catalog.getCategoryDir()) {
                row[1] = category.getCategoryName();
                for (Item item : category.getItemDir()) {
                    row[2] = item.getName();
                    row[3] = item.getQuantity();
                }
            }
            model.addRow(row);
        }
    }


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTable InventoryJTable;
    private javax.swing.JButton addItemBtn;
    private javax.swing.JButton backBtn;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel nameLabel;
    private javax.swing.JButton shipSupplierBtn;
    // End of variables declaration//GEN-END:variables
}
