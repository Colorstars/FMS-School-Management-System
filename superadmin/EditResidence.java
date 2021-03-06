/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package superadmin;

import java.awt.event.ActionEvent;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.AbstractAction;
import javax.swing.JOptionPane;
import javax.swing.Action;
import javax.swing.DefaultComboBoxModel;
import selects.QueryClassDetails;
import selects.QueryStudentDetails;

/**
 *
 * @author franq
 */
public class EditResidence extends javax.swing.JFrame {

    /**
     * Creates new form NewResidence
     */
    
    
    private static ArrayList<String> details;
    private static String termname,year;
    private static int termid;
    private static int counter;
    private static Action radio1event,radio2event,radio3event;
    private ArrayList<String> residencenames;
    private static int residenceid;
    private int totalnumclasses;
    
    public EditResidence() {
        year = selects.QueryMainDetails.getCurrentYear();
        residencenames = QueryStudentDetails.getResidenceNames();
        constructor();
        cmbresidence.setModel(new DefaultComboBoxModel(residencenames.toArray(new String[residencenames.size()])));
        //get names of all classes
            
    }
    private static boolean saved;
    
    private void constructor()
    {
        saved=false;
        initComponents();
        year = selects.QueryMainDetails.getCurrentYear();
        counter = 0;
        
        radio1event = new AbstractAction()
        {
        @Override
        public void actionPerformed(ActionEvent e)
        {
            if(jrterm1.isSelected() == true)
                {
                    jrterm2.setSelected(false);
                    jrterm3.setSelected(false);
                    termname = "FIRST TERM";
                }
              }
        };
        
        jrterm1.addActionListener(radio1event);
        
        
        radio2event = new AbstractAction()
        {
        @Override
        public void actionPerformed(ActionEvent e)
        {
            if(jrterm2.isSelected() == true)
                {
                    jrterm1.setSelected(false);
                    jrterm3.setSelected(false);
                    termname = "SECOND TERM";
                }
              }
        };
        
        jrterm2.addActionListener(radio2event);
        
        
         radio3event = new AbstractAction()
        {
        @Override
        public void actionPerformed(ActionEvent e)
        {
            if(jrterm3.isSelected() == true)
                {
                  jrterm2.setSelected(false);
                jrterm1.setSelected(false);
                 termname = "THIRD TERM";
                }
              }
        };
        
        jrterm3.addActionListener(radio3event);
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
        jPanel2 = new javax.swing.JPanel();
        cmbgender = new javax.swing.JComboBox();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        tfresidencename = new javax.swing.JFormattedTextField();
        jLabel10 = new javax.swing.JLabel();
        spncapacity = new javax.swing.JSpinner();
        jButton1 = new javax.swing.JButton();
        jLabel14 = new javax.swing.JLabel();
        tffee = new javax.swing.JFormattedTextField();
        jLabel15 = new javax.swing.JLabel();
        jrterm1 = new javax.swing.JRadioButton();
        jrterm2 = new javax.swing.JRadioButton();
        jrterm3 = new javax.swing.JRadioButton();
        jButton4 = new javax.swing.JButton();
        btnok = new javax.swing.JButton();
        btncontinue = new javax.swing.JButton();
        jLabel6 = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        jLabel11 = new javax.swing.JLabel();
        cmbresidence = new javax.swing.JComboBox();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Residence Details");
        setIconImage(selects.QueryMainDetails.setIcon());
        setResizable(false);

        jPanel1.setPreferredSize(new java.awt.Dimension(911, 469));

        cmbgender.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Select", "Male", "Female", "Mixed" }));
        cmbgender.setEnabled(false);

        jLabel8.setForeground(new java.awt.Color(0, 0, 240));
        jLabel8.setText("Gender");

        jLabel9.setForeground(new java.awt.Color(0, 0, 240));
        jLabel9.setText("Residence Name");

        tfresidencename.setEnabled(false);

        jLabel10.setForeground(new java.awt.Color(0, 0, 240));
        jLabel10.setText("Capacity");

        spncapacity.setModel(new javax.swing.SpinnerNumberModel(0, 0, 10000, 1));
        spncapacity.setEnabled(false);

        jButton1.setText("Save");
        jButton1.setEnabled(false);
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jLabel14.setForeground(new java.awt.Color(0, 0, 240));
        jLabel14.setText("Fee");

        tffee.setEnabled(false);

        jLabel15.setForeground(new java.awt.Color(0, 0, 240));
        jLabel15.setText("Term");

        jrterm1.setText("Term 1");
        jrterm1.setEnabled(false);
        jrterm1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jrterm1ActionPerformed(evt);
            }
        });

        jrterm2.setText("Term 2");
        jrterm2.setEnabled(false);
        jrterm2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jrterm2ActionPerformed(evt);
            }
        });

        jrterm3.setText("Term 3");
        jrterm3.setEnabled(false);
        jrterm3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jrterm3ActionPerformed(evt);
            }
        });

        jButton4.setText("Cancel");
        jButton4.setEnabled(false);
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });

        btnok.setText("Ok");
        btnok.setEnabled(false);
        btnok.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnokActionPerformed(evt);
            }
        });

        btncontinue.setText("Continue");
        btncontinue.setEnabled(false);
        btncontinue.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btncontinueActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(95, 95, 95)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGap(53, 53, 53)
                                .addComponent(jButton4)
                                .addGap(199, 199, 199)
                                .addComponent(btnok))
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(jLabel15)
                                .addGap(162, 162, 162)
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jrterm2, javax.swing.GroupLayout.PREFERRED_SIZE, 74, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jrterm1)
                                    .addComponent(jrterm3, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 129, Short.MAX_VALUE)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addGroup(jPanel2Layout.createSequentialGroup()
                                    .addComponent(jLabel10)
                                    .addGap(50, 50, 50)
                                    .addComponent(spncapacity, javax.swing.GroupLayout.PREFERRED_SIZE, 209, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(jPanel2Layout.createSequentialGroup()
                                    .addComponent(jLabel14)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(tffee, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(jButton1)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 192, Short.MAX_VALUE)
                                .addComponent(btncontinue))))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel9)
                            .addComponent(jLabel8))
                        .addGap(64, 64, 64)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(cmbgender, javax.swing.GroupLayout.PREFERRED_SIZE, 187, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(tfresidencename))))
                .addGap(73, 73, 73))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(42, 42, 42)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel9)
                    .addComponent(tfresidencename, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 45, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                        .addComponent(jLabel15)
                        .addGap(117, 117, 117))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(cmbgender, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel10)
                            .addComponent(spncapacity, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel8))
                        .addGap(51, 51, 51)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel14)
                            .addComponent(tffee, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jrterm1))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jrterm2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jrterm3)
                        .addGap(30, 30, 30)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jButton4)
                            .addComponent(btnok)
                            .addComponent(jButton1)
                            .addComponent(btncontinue))
                        .addContainerGap())))
        );

        jLabel6.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(0, 0, 240));
        jLabel6.setText("Edit The Residence Details");

        jLabel11.setForeground(new java.awt.Color(0, 0, 240));
        jLabel11.setText("Residence Name");

        jButton2.setText("Edit");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jButton3.setText("Cancel");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addGap(88, 88, 88)
                .addComponent(jLabel11)
                .addGap(67, 67, 67)
                .addComponent(cmbresidence, javax.swing.GroupLayout.PREFERRED_SIZE, 226, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jButton2)
                .addGap(164, 164, 164)
                .addComponent(jButton3)
                .addGap(75, 75, 75))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel11)
                    .addComponent(cmbresidence, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton2)
                    .addComponent(jButton3))
                .addGap(68, 68, 68))
        );

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(346, 346, 346)
                .addComponent(jLabel6)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(10, 10, 10)
                .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 21, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 64, Short.MAX_VALUE)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 993, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 474, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        String residencename,gender,capacity,fee;
        residencename = tfresidencename.getText().toUpperCase();
        gender = cmbgender.getSelectedItem().toString();
        capacity =  spncapacity.getValue().toString();
        fee = tffee.getText();
        
        if("".equals(residencename))
        {
            JOptionPane.showMessageDialog(null,
                        "Please Enter Residence Name to Continue\n", "Warning",JOptionPane.WARNING_MESSAGE);
        }
        else if(jrterm1.isSelected() == false && jrterm2.isSelected() == false && jrterm3.isSelected() == false)
        {
            JOptionPane.showMessageDialog(null,
                "Please Select Term to Continue\n", "Warning",JOptionPane.WARNING_MESSAGE);
        }
        else if("Select".equals(gender))
        {
            JOptionPane.showMessageDialog(null,
                        "Please Select Gender Details to Continue\n", "Warning",JOptionPane.WARNING_MESSAGE);
        }
        else if("0".equals(capacity))
        {
            JOptionPane.showMessageDialog(null,
                        "Please Enter Capacity to Continue\n", "Warning",JOptionPane.WARNING_MESSAGE);
        }
        else if("".equals(fee))
        {
            JOptionPane.showMessageDialog(null,
                        "Please Enter Required Fee ammount to Continue\n", "Warning",JOptionPane.WARNING_MESSAGE);
        }
        else
        {
            try {
                
                termid = selects.QueryTermDetails.getTermID(termname, year);
                //sqlinserts.NewResidence.createNewResidence(termid,residencename, Integer.parseInt(capacity), gender, Double.parseDouble(fee));
                sqlupdates.ResidenceDetails.updateResidence(termid, residencename, capacity, gender, Double.parseDouble(fee), residenceid);
                 JOptionPane.showMessageDialog(null, "Residence Details Have been Updated \n" +
                        "Press Ok to Continue", "Success", JOptionPane.INFORMATION_MESSAGE);
                 saved=true;
                 btnok.setEnabled(true);
                 btncontinue.setEnabled(true);
                 counter++;
                 if(counter>=3)
                 {
                     constructor();
                 }
                 
            } catch (SQLException ex) {
                Logger.getLogger(EditResidence.class.getName()).log(Level.SEVERE, null, ex);
                
                 if(ex.getErrorCode() == 1062)
                {
                JOptionPane.showMessageDialog(null, "The Residence You are Trying to Create Has Already Been Created Before. \n" +
                        "Press Ok to continue", "Warning "+ex.getErrorCode(), JOptionPane.WARNING_MESSAGE);
                }
                else
                {
                JOptionPane.showMessageDialog(null, "Some unexpected error occured \n" +
                        "Please contact the system administrator", "Error ", JOptionPane.ERROR_MESSAGE);
                }
                this.hide();
            }
        }
       
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
         this.dispose();
    }//GEN-LAST:event_jButton4ActionPerformed

    private void jrterm1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jrterm1ActionPerformed
        // TODO add your handling code here:
       
    }//GEN-LAST:event_jrterm1ActionPerformed

    private void jrterm2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jrterm2ActionPerformed
        // TODO add your handling code here:
       
    }//GEN-LAST:event_jrterm2ActionPerformed

    private void jrterm3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jrterm3ActionPerformed
        // TODO add your handling code here:
        
    }//GEN-LAST:event_jrterm3ActionPerformed

    private void btnokActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnokActionPerformed
        // TODO add your handling code here:
         if(saved==true)
        {
            this.dispose();
        }
        else
        {
            JOptionPane.showMessageDialog(null, "" +
                        "Please Save Residence Details to Exit", "Success", JOptionPane.WARNING_MESSAGE);
        }
    }//GEN-LAST:event_btnokActionPerformed

    private void btncontinueActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btncontinueActionPerformed
        // TODO add your handling code here:
        if(saved==true)
        {
            constructor();
            jrterm1.setEnabled(false);
            jrterm2.setEnabled(false);
            jrterm3.setEnabled(false);
            cmbgender.setEnabled(false);
            cmbgender.setSelectedIndex(0);
            saved=false;
        }
        else
        {
            JOptionPane.showMessageDialog(null, "" +
                        "Please Save Residence Details to Continue", "Success", JOptionPane.WARNING_MESSAGE);
        }
    }//GEN-LAST:event_btncontinueActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:
        String residenceidstr = cmbresidence.getSelectedItem().toString();
        selects.QueryResidenceDetails.getResidenceNames();
        int residenceidid = selects.QueryResidenceDetails.listofnames.indexOf(residenceidstr);
        residenceid = Integer.parseInt(selects.QueryResidenceDetails.listofids.get(residenceidid).toString());
      
        details = selects.QueryResidenceDetails.getResidenceInfo(residenceid);
        
        //initialize the objects below it.
        termid = Integer.parseInt(details.get(0));
        String termnm = selects.QueryTermDetails.getTermName(termid);
        if("FIRST TERM".equals(termnm))
            jrterm1.setSelected(true);
        else if("SECOND TERM".equals(termnm))
            jrterm2.setSelected(true);
        else if("THIRD TERM".equals(termnm))
            jrterm3.setSelected(true);
        
        tfresidencename.setText(details.get(1));
        spncapacity.setValue(Integer.parseInt(details.get(2)));
        cmbgender.setSelectedItem(details.get(3));
        tffee.setText(details.get(4));
        
        activateForm();
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        // TODO add your handling code here:
        this.dispose();
    }//GEN-LAST:event_jButton3ActionPerformed

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
            java.util.logging.Logger.getLogger(EditResidence.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(EditResidence.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(EditResidence.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(EditResidence.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new EditResidence().setVisible(true);
            }
        });
    }
    
    
    private void activateForm()
    {
      tfresidencename.setEnabled(true);
      cmbgender.setEnabled(true);
      spncapacity.setEnabled(true);
      jrterm1.setEnabled(true);
      jrterm2.setEnabled(true);
      jrterm3.setEnabled(true);
      tffee.setEnabled(true);
      jButton4.setEnabled(true);
      jButton1.setEnabled(true);
    }
    
   //Thread to update the form once the class has been created
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btncontinue;
    private javax.swing.JButton btnok;
    private javax.swing.JComboBox cmbgender;
    private javax.swing.JComboBox cmbresidence;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JRadioButton jrterm1;
    private javax.swing.JRadioButton jrterm2;
    private javax.swing.JRadioButton jrterm3;
    private javax.swing.JSpinner spncapacity;
    private javax.swing.JFormattedTextField tffee;
    private javax.swing.JFormattedTextField tfresidencename;
    // End of variables declaration//GEN-END:variables
}
