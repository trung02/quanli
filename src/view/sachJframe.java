/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package view;

import manager.*;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.List;
import java.util.Scanner;
import javaapplication1.JDBCConnection;
//import static javaapplication1.SelectPrepareStatement.selectRecords;
import javax.swing.table.DefaultTableModel;
import service.sachService;

/**
 *
 * @author trunghuynh
 */
public class sachJframe extends javax.swing.JFrame {
    sachService sachservice;
    DefaultTableModel defaultTableModel;
    
    
    public sachJframe() {
        initComponents();
        sachservice = new sachService();
        
        defaultTableModel = new DefaultTableModel();
        sachTable.setModel(defaultTableModel);
        
        defaultTableModel.addColumn("Id Sach");
        defaultTableModel.addColumn("Ten Sach");
        defaultTableModel.addColumn("Tac Gia");
        defaultTableModel.addColumn("So Trang");
        defaultTableModel.addColumn("Ten Nha xuat ban");
        defaultTableModel.addColumn("So Ban phat hanh");
        
        
        List<sach> a = sachservice.getALLSach();
        
        a.forEach(b -> {
            defaultTableModel.addRow(new Object[]{b.getIdS(),b.getTenS(),b.getTacGia(),b.getSoTrang(),b.getTenNxb(),b.getSoBanPhatHanh()});
        });
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
        CancelButton = new javax.swing.JButton();
        sachRefreshButton = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        jScrollPane2 = new javax.swing.JScrollPane();
        sachTable = new javax.swing.JTable();
        jLabel1 = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        baoInsertButton = new javax.swing.JButton();
        jButton5 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jButton6 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setLayout(new java.awt.GridLayout(1, 2));

        CancelButton.setText("Cancel");
        CancelButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CancelButtonActionPerformed(evt);
            }
        });
        jPanel1.add(CancelButton);

        sachRefreshButton.setText("Refresh");
        sachRefreshButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                sachRefreshButtonActionPerformed(evt);
            }
        });
        jPanel1.add(sachRefreshButton);

        sachTable.setModel(new javax.swing.table.DefaultTableModel(
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
        sachTable.setAutoResizeMode(javax.swing.JTable.AUTO_RESIZE_ALL_COLUMNS);
        sachTable.setSelectionMode(javax.swing.ListSelectionModel.SINGLE_SELECTION);
        sachTable.addAncestorListener(new javax.swing.event.AncestorListener() {
            public void ancestorAdded(javax.swing.event.AncestorEvent evt) {
                sachTableAncestorAdded(evt);
            }
            public void ancestorMoved(javax.swing.event.AncestorEvent evt) {
            }
            public void ancestorRemoved(javax.swing.event.AncestorEvent evt) {
            }
        });
        jScrollPane2.setViewportView(sachTable);

        jLabel1.setText("BẠN ĐANG XEM SÁCH");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 534, Short.MAX_VALUE)
                .addContainerGap())
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(195, 195, 195)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 151, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 271, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, 39, Short.MAX_VALUE)
                .addContainerGap())
        );

        jPanel3.setLayout(new java.awt.GridLayout(1, 4));

        baoInsertButton.setText("Insert");
        baoInsertButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                baoInsertButtonActionPerformed(evt);
            }
        });
        jPanel3.add(baoInsertButton);

        jButton5.setText("Update");
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });
        jPanel3.add(jButton5);

        jButton3.setText("Delete");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });
        jPanel3.add(jButton3);

        jButton6.setText("Find");
        jPanel3.add(jButton6);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addComponent(jPanel3, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 546, Short.MAX_VALUE)
                    .addComponent(jPanel2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void CancelButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CancelButtonActionPerformed
        new formChuongTrinh().setVisible(true);
        this.dispose();       // TODO add your handling code here:
    }//GEN-LAST:event_CancelButtonActionPerformed

    private void baoInsertButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_baoInsertButtonActionPerformed
        new sachInsert().setVisible(true);
        this.dispose();
       // TODO add your handling code here:
    }//GEN-LAST:event_baoInsertButtonActionPerformed

    private void sachRefreshButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_sachRefreshButtonActionPerformed
        defaultTableModel.setRowCount((0));
            
        List<sach> a = sachservice.getALLSach();
        
        a.forEach(b -> {
            defaultTableModel.addRow(new Object[]{b.getIdS(),b.getTenS(),b.getTacGia(),b.getSoTrang(),b.getTenNxb(),b.getSoBanPhatHanh()});
        });
    // TODO add your handling code here:
    }//GEN-LAST:event_sachRefreshButtonActionPerformed

    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed
            new sachUpdate().setVisible(true);
            this.dispose();   // TODO add your handling code here:
    }//GEN-LAST:event_jButton5ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
            new sachDelete().setVisible(true);
            this.dispose();        // TODO add your handling code here:
    }//GEN-LAST:event_jButton3ActionPerformed

    private void sachTableAncestorAdded(javax.swing.event.AncestorEvent evt) {//GEN-FIRST:event_sachTableAncestorAdded
        // TODO add your handling code here:
    }//GEN-LAST:event_sachTableAncestorAdded

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
            java.util.logging.Logger.getLogger(sachJframe.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(sachJframe.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(sachJframe.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(sachJframe.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new sachJframe().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton CancelButton;
    private javax.swing.JButton baoInsertButton;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton5;
    private javax.swing.JButton jButton6;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JButton sachRefreshButton;
    private javax.swing.JTable sachTable;
    // End of variables declaration//GEN-END:variables
}
