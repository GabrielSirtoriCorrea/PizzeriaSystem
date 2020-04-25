/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.gazeboindustries.sistemapizzaria.com;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.Timer;
import org.json.JSONException;
import org.json.JSONObject;

/**
 *
 * @author Gazebo
 */
public class ActualRequests extends javax.swing.JFrame implements ActionListener {
    SocketConnection connection;
    JSONObject jsonObj;
    String AllRequests;
    JSONObject AllRequestsJson;
    JSONObject FirstRequest;
    JSONObject NextRequest;
   
    /**
     * Creates new form AppDesktopSistemaPizzaria
     */
    public ActualRequests() {
        initComponents();
        setLocationRelativeTo(null);
        
        jsonObj = new JSONObject();
             
        jsonObj.put("ID", "DesktopGetAllRequests");
        
        btnStart.addActionListener(this);
        
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        PanelLastRequest = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        lblComments = new javax.swing.JLabel();
        lblTotalPrice = new javax.swing.JLabel();
        lblClient = new javax.swing.JLabel();
        lblPizzaType = new javax.swing.JLabel();
        lblAddress = new javax.swing.JLabel();
        lblPhone = new javax.swing.JLabel();
        blComments = new javax.swing.JLabel();
        lblPizzaTaste = new javax.swing.JLabel();
        lblAddress1 = new javax.swing.JLabel();
        lbltotalPrice = new javax.swing.JLabel();
        btnFinishRequest = new javax.swing.JButton();
        jPanel1 = new javax.swing.JPanel();
        jLabel5 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        lblNextRequest1 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        lblNextRequest2 = new javax.swing.JLabel();
        lblNextRequest3 = new javax.swing.JLabel();
        lblNextRequest4 = new javax.swing.JLabel();
        lblNextRequest5 = new javax.swing.JLabel();
        btnStart = new javax.swing.JButton();
        Imagebackground = new javax.swing.JLabel();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        jMenu2 = new javax.swing.JMenu();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMinimumSize(new java.awt.Dimension(1440, 850));
        getContentPane().setLayout(null);

        jLabel1.setIcon(new javax.swing.ImageIcon("C:\\Users\\Gazebo\\Documents\\ProjetosGithub\\SistemaPizzaria\\Images\\Logo.jpg")); // NOI18N
        getContentPane().add(jLabel1);
        jLabel1.setBounds(40, 40, 280, 170);

        PanelLastRequest.setBackground(new java.awt.Color(153, 0, 0));
        PanelLastRequest.setLayout(null);

        jLabel2.setIcon(new javax.swing.ImageIcon("C:\\Users\\Gazebo\\Documents\\ProjetosGithub\\SistemaPizzaria\\Images\\Imagem Cliente.jpg")); // NOI18N
        PanelLastRequest.add(jLabel2);
        jLabel2.setBounds(40, 20, 200, 190);

        jLabel3.setIcon(new javax.swing.ImageIcon("C:\\Users\\Gazebo\\Documents\\ProjetosGithub\\SistemaPizzaria\\Images\\Imagem pizza.jpg")); // NOI18N
        PanelLastRequest.add(jLabel3);
        jLabel3.setBounds(60, 250, 160, 130);

        jLabel4.setIcon(new javax.swing.ImageIcon("C:\\Users\\Gazebo\\Documents\\ProjetosGithub\\SistemaPizzaria\\Images\\Imagem Endereço.jpg")); // NOI18N
        PanelLastRequest.add(jLabel4);
        jLabel4.setBounds(50, 470, 150, 120);

        jLabel6.setIcon(new javax.swing.ImageIcon("C:\\Users\\Gazebo\\Documents\\ProjetosGithub\\SistemaPizzaria\\Images\\Imagem Telefone.png")); // NOI18N
        PanelLastRequest.add(jLabel6);
        jLabel6.setBounds(510, 70, 110, 130);

        lblComments.setIcon(new javax.swing.ImageIcon("C:\\Users\\Gazebo\\Documents\\ProjetosGithub\\SistemaPizzaria\\Images\\Imagem Comentarios.png")); // NOI18N
        PanelLastRequest.add(lblComments);
        lblComments.setBounds(510, 250, 140, 170);

        lblTotalPrice.setIcon(new javax.swing.ImageIcon("C:\\Users\\Gazebo\\Documents\\ProjetosGithub\\SistemaPizzaria\\Images\\Imagem Preço.png")); // NOI18N
        PanelLastRequest.add(lblTotalPrice);
        lblTotalPrice.setBounds(510, 470, 140, 140);

        lblClient.setFont(new java.awt.Font("Postino Std", 1, 18)); // NOI18N
        PanelLastRequest.add(lblClient);
        lblClient.setBounds(250, 90, 190, 90);

        lblPizzaType.setFont(new java.awt.Font("Postino Std", 1, 18)); // NOI18N
        PanelLastRequest.add(lblPizzaType);
        lblPizzaType.setBounds(220, 260, 270, 60);

        lblAddress.setFont(new java.awt.Font("Postino Std", 1, 14)); // NOI18N
        PanelLastRequest.add(lblAddress);
        lblAddress.setBounds(210, 480, 290, 100);

        lblPhone.setFont(new java.awt.Font("Postino Std", 1, 18)); // NOI18N
        PanelLastRequest.add(lblPhone);
        lblPhone.setBounds(630, 90, 190, 90);

        blComments.setFont(new java.awt.Font("Postino Std", 1, 14)); // NOI18N
        PanelLastRequest.add(blComments);
        blComments.setBounds(640, 290, 190, 90);

        lblPizzaTaste.setFont(new java.awt.Font("Postino Std", 1, 18)); // NOI18N
        PanelLastRequest.add(lblPizzaTaste);
        lblPizzaTaste.setBounds(220, 330, 280, 50);

        lblAddress1.setFont(new java.awt.Font("Postino Std", 1, 14)); // NOI18N
        PanelLastRequest.add(lblAddress1);
        lblAddress1.setBounds(480, 360, 190, 120);

        lbltotalPrice.setFont(new java.awt.Font("Postino Std", 1, 18)); // NOI18N
        PanelLastRequest.add(lbltotalPrice);
        lbltotalPrice.setBounds(640, 490, 200, 110);

        getContentPane().add(PanelLastRequest);
        PanelLastRequest.setBounds(470, 40, 870, 670);

        btnFinishRequest.setBackground(new java.awt.Color(204, 204, 0));
        btnFinishRequest.setFont(new java.awt.Font("Impact", 3, 24)); // NOI18N
        btnFinishRequest.setText("CONCLUIR PEDIDO");
        btnFinishRequest.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnFinishRequestActionPerformed(evt);
            }
        });
        getContentPane().add(btnFinishRequest);
        btnFinishRequest.setBounds(1050, 740, 280, 70);

        jPanel1.setBackground(new java.awt.Color(153, 0, 0));
        jPanel1.setLayout(null);

        jLabel5.setFont(new java.awt.Font("Postino Std", 1, 18)); // NOI18N
        jLabel5.setText("PRÓXIMOS PEDIDOS");
        jPanel1.add(jLabel5);
        jLabel5.setBounds(50, 10, 290, 19);

        jLabel8.setIcon(new javax.swing.ImageIcon("C:\\Users\\Gazebo\\Documents\\ProjetosGithub\\SistemaPizzaria\\Images\\Imagem pizza - Menor.jpg")); // NOI18N
        jPanel1.add(jLabel8);
        jLabel8.setBounds(10, 70, 100, 70);

        jLabel9.setIcon(new javax.swing.ImageIcon("C:\\Users\\Gazebo\\Documents\\ProjetosGithub\\SistemaPizzaria\\Images\\Imagem pizza - Menor.jpg")); // NOI18N
        jPanel1.add(jLabel9);
        jLabel9.setBounds(10, 160, 100, 70);

        jLabel10.setIcon(new javax.swing.ImageIcon("C:\\Users\\Gazebo\\Documents\\ProjetosGithub\\SistemaPizzaria\\Images\\Imagem pizza - Menor.jpg")); // NOI18N
        jPanel1.add(jLabel10);
        jLabel10.setBounds(10, 450, 100, 70);

        jLabel11.setIcon(new javax.swing.ImageIcon("C:\\Users\\Gazebo\\Documents\\ProjetosGithub\\SistemaPizzaria\\Images\\Imagem pizza - Menor.jpg")); // NOI18N
        jPanel1.add(jLabel11);
        jLabel11.setBounds(10, 260, 100, 70);

        lblNextRequest1.setFont(new java.awt.Font("Postino Std", 1, 18)); // NOI18N
        jPanel1.add(lblNextRequest1);
        lblNextRequest1.setBounds(120, 70, 230, 70);

        jLabel12.setIcon(new javax.swing.ImageIcon("C:\\Users\\Gazebo\\Documents\\ProjetosGithub\\SistemaPizzaria\\Images\\Imagem pizza - Menor.jpg")); // NOI18N
        jPanel1.add(jLabel12);
        jLabel12.setBounds(10, 350, 100, 70);

        lblNextRequest2.setFont(new java.awt.Font("Postino Std", 1, 18)); // NOI18N
        jPanel1.add(lblNextRequest2);
        lblNextRequest2.setBounds(120, 160, 230, 70);

        lblNextRequest3.setFont(new java.awt.Font("Postino Std", 1, 18)); // NOI18N
        jPanel1.add(lblNextRequest3);
        lblNextRequest3.setBounds(120, 260, 230, 70);

        lblNextRequest4.setFont(new java.awt.Font("Postino Std", 1, 18)); // NOI18N
        jPanel1.add(lblNextRequest4);
        lblNextRequest4.setBounds(120, 350, 230, 70);

        lblNextRequest5.setFont(new java.awt.Font("Postino Std", 1, 18)); // NOI18N
        jPanel1.add(lblNextRequest5);
        lblNextRequest5.setBounds(120, 450, 230, 70);

        getContentPane().add(jPanel1);
        jPanel1.setBounds(30, 240, 370, 550);

        btnStart.setText("INICIAR");
        getContentPane().add(btnStart);
        btnStart.setBounds(550, 760, 73, 23);

        Imagebackground.setIcon(new javax.swing.ImageIcon("C:\\Users\\Gazebo\\Documents\\ProjetosGithub\\SistemaPizzaria\\Images\\WallpaperDesktop2.jpg")); // NOI18N
        Imagebackground.setText("jLabel1");
        Imagebackground.setMaximumSize(new java.awt.Dimension(1440, 900));
        getContentPane().add(Imagebackground);
        Imagebackground.setBounds(-130, -20, 1570, 870);

        jMenu1.setText("Pedidos atuais");
        jMenuBar1.add(jMenu1);

        jMenu2.setText("Histórico de pedidos");
        jMenuBar1.add(jMenu2);

        setJMenuBar(jMenuBar1);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnFinishRequestActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnFinishRequestActionPerformed

        try {
            connection.Close();
            connection = new SocketConnection("192.168.0.5",  3000);
            
            
             AllRequests = connection.SendMessage(String.valueOf(jsonObj));
             AllRequestsJson = new JSONObject(AllRequests);
                  
              FirstRequest = new JSONObject(AllRequestsJson.get("1").toString());
              FirstRequest.put("ID", "DesktopFinishRequest");
              
             connection.SendFinishRequest(FirstRequest.toString());
            
        } catch (IOException ex) {
            Logger.getLogger(ActualRequests.class.getName()).log(Level.SEVERE, null, ex);
        }
                
    }//GEN-LAST:event_btnFinishRequestActionPerformed

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
            java.util.logging.Logger.getLogger(ActualRequests.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ActualRequests.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ActualRequests.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ActualRequests.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ActualRequests().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel Imagebackground;
    private javax.swing.JPanel PanelLastRequest;
    private javax.swing.JLabel blComments;
    private javax.swing.JButton btnFinishRequest;
    private javax.swing.JButton btnStart;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel lblAddress;
    private javax.swing.JLabel lblAddress1;
    private javax.swing.JLabel lblClient;
    private javax.swing.JLabel lblComments;
    private javax.swing.JLabel lblNextRequest1;
    private javax.swing.JLabel lblNextRequest2;
    private javax.swing.JLabel lblNextRequest3;
    private javax.swing.JLabel lblNextRequest4;
    private javax.swing.JLabel lblNextRequest5;
    private javax.swing.JLabel lblPhone;
    private javax.swing.JLabel lblPizzaTaste;
    private javax.swing.JLabel lblPizzaType;
    private javax.swing.JLabel lblTotalPrice;
    private javax.swing.JLabel lbltotalPrice;
    // End of variables declaration//GEN-END:variables

    @Override
    public void actionPerformed(ActionEvent e) {
        try {
                connection = new SocketConnection("192.168.0.5",  3000);
                
                AllRequests = connection.SendMessage(String.valueOf(jsonObj));
                AllRequestsJson = new JSONObject(AllRequests);
                  
                FirstRequest = new JSONObject(AllRequestsJson.get("1").toString());
               
                System.out.println(FirstRequest.toString());
                
                lblClient.setText(FirstRequest.get("client").toString());
                
                lblPizzaType.setText("Tamanho: " +FirstRequest.get("pizzaType").toString());
                lblPizzaTaste.setText("Sabor: " + FirstRequest.get("pizzaTaste1").toString());
                
                lblAddress.setText("<html>"+FirstRequest.get("address").toString().replace("\n", "<br/>")+"</html>");
                
                lblPhone.setText(FirstRequest.get("phone").toString());
                
                lblComments.setText(FirstRequest.get("comments").toString());
                
                lbltotalPrice.setText(FirstRequest.get("totalPrice").toString());
                
                
                try{
                     NextRequest = new JSONObject(AllRequestsJson.get("2").toString());
               
                     lblNextRequest1.setText("<html>"+NextRequest.get("pizzaType").toString()+"<br/>"+NextRequest.get("pizzaTaste1").toString()+"</html>");
               
                    
                    
                }catch(JSONException ex){
                    System.out.println("NAO EXISTE");
                }
                
                try{
                     NextRequest = new JSONObject(AllRequestsJson.get("3").toString());
               
                     lblNextRequest2.setText("<html>"+NextRequest.get("pizzaType").toString()+"<br/>"+NextRequest.get("pizzaTaste1").toString()+"</html>");
               
                    
                    
                }catch(JSONException ex){
                    System.out.println("NAO EXISTE");
                }
                
                try{
                     NextRequest = new JSONObject(AllRequestsJson.get("4").toString());
               
                     lblNextRequest3.setText("<html>"+NextRequest.get("pizzaType").toString()+"<br/>"+NextRequest.get("pizzaTaste1").toString()+"</html>");
               
                    
                    
                }catch(JSONException ex){
                    System.out.println("NAO EXISTE");
                }
                
                try{
                     NextRequest = new JSONObject(AllRequestsJson.get("5").toString());
               
                     lblNextRequest4.setText("<html>"+NextRequest.get("pizzaType").toString()+"<br/>"+NextRequest.get("pizzaTaste1").toString()+"</html>");
               
                    
                    
                }catch(JSONException ex){
                    System.out.println("NAO EXISTE");
                }
                
                try{
                     NextRequest = new JSONObject(AllRequestsJson.get("6").toString());
               
                     lblNextRequest5.setText("<html>"+NextRequest.get("pizzaType").toString()+"<br/>"+NextRequest.get("pizzaTaste1").toString()+"</html>");
               
                   
                } catch (JSONException ex) {
                    System.out.println("NAO EXISTE");
                    }
            
            
            
        } catch (IOException ex) {
            Logger.getLogger(ActualRequests.class.getName()).log(Level.SEVERE, null, ex);
        } 
    }
        
  }
    /*class ActionListenerLoop implements ActionListener{

        @Override
        public void actionPerformed(ActionEvent e) {
            try {
                connection = new SocketConnection("192.168.0.5",  3000);
                
                AllRequests = connection.SendMessage(String.valueOf(jsonObj));
                AllRequestsJson = new JSONObject(AllRequests);
                  
                FirstRequest = new JSONObject(AllRequestsJson.get("1").toString());
               
                System.out.println(FirstRequest.toString());
                
                lblClient.setText(FirstRequest.get("client").toString());
                
                lblPizzaType.setText("Tamanho: " +FirstRequest.get("pizzaType").toString());
                lblPizzaTaste.setText("Sabor: " + FirstRequest.get("pizzaTaste1").toString());
                
                lblAddress.setText("<html>"+FirstRequest.get("address").toString().replace("\n", "<br/>")+"</html>");
                
                lblPhone.setText(FirstRequest.get("phone").toString());
                
                lblComments.setText(FirstRequest.get("comments").toString());
                
                lbltotalPrice.setText(FirstRequest.get("totalPrice").toString());
                
                
                try{
                     NextRequest = new JSONObject(AllRequestsJson.get("2").toString());
               
                     lblNextRequest1.setText("<html>"+NextRequest.get("pizzaType").toString()+"<br/>"+NextRequest.get("pizzaTaste1").toString()+"</html>");
               
                    
                    
                }catch(JSONException ex){
                    System.out.println("NAO EXISTE");
                }
                
                try{
                     NextRequest = new JSONObject(AllRequestsJson.get("3").toString());
               
                     lblNextRequest2.setText("<html>"+NextRequest.get("pizzaType").toString()+"<br/>"+NextRequest.get("pizzaTaste1").toString()+"</html>");
               
                    
                    
                }catch(JSONException ex){
                    System.out.println("NAO EXISTE");
                }
                
                try{
                     NextRequest = new JSONObject(AllRequestsJson.get("4").toString());
               
                     lblNextRequest3.setText("<html>"+NextRequest.get("pizzaType").toString()+"<br/>"+NextRequest.get("pizzaTaste1").toString()+"</html>");
               
                    
                    
                }catch(JSONException ex){
                    System.out.println("NAO EXISTE");
                }
                
                try{
                     NextRequest = new JSONObject(AllRequestsJson.get("5").toString());
               
                     lblNextRequest4.setText("<html>"+NextRequest.get("pizzaType").toString()+"<br/>"+NextRequest.get("pizzaTaste1").toString()+"</html>");
               
                    
                    
                }catch(JSONException ex){
                    System.out.println("NAO EXISTE");
                }
                
                try{
                     NextRequest = new JSONObject(AllRequestsJson.get("6").toString());
               
                     lblNextRequest5.setText("<html>"+NextRequest.get("pizzaType").toString()+"<br/>"+NextRequest.get("pizzaTaste1").toString()+"</html>");
               
                    
                    
                }catch(JSONException ex){
                    System.out.println("NAO EXISTE");
                }
                
                
                connection.Close();
                
                
            } catch (JSONException ex) {
                Logger.getLogger(ActualRequests.class.getName()).log(Level.SEVERE, null, ex);
            } catch (IOException ex) {
                Logger.getLogger(ActualRequests.class.getName()).log(Level.SEVERE, null, ex);
            }
            
            
            
        }
        
    }*/
    

