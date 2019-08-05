/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package GUI;

import Source.Biaya;
import Source.DataBase;
import Source.Proyek;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Faris
 */
public class DialogEditBiaya extends javax.swing.JDialog {

    /**
     * Creates new form EditPetugas
     */
    DataBase db;
    private Biaya b = new Biaya();
    Biaya[] by;
    ResultSet rs;
    String query ="select * from biaya";
    
    public DialogEditBiaya(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
        initComponents();
        this.setLocationRelativeTo(parent);      
        ButtonSimpan.addActionListener(new Simpan());
        ButtonReset.addActionListener(new Reset());
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
        FieldCari = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        Tabel = new javax.swing.JTable();
        jLabel1 = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        ButtonSimpan = new javax.swing.JButton();
        ButtonReset = new javax.swing.JButton();
        FieldPemasukan = new javax.swing.JTextField();
        jPanel5 = new javax.swing.JPanel();
        jLabel7 = new javax.swing.JLabel();
        jTextArea1 = new javax.swing.JTextArea();
        FieldNama = new javax.swing.JTextField();
        FieldPengeluaran = new javax.swing.JTextField();
        jScrollPane2 = new javax.swing.JScrollPane();
        AreaDetailBiaya = new javax.swing.JTextArea();
        jLabel4 = new javax.swing.JLabel();
        jScrollPane3 = new javax.swing.JScrollPane();
        AreaDetailPengeluaran = new javax.swing.JTextArea();
        jLabel8 = new javax.swing.JLabel();
        FieldKode = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        FieldUangSponsor = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        FieldEstimasiBiaya = new javax.swing.JTextField();
        jLabel12 = new javax.swing.JLabel();
        jScrollPane4 = new javax.swing.JScrollPane();
        AreaDetailPemasukan = new javax.swing.JTextArea();
        jLabel15 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setPreferredSize(new java.awt.Dimension(600, 500));

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));
        jPanel2.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Edit Data Proyek", javax.swing.border.TitledBorder.LEFT, javax.swing.border.TitledBorder.DEFAULT_POSITION));

        FieldCari.setPreferredSize(new java.awt.Dimension(250, 25));
        FieldCari.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                FieldCariActionPerformed(evt);
            }
        });
        FieldCari.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                FieldCariKeyReleased(evt);
            }
        });

        Tabel.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null}
            },
            new String [] {
                "Kode Proyek", "Nama", "Uang Sponsor", "Estimasi Biaya", "Pemasukan ", "Detail Pemasukan", "Pengeluaran", "Detail Pengeluaran"
            }
        ));
        Tabel.setRequestFocusEnabled(false);
        Tabel.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                TabelMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(Tabel);

        jLabel1.setFont(new java.awt.Font("Book Antiqua", 1, 18)); // NOI18N
        jLabel1.setText("Pencarian");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(FieldCari, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jScrollPane1)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(jLabel1)
                                .addGap(0, 0, Short.MAX_VALUE)))
                        .addContainerGap())))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(FieldCari, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 97, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel3.setBackground(new java.awt.Color(255, 255, 255));
        jPanel3.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Edit Data Disini", javax.swing.border.TitledBorder.LEFT, javax.swing.border.TitledBorder.DEFAULT_POSITION));

        ButtonSimpan.setText("Simpan");
        ButtonSimpan.setPreferredSize(new java.awt.Dimension(67, 25));

        ButtonReset.setText("Reset");
        ButtonReset.setPreferredSize(new java.awt.Dimension(61, 25));

        FieldPemasukan.setFont(new java.awt.Font("Calibri", 0, 14)); // NOI18N
        FieldPemasukan.setPreferredSize(new java.awt.Dimension(250, 25));

        jPanel5.setBorder(javax.swing.BorderFactory.createTitledBorder(""));

        jLabel7.setFont(new java.awt.Font("Book Antiqua", 1, 14)); // NOI18N
        jLabel7.setText("INSTRUKSI");

        jTextArea1.setEditable(false);
        jTextArea1.setBackground(new java.awt.Color(240, 240, 240));
        jTextArea1.setColumns(20);
        jTextArea1.setRows(5);
        jTextArea1.setText("1. Semua field\n   harus diisi\n   atau tidak\n   boleh kosong\n   karena\n   informasi\n   penting\n2. Detail Biaya\n   harus lengkap\n   informasi apa\n   saja yang ada\n3. Estimasi Biaya,\n   Pemasukan dan\n   Pengeluaran \n   merupakan total\n   yang kemudian \n   akan dijabarkan \n   pada detailnya\n");
        jTextArea1.setPreferredSize(new java.awt.Dimension(10, 94));

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel5Layout.createSequentialGroup()
                .addContainerGap(48, Short.MAX_VALUE)
                .addComponent(jLabel7)
                .addGap(21, 21, 21))
            .addComponent(jTextArea1, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel7)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jTextArea1, javax.swing.GroupLayout.PREFERRED_SIZE, 326, Short.MAX_VALUE)
                .addContainerGap())
        );

        FieldNama.setFont(new java.awt.Font("Calibri", 0, 14)); // NOI18N
        FieldNama.setPreferredSize(new java.awt.Dimension(250, 25));

        FieldPengeluaran.setFont(new java.awt.Font("Calibri", 0, 14)); // NOI18N
        FieldPengeluaran.setPreferredSize(new java.awt.Dimension(250, 25));

        AreaDetailBiaya.setColumns(20);
        AreaDetailBiaya.setFont(new java.awt.Font("Calibri", 0, 14)); // NOI18N
        AreaDetailBiaya.setRows(5);
        jScrollPane2.setViewportView(AreaDetailBiaya);

        jLabel4.setFont(new java.awt.Font("Calibri", 0, 14)); // NOI18N
        jLabel4.setText("Detail Pemasukan");

        AreaDetailPengeluaran.setColumns(20);
        AreaDetailPengeluaran.setFont(new java.awt.Font("Calibri", 0, 14)); // NOI18N
        AreaDetailPengeluaran.setRows(5);
        jScrollPane3.setViewportView(AreaDetailPengeluaran);

        jLabel8.setFont(new java.awt.Font("Times New Roman", 1, 10)); // NOI18N
        jLabel8.setText("Perusahaan Stark Industri");

        FieldKode.setFont(new java.awt.Font("Calibri", 0, 14)); // NOI18N
        FieldKode.setPreferredSize(new java.awt.Dimension(250, 25));

        jLabel5.setFont(new java.awt.Font("Calibri", 0, 14)); // NOI18N
        jLabel5.setText("Uang Sponsor ");

        jLabel2.setFont(new java.awt.Font("Calibri", 0, 14)); // NOI18N
        jLabel2.setText("Nama ");

        FieldUangSponsor.setFont(new java.awt.Font("Calibri", 0, 14)); // NOI18N
        FieldUangSponsor.setPreferredSize(new java.awt.Dimension(250, 25));

        jLabel3.setFont(new java.awt.Font("Calibri", 0, 14)); // NOI18N
        jLabel3.setText("Detail Biaya");

        jLabel13.setFont(new java.awt.Font("Calibri", 0, 14)); // NOI18N
        jLabel13.setText("Pengeluaran");

        jLabel9.setFont(new java.awt.Font("Calibri", 0, 14)); // NOI18N
        jLabel9.setText("Estimasi Biaya");

        jLabel14.setFont(new java.awt.Font("Calibri", 0, 14)); // NOI18N
        jLabel14.setText("Detail Pengeluaran");

        FieldEstimasiBiaya.setFont(new java.awt.Font("Calibri", 0, 14)); // NOI18N
        FieldEstimasiBiaya.setPreferredSize(new java.awt.Dimension(250, 25));

        jLabel12.setFont(new java.awt.Font("Calibri", 0, 14)); // NOI18N
        jLabel12.setText("Kode Proyek");

        AreaDetailPemasukan.setColumns(20);
        AreaDetailPemasukan.setFont(new java.awt.Font("Calibri", 0, 14)); // NOI18N
        AreaDetailPemasukan.setRows(5);
        jScrollPane4.setViewportView(AreaDetailPemasukan);

        jLabel15.setFont(new java.awt.Font("Calibri", 0, 14)); // NOI18N
        jLabel15.setText("Pemasukan");

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(38, 38, 38)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addComponent(jLabel4)
                                .addComponent(jLabel3, javax.swing.GroupLayout.Alignment.LEADING))
                            .addComponent(jLabel15)
                            .addComponent(jLabel2)
                            .addComponent(jLabel12)
                            .addComponent(jLabel13)
                            .addComponent(jLabel14))
                        .addGap(31, 31, 31)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(FieldPemasukan, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 1, Short.MAX_VALUE)
                            .addComponent(FieldKode, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 1, Short.MAX_VALUE)
                            .addComponent(FieldNama, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                            .addComponent(jScrollPane2, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jScrollPane4)
                            .addComponent(FieldPengeluaran, javax.swing.GroupLayout.PREFERRED_SIZE, 1, Short.MAX_VALUE)
                            .addComponent(jScrollPane3)))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel5)
                            .addComponent(jLabel9))
                        .addGap(59, 59, 59)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(FieldEstimasiBiaya, javax.swing.GroupLayout.PREFERRED_SIZE, 237, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(FieldUangSponsor, javax.swing.GroupLayout.PREFERRED_SIZE, 237, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addGap(27, 27, 27)
                .addComponent(jLabel8)
                .addGap(61, 61, 61))
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(271, 271, 271)
                .addComponent(ButtonSimpan, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(ButtonReset, javax.swing.GroupLayout.PREFERRED_SIZE, 67, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel3Layout.createSequentialGroup()
                    .addContainerGap(425, Short.MAX_VALUE)
                    .addComponent(jPanel5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(39, 39, 39)))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(FieldKode, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel12))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(FieldNama, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2))
                .addGap(7, 7, 7)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(FieldUangSponsor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel9)
                    .addComponent(FieldEstimasiBiaya, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 84, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(32, 32, 32)
                        .addComponent(jLabel3)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(FieldPemasukan, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel15))
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, 84, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(41, 41, 41)
                        .addComponent(jLabel4)))
                .addGap(18, 18, 18)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(FieldPengeluaran, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel13))
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 84, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addGap(37, 37, 37)
                                .addComponent(jLabel14)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel8)
                        .addGap(68, 68, 68)))
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(ButtonSimpan, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(ButtonReset, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel3Layout.createSequentialGroup()
                    .addContainerGap()
                    .addComponent(jPanel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGap(139, 139, 139)))
        );

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel3, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, 538, Short.MAX_VALUE)
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 650, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 768, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void FieldCariKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_FieldCariKeyReleased
        // TODO add your handling code here:


        fetchData();
        String[] kolom={"Kode Proyek","Nama","Uang Sponsor","Estimasi Biaya","Detail Biaya","Pemasukan","Detail Pemasukan","Pengeluaran","Detail Pengeluaran"};
        String[][] data = new String[by.length][100];
        for (int i = 0; i < by.length; i++) {
            data[i][0]=by[i].getKodeProyek();
            data[i][1]=by[i].getNama();
            data[i][2]=by[i].getUangSponsor();
            data[i][3]=by[i].getEstimasiBiaya();
            data[i][4]=by[i].getDetailBiaya();
            data[i][5]=by[i].getPemasukan();
            data[i][6]=by[i].getDetailPemasukan();
            data[i][7]=by[i].getPengeluaran();
            data[i][8]=by[i].getDetailPengeluaran();
            
        }
        DefaultTableModel dtm=new DefaultTableModel(data, kolom);
        Tabel.setModel(dtm);
    }//GEN-LAST:event_FieldCariKeyReleased

    private void TabelMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_TabelMouseClicked
        // TODO add your handling code here:
        try{
            if(Tabel.getSelectedRow()!= -1){
                FieldKode.setText(Tabel.getValueAt(Tabel.getSelectedRow(), 0).toString());
                FieldNama.setText(Tabel.getValueAt(Tabel.getSelectedRow(), 1).toString());
                FieldUangSponsor.setText(Tabel.getValueAt(Tabel.getSelectedRow(), 2).toString());
                FieldEstimasiBiaya.setText(Tabel.getValueAt(Tabel.getSelectedRow(), 3).toString());
                AreaDetailBiaya.setText(Tabel.getValueAt(Tabel.getSelectedRow(), 4).toString());
                FieldPemasukan.setText(Tabel.getValueAt(Tabel.getSelectedRow(), 5).toString());
                AreaDetailPemasukan.setText(Tabel.getValueAt(Tabel.getSelectedRow(), 6).toString());
                FieldPengeluaran.setText(Tabel.getValueAt(Tabel.getSelectedRow(), 7).toString());
                AreaDetailPengeluaran.setText(Tabel.getValueAt(Tabel.getSelectedRow(), 8).toString());
                
            }
        }catch(Exception e){
            javax.swing.JOptionPane.showMessageDialog(null,"Pilih Pesan terlebih dahulu");
        }
    }//GEN-LAST:event_TabelMouseClicked

    private void FieldCariActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_FieldCariActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_FieldCariActionPerformed

    /**
     * @param args the command line arguments
     */
