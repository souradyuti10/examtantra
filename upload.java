/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package examtantra;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import javax.swing.JOptionPane;



/**
 *
 * @author Subhra CHOUDHURY
 */
public class upload extends javax.swing.JFrame {
      public String code;
      public int qn;
    /**
     * Creates new form upload
     */
    public upload(String c,int d) {
        initComponents();
        code=c;
        qn=d;
    }

    upload() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        jScrollPane5 = new javax.swing.JScrollPane();
        jTextArea5 = new javax.swing.JTextArea();
        quesno = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        ques = new javax.swing.JTextArea();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        upload = new javax.swing.JButton();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        testcode = new javax.swing.JTextField();
        o1 = new javax.swing.JRadioButton();
        o2 = new javax.swing.JRadioButton();
        o3 = new javax.swing.JRadioButton();
        o4 = new javax.swing.JRadioButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        op1 = new javax.swing.JTextArea();
        jScrollPane3 = new javax.swing.JScrollPane();
        op2 = new javax.swing.JTextArea();
        jScrollPane4 = new javax.swing.JScrollPane();
        op3 = new javax.swing.JTextArea();
        jScrollPane6 = new javax.swing.JScrollPane();
        op4 = new javax.swing.JTextArea();

        jTextArea5.setColumns(20);
        jTextArea5.setRows(5);
        jScrollPane5.setViewportView(jTextArea5);

        setDefaultCloseOperation(javax.swing.WindowConstants.DO_NOTHING_ON_CLOSE);
        addWindowStateListener(new java.awt.event.WindowStateListener() {
            public void windowStateChanged(java.awt.event.WindowEvent evt) {
                formWindowStateChanged(evt);
            }
        });
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowActivated(java.awt.event.WindowEvent evt) {
                formWindowActivated(evt);
            }
            public void windowOpened(java.awt.event.WindowEvent evt) {
                formWindowOpened(evt);
            }
        });

        quesno.setEditable(false);

        jLabel1.setText("QUESTION  NO.");

        jLabel2.setText("QUESTION");

        ques.setColumns(20);
        ques.setRows(5);
        ques.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                quesFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                quesFocusLost(evt);
            }
        });
        jScrollPane1.setViewportView(ques);

        jLabel3.setText("OPTION 1");

        jLabel4.setText("OPTION 2");

        jLabel5.setText("OPTION 3");

        jLabel6.setText("OPTION 4");

        upload.setText("UPLOAD");
        upload.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                uploadActionPerformed(evt);
            }
        });

        jLabel7.setText("CORRECT ANS");

        jLabel8.setText("TEST CODE");

        testcode.setEditable(false);

        buttonGroup1.add(o1);
        o1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                o1ActionPerformed(evt);
            }
        });

        buttonGroup1.add(o2);
        o2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                o2ActionPerformed(evt);
            }
        });

        buttonGroup1.add(o3);
        o3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                o3ActionPerformed(evt);
            }
        });

        buttonGroup1.add(o4);
        o4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                o4ActionPerformed(evt);
            }
        });

        op1.setColumns(20);
        op1.setRows(5);
        jScrollPane2.setViewportView(op1);

        op2.setColumns(20);
        op2.setRows(5);
        jScrollPane3.setViewportView(op2);

        op3.setColumns(20);
        op3.setRows(5);
        jScrollPane4.setViewportView(op3);

        op4.setColumns(20);
        op4.setRows(5);
        jScrollPane6.setViewportView(op4);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                .addGap(292, 292, 292)
                                .addComponent(upload))
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                .addGap(66, 66, 66)
                                .addComponent(jLabel2)
                                .addGap(59, 59, 59)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(jScrollPane2)
                                    .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 396, Short.MAX_VALUE)
                                    .addComponent(jScrollPane3, javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jScrollPane4)
                                    .addComponent(jScrollPane6, javax.swing.GroupLayout.Alignment.TRAILING))
                                .addGap(51, 51, 51)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(o3)
                                    .addComponent(o2)
                                    .addComponent(o1)
                                    .addComponent(o4))))
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                        .addGap(66, 66, 66)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel6, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel3, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel4, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel5, javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel1)
                                .addGap(34, 34, 34)
                                .addComponent(quesno, javax.swing.GroupLayout.PREFERRED_SIZE, 131, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 198, Short.MAX_VALUE)
                                .addComponent(jLabel8)
                                .addGap(35, 35, 35)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel7)
                                    .addComponent(testcode, javax.swing.GroupLayout.PREFERRED_SIZE, 115, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(4, 4, 4)))))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(41, 41, 41)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(3, 3, 3)
                        .addComponent(jLabel1))
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(quesno, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel8)
                        .addComponent(testcode, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(35, 35, 35)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel2)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 137, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(7, 7, 7)
                        .addComponent(jLabel7)
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(o1)
                            .addComponent(jLabel3)
                            .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(25, 25, 25)
                                .addComponent(jLabel4)
                                .addGap(4, 4, 4)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(39, 39, 39)
                                        .addComponent(jLabel5))
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(25, 25, 25)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                            .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(o3)))))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(o2)
                                    .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addGap(3, 3, 3)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(30, 30, 30)
                                .addComponent(jLabel6))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(26, 26, 26)
                                .addComponent(o4))))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGap(36, 36, 36)
                        .addComponent(jScrollPane6, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(37, 37, 37)
                .addComponent(upload)
                .addContainerGap(42, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened
testcode.setText(""+code);
upload.setEnabled(false);




try
{
    Class.forName("java.sql.Driver");
            Connection con=DriverManager.getConnection("jdbc:mysql://localhost/examtantra","root","1192002");
            Statement stmt=con.createStatement();
             String mn="Select count(qno) from questionbank where testid='"+code+"' ";
             ResultSet rs2=stmt.executeQuery(mn);
          if(rs2.next())
          {
               int mnt =rs2.getInt("count(qno)");
               quesno.setText(""+(mnt+1));
          }
    
}catch(Exception e)
{
    JOptionPane.showMessageDialog(null,e);
}

    }//GEN-LAST:event_formWindowOpened

    private void o1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_o1ActionPerformed
upload.setEnabled(true);        // TODO add your handling code here:
    }//GEN-LAST:event_o1ActionPerformed

    private void uploadActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_uploadActionPerformed
