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
import javax.swing.JFrame;
/**
 *
 * @author Subhra CHOUDHURY
 */
public class test extends javax.swing.JFrame {
    public String c;
    public String s;
    public String id;

    /**
     * Creates new form test
     */
    public test(String c1,String s1,String id1) {
        initComponents();
        c=c1;
        s=s1;
        id=id1;
        setExtendedState(JFrame.MAXIMIZED_BOTH);
        
    }

    test() {
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
        jLabel1 = new javax.swing.JLabel();
        lsub = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        ltestcode = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        lqno = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        lques = new javax.swing.JTextArea();
        lo1 = new javax.swing.JRadioButton();
        lo2 = new javax.swing.JRadioButton();
        lo3 = new javax.swing.JRadioButton();
        lo4 = new javax.swing.JRadioButton();
        jLabel4 = new javax.swing.JLabel();
        ltime = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        lsid = new javax.swing.JTextField();
        sn = new javax.swing.JButton();
        jLabel6 = new javax.swing.JLabel();
        clear = new javax.swing.JButton();
        proceed = new javax.swing.JButton();
        ltq = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTextArea1 = new javax.swing.JTextArea();

        setDefaultCloseOperation(javax.swing.WindowConstants.DO_NOTHING_ON_CLOSE);
        setUndecorated(true);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowOpened(java.awt.event.WindowEvent evt) {
                formWindowOpened(evt);
            }
        });

        jLabel1.setText("SUBJECT");

        lsub.setEditable(false);

        jLabel2.setText("TEST CODE");

        ltestcode.setEditable(false);

        jLabel3.setText("QUESTION");

        lqno.setEditable(false);

        lques.setEditable(false);
        lques.setColumns(20);
        lques.setRows(5);
        jScrollPane1.setViewportView(lques);

        buttonGroup1.add(lo1);

        buttonGroup1.add(lo2);

        buttonGroup1.add(lo3);

        buttonGroup1.add(lo4);

        jLabel4.setText("TEST DURATION");

        ltime.setEditable(false);

        jLabel5.setText("STUDENT ID");

        lsid.setEditable(false);

        sn.setText("SAVE & NEXT");
        sn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                snActionPerformed(evt);
            }
        });

        jLabel6.setText("HOUR");

        clear.setText("CLEAR SELECTION");
        clear.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                clearActionPerformed(evt);
            }
        });

        proceed.setText("PROCEED");
        proceed.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                proceedActionPerformed(evt);
            }
        });

        ltq.setEditable(false);

        jLabel7.setText("TOTAL QUES");

        jTextArea1.setEditable(false);
        jTextArea1.setColumns(20);
        jTextArea1.setRows(5);
        jTextArea1.setText("MARKING SCHEME:\n\n+4 CORRECT\n-1 INCORRECT\n+0 NOT ATTEMPTED\n");
        jScrollPane2.setViewportView(jTextArea1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(46, 46, 46)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel2)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(ltestcode, javax.swing.GroupLayout.PREFERRED_SIZE, 124, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel1)
                                .addGap(18, 18, 18)
                                .addComponent(lsub, javax.swing.GroupLayout.PREFERRED_SIZE, 122, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(102, 102, 102)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel4)
                            .addComponent(jLabel5))
                        .addGap(34, 34, 34)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lsid, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(ltime, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jLabel6)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 219, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(35, 35, 35)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel3)
                                    .addComponent(jLabel7))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(lqno, javax.swing.GroupLayout.DEFAULT_SIZE, 40, Short.MAX_VALUE)
                                    .addComponent(ltq)))
                            .addComponent(clear))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(lo3)
                                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 400, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(lo4)
                                    .addComponent(sn))
                                .addGap(0, 229, Short.MAX_VALUE))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addComponent(lo2)
                                .addGap(44, 608, Short.MAX_VALUE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(lo1)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))))
                .addContainerGap())
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(proceed)
                .addGap(27, 27, 27))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(41, 41, 41)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel1)
                                    .addComponent(lsub, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel5)
                                    .addComponent(lsid, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(26, 26, 26)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel2)
                                    .addComponent(ltestcode, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel4)
                                    .addComponent(ltime, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel6)))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(29, 29, 29)
                                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 124, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel3)
                                    .addComponent(lqno, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(ltq, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel7)))
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 143, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(54, 54, 54)
                        .addComponent(lo1))
                    .addComponent(clear))
                .addGap(18, 18, 18)
                .addComponent(lo2)
                .addGap(18, 18, 18)
                .addComponent(lo3)
                .addGap(18, 18, 18)
                .addComponent(lo4)
                .addGap(47, 47, 47)
                .addComponent(sn)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(proceed)
                .addContainerGap(18, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened
JOptionPane.showMessageDialog(null,"YOU CANT SKIP A QUESTION PRESS SAVE AND NEXT AFTER COMPLETEING A PARTICULAR QUESTION");
sn.setEnabled(true);
clear.setEnabled(true);
proceed.setEnabled(false);
ltestcode.setText(""+c); 
lsub.setText(""+s);
lsid.setText(""+id);
try{
     Class.forName("java.sql.Driver");
            Connection con=DriverManager.getConnection("jdbc:mysql://localhost/examtantra","root","1192002");
            Statement stmt=con.createStatement();
            String t="select time from testinfo where testcode='"+c+"'";
             ResultSet rs=stmt.executeQuery(t);
            if(rs.next())
            {
                int lt=rs.getInt("time");
                ltime.setText(""+lt);
            }
            String t10="select ques from testinfo where testcode='"+c+"'";
             ResultSet rs10=stmt.executeQuery(t10);
            if(rs10.next())
            {
                int lt10=rs10.getInt("ques");
                ltq.setText(""+lt10);
            }
            
            String str="Select * from questionbank where testid='"+c+"';";
            ResultSet rs1=stmt.executeQuery(str);
              if(rs1.next())
              {
                  int q1=rs1.getInt("qno");
                  String question=rs1.getString("question");
                  String opt1=rs1.getString("option1");
                  String opt2=rs1.getString("option2");
                  String opt3=rs1.getString("option3");
                  String opt4=rs1.getString("option4");
                  lqno.setText(""+q1);
                  lques.append(""+question);
                  lo1.setText(""+opt1);
                  lo2.setText(""+opt2);
                  lo3.setText(""+opt3);
                  lo4.setText(""+opt4);
                  
              }
            
}
catch(Exception e)
{
    JOptionPane.showMessageDialog(null,e);
}// TODO add your handling code here:
    }//GEN-LAST:event_formWindowOpened

    private void snActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_snActionPerformed
