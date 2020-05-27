import java.sql.*;
import java.text.MessageFormat;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.table.TableModel;
import net.proteanit.sql.DbUtils;

public class Form1 extends javax.swing.JFrame {
private Connection con = null; //เชื่อมต่อกับฐานข้อมูล
private ResultSet rs = null;
private PreparedStatement pst = null;
//ดึงข้อมูล
    public Form1() {
        initComponents();
        con = Connect.ConnectDB();
        showDataForm();
        showDatacombo();
    }
    //ดึงข้อมูลมาใส่ combobox
    private void showDatacombo(){
    try {
        String sql="select* from producttype";
        pst=con.prepareStatement(sql);
        rs=pst.executeQuery();
        while(rs.next()){
            String name = rs.getString("Type_Code");
            combobox.addItem(name);              
        }
    }catch(Exception e){
        e.printStackTrace();
    }
    }
    //ดึงข้อมูลเข้ามาแสดง
    public void showDataForm(){
    String sql="SELECT Product_Code,Product_Name,Product_Brand,Product_Price,Type_id\n" +
"FROM Product";
    try{
        pst=con.prepareStatement(sql);
        rs =pst.executeQuery();
        tbProduct.setModel(DbUtils.resultSetToTableModel(rs));
        while(rs.next()){
            System.out.println(rs.getString("Product_Name"));
            
    }     
    }  catch (SQLException ex) {
        Logger.getLogger(Form1.class.getName()).log(Level.SEVERE, null, ex);
    }
    
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        tbProduct = new javax.swing.JTable();
        combobox = new javax.swing.JComboBox<>();
        jLabel1 = new javax.swing.JLabel();
        tfName = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        tfBrand = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();
        tfDetail = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        tfStock = new javax.swing.JTextField();
        tfPrice = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        tfCode = new javax.swing.JTextField();
        tfS = new javax.swing.JTextField();
        btPrint = new javax.swing.JButton();
        jLabel7 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jButton2 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Product");

        tbProduct.setModel(new javax.swing.table.DefaultTableModel(
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
        tbProduct.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tbProductMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tbProduct);

        combobox.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { " " }));

        jLabel1.setText("ประเภทสินค้า");

        jLabel2.setText("ชื่อสินค้า");

        jLabel3.setText("รหัสสินค้า");

        jLabel4.setText("Brand");

        jButton1.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jButton1.setText("Save");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jLabel5.setText("รายละเอียด");

        jLabel6.setText("ค้นหา");

        jLabel8.setText("ราคา");

        tfCode.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                tfCodeKeyPressed(evt);
            }
            public void keyReleased(java.awt.event.KeyEvent evt) {
                tfCodeKeyReleased(evt);
            }
        });

        tfS.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tfSActionPerformed(evt);
            }
        });
        tfS.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                tfSKeyReleased(evt);
            }
        });

        btPrint.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        btPrint.setText("Print");
        btPrint.setToolTipText("");
        btPrint.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btPrintActionPerformed(evt);
            }
        });

        jLabel7.setText("สินค้าใน Stock");

        jLabel9.setFont(new java.awt.Font("Yu Gothic UI", 0, 48)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(0, 0, 204));
        jLabel9.setText("Product");

        jButton2.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jButton2.setText("Delete");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(91, 91, 91)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(tfS, javax.swing.GroupLayout.PREFERRED_SIZE, 185, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel6)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(btPrint, javax.swing.GroupLayout.PREFERRED_SIZE, 155, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 127, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 612, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(206, 206, 206)
                        .addComponent(jLabel9)))
                .addGap(30, 30, 30)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(tfPrice, javax.swing.GroupLayout.PREFERRED_SIZE, 194, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel8)
                    .addComponent(jLabel5)
                    .addComponent(jLabel7)
                    .addComponent(jLabel2)
                    .addComponent(tfName, javax.swing.GroupLayout.DEFAULT_SIZE, 388, Short.MAX_VALUE)
                    .addComponent(jLabel3)
                    .addComponent(tfCode, javax.swing.GroupLayout.DEFAULT_SIZE, 388, Short.MAX_VALUE)
                    .addComponent(jLabel1)
                    .addComponent(combobox, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel4)
                    .addComponent(tfBrand)
                    .addComponent(tfStock, javax.swing.GroupLayout.DEFAULT_SIZE, 388, Short.MAX_VALUE)
                    .addComponent(tfDetail))
                .addContainerGap(278, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(66, 66, 66)
                        .addComponent(jLabel2)
                        .addGap(8, 8, 8)
                        .addComponent(tfName, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jLabel3)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(tfCode, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jLabel1)
                        .addGap(18, 18, 18)
                        .addComponent(combobox, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jLabel4)
                        .addGap(18, 18, 18)
                        .addComponent(tfBrand, javax.swing.GroupLayout.PREFERRED_SIZE, 66, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 15, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel9)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 291, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel6)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(tfS, javax.swing.GroupLayout.PREFERRED_SIZE, 58, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(12, 12, 12)))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(btPrint, javax.swing.GroupLayout.PREFERRED_SIZE, 58, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 58, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel7)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(tfStock, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel5)
                .addGap(18, 18, 18)
                .addComponent(tfDetail, javax.swing.GroupLayout.PREFERRED_SIZE, 94, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel8)
                .addGap(2, 2, 2)
                .addComponent(tfPrice, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(312, Short.MAX_VALUE))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents
