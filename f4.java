
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.Statement;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import javax.swing.JOptionPane;



/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author abhishekprabhu
 */

class DatabaseHandler
{
static Connection con;

public static void getConnection(){
try
{

	/*Database connection code*/
        
        con = DriverManager.getConnection("jdbc:derby://localhost:1527/ask","abc","abc");
       //Statement st = con.createStatement();
}
      
catch(Exception e)
{

	JOptionPane.showMessageDialog(null," "+e);
}
}


public void insert(String order,double amount, String name)
{
try 
{
    
	getConnection();
        System.out.println("getConnection executed successfully");
        System.out.println("Username is "+name);
	//String q = “insert into orders values(?,?)”;
	PreparedStatement pst = con.prepareStatement("insert into orders values(?,?,?)");
	pst.setString(1,order);
        pst.setDouble(2,amount);
	pst.setString(3,name);

          int i = pst.executeUpdate();
        System.out.println("Value is getting added in db");
	JOptionPane.showMessageDialog(null,"1 Record Added ");
        con.close();
}


catch(Exception E)
{
	//JOptionPane.showMessageDialog(null," Record Already Exists");
         E.printStackTrace();
}
} 
}

/********************************************************************************************************************/



public class f4 extends javax.swing.JFrame {

//    JButton b1; 
    String order;
    String amount;
    String username;
    String tnam;
    public f4() {
        initComponents();
                
    }
    public f4(String tnam)
    {
        this.tnam = tnam;
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

        jTextField1 = new javax.swing.JTextField();
        reset = new javax.swing.JButton();
        logout = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();
        b1 = new javax.swing.JButton();
        t1 = new javax.swing.JCheckBox();
        t2 = new javax.swing.JCheckBox();
        t3 = new javax.swing.JCheckBox();
        t4 = new javax.swing.JCheckBox();
        t5 = new javax.swing.JCheckBox();
        t6 = new javax.swing.JCheckBox();
        t7 = new javax.swing.JCheckBox();
        t8 = new javax.swing.JCheckBox();
        t9 = new javax.swing.JCheckBox();
        t10 = new javax.swing.JCheckBox();
        t11 = new javax.swing.JCheckBox();
        t12 = new javax.swing.JCheckBox();
        t13 = new javax.swing.JCheckBox();
        t14 = new javax.swing.JCheckBox();
        t15 = new javax.swing.JCheckBox();
        t16 = new javax.swing.JCheckBox();
        jTextField2 = new javax.swing.JTextField();
        jTextField3 = new javax.swing.JTextField();
        jTextField4 = new javax.swing.JTextField();
        jTextField5 = new javax.swing.JTextField();
        jTextField6 = new javax.swing.JTextField();
        jTextField7 = new javax.swing.JTextField();
        jTextField8 = new javax.swing.JTextField();
        jTextField9 = new javax.swing.JTextField();
        jTextField10 = new javax.swing.JTextField();
        jTextField11 = new javax.swing.JTextField();
        jTextField12 = new javax.swing.JTextField();
        jTextField13 = new javax.swing.JTextField();
        jTextField14 = new javax.swing.JTextField();
        jTextField15 = new javax.swing.JTextField();
        jTextField17 = new javax.swing.JTextField();
        jTextField16 = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jTextField1.setFont(new java.awt.Font("Lucida Grande", 1, 18)); // NOI18N
        jTextField1.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jTextField1.setText("VEG MENU");
        getContentPane().add(jTextField1, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 30, 307, 40));

