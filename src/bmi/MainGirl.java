/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package bmi;

import java.awt.Color;
import static java.awt.Color.black;
import static java.awt.Color.red;
import static java.awt.Color.white;
import static java.awt.Color.yellow;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.Vector;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author ALEX ASANTE OBENG
 */
public class MainGirl extends javax.swing.JFrame {

    /**
     * Creates new form MainGirl
     */
    public MainGirl() {
        initComponents();
        
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        javax.swing.JPanel jPanel1 = new javax.swing.JPanel();
        javax.swing.JLabel jLabel1 = new javax.swing.JLabel();
        javax.swing.JPanel jPanel2 = new javax.swing.JPanel();
        javax.swing.JLabel jLabel2 = new javax.swing.JLabel();
        javax.swing.JLabel jLabel3 = new javax.swing.JLabel();
        javax.swing.JLabel jLabel4 = new javax.swing.JLabel();
        javax.swing.JLabel jLabel5 = new javax.swing.JLabel();
        txtGender = new javax.swing.JTextField();
        txtName = new javax.swing.JTextField();
        txtHeight = new javax.swing.JTextField();
        txtAge = new javax.swing.JTextField();
        javax.swing.JButton btnClear = new javax.swing.JButton();
        javax.swing.JButton btnAdd = new javax.swing.JButton();
        javax.swing.JLabel jLabel6 = new javax.swing.JLabel();
        txtWeight = new javax.swing.JTextField();
        javax.swing.JLabel jLabel7 = new javax.swing.JLabel();
        txtBMI = new javax.swing.JTextField();
        javax.swing.JButton btnDelete = new javax.swing.JButton();
        javax.swing.JScrollPane jScrollPane1 = new javax.swing.JScrollPane();
        tableClients = new javax.swing.JTable();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("BMI");
        setMinimumSize(new java.awt.Dimension(920, 596));
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowActivated(java.awt.event.WindowEvent evt) {
                formWindowActivated(evt);
            }
            public void windowClosed(java.awt.event.WindowEvent evt) {
                formWindowClosed(evt);
            }
            public void windowClosing(java.awt.event.WindowEvent evt) {
                formWindowClosing(evt);
            }
            public void windowOpened(java.awt.event.WindowEvent evt) {
                formWindowOpened(evt);
            }
        });

        jPanel1.setBackground(new java.awt.Color(204, 204, 204));

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/bmi/icons8_users_80px_1.png"))); // NOI18N
        jLabel1.setText("List of Patients");

        jPanel2.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Enter Patient Information", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Segoe UI", 1, 18))); // NOI18N
        jPanel2.setOpaque(false);

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/bmi/icons8_name_tag_40px_1.png"))); // NOI18N
        jLabel2.setText("Name");

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/bmi/icons8_toilet_40px.png"))); // NOI18N
        jLabel3.setText("Gender");

        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/bmi/icons8_life_cycle_45px.png"))); // NOI18N
        jLabel4.setText("Age");

        jLabel5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/bmi/icons8_compare_heights_40px.png"))); // NOI18N
        jLabel5.setText("Height(m)");

        txtGender.setText("Enter Gender: Male/Female/Bi-Sexual");
        txtGender.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                txtGenderMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                txtGenderMouseExited(evt);
            }
        });

        txtName.setText("Enter Your Name");
        txtName.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                txtNameMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                txtNameMouseExited(evt);
            }
        });

        txtHeight.setText("Enter Your Height");
        txtHeight.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                txtHeightMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                txtHeightMouseExited(evt);
            }
        });

        txtAge.setText("Enter Your Age");
        txtAge.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                txtAgeMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                txtAgeMouseExited(evt);
            }
        });

        btnClear.setIcon(new javax.swing.ImageIcon(getClass().getResource("/bmi/icons8_broom_40px.png"))); // NOI18N
        btnClear.setText("Clear");
        btnClear.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnClearActionPerformed(evt);
            }
        });

        btnAdd.setIcon(new javax.swing.ImageIcon(getClass().getResource("/bmi/icons8_add_user_group_woman_man_40px_1.png"))); // NOI18N
        btnAdd.setText("Add");
        btnAdd.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnAddMouseEntered(evt);
            }
        });
        btnAdd.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAddActionPerformed(evt);
            }
        });

        jLabel6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/bmi/icons8_laptop_with_cursor_50px.png"))); // NOI18N
        jLabel6.setText("BMI Results");

        txtWeight.setText("Enter Your Weight");
        txtWeight.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                txtWeightMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                txtWeightMouseExited(evt);
            }
        });

        jLabel7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/bmi/icons8_industrial_scales_50px_1.png"))); // NOI18N
        jLabel7.setText("Weight(kg)");

        txtBMI.setText("Enter Your BMI Results");
        txtBMI.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                txtBMIMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                txtBMIMouseExited(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtName, javax.swing.GroupLayout.PREFERRED_SIZE, 331, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtAge, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtGender, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtHeight, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(btnAdd, javax.swing.GroupLayout.PREFERRED_SIZE, 111, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(84, 84, 84)
                                .addComponent(btnClear, javax.swing.GroupLayout.PREFERRED_SIZE, 111, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(txtWeight, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addContainerGap(34, Short.MAX_VALUE))))
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 101, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 153, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 153, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 153, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 106, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtBMI, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 87, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(0, 0, Short.MAX_VALUE))
        );

        jPanel2Layout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {txtAge, txtBMI, txtGender, txtHeight, txtName, txtWeight});

        jPanel2Layout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {btnAdd, btnClear});

        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtName, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel4)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtAge, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel3)
                .addGap(8, 8, 8)
                .addComponent(txtGender, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel5)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtHeight, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel7)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtWeight, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel6)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtBMI, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnClear)
                    .addComponent(btnAdd)))
        );

        jPanel2Layout.linkSize(javax.swing.SwingConstants.VERTICAL, new java.awt.Component[] {txtAge, txtBMI, txtGender, txtHeight, txtName, txtWeight});

        jPanel2Layout.linkSize(javax.swing.SwingConstants.VERTICAL, new java.awt.Component[] {btnAdd, btnClear});

        btnDelete.setIcon(new javax.swing.ImageIcon(getClass().getResource("/bmi/icons8_trash_40px.png"))); // NOI18N
        btnDelete.setText("Delete");
        btnDelete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDeleteActionPerformed(evt);
            }
        });

        tableClients.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        tableClients.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Name", "Age", "Gender", "Height", "Weight", "BMI Results"
            }
        ));
        tableClients.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                tableClientsMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                tableClientsMouseExited(evt);
            }
        });
        jScrollPane1.setViewportView(tableClients);

        jButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/bmi/icons8_exit_40px.png"))); // NOI18N
        jButton1.setText("Exit");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jButton2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/bmi/icons8_save_35px.png"))); // NOI18N
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jButton1))
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 668, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(btnDelete)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(0, 11, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel1)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(9, 9, 9)
                                .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(btnDelete, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jScrollPane1))
                    .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnAddActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAddActionPerformed
        // TODO add your handling code here:
        String name = txtName.getText();
        String age = txtAge.getText();
        String gender = txtGender.getText();
        String height = txtHeight.getText();
        String weight = txtWeight.getText();
        String bmi = txtBMI.getText();
        
        if (name.isEmpty()  || age.isEmpty() || gender.isEmpty()||height.isEmpty()|| weight.isEmpty()||  bmi.isEmpty()){
            JOptionPane.showMessageDialog(this,"Please enter all fields",
                    "Try again", JOptionPane.ERROR_MESSAGE );
        } else {
            DefaultTableModel model = (DefaultTableModel) tableClients.getModel();
            model.addRow(new Object[]{name,age, gender,height, weight, bmi});
            
         txtName.setText("");
         txtAge.setText("");
         txtGender.setText("");
         txtHeight.setText("");
         txtWeight.setText("");
         txtBMI.setText("");
         
        }
        
       
    }//GEN-LAST:event_btnAddActionPerformed

    private void btnClearActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnClearActionPerformed
        // TODO add your handling code here:
        String name = txtName.getText();
        String age = txtAge.getText();
        String gender = txtGender.getText();
        String height = txtHeight.getText();
        String weight = txtWeight.getText();
        String bmi = txtBMI.getText();
        
    if (name.isEmpty()  || age.isEmpty() || gender.isEmpty()||height.isEmpty()|| weight.isEmpty()||  bmi.isEmpty()){
            JOptionPane.showMessageDialog(this,"Please enter all fields",
                    "Try again", JOptionPane.ERROR_MESSAGE );
        } else {
          
         txtName.setText("");
         txtAge.setText("");
         txtGender.setText("");
         txtHeight.setText("");
         txtWeight.setText("");
         txtBMI.setText("");
         
        }
        
    }//GEN-LAST:event_btnClearActionPerformed

    private void btnDeleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDeleteActionPerformed
        // TODO add your handling code here:
          int row =  tableClients.getSelectedRow();
        if (row < 0 )
        {
            JOptionPane.showMessageDialog(this,"No row is selected! Please select one row",
                    "Select row", JOptionPane.ERROR_MESSAGE);
        }else {
            DefaultTableModel model = (DefaultTableModel) tableClients.getModel();
            model.removeRow(row);
            JOptionPane.showMessageDialog(this,"Deleted successfully");
        }
        DefaultTableModel model = (DefaultTableModel) tableClients.getModel();
            Vector <Vector> tableData = model.getDataVector();
            
            
            try {
                FileOutputStream file = new FileOutputStream("file.bin");
                ObjectOutputStream output = new ObjectOutputStream(file);
                
                output.writeObject(tableData);
                output.close();
                file.close();
                
            } catch (Exception ex){
                ex.printStackTrace();
            } 
    }//GEN-LAST:event_btnDeleteActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
     MainGirl.this.setVisible(false);
     MainBoy mainboy = new MainBoy();
     mainboy.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
     mainboy.setVisible(true);

    }//GEN-LAST:event_jButton1ActionPerformed

    private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened
        // TODO add your handling code here:
          try{   
        FileInputStream file = new FileInputStream("file.bin");
         ObjectInputStream input = new ObjectInputStream(file);
     
         Vector<Vector> tableData = (Vector<Vector>)input.readObject();
         input.close();
         file.close();
         
   DefaultTableModel model = (DefaultTableModel) tableClients.getModel();
                for (int i = 0; i < tableData.size(); i++){
                    Vector row = tableData.get(i);
                    model.addRow(new Object[]{row.get(0),row.get(1),row.get(2),row.get(3),row.get(4),row.get(5)});
         
                }
         
    }  catch(Exception ex){
        ex.printStackTrace();
    } 
    }//GEN-LAST:event_formWindowOpened

    private void formWindowClosing(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowClosing
        // TODO add your handling code here:
          DefaultTableModel model = (DefaultTableModel) tableClients.getModel();
            Vector <Vector> tableData = model.getDataVector();
            
            
            try {
                FileOutputStream file = new FileOutputStream("file.bin");
                ObjectOutputStream output = new ObjectOutputStream(file);
                
                output.writeObject(tableData);
                output.close();
                file.close();
                
            } catch (Exception ex){
                ex.printStackTrace();
            }
            
    }//GEN-LAST:event_formWindowClosing

    private void txtGenderMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txtGenderMouseEntered
