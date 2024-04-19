/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package edu.bms.gui;


import edu.bms.ex.DuplicateEntryException;
import edu.bms.ex.SystemNotAvailableException;
import edu.bms.service.IAccountService;
import edu.bms.service.impl.AccountService;
import edu.bms.service.impl.XmlTest;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;




/**
 *
 * @author shahid
 */
public class NewAccountFrame extends javax.swing.JInternalFrame {
    
    private static Logger log = LogManager.getLogger(NewAccountFrame.class);    
    private static IAccountService accountService;
    /** Creates new form NewAccount */
    
    static{
        accountService = new AccountService();
//          accountService = new XmlTest();
    }
  
    public NewAccountFrame() {
        initComponents();
    }

    /** This method is called from within the constructor to
     * initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is
     * always regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        newAccountPanel = new javax.swing.JPanel();
        lblAccountholderName = new javax.swing.JLabel();
        lblAccountType = new javax.swing.JLabel();
        lblPhoneNumber = new javax.swing.JLabel();
        lblInitialAccount = new javax.swing.JLabel();
        txtAccountNumber = new javax.swing.JTextField();
        txtAccountHolderName = new javax.swing.JTextField();
        txtPhoneNumber = new javax.swing.JTextField();
        txtInitialAccount = new javax.swing.JTextField();
        lblAccountName = new javax.swing.JLabel();
        saveButton = new javax.swing.JButton();
        cbAccountType = new javax.swing.JComboBox<>();
        lblCnic = new javax.swing.JLabel();
        txtCnic = new javax.swing.JTextField();

        setBackground(new java.awt.Color(153, 153, 153));
        setClosable(true);
        setTitle("New Account");
        addInternalFrameListener(new javax.swing.event.InternalFrameListener() {
            public void internalFrameActivated(javax.swing.event.InternalFrameEvent evt) {
            }
            public void internalFrameClosed(javax.swing.event.InternalFrameEvent evt) {
            }
            public void internalFrameClosing(javax.swing.event.InternalFrameEvent evt) {
                formInternalFrameClosing(evt);
            }
            public void internalFrameDeactivated(javax.swing.event.InternalFrameEvent evt) {
            }
            public void internalFrameDeiconified(javax.swing.event.InternalFrameEvent evt) {
            }
            public void internalFrameIconified(javax.swing.event.InternalFrameEvent evt) {
            }
            public void internalFrameOpened(javax.swing.event.InternalFrameEvent evt) {
            }
        });
        addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                formKeyTyped(evt);
            }
        });

        newAccountPanel.setBackground(new java.awt.Color(204, 204, 255));

        lblAccountholderName.setText("Account Holder Name");

        lblAccountType.setText("Account Type");

        lblPhoneNumber.setText("Phone Number");

        lblInitialAccount.setText("Initial Account");

        txtAccountNumber.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtAccountNumberKeyTyped(evt);
            }
        });

        lblAccountName.setText("Account Number");

        saveButton.setText("Save");
        saveButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                saveButtonActionPerformed(evt);
            }
        });

        cbAccountType.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Select Type", "Current Account", "Saving  Account" }));

        lblCnic.setText("Cnic");

        javax.swing.GroupLayout newAccountPanelLayout = new javax.swing.GroupLayout(newAccountPanel);
        newAccountPanel.setLayout(newAccountPanelLayout);
        newAccountPanelLayout.setHorizontalGroup(
            newAccountPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(newAccountPanelLayout.createSequentialGroup()
                .addGap(17, 17, 17)
                .addGroup(newAccountPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(newAccountPanelLayout.createSequentialGroup()
                        .addComponent(lblInitialAccount, javax.swing.GroupLayout.PREFERRED_SIZE, 108, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(54, 54, 54)
                        .addComponent(txtInitialAccount))
                    .addGroup(newAccountPanelLayout.createSequentialGroup()
                        .addGroup(newAccountPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(newAccountPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, newAccountPanelLayout.createSequentialGroup()
                                    .addGroup(newAccountPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(lblAccountType, javax.swing.GroupLayout.PREFERRED_SIZE, 104, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(lblPhoneNumber, javax.swing.GroupLayout.PREFERRED_SIZE, 113, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGap(55, 55, 55))
                                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, newAccountPanelLayout.createSequentialGroup()
                                    .addComponent(lblAccountholderName, javax.swing.GroupLayout.PREFERRED_SIZE, 156, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED))
                                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, newAccountPanelLayout.createSequentialGroup()
                                    .addComponent(lblAccountName, javax.swing.GroupLayout.PREFERRED_SIZE, 135, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGap(33, 33, 33)))
                            .addGroup(newAccountPanelLayout.createSequentialGroup()
                                .addComponent(lblCnic, javax.swing.GroupLayout.PREFERRED_SIZE, 88, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(80, 80, 80)))
                        .addGroup(newAccountPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtAccountNumber, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(txtPhoneNumber, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(txtAccountHolderName, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(cbAccountType, javax.swing.GroupLayout.Alignment.TRAILING, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(txtCnic)))
                    .addComponent(saveButton, javax.swing.GroupLayout.PREFERRED_SIZE, 319, javax.swing.GroupLayout.PREFERRED_SIZE)))
        );
        newAccountPanelLayout.setVerticalGroup(
            newAccountPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(newAccountPanelLayout.createSequentialGroup()
                .addGroup(newAccountPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txtAccountNumber, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(newAccountPanelLayout.createSequentialGroup()
                        .addGap(6, 6, 6)
                        .addComponent(lblAccountName, javax.swing.GroupLayout.PREFERRED_SIZE, 21, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(newAccountPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txtAccountHolderName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(newAccountPanelLayout.createSequentialGroup()
                        .addGap(6, 6, 6)
                        .addComponent(lblAccountholderName, javax.swing.GroupLayout.PREFERRED_SIZE, 21, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(10, 10, 10)
                .addGroup(newAccountPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblAccountType, javax.swing.GroupLayout.PREFERRED_SIZE, 21, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cbAccountType, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(newAccountPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txtPhoneNumber, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(newAccountPanelLayout.createSequentialGroup()
                        .addGap(6, 6, 6)
                        .addComponent(lblPhoneNumber, javax.swing.GroupLayout.PREFERRED_SIZE, 21, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(newAccountPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtCnic, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblCnic))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(newAccountPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblInitialAccount, javax.swing.GroupLayout.PREFERRED_SIZE, 21, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtInitialAccount, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 45, Short.MAX_VALUE)
                .addComponent(saveButton)
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(49, 49, 49)
                .addComponent(newAccountPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(63, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(newAccountPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(14, 14, 14))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void formInternalFrameClosing(javax.swing.event.InternalFrameEvent evt) {//GEN-FIRST:event_formInternalFrameClosing
        int selection = JOptionPane.showConfirmDialog(null, "Are you sure", "Warninig", JOptionPane.YES_NO_OPTION);
        if (selection == JOptionPane.YES_OPTION) {
            this.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        }
        else{
        this.setDefaultCloseOperation(JFrame.DO_NOTHING_ON_CLOSE);
        }
    }//GEN-LAST:event_formInternalFrameClosing

    private void saveButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_saveButtonActionPerformed
//                log.info("Account Number: "+this.txtAccountNumber.getText()+ "\n"
//                +"Account Holder: "+this.txtAccountHolderName.getText() +"\n"
//                +"Initial Account:"+this.txtInitialAccount.getText() +"\n"
//                +"Phone Number:   "+this.txtPhoneNumber.getText() +"\n"
//                +"Account Type:   "+this.cbAccountType.getSelectedItem().toString());
               try {
             
                this.accountService.openAccount(Long.parseLong(
                        this.txtAccountNumber.getText()),
                        this.txtAccountHolderName.getText(),
                        this.txtCnic.getText(),
                        this.txtPhoneNumber.getText(),
                        this.cbAccountType.getSelectedItem().toString(),
                        Double.parseDouble(
                        this.txtInitialAccount.getText()));
                
                } catch (SystemNotAvailableException | DuplicateEntryException ex) {
                    log.error("somethig went wrong"+ ex);
        }
    }//GEN-LAST:event_saveButtonActionPerformed

    private void formKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_formKeyTyped
        
    }//GEN-LAST:event_formKeyTyped

    private void txtAccountNumberKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtAccountNumberKeyTyped
       if(!Character.isDigit(evt.getKeyChar())){
           evt.consume();
       }
    }//GEN-LAST:event_txtAccountNumberKeyTyped


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox<String> cbAccountType;
    private javax.swing.JLabel lblAccountName;
    private javax.swing.JLabel lblAccountType;
    private javax.swing.JLabel lblAccountholderName;
    private javax.swing.JLabel lblCnic;
    private javax.swing.JLabel lblInitialAccount;
    private javax.swing.JLabel lblPhoneNumber;
    private javax.swing.JPanel newAccountPanel;
    private javax.swing.JButton saveButton;
    private javax.swing.JTextField txtAccountHolderName;
    private javax.swing.JTextField txtAccountNumber;
    private javax.swing.JTextField txtCnic;
    private javax.swing.JTextField txtInitialAccount;
    private javax.swing.JTextField txtPhoneNumber;
    // End of variables declaration//GEN-END:variables

}