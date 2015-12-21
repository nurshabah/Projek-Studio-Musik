package NADA_GUI;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import net.sf.jasperreports.engine.JasperExportManager;
import net.sf.jasperreports.engine.JasperFillManager;
import java.util.HashMap;
import net.sf.jasperreports.engine.JasperPrint;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Nurshabah
 */
public class MenuPemilik extends javax.swing.JFrame {
    public Connection conn;
    public Statement cn;
    public Login form1;
    
    public void koneksi(){
        try{
            Class.forName("com.mysql.jdbc.Driver");
            conn=DriverManager.getConnection("jdbc:mysql://localhost:3306/studio","root","");
            cn=conn.createStatement();
        } catch(ClassNotFoundException | SQLException e) {
            JOptionPane.showMessageDialog(null, "koneksi gagal....");
            System.out.println(e.getMessage());
        }
    }
    
    public void tampildatasewa(){
        DefaultTableModel tblsewa = new DefaultTableModel();
        tblsewa.addColumn("No Sewa");
        tblsewa.addColumn("ID Member");
        tblsewa.addColumn("Nama Penyewa");
        tblsewa.addColumn("No Telepon");
        tblsewa.addColumn("Alamat");
        tblsewa.addColumn("Ruang Studio");
        tblsewa.addColumn("Paket Sewa");
        tblsewa.addColumn("Harga Sewa");
        tblsewa.addColumn("Tanggal");
        
        try{
            koneksi();
            String sql="Select*from sewa order by no_sewa asc";
            ResultSet rs=cn.executeQuery(sql);
            while(rs.next())
            {
                tblsewa.addRow(new Object[]{
                rs.getString(1),
                rs.getString(2),
                rs.getString(3),
                rs.getString(4),
                rs.getString(5),
                rs.getString(6),
                rs.getString(7),
                rs.getString(8),
                rs.getString(9)
            });
            }
            tblsewa1.setModel(tblsewa);
        }catch (Exception e){
            JOptionPane.showMessageDialog(null,"Ada kesalahan");
        }
    }

    /**
     * Creates new form tesform
     */
    public MenuPemilik() {
        initComponents();
        setLocationRelativeTo(this);
        tampildatasewa();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jButton5 = new javax.swing.JButton();
        jScrollPane4 = new javax.swing.JScrollPane();
        tblsewa1 = new javax.swing.JTable();
        cetak = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu4 = new javax.swing.JMenu();
        Bantuan = new javax.swing.JMenuItem();
        AboutProgramMenu = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("NADA Music Studio");

        jButton5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/button-logout.png"))); // NOI18N
        jButton5.setToolTipText("Logout pemilik");
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });

        tblsewa1.setModel(new javax.swing.table.DefaultTableModel(
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
        jScrollPane4.setViewportView(tblsewa1);

        cetak.setText("Cetak");
        cetak.setToolTipText("Mencetak seluruh data sewa");
        cetak.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cetakActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel1.setText("Data Sewa");

        jLabel3.setBackground(new java.awt.Color(153, 153, 153));
        jLabel3.setFont(new java.awt.Font("Bauhaus 93", 0, 26)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 153, 0));
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel3.setText("NADA Music Studio");
        jLabel3.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jLabel3.setPreferredSize(new java.awt.Dimension(164, 24));

        jMenu4.setText("Bantuan");

        Bantuan.setText("Bantuan");
        Bantuan.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BantuanActionPerformed(evt);
            }
        });
        jMenu4.add(Bantuan);

        AboutProgramMenu.setText("Tentang Aplikasi");
        AboutProgramMenu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AboutProgramMenuActionPerformed(evt);
            }
        });
        jMenu4.add(AboutProgramMenu);

        jMenuBar1.add(jMenu4);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jScrollPane4, javax.swing.GroupLayout.DEFAULT_SIZE, 712, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(cetak))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                        .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 248, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jButton5, javax.swing.GroupLayout.PREFERRED_SIZE, 126, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jButton5, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(37, 37, 37)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 14, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(2, 2, 2)
                .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, 353, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(32, 32, 32)
                .addComponent(cetak)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed
        form1 = new Login();
        form1.setVisible(true);
        this.dispose();        // TODO add your handling code here:
    }//GEN-LAST:event_jButton5ActionPerformed

    private void cetakActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cetakActionPerformed
        try{
            String namafile= "./src/NADA_GUI/laporan.jasper";
            koneksi();
            HashMap param=new HashMap();
            param.clear();
            JasperPrint JPrint = JasperFillManager.fillReport(namafile, param, conn);
            JasperExportManager.exportReportToPdfFile(JPrint, "C:\\Users\\Nurshabah\\Documents\\NetBeansProjects\\Pengolahan Rental Studio Music\\Laporan\\Laporan.pdf");
            Runtime.getRuntime().exec("rundll32 url.dll,FileProtocolHandler C:\\Users\\Nurshabah\\Documents\\NetBeansProjects\\Pengolahan Rental Studio Music\\Laporan\\Laporan.pdf");
            
        } catch (Exception e){
            JOptionPane.showMessageDialog(null, "Gagal membuka laporan","Cetak Laporan",JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_cetakActionPerformed

    private void AboutProgramMenuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AboutProgramMenuActionPerformed
        new AboutProgram().setVisible(true);
    }//GEN-LAST:event_AboutProgramMenuActionPerformed

    private void BantuanActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BantuanActionPerformed
        new help().setVisible(true);
    }//GEN-LAST:event_BantuanActionPerformed

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
            java.util.logging.Logger.getLogger(MenuPemilik.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(MenuPemilik.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MenuPemilik.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MenuPemilik.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new MenuPemilik().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenuItem AboutProgramMenu;
    private javax.swing.JMenuItem Bantuan;
    private javax.swing.JButton cetak;
    private javax.swing.JButton jButton5;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JMenu jMenu4;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JTable tblsewa1;
    // End of variables declaration//GEN-END:variables
}