if("Enter Gender: Male/Female/Bi-Sexual".equals(txtGender.getText())){
            txtGender.setText(""); 
}
// TODO add your handling code here:
    }//GEN-LAST:event_txtGenderMouseEntered

    private void txtGenderMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txtGenderMouseExited
    if("".equals(txtGender.getText())){
            txtGender.setText("Enter Gender: Male/Female/Bi-Sexual");}
                       // TODO add your handling code here:
    }//GEN-LAST:event_txtGenderMouseExited

    private void txtAgeMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txtAgeMouseEntered
     if("Enter Your Age".equals(txtAge.getText())){
            txtAge.setText(""); } 
  // TODO add your handling code here:
    }//GEN-LAST:event_txtAgeMouseEntered

    private void txtAgeMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txtAgeMouseExited
if("".equals(txtAge.getText())){
            txtAge.setText("Enter Your Age"); } 
// TODO add your handling code here:
    }//GEN-LAST:event_txtAgeMouseExited

    private void txtHeightMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txtHeightMouseEntered
if("Enter Your Height".equals(txtHeight.getText())){
            txtHeight.setText(""); } 
;// TODO add your handling code here:
    }//GEN-LAST:event_txtHeightMouseEntered

    private void txtHeightMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txtHeightMouseExited
if("".equals(txtHeight.getText())){
            txtHeight.setText("Enter Your Height"); } 