//Show data
    private void tbProductMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tbProductMouseClicked
      try {
        int row=tbProduct.getSelectedRow();
        String selectID = tbProduct.getValueAt(row, 0).toString();
        String sql = "Select * from product where Product_Code ='"+selectID+"'";
        //System.out.println(sql);
        pst =con.prepareStatement(sql);
        rs=pst.executeQuery();
        if(rs.next()){
            String add1 = rs.getString("Product_Code");
            tfCode.setText(add1);
            String add2 = rs.getString("Product_Name");
            tfName.setText(add2);
            int add3 = rs.getInt("Product_Price");
            tfPrice.setText(add3+"");
            String add4 = rs.getString("Product_Detail");
            tfDetail.setText(add4);
            int add5 = rs.getInt("Product_Stock");
            tfStock.setText(add5+"");
            String add6 = rs.getString("Product_Brand");
            tfBrand.setText(add6);
        }
    } catch (Exception ex) {
        Logger.getLogger(Form1.class.getName()).log(Level.SEVERE, null, ex);
    }
       
    }//GEN-LAST:event_tbProductMouseClicked
//บันทึกข้อมุลเข้าไปในฐานข้อมูล
    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        try {
           
      String sql = "INSERT INTO product(Product_Code,Product_Name,Product_Price,Product_Detail,Product_Stock,Product_Brand,Type_id)values(?,?,?,?,?,?,?)";
            pst = con.prepareStatement(sql);
            pst.setString(7,tfS.getText());
            pst.setString(2,tfName.getText());
            pst.setString(3,tfPrice.getText());
            pst.setString(4,tfDetail.getText());
            pst.setString(5,tfStock.getText());
            pst.setString(6,tfBrand.getText());
            pst.setString(1,combobox.getSelectedItem().toString());
            pst.execute();
            JOptionPane.showMessageDialog(this, "บันทึก", "บันทึกเรียบร้อย", JOptionPane.INFORMATION_MESSAGE);
            showDataForm();
            clearData();
    } catch(Exception e){
            e.printStackTrace();
    }//GEN-LAST:event_jButton1ActionPerformed
//แจ้งเตือนว่าระบบว่ามีตัวผิดพลาด
    private void tfCodeKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_tfCodeKeyReleased
        try {
        String sql="select* from product";
        pst=con.prepareStatement(sql);
        rs=pst.executeQuery();
        while(rs.next()){
            String code = rs.getString("Product_Code");
            if(code.equalsIgnoreCase(tfCode.getText())){
            JOptionPane.showMessageDialog(this,"รหัสซ้ำกัน","แจ้งเตือน",JOptionPane.WARNING_MESSAGE);
            clearData();
            }
        }
    }catch(SQLException e){
        e.printStackTrace();
    }
    }//GEN-LAST:event_tfCodeKeyReleased

    private void tfSActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tfSActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tfSActionPerformed

    private void tfSKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_tfSKeyReleased
       try {   
        String data = tfS.getText();
        String sql ="SELECT Product_Code,Product_Name,Product_Price,Product_Detail,Product_Stock,Product_Brand,Type_id\n" +
"FROM product\n" +
"WHERE Product_Code=?";
        pst=con.prepareStatement(sql);
        pst.setString(1, data);
        rs=pst.executeQuery();
        tbProduct.setModel(DbUtils.resultSetToTableModel(rs));
        System.out.println(sql);
    }catch(SQLException e){
        e.printStackTrace();
    }
    }//GEN-LAST:event_tfSKeyReleased
//ปริ้นข้อมูลไปยังPDF
    private void btPrintActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btPrintActionPerformed
    MessageFormat header = new MessageFormat("Report Product");
    MessageFormat footer = new MessageFormat("Page{0,number,integer}");
    try{
      tbProduct.print(JTable.PrintMode.NORMAL,header,footer);
    }catch(Exception e){
        e.printStackTrace();
    }
    
    }//GEN-LAST:event_btPrintActionPerformed
//ลบข้อมูลในดาต้าเบส
    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        try {
            String id_delete = tfCode.getText();
            String sql = "DELETE FROM product WHERE Product_Code = '" + id_delete + "'";
            pst = con.prepareStatement(sql);
            pst.executeUpdate();
            JOptionPane.showMessageDialog(this, "Delete " + tfCode.getText(), "Delete suscessed", JOptionPane.INFORMATION_MESSAGE);
            showDataForm();
            clearData();
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(this, ex.getMessage(), "Delete fail!", JOptionPane.WARNING_MESSAGE);
        }
    }//GEN-LAST:event_jButton2ActionPerformed

    private void tfCodeKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_tfCodeKeyPressed
        // TODO add your handling code here:
    }//GEN-LAST:event_tfCodeKeyPressed

    /**
     *
     * @param args
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
            java.util.logging.Logger.getLogger(Form1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Form1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Form1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Form1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {

                
                new Form1().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btPrint;
    private javax.swing.JComboBox<String> combobox;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tbProduct;
    private javax.swing.JTextField tfBrand;
    private javax.swing.JTextField tfCode;
    private javax.swing.JTextField tfDetail;
    private javax.swing.JTextField tfName;
    private javax.swing.JTextField tfPrice;
    private javax.swing.JTextField tfS;
    private javax.swing.JTextField tfStock;
    // End of variables declaration//GEN-END:variables
//เคลียร์ข้อมูล
    private void clearData() {
      tfName.setText("");
      tfPrice.setText("");
      tfStock.setText("");
      tfName.setText("");
      tfS.setText("");
      tfBrand.setText("");
      tfDetail.setText("");
      combobox.setSelectedIndex(0);
      
      
    }
}

