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
public class fMK extends javax.swing.JInternalFrame {
    private DefaultTableModel model;
    static ResultSet rs;
    static Statement stmt;
    dbKoneksi cnn = new dbKoneksi();
    
    public fMK() {
        initComponents();
        this.initTable();
        this.getdata();
    }
    
    private void initTable(){
        model = new DefaultTableModel();
        TMK.setModel(model);
        model.addColumn("Kode Mata Kuliah");
        model.addColumn("Nama Mata Kuliah");
        model.addColumn("Semester");
        model.addColumn("SKS");
        model.addColumn("Tipe");
        
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
        String sql = "Select kode_mk, nama_mk, semester_mk, sks, tipe FROM mk;";
        model.getDataVector().removeAllElements();
        model.fireTableDataChanged();
        try{
            this.tampildata(sql);
            while(this.rs.next()){
                Object[] obj = new Object[5];
                obj[0] = this.rs.getString("kode_mk");
                obj[1] = this.rs.getString("nama_mk");
                obj[2] = this.rs.getString("semester_mk");
                obj[3] = this.rs.getString("sks");
                obj[4] = this.rs.getString("tipe");
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

        jButton1 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        TMK = new javax.swing.JTable();
        lbcrud = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        kode = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        nama = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        semester = new javax.swing.JComboBox<>();
        sks = new javax.swing.JComboBox<>();
        tipe = new javax.swing.JComboBox<>();
        cmdsimpan = new javax.swing.JButton();
        cmdUpdate = new javax.swing.JButton();
        cmdDelete = new javax.swing.JButton();
        cmdclose = new javax.swing.JButton();
        cmdbatal = new javax.swing.JButton();
        cmdAdd = new javax.swing.JButton();

        jButton1.setText("Tambah Mata Kuliah");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel1.setText("LIST DATA MATA KULIAH");

        TMK.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        TMK.setModel(new javax.swing.table.DefaultTableModel(
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
        TMK.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                TMKMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(TMK);

        lbcrud.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        lbcrud.setText("MASUKAN DATA MATAKULIAH");

        jLabel3.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel3.setText("Kode Mata Kuliah");

        kode.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        kode.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                kodeActionPerformed(evt);
            }
        });

        nama.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        nama.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                namaActionPerformed(evt);
            }
        });

        jLabel5.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel5.setText("Semester");

        jLabel6.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel6.setText("SKS");

        jLabel7.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel7.setText("Tipe");

        jLabel8.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel8.setText("Nama Mata Kuilah");

        semester.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        semester.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "1", "2", "3", "4", "5", "6", "7", "8" }));
        semester.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                semesterActionPerformed(evt);
            }
        });

        sks.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        sks.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "2", "3", "4" }));

        tipe.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        tipe.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Wajib", "Pilihan" }));
        tipe.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tipeActionPerformed(evt);
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

        cmdclose.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        cmdclose.setText("Exit");
        cmdclose.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmdcloseActionPerformed(evt);
            }
        });

        cmdbatal.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        cmdbatal.setText("Cancel");
        cmdbatal.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmdbatalActionPerformed(evt);
            }
        });

        cmdAdd.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        cmdAdd.setText("Tambah Mata Kuliah");
        cmdAdd.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmdAddActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(104, 104, 104)
                        .addComponent(jLabel4)
                        .addGap(0, 766, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(jLabel1)
                        .addGap(155, 155, 155)
                        .addComponent(cmdAdd))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel3)
                                    .addComponent(kode, javax.swing.GroupLayout.PREFERRED_SIZE, 360, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(nama, javax.swing.GroupLayout.PREFERRED_SIZE, 360, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel8))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 144, Short.MAX_VALUE)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(jLabel6)
                                    .addComponent(jLabel7)
                                    .addComponent(sks, 0, 360, Short.MAX_VALUE)
                                    .addComponent(tipe, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(cmdsimpan)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(cmdUpdate)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(cmdDelete)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(cmdbatal)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(cmdclose))
                            .addComponent(jScrollPane1)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel5)
                                    .addComponent(semester, javax.swing.GroupLayout.PREFERRED_SIZE, 360, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(0, 0, Short.MAX_VALUE)))))
                .addContainerGap())
            .addGroup(layout.createSequentialGroup()
                .addGap(247, 247, 247)
                .addComponent(lbcrud)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(cmdAdd))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 171, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(lbcrud)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(jLabel6))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(kode, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(sks, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7)
                    .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(nama, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(tipe, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel5)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(semester, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel4)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 48, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cmdsimpan)
                    .addComponent(cmdUpdate)
                    .addComponent(cmdDelete)
                    .addComponent(cmdclose)
                    .addComponent(cmdbatal))
                .addGap(30, 30, 30))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void kodeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_kodeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_kodeActionPerformed

    private void namaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_namaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_namaActionPerformed

    private void tipeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tipeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tipeActionPerformed

    private void cmdUpdateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmdUpdateActionPerformed
        String KODE = this.kode.getText();
        String NAMA = this.nama.getText();
        String SEMESTER = this.semester.getSelectedItem().toString();
        String SKS = this.sks.getSelectedItem().toString();
        String TIPE = this.tipe.getSelectedItem().toString();

        String SQLUpdate = "UPDATE mk SET nama_mk='"+NAMA+"', semester_mk='"+SEMESTER+"', sks='"+SKS+"', tipe='"+TIPE+"' WHERE kode_mk='"+KODE+"';";
        if(this.UpdateData(SQLUpdate)){
            this.getdata();
            JOptionPane.showMessageDialog(null, "Data Berhasil Di Update");
        }
    }//GEN-LAST:event_cmdUpdateActionPerformed

    private void TMKMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_TMKMouseClicked
        this.kode.setText( model.getValueAt(TMK.getSelectedRow(), 0).toString());
        this.nama.setText( model.getValueAt(TMK.getSelectedRow(), 1).toString());
        this.semester.setSelectedItem(model.getValueAt(TMK.getSelectedRow(), 2).toString());
        this.sks.setSelectedItem(model.getValueAt(TMK.getSelectedRow(), 3).toString());
        this.tipe.setSelectedItem(model.getValueAt(TMK.getSelectedRow(), 4).toString());
        
        this.lbcrud.setText("Edit Data "+this.nama.getText());
        this.cmdsimpan.setEnabled(false);
        this.cmdUpdate.setEnabled(true);
        this.cmdDelete.setEnabled(true);
    }//GEN-LAST:event_TMKMouseClicked

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton1ActionPerformed

    private void cmdAddActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmdAddActionPerformed
        this.cmdAdd.setEnabled(false);
        this.cmdUpdate.setEnabled(false);
        this.cmdDelete.setEnabled(false);
        this.cmdclose.setEnabled(false);
        this.cmdsimpan.setEnabled(true);
        this.cmdbatal.setVisible(true);
        
        this.kode.setText("");
        this.nama.setText("");
        this.semester.setSelectedIndex(0);
        this.sks.setSelectedIndex(0);
        this.tipe.setSelectedIndex(0);
        
        this.lbcrud.setText("Tambah Mata kuliah");                                      
    }//GEN-LAST:event_cmdAddActionPerformed

    private void cmdbatalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmdbatalActionPerformed
        this.cmdclose.setEnabled(true);
        this.cmdAdd.setEnabled(true);
        this.cmdsimpan.setEnabled(false);
        this.cmdbatal.setVisible(false);
    }//GEN-LAST:event_cmdbatalActionPerformed

    private void cmdDeleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmdDeleteActionPerformed
        String KODE = this.kode.getText();
        String NAMA = this.nama.getText();
        
        int opsi = JOptionPane.showConfirmDialog(null,"Yakin akan menghapus data dari "+NAMA+"("+KODE+")?","Konfirmasi", JOptionPane.YES_NO_OPTION );
        if(opsi == JOptionPane.YES_OPTION){
            String SQLDelete = "DELETE FROM mk WHERE kode_mk='"+KODE+"';";
            if(this.UpdateData(SQLDelete)){
                this.getdata();
                JOptionPane.showMessageDialog(null, "Data Berhasil dihapus");
            }
        }
    }//GEN-LAST:event_cmdDeleteActionPerformed

    private void cmdsimpanActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmdsimpanActionPerformed
        String KODE = this.kode.getText();
        String NAMA = this.nama.getText();
        String SEMESTER = this.semester.getSelectedItem().toString();
        String SKS = this.sks.getSelectedItem().toString();
        String TIPE = this.tipe.getSelectedItem().toString();

        String SQLInsert = "INSERT INTO mk (kode_mk,nama_mk,semester_mk,sks,tipe) VALUES('"+KODE+"','"+NAMA+"','"+SEMESTER+"','"+SKS+"','"+TIPE+"');";
        if(this.UpdateData(SQLInsert)){
            this.getdata();
            JOptionPane.showMessageDialog(null, "Data Berhasil Di Tambahkan");
        }
        this.cmdsimpan.setEnabled(false);
        this.cmdbatal.setVisible(false);
        this.cmdclose.setEnabled(true);
        this.cmdAdd.setEnabled(true);
    }//GEN-LAST:event_cmdsimpanActionPerformed

    private void cmdcloseActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmdcloseActionPerformed
        this.dispose();
    }//GEN-LAST:event_cmdcloseActionPerformed

    private void semesterActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_semesterActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_semesterActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTable TMK;
    private javax.swing.JButton cmdAdd;
    private javax.swing.JButton cmdDelete;
    private javax.swing.JButton cmdUpdate;
    private javax.swing.JButton cmdbatal;
    private javax.swing.JButton cmdclose;
    private javax.swing.JButton cmdsimpan;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField kode;
    private javax.swing.JLabel lbcrud;
    private javax.swing.JTextField nama;
    private javax.swing.JComboBox<String> semester;
    private javax.swing.JComboBox<String> sks;
    private javax.swing.JComboBox<String> tipe;
    // End of variables declaration//GEN-END:variables
}