;// TODO add your handling code here:
    }//GEN-LAST:event_txtHeightMouseExited

    private void formWindowClosed(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowClosed
   
    }//GEN-LAST:event_formWindowClosed

    private void formWindowActivated(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowActivated
          // TODO add your handling code here:
    }//GEN-LAST:event_formWindowActivated

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed

        DefaultTableModel model = (DefaultTableModel) tableClients.getModel();
            Vector <Vector> tableData = model.getDataVector();
            
            
            try {
                FileOutputStream file = new FileOutputStream("file.bin");
                ObjectOutputStream output = new ObjectOutputStream(file);
                
                output.writeObject(tableData);
                output.close();
                file.close();
                
            } catch (Exception ex){
                ex.printStackTrace();
            }        

        // TODO add your handling code here:
    }//GEN-LAST:event_jButton2ActionPerformed

    private void tableClientsMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tableClientsMouseEntered

    }//GEN-LAST:event_tableClientsMouseEntered

    private void tableClientsMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tableClientsMouseExited
     
    }//GEN-LAST:event_tableClientsMouseExited

    private void btnAddMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnAddMouseEntered
        // TODO add your handling code here:
    }//GEN-LAST:event_btnAddMouseEntered

    private void txtWeightMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txtWeightMouseEntered
if("Enter Your Weight".equals(txtWeight.getText())){
            txtWeight.setText(""); } 
        // TODO add your handling code here:
    }//GEN-LAST:event_txtWeightMouseEntered

    private void txtWeightMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txtWeightMouseExited
   if("".equals(txtWeight.getText())){
            txtWeight.setText("Enter Your Weight"); } 
     // TODO add your handling code here:
    }//GEN-LAST:event_txtWeightMouseExited

    private void txtBMIMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txtBMIMouseEntered
     if("Enter Your BMI Results".equals(txtBMI.getText())){
            txtBMI.setText(""); }
    
      // TODO add your handling code here:
    }//GEN-LAST:event_txtBMIMouseEntered

    private void txtBMIMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txtBMIMouseExited
        if("".equals(txtBMI.getText())){
            txtBMI.setText("Enter Your BMI Results"); }
        
     // TODO add your handling code here:
    }//GEN-LAST:event_txtBMIMouseExited

    private void txtNameMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txtNameMouseExited
        if("".equals(txtName.getText())){
            txtName.setText("Enter Your Name");txtName.setBackground(Color.white); }
        // TODO add your handling code here:
    }//GEN-LAST:event_txtNameMouseExited

    private void txtNameMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txtNameMouseEntered
        // TODO add your handling code here:
        if("Enter Your Name".equals(txtName.getText())){
            txtName.setText(""); }
      
    }//GEN-LAST:event_txtNameMouseEntered

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
            java.util.logging.Logger.getLogger(MainGirl.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(MainGirl.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MainGirl.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MainGirl.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new MainGirl().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JTable tableClients;
    private javax.swing.JTextField txtAge;
    public javax.swing.JTextField txtBMI;
    private javax.swing.JTextField txtGender;
    public javax.swing.JTextField txtHeight;
    private javax.swing.JTextField txtName;
    public javax.swing.JTextField txtWeight;
    // End of variables declaration//GEN-END:variables
}