//    public static void main(String args[]) {
//        /* Set the Nimbus look and feel */
//        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
//        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
//         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
//         */
//        try {
//            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
//                if ("Nimbus".equals(info.getName())) {
//                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
//                    break;
//                }
//            }
//        } catch (ClassNotFoundException ex) {
//            java.util.logging.Logger.getLogger(DialogEditProyek.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        } catch (InstantiationException ex) {
//            java.util.logging.Logger.getLogger(DialogEditProyek.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        } catch (IllegalAccessException ex) {
//            java.util.logging.Logger.getLogger(DialogEditProyek.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
//            java.util.logging.Logger.getLogger(DialogEditProyek.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        }
//        //</editor-fold>
//
//        /* Create and display the dialog */
//        java.awt.EventQueue.invokeLater(new Runnable() {
//            public void run() {
//                DialogEditProyek dialog = new DialogEditProyek(new javax.swing.JFrame(), true);
//                dialog.addWindowListener(new java.awt.event.WindowAdapter() {
//                    @Override
//                    public void windowClosing(java.awt.event.WindowEvent e) {
//                        System.exit(0);
//                    }
//                });
//                dialog.setVisible(true);
//            }
//        });
//    }

    final public void fetchData(){
        try {
            db = new DataBase();
            ResultSet result;
            String query ="select * from biaya";
            result = db.getData(query );
            int i=0;
            try {
              while(result.next()) i++;
            } catch (SQLException ex) {
                Logger.getLogger(DialogEditBiaya.class.getName()).log(Level.SEVERE, null, ex);
            }
           by = new Biaya[i];
           result = db.getData(query );             
           i=0;
           while(result.next()){                   
                by[i]=new Biaya();
                by[i].setKodeProyek(result.getString(1));
                by[i].setNama(result.getString(2));
                by[i].setUangSponsor(result.getString(3));
                by[i].setEstimasiBiaya(result.getString(4));
                by[i].setDetailBiaya(result.getString(5));
                by[i].setPemasukan(result.getString(6));
                by[i].setDetailPemasukan(result.getString(7));
                by[i].setPengeluaran(result.getString(8));
                by[i].setDetailPengeluaran(result.getString(9));
                i++;
            }                
        } catch (SQLException ex) {
            Logger.getLogger(DialogEditBiaya.class.getName()).log(Level.SEVERE, null, ex);
        }
    }    
    
    private class Simpan implements ActionListener{
        @Override
        public void actionPerformed(ActionEvent ae){
            db = new DataBase();                     
            if(FieldNama.getText().equals("") || FieldKode.getText().equals("") || FieldUangSponsor.getText().equals("") || FieldEstimasiBiaya.getText().equals("")
                    || AreaDetailBiaya.getText().equals("")|| FieldPemasukan.getText().equals("")
                    || AreaDetailPemasukan.getText().equals("")|| FieldPengeluaran.getText().equals("")
                    || AreaDetailPengeluaran.getText().equals("")){
                javax.swing.JOptionPane.showMessageDialog(null,"Tolong lengkapi pengisian data");
            } else{
                b.setKodeProyek(FieldKode.getText());
                b.setNama(FieldNama.getText());
                b.setUangSponsor(FieldUangSponsor.getText());
                b.setEstimasiBiaya(FieldEstimasiBiaya.getText());
                b.setDetailBiaya(AreaDetailBiaya.getText());
                b.setPemasukan(FieldPemasukan.getText());
                b.setDetailPemasukan(AreaDetailPemasukan.getText());
                b.setPengeluaran(FieldPengeluaran.getText());
                b.setDetailPengeluaran(AreaDetailPengeluaran.getText());
                
                try {
                    b.updateBiaya();
                } catch (SQLException ex) {
                    Logger.getLogger(DialogEditBiaya.class.getName()).log(Level.SEVERE, null, ex);
                }
                javax.swing.JOptionPane.showMessageDialog(null,"Berhasil Mengupdate Data Biaya Proyek");
                FieldKode.setText("");
                FieldNama.setText("");
                FieldUangSponsor.setText("");
                FieldEstimasiBiaya.setText("");
                AreaDetailBiaya.setText("");
                FieldPemasukan.setText("");
                AreaDetailPemasukan.setText("");
                FieldPengeluaran.setText("");
                AreaDetailPengeluaran.setText("");
                
            }
        }
    }
    private class Reset implements ActionListener{
        @Override
        public void actionPerformed(ActionEvent ae){
                FieldKode.setText("");
                FieldNama.setText("");
                FieldUangSponsor.setText("");
                FieldEstimasiBiaya.setText("");
                AreaDetailBiaya.setText("");
                FieldPemasukan.setText("");
                AreaDetailPemasukan.setText("");
                FieldPengeluaran.setText("");
                AreaDetailPengeluaran.setText("");
                
        }
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextArea AreaDetailBiaya;
    private javax.swing.JTextArea AreaDetailPemasukan;
    private javax.swing.JTextArea AreaDetailPengeluaran;
    private javax.swing.JButton ButtonReset;
    private javax.swing.JButton ButtonSimpan;
    private javax.swing.JTextField FieldCari;
    private javax.swing.JTextField FieldEstimasiBiaya;
    private javax.swing.JTextField FieldKode;
    private javax.swing.JTextField FieldNama;
    private javax.swing.JTextField FieldPemasukan;
    private javax.swing.JTextField FieldPengeluaran;
    private javax.swing.JTextField FieldUangSponsor;
    private javax.swing.JTable Tabel;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JTextArea jTextArea1;
    // End of variables declaration//GEN-END:variables
}
