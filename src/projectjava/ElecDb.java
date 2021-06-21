
package projectjava;

import java.sql.*;
import java.util.*;
import java.util.logging.Logger;
import net.proteanit.sql.DbUtils;


 class ElecDb extends javax.swing.JFrame {
private static Connection con = null;
private static ResultSet rs = null;
private static PreparedStatement pst = null;
private Electronic bk = new Electronic();
private String select2;
    
    public ElecDb() {
        setResizable(false);
        setTitle("List Electronic");
        initComponents();
        con = sqlJAVA.ConnectDB();
        showDataFrom();
    }
    
   
    
    public static void showDataFrom(){
        String sql = "SELECT brand,model,voltage,watt,ampare,color,weight,product,price,hieght,width,description,productWarranty,payment\n"+"FROM electronic";
        try{
            pst = con.prepareStatement(sql);
            rs=pst.executeQuery();
            tbproduct.setModel(DbUtils.resultSetToTableModel(rs));
            
        }catch(Exception e){
            System.out.print("Try");
        }
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tbproduct = new javax.swing.JTable();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));

        jPanel1.setBackground(new java.awt.Color(98, 134, 170));
        jPanel1.setForeground(new java.awt.Color(44, 62, 80));
        jPanel1.setToolTipText("");

        tbproduct.setBackground(new java.awt.Color(240, 240, 240));
        tbproduct.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        tbproduct.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        tbproduct.setSelectionForeground(new java.awt.Color(0, 120, 215));
        tbproduct.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tbproductMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tbproduct);

        jButton1.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jButton1.setText("Update!");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jButton2.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jButton2.setText("Delete!");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Tekton Pro", 1, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(85, 227, 229));
        jLabel1.setText("Up to you :)");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 1206, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(59, 59, 59)
                                .addComponent(jLabel1))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(46, 46, 46)
                                .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addContainerGap(50, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(40, 40, 40)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 80, Short.MAX_VALUE)
                .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(72, 72, 72)
                .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(50, 50, 50))
            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void tbproductMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tbproductMouseClicked
        // TODO add your handling code here:
        int row = tbproduct.getSelectedRow();
        String select1 = tbproduct.getValueAt(row, 0).toString();
        select2 = tbproduct.getValueAt(row, 1).toString();
        String select3 = tbproduct.getValueAt(row, 2).toString();
        String select4 = tbproduct.getValueAt(row, 3).toString();
        String select5 = tbproduct.getValueAt(row, 4).toString();
        String select6 = tbproduct.getValueAt(row, 5).toString();
        String select7 = tbproduct.getValueAt(row, 6).toString();
        String select8 = tbproduct.getValueAt(row, 7).toString();
        String select9 = tbproduct.getValueAt(row, 8).toString();
        String select10 = tbproduct.getValueAt(row, 9).toString();
        String select11 = tbproduct.getValueAt(row, 10).toString();
        String select12 = tbproduct.getValueAt(row, 11).toString();
        String select13 = tbproduct.getValueAt(row, 12).toString();
        String select14 = tbproduct.getValueAt(row, 13).toString();

        
        bk.setBrandText(select1); bk.setModelText(select2);bk.setVoltageText(select3);bk.setWattText(select4);bk.setAmpereText(select5);
        bk.setColorText(select6);bk.setWeightText(select7);bk.setProductText(select8);bk.setPriceText(select9);bk.setHeightText(select10);
        bk.setWidthText(select11);bk.setDescriptionText(select12);bk.setProductWarrantyText(select13);bk.setPaymentText(select14);
        
    }//GEN-LAST:event_tbproductMouseClicked

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        
        bk.setVisible(true);
       
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:
        Book.theQuery("delete from electronic where model = "+"'"+select2+"'");
        showDataFrom();
    }//GEN-LAST:event_jButton2ActionPerformed

   
    public static void main(String args[]) {
        
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ElecDb().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private static javax.swing.JTable tbproduct;
    // End of variables declaration//GEN-END:variables
}
