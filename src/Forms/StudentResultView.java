/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package Forms;

import com.mysql.cj.jdbc.result.ResultSetMetaData;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Vector;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.table.DefaultTableModel;


public class StudentResultView extends javax.swing.JFrame {

    /**
     * Creates new form StudentResultView
     */
    public StudentResultView() {
        initComponents();
        Display_StudentData();
        DisplayModuleResult();
    }
    
     Connection con = (Connection)DBConnection.getConnection();
    
    
    String index;

    StudentResultView(String string) {
        initComponents();
        this.index = string;
        Display_StudentData();
        DisplayModuleResult();
    }

        private void Display_StudentData(){
        
        int c;
      
        try {
         
         String quary = "Select IndexNo,GradePoints,GPA,FinalGrade from managestudentsresult where IndexNo = ?";          
         PreparedStatement preparedStatement = con.prepareStatement(quary);
         preparedStatement.setString(1, index);
         ResultSet rs = preparedStatement.executeQuery();

         ResultSetMetaData Rss = (ResultSetMetaData) rs.getMetaData();
         c = Rss.getColumnCount();
         
         DefaultTableModel Df = (DefaultTableModel)DisplayStuResult.getModel();
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
    
    
     public  void DisplayModuleResult(){

        try {
            String quary2 = "Select * from moduleresult where IndexNo = '"+index+"'";
            PreparedStatement preparedStatement = con.prepareStatement(quary2);
    //        preparedStatement.setString(1, index);
            ResultSet rs = preparedStatement.executeQuery(quary2);
            
            if(rs.next()){
               String module1 = rs.getString(2);
               String marks1 = rs.getString(3);
                 String module2 = rs.getString(4);
               String marks2 = rs.getString(5);
                 String module3 = rs.getString(6);
               String marks3 = rs.getString(7);
                 String module4 = rs.getString(8);
               String marks4 = rs.getString(9);
                 String module5 = rs.getString(10);
               String marks5 = rs.getString(11);
                 String module6 = rs.getString(12);
               String marks6 = rs.getString(13);
                 String module7 = rs.getString(14);
               String marks7 = rs.getString(15);
                 String module8 = rs.getString(16);
               String marks8 = rs.getString(17);
                 String module9 = rs.getString(18);
               String marks9 = rs.getString(19);
               
               
               lblModuleName1.setText(module1);
               lblModuleMarks1.setText(marks1);
               
               lblModuleName2.setText(module2);
               lblModuleMarks2.setText(marks2);
               
               lblModuleName3.setText(module3);
               lblModuleMarks3.setText(marks3);
               
               lblModuleName4.setText(module4);
               lblModuleMarks4.setText(marks4);
               
               lblModuleName5.setText(module5);
               lblModuleMarks5.setText(marks5);
               
               lblModuleName6.setText(module6);
               lblModuleMarks6.setText(marks6);
               
               lblModuleName7.setText(module7);
               lblModuleMarks7.setText(marks7);
               
               lblModuleName8.setText(module8);
               lblModuleMarks8.setText(marks8);
               
               lblModuleName9.setText(module9);
               lblModuleMarks9.setText(marks9);
            }
            
            
        } catch (SQLException ex) {
            Logger.getLogger(StudentResultView.class.getName()).log(Level.SEVERE, null, ex);
        }
  
     }
        
     
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        lblCansel = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        DisplayStuResult = new rojerusan.RSTableMetro();
        jLabel1 = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        lblBack = new javax.swing.JLabel();
        lblModuleName1 = new javax.swing.JLabel();
        lblModuleMarks1 = new javax.swing.JLabel();
        lblModuleMarks2 = new javax.swing.JLabel();
        lblModuleName2 = new javax.swing.JLabel();
        lblModuleName3 = new javax.swing.JLabel();
        lblModuleMarks3 = new javax.swing.JLabel();
        lblModuleMarks4 = new javax.swing.JLabel();
        lblModuleName4 = new javax.swing.JLabel();
        lblModuleName5 = new javax.swing.JLabel();
        lblModuleMarks5 = new javax.swing.JLabel();
        lblModuleMarks6 = new javax.swing.JLabel();
        lblModuleName6 = new javax.swing.JLabel();
        lblModuleMarks7 = new javax.swing.JLabel();
        lblModuleName7 = new javax.swing.JLabel();
        lblModuleName8 = new javax.swing.JLabel();
        lblModuleMarks8 = new javax.swing.JLabel();
        lblModuleName9 = new javax.swing.JLabel();
        lblModuleMarks9 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        lblCansel.setFont(new java.awt.Font("Segoe UI", 0, 28)); // NOI18N
        lblCansel.setForeground(new java.awt.Color(204, 204, 255));
        lblCansel.setText("X");
        lblCansel.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        lblCansel.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblCanselMouseClicked(evt);
            }
        });
        jPanel1.add(lblCansel, new org.netbeans.lib.awtextra.AbsoluteConstraints(1000, 10, -1, 30));

        jScrollPane1.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N

        DisplayStuResult.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null}
            },
            new String [] {
                "IndexNo", "Grade Points", "GPA", "Final Grade"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.Double.class, java.lang.Double.class, java.lang.Double.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        DisplayStuResult.setColorSelBackgound(new java.awt.Color(255, 51, 51));
        DisplayStuResult.setFuenteFilas(new java.awt.Font("Tahoma", 0, 15)); // NOI18N
        DisplayStuResult.setFuenteFilasSelect(new java.awt.Font("Tahoma", 0, 15)); // NOI18N
        DisplayStuResult.setFuenteHead(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        DisplayStuResult.setRowHeight(50);
        jScrollPane1.setViewportView(DisplayStuResult);

        jPanel1.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 440, 750, 240));

        jLabel1.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 0, 0));
        jLabel1.setText("Student Result");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 40, -1, -1));

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

        jPanel1.add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 70, 270, 5));

        lblBack.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/arrow-white-back-30.png"))); // NOI18N
        lblBack.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        lblBack.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblBackMouseClicked(evt);
            }
        });
        jPanel1.add(lblBack, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 10, -1, 30));

        lblModuleName1.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        lblModuleName1.setForeground(new java.awt.Color(153, 204, 255));
        lblModuleName1.setText("jLabel3");
        jPanel1.add(lblModuleName1, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 150, -1, -1));

        lblModuleMarks1.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        lblModuleMarks1.setForeground(new java.awt.Color(255, 255, 255));
        lblModuleMarks1.setText("jLabel4");
        jPanel1.add(lblModuleMarks1, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 150, -1, -1));

        lblModuleMarks2.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        lblModuleMarks2.setForeground(new java.awt.Color(255, 255, 255));
        lblModuleMarks2.setText("jLabel4");
        jPanel1.add(lblModuleMarks2, new org.netbeans.lib.awtextra.AbsoluteConstraints(910, 150, -1, -1));

        lblModuleName2.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        lblModuleName2.setForeground(new java.awt.Color(153, 204, 255));
        lblModuleName2.setText("jLabel3");
        jPanel1.add(lblModuleName2, new org.netbeans.lib.awtextra.AbsoluteConstraints(600, 150, -1, -1));

        lblModuleName3.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        lblModuleName3.setForeground(new java.awt.Color(153, 204, 255));
        lblModuleName3.setText("jLabel3");
        jPanel1.add(lblModuleName3, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 210, -1, -1));

        lblModuleMarks3.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        lblModuleMarks3.setForeground(new java.awt.Color(255, 255, 255));
        lblModuleMarks3.setText("jLabel4");
        jPanel1.add(lblModuleMarks3, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 210, -1, -1));

        lblModuleMarks4.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        lblModuleMarks4.setForeground(new java.awt.Color(255, 255, 255));
        lblModuleMarks4.setText("jLabel4");
        jPanel1.add(lblModuleMarks4, new org.netbeans.lib.awtextra.AbsoluteConstraints(910, 200, -1, -1));

        lblModuleName4.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        lblModuleName4.setForeground(new java.awt.Color(153, 204, 255));
        lblModuleName4.setText("jLabel3");
        jPanel1.add(lblModuleName4, new org.netbeans.lib.awtextra.AbsoluteConstraints(600, 200, -1, -1));

        lblModuleName5.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        lblModuleName5.setForeground(new java.awt.Color(153, 204, 255));
        lblModuleName5.setText("jLabel3");
        jPanel1.add(lblModuleName5, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 270, -1, -1));

        lblModuleMarks5.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        lblModuleMarks5.setForeground(new java.awt.Color(255, 255, 255));
        lblModuleMarks5.setText("jLabel4");
        jPanel1.add(lblModuleMarks5, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 270, -1, -1));

        lblModuleMarks6.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        lblModuleMarks6.setForeground(new java.awt.Color(255, 255, 255));
        lblModuleMarks6.setText("jLabel4");
        jPanel1.add(lblModuleMarks6, new org.netbeans.lib.awtextra.AbsoluteConstraints(910, 260, -1, -1));

        lblModuleName6.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        lblModuleName6.setForeground(new java.awt.Color(153, 204, 255));
        lblModuleName6.setText("jLabel3");
        jPanel1.add(lblModuleName6, new org.netbeans.lib.awtextra.AbsoluteConstraints(600, 260, -1, -1));

        lblModuleMarks7.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        lblModuleMarks7.setForeground(new java.awt.Color(255, 255, 255));
        lblModuleMarks7.setText("jLabel4");
        jPanel1.add(lblModuleMarks7, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 320, -1, -1));

        lblModuleName7.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        lblModuleName7.setForeground(new java.awt.Color(153, 204, 255));
        lblModuleName7.setText("jLabel3");
        jPanel1.add(lblModuleName7, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 320, -1, -1));

        lblModuleName8.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        lblModuleName8.setForeground(new java.awt.Color(153, 204, 255));
        lblModuleName8.setText("jLabel3");
        jPanel1.add(lblModuleName8, new org.netbeans.lib.awtextra.AbsoluteConstraints(600, 320, -1, -1));

        lblModuleMarks8.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        lblModuleMarks8.setForeground(new java.awt.Color(255, 255, 255));
        lblModuleMarks8.setText("jLabel4");
        jPanel1.add(lblModuleMarks8, new org.netbeans.lib.awtextra.AbsoluteConstraints(910, 320, -1, -1));

        lblModuleName9.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        lblModuleName9.setForeground(new java.awt.Color(153, 204, 255));
        lblModuleName9.setText("jLabel3");
        jPanel1.add(lblModuleName9, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 380, -1, -1));

        lblModuleMarks9.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        lblModuleMarks9.setForeground(new java.awt.Color(255, 255, 255));
        lblModuleMarks9.setText("jLabel4");
        jPanel1.add(lblModuleMarks9, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 380, -1, -1));

        jLabel2.setForeground(new java.awt.Color(153, 204, 255));
        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/20221013_095524.jpg"))); // NOI18N
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1030, 700));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 1029, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 702, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void lblBackMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblBackMouseClicked
        StudentLoginPage slp = new StudentLoginPage();
        slp.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_lblBackMouseClicked

    private void lblCanselMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblCanselMouseClicked
        System.exit(0);
    }//GEN-LAST:event_lblCanselMouseClicked

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
            java.util.logging.Logger.getLogger(StudentResultView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(StudentResultView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(StudentResultView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(StudentResultView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new StudentResultView().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private rojerusan.RSTableMetro DisplayStuResult;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lblBack;
    private javax.swing.JLabel lblCansel;
    private javax.swing.JLabel lblModuleMarks1;
    private javax.swing.JLabel lblModuleMarks2;
    private javax.swing.JLabel lblModuleMarks3;
    private javax.swing.JLabel lblModuleMarks4;
    private javax.swing.JLabel lblModuleMarks5;
    private javax.swing.JLabel lblModuleMarks6;
    private javax.swing.JLabel lblModuleMarks7;
    private javax.swing.JLabel lblModuleMarks8;
    private javax.swing.JLabel lblModuleMarks9;
    private javax.swing.JLabel lblModuleName1;
    private javax.swing.JLabel lblModuleName2;
    private javax.swing.JLabel lblModuleName3;
    private javax.swing.JLabel lblModuleName4;
    private javax.swing.JLabel lblModuleName5;
    private javax.swing.JLabel lblModuleName6;
    private javax.swing.JLabel lblModuleName7;
    private javax.swing.JLabel lblModuleName8;
    private javax.swing.JLabel lblModuleName9;
    // End of variables declaration//GEN-END:variables
}