try
{
     
    Class.forName("java.sql.Driver");
            Connection con=DriverManager.getConnection("jdbc:mysql://localhost/examtantra","root","1192002");
            Statement stmt=con.createStatement();
             
          String ans=null;
          if(o1.isSelected()==true)
          {
              ans=op1.getText();
          }else if(o2.isSelected()==true)
          {
              ans=op2.getText();
          }else if(o3.isSelected()==true)
          {
              ans=op3.getText();
          }else if(o4.isSelected()==true)
          {
              ans=op4.getText();
          }
              
          String str="Insert into questionbank values('"+code+"',"+quesno.getText()+",'"+ques.getText()+"','"+op1.getText()+"','"+op2.getText()+"','"+op3.getText()+"','"+op4.getText()+"','"+ans+"');";
          if(!ques.getText().equals("")&&!op1.getText().equals("")&&!op2.getText().equals("")&&!op3.getText().equals("")&&!op4.getText().equals("")&&!op1.getText().equals(op2.getText())&&!op1.getText().equals(op3.getText())&&!op1.getText().equals(op4.getText())&&!op2.getText().equals(op3.getText())&&!op2.getText().equals(op4.getText())&&!op3.getText().equals(op4.getText()))
          {
          stmt.executeUpdate(str);
          JOptionPane.showMessageDialog(null, "question uploaded");
        ques.setText("");
        op1.setText("");
        op2.setText("");
        op3.setText("");
        op4.setText("");
         buttonGroup1.clearSelection();      
         upload.setEnabled(false);  
          }else
          {
              if(ques.getText().equals(""))
              {
                  JOptionPane.showMessageDialog(null,"please enter question");
              }else if(op1.getText().equals(""))
              {
                  JOptionPane.showMessageDialog(null,"please enter option 1");
              }else if(op2.getText().equals(""))
              {
                  JOptionPane.showMessageDialog(null,"please enter option 2");
              }else if(op3.getText().equals(""))
              {
                  JOptionPane.showMessageDialog(null,"please enter option 3");
              }else if(op1.getText().equals(""))
              {
                  JOptionPane.showMessageDialog(null,"please enter option 4");
              }else if(op1.getText().equals(op2.getText())||op1.getText().equals(op3.getText())||op1.getText().equals(op4.getText())||op2.getText().equals(op3.getText())||op2.getText().equals(op4.getText())||op3.getText().equals(op4.getText()))
              {
                  JOptionPane.showMessageDialog(null,"option repeated");
              }
          }
}catch(Exception e)
{
     JOptionPane.showMessageDialog(null,e);
}

        
// TODO add your handling code here:
    }//GEN-LAST:event_uploadActionPerformed

    private void formWindowStateChanged(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowStateChanged
        
    }//GEN-LAST:event_formWindowStateChanged

    private void formWindowActivated(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowActivated
   
     
    
        try
{
     Class.forName("java.sql.Driver");
            Connection con=DriverManager.getConnection("jdbc:mysql://localhost/examtantra","root","1192002");
            Statement stmt=con.createStatement();
    String mn="Select count(qno) from questionbank where testid='"+code+"' ";
             ResultSet rs2=stmt.executeQuery(mn);
          if(rs2.next())
          {
               int mnt =rs2.getInt("count(qno)");
               quesno.setText(""+(mnt+1));
          }
          
}
catch(Exception e)
{
     JOptionPane.showMessageDialog(null,e);
}
int check=Integer.parseInt(quesno.getText());
        if(check>qn)
        {
            quesno.setText(""+qn);
            JOptionPane.showMessageDialog(null,"ALL QUESTIONS UPLOADED");
             adminmenu mf11 =new adminmenu();
    mf11.setVisible(true);    
    this.dispose();
            
        }  // TODO add your handling code here:
    }//GEN-LAST:event_formWindowActivated

    private void o2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_o2ActionPerformed
