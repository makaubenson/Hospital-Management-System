/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hospital.management.system;
import java.sql.*;
import javax.swing.JOptionPane;
import net.proteanit.sql.DbUtils;
import project.ConnectionProvider;
        
        /**
 *
 * @author Benson
 */
public class addDiagnosisInformation extends javax.swing.JFrame {
public int flag=0;
    /**
     * Creates new form addDiagnosisInformation
     */
    public addDiagnosisInformation() {
        initComponents();
        lblDisplayText.setVisible(false);
        comboBoxWardType.setVisible(false);
        lblTypeOfWard.setVisible(false);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        txtPatientID = new javax.swing.JTextField();
        btnSearch = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        resultTable = new javax.swing.JTable();
        lblDisplayText = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        txtSymptoms = new javax.swing.JTextField();
        txtDiagnosis = new javax.swing.JTextField();
        txtMedicine = new javax.swing.JTextField();
        checkBoxWardRequired = new javax.swing.JLabel();
        lblTypeOfWard = new javax.swing.JLabel();
        wardCheckBox = new javax.swing.JCheckBox();
        comboBoxWardType = new javax.swing.JComboBox<>();
        btnSave = new javax.swing.JButton();
        btnClose = new javax.swing.JButton();
        jLabel6 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setLocation(new java.awt.Point(290, 160));
        setUndecorated(true);
        setPreferredSize(new java.awt.Dimension(780, 500));
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(51, 51, 255));
        jLabel1.setText("PATIENT DIAGNOSIS INFORMATION");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(213, 30, -1, -1));

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel2.setText("patientID");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(134, 75, 94, 25));

        txtPatientID.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        getContentPane().add(txtPatientID, new org.netbeans.lib.awtextra.AbsoluteConstraints(232, 75, 226, 25));

        btnSearch.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        btnSearch.setForeground(new java.awt.Color(255, 0, 0));
        btnSearch.setIcon(new javax.swing.ImageIcon(getClass().getResource("/hospital/management/system/search.png"))); // NOI18N
        btnSearch.setText("Search");
        btnSearch.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSearchActionPerformed(evt);
            }
        });
        getContentPane().add(btnSearch, new org.netbeans.lib.awtextra.AbsoluteConstraints(503, 70, 120, 34));

        resultTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane1.setViewportView(resultTable);

        getContentPane().add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(27, 157, 710, 54));

        lblDisplayText.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        lblDisplayText.setForeground(new java.awt.Color(255, 0, 0));
        lblDisplayText.setText("PatientID does not Exist!!");
        getContentPane().add(lblDisplayText, new org.netbeans.lib.awtextra.AbsoluteConstraints(272, 122, -1, -1));

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel3.setText("Symptoms");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(82, 289, 88, -1));

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel4.setText("Diagnosis");
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(82, 331, 88, -1));

        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel5.setText("Medicine");
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(82, 372, 88, -1));
        getContentPane().add(txtSymptoms, new org.netbeans.lib.awtextra.AbsoluteConstraints(212, 289, 215, -1));
        getContentPane().add(txtDiagnosis, new org.netbeans.lib.awtextra.AbsoluteConstraints(212, 331, 215, -1));

        txtMedicine.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        getContentPane().add(txtMedicine, new org.netbeans.lib.awtextra.AbsoluteConstraints(212, 369, 215, -1));

        checkBoxWardRequired.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        checkBoxWardRequired.setText("Ward Required ?");
        getContentPane().add(checkBoxWardRequired, new org.netbeans.lib.awtextra.AbsoluteConstraints(454, 289, -1, -1));

        lblTypeOfWard.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        lblTypeOfWard.setText("Type Of Ward");
        getContentPane().add(lblTypeOfWard, new org.netbeans.lib.awtextra.AbsoluteConstraints(454, 331, -1, -1));

        wardCheckBox.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        wardCheckBox.setText("Yes");
        wardCheckBox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                wardCheckBoxActionPerformed(evt);
            }
        });
        getContentPane().add(wardCheckBox, new org.netbeans.lib.awtextra.AbsoluteConstraints(595, 285, 83, -1));

        comboBoxWardType.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        comboBoxWardType.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "General", "Single", "Duo" }));
        getContentPane().add(comboBoxWardType, new org.netbeans.lib.awtextra.AbsoluteConstraints(595, 328, -1, -1));

        btnSave.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        btnSave.setIcon(new javax.swing.ImageIcon(getClass().getResource("/hospital/management/system/save-icon--1.png"))); // NOI18N
        btnSave.setText("Save");
        btnSave.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSaveActionPerformed(evt);
            }
        });
        getContentPane().add(btnSave, new org.netbeans.lib.awtextra.AbsoluteConstraints(212, 410, 98, 41));

        btnClose.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        btnClose.setIcon(new javax.swing.ImageIcon(getClass().getResource("/hospital/management/system/Close.png"))); // NOI18N
        btnClose.setText("Close");
        btnClose.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCloseActionPerformed(evt);
            }
        });
        getContentPane().add(btnClose, new org.netbeans.lib.awtextra.AbsoluteConstraints(619, 410, 108, 41));

        jLabel6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/hospital/management/system/add new patient background.jpg"))); // NOI18N
        getContentPane().add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnCloseActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCloseActionPerformed
        // TODO add your handling code here:
        int a = JOptionPane.showConfirmDialog(null,"Do you wamt to close?","Warning!!",JOptionPane.YES_NO_OPTION);
        if(a==0){
        setVisible(false);
        new home().setVisible(true);
        }
        //end of if
    }//GEN-LAST:event_btnCloseActionPerformed

    private void wardCheckBoxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_wardCheckBoxActionPerformed
        // TODO add your handling code here:
        if(wardCheckBox.isSelected())
        {
        lblTypeOfWard.setVisible(true);
        comboBoxWardType.setVisible(true);
        }
        else{
        lblTypeOfWard.setVisible(false);
        comboBoxWardType.setVisible(false);
        
        }
    }//GEN-LAST:event_wardCheckBoxActionPerformed

    private void btnSearchActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSearchActionPerformed
        // TODO add your handling code here:
        String patientID = txtPatientID.getText();
        try{
        Connection con = ConnectionProvider.getCon();
        Statement st = con.createStatement();
        ResultSet rs= st.executeQuery("SELECT * FROM patient WHERE patientID ='"+patientID+"'  ");
        //to display the result set to table we write the 1 line code below
        resultTable.setModel(DbUtils.resultSetToTableModel(rs));
        
        if(!rs.first()){
        lblDisplayText.setVisible(true);
        
        }else{
        lblDisplayText.setVisible(false);       
        txtPatientID.setEditable(false);
        flag=1;
        }
        //end of if_else
        
        
        }
        //end of try 
        
        catch(Exception e)
        {
            JOptionPane.showConfirmDialog(null, "Connection Error!!");
        
        }
        //end of catch
        
    }//GEN-LAST:event_btnSearchActionPerformed

    private void btnSaveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSaveActionPerformed
        // TODO add your handling code here:
        //flag being equal to 1 means that patientID is correct
        if(flag==1){
       String patientID =txtPatientID.getText();
       String symptom = txtSymptoms.getText();
       String diagnosis = txtDiagnosis.getText();
       String medicines = txtMedicine.getText();
       String wardReq;
       String typeWard;
       
       if(wardCheckBox.isSelected()){
       wardReq ="YES";
       typeWard= (String)comboBoxWardType.getSelectedItem();
       }
       else{
       wardReq ="NO";
       typeWard="";              
       }
       
       
       try{
       Connection con = ConnectionProvider.getCon();
       Statement st = con.createStatement();
       st.executeUpdate("INSERT INTO patientreport values('"+patientID+"','"+symptom+"','"+diagnosis+"','"+medicines+"','"+wardReq+"','"+typeWard+"')  ");
       JOptionPane.showMessageDialog(null, "Records updated successfully!");
       
       setVisible(false);
       new addDiagnosisInformation().setVisible(true);
       }
       //end of try
       catch(Exception e){
       JOptionPane.showMessageDialog(null, "patientID field is empty. Please fill in the record!");
       }
        
        }
        
        
        
    }//GEN-LAST:event_btnSaveActionPerformed

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
            java.util.logging.Logger.getLogger(addDiagnosisInformation.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(addDiagnosisInformation.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(addDiagnosisInformation.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(addDiagnosisInformation.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new addDiagnosisInformation().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnClose;
    private javax.swing.JButton btnSave;
    private javax.swing.JButton btnSearch;
    private javax.swing.JLabel checkBoxWardRequired;
    private javax.swing.JComboBox<String> comboBoxWardType;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lblDisplayText;
    private javax.swing.JLabel lblTypeOfWard;
    private javax.swing.JTable resultTable;
    private javax.swing.JTextField txtDiagnosis;
    private javax.swing.JTextField txtMedicine;
    private javax.swing.JTextField txtPatientID;
    private javax.swing.JTextField txtSymptoms;
    private javax.swing.JCheckBox wardCheckBox;
    // End of variables declaration//GEN-END:variables
}
