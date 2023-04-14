/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package Forms;

import com.mysql.cj.jdbc.result.ResultSetMetaData;
import java.sql.Connection;
import java.sql.DriverManager;
import javax.swing.JOptionPane;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.HashSet;
import java.util.Vector;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author mahel
 */
public class StudentD extends javax.swing.JFrame {

    /**
     * Creates new form StudentD
     */
    public StudentD() {
        initComponents();
       // Display_StudentData();
    }


    Connection con =  (Connection) DBConnection.getConnection();
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        txtIndexNo = new app.bolivia.swing.JCTextField();
        jLabel6 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        txtUname = new app.bolivia.swing.JCTextField();
        jLabel5 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        txtAge = new app.bolivia.swing.JCTextField();
        jLabel12 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        txtAddress = new app.bolivia.swing.JCTextField();
        jLabel9 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        txtEmail = new app.bolivia.swing.JCTextField();
        jLabel17 = new javax.swing.JLabel();
        CbBatch = new javax.swing.JComboBox<>();
        jLabel19 = new javax.swing.JLabel();
        jLabel18 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        cbProgramme = new javax.swing.JComboBox<>();
        jLabel15 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        txtPhone = new app.bolivia.swing.JCTextField();
        jLabel11 = new javax.swing.JLabel();
        btnAdd = new javax.swing.JButton();
        btnUpdate = new javax.swing.JButton();
        btnDelete = new javax.swing.JButton();
        lblBack = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        lblCansel = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        DisplayStudentData = new rojeru_san.complementos.RSTableMetro();
        jLabel3 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        CbGetBatch = new javax.swing.JComboBox<>();
        jLabel20 = new javax.swing.JLabel();
        SearchUsingProgramme = new rojerusan.RSComboMetro();
        jLabel21 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(102, 0, 204));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        txtIndexNo.setBackground(new java.awt.Color(102, 0, 204));
        txtIndexNo.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 1, 0, new java.awt.Color(255, 255, 255)));
        txtIndexNo.setForeground(new java.awt.Color(204, 204, 204));
        txtIndexNo.setFont(new java.awt.Font("Segoe UI", 0, 13)); // NOI18N
        txtIndexNo.setPhColor(new java.awt.Color(204, 255, 255));
        txtIndexNo.setPlaceholder("Enter Indexno..");
        jPanel1.add(txtIndexNo, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 140, 280, -1));

        jLabel6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/icons8-identity-theft-30.png"))); // NOI18N
        jPanel1.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 140, 30, -1));

        jLabel4.setFont(new java.awt.Font("Segoe UI", 0, 15)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("Index Number");
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 120, -1, -1));

        jLabel7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/icons8-student-male-30.png"))); // NOI18N
        jPanel1.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 210, -1, -1));

        txtUname.setBackground(new java.awt.Color(102, 0, 204));
        txtUname.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 1, 0, new java.awt.Color(255, 255, 255)));
        txtUname.setForeground(new java.awt.Color(204, 204, 204));
        txtUname.setFont(new java.awt.Font("Segoe UI", 0, 13)); // NOI18N
        txtUname.setPhColor(new java.awt.Color(204, 255, 255));
        txtUname.setPlaceholder("Enter Username...");
        jPanel1.add(txtUname, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 210, 280, -1));

        jLabel5.setFont(new java.awt.Font("Segoe UI", 0, 15)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("Username");
        jPanel1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 190, -1, -1));

        jLabel13.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/date birth-age-30.png"))); // NOI18N
        jPanel1.add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 350, -1, -1));

        txtAge.setBackground(new java.awt.Color(102, 0, 204));
        txtAge.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 1, 0, new java.awt.Color(255, 255, 255)));
        txtAge.setForeground(new java.awt.Color(204, 204, 204));
        txtAge.setFont(new java.awt.Font("Segoe UI", 0, 13)); // NOI18N
        txtAge.setPhColor(new java.awt.Color(204, 255, 255));
        txtAge.setPlaceholder("Enter Age...");
        txtAge.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtAgeActionPerformed(evt);
            }
        });
        jPanel1.add(txtAge, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 350, 280, -1));

        jLabel12.setFont(new java.awt.Font("Segoe UI", 0, 15)); // NOI18N
        jLabel12.setForeground(new java.awt.Color(255, 255, 255));
        jLabel12.setText("Age");
        jPanel1.add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 330, -1, -1));

        jLabel8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/icons8-address-30.png"))); // NOI18N
        jPanel1.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 280, -1, -1));

        txtAddress.setBackground(new java.awt.Color(102, 0, 204));
        txtAddress.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 1, 0, new java.awt.Color(255, 255, 255)));
        txtAddress.setForeground(new java.awt.Color(204, 204, 204));
        txtAddress.setFont(new java.awt.Font("Segoe UI", 0, 13)); // NOI18N
        txtAddress.setPhColor(new java.awt.Color(204, 255, 255));
        txtAddress.setPlaceholder("Enter Address...");
        jPanel1.add(txtAddress, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 280, 280, -1));

        jLabel9.setFont(new java.awt.Font("Segoe UI", 0, 15)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(255, 255, 255));
        jLabel9.setText("Address");
        jPanel1.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 260, -1, -1));

        jLabel16.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/icons8_Secured_Letter_30px.png"))); // NOI18N
        jPanel1.add(jLabel16, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 420, 30, -1));

        txtEmail.setBackground(new java.awt.Color(102, 0, 204));
        txtEmail.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 1, 0, new java.awt.Color(255, 255, 255)));
        txtEmail.setForeground(new java.awt.Color(204, 204, 204));
        txtEmail.setFont(new java.awt.Font("Segoe UI", 0, 13)); // NOI18N
        txtEmail.setPhColor(new java.awt.Color(204, 255, 255));
        txtEmail.setPlaceholder("Enter Email ...");
        jPanel1.add(txtEmail, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 420, 280, -1));

        jLabel17.setFont(new java.awt.Font("Segoe UI", 0, 15)); // NOI18N
        jLabel17.setForeground(new java.awt.Color(255, 255, 255));
        jLabel17.setText("Email Address");
        jPanel1.add(jLabel17, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 400, -1, -1));

        CbBatch.setFont(new java.awt.Font("Segoe UI", 0, 13)); // NOI18N
        CbBatch.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Select Student Department", "School of Business", "School of Computing" }));
        CbBatch.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(102, 102, 255)));
        CbBatch.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CbBatchActionPerformed(evt);
            }
        });
        jPanel1.add(CbBatch, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 500, 280, 30));

        jLabel19.setFont(new java.awt.Font("Segoe UI", 0, 15)); // NOI18N
        jLabel19.setForeground(new java.awt.Color(255, 255, 255));
        jLabel19.setText("Department");
        jPanel1.add(jLabel19, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 470, -1, -1));

        jLabel18.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/icons8-certificate-34 (1).png"))); // NOI18N
        jPanel1.add(jLabel18, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 570, -1, -1));

        jLabel14.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/icons8-library-30.png"))); // NOI18N
        jPanel1.add(jLabel14, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 490, -1, -1));

        cbProgramme.setFont(new java.awt.Font("Segoe UI", 0, 13)); // NOI18N
        cbProgramme.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(102, 102, 255)));
        jPanel1.add(cbProgramme, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 570, 280, 30));

        jLabel15.setFont(new java.awt.Font("Segoe UI", 0, 15)); // NOI18N
        jLabel15.setForeground(new java.awt.Color(255, 255, 255));
        jLabel15.setText("Programme");
        jPanel1.add(jLabel15, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 540, -1, -1));

        jLabel10.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/icons8_Google_Mobile_30px.png"))); // NOI18N
        jPanel1.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 640, -1, -1));

        txtPhone.setBackground(new java.awt.Color(102, 0, 204));
        txtPhone.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 1, 0, new java.awt.Color(255, 255, 255)));
        txtPhone.setForeground(new java.awt.Color(204, 204, 204));
        txtPhone.setFont(new java.awt.Font("Segoe UI", 0, 13)); // NOI18N
        txtPhone.setPhColor(new java.awt.Color(204, 255, 255));
        txtPhone.setPlaceholder("Enter Phone ...");
        jPanel1.add(txtPhone, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 640, 280, -1));

        jLabel11.setFont(new java.awt.Font("Segoe UI", 0, 15)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(255, 255, 255));
        jLabel11.setText("Phone Number");
        jPanel1.add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 620, -1, -1));

        btnAdd.setBackground(new java.awt.Color(255, 51, 51));
        btnAdd.setFont(new java.awt.Font("Segoe UI", 0, 13)); // NOI18N
        btnAdd.setForeground(new java.awt.Color(255, 255, 255));
        btnAdd.setText("ADD");
        btnAdd.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAddActionPerformed(evt);
            }
        });
        jPanel1.add(btnAdd, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 710, 87, 35));

        btnUpdate.setBackground(new java.awt.Color(255, 51, 51));
        btnUpdate.setFont(new java.awt.Font("Segoe UI", 0, 13)); // NOI18N
        btnUpdate.setForeground(new java.awt.Color(255, 255, 255));
        btnUpdate.setText("UPDATE");
        btnUpdate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnUpdateActionPerformed(evt);
            }
        });
        jPanel1.add(btnUpdate, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 710, 87, 35));

        btnDelete.setBackground(new java.awt.Color(255, 51, 51));
        btnDelete.setFont(new java.awt.Font("Segoe UI", 0, 13)); // NOI18N
        btnDelete.setForeground(new java.awt.Color(255, 255, 255));
        btnDelete.setText("DELETE");
        btnDelete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDeleteActionPerformed(evt);
            }
        });
        jPanel1.add(btnDelete, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 710, 87, 35));

        lblBack.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/arrow-white-back-30.png"))); // NOI18N
        lblBack.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        lblBack.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblBackMouseClicked(evt);
            }
        });
        jPanel1.add(lblBack, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 20, 30, 20));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 400, 790));

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        lblCansel.setFont(new java.awt.Font("Segoe UI", 0, 26)); // NOI18N
        lblCansel.setForeground(new java.awt.Color(153, 51, 255));
        lblCansel.setText("X");
        lblCansel.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        lblCansel.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblCanselMouseClicked(evt);
            }
        });
        jPanel2.add(lblCansel, new org.netbeans.lib.awtextra.AbsoluteConstraints(1060, 10, -1, -1));

        jScrollPane1.setBackground(new java.awt.Color(255, 255, 255));

        DisplayStudentData.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null}
            },
            new String [] {
                "Index No", "Name", "Address", "Age", "Email", "Batch", "Programme", "Contact"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.Integer.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.Integer.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        DisplayStudentData.setColorBackgoundHead(new java.awt.Color(102, 102, 255));
        DisplayStudentData.setColorBordeFilas(new java.awt.Color(153, 153, 153));
        DisplayStudentData.setColorBordeHead(new java.awt.Color(153, 153, 153));
        DisplayStudentData.setColorFilasBackgound2(new java.awt.Color(255, 255, 255));
        DisplayStudentData.setColorSelBackgound(new java.awt.Color(255, 51, 51));
        DisplayStudentData.setFont(new java.awt.Font("Segoe UI", 0, 8)); // NOI18N
        DisplayStudentData.setFuenteFilas(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        DisplayStudentData.setFuenteFilasSelect(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        DisplayStudentData.setFuenteHead(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        DisplayStudentData.setGridColor(new java.awt.Color(255, 255, 255));
        DisplayStudentData.setRowHeight(40);
        DisplayStudentData.setSelectionBackground(new java.awt.Color(255, 255, 255));
        DisplayStudentData.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                DisplayStudentDataMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(DisplayStudentData);

        jPanel2.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 330, 990, 330));

        jLabel3.setFont(new java.awt.Font("Segoe UI Historic", 1, 18)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(102, 102, 102));
        jLabel3.setText("Students Details");
        jPanel2.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 290, -1, -1));

        jLabel1.setFont(new java.awt.Font("Segoe UI", 0, 22)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 204, 51));
        jLabel1.setText("Manage Students");
        jPanel2.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 30, 180, -1));

        jPanel3.setBackground(new java.awt.Color(255, 51, 51));

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 230, Short.MAX_VALUE)
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 5, Short.MAX_VALUE)
        );

        jPanel2.add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 60, 230, 5));

        CbGetBatch.setFont(new java.awt.Font("Segoe UI", 0, 13)); // NOI18N
        CbGetBatch.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Select Student Department", "School of Business", "School of Computing" }));
        CbGetBatch.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(102, 102, 255)));
        CbGetBatch.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CbGetBatchActionPerformed(evt);
            }
        });
        jPanel2.add(CbGetBatch, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 130, 510, 40));

        jLabel20.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/icons8-certificate_color-48.png"))); // NOI18N
        jPanel2.add(jLabel20, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 190, 50, 60));

        SearchUsingProgramme.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SearchUsingProgrammeActionPerformed(evt);
            }
        });
        jPanel2.add(SearchUsingProgramme, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 200, 360, 40));

        jLabel21.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/icons8-library-48.png"))); // NOI18N
        jPanel2.add(jLabel21, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 120, 60, 60));

        getContentPane().add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 0, 1090, 790));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void txtAgeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtAgeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtAgeActionPerformed

    private void btnAddActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAddActionPerformed
        
        if(txtIndexNo.getText().isEmpty()){
               JOptionPane.showMessageDialog(this, "Enter Student Index No");
        }
        else if(txtUname.getText().isEmpty()){
               JOptionPane.showMessageDialog(this, "Enter Student Name");
        }
        else if(txtAddress.getText().isEmpty()){
               JOptionPane.showMessageDialog(this, "Enter Student Address");
        }
        else if(txtAge.getText().isEmpty()){
               JOptionPane.showMessageDialog(this, "Enter Student Age");
        }
        else if(txtEmail.getText().isEmpty()){
               JOptionPane.showMessageDialog(this, "Enter Student Emial Address");
        }
        else if(CbBatch.getSelectedIndex() == 0){
              JOptionPane.showMessageDialog(this, "Select Student Department");
        }
        else if(CbBatch.getSelectedIndex() == 0){
              JOptionPane.showMessageDialog(this, "Select Student Programme");
        }
        else if(txtPhone.getText().isEmpty()){
               JOptionPane.showMessageDialog(this, "Enter Student Phone Number");
        }
        else{
           
            String index = txtIndexNo.getText();
            String name = txtUname.getText();
            int age = Integer.parseInt(txtAge.getText());
            String address = txtAddress.getText();
            String email = txtEmail.getText();
            String department = CbBatch.getSelectedItem().toString();
            String programme = cbProgramme.getSelectedItem().toString();
            int phone = Integer.parseInt(txtPhone.getText());
            
            try {
                
                 String quary3 = "Select * from studentdetails where IndexNo = ?";
                 PreparedStatement pp = con.prepareStatement(quary3);
                 pp.setString(1,index);
                 ResultSet rs = pp.executeQuery();

                 
               if(rs.next()){
                     JOptionPane.showMessageDialog(this, "Student ID already exists");     
                  }
               else{
                   
                     
                  String sql = "Insert into studentdetails(IndexNo, Name, Age, Address, Email, Department, Programme, Phone)values(?, ?, ?, ?, ?, ?, ?, ?)";
                  PreparedStatement pst = con.prepareStatement(sql);
                  pst.setString(1, index);
                  pst.setString(2, name);
                  pst.setInt(3, age);
                  pst.setString(4, address);
                  pst.setString(5, email);
                  pst.setString(6, department);
                  pst.setString(7, programme);
                  pst.setInt(8, phone);
                   
                  pst.executeUpdate();
                  
                  
                  
                  String sql1 = "Insert into managestudentsresult(IndexNo, Department, Programme) values (?, ?, ?)";
                  PreparedStatement ps = con.prepareStatement(sql1);
                  ps.setString(1, index);
                  ps.setString(2, department);
                  ps.setString(3, programme);
                  ps.executeUpdate();
                  
             
               JOptionPane.showMessageDialog(this,"Student Registor Succesfuly","INFOR",JOptionPane.INFORMATION_MESSAGE);
               
               Search();
               
               txtIndexNo.setText("");
               txtUname.setText("");
               txtAge.setText("");
               txtAddress.setText("");
               txtEmail.setText("");
               txtPhone.setText("");   
            
                  } 
                  
            } catch (Exception e) {
                 e.printStackTrace();
            }
            
        }
        
    }//GEN-LAST:event_btnAddActionPerformed

    
    private void lblCanselMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblCanselMouseClicked
        System.exit(0);
    }//GEN-LAST:event_lblCanselMouseClicked

    private void DisplayStudentDataMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_DisplayStudentDataMouseClicked
       DefaultTableModel Df = (DefaultTableModel)DisplayStudentData.getModel();
          int selectedIndex = DisplayStudentData.getSelectedRow();
          
          txtIndexNo.setText(Df.getValueAt(selectedIndex,0).toString());
          
          txtUname.setText(Df.getValueAt(selectedIndex,1).toString());
          
          txtAge.setText(Df.getValueAt(selectedIndex, 2).toString());
          
          txtAddress.setText(Df.getValueAt(selectedIndex,3).toString());
          
          txtEmail.setText(Df.getValueAt(selectedIndex,4).toString());
          
          String select_department = Df.getValueAt(selectedIndex,5).toString();
              switch (select_department) {
            case "School of Business":
                CbBatch.setSelectedIndex(1);
                break;
            case "School of Computing":
                CbBatch.setSelectedIndex(2);
                break;
            default:
                throw new AssertionError();        
           }
                
         String select_programme = Df.getValueAt(selectedIndex,6).toString();
            switch (select_programme) {
            case "Computer System Design":
                cbProgramme.setSelectedItem("Computer System Design");
                break;
            case "Software Engineering":
                cbProgramme.setSelectedItem("Software Engineering");
                break;
            case "Event Managment":
                cbProgramme.setSelectedItem("Event Managment");
                break;
            case "Digital Marketing":
                cbProgramme.setSelectedItem("Digital Marketing");
                break;
            default:
                throw new AssertionError();
        }
            
          txtPhone.setText(Df.getValueAt(selectedIndex,7).toString());
    }//GEN-LAST:event_DisplayStudentDataMouseClicked

    private void btnUpdateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnUpdateActionPerformed
       
          DefaultTableModel Df = (DefaultTableModel)DisplayStudentData.getModel();
          int selectedIndex = DisplayStudentData.getSelectedRow();
          
         try {
             
          String update_index = Df.getValueAt(selectedIndex, 0).toString();
          String update_name = txtUname.getText();
          String update_address = txtAddress.getText();
          int update_age = Integer.parseInt(txtAge.getText());
          String update_email = txtEmail.getText();
          String update_department = CbBatch.getSelectedItem().toString();
          String update_programme = cbProgramme.getSelectedItem().toString();
          int update_phone = Integer.parseInt(txtPhone.getText());
          
        
         String quary = "Update studentdetails set Name = ?, Age =?, Address =?, Email =?, Department =?, Programme =?, Phone =? where IndexNo =?";          
         PreparedStatement preparedStatement = con.prepareStatement(quary);
         preparedStatement.setString(1,update_name);
         preparedStatement.setInt(2,update_age);
         preparedStatement.setString(3,update_address);
         preparedStatement.setString(4,update_email);
         preparedStatement.setString(5, update_department);
         preparedStatement.setString(6, update_programme);
         preparedStatement.setInt(7, update_phone);
         preparedStatement.setString(8, update_index);

         preparedStatement.executeUpdate();
         
         
         String quary1 = "Update managestudentsresult set Department =?, Programme =? where IndexNo = ?";
         PreparedStatement pss = con.prepareStatement(quary1);
         pss.setString(1, update_department);
         pss.setString(2, update_programme);
         pss.setString(3, update_index);
         pss.executeUpdate();
         
          
        } catch (Exception ex) {
           ex.printStackTrace();
        }

         JOptionPane.showMessageDialog(this,"Record Update","INFOR",JOptionPane.INFORMATION_MESSAGE);      
         Search();
        
    }//GEN-LAST:event_btnUpdateActionPerformed

    private void btnDeleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDeleteActionPerformed
        
        DefaultTableModel Df = (DefaultTableModel)DisplayStudentData.getModel();
        int selectedIndex = DisplayStudentData.getSelectedRow();
        
         try {
             
          String index = Df.getValueAt(selectedIndex, 0).toString();
          
          int dialogResult = JOptionPane.showConfirmDialog(null, "Do you want to delete the record","Warning",JOptionPane.YES_NO_OPTION);
          
          if(dialogResult == JOptionPane.YES_OPTION){
              
         String quary = "Delete from studentdetails where IndexNo =?";          
         PreparedStatement preparedStatement = con.prepareStatement(quary);
         preparedStatement.setString(1, index);
         preparedStatement.executeUpdate();
         
         
         String quary2 = "Delete from managestudentsresult where IndexNo = ?";
         PreparedStatement pt = con.prepareStatement(quary2);
         pt.setString(1, index);
         pt.executeUpdate();
         
                   
          }           
        } 
        catch (Exception ex) {
            ex.printStackTrace();
        } 

         JOptionPane.showMessageDialog(this,"Record Deleted","INFOR",JOptionPane.INFORMATION_MESSAGE);      
         Search();
         
         txtUname.setText("");
         txtAddress.setText("");
         txtAge.setText("");
         txtEmail.setText("");
         txtPhone.setText("");
         CbBatch.setSelectedIndex(0);

    
    }//GEN-LAST:event_btnDeleteActionPerformed

    private void lblBackMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblBackMouseClicked
        AdminDashboard adminDashboard = new AdminDashboard();
        adminDashboard.setVisible(true);
        this.dispose();
        
    }//GEN-LAST:event_lblBackMouseClicked

    private void CbGetBatchActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CbGetBatchActionPerformed
            if(CbGetBatch.getSelectedItem().equals("School of Business")){
                SearchUsingProgramme.removeAllItems();
                SearchUsingProgramme.setSelectedItem(null);
                SearchUsingProgramme.addItem("Select Programme");
                SearchUsingProgramme.addItem("Event Managment");
                SearchUsingProgramme.addItem("Digital Marketing");
        }
        if(CbGetBatch.getSelectedItem().equals("School of Computing")){
               SearchUsingProgramme.removeAllItems();
               SearchUsingProgramme.setSelectedItem(null);
               SearchUsingProgramme.addItem("Select Programme");
               SearchUsingProgramme.addItem("Computer System Design");
               SearchUsingProgramme.addItem("Software Engineering");
        }
        
        else if(CbGetBatch.getSelectedItem().equals("Select Student Department")){
               SearchUsingProgramme.removeAllItems();
        }
         
        Search();
     
    }//GEN-LAST:event_CbGetBatchActionPerformed

    private void CbBatchActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CbBatchActionPerformed
        if(CbBatch.getSelectedItem().equals("School of Business")){
                cbProgramme.removeAllItems();
                cbProgramme.setSelectedItem(null);
                cbProgramme.addItem("Select Programme");
                cbProgramme.addItem("Event Managment");
                cbProgramme.addItem("Digital Marketing");
        }
        if(CbBatch.getSelectedItem().equals("School of Computing")){
               cbProgramme.removeAllItems();
               cbProgramme.setSelectedItem(null);
               cbProgramme.addItem("Select Programme");
               cbProgramme.addItem("Computer System Design");
               cbProgramme.addItem("Software Engineering");
        }
        
        else if(CbBatch.getSelectedItem().equals("Select Student Department")){
               cbProgramme.removeAllItems();
        }
    }//GEN-LAST:event_CbBatchActionPerformed

    private void SearchUsingProgrammeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SearchUsingProgrammeActionPerformed
        try {
                    Search();
        } catch (Exception e) {
            e.printStackTrace();
        }

    }//GEN-LAST:event_SearchUsingProgrammeActionPerformed

    public void Search(){
        try {
          
        int getdep = CbGetBatch.getSelectedIndex();
        int c;
        String programme = null ;
      
        if(getdep == 1 ){
            if(SearchUsingProgramme.getSelectedIndex() == 1){
               programme = "Event Managment";
            }
            else if(SearchUsingProgramme.getSelectedIndex() == 2){
               programme = "Digital Marketing";
            }
            else if(SearchUsingProgramme.getSelectedIndex() == 3){
               programme = "Digital Banking and Finance";
        }
            
        }
        else if(getdep == 2){
           if(SearchUsingProgramme.getSelectedIndex() == 1){
               programme = "Computer System Design";
            }
            else if(SearchUsingProgramme.getSelectedIndex() == 2){
              programme = "Software Engineering";
        }     
       }
        
        
         String quary = "Select * from studentdetails where Programme = ?";          
         PreparedStatement preparedStatement = con.prepareStatement(quary);
         preparedStatement.setString(1, programme);
         ResultSet rs = preparedStatement.executeQuery();

         ResultSetMetaData Rss = (ResultSetMetaData) rs.getMetaData();
         c = Rss.getColumnCount();
         
         DefaultTableModel Df = (DefaultTableModel)DisplayStudentData.getModel();
         Df.setRowCount(0);
         
         while(rs.next())
         {
           Vector v2 = new Vector();
           
           for(int a=1; a<=c; a++){
               v2.add(rs.getString("IndexNo"));
               v2.add(rs.getString("Name"));
               v2.add(rs.getInt("Age"));
               v2.add(rs.getString("Address"));
               v2.add(rs.getString("Email"));
               v2.add(rs.getString("Department"));
               v2.add(rs.getString("Programme"));
               v2.add(rs.getInt("Phone"));
           }
           
           Df.addRow(v2);
             
         }
      
        } catch (Exception ex) {
            ex.printStackTrace();
        }    
        }
    
    
    
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
            java.util.logging.Logger.getLogger(StudentD.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(StudentD.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(StudentD.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(StudentD.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new StudentD().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox<String> CbBatch;
    private javax.swing.JComboBox<String> CbGetBatch;
    private rojeru_san.complementos.RSTableMetro DisplayStudentData;
    private rojerusan.RSComboMetro SearchUsingProgramme;
    private javax.swing.JButton btnAdd;
    private javax.swing.JButton btnDelete;
    private javax.swing.JButton btnUpdate;
    private javax.swing.JComboBox<String> cbProgramme;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lblBack;
    private javax.swing.JLabel lblCansel;
    private app.bolivia.swing.JCTextField txtAddress;
    private app.bolivia.swing.JCTextField txtAge;
    private app.bolivia.swing.JCTextField txtEmail;
    private app.bolivia.swing.JCTextField txtIndexNo;
    private app.bolivia.swing.JCTextField txtPhone;
    private app.bolivia.swing.JCTextField txtUname;
    // End of variables declaration//GEN-END:variables

    private void DisplayStudentData() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
}