upload.setEnabled(true);          // TODO add your handling code here:
    }//GEN-LAST:event_o2ActionPerformed

    private void o3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_o3ActionPerformed
upload.setEnabled(true);          // TODO add your handling code here:
    }//GEN-LAST:event_o3ActionPerformed

    private void o4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_o4ActionPerformed
upload.setEnabled(true);          // TODO add your handling code here:
    }//GEN-LAST:event_o4ActionPerformed

    private void quesFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_quesFocusGained
       // TODO add your handling code here:
    }//GEN-LAST:event_quesFocusGained

    private void quesFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_quesFocusLost
       // TODO add your handling code here:
    }//GEN-LAST:event_quesFocusLost

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
            java.util.logging.Logger.getLogger(upload.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(upload.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(upload.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(upload.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new upload().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JScrollPane jScrollPane5;
    private javax.swing.JScrollPane jScrollPane6;
    private javax.swing.JTextArea jTextArea5;
    private javax.swing.JRadioButton o1;
    private javax.swing.JRadioButton o2;
    private javax.swing.JRadioButton o3;
    private javax.swing.JRadioButton o4;
    private javax.swing.JTextArea op1;
    private javax.swing.JTextArea op2;
    private javax.swing.JTextArea op3;
    private javax.swing.JTextArea op4;
    private javax.swing.JTextArea ques;
    private javax.swing.JTextField quesno;
    private javax.swing.JTextField testcode;
    private javax.swing.JButton upload;
    // End of variables declaration//GEN-END:variables
}
