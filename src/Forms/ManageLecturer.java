/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package Forms;

import javax.swing.JOptionPane;
import java.sql.Connection;
import java.sql.DriverManager;
import com.mysql.cj.jdbc.result.ResultSetMetaData;
import java.sql.ResultSet;
import javax.swing.JOptionPane;
import java.util.Vector;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.sql.PreparedStatement;
import javax.swing.RowFilter;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableRowSorter;

/**
 *
 * @author mahel
 */
public class ManageLecturer extends javax.swing.JFrame {

    /**
     * Creates new form ManageLecturer
     */
    public ManageLecturer() {
        initComponents();
    }

    Connection con = (Connection)DBConnection.getConnection();
    
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        lblBack = new javax.swing.JLabel();
        txtAge = new app.bolivia.swing.JCTextField();
        jLabel13 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        txtAddress = new app.bolivia.swing.JCTextField();
        jLabel9 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        txtLname = new app.bolivia.swing.JCTextField();
        jLabel5 = new javax.swing.JLabel();
        txtIndexNo = new app.bolivia.swing.JCTextField();
        jLabel4 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        txtGender = new javax.swing.JComboBox<>();
        jLabel18 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        txtQulification = new javax.swing.JComboBox<>();
        jLabel19 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        txtDepartment = new javax.swing.JComboBox<>();
        jLabel20 = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        jLabel21 = new javax.swing.JLabel();
        txtPhone = new app.bolivia.swing.JCTextField();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        btnAdd = new javax.swing.JButton();
        btnUpdate = new javax.swing.JButton();
        btnDelete = new javax.swing.JButton();
        txtExperience = new app.bolivia.swing.JCTextField();
        jPanel2 = new javax.swing.JPanel();
        lblCansel = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        DisplayLecturerTable = new rojeru_san.complementos.RSTableMetro();
        txtSearch = new javax.swing.JComboBox<>();
        jLabel2 = new javax.swing.JLabel();
        txtSearchLec = new app.bolivia.swing.JCTextField();
        jLabel3 = new javax.swing.JLabel();
        jLabel22 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(255, 51, 51));

        lblBack.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/arrow-white-back-30.png"))); // NOI18N
        lblBack.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        lblBack.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblBackMouseClicked(evt);
            }
        });

        txtAge.setBackground(new java.awt.Color(255, 51, 51));
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

        jLabel13.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/date birth-age-30.png"))); // NOI18N

        jLabel12.setFont(new java.awt.Font("Segoe UI", 0, 15)); // NOI18N
        jLabel12.setForeground(new java.awt.Color(255, 255, 255));
        jLabel12.setText("Age");

        txtAddress.setBackground(new java.awt.Color(255, 51, 51));
        txtAddress.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 1, 0, new java.awt.Color(255, 255, 255)));
        txtAddress.setForeground(new java.awt.Color(204, 204, 204));
        txtAddress.setFont(new java.awt.Font("Segoe UI", 0, 13)); // NOI18N
        txtAddress.setPhColor(new java.awt.Color(204, 255, 255));
        txtAddress.setPlaceholder("Enter Address...");

        jLabel9.setFont(new java.awt.Font("Segoe UI", 0, 15)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(255, 255, 255));
        jLabel9.setText("Address");

        jLabel8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/icons8-address-30.png"))); // NOI18N

        jLabel7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/icons8-student-male-30.png"))); // NOI18N

        txtLname.setBackground(new java.awt.Color(255, 51, 51));
        txtLname.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 1, 0, new java.awt.Color(255, 255, 255)));
        txtLname.setForeground(new java.awt.Color(204, 204, 204));
        txtLname.setFont(new java.awt.Font("Segoe UI", 0, 13)); // NOI18N
        txtLname.setPhColor(new java.awt.Color(204, 255, 255));
        txtLname.setPlaceholder("Enter Username...");

        jLabel5.setFont(new java.awt.Font("Segoe UI", 0, 15)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("Professor name");

        txtIndexNo.setBackground(new java.awt.Color(255, 51, 51));
        txtIndexNo.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 1, 0, new java.awt.Color(255, 255, 255)));
        txtIndexNo.setForeground(new java.awt.Color(204, 204, 204));
        txtIndexNo.setFont(new java.awt.Font("Segoe UI", 0, 13)); // NOI18N
        txtIndexNo.setPhColor(new java.awt.Color(204, 255, 255));
        txtIndexNo.setPlaceholder("Enter Indexno..");

        jLabel4.setFont(new java.awt.Font("Segoe UI", 0, 15)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("Index Number");

        jLabel6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/icons8-identity-theft-30.png"))); // NOI18N

        txtGender.setFont(new java.awt.Font("Segoe UI", 0, 13)); // NOI18N
        txtGender.setForeground(new java.awt.Color(51, 51, 51));
        txtGender.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Select Gender", "Male", "Female" }));
        txtGender.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 51, 51)));

        jLabel18.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/icons8-transgender-30.png"))); // NOI18N

        jLabel15.setFont(new java.awt.Font("Segoe UI", 0, 15)); // NOI18N
        jLabel15.setForeground(new java.awt.Color(255, 255, 255));
        jLabel15.setText("Gender");

        txtQulification.setFont(new java.awt.Font("Segoe UI", 0, 13)); // NOI18N
        txtQulification.setForeground(new java.awt.Color(51, 51, 51));
        txtQulification.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Select qualification", "Master", "PHD" }));
        txtQulification.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 51, 51)));

        jLabel19.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/icons8-course-30.png"))); // NOI18N

        jLabel16.setFont(new java.awt.Font("Segoe UI", 0, 15)); // NOI18N
        jLabel16.setForeground(new java.awt.Color(255, 255, 255));
        jLabel16.setText("Qualification");

        txtDepartment.setFont(new java.awt.Font("Segoe UI", 0, 13)); // NOI18N
        txtDepartment.setForeground(new java.awt.Color(51, 51, 51));
        txtDepartment.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Select Department", "School of Computing", "School of Business", " " }));
        txtDepartment.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 51, 51)));

        jLabel20.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/icons8-library-30.png"))); // NOI18N

        jLabel17.setFont(new java.awt.Font("Segoe UI", 0, 15)); // NOI18N
        jLabel17.setForeground(new java.awt.Color(255, 255, 255));
        jLabel17.setText("Department");

        jLabel14.setFont(new java.awt.Font("Segoe UI", 0, 15)); // NOI18N
        jLabel14.setForeground(new java.awt.Color(255, 255, 255));
        jLabel14.setText("Experience");

        jLabel21.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/date birth-age-30.png"))); // NOI18N

        txtPhone.setBackground(new java.awt.Color(255, 51, 51));
        txtPhone.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 1, 0, new java.awt.Color(255, 255, 255)));
        txtPhone.setForeground(new java.awt.Color(204, 204, 204));
        txtPhone.setFont(new java.awt.Font("Segoe UI", 0, 13)); // NOI18N
        txtPhone.setPhColor(new java.awt.Color(204, 255, 255));
        txtPhone.setPlaceholder("Enter Phone ...");

        jLabel10.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/icons8_Google_Mobile_30px.png"))); // NOI18N

        jLabel11.setFont(new java.awt.Font("Segoe UI", 0, 15)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(255, 255, 255));
        jLabel11.setText("Phone Number");

        btnAdd.setBackground(new java.awt.Color(102, 102, 255));
        btnAdd.setFont(new java.awt.Font("Segoe UI", 0, 13)); // NOI18N
        btnAdd.setForeground(new java.awt.Color(255, 255, 255));
        btnAdd.setText("ADD");
        btnAdd.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAddActionPerformed(evt);
            }
        });

        btnUpdate.setBackground(new java.awt.Color(102, 102, 255));
        btnUpdate.setFont(new java.awt.Font("Segoe UI", 0, 13)); // NOI18N
        btnUpdate.setForeground(new java.awt.Color(255, 255, 255));
        btnUpdate.setText("UPDATE");
        btnUpdate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnUpdateActionPerformed(evt);
            }
        });

        btnDelete.setBackground(new java.awt.Color(102, 102, 255));
        btnDelete.setFont(new java.awt.Font("Segoe UI", 0, 13)); // NOI18N
        btnDelete.setForeground(new java.awt.Color(255, 255, 255));
        btnDelete.setText("DELETE");
        btnDelete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDeleteActionPerformed(evt);
            }
        });

        txtExperience.setBackground(new java.awt.Color(255, 51, 51));
        txtExperience.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 1, 0, new java.awt.Color(255, 255, 255)));
        txtExperience.setForeground(new java.awt.Color(204, 204, 204));
        txtExperience.setFont(new java.awt.Font("Segoe UI", 0, 13)); // NOI18N
        txtExperience.setPhColor(new java.awt.Color(204, 255, 255));
        txtExperience.setPlaceholder("Enter  Experience...");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(20, 20, 20)
                        .addComponent(lblBack))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(32, 32, 32)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel10)
                                .addGap(20, 20, 20)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(txtPhone, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 280, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel11)))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel6)
                                .addGap(20, 20, 20)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(txtIndexNo, javax.swing.GroupLayout.PREFERRED_SIZE, 280, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel4)))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel7)
                                .addGap(20, 20, 20)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(txtLname, javax.swing.GroupLayout.PREFERRED_SIZE, 280, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel5)))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel8)
                                .addGap(20, 20, 20)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel9)
                                    .addComponent(txtAddress, javax.swing.GroupLayout.PREFERRED_SIZE, 280, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel13)
                                .addGap(20, 20, 20)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel12)
                                    .addComponent(txtAge, javax.swing.GroupLayout.PREFERRED_SIZE, 280, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel21)
                                .addGap(18, 18, 18)
                                .addComponent(txtExperience, javax.swing.GroupLayout.PREFERRED_SIZE, 280, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel18)
                                .addGap(18, 18, 18)
                                .addComponent(txtGender, javax.swing.GroupLayout.PREFERRED_SIZE, 282, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel19)
                                .addGap(18, 18, 18)
                                .addComponent(txtQulification, javax.swing.GroupLayout.PREFERRED_SIZE, 280, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(2, 2, 2)
                                .addComponent(jLabel20)
                                .addGap(18, 18, 18)
                                .addComponent(txtDepartment, javax.swing.GroupLayout.PREFERRED_SIZE, 280, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(50, 50, 50)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jLabel16, javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel14, javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel15, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 61, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel17, javax.swing.GroupLayout.Alignment.LEADING)))))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(47, 47, 47)
                        .addComponent(btnAdd, javax.swing.GroupLayout.PREFERRED_SIZE, 87, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(btnUpdate, javax.swing.GroupLayout.PREFERRED_SIZE, 87, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(btnDelete, javax.swing.GroupLayout.PREFERRED_SIZE, 87, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(38, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(16, 16, 16)
                .addComponent(lblBack, javax.swing.GroupLayout.PREFERRED_SIZE, 21, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel4)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(20, 20, 20)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel6)
                            .addComponent(txtIndexNo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel5)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(20, 20, 20)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel7)
                            .addComponent(txtLname, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel9)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(20, 20, 20)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel8)
                            .addComponent(txtAddress, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel12)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(20, 20, 20)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel13)
                            .addComponent(txtAge, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(18, 18, 18)
                .addComponent(jLabel15)
                .addGap(9, 9, 9)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel18)
                    .addComponent(txtGender, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(jLabel16)
                .addGap(9, 9, 9)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel19)
                    .addComponent(txtQulification, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(jLabel17)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(9, 9, 9)
                        .addComponent(txtDepartment, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(1, 1, 1)
                        .addComponent(jLabel20)))
                .addGap(18, 18, 18)
                .addComponent(jLabel14)
                .addGap(0, 0, 0)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel21)
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel11)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(20, 20, 20)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel10)
                                    .addComponent(txtPhone, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 32, Short.MAX_VALUE)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(btnAdd, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnUpdate, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnDelete, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(33, 33, 33))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(txtExperience, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
        );

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 400, 790));

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));

        lblCansel.setFont(new java.awt.Font("Segoe UI", 0, 26)); // NOI18N
        lblCansel.setForeground(new java.awt.Color(153, 51, 255));
        lblCansel.setText("X");
        lblCansel.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        lblCansel.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblCanselMouseClicked(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Segoe UI", 0, 22)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 204, 51));
        jLabel1.setText("Manage Lecturer");

        jPanel3.setBackground(new java.awt.Color(102, 51, 255));

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

        DisplayLecturerTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {"", "", "", null, "", "", "", null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null}
            },
            new String [] {
                "Index No", "Name", "Address", "Age", "Gender", "Qualification", "Department", "Experience", "Phone"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.Integer.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.Integer.class, java.lang.Integer.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        DisplayLecturerTable.setColorBackgoundHead(new java.awt.Color(255, 51, 51));
        DisplayLecturerTable.setColorBordeFilas(new java.awt.Color(153, 153, 153));
        DisplayLecturerTable.setColorBordeHead(new java.awt.Color(153, 153, 153));
        DisplayLecturerTable.setColorFilasBackgound2(new java.awt.Color(255, 255, 255));
        DisplayLecturerTable.setColorSelBackgound(new java.awt.Color(102, 102, 255));
        DisplayLecturerTable.setFont(new java.awt.Font("Segoe UI", 0, 8)); // NOI18N
        DisplayLecturerTable.setFuenteFilas(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        DisplayLecturerTable.setFuenteFilasSelect(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        DisplayLecturerTable.setFuenteHead(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        DisplayLecturerTable.setRowHeight(40);
        DisplayLecturerTable.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                DisplayLecturerTableMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(DisplayLecturerTable);

        txtSearch.setFont(new java.awt.Font("Segoe UI", 1, 15)); // NOI18N
        txtSearch.setForeground(new java.awt.Color(51, 51, 51));
        txtSearch.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "SELECT DEPARTMENT", "School of Computing", "School of Business", " " }));
        txtSearch.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(102, 102, 255)));
        txtSearch.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtSearchActionPerformed(evt);
            }
        });

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/icons8-library-48.png"))); // NOI18N

        txtSearchLec.setBackground(new java.awt.Color(204, 255, 255));
        txtSearchLec.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        txtSearchLec.setPlaceholder("Enter Search Lecturer Name ");
        txtSearchLec.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtSearchLecActionPerformed(evt);
            }
        });
        txtSearchLec.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtSearchLecKeyReleased(evt);
            }
        });

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/icons8-writer-male-48.png"))); // NOI18N

        jLabel22.setFont(new java.awt.Font("Segoe UI Historic", 1, 18)); // NOI18N
        jLabel22.setForeground(new java.awt.Color(102, 102, 102));
        jLabel22.setText("Lecturers Details");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(199, 199, 199)
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtSearch, javax.swing.GroupLayout.PREFERRED_SIZE, 530, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap(43, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel22)
                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                            .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(jPanel2Layout.createSequentialGroup()
                                    .addGap(30, 30, 30)
                                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGap(394, 394, 394)
                            .addComponent(lblCansel)
                            .addGap(19, 19, 19))
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 1015, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(32, 32, 32))
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                            .addComponent(jLabel3)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(txtSearchLec, javax.swing.GroupLayout.PREFERRED_SIZE, 322, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(369, 369, 369)))))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(lblCansel))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(34, 34, 34)
                        .addComponent(jLabel1)
                        .addGap(0, 0, 0)
                        .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(70, 70, 70)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel2)
                    .addComponent(txtSearch, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(26, 26, 26)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                    .addComponent(txtSearchLec, javax.swing.GroupLayout.DEFAULT_SIZE, 43, Short.MAX_VALUE))
                .addGap(33, 33, 33)
                .addComponent(jLabel22)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 369, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(95, Short.MAX_VALUE))
        );

        getContentPane().add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 0, 1090, 790));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void lblBackMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblBackMouseClicked
        AdminDashboard adminDashboard = new AdminDashboard();
        adminDashboard.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_lblBackMouseClicked

    private void lblCanselMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblCanselMouseClicked
        System.exit(0);
    }//GEN-LAST:event_lblCanselMouseClicked

    private void txtAgeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtAgeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtAgeActionPerformed

    private void btnAddActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAddActionPerformed
        
        if(txtIndexNo.getText().isEmpty()){
               JOptionPane.showMessageDialog(this, "Enter Lecturer Index Number");
        }
        else if(txtLname.getText().isEmpty()){
               JOptionPane.showMessageDialog(this, "Enter Lecturer Name");
        }
        else if(txtAddress.getText().isEmpty()){
               JOptionPane.showMessageDialog(this, "Enter Lecturer Address");
        }
        else if(txtAge.getText().isEmpty()){
               JOptionPane.showMessageDialog(this, "Enter Lecturer Age");
        }
        else if(txtGender.getSelectedIndex() == 0){
             JOptionPane.showMessageDialog(this, "Select Gender");
        }
        else if(txtQulification.getSelectedIndex() == 0){
             JOptionPane.showMessageDialog(this, "Enter Qualification");
        }
        else if(txtDepartment.getSelectedIndex() == 0){
             JOptionPane.showMessageDialog(this, "Select Lecturer Department");
        }
        else if(txtExperience.getText().isEmpty()){
             JOptionPane.showMessageDialog(this, "Select Lecturer Working Experience");
        }
        else if(txtPhone.getText().isEmpty()){
               JOptionPane.showMessageDialog(this, "Enter Lecturer Contact Number");
        }
        else{
        
            String index = txtIndexNo.getText();
            String name = txtLname.getText();
            String address = txtAddress.getText();
            int age = Integer.parseInt(txtAge.getText());  
            String gender = txtGender.getSelectedItem().toString();
            String qualification = txtQulification.getSelectedItem().toString();
            String department = txtDepartment.getSelectedItem().toString();
            int experience = Integer.parseInt(txtExperience.getText());
            int phone = Integer.parseInt(txtPhone.getText());
            
            try {
                String sql = "Insert into managelecturer(IndexNo, name, address, age, gender, qualification, department, experience, phone)values(?, ?, ?, ?, ?, ?, ?, ?, ?)";
                PreparedStatement ps = con.prepareStatement(sql);
                ps.setString(1, index);
                ps.setString(2, name);
                ps.setString(3, address);
                ps.setInt(4, age);
                ps.setString(5, gender);
                ps.setString(6, qualification);
                ps.setString(7, department);
                ps.setInt(8, experience);
                ps.setInt(9, phone);
                
                ps.executeUpdate();
                
            } catch (Exception e) {
                 e.printStackTrace();
            }
            
               JOptionPane.showMessageDialog(this,"Lecturer Registor Succesfuly","INFOR",JOptionPane.INFORMATION_MESSAGE);
               
               SearchDepartment();

               txtIndexNo.setText("");
               txtLname.setText("");
               txtAddress.setText("");
               txtAge.setText("");
               txtGender.setSelectedIndex(0);
               txtQulification.setSelectedIndex(0);
               txtDepartment.setSelectedIndex(0); 
               txtExperience.setText("");     
               txtPhone.setText("");   
           
        }
    }//GEN-LAST:event_btnAddActionPerformed

    private void txtSearchActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtSearchActionPerformed
      
        SearchDepartment();
        
    }//GEN-LAST:event_txtSearchActionPerformed

    private void btnUpdateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnUpdateActionPerformed
                DefaultTableModel Df = (DefaultTableModel)DisplayLecturerTable.getModel();
          int selectedIndex = DisplayLecturerTable.getSelectedRow();
          
         try {
             
          String get_index = Df.getValueAt(selectedIndex, 0).toString();
          String update_name = txtLname.getText();
          String update_address = txtAddress.getText();
          int update_age = Integer.parseInt(txtAge.getText());
          String update_gender = txtGender.getSelectedItem().toString();
          String update_qualification = txtQulification.getSelectedItem().toString();
          String update_department = txtDepartment.getSelectedItem().toString();
          int update_experience = Integer.parseInt(txtExperience.getText());
          int update_phone = Integer.parseInt(txtPhone.getText());
          
        
         String quary = "Update managelecturer set name = ?, address =?, age =?, gender =?, qualification =?, department =?, experience =?, phone =? where IndexNo =?";          
         PreparedStatement preparedStatement = con.prepareStatement(quary);
         preparedStatement.setString(1, update_name);
         preparedStatement.setString(2, update_address);
         preparedStatement.setInt(3, update_age);
         preparedStatement.setString(4, update_gender);
         preparedStatement.setString(5, update_qualification);
         preparedStatement.setString(6, update_department);
         preparedStatement.setInt(7, update_experience);
         preparedStatement.setInt(8, update_phone);
         preparedStatement.setString(9, get_index);
         
         preparedStatement.executeUpdate();
     
        } catch (Exception ex) {
           ex.printStackTrace();
        }

         JOptionPane.showMessageDialog(this,"Record Update Succesfully","INFOR",JOptionPane.INFORMATION_MESSAGE);  
         
         SearchDepartment();
         
         txtIndexNo.setText("");
         txtLname.setText("");
         txtAddress.setText("");
         txtAge.setText("");
         txtGender.setSelectedIndex(0);
         txtQulification.setSelectedIndex(0);
         txtDepartment.setSelectedIndex(0); 
         txtExperience.setText("");     
         txtPhone.setText("");   
             
    }//GEN-LAST:event_btnUpdateActionPerformed

    private void DisplayLecturerTableMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_DisplayLecturerTableMouseClicked
           DefaultTableModel Df = (DefaultTableModel)DisplayLecturerTable.getModel();
          int selectedIndex = DisplayLecturerTable.getSelectedRow();
          
          txtIndexNo.setText(Df.getValueAt(selectedIndex,0).toString());
          
          txtLname.setText(Df.getValueAt(selectedIndex,1).toString());
          
          txtAddress.setText(Df.getValueAt(selectedIndex,2).toString());
          
          txtAge.setText(Df.getValueAt(selectedIndex, 3).toString());
          
          String select_gender = Df.getValueAt(selectedIndex,4).toString();
              switch (select_gender) {
            case "Male":
                txtGender.setSelectedIndex(1);
                break;
            case "Female":
                txtGender.setSelectedIndex(2);
                break;
            default:
                throw new AssertionError();        
           }
                
         String select_qualification = Df.getValueAt(selectedIndex,5).toString();
            switch (select_qualification) {
            case "Master":
                txtQulification.setSelectedIndex(1);
                break;
            case "PHD":
                txtQulification.setSelectedIndex(2);
                break;
            default:
                throw new AssertionError();
        }
          
         String select_deparment = Df.getValueAt(selectedIndex,6).toString();
            switch (select_deparment) {
            case "School of Computing":
                txtDepartment.setSelectedIndex(1);
                break;
            case "School of Business":
                txtDepartment.setSelectedIndex(2);
                break;
            default:
                throw new AssertionError();
        }     
            
          txtExperience.setText(Df.getValueAt(selectedIndex,7).toString());
            
          txtPhone.setText(Df.getValueAt(selectedIndex,8).toString());
    }//GEN-LAST:event_DisplayLecturerTableMouseClicked

    private void txtSearchLecActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtSearchLecActionPerformed
        
    }//GEN-LAST:event_txtSearchLecActionPerformed

    private void txtSearchLecKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtSearchLecKeyReleased
        String searchString = txtSearchLec.getText();
        Search_Using_Name(searchString);
    }//GEN-LAST:event_txtSearchLecKeyReleased

    private void btnDeleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDeleteActionPerformed
        DefaultTableModel Df = (DefaultTableModel)DisplayLecturerTable.getModel();
        int selectedIndex = DisplayLecturerTable.getSelectedRow();
        
         try {
             
          String index = Df.getValueAt(selectedIndex, 0).toString();
          
          int dialogResult = JOptionPane.showConfirmDialog(null, "Do you want to delete the record","Warning",JOptionPane.YES_NO_OPTION);
          
          if(dialogResult == JOptionPane.YES_OPTION){
              
         String quary = "Delete from managelecturer where IndexNo =?";          
         PreparedStatement preparedStatement = con.prepareStatement(quary);

         preparedStatement.setString(1, index);

         preparedStatement.executeUpdate();
                   
          }           
        } 
        catch (Exception ex) {
            ex.printStackTrace();
        } 

         JOptionPane.showMessageDialog(this,"Record Deleted","INFOR",JOptionPane.INFORMATION_MESSAGE);      

         SearchDepartment();
         
         txtIndexNo.setText("");
         txtLname.setText("");
         txtAddress.setText("");
         txtAge.setText("");
         txtGender.setSelectedIndex(0);
         txtQulification.setSelectedIndex(0);
         txtDepartment.setSelectedIndex(0); 
         txtExperience.setText("");     
         txtPhone.setText("");   
    }//GEN-LAST:event_btnDeleteActionPerformed

    public void SearchDepartment(){
          try {
          
        int getdep = txtSearch.getSelectedIndex();
        int c;
        String dep;
        switch (getdep) {
            case 1:
                dep = "School of Computing";
                break;
            case 2:
                dep = "School of Business";
                break;
            default:
               // JOptionPane.showMessageDialog(this, "Select Depaertment");
                dep = "";
                break;
        }
                         
         String quary = "Select * from managelecturer where department = ?";          
         PreparedStatement preparedStatement = con.prepareStatement(quary);
         preparedStatement.setString(1, dep);
         ResultSet rs = preparedStatement.executeQuery();

         ResultSetMetaData Rss = (ResultSetMetaData) rs.getMetaData();
         c = Rss.getColumnCount();
         
         DefaultTableModel Df = (DefaultTableModel)DisplayLecturerTable.getModel();
         Df.setRowCount(0);
         
         while(rs.next())
         {
           Vector v2 = new Vector();
           
           for(int a=1; a<=c; a++){
               v2.add(rs.getString("IndexNo"));
               v2.add(rs.getString("name"));
               v2.add(rs.getString("Address"));
               v2.add(rs.getInt("age"));
               v2.add(rs.getString("gender"));
               v2.add(rs.getString("qualification"));
               v2.add(rs.getString("department"));
               v2.add(rs.getInt("experience"));
               v2.add(rs.getInt("phone"));
           }
           
           Df.addRow(v2);
             
         }
      
        } catch (Exception ex) {
            ex.printStackTrace();
        }  
    }
    
    public void Search_Using_Name(String str){
           DefaultTableModel Df = (DefaultTableModel)DisplayLecturerTable.getModel();
           TableRowSorter<DefaultTableModel> trs = new TableRowSorter<>(Df);
           DisplayLecturerTable.setRowSorter(trs);
           trs.setRowFilter(RowFilter.regexFilter(str));
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
            java.util.logging.Logger.getLogger(ManageLecturer.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ManageLecturer.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ManageLecturer.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ManageLecturer.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ManageLecturer().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private rojeru_san.complementos.RSTableMetro DisplayLecturerTable;
    private javax.swing.JButton btnAdd;
    private javax.swing.JButton btnDelete;
    private javax.swing.JButton btnUpdate;
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
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel22;
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
    private javax.swing.JComboBox<String> txtDepartment;
    private app.bolivia.swing.JCTextField txtExperience;
    private javax.swing.JComboBox<String> txtGender;
    private app.bolivia.swing.JCTextField txtIndexNo;
    private app.bolivia.swing.JCTextField txtLname;
    private app.bolivia.swing.JCTextField txtPhone;
    private javax.swing.JComboBox<String> txtQulification;
    private javax.swing.JComboBox<String> txtSearch;
    private app.bolivia.swing.JCTextField txtSearchLec;
    // End of variables declaration//GEN-END:variables
}
