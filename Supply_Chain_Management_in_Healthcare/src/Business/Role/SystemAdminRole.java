/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Role;

import Business.EcoSystem;
import Business.Enterprise.Enterprise;
import Business.Inventory.HospitalInventory;
import Business.Inventory.ManufactureInventory;
import Business.Organization.Organization;
import Business.UserAccount.UserAccount;
import javax.swing.JPanel;
import userinterface.SystemAdminWOrkArea.SystemAdminWorkAreaJPanel;

/**
 *
 * @author sutha
 */
public class SystemAdminRole extends Role{

    @Override
    public JPanel createWorkArea(JPanel userProcessContainer, UserAccount account, Organization organization, Enterprise enterprise, EcoSystem system,HospitalInventory catDir,ManufactureInventory manuDir) {
        return new SystemAdminWorkAreaJPanel(userProcessContainer, system);
    }
    
}
