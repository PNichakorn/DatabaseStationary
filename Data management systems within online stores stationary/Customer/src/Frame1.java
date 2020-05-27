import java.sql.*;
import java.text.MessageFormat;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import net.proteanit.sql.DbUtils;
public class Frame1 extends javax.swing.JFrame {
    private Connection con=null;
    private ResultSet rs=null;
    private PreparedStatement pst=null;
    public Frame1() {
        initComponents();
        con=Connect.ConnectDB();
        showDataTOForm();
        //shoeDataCombo();
    }
    //ดึงข้อมูลมาใส่ combobox
    /*private void shoeDataCombo()
    {
        try {
            String sql="select*from customer";
            pst=con.prepareStatement(sql);
            rs=pst.executeQuery();
            while (rs.next()) {                
                String name=rs.getString("Customer_Name");
                combocustomer.addItem(name);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }*/
    //ดึงข้อมูล
    public void showDataTOForm()
    {
        String sql="SELECT * FROM customer";
        try {
            pst=con.prepareStatement(sql);
            rs=pst.executeQuery();
            tbcustomer.setModel(DbUtils.resultSetToTableModel(rs));
        } catch (SQLException ex) {
            Logger.getLogger(Frame1.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        txt_code = new javax.swing.JTextField();
        txt_name = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        txt_address = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        txt_tel = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        txt_mail = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        tbcustomer = new javax.swing.JTable();
        jButton1 = new javax.swing.JButton();
        txt_search = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        jButton3 = new javax.swing.JButton();

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Customer");
        setBackground(new java.awt.Color(255, 255, 153));
        setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowOpened(java.awt.event.WindowEvent evt) {
                formWindowOpened(evt);
            }
        });
        addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                formKeyReleased(evt);
            }
        });

        jLabel1.setText("รหัสลูกค้า");

        jLabel2.setText("ชื่อลูกค้า");

        txt_code.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_codeActionPerformed(evt);
            }
        });
        txt_code.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txt_codeKeyPressed(evt);
            }
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txt_codeKeyReleased(evt);
            }
        });

        txt_name.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_nameActionPerformed(evt);
            }
        });

        jLabel3.setText("ที่อยู่");

        txt_address.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_addressActionPerformed(evt);
            }
        });

        jLabel4.setText("เบอร์โทรศัพท์");

        txt_tel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_telActionPerformed(evt);
            }
        });

        jLabel5.setText("Email");

        txt_mail.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_mailActionPerformed(evt);
            }
        });

        tbcustomer.setModel(new javax.swing.table.DefaultTableModel(
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
        tbcustomer.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tbcustomerMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tbcustomer);

        jButton1.setText("Save");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        txt_search.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txt_searchKeyReleased(evt);
            }
        });

        jLabel6.setText("ค้นหารหัสลูกค้า");

        jButton3.setText("Delete");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 81, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(txt_mail, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 457, Short.MAX_VALUE)
                            .addComponent(txt_tel, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txt_name, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txt_address, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txt_code, javax.swing.GroupLayout.Alignment.LEADING))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addComponent(jLabel6)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txt_search, javax.swing.GroupLayout.PREFERRED_SIZE, 256, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(176, 176, 176))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 589, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(20, 20, 20))))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButton3, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(28, 28, 28))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(34, 34, 34)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txt_code, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txt_name, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txt_address, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 119, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txt_search, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(txt_tel, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel6)))
                .addGap(20, 20, 20)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txt_mail, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(32, 32, 32)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton3, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void txt_codeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_codeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_codeActionPerformed

    private void txt_nameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_nameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_nameActionPerformed

    private void txt_addressActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_addressActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_addressActionPerformed

    private void txt_telActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_telActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_telActionPerformed

    private void txt_mailActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_mailActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_mailActionPerformed

    private void tbcustomerMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tbcustomerMouseClicked
        //ดูข้อมูลลูกค้า
        try {
            int row=tbcustomer.getSelectedRow();
            String select=tbcustomer.getValueAt(row, 0).toString();//ชื่อลูกค้า
            String sql = "Select * from customer where Customer_code ='"+select+"'";
            pst=con.prepareStatement(sql);
            rs=pst.executeQuery();
            if(rs.next()){
                String add1=rs.getString("Customer_Name");
                txt_name.setText(add1);
                String add2=rs.getString("Customer_code");
                txt_code.setText(add2);
                String add3=rs.getString("Customer_Address");
                txt_address.setText(add3);
                String add4=rs.getString("Customer_Tel");
                txt_tel.setText(add4);
                String add5=rs.getString("Customer_Email");
                txt_mail.setText(add5);
            }
        } catch (SQLException ex) {
            Logger.getLogger(Frame1.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_tbcustomerMouseClicked

    private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened
 

   //this.getContentPane().setBackground(สีที่ต้องการ);


    }//GEN-LAST:event_formWindowOpened

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        //เพิ่มข้อมูล
        try {
            String sql="insert into customer(Customer_code,Customer_Name,Customer_Address,Customer_Tel,Customer_Email)values(?,?,?,?,?)";
            pst=con.prepareStatement(sql);
            pst.setString(1,txt_code.getText());
            pst.setString(2,txt_name.getText());
            pst.setString(3,txt_address.getText());
            pst.setString(4,txt_tel.getText());
            pst.setString(5,txt_mail.getText());
            pst.execute();
            JOptionPane.showMessageDialog(this, "บันทึก", "บันทึกข้อมูลเรีบยร้อย", JOptionPane.INFORMATION_MESSAGE);
            showDataTOForm();
            clearData();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }//GEN-LAST:event_jButton1ActionPerformed

    private void txt_codeKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txt_codeKeyPressed
        
    }//GEN-LAST:event_txt_codeKeyPressed

    private void txt_codeKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txt_codeKeyReleased
        //แจ้งเตือนเมื่อเพิ่มข้อมูลที่มีรหัสลูกค้าซ้ำกัน
        try {
            String sql="select*from customer";
            pst=con.prepareStatement(sql);
            rs=pst.executeQuery();
            while (rs.next()) {                
                String code=rs.getString("Customer_code");
                if(code.equalsIgnoreCase(txt_code.getText()))
                {
                    JOptionPane.showMessageDialog(this, "รหัสซ้ำกัน", "แจ้งเตือน", JOptionPane.WARNING_MESSAGE);
                    clearData();
                }
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }//GEN-LAST:event_txt_codeKeyReleased

    private void formKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_formKeyReleased
        try {
            //ดูข้อมูลซ้ำ
            String sql="select*from customer";
            pst=con.prepareStatement(sql);
            rs=pst.executeQuery();
            while (rs.next()) {                
                String code=rs.getString("Customer_code");
                if(code.equalsIgnoreCase(txt_code.getText()))
                {
                    JOptionPane.showMessageDialog(this, "รหัสซ้ำกัน", "แจ้งเตือน", JOptionPane.WARNING_MESSAGE);
                    clearData();
                }
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }//GEN-LAST:event_formKeyReleased

    private void txt_searchKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txt_searchKeyReleased
       //หาข้อมูลในช่อง search
        try {
            String data=txt_search.getText();
            String sql="SELECT Customer_code,Customer_Name,Customer_Address,Customer_Address,Customer_Tel,Customer_Email\n" +
"FROM customer\n" +
"WHERE Customer_code=?";
            PreparedStatement pst=con.prepareStatement(sql);
            pst.setString(1, data);
            rs=pst.executeQuery();
            tbcustomer.setModel(DbUtils.resultSetToTableModel(rs));
        } catch (Exception e) {
            e.printStackTrace();
        }
    }//GEN-LAST:event_txt_searchKeyReleased
        
    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        //ลบข้อมูล
        try {
            String id_delete = txt_code.getText();
            String sql = "DELETE FROM customer WHERE Customer_code = '" + id_delete + "'";
            pst = con.prepareStatement(sql);
            pst.executeUpdate();
            JOptionPane.showMessageDialog(this, "Delete " + txt_code.getText(), "Delete suscessed", JOptionPane.INFORMATION_MESSAGE);
            showDataTOForm();
            clearData();
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(this, ex.getMessage(), "Delete fail!", JOptionPane.WARNING_MESSAGE);
        }
    }//GEN-LAST:event_jButton3ActionPerformed

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
            java.util.logging.Logger.getLogger(Frame1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Frame1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Frame1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Frame1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Frame1().setVisible(true);
            }
        });
    }
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton3;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tbcustomer;
    private javax.swing.JTextField txt_address;
    private javax.swing.JTextField txt_code;
    private javax.swing.JTextField txt_mail;
    private javax.swing.JTextField txt_name;
    private javax.swing.JTextField txt_search;
    private javax.swing.JTextField txt_tel;
    // End of variables declaration//GEN-END:variables

    private void clearData() {
        txt_code.setText("");
        txt_name.setText("");
        txt_address.setText("");
        txt_tel.setText("");
        txt_mail.setText("");
    }
}
