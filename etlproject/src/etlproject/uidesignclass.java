
package etlproject;

import javax.swing.JOptionPane;

public class uidesignclass extends javax.swing.JFrame {
    boolean check1=false,check2=false,check3=false;
    boolean flag1,flag2,flag3;
    
    
    public uidesignclass() {
        initComponents();
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jCheckBox1 = new javax.swing.JCheckBox();
        jCheckBox2 = new javax.swing.JCheckBox();
        jCheckBox3 = new javax.swing.JCheckBox();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jButton4 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel1.setText("select the databases from where you want to extract data");
        jLabel1.setToolTipText("");

        jCheckBox1.setText("oracle ");
        jCheckBox1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCheckBox1ActionPerformed(evt);
            }
        });

        jCheckBox2.setText("msaccess");
        jCheckBox2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCheckBox2ActionPerformed(evt);
            }
        });

        jCheckBox3.setText("mysql");
        jCheckBox3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCheckBox3ActionPerformed(evt);
            }
        });

        jButton1.setText("EXTRACT DATA");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jButton2.setText("TRANSFORM DATA");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jButton3.setText("LOAD DATA ");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel3.setText("Click to truncate finaltable");

        jButton4.setText("TRUNCATE");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(36, 36, 36)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jCheckBox3)
                            .addComponent(jCheckBox2)
                            .addComponent(jCheckBox1)
                            .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jButton1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jButton2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jButton3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(291, 291, 291)
                        .addComponent(jLabel2))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(38, 38, 38)
                        .addComponent(jLabel3)
                        .addGap(18, 18, 18)
                        .addComponent(jButton4)))
                .addContainerGap(34, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jCheckBox1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jCheckBox2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jCheckBox3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jButton1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButton2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButton3)
                .addGap(14, 14, 14)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(jButton4))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel2)
                .addContainerGap(73, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        if(check1==true)
        {
            //oracle connectivity
        }
        if(check2==true)
        {
            //msaccess connectivity
        }
        if(check3==true)
        {
            //mysql connectivity
        }
      
        //------dialogues---
        if(check1==true && check2==false && check3==false)
        {
            flag1=true;
            JOptionPane.showMessageDialog(this, "Data extracted from Oracle");
            //call oracleonly();
        }
         if(check1==false && check2==true && check3==false)
        {
            flag1=true;
            JOptionPane.showMessageDialog(this, "Data extracted from MSAccess");
            //call msaccessonly();
        }
        if(check1==false && check2==false && check3==true)
        {
            flag1=true;
             JOptionPane.showMessageDialog(this, "Data extracted from Mysql");
             //call myysql();
        }
        if(check1==true && check2==true && check3==false)
        {
            flag1=true;
           JOptionPane.showMessageDialog(this, "Data extracted from Oracle and MSAccess");
           //call oracle_msaccess();
        }
        if(check1==true && check2==false && check3==true)
        {
            flag1=true;
             JOptionPane.showMessageDialog(this, "Data extracted from Oracle and Mysql");
             //call Oracle_mysql();
        }
        if(check1==false && check2==true && check3==true)
        {
            flag1=true;
             JOptionPane.showMessageDialog(this, "Data extracted from MSAccess and mysql");
             //call msaccess_mysql();
        }
        if(check1==true && check2==true && check3==true)
        {
            flag1=true;
             JOptionPane.showMessageDialog(this, "Data extracted from oracle, MSAccess and Excel");
             //call oracle_msaccess_mysql();
        }
        if(check1==false && check2==false && check3==false)
        {
             JOptionPane.showMessageDialog(this, "No data souce found to extract data");
             //call nothing;
        }
        
       
       
        
                
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jCheckBox1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCheckBox1ActionPerformed
        if(jCheckBox1.isSelected()==true)
        {
            check1=true;
        }
        
    }//GEN-LAST:event_jCheckBox1ActionPerformed

    private void jCheckBox2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCheckBox2ActionPerformed
        if(jCheckBox2.isSelected()==true)
        {
            check2=true;
        }
    }//GEN-LAST:event_jCheckBox2ActionPerformed

    private void jCheckBox3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCheckBox3ActionPerformed
        if(jCheckBox3.isSelected()==true)
        {
            check3=true;
        }
    }//GEN-LAST:event_jCheckBox3ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        if(flag1==true)
        {
        if(check1==true && check2==false && check3==false)
        {
            flag2=true;
            JOptionPane.showMessageDialog(this, "Data from Oracle transformed in Standard form");
            //call oracleonly();
        }
         if(check1==false && check2==true && check3==false)
        {
            flag2=true;
            JOptionPane.showMessageDialog(this, "Data from MSAccess transformed in Standard form");
            //call msaccessonly();
        }
        if(check1==false && check2==false && check3==true)
        {
            flag2=true;
             JOptionPane.showMessageDialog(this, "Data from Mysql transformed in Standard form");
             //call myysql();
        }
        if(check1==true && check2==true && check3==false)
        {
            flag2=true;
           JOptionPane.showMessageDialog(this, "Data from Oracle and MSAccess transformed in Standard form");
           //call oracle_msaccess();
        }
        if(check1==true && check2==false && check3==true)
        {
            flag2=true;
             JOptionPane.showMessageDialog(this, "Data from Oracle and Mysql transformed in Standard form");
             //call Oracle_mysql();
        }
        if(check1==false && check2==true && check3==true)
        {
            flag2=true;
             JOptionPane.showMessageDialog(this, "Data from MSAccess and mysql transformed in Standard form");
             //call msaccess_mysql();
        }
        if(check1==true && check2==true && check3==true)
        {
            flag2=true;
             JOptionPane.showMessageDialog(this, "Data from oracle, MSAccess and Excel transformed in Standard form");
             //call oracle_msaccess_mysql();
        }
        if(check1==false && check2==false && check3==false)
        {
             JOptionPane.showMessageDialog(this, "No data souce found to transform data");
             //call nothing;
        }
        }
        if(flag1==false)
        {
             JOptionPane.showMessageDialog(this, "PLEASE EXTRACT THE DATA SOURCE FIRST");
        }
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        
        Etlproject myobj=new Etlproject();
        if(flag1==true && flag2==true)
        {
        
        if(check1==true && check2==false && check3==false)
        {
            flag3=true;
            JOptionPane.showMessageDialog(this, "Data from Oracle copied to finaltable in the standard form");
            //call oracleonly();
            myobj.oracle();
        }
         if(check1==false && check2==true && check3==false)
        {
            flag3=true;
            JOptionPane.showMessageDialog(this, "Data from MSAccess copied to finaltable in the standard form  ");
            //call msaccessonly();
            myobj.msaccess();
        }
        if(check1==false && check2==false && check3==true)
        {
            flag3=true;
             JOptionPane.showMessageDialog(this, "Data from Mysql copied to finaltable in the standard form");
             //call myysql();
             myobj.mysql();
        }
        if(check1==true && check2==true && check3==false)
        {
            flag3=true;
           JOptionPane.showMessageDialog(this, "Data from Oracle and MSAccess copied to finaltable in the standard form");
           //call oracle_msaccess();
           myobj.oracle_msaccess();
        }
        if(check1==true && check2==false && check3==true)
        {
            flag3=true;
             JOptionPane.showMessageDialog(this, "Data from Oracle and Mysql copied to finaltable in the standard form");
             //call Oracle_mysql();
             myobj.oracle_mysql();
        }
        if(check1==false && check2==true && check3==true)
        {
            flag3=true;
             JOptionPane.showMessageDialog(this, "Data from MSAccess and mysql copied to finaltable in the standard form");
             //call msaccess_mysql();
             myobj.msaccess_mysql();
        }
        if(check1==true && check2==true && check3==true)
        {
            flag3=true;
             JOptionPane.showMessageDialog(this, "Data from oracle, MSAccess and Excel copied to finaltable in the standard form");
             //call oracle_msaccess_mysql();
             myobj.oracle_msaccess_mysql();
        }
        if(check1==false && check2==false && check3==false)
        {
             JOptionPane.showMessageDialog(this, "NO DATA SOURCE FOUND TO BE LOADED");
             //call nothing;
        }
        }
        if(flag1==true && flag2==false)
        {
            JOptionPane.showMessageDialog(this, "PLEASE TRANSFORM THE DATA BEFORE LOADING");
        }
        if(flag1==false && flag2==false)
        {
            JOptionPane.showMessageDialog(this, "PLEASE EXTRACT THE DATA BEFORE LOADING");
        }
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
       Etlproject myobject=new Etlproject();
       myobject.truncatetable();
       JOptionPane.showMessageDialog(this, "Finaltable truncated");
    }//GEN-LAST:event_jButton4ActionPerformed


    
    
    public static void main(String args[]){
        
        
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new uidesignclass().setVisible(true);
               
                
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JCheckBox jCheckBox1;
    private javax.swing.JCheckBox jCheckBox2;
    private javax.swing.JCheckBox jCheckBox3;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    // End of variables declaration//GEN-END:variables
}
