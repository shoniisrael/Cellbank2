/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cellbank;

import java.awt.Dimension;
import java.awt.Toolkit;
import javax.swing.JOptionPane;
    
public class Login extends javax.swing.JFrame {
private int error1;
   
    public Login() {
        initComponents();
        Dimension dim = Toolkit.getDefaultToolkit().getScreenSize();
        setBounds(1,1, 363,654);
        setLocationRelativeTo(null);
        error1=0;
        btn_0.setOpaque(false);
        btn_0.setContentAreaFilled(false);
        btn_1.setOpaque(false);
        btn_1.setContentAreaFilled(false);
        btn_2.setOpaque(false);
        btn_2.setContentAreaFilled(false);
        btn_3.setOpaque(false);
        btn_3.setContentAreaFilled(false);
        btn_4.setOpaque(false);
        btn_4.setContentAreaFilled(false);
        btn_5.setOpaque(false);
        btn_5.setContentAreaFilled(false);
        btn_6.setOpaque(false);
        btn_6.setContentAreaFilled(false);
        btn_7.setOpaque(false);
        btn_7.setContentAreaFilled(false);
        btn_8.setOpaque(false);
        btn_8.setContentAreaFilled(false);
        btn_9.setOpaque(false);
        btn_9.setContentAreaFilled(false);
        btn_asterisco.setOpaque(false);
        btn_asterisco.setContentAreaFilled(false);
        btn_borrar.setOpaque(false);
        btn_borrar.setContentAreaFilled(false);
        btn_numeral.setOpaque(false);
        btn_numeral.setContentAreaFilled(false);
    }
 
    public Login(int err1) {
        initComponents();
        Dimension dim = Toolkit.getDefaultToolkit().getScreenSize();
        setBounds(1,1, 363,654);
        setLocationRelativeTo(null);
        this.error1=err1;
        btn_0.setOpaque(false);
        btn_0.setContentAreaFilled(false);
        btn_1.setOpaque(false);
        btn_1.setContentAreaFilled(false);
        btn_2.setOpaque(false);
        btn_2.setContentAreaFilled(false);
        btn_3.setOpaque(false);
        btn_3.setContentAreaFilled(false);
        btn_4.setOpaque(false);
        btn_4.setContentAreaFilled(false);
        btn_5.setOpaque(false);
        btn_5.setContentAreaFilled(false);
        btn_6.setOpaque(false);
        btn_6.setContentAreaFilled(false);
        btn_7.setOpaque(false);
        btn_7.setContentAreaFilled(false);
        btn_8.setOpaque(false);
        btn_8.setContentAreaFilled(false);
        btn_9.setOpaque(false);
        btn_9.setContentAreaFilled(false);
        btn_asterisco.setOpaque(false);
        btn_asterisco.setContentAreaFilled(false);
        btn_borrar.setOpaque(false);
        btn_borrar.setContentAreaFilled(false);
        btn_numeral.setOpaque(false);
        btn_numeral.setContentAreaFilled(false);
    }
    
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        btn_1 = new javax.swing.JButton();
        btn_2 = new javax.swing.JButton();
        btn_3 = new javax.swing.JButton();
        btn_4 = new javax.swing.JButton();
        btn_5 = new javax.swing.JButton();
        btn_6 = new javax.swing.JButton();
        btn_7 = new javax.swing.JButton();
        btn_8 = new javax.swing.JButton();
        btn_9 = new javax.swing.JButton();
        btn_asterisco = new javax.swing.JButton();
        btn_0 = new javax.swing.JButton();
        btn_numeral = new javax.swing.JButton();
        btn_borrar = new javax.swing.JButton();
        txt_psswd = new javax.swing.JPasswordField();
        jLabel2 = new javax.swing.JLabel();
        jButton2 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(null);

