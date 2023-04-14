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
import java.util.ArrayList;
import java.util.Vector;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author mahel
 */
public class ManageExamResult extends javax.swing.JFrame {

    /**
     * Creates new form ManageExamResult
     */
    public ManageExamResult() {
        initComponents();
    }

    
     Connection con = (Connection)DBConnection.getConnection();

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        selectdep = new rojerusan.RSComboMetro();
        selectProgramme = new rojerusan.RSComboMetro();
        lblBack = new javax.swing.JLabel();
        txtStuIndex = new app.bolivia.swing.JCTextField();
        btnAdd = new javax.swing.JButton();
        jLabel21 = new javax.swing.JLabel();
        jLabel22 = new javax.swing.JLabel();
        jLabel23 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        lblCansel = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        lblModule3 = new javax.swing.JLabel();
        lblModule2 = new javax.swing.JLabel();
        lblModule1 = new javax.swing.JLabel();
        txtModule3 = new javax.swing.JTextField();
        txtModule1 = new javax.swing.JTextField();
        txtModule2 = new javax.swing.JTextField();
        lblModule4 = new javax.swing.JLabel();
        txtModule4 = new javax.swing.JTextField();
        lblModule5 = new javax.swing.JLabel();
        txtModule5 = new javax.swing.JTextField();
        lblModule6 = new javax.swing.JLabel();
        txtModule6 = new javax.swing.JTextField();
        txtModule9 = new javax.swing.JTextField();
        lblModule9 = new javax.swing.JLabel();
        txtModule8 = new javax.swing.JTextField();
        lblModule8 = new javax.swing.JLabel();
        txtModule7 = new javax.swing.JTextField();
        lblModule7 = new javax.swing.JLabel();
        txtCw1 = new javax.swing.JTextField();
        txtCw2 = new javax.swing.JTextField();
        txtCw3 = new javax.swing.JTextField();
        txtCw6 = new javax.swing.JTextField();
        txtCw5 = new javax.swing.JTextField();
        txtCw4 = new javax.swing.JTextField();
        txtCw7 = new javax.swing.JTextField();
        txtCw8 = new javax.swing.JTextField();
        txtCw9 = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();
        jLabel18 = new javax.swing.JLabel();
        jLabel19 = new javax.swing.JLabel();
        jLabel20 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        DisplayResultTb = new rojerusan.RSTableMetro();
        lblGrade = new javax.swing.JLabel();
        jLabel25 = new javax.swing.JLabel();
        jLabel26 = new javax.swing.JLabel();
        lblGPA = new javax.swing.JLabel();
        jLabel28 = new javax.swing.JLabel();
        lblGradePoints = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(0, 51, 153));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        selectdep.setForeground(new java.awt.Color(0, 0, 0));
        selectdep.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "SELECT DEPARTMENT", "School of Computing", "School of Business", " " }));
        selectdep.setColorArrow(new java.awt.Color(51, 51, 51));
        selectdep.setColorBorde(new java.awt.Color(255, 153, 51));
        selectdep.setColorFondo(new java.awt.Color(153, 204, 255));
        selectdep.setFont(new java.awt.Font("Segoe UI", 0, 13)); // NOI18N
        selectdep.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                selectdepActionPerformed(evt);
            }
        });
        jPanel1.add(selectdep, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 150, 350, 40));

        selectProgramme.setForeground(new java.awt.Color(0, 0, 0));
        selectProgramme.setColorArrow(new java.awt.Color(51, 51, 51));
        selectProgramme.setColorBorde(new java.awt.Color(255, 153, 0));
        selectProgramme.setColorFondo(new java.awt.Color(255, 204, 204));
        selectProgramme.setFont(new java.awt.Font("Segoe UI", 0, 13)); // NOI18N
        selectProgramme.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                selectProgrammeActionPerformed(evt);
            }
        });
        jPanel1.add(selectProgramme, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 260, 350, 40));

        lblBack.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/arrow-white-back-30.png"))); // NOI18N
        lblBack.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        lblBack.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblBackMouseClicked(evt);
            }
        });
        jPanel1.add(lblBack, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 20, -1, -1));

        txtStuIndex.setBackground(new java.awt.Color(0, 51, 153));
        txtStuIndex.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 2, 0, new java.awt.Color(255, 255, 255)));
        txtStuIndex.setForeground(new java.awt.Color(255, 255, 255));
        txtStuIndex.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        txtStuIndex.setPhColor(new java.awt.Color(255, 255, 255));
        txtStuIndex.setPlaceholder("Enter Student Index Number...");
        jPanel1.add(txtStuIndex, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 390, 350, 30));

        btnAdd.setBackground(new java.awt.Color(255, 51, 51));
        btnAdd.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        btnAdd.setForeground(new java.awt.Color(255, 255, 255));
        btnAdd.setText("ADD / UPDATE");
        btnAdd.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAddActionPerformed(evt);
            }
        });
        jPanel1.add(btnAdd, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 510, 290, 40));

        jLabel21.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        jLabel21.setForeground(new java.awt.Color(255, 255, 255));
        jLabel21.setText(" Programme ");
        jPanel1.add(jLabel21, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 230, -1, 20));

        jLabel22.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        jLabel22.setForeground(new java.awt.Color(255, 255, 255));
        jLabel22.setText(" Department");
        jPanel1.add(jLabel22, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 110, -1, 20));

        jLabel23.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        jLabel23.setForeground(new java.awt.Color(255, 255, 255));
        jLabel23.setText(" Student Index Number ");
        jPanel1.add(jLabel23, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 350, -1, 20));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 450, 790));

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
        jPanel2.add(lblCansel, new org.netbeans.lib.awtextra.AbsoluteConstraints(1000, 10, -1, -1));

        jLabel1.setFont(new java.awt.Font("Segoe UI", 0, 22)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 204, 51));
        jLabel1.setText("Manage Exam Result");
        jPanel2.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 30, -1, -1));

        jPanel3.setBackground(new java.awt.Color(102, 51, 255));

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 5, Short.MAX_VALUE)
        );

        jPanel2.add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 60, 270, 5));

        lblModule3.setBackground(new java.awt.Color(255, 255, 153));
        lblModule3.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        lblModule3.setForeground(new java.awt.Color(153, 0, 153));
        jPanel2.add(lblModule3, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 290, 280, 30));

        lblModule2.setBackground(new java.awt.Color(255, 255, 102));
        lblModule2.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        lblModule2.setForeground(new java.awt.Color(153, 0, 153));
        jPanel2.add(lblModule2, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 220, 280, 30));

        lblModule1.setBackground(new java.awt.Color(255, 255, 102));
        lblModule1.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        lblModule1.setForeground(new java.awt.Color(153, 0, 153));
        jPanel2.add(lblModule1, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 150, 280, 30));

        txtModule3.setForeground(new java.awt.Color(255, 0, 51));
        jPanel2.add(txtModule3, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 320, 80, 30));

        txtModule1.setForeground(new java.awt.Color(255, 0, 51));
        jPanel2.add(txtModule1, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 180, 80, 30));

        txtModule2.setForeground(new java.awt.Color(255, 0, 51));
        jPanel2.add(txtModule2, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 250, 80, 30));

        lblModule4.setBackground(new java.awt.Color(255, 255, 102));
        lblModule4.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        lblModule4.setForeground(new java.awt.Color(153, 0, 153));
        jPanel2.add(lblModule4, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 150, 280, 30));

        txtModule4.setForeground(new java.awt.Color(255, 0, 51));
        jPanel2.add(txtModule4, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 180, 80, 30));

        lblModule5.setBackground(new java.awt.Color(255, 255, 102));
        lblModule5.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        lblModule5.setForeground(new java.awt.Color(153, 0, 153));
        jPanel2.add(lblModule5, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 220, 280, 30));

        txtModule5.setForeground(new java.awt.Color(255, 0, 51));
        jPanel2.add(txtModule5, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 250, 80, 30));

        lblModule6.setBackground(new java.awt.Color(255, 255, 153));
        lblModule6.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        lblModule6.setForeground(new java.awt.Color(153, 0, 153));
        jPanel2.add(lblModule6, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 290, 280, 30));

        txtModule6.setForeground(new java.awt.Color(255, 0, 51));
        jPanel2.add(txtModule6, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 320, 80, 30));

        txtModule9.setForeground(new java.awt.Color(255, 0, 51));
        jPanel2.add(txtModule9, new org.netbeans.lib.awtextra.AbsoluteConstraints(740, 320, 80, 30));

        lblModule9.setBackground(new java.awt.Color(255, 255, 153));
        lblModule9.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        lblModule9.setForeground(new java.awt.Color(153, 0, 153));
        jPanel2.add(lblModule9, new org.netbeans.lib.awtextra.AbsoluteConstraints(740, 290, 280, 30));

        txtModule8.setForeground(new java.awt.Color(255, 0, 51));
        jPanel2.add(txtModule8, new org.netbeans.lib.awtextra.AbsoluteConstraints(740, 250, 80, 30));

        lblModule8.setBackground(new java.awt.Color(255, 255, 102));
        lblModule8.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        lblModule8.setForeground(new java.awt.Color(153, 0, 153));
        jPanel2.add(lblModule8, new org.netbeans.lib.awtextra.AbsoluteConstraints(740, 220, 280, 30));

        txtModule7.setForeground(new java.awt.Color(255, 0, 51));
        jPanel2.add(txtModule7, new org.netbeans.lib.awtextra.AbsoluteConstraints(740, 180, 80, 30));

        lblModule7.setBackground(new java.awt.Color(255, 255, 102));
        lblModule7.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        lblModule7.setForeground(new java.awt.Color(153, 0, 153));
        jPanel2.add(lblModule7, new org.netbeans.lib.awtextra.AbsoluteConstraints(740, 150, 280, 30));

        txtCw1.setForeground(new java.awt.Color(255, 0, 51));
        jPanel2.add(txtCw1, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 180, 80, 30));

        txtCw2.setForeground(new java.awt.Color(255, 0, 51));
        jPanel2.add(txtCw2, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 250, 80, 30));

        txtCw3.setForeground(new java.awt.Color(255, 0, 51));
        jPanel2.add(txtCw3, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 320, 80, 30));

        txtCw6.setForeground(new java.awt.Color(255, 0, 51));
        jPanel2.add(txtCw6, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, 320, 80, 30));

        txtCw5.setForeground(new java.awt.Color(255, 0, 51));
        jPanel2.add(txtCw5, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, 250, 80, 30));

        txtCw4.setForeground(new java.awt.Color(255, 0, 51));
        jPanel2.add(txtCw4, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, 180, 80, 30));

        txtCw7.setForeground(new java.awt.Color(255, 0, 51));
        jPanel2.add(txtCw7, new org.netbeans.lib.awtextra.AbsoluteConstraints(880, 180, 80, 30));

        txtCw8.setForeground(new java.awt.Color(255, 0, 51));
        jPanel2.add(txtCw8, new org.netbeans.lib.awtextra.AbsoluteConstraints(880, 250, 80, 30));

        txtCw9.setForeground(new java.awt.Color(255, 0, 51));
        jPanel2.add(txtCw9, new org.netbeans.lib.awtextra.AbsoluteConstraints(880, 320, 80, 30));

        jLabel2.setFont(new java.awt.Font("Segoe UI", 0, 13)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(153, 153, 153));
        jLabel2.setText("CW");
        jPanel2.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 320, -1, 30));

        jLabel3.setFont(new java.awt.Font("Segoe UI", 0, 13)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(153, 153, 153));
        jLabel3.setText("CW");
        jPanel2.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 180, -1, 30));

        jLabel4.setFont(new java.awt.Font("Segoe UI", 0, 13)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(153, 153, 153));
        jLabel4.setText("CW");
        jPanel2.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 250, -1, 30));

        jLabel5.setFont(new java.awt.Font("Segoe UI", 0, 13)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(153, 153, 153));
        jLabel5.setText("Exam ");
        jPanel2.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 180, -1, 30));

        jLabel6.setFont(new java.awt.Font("Segoe UI", 0, 13)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(153, 153, 153));
        jLabel6.setText("Exam ");
        jPanel2.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 250, -1, 30));

        jLabel7.setFont(new java.awt.Font("Segoe UI", 0, 13)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(153, 153, 153));
        jLabel7.setText("Exam ");
        jPanel2.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 320, -1, 30));

        jLabel8.setFont(new java.awt.Font("Segoe UI", 0, 13)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(153, 153, 153));
        jLabel8.setText("Exam ");
        jPanel2.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 180, -1, 30));

        jLabel9.setFont(new java.awt.Font("Segoe UI", 0, 13)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(153, 153, 153));
        jLabel9.setText("Exam ");
        jPanel2.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 250, -1, 30));

        jLabel10.setFont(new java.awt.Font("Segoe UI", 0, 13)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(153, 153, 153));
        jLabel10.setText("Exam ");
        jPanel2.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 320, -1, 30));

        jLabel11.setFont(new java.awt.Font("Segoe UI", 0, 13)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(153, 153, 153));
        jLabel11.setText("CW");
        jPanel2.add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(850, 180, 30, 30));

        jLabel12.setFont(new java.awt.Font("Segoe UI", 0, 13)); // NOI18N
        jLabel12.setForeground(new java.awt.Color(153, 153, 153));
        jLabel12.setText("CW");
        jPanel2.add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(850, 250, 30, 30));

        jLabel13.setFont(new java.awt.Font("Segoe UI", 0, 13)); // NOI18N
        jLabel13.setForeground(new java.awt.Color(153, 153, 153));
        jLabel13.setText("CW");
        jPanel2.add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(850, 320, 30, 30));

        jLabel14.setFont(new java.awt.Font("Segoe UI", 0, 13)); // NOI18N
        jLabel14.setForeground(new java.awt.Color(153, 153, 153));
        jLabel14.setText("Exam ");
        jPanel2.add(jLabel14, new org.netbeans.lib.awtextra.AbsoluteConstraints(690, 320, -1, 30));

        jLabel15.setFont(new java.awt.Font("Segoe UI", 0, 13)); // NOI18N
        jLabel15.setForeground(new java.awt.Color(153, 153, 153));
        jLabel15.setText("Exam ");
        jPanel2.add(jLabel15, new org.netbeans.lib.awtextra.AbsoluteConstraints(690, 250, -1, 30));

        jLabel16.setFont(new java.awt.Font("Segoe UI", 0, 13)); // NOI18N
        jLabel16.setForeground(new java.awt.Color(153, 153, 153));
        jLabel16.setText("Exam ");
        jPanel2.add(jLabel16, new org.netbeans.lib.awtextra.AbsoluteConstraints(690, 180, -1, 30));

        jLabel17.setFont(new java.awt.Font("Segoe UI", 0, 13)); // NOI18N
        jLabel17.setForeground(new java.awt.Color(153, 153, 153));
        jLabel17.setText("CW");
        jPanel2.add(jLabel17, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 320, 30, 30));

        jLabel18.setFont(new java.awt.Font("Segoe UI", 0, 13)); // NOI18N
        jLabel18.setForeground(new java.awt.Color(153, 153, 153));
        jLabel18.setText("CW");
        jPanel2.add(jLabel18, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 250, 30, 30));

        jLabel19.setFont(new java.awt.Font("Segoe UI", 0, 13)); // NOI18N
        jLabel19.setForeground(new java.awt.Color(153, 153, 153));
        jLabel19.setText("CW");
        jPanel2.add(jLabel19, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 180, 30, 30));

        jLabel20.setFont(new java.awt.Font("Segoe UI", 0, 17)); // NOI18N
        jLabel20.setForeground(new java.awt.Color(0, 153, 153));
        jLabel20.setText("Enter Modules Grade");
        jPanel2.add(jLabel20, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 90, 160, -1));

        DisplayResultTb.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {"", null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Stundent Index", "Total Grade Points", "Final GPA", "Final Grade"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.Double.class, java.lang.Double.class, java.lang.String.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        DisplayResultTb.setColorBackgoundHead(new java.awt.Color(102, 102, 255));
        DisplayResultTb.setColorBordeFilas(new java.awt.Color(102, 102, 102));
        DisplayResultTb.setColorBordeHead(new java.awt.Color(102, 102, 102));
        DisplayResultTb.setColorSelBackgound(new java.awt.Color(255, 51, 51));
        DisplayResultTb.setFuenteFilas(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        DisplayResultTb.setFuenteFilasSelect(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        DisplayResultTb.setFuenteHead(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        DisplayResultTb.setRowHeight(40);
        DisplayResultTb.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                DisplayResultTbMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(DisplayResultTb);

        jPanel2.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 500, 830, 240));

        lblGrade.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jPanel2.add(lblGrade, new org.netbeans.lib.awtextra.AbsoluteConstraints(770, 410, 90, 30));

        jLabel25.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel25.setText("Grade :");
        jPanel2.add(jLabel25, new org.netbeans.lib.awtextra.AbsoluteConstraints(700, 410, 70, -1));

        jLabel26.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel26.setText("Final GPA :");
        jPanel2.add(jLabel26, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 410, 90, -1));

        lblGPA.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jPanel2.add(lblGPA, new org.netbeans.lib.awtextra.AbsoluteConstraints(580, 410, 50, 30));

        jLabel28.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel28.setText("Total Grade Points :");
        jPanel2.add(jLabel28, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 410, 170, -1));

        lblGradePoints.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jPanel2.add(lblGradePoints, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 410, 110, 30));

        getContentPane().add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 0, 1040, 790));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void selectdepActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_selectdepActionPerformed
      
        if(selectdep.getSelectedItem().equals("School of Computing")){
              selectProgramme.removeAllItems();
              selectProgramme.setSelectedItem(null);
              selectProgramme.addItem("Select Programme");
              selectProgramme.addItem("Computer System Design");
              selectProgramme.addItem("Software Engineering");
        }
        else if(selectdep.getSelectedItem().equals("School of Business")){
               selectProgramme.removeAllItems();
               selectProgramme.setSelectedItem(null);
               selectProgramme.addItem("Select Programme");
               selectProgramme.addItem("Event Managment");
               selectProgramme.addItem("Digital Marketing");
        }
        else if(selectdep.getSelectedItem().equals("SELECT DEPARTMENT")){
               selectProgramme.removeAllItems();
        }
    }//GEN-LAST:event_selectdepActionPerformed

    private void lblBackMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblBackMouseClicked
        LecturerDashboard ld = new LecturerDashboard();
        ld.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_lblBackMouseClicked

    private void lblCanselMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblCanselMouseClicked
        System.exit(0);
    }//GEN-LAST:event_lblCanselMouseClicked

    private void selectProgrammeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_selectProgrammeActionPerformed
         
        
        ArrayList<String> dscd = new ArrayList<String>();
        dscd.add("Introduction to Computer Science");
        dscd.add("WAD");
        dscd.add("Mathematics for Computing");
        dscd.add("Database Managment System");
        dscd.add("GUI");
        dscd.add("Introduction to IOT");
        dscd.add("Networking Fundamental");
        dscd.add("Programming Fundamental");
        dscd.add("EAD");
        
        ArrayList<String> dse = new ArrayList<String>();
        dse.add("Introduction to Computer Science");
        dse.add("WAD");
        dse.add("Mathematics for Computing");
        dse.add("Database Managment System");
        dse.add("GUI");
        dse.add("JAVA Fundamentals");
        dse.add("Networking Fundamentals");
        dse.add("C++ Fundamentals");
        dse.add("EAD");

        
        
        int getDep = selectdep.getSelectedIndex();
       if(getDep == 1){
          if(selectProgramme.getSelectedIndex() == 1){
              lblModule1.setText(dscd.get(0));
              lblModule2.setText(dscd.get(1));
              lblModule3.setText(dscd.get(2));
              lblModule4.setText(dscd.get(3));
              lblModule5.setText(dscd.get(4));
              lblModule6.setText(dscd.get(5));
              lblModule7.setText(dscd.get(6));
              lblModule8.setText(dscd.get(7));
              lblModule9.setText(dscd.get(8));
                  
              /*
              lblModule1.setText("Introduction to Computer Science");
              lblModule2.setText("WAD");
              lblModule3.setText("Mathematics for Computing");
              lblModule4.setText("Database Managment System");
              lblModule5.setText("GUI");
              lblModule6.setText("Introduction to IOT");
              lblModule7.setText("Networking Fundamentals");
              lblModule8.setText("Programming Fundamentals");
              lblModule9.setText("EAD");*/
          }
          else if(selectProgramme.getSelectedIndex() == 2){
              lblModule1.setText(dse.get(0));
              lblModule2.setText(dse.get(1));
              lblModule3.setText(dse.get(2));
              lblModule4.setText(dse.get(3));
              lblModule5.setText(dse.get(4));
              lblModule6.setText(dse.get(5));
              lblModule7.setText(dse.get(6));
              lblModule8.setText(dse.get(7));
              lblModule9.setText(dse.get(8));
          }
        }
       else if(getDep == 2){
            if(selectProgramme.getSelectedIndex() == 1){
              lblModule1.setText("Introduction to Event");
              lblModule2.setText("Event Planning");
              lblModule3.setText("Procrement Management");
              lblModule4.setText("Managing People");
              lblModule5.setText("Event Marketing and Client Management");
              lblModule6.setText("Project Managment");
              lblModule7.setText(" Supplier Networking");
              lblModule8.setText("The legal aspect of Event Management");
              lblModule9.setText("Business Communication");    
            }
            else if(selectProgramme.getSelectedIndex() == 2){
              lblModule1.setText("Search Engine Optimization(SEO)");
              lblModule2.setText("Social Media Marketing");
              lblModule3.setText("Inbound Marketing");
              lblModule4.setText("Search Engine Marketing");
              lblModule5.setText("Email Marketing");
              lblModule6.setText("Affiliate Marketing");
              lblModule7.setText("Mobile Marketing");
              lblModule8.setText("Web Analytics");
              lblModule9.setText("Business Communication");    
            } 
        }
       
        Search();
           
    }//GEN-LAST:event_selectProgrammeActionPerformed

    private void btnAddActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAddActionPerformed
            
        try {
          String getstuIndex = txtStuIndex.getText();
        int module1 = Integer.parseInt( txtModule1.getText());
        int cw1 = Integer.parseInt( txtModule1.getText());
        int tot_module1 = module1 + cw1;

            
        
        
        
        
        int module2 = Integer.parseInt( txtModule2.getText());
        int cw2 = Integer.parseInt( txtCw2.getText());
        int tot_module2 = module2 + cw2;
        
        int module3 = Integer.parseInt( txtModule3.getText());
        int cw3 = Integer.parseInt( txtCw3.getText());
        int tot_module3 = module3 + cw3;
        
        int module4 = Integer.parseInt( txtModule4.getText());
        int cw4 = Integer.parseInt( txtCw4.getText());
        int tot_module4 = module4 + cw4;
        
        int module5 = Integer.parseInt( txtModule5.getText());
        int cw5 = Integer.parseInt( txtCw5.getText());
        int tot_module5 = module5 + cw5;
        
        int module6 = Integer.parseInt( txtModule6.getText());
        int cw6 = Integer.parseInt( txtCw6.getText());
        int tot_module6 = module6 + cw6;
        
        int module7 = Integer.parseInt( txtModule7.getText());
        int cw7 = Integer.parseInt( txtModule7.getText());
        int tot_module7 = module7 + cw7;
        
        int module8 = Integer.parseInt( txtModule8.getText());
        int cw8 = Integer.parseInt( txtCw8.getText());
        int tot_module8 = module8 + cw8;
        
        int module9 = Integer.parseInt( txtModule9.getText());
        int cw9 = Integer.parseInt( txtCw9.getText());
        int tot_module9 = module9 + cw9;
        
        double grade_point_module1 = 0,grade_point_module2 =0, grade_point_module3 =0, grade_point_module4 =0, grade_point_module5 =0, grade_point_module6 =0,grade_point_module7 =0, grade_point_module8 =0, grade_point_module9=0;
        String dep = selectdep.getSelectedItem().toString();
        String pro = selectProgramme.getSelectedItem().toString();
        String ggg = null ;
         String ggg1 = null ;
          String ggg2  = null;
           String ggg3  = null;
            String ggg4  = null;
             String ggg5  = null;
              String ggg6 = null ;
               String ggg7  = null;
                String ggg8 = null ;
        
        if(tot_module1 >=85 && tot_module1 <= 100){
            grade_point_module1 = 4.0;
            ggg = "A+";
            
        }
        else if(tot_module1 >=70 ){
            grade_point_module1 = 4.0;
            ggg = "A";
        }
        else if(tot_module1 >=65 ){
            grade_point_module1 = 3.7;
            ggg = "B+";
        }
        else if(tot_module1 >=60 ){
            grade_point_module1 = 3.3;
            ggg = "B";
        }
        else if(tot_module1 >=55 ){
            grade_point_module1 = 3.0;
            ggg = "C+";
        }
        else if(tot_module1 >=45 ){
            grade_point_module1 = 2.7;
            ggg = "C";
        }
        else if(tot_module1 >=25 ){
            grade_point_module1 = 2.0;
            ggg = "D";
        }
        else if(tot_module1 >= 15 ){
            grade_point_module1 = 1.3;
            ggg = "E";
        }
        
        if(tot_module2 >=85 && tot_module2 <= 100){
            grade_point_module2 = 4.0;
            ggg1 = "A+";
        }
        else if(tot_module2 >=70 ){
            grade_point_module2 = 4.0;
            ggg1 = "A";
        }
        else if(tot_module2 >=65 ){
            grade_point_module2 = 3.7;
            ggg1 = "+B";
        }
        else if(tot_module2 >=60 ){
            grade_point_module2 = 3.3;
            ggg1 = "B";
        }
        else if(tot_module2 >=55 ){
            grade_point_module2 = 3.0;
            ggg1 = "C+";
        }
        else if(tot_module2 >=45 ){
            grade_point_module2 = 2.7;
            ggg1 = "C";
        }
        else if(tot_module2 >=25 ){
            grade_point_module2 = 2.0;
            ggg1 = "D";
        }
        else if(tot_module2 >= 15 ){
            grade_point_module2 = 1.3;
            ggg1 = "E";
        }
        
        if(tot_module3 >=85 && tot_module3 <= 100){
            grade_point_module3 = 4.0;
            ggg2 = "+A";
        }
        else if(tot_module3 >=70 ){
            grade_point_module3 = 4.0;
            ggg2 = "A";
        }
        else if(tot_module3 >=65 ){
            grade_point_module3 = 3.7;
            ggg2 = "+B";
        }
        else if(tot_module3 >=60 ){
            grade_point_module3 = 3.3;
            ggg2= "B";
        }
        else if(tot_module3 >=55 ){
            grade_point_module3 = 3.0;
            ggg2 = "C+";
        }
        else if(tot_module3 >=45 ){
            grade_point_module3 = 2.7;
            ggg2 = "C";
        }
        else if(tot_module3 >=25 ){
            grade_point_module3 = 2.0;
            ggg2 = "D";
        }
        else if(tot_module3 >= 15 ){
            grade_point_module3 = 1.3;
            ggg2 = "E";
        }
                
        if(tot_module4 >=85 && tot_module4 <= 100){
            grade_point_module4 = 4.0;
            ggg3 = "+A";
        }
        else if(tot_module4 >=70 ){
            grade_point_module4 = 4.0;
            ggg3 = "A";
        }
        else if(tot_module4 >=65 ){
            grade_point_module4 = 3.7;
            ggg3 = "+B";
        }
        else if(tot_module4 >=60 ){
            grade_point_module4 = 3.3;
            ggg3 = "+B";
            
        }
        else if(tot_module4 >=55 ){
            grade_point_module4 = 3.0;
            ggg3 = "+C";
        }
        else if(tot_module4 >=45 ){
            grade_point_module4 = 2.7;
            ggg3 = "C";
        }
        else if(tot_module4 >=25 ){
            grade_point_module4 = 2.0;
            ggg3 = "D";
        }
        else if(tot_module4 >= 15 ){
            grade_point_module4 = 1.3;
            ggg3 = "E";
        }
                
        if(tot_module5 >=85 && tot_module5 <= 100){
            grade_point_module5 = 4.0;
            ggg4 = "+A";
        }
        else if(tot_module5 >=70 ){
            grade_point_module5 = 4.0;
                        ggg4 = "A";
        }
        else if(tot_module5 >=65 ){
            grade_point_module5 = 3.7;
                      ggg4 = "+B";
        }
        else if(tot_module5 >=60 ){
            grade_point_module5 = 3.3;
                        ggg4 = "B";
        }
        else if(tot_module5 >=55 ){
            grade_point_module5 = 3.0;
                        ggg4 = "+C";
        }
        else if(tot_module5 >=45 ){
            grade_point_module5 = 2.7;
                        ggg4 = "C";
        }
        else if(tot_module1 >=25 ){
            grade_point_module5 = 2.0;
                        ggg4 = "D";
        }
        else if(tot_module5 >= 15 ){
            grade_point_module5 = 1.3;
                        ggg4 = "E";
        }
                
        if(tot_module6 >=85 && tot_module6 <= 100){
            grade_point_module6 = 4.0;
            ggg5 = "+A";
        }
        else if(tot_module6 >=70 ){
            grade_point_module6 = 4.0;
             ggg5 = "A";
        }
        else if(tot_module6 >=65 ){
            grade_point_module6 = 3.7;
             ggg5 = "+B";
        }
        else if(tot_module6 >=60 ){
            grade_point_module6 = 3.3;
             ggg5 = "B";
        }
        else if(tot_module6 >=55 ){
            grade_point_module6 = 3.0;
             ggg5 = "+C";
        }
        else if(tot_module6 >=45 ){
            grade_point_module6 = 2.7;
             ggg5 = "C";
        }
        else if(tot_module6 >=25 ){
            grade_point_module6 = 2.0;
             ggg5 = "D";
        }
        else if(tot_module6 >= 15 ){
            grade_point_module6 = 1.3;
             ggg5 = "E";
        }
                
        
        if(tot_module7 >=85 && tot_module7 <= 100){
            grade_point_module7 = 4.0;
            ggg6 = "+A";
        }
        else if(tot_module7 >=70 ){
            grade_point_module7 = 4.0;
            ggg6 = "A";
        }
        else if(tot_module7 >=65 ){
            grade_point_module7 = 3.7;
            ggg6 = "+B";
        }
        else if(tot_module7 >=60 ){
            grade_point_module7 = 3.3;
            ggg6 = "B";
        }
        else if(tot_module7 >=55 ){
            grade_point_module7 = 3.0;
            ggg6 = "+C";
        }
        else if(tot_module7 >=45 ){
            grade_point_module7 = 2.7;
            ggg6 = "C";
        }
        else if(tot_module7 >=25 ){
            grade_point_module7 = 2.0;
            ggg6 = "E";
        }
        else if(tot_module7 >= 15 ){
            grade_point_module7 = 1.3;
            ggg6 = "D";
        }
        
        if(tot_module8 >=85 && tot_module8 <= 100){
            grade_point_module8 = 4.0;
            ggg7 = "+A";
        }
        else if(tot_module8 >=70 ){
            grade_point_module8 = 4.0;
                        ggg7 = "A";
        }
        else if(tot_module8 >=65 ){
            grade_point_module8 = 3.7;
                        ggg7 = "+B";
        }
        else if(tot_module8 >=60 ){
            grade_point_module8 = 3.3;
                        ggg7 = "B";
        }
        else if(tot_module8 >=55 ){
            grade_point_module8 = 3.0;
                        ggg7 = "+C";
        }
        else if(tot_module8 >=45 ){
            grade_point_module8 = 2.7;
                        ggg7 = "C";
        }
        else if(tot_module8 >=25 ){
            grade_point_module8 = 2.0;
                        ggg7 = "D";
        }
        else if(tot_module8 >= 15 ){
            grade_point_module8 = 1.3;
                        ggg7 = "E";
        }
        
        
              
        if(tot_module9 >=85 && tot_module9 <= 100){
            grade_point_module9 = 4.0;
                        ggg8 = "+A";
        }
        else if(tot_module9 >=70 ){
            grade_point_module9 = 4.0;
                                    ggg8 = "A";
        }
        else if(tot_module9 >=65 ){
            grade_point_module9 = 3.7;
                                    ggg8 = "+B";
        }
        else if(tot_module9 >=60 ){
            grade_point_module9 = 3.3;
                                    ggg8 = "B";
        }
        else if(tot_module9 >=55 ){
            grade_point_module9 = 3.0;
                                    ggg8 = "+C";
        }
        else if(tot_module9 >=45 ){
            grade_point_module9 = 2.7;
                                    ggg8 = "C";
        }
        else if(tot_module9 >=25 ){
            grade_point_module9 = 2.0;
            ggg8 ="D";
        }
        else if(tot_module9 >= 15 ){
            grade_point_module9 = 1.3;
            ggg8 = "E";
        }
       
        double totalgradePoints = 35;
        
        double m1 = (grade_point_module1) * 4.0;
        double m2 = (grade_point_module2) * 2.0;
        double m3 = (grade_point_module3) * 4.0;
        double m4 = (grade_point_module4) * 3.0;
        double m5 = (grade_point_module5) * 4.0;
        double m6 = (grade_point_module6) * 4.0;
        double m7 = (grade_point_module7) * 2.0;
        double m8 = (grade_point_module8) * 4.0;
        double m9 = (grade_point_module9) * 4.0;
        
        double totalgradpints = m1 + m2 + m3 + m4 + m5 + m6 + m7 + m8 + m9;
        double finalgpa = totalgradpints/totalgradePoints;
        
        String t = Double.toString(totalgradpints);
        lblGradePoints.setText(t);
        
        String g = Double.toString(finalgpa);
        lblGPA.setText(g);
        
        String grade;
        
        
        if(finalgpa > 3.20 && finalgpa <= 4.0){
            grade = "Distintion";
        }
       
        else if(finalgpa > 2.50 && finalgpa <= 3.19){
            grade = "Pass";
        }
        else{
            grade = "Fail";
        }
        
        lblGrade.setText(grade);
        
        
        String module1_name = lblModule1.getText();
        String module2_name = lblModule2.getText();
        String module3_name = lblModule3.getText();
        String module4_name = lblModule4.getText();
        String module5_name = lblModule5.getText();
        String module6_name = lblModule6.getText();
        String module7_name = lblModule7.getText();
        String module8_name = lblModule8.getText();
        String module9_name = lblModule9.getText();
        
        String quary2 = "Insert into moduleresult values(?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?)";
        PreparedStatement ps = con.prepareStatement(quary2);
                ps.setString(1, getstuIndex);
                ps.setString(2, module1_name);
                ps.setString(3, ggg);
                ps.setString(4, module2_name);
                ps.setString(5, ggg1);
                ps.setString(6, module3_name);
                ps.setString(7, ggg2);
                ps.setString(8, module4_name);
                ps.setString(9, ggg3 );
                ps.setString(10, module5_name);
                ps.setString(11,ggg4);
                ps.setString(12, module6_name);
                ps.setString(13,ggg5 );
                ps.setString(14, module7_name);
                ps.setString(15, ggg6);
                ps.setString(16, module8_name);
                ps.setString(17,ggg7 );
                ps.setString(18, module9_name);
                ps.setString(19, ggg8);
                
                ps.executeUpdate();
        
        
         String quary1 = "Update managestudentsresult set GradePoints =?, GPA =?, FinalGrade =? where IndexNo = ?";
         PreparedStatement pss = con.prepareStatement(quary1);
         pss.setDouble(1,totalgradpints );
         pss.setDouble(2,finalgpa);
         pss.setString(3,grade);
         pss.setString(4, getstuIndex);
         pss.executeUpdate();
         
         Search();
         
         txtModule1.setText("");
         txtModule2.setText("");
         txtModule3.setText("");
         txtModule4.setText("");
         txtModule5.setText("");
         txtModule6.setText("");
         txtModule7.setText("");
         txtModule8.setText("");
         txtModule9.setText("");
         
         txtCw1.setText("");
         txtCw2.setText("");
         txtCw3.setText("");
         txtCw4.setText("");
         txtCw5.setText("");
         txtCw6.setText("");
         txtCw7.setText("");
         txtCw8.setText("");
         txtCw9.setText("");
                                    
        
     }
        catch (Exception e) {
            e.printStackTrace();
        }
        
    }//GEN-LAST:event_btnAddActionPerformed

    private void DisplayResultTbMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_DisplayResultTbMouseClicked
         DefaultTableModel Df = (DefaultTableModel)DisplayResultTb.getModel();
         int selectedIndex = DisplayResultTb.getSelectedRow();
          
          txtStuIndex.setText(Df.getValueAt(selectedIndex,0).toString());
          lblGradePoints.setText(Df.getValueAt(selectedIndex,1).toString());
          lblGPA.setText(Df.getValueAt(selectedIndex,2).toString());
      //    lblGrade.setText(Df.getValueAt(selectedIndex,3).toString());
    }//GEN-LAST:event_DisplayResultTbMouseClicked

    
    public void Search(){
        try {
          
        int getdep = selectdep.getSelectedIndex();
        int c;
        String programme ="";
      
        if(getdep == 1 ){
            if(selectProgramme.getSelectedIndex() == 1){
               programme = "Computer System Design";
            }
            else if(selectProgramme.getSelectedIndex() == 2){
               programme = "Software Engineering";
            }
   
        }
        else if(getdep == 2){
           if(selectProgramme.getSelectedIndex() == 1){
               programme = "Event Managment";
            }
            else if(selectProgramme.getSelectedIndex() == 2){
              programme = "Digital Marketing";
        }     
       }
        
        
         String quary = "Select IndexNo,GradePoints,GPA,FinalGrade from managestudentsresult where Programme = ?";          
         PreparedStatement preparedStatement = con.prepareStatement(quary);
         preparedStatement.setString(1, programme);
         ResultSet rs = preparedStatement.executeQuery();

         ResultSetMetaData Rss = (ResultSetMetaData) rs.getMetaData();
         c = Rss.getColumnCount();
         
         DefaultTableModel Df = (DefaultTableModel)DisplayResultTb.getModel();
         Df.setRowCount(0);
         
         while(rs.next())
         {
           Vector v2 = new Vector();
           
           for(int a=1; a<=c; a++){
               v2.add(rs.getString("IndexNo"));
               v2.add(rs.getDouble("GradePoints"));
               v2.add(rs.getDouble("GPA"));
               v2.add(rs.getString("FinalGrade"));
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
            java.util.logging.Logger.getLogger(ManageExamResult.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ManageExamResult.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ManageExamResult.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ManageExamResult.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ManageExamResult().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private rojerusan.RSTableMetro DisplayResultTb;
    private javax.swing.JButton btnAdd;
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
    private javax.swing.JLabel jLabel23;
    private javax.swing.JLabel jLabel25;
    private javax.swing.JLabel jLabel26;
    private javax.swing.JLabel jLabel28;
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
    private javax.swing.JLabel lblGPA;
    private javax.swing.JLabel lblGrade;
    private javax.swing.JLabel lblGradePoints;
    private javax.swing.JLabel lblModule1;
    private javax.swing.JLabel lblModule2;
    private javax.swing.JLabel lblModule3;
    private javax.swing.JLabel lblModule4;
    private javax.swing.JLabel lblModule5;
    private javax.swing.JLabel lblModule6;
    private javax.swing.JLabel lblModule7;
    private javax.swing.JLabel lblModule8;
    private javax.swing.JLabel lblModule9;
    private rojerusan.RSComboMetro selectProgramme;
    private rojerusan.RSComboMetro selectdep;
    private javax.swing.JTextField txtCw1;
    private javax.swing.JTextField txtCw2;
    private javax.swing.JTextField txtCw3;
    private javax.swing.JTextField txtCw4;
    private javax.swing.JTextField txtCw5;
    private javax.swing.JTextField txtCw6;
    private javax.swing.JTextField txtCw7;
    private javax.swing.JTextField txtCw8;
    private javax.swing.JTextField txtCw9;
    private javax.swing.JTextField txtModule1;
    private javax.swing.JTextField txtModule2;
    private javax.swing.JTextField txtModule3;
    private javax.swing.JTextField txtModule4;
    private javax.swing.JTextField txtModule5;
    private javax.swing.JTextField txtModule6;
    private javax.swing.JTextField txtModule7;
    private javax.swing.JTextField txtModule8;
    private javax.swing.JTextField txtModule9;
    private app.bolivia.swing.JCTextField txtStuIndex;
    // End of variables declaration//GEN-END:variables
}