int checkq=Integer.parseInt(lqno.getText());

int resp=JOptionPane.showConfirmDialog(this, "DO YOU WANT TO SAVE THE ANSWER? ");

        if(resp==JOptionPane.YES_OPTION) 
        {
            
try
{
    
            
    //save
    Class.forName("java.sql.Driver");
            Connection con=DriverManager.getConnection("jdbc:mysql://localhost/examtantra","root","1192002");
            Statement stmt=con.createStatement();
            String ans=null;
            if(lo1.isSelected()==true)
            {
                ans=lo1.getText();
            }else if(lo2.isSelected()==true)
            {
                ans=lo2.getText();
            }else if(lo3.isSelected()==true)
            {
                ans=lo3.getText();
            }else if(lo4.isSelected()==true)
            {
                ans=lo4.getText();
            }
            String strsave="Insert into studans values('"+id+"','"+c+"',"+lqno.getText()+",'"+ans+"');";
            stmt.executeUpdate(strsave);
            
            buttonGroup1.clearSelection();
  
    
    //next
    int totalq=0;
    
            String str1="Select ques from testinfo where testcode='"+c+"';";
             ResultSet rs2=stmt.executeQuery(str1);
              if(rs2.next())
              {
                  totalq=rs2.getInt("ques");
              }
            
            checkq++;
            if(checkq<=totalq)
            {
                String str="Select * from questionbank where testid='"+c+"' and qno="+checkq+";";
            ResultSet rs1=stmt.executeQuery(str);
              if(rs1.next())
              {
                  int q1=rs1.getInt("qno");
                  String question=rs1.getString("question");
                  String opt1=rs1.getString("option1");
                  String opt2=rs1.getString("option2");
                  String opt3=rs1.getString("option3");
                  String opt4=rs1.getString("option4");
                  lqno.setText(""+q1);
                  lques.setText(""+question);
                  lo1.setText(""+opt1);
                  lo2.setText(""+opt2);
                  lo3.setText(""+opt3);
                  lo4.setText(""+opt4);
                  
              }
            }else
            {
                sn.setEnabled(false);
                JOptionPane.showMessageDialog(null,"ALL QUESTIONS ANSWERED CLICK ON PROCEED");
                lo1.setEnabled(false);
                lo2.setEnabled(false);
                lo3.setEnabled(false);
                lo4.setEnabled(false);
                
                clear.setEnabled(false);
                proceed.setEnabled(true);
                
                //answer key
                
               
                
            }
                
    
}
catch(Exception e)
{
    JOptionPane.showMessageDialog(null,e);
}
        }

// TODO add your handling code here:
    }//GEN-LAST:event_snActionPerformed

    private void clearActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_clearActionPerformed
buttonGroup1.clearSelection();        // TODO add your handling code here:
    }//GEN-LAST:event_clearActionPerformed

    private void proceedActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_proceedActionPerformed
String x=ltestcode.getText();
String y=lsid.getText();
answersheetview a=new answersheetview(x,y);
a.setVisible(true);
this.dispose();
// TODO add your handling code here:
    }//GEN-LAST:event_proceedActionPerformed

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
            java.util.logging.Logger.getLogger(test.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(test.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(test.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(test.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new test().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JButton clear;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTextArea jTextArea1;
    private javax.swing.JRadioButton lo1;
    private javax.swing.JRadioButton lo2;
    private javax.swing.JRadioButton lo3;
    private javax.swing.JRadioButton lo4;
    private javax.swing.JTextField lqno;
    private javax.swing.JTextArea lques;
    private javax.swing.JTextField lsid;
    private javax.swing.JTextField lsub;
    private javax.swing.JTextField ltestcode;
    private javax.swing.JTextField ltime;
    private javax.swing.JTextField ltq;
    private javax.swing.JButton proceed;
    private javax.swing.JButton sn;
    // End of variables declaration//GEN-END:variables
}