        btn_1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_1ActionPerformed(evt);
            }
        });
        getContentPane().add(btn_1);
        btn_1.setBounds(0, 300, 100, 50);

        btn_2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_2ActionPerformed(evt);
            }
        });
        getContentPane().add(btn_2);
        btn_2.setBounds(100, 300, 120, 50);

        btn_3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_3ActionPerformed(evt);
            }
        });
        getContentPane().add(btn_3);
        btn_3.setBounds(220, 300, 110, 50);

        btn_4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_4ActionPerformed(evt);
            }
        });
        getContentPane().add(btn_4);
        btn_4.setBounds(0, 350, 100, 50);

        btn_5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_5ActionPerformed(evt);
            }
        });
        getContentPane().add(btn_5);
        btn_5.setBounds(100, 350, 120, 50);

        btn_6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_6ActionPerformed(evt);
            }
        });
        getContentPane().add(btn_6);
        btn_6.setBounds(220, 350, 110, 50);

        btn_7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_7ActionPerformed(evt);
            }
        });
        getContentPane().add(btn_7);
        btn_7.setBounds(0, 400, 100, 40);

        btn_8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_8ActionPerformed(evt);
            }
        });
        getContentPane().add(btn_8);
        btn_8.setBounds(100, 400, 120, 40);

        btn_9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_9ActionPerformed(evt);
            }
        });
        getContentPane().add(btn_9);
        btn_9.setBounds(220, 400, 110, 40);

        btn_asterisco.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_asteriscoActionPerformed(evt);
            }
        });
        getContentPane().add(btn_asterisco);
        btn_asterisco.setBounds(0, 440, 100, 50);

        btn_0.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_0ActionPerformed(evt);
            }
        });
        getContentPane().add(btn_0);
        btn_0.setBounds(100, 440, 120, 50);

        btn_numeral.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_numeralActionPerformed(evt);
            }
        });
        getContentPane().add(btn_numeral);
        btn_numeral.setBounds(220, 440, 110, 50);

        btn_borrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_borrarActionPerformed(evt);
            }
        });
        getContentPane().add(btn_borrar);
        btn_borrar.setBounds(300, 220, 40, 50);

        txt_psswd.setEditable(false);
        txt_psswd.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        txt_psswd.setBorder(null);
        getContentPane().add(txt_psswd);
        txt_psswd.setBounds(20, 230, 270, 30);

        jLabel2.setFont(new java.awt.Font("Trebuchet MS", 3, 24)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Administrador");
        getContentPane().add(jLabel2);
        jLabel2.setBounds(70, 10, 170, 40);

        jButton2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/cellbank/fondos/volverbtn.png"))); // NOI18N
        jButton2.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton2);
        jButton2.setBounds(10, 0, 30, 50);

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/cellbank/fondos/img_index.png"))); // NOI18N
        getContentPane().add(jLabel1);
        jLabel1.setBounds(0, 0, 344, 620);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btn_1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_1ActionPerformed
        txt_psswd.setText(txt_psswd.getText()+"1");
        valida();
    }//GEN-LAST:event_btn_1ActionPerformed

    private void btn_2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_2ActionPerformed
        txt_psswd.setText(txt_psswd.getText()+"2");
        valida();
    }//GEN-LAST:event_btn_2ActionPerformed

    private void btn_3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_3ActionPerformed
       txt_psswd.setText(txt_psswd.getText()+"3");
       valida();
    }//GEN-LAST:event_btn_3ActionPerformed

    private void btn_4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_4ActionPerformed
         txt_psswd.setText(txt_psswd.getText()+"4");
         valida();
    }//GEN-LAST:event_btn_4ActionPerformed

    private void btn_5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_5ActionPerformed
         txt_psswd.setText(txt_psswd.getText()+"5");
         valida();
    }//GEN-LAST:event_btn_5ActionPerformed

    private void btn_6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_6ActionPerformed
         txt_psswd.setText(txt_psswd.getText()+"6");
         valida();
    }//GEN-LAST:event_btn_6ActionPerformed

    private void btn_7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_7ActionPerformed
        txt_psswd.setText(txt_psswd.getText()+"7");
        valida();
    }//GEN-LAST:event_btn_7ActionPerformed

    private void btn_8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_8ActionPerformed
        txt_psswd.setText(txt_psswd.getText()+"8");
        valida();
    }//GEN-LAST:event_btn_8ActionPerformed

    private void btn_9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_9ActionPerformed
         txt_psswd.setText(txt_psswd.getText()+"9");
         valida();
    }//GEN-LAST:event_btn_9ActionPerformed

    private void btn_asteriscoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_asteriscoActionPerformed
         txt_psswd.setText(txt_psswd.getText()+"*");
         valida();
    }//GEN-LAST:event_btn_asteriscoActionPerformed

    private void btn_0ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_0ActionPerformed
        txt_psswd.setText(txt_psswd.getText()+"0");
        valida();
    }//GEN-LAST:event_btn_0ActionPerformed

    private void btn_numeralActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_numeralActionPerformed
        txt_psswd.setText(txt_psswd.getText()+"#");
        valida();
    }//GEN-LAST:event_btn_numeralActionPerformed

    private void btn_borrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_borrarActionPerformed
if(txt_psswd.getText().length()==0)       {
    txt_psswd.setText("");
}else{
     txt_psswd.setText(txt_psswd.getText().substring(0,( txt_psswd.getText().length()-1)));
}
       
    }//GEN-LAST:event_btn_borrarActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        setVisible(false);
        new Index().setVisible(true);
    }//GEN-LAST:event_jButton2ActionPerformed

     private void valida(){
           if(txt_psswd.getText().length()==4){
               if(txt_psswd.getText().equals("1234")){
                    JOptionPane.showMessageDialog(null, "Acceso Correcto");
                    setVisible(false);
                 new Lista().setVisible(true);
                    
               }else{
                         error1++;
                        JOptionPane.showMessageDialog(null, "Contraseña Incorrecta");
                        txt_psswd.setText("");
                       if(error1==3){
                                JOptionPane.showMessageDialog(null, "Tres Intentos Incorrectos");
                                
                                 setVisible(false);
                                 Timeout timeout=new Timeout(error1);
                                 timeout.start(0, 1000);
                               
                         }
                       if(error1==4){
                                JOptionPane.showMessageDialog(null, "Cuatro Intentos Incorrectos");
                                
                                 setVisible(false);
                                 Timeout timeout = new Timeout(error1);
                                 timeout.start(0, 2500);
                         }
                        if(error1==5){
                                JOptionPane.showMessageDialog(null, "Cinco Intentos Incorrectos");
                                System.exit(0);
                         }
               }
           }else{
               
               
           }
           
     }
    /**
     * @param args the command line arguments
     */
                        

    
   
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_0;
    private javax.swing.JButton btn_1;
    private javax.swing.JButton btn_2;
    private javax.swing.JButton btn_3;
    private javax.swing.JButton btn_4;
    private javax.swing.JButton btn_5;
    private javax.swing.JButton btn_6;
    private javax.swing.JButton btn_7;
    private javax.swing.JButton btn_8;
    private javax.swing.JButton btn_9;
    private javax.swing.JButton btn_asterisco;
    private javax.swing.JButton btn_borrar;
    private javax.swing.JButton btn_numeral;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPasswordField txt_psswd;
    // End of variables declaration//GEN-END:variables
}