        reset.setText("RESET");
        reset.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                resetActionPerformed(evt);
            }
        });
        getContentPane().add(reset, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 450, -1, -1));

        logout.setText("LOG OUT");
        logout.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                logoutActionPerformed(evt);
            }
        });
        getContentPane().add(logout, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 30, -1, -1));

        jButton1.setText("BACK");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 450, -1, -1));

        b1.setText("ADD TO CART");
        b1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b1ActionPerformed(evt);
            }
        });
        getContentPane().add(b1, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 450, -1, -1));

        t1.setFont(new java.awt.Font("Lucida Grande", 1, 14)); // NOI18N
        t1.setForeground(new java.awt.Color(255, 255, 255));
        t1.setText("IDLI SAMBHAR");
        t1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                t1ActionPerformed(evt);
            }
        });
        getContentPane().add(t1, new org.netbeans.lib.awtextra.AbsoluteConstraints(7, 90, 150, -1));

        t2.setFont(new java.awt.Font("Lucida Grande", 1, 14)); // NOI18N
        t2.setForeground(new java.awt.Color(255, 255, 255));
        t2.setText("VADA SAMBHAR");
        getContentPane().add(t2, new org.netbeans.lib.awtextra.AbsoluteConstraints(9, 130, 160, -1));

        t3.setFont(new java.awt.Font("Lucida Grande", 1, 14)); // NOI18N
        t3.setForeground(new java.awt.Color(255, 255, 255));
        t3.setText("SHEV PURI");
        t3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                t3ActionPerformed(evt);
            }
        });
        getContentPane().add(t3, new org.netbeans.lib.awtextra.AbsoluteConstraints(8, 170, 120, -1));

        t4.setFont(new java.awt.Font("Lucida Grande", 1, 14)); // NOI18N
        t4.setForeground(new java.awt.Color(255, 255, 255));
        t4.setText("DAL FRY");
        t4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                t4ActionPerformed(evt);
            }
        });
        getContentPane().add(t4, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 210, 110, -1));

        t5.setFont(new java.awt.Font("Lucida Grande", 1, 14)); // NOI18N
        t5.setForeground(new java.awt.Color(255, 255, 255));
        t5.setText("MISAL PAV");
        t5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                t5ActionPerformed(evt);
            }
        });
        getContentPane().add(t5, new org.netbeans.lib.awtextra.AbsoluteConstraints(8, 250, 110, -1));

        t6.setFont(new java.awt.Font("Lucida Grande", 1, 14)); // NOI18N
        t6.setForeground(new java.awt.Color(255, 255, 255));
        t6.setText("SANDWICH");
        getContentPane().add(t6, new org.netbeans.lib.awtextra.AbsoluteConstraints(11, 300, 120, -1));

        t7.setFont(new java.awt.Font("Lucida Grande", 1, 14)); // NOI18N
        t7.setForeground(new java.awt.Color(255, 255, 255));
        t7.setText("PANEER TIKKA");
        getContentPane().add(t7, new org.netbeans.lib.awtextra.AbsoluteConstraints(8, 350, 150, -1));

        t8.setFont(new java.awt.Font("Lucida Grande", 1, 14)); // NOI18N
        t8.setForeground(new java.awt.Color(255, 255, 255));
        t8.setText("VEG KOLHAPURI");
        getContentPane().add(t8, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 400, 160, -1));

        t9.setFont(new java.awt.Font("Lucida Grande", 1, 14)); // NOI18N
        t9.setForeground(new java.awt.Color(255, 255, 255));
        t9.setText("VEG BIRYANI");
        getContentPane().add(t9, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 90, -1, -1));

        t10.setForeground(new java.awt.Color(255, 255, 255));
        t10.setText("ROTI");
        getContentPane().add(t10, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 130, -1, -1));

        t11.setFont(new java.awt.Font("Lucida Grande", 1, 14)); // NOI18N
        t11.setForeground(new java.awt.Color(255, 255, 255));
        t11.setText("CHAPATI");
        getContentPane().add(t11, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 170, -1, -1));

        t12.setFont(new java.awt.Font("Lucida Grande", 1, 14)); // NOI18N
        t12.setForeground(new java.awt.Color(255, 255, 255));
        t12.setText("PLAIN RICE");
        getContentPane().add(t12, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 210, -1, -1));

        t13.setFont(new java.awt.Font("Lucida Grande", 1, 14)); // NOI18N
        t13.setForeground(new java.awt.Color(255, 255, 255));
        t13.setText("ALOO MATAR");
        t13.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                t13ActionPerformed(evt);
            }
        });
        getContentPane().add(t13, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 250, -1, -1));

        t14.setFont(new java.awt.Font("Lucida Grande", 1, 14)); // NOI18N
        t14.setForeground(new java.awt.Color(255, 255, 255));
        t14.setText("PURI BHAJI");
        getContentPane().add(t14, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 300, -1, -1));

        t15.setBackground(new java.awt.Color(255, 0, 51));
        t15.setFont(new java.awt.Font("Lucida Grande", 1, 14)); // NOI18N
        t15.setForeground(new java.awt.Color(255, 255, 255));
        t15.setText("VEG THALI");
        getContentPane().add(t15, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 350, -1, -1));

        t16.setFont(new java.awt.Font("Lucida Grande", 1, 14)); // NOI18N
        t16.setForeground(new java.awt.Color(255, 255, 255));
        t16.setText("COLD DRINKS");
        getContentPane().add(t16, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 400, -1, -1));

        jTextField2.setText("80");
        getContentPane().add(jTextField2, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 90, 80, -1));

        jTextField3.setText("95");
        getContentPane().add(jTextField3, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 130, 80, -1));

        jTextField4.setText("60");
        getContentPane().add(jTextField4, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 170, 80, -1));

        jTextField5.setText("110");
        getContentPane().add(jTextField5, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 210, 80, -1));

        jTextField6.setText("120");
        getContentPane().add(jTextField6, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 250, 80, -1));

        jTextField7.setText("100");
        getContentPane().add(jTextField7, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 300, 80, -1));

        jTextField8.setText("160");
        getContentPane().add(jTextField8, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 350, 80, -1));

        jTextField9.setText("140");
        getContentPane().add(jTextField9, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 400, 80, -1));

        jTextField10.setText("180");
        getContentPane().add(jTextField10, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 90, 80, -1));

        jTextField11.setText("20");
        getContentPane().add(jTextField11, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 130, 80, -1));

        jTextField12.setText("15");
        getContentPane().add(jTextField12, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 170, 80, -1));

        jTextField13.setText("80");
        jTextField13.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField13ActionPerformed(evt);
            }
        });
        getContentPane().add(jTextField13, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 210, 80, -1));

        jTextField14.setText("120");
        getContentPane().add(jTextField14, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 250, 80, -1));

        jTextField15.setText("150");
        getContentPane().add(jTextField15, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 300, 80, -1));

        jTextField17.setText("50");
        getContentPane().add(jTextField17, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 400, 80, -1));

        jTextField16.setText("170");
        getContentPane().add(jTextField16, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 350, 80, -1));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image17.jpg"))); // NOI18N
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 600, 520));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void resetActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_resetActionPerformed
        // TODO add your handling code here:
        t1.setSelected(false);
        t2.setSelected(false);
        t3.setSelected(false);
        t4.setSelected(false);
        t5.setSelected(false);
        t6.setSelected(false);
        t7.setSelected(false);
        t8.setSelected(false);
        t9.setSelected(false);
        t10.setSelected(false);
        t11.setSelected(false);
        t12.setSelected(false);
        t13.setSelected(false);
        t14.setSelected(false);
        t15.setSelected(false);
        t16.setSelected(false);
        reset();
        
        


    }//GEN-LAST:event_resetActionPerformed

    private void logoutActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_logoutActionPerformed
        // TODO add your handling code here:
        new f1().setVisible(true);
        this.dispose();

    }//GEN-LAST:event_logoutActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        new f2(tnam).setVisible(true);
        this.dispose();
    }//GEN-LAST:event_jButton1ActionPerformed

    private void b1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_b1ActionPerformed
        // TODO add your handling code here:
       b1.addActionListener(new ActionListener(){
           
       public void actionPerformed(ActionEvent ae){
       System.out.println("Status of checkbox of t1 "+t1.isSelected());
       System.out.println("Status of checkbox of t2 "+t2.isSelected());
       if(t1.isSelected())
       {     
          order=t1.getText();
          amount=jTextField2.getText();
          
           System.out.println(order);
           System.out.println(jTextField2.getText());
            //new f6().setVisible(true);
            //dispose();
        
        try{         
            DatabaseHandler q = new DatabaseHandler();
            System.out.println("Username is "+tnam);
            q.insert(order,Double.parseDouble(amount),tnam);
           
        }
        catch(Exception E)
        {
	JOptionPane.showMessageDialog(null," Throwing exception in DatabaseHandler");

        }
       }
      if(t2.isSelected())
       {     
         order=t2.getText();
          amount=jTextField3.getText();
          
           System.out.println(order);
           System.out.println(jTextField3.getText());
           //new f6().setVisible(true);
            //dispose();
           
        
        try{         
            DatabaseHandler q = new DatabaseHandler();
            System.out.println("Username is "+tnam);
            //username = "vedant20";
            q.insert(order,Double.parseDouble(amount),tnam);
        }
        catch(Exception E)
        {
	JOptionPane.showMessageDialog(null," Throwing exception in DatabaseHandler");

        }
       }
      
      if(t3.isSelected())
       {     
         
          order=t3.getText();
          amount=jTextField4.getText();
          //String name= "Ashish78";
           System.out.println(order);
           System.out.println(jTextField4.getText());
           //new f6().setVisible(true);
            //dispose();
        
        try{         
          
            DatabaseHandler q = new DatabaseHandler();
            System.out.println("Username is"+tnam);
           // username = "vedant20";
            q.insert(order,Double.parseDouble(amount),tnam);
           
        }
        catch(Exception E)
        {
	JOptionPane.showMessageDialog(null," Throwing exception in DatabaseHandler");

        }
       }
      if(t4.isSelected())
       {     
          
          order=t4.getText();
          amount=jTextField5.getText();
          //String name= "Ashish78";
           System.out.println(order);
           System.out.println(jTextField5.getText());
           //new f6().setVisible(true);
            //dispose();
        
        try{         
            
            DatabaseHandler q = new DatabaseHandler();
             System.out.println("Username is"+tnam);
            //username = "vedant20";
            q.insert(order,Double.parseDouble(amount),tnam);
           
        }
        catch(Exception E)
        {
	JOptionPane.showMessageDialog(null," Throwing exception in DatabaseHandler");

        }
       }
      
      if(t5.isSelected())
       {     
         
          order=t5.getText();
          amount=jTextField6.getText();
           System.out.println(order);
           System.out.println(jTextField6.getText());
           //new f6().setVisible(true);
            //dispose();
        
        try{         
          
            DatabaseHandler q = new DatabaseHandler();
            System.out.println("Username is"+tnam);
            //username = "vedant20";

            q.insert(order,Double.parseDouble(amount),tnam);
            System.out.println("After q.insert in t5 checkbox");
        }
        catch(Exception E)
        {
	JOptionPane.showMessageDialog(null," Throwing exception in DatabaseHandler");

        }
       }
      
      if(t6.isSelected())
       {     
         
          order=t6.getText();
          amount=jTextField7.getText();
          
           System.out.println(order);
           System.out.println(jTextField7.getText());
           //new f6().setVisible(true);
            //dispose();
        
        try{         
           
            DatabaseHandler q = new DatabaseHandler();
            System.out.println("Username is"+tnam);
            //username = "vedant20";

            q.insert(order,Double.parseDouble(amount),tnam);
            System.out.println("After q.insert in t6 checkbox");
        }
        catch(Exception E)
        {
	JOptionPane.showMessageDialog(null," Throwing exception in DatabaseHandler");

        }
       }
      
      if(t7.isSelected())
       {     
          System.out.println("Inside the t7 method");
          order=t7.getText();
          amount=jTextField8.getText();
          //String name= "Ashish78";
           System.out.println(order);
           System.out.println(jTextField8.getText());
        
        try{         
            System.out.println("inside try block of t7 checkbox");
            DatabaseHandler q = new DatabaseHandler();
            q.insert(order,Double.parseDouble(amount),tnam);
            System.out.println("After q.insert in t7 checkbox");
        }
        catch(Exception E)
        {
	JOptionPane.showMessageDialog(null," Throwing exception in DatabaseHandler");

        }
       }
      
      if(t8.isSelected())
       {     
          System.out.println("Inside the t8 method");
          order=t7.getText();
          amount=jTextField9.getText();
          //String name= "Ashish78";
           System.out.println(order);
           System.out.println(jTextField9.getText());
        
        try{         
            System.out.println("inside try block of t8 checkbox");
            DatabaseHandler q = new DatabaseHandler();
            q.insert(order,Double.parseDouble(amount),tnam);
        }
        catch(Exception E)
        {
	JOptionPane.showMessageDialog(null," Throwing exception in DatabaseHandler");

        }
       }
      
      if(t9.isSelected())
       {     
          System.out.println("Inside the t9 method");
          order=t9.getText();
          amount=jTextField10.getText();
          //String name= "Ashish78";
           System.out.println(order);
           System.out.println(jTextField10.getText());
        
        try{         
            System.out.println("inside try block of t9 checkbox");
            DatabaseHandler q = new DatabaseHandler();
            q.insert(order,Double.parseDouble(amount),tnam);
            System.out.println("After q.insert in t9 checkbox");
        }
        catch(Exception E)
        {
	JOptionPane.showMessageDialog(null," Throwing exception in DatabaseHandler");
        
        

        }
       }
      
      if(t10.isSelected())
       {     
          System.out.println("Inside the t10 method");
          order=t10.getText();
          amount=jTextField11.getText();
          //String name= "Ashish78";
           System.out.println(order);
           System.out.println(jTextField11.getText());
        
        try{         
            System.out.println("inside try block of t10 checkbox");
            DatabaseHandler q = new DatabaseHandler();
            q.insert(order,Double.parseDouble(amount),tnam);
            System.out.println("After q.insert in t10 checkbox");
        }
        catch(Exception E)
        {
	JOptionPane.showMessageDialog(null," Throwing exception in DatabaseHandler");

        }
       }
      new f6(tnam).setVisible(true);
                          dispose(); 
        
      
            
       }      
       });
       
       
    }//GEN-LAST:event_b1ActionPerformed

    private void t3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_t3ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_t3ActionPerformed

    private void t5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_t5ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_t5ActionPerformed

    private void t13ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_t13ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_t13ActionPerformed

    private void t4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_t4ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_t4ActionPerformed

    private void jTextField13ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField13ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField13ActionPerformed

    private void t1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_t1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_t1ActionPerformed

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
            java.util.logging.Logger.getLogger(f4.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(f4.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(f4.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(f4.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new f4().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton b1;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTextField jTextField10;
    private javax.swing.JTextField jTextField11;
    private javax.swing.JTextField jTextField12;
    private javax.swing.JTextField jTextField13;
    private javax.swing.JTextField jTextField14;
    private javax.swing.JTextField jTextField15;
    private javax.swing.JTextField jTextField16;
    private javax.swing.JTextField jTextField17;
    private javax.swing.JTextField jTextField2;
    private javax.swing.JTextField jTextField3;
    private javax.swing.JTextField jTextField4;
    private javax.swing.JTextField jTextField5;
    private javax.swing.JTextField jTextField6;
    private javax.swing.JTextField jTextField7;
    private javax.swing.JTextField jTextField8;
    private javax.swing.JTextField jTextField9;
    private javax.swing.JButton logout;
    private javax.swing.JButton reset;
    private javax.swing.JCheckBox t1;
    private javax.swing.JCheckBox t10;
    private javax.swing.JCheckBox t11;
    private javax.swing.JCheckBox t12;
    private javax.swing.JCheckBox t13;
    private javax.swing.JCheckBox t14;
    private javax.swing.JCheckBox t15;
    private javax.swing.JCheckBox t16;
    private javax.swing.JCheckBox t2;
    private javax.swing.JCheckBox t3;
    private javax.swing.JCheckBox t4;
    private javax.swing.JCheckBox t5;
    private javax.swing.JCheckBox t6;
    private javax.swing.JCheckBox t7;
    private javax.swing.JCheckBox t8;
    private javax.swing.JCheckBox t9;
    // End of variables declaration//GEN-END:variables

    private void reset() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}
