
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.Statement;
import javax.swing.JButton;
import javax.swing.JOptionPane;
import java.awt.*;
import java.awt.event.*;




/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author abhishekprabhu
 */
class DatabaseHandler1
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



public class f5 extends javax.swing.JFrame {

    String order;
    String amount;
    String username,tnam;
    public f5() {
        initComponents();
        //username = "aniket10";
        
    }
    public f5(String tnam)
    {
        this.tnam = tnam;
        System.out.println(tnam);
        initComponents();
    }
    
     /* This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        g1 = new javax.swing.JCheckBox();
        g2 = new javax.swing.JCheckBox();
        g3 = new javax.swing.JCheckBox();
        g5 = new javax.swing.JCheckBox();
        g6 = new javax.swing.JCheckBox();
        g7 = new javax.swing.JCheckBox();
        g9 = new javax.swing.JCheckBox();
        g12 = new javax.swing.JCheckBox();
        g10 = new javax.swing.JCheckBox();
        g11 = new javax.swing.JCheckBox();
        g8 = new javax.swing.JCheckBox();
        g4 = new javax.swing.JCheckBox();
        g13 = new javax.swing.JCheckBox();
        g14 = new javax.swing.JCheckBox();
        jButton1 = new javax.swing.JButton();
        reset = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jTextField1 = new javax.swing.JTextField();
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
        button4 = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Lucida Grande", 1, 20)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("NON-VEG");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(155, 6, 308, 42));

        g1.setFont(new java.awt.Font("Lucida Grande", 1, 14)); // NOI18N
        g1.setText("Prawns Masala");
        g1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                g1ActionPerformed(evt);
            }
        });
        jPanel1.add(g1, new org.netbeans.lib.awtextra.AbsoluteConstraints(17, 77, 150, -1));

        g2.setBackground(new java.awt.Color(0, 0, 0));
        g2.setFont(new java.awt.Font("Lucida Grande", 1, 14)); // NOI18N
        g2.setText("Chicken Tandoori");
        g2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                g2ActionPerformed(evt);
            }
        });
        jPanel1.add(g2, new org.netbeans.lib.awtextra.AbsoluteConstraints(17, 118, -1, -1));

        g3.setFont(new java.awt.Font("Lucida Grande", 1, 14)); // NOI18N
        g3.setText("Chicken Handi");
        g3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                g3ActionPerformed(evt);
            }
        });
        jPanel1.add(g3, new org.netbeans.lib.awtextra.AbsoluteConstraints(17, 167, -1, -1));

        g5.setFont(new java.awt.Font("Lucida Grande", 0, 18)); // NOI18N
        g5.setText("Pomfret Fry");
        jPanel1.add(g5, new org.netbeans.lib.awtextra.AbsoluteConstraints(17, 271, -1, -1));

        g6.setFont(new java.awt.Font("Lucida Grande", 1, 14)); // NOI18N
        g6.setText("Crab Masala");
        g6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                g6ActionPerformed(evt);
            }
        });
        jPanel1.add(g6, new org.netbeans.lib.awtextra.AbsoluteConstraints(17, 326, -1, -1));

        g7.setFont(new java.awt.Font("Lucida Grande", 1, 14)); // NOI18N
        g7.setText("Chicken Biryani");
        g7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                g7ActionPerformed(evt);
            }
        });
        jPanel1.add(g7, new org.netbeans.lib.awtextra.AbsoluteConstraints(17, 377, -1, -1));

        g9.setFont(new java.awt.Font("Lucida Grande", 1, 14)); // NOI18N
        g9.setText("Tandoori Roti");
        g9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                g9ActionPerformed(evt);
            }
        });
        jPanel1.add(g9, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 120, 173, -1));

        g12.setFont(new java.awt.Font("Lucida Grande", 1, 14)); // NOI18N
        g12.setText("Non veg Thali");
        g12.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                g12ActionPerformed(evt);
            }
        });
        jPanel1.add(g12, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 270, 149, -1));

        g10.setFont(new java.awt.Font("Lucida Grande", 1, 14)); // NOI18N
        g10.setText("Chicken Soup");
        g10.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                g10ActionPerformed(evt);
            }
        });
        jPanel1.add(g10, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 170, 173, -1));

        g11.setFont(new java.awt.Font("Lucida Grande", 1, 14)); // NOI18N
        g11.setText("Chicken Lollypop");
        g11.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                g11ActionPerformed(evt);
            }
        });
        jPanel1.add(g11, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 220, 160, -1));

        g8.setFont(new java.awt.Font("Lucida Grande", 1, 14)); // NOI18N
        g8.setText("Prawns Biryani");
        g8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                g8ActionPerformed(evt);
            }
        });
        jPanel1.add(g8, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 80, -1, -1));

        g4.setFont(new java.awt.Font("Lucida Grande", 1, 14)); // NOI18N
        g4.setText("Chicken Shawarma");
        g4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                g4ActionPerformed(evt);
            }
        });
        jPanel1.add(g4, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 220, -1, 30));

        g13.setFont(new java.awt.Font("Lucida Grande", 1, 14)); // NOI18N
        g13.setText("Mutton masala");
        g13.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                g13ActionPerformed(evt);
            }
        });
        jPanel1.add(g13, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 320, 149, -1));

        g14.setFont(new java.awt.Font("Lucida Grande", 1, 14)); // NOI18N
        g14.setText("CHICKEN MOMOS");
        g14.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                g14ActionPerformed(evt);
            }
        });
        jPanel1.add(g14, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 370, 173, -1));

        jButton1.setText("ADD TO CART");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 432, -1, -1));

        reset.setText("RESET");
        reset.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                resetActionPerformed(evt);
            }
        });
        jPanel1.add(reset, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 430, -1, -1));

        jButton3.setText("BACK");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton3, new org.netbeans.lib.awtextra.AbsoluteConstraints(419, 432, -1, -1));

        jTextField1.setText("220");
        jTextField1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField1ActionPerformed(evt);
            }
        });
        jPanel1.add(jTextField1, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 80, 70, -1));

        jTextField2.setText("240");
        jPanel1.add(jTextField2, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 120, 70, -1));

        jTextField3.setText("120");
        jTextField3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField3ActionPerformed(evt);
            }
        });
        jPanel1.add(jTextField3, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 220, 70, 30));

        jTextField4.setText("210");
        jPanel1.add(jTextField4, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 170, 70, -1));

        jTextField5.setText("330");
        jPanel1.add(jTextField5, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 270, 70, -1));

        jTextField6.setText("280");
        jPanel1.add(jTextField6, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 330, 70, -1));

        jTextField7.setText("250");
        jPanel1.add(jTextField7, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 380, 70, -1));

        jTextField8.setText("270");
        jPanel1.add(jTextField8, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 80, 80, -1));

        jTextField9.setText("20");
        jPanel1.add(jTextField9, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 120, 80, -1));

        jTextField10.setText("180");
        jPanel1.add(jTextField10, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 170, 80, -1));

        jTextField11.setText("240");
        jPanel1.add(jTextField11, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 220, 80, -1));

        jTextField12.setText("200");
        jPanel1.add(jTextField12, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 270, 80, -1));

        jTextField13.setText("235");
        jPanel1.add(jTextField13, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 320, 80, -1));

        jTextField14.setText("130");
        jPanel1.add(jTextField14, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 370, 80, -1));

        button4.setText("LOG OUT");
        button4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                button4ActionPerformed(evt);
            }
        });
        jPanel1.add(button4, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 0, -1, -1));

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/nonveg2.jpg"))); // NOI18N
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 630, 460));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void g7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_g7ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_g7ActionPerformed

    private void g6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_g6ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_g6ActionPerformed

    private void g3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_g3ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_g3ActionPerformed

    private void g9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_g9ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_g9ActionPerformed

    private void g12ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_g12ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_g12ActionPerformed

    private void g10ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_g10ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_g10ActionPerformed

    private void g11ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_g11ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_g11ActionPerformed

    private void g8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_g8ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_g8ActionPerformed

    private void g1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_g1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_g1ActionPerformed

    private void g4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_g4ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_g4ActionPerformed

    private void g2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_g2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_g2ActionPerformed

    private void g13ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_g13ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_g13ActionPerformed

    private void g14ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_g14ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_g14ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        // TODO add your handling code here:
        new f2(tnam).setVisible(true);
        this.dispose();
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
            // TODO add your handling code here:
             jButton1.addActionListener(new ActionListener(){
                
                public void actionPerformed(ActionEvent ae){
                    System.out.println("Status of checkbox of g1 "+g1.isSelected());
                    System.out.println("Status of checkbox of g2 "+g2.isSelected());
                    if(g1.isSelected())
                    {
                        order=g1.getText();
                        amount=jTextField1.getText();
                        
                        System.out.println(order);
                        System.out.println(jTextField1.getText());
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
                    
                    if(g2.isSelected())
                    {     
                          order=g2.getText();
                          amount=jTextField2.getText();
          
                          System.out.println(order);
                          System.out.println(jTextField2.getText());
                          //new f6().setVisible(true);
                          //dispose();
           
        
        try{         
            DatabaseHandler q = new DatabaseHandler();
            System.out.println("Username is "+tnam);
            //username = "pranav55";
             System.out.println("Username is "+tnam);
            q.insert(order,Double.parseDouble(amount),tnam);
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
             
    }//GEN-LAST:event_jButton1ActionPerformed

    private void button4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_button4ActionPerformed
        // TODO add your handling code here:
        new f1().setVisible(true);
        this.dispose();
    }//GEN-LAST:event_button4ActionPerformed

    private void jTextField1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField1ActionPerformed

    private void jTextField3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField3ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField3ActionPerformed

    private void resetActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_resetActionPerformed
        // TODO add your handling code here:
        g1.setSelected(false);
        g2.setSelected(false);
        g3.setSelected(false);
        g4.setSelected(false);
        g5.setSelected(false);
        g6.setSelected(false);
        g7.setSelected(false);
        g8.setSelected(false);
        g9.setSelected(false);
        g10.setSelected(false);
        g11.setSelected(false);
        g12.setSelected(false);
        g13.setSelected(false);
        g14.setSelected(false);
        reset();
        
    }//GEN-LAST:event_resetActionPerformed

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
            java.util.logging.Logger.getLogger(f5.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(f5.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(f5.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(f5.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new f5().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton button4;
    private javax.swing.JCheckBox g1;
    private javax.swing.JCheckBox g10;
    private javax.swing.JCheckBox g11;
    private javax.swing.JCheckBox g12;
    private javax.swing.JCheckBox g13;
    private javax.swing.JCheckBox g14;
    private javax.swing.JCheckBox g2;
    private javax.swing.JCheckBox g3;
    private javax.swing.JCheckBox g4;
    private javax.swing.JCheckBox g5;
    private javax.swing.JCheckBox g6;
    private javax.swing.JCheckBox g7;
    private javax.swing.JCheckBox g8;
    private javax.swing.JCheckBox g9;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton3;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTextField jTextField10;
    private javax.swing.JTextField jTextField11;
    private javax.swing.JTextField jTextField12;
    private javax.swing.JTextField jTextField13;
    private javax.swing.JTextField jTextField14;
    private javax.swing.JTextField jTextField2;
    private javax.swing.JTextField jTextField3;
    private javax.swing.JTextField jTextField4;
    private javax.swing.JTextField jTextField5;
    private javax.swing.JTextField jTextField6;
    private javax.swing.JTextField jTextField7;
    private javax.swing.JTextField jTextField8;
    private javax.swing.JTextField jTextField9;
    private javax.swing.JButton reset;
    // End of variables declaration//GEN-END:variables

    private void reset() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}
