/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JInternalFrame.java to edit this template
 */
package uasoop;

import java.sql.ResultSet;
import java.sql.Statement;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author INDRA CAHYADI
 */
public class fDOSEN extends javax.swing.JInternalFrame {
    private DefaultTableModel model;
    static ResultSet rs;
    static Statement stmt;
    dbKoneksi cnn = new dbKoneksi();
    
    public fDOSEN() {
        initComponents();
        this.initTable();
        this.getdata();
        
    }
        private void initTable(){
        model = new DefaultTableModel();
        tDS.setModel(model);
        model.addColumn("NO KTP");
        model.addColumn("Nama");
        model.addColumn("Alamat");
        model.addColumn("Email");
        model.addColumn("No TLP");
        model.addColumn("Bidang mengajar");
    }
    private void tampildata(String sql){
        try{
            Statement stmt = cnn.koneksi().createStatement();
            this.rs = stmt.executeQuery(sql);
        }catch(Exception e){
            System.out.println("Terjadi Kendala pada query");
        }
    }
    private void getdata(){
        String sql = "Select ktp, nama, alamat, email, tlp, bidangmengajar FROM dosen;";
        model.getDataVector().removeAllElements();
        model.fireTableDataChanged();
        try{
            this.tampildata(sql);
            while(this.rs.next()){
                Object[] obj = new Object[6];
                obj[0] = this.rs.getString("ktp");
                obj[1] = this.rs.getString("nama");
                obj[2] = this.rs.getString("alamat");
                obj[3] = this.rs.getString("email");
                obj[4] = this.rs.getString("tlp");
                obj[5]= this.rs.getString("bidangmengajar");
                model.addRow(obj);
            }
        }catch(Exception e){
        }
    }
    private boolean UpdateData(String SQL){
        boolean hsl = false;
        try{
            Statement stmt = cnn.koneksi().createStatement();
            stmt.executeUpdate(SQL);
            hsl = true;
        }catch(Exception e){
            JOptionPane.showMessageDialog(null, "Terjadi kendala pada instruksi SQL");
        }
        return hsl;
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tDS = new javax.swing.JTable();
        lbcrud = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        txKTP = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        txNama = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        txAlamat = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        txEmail = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        txNotlp = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        txBidang = new javax.swing.JComboBox<>();
        cmdsimpan = new javax.swing.JButton();
        cmdUpdate = new javax.swing.JButton();
        cmdDelete = new javax.swing.JButton();
        cmdbatal = new javax.swing.JButton();
        cmdclose = new javax.swing.JButton();
        cmdAdd = new javax.swing.JButton();

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel1.setText("LIST DATA DOSEN");

        tDS.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        tDS.setModel(new javax.swing.table.DefaultTableModel(
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
        tDS.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tDSMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tDS);

        lbcrud.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        lbcrud.setText("DETAIL");

        jLabel3.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel3.setText("NIDN");

        txKTP.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        txKTP.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txKTPActionPerformed(evt);
            }
        });

        jLabel4.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel4.setText("Nama");

        txNama.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N

        jLabel5.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel5.setText("Alamat");

        txAlamat.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N

        jLabel6.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel6.setText("e-mail");

        txEmail.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        txEmail.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txEmailActionPerformed(evt);
            }
        });

        jLabel7.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel7.setText("No.Tlp");

        txNotlp.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N

        jLabel8.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel8.setText("Bidang Mengajar");

        txBidang.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        txBidang.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "MTI", "SK", "KAB" }));
        txBidang.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txBidangActionPerformed(evt);
            }
        });

        cmdsimpan.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        cmdsimpan.setText("Save");
        cmdsimpan.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmdsimpanActionPerformed(evt);
            }
        });

        cmdUpdate.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        cmdUpdate.setText("Update");
        cmdUpdate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmdUpdateActionPerformed(evt);
            }
        });

        cmdDelete.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        cmdDelete.setText("Delete");
        cmdDelete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmdDeleteActionPerformed(evt);
            }
        });

        cmdbatal.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        cmdbatal.setText("Cancel");
        cmdbatal.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmdbatalActionPerformed(evt);
            }
        });

        cmdclose.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        cmdclose.setText("Exit ");
        cmdclose.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmdcloseActionPerformed(evt);
            }
        });

        cmdAdd.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        cmdAdd.setText("Tambah Data");
        cmdAdd.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmdAddActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 910, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(jLabel3)
                                    .addComponent(jLabel4)
                                    .addComponent(jLabel5)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(cmdsimpan)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(cmdUpdate)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(cmdDelete))
                                    .addComponent(txKTP, javax.swing.GroupLayout.DEFAULT_SIZE, 351, Short.MAX_VALUE)
                                    .addComponent(txNama)
                                    .addComponent(txAlamat))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 208, Short.MAX_VALUE))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addGap(0, 0, Short.MAX_VALUE)
                                .addComponent(jLabel1)
                                .addGap(36, 36, 36)))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(cmdAdd, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addGroup(layout.createSequentialGroup()
                                    .addComponent(cmdbatal)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(cmdclose))
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel8)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                        .addComponent(txBidang, javax.swing.GroupLayout.Alignment.LEADING, 0, 351, Short.MAX_VALUE)
                                        .addComponent(txNotlp, javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(txEmail))
                                    .addComponent(jLabel7)
                                    .addComponent(jLabel6))))))
                .addContainerGap())
            .addGroup(layout.createSequentialGroup()
                .addGap(375, 375, 375)
                .addComponent(lbcrud)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(cmdAdd))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 108, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lbcrud)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(jLabel6))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txKTP, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txEmail, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(jLabel7))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txNama, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txNotlp, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(jLabel8))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txAlamat, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txBidang, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 154, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cmdsimpan)
                    .addComponent(cmdUpdate)
                    .addComponent(cmdDelete)
                    .addComponent(cmdbatal)
                    .addComponent(cmdclose))
                .addGap(35, 35, 35))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txKTPActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txKTPActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txKTPActionPerformed

    private void txEmailActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txEmailActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txEmailActionPerformed

    private void txBidangActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txBidangActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txBidangActionPerformed

    private void cmdbatalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmdbatalActionPerformed
        this.cmdclose.setEnabled(true);
        this.cmdAdd.setEnabled(true);
        this.cmdsimpan.setEnabled(false);
        this.cmdbatal.setVisible(false);
    }//GEN-LAST:event_cmdbatalActionPerformed

    private void tDSMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tDSMouseClicked
        this.txKTP.setText( model.getValueAt(tDS.getSelectedRow(), 0).toString());
        this.txNama.setText( model.getValueAt(tDS.getSelectedRow(), 1).toString());
        this.txAlamat.setText( model.getValueAt(tDS.getSelectedRow(), 2).toString());
        this.txEmail.setText( model.getValueAt(tDS.getSelectedRow(), 3).toString());
        this.txNotlp.setText( model.getValueAt(tDS.getSelectedRow(), 4).toString());
        this.txBidang.setSelectedItem(model.getValueAt(tDS.getSelectedRow(), 5).toString());
        
        this.lbcrud.setText("Edit Data "+this.txNama.getText());
        this.cmdsimpan.setEnabled(false);
        this.cmdUpdate.setEnabled(true);
        this.cmdDelete.setEnabled(true);
        
    }//GEN-LAST:event_tDSMouseClicked

    private void cmdAddActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmdAddActionPerformed
        this.cmdAdd.setEnabled(false);
        this.cmdUpdate.setEnabled(false);
        this.cmdDelete.setEnabled(false);
        this.cmdclose.setEnabled(false);
        this.cmdsimpan.setEnabled(true);
        this.cmdbatal.setVisible(true);
        
        this.txKTP.setText("");
        this.txNama.setText("");
        this.txAlamat.setText("");
        this.txEmail.setText("");
        this.txNotlp.setText("");
        this.txBidang.setSelectedIndex(0);
        
        this.lbcrud.setText("Tambah data Dosen");
    }//GEN-LAST:event_cmdAddActionPerformed

    private void cmdUpdateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmdUpdateActionPerformed
        String KTP = this.txKTP.getText();
        String NAMA = this.txNama.getText();
        String ALAMAT = this.txAlamat.getText();
        String EMAIL = this.txEmail.getText();
        String NOTLP = this.txNotlp.getText();
        String BIDANG = this.txBidang.getSelectedItem().toString();

        String SQLUpdate = "UPDATE dosen SET nama='"+NAMA+"', alamat='"+ALAMAT+"', email='"+EMAIL+"', tlp='"+NOTLP+"',bidangmengajar='"+BIDANG+"' WHERE ktp='"+KTP+"';";
        if(this.UpdateData(SQLUpdate)){
            this.getdata();
            JOptionPane.showMessageDialog(null, "Data telah di Update");
        }
    }//GEN-LAST:event_cmdUpdateActionPerformed

    private void cmdDeleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmdDeleteActionPerformed
        String KTP = this.txKTP.getText();
        String NAMA = this.txNama.getText();
        
        int opsi = JOptionPane.showConfirmDialog(null,"Yakin akan menghapus data dari "+NAMA+"("+KTP+")?","Konfirmasi", JOptionPane.YES_NO_OPTION );
        if(opsi == JOptionPane.YES_OPTION){
            String SQLDelete = "DELETE FROM dosen WHERE ktp='"+KTP+"';";
            if(this.UpdateData(SQLDelete)){
                this.getdata();
                JOptionPane.showMessageDialog(null, "Data telah dihapus");
            }
        }
    }//GEN-LAST:event_cmdDeleteActionPerformed

    private void cmdsimpanActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmdsimpanActionPerformed
        String KTP = this.txKTP.getText();
        String NAMA = this.txNama.getText();
        String ALAMAT = this.txAlamat.getText();
        String EMAIL = this.txEmail.getText();
        String NOTLP = this.txNotlp.getText();
        String BIDANG = this.txBidang.getSelectedItem().toString();

        String SQLInsert = "INSERT INTO dosen (ktp,nama,alamat,email,tlp,bidangmengajar) VALUES('"+KTP+"','"+NAMA+"','"+ALAMAT+"','"+EMAIL+"','"+NOTLP+"','"+BIDANG+"');";
        if(this.UpdateData(SQLInsert)){
            this.getdata();
            JOptionPane.showMessageDialog(null, "Data telah di Tambahkan");
        }
        this.cmdsimpan.setEnabled(false);
        this.cmdbatal.setVisible(false);
        this.cmdclose.setEnabled(true);
        this.cmdAdd.setEnabled(true);
    }//GEN-LAST:event_cmdsimpanActionPerformed

    private void cmdcloseActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmdcloseActionPerformed
        this.dispose();
    }//GEN-LAST:event_cmdcloseActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton cmdAdd;
    private javax.swing.JButton cmdDelete;
    private javax.swing.JButton cmdUpdate;
    private javax.swing.JButton cmdbatal;
    private javax.swing.JButton cmdclose;
    private javax.swing.JButton cmdsimpan;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lbcrud;
    private javax.swing.JTable tDS;
    private javax.swing.JTextField txAlamat;
    private javax.swing.JComboBox<String> txBidang;
    private javax.swing.JTextField txEmail;
    private javax.swing.JTextField txKTP;
    private javax.swing.JTextField txNama;
    private javax.swing.JTextField txNotlp;
    // End of variables declaration//GEN-END:variables
}
