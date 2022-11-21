/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package view;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Random;
import javax.swing.JOptionPane;
import classes.Usuario;

/**
 *
 * @author nicolas_nichnig
 */
public class TelaLogin extends javax.swing.JFrame {

    static ArrayList<Usuario> lista = new ArrayList<>();
    static String[] serial;
    Usuario a;
    public TelaLogin() {
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

        btnLogin = new javax.swing.JButton();
        btnCadastro = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        campoSenha = new javax.swing.JPasswordField();
        campoEmail = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setFocusable(false);
        setResizable(false);

        btnLogin.setText("Login");
        btnLogin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLoginActionPerformed(evt);
            }
        });

        btnCadastro.setBackground(new java.awt.Color(255, 255, 255));
        btnCadastro.setText("Cadastrar");
        btnCadastro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCadastroActionPerformed(evt);
            }
        });

        campoSenha.setText("Senha");
        campoSenha.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                campoSenhaMouseClicked(evt);
            }
        });

        campoEmail.setText("Email");
        campoEmail.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                campoEmailMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(158, 158, 158)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(btnLogin)
                    .addComponent(btnCadastro)
                    .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, 100, Short.MAX_VALUE)
                    .addComponent(campoSenha)
                    .addComponent(campoEmail))
                .addContainerGap(142, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(40, 40, 40)
                .addComponent(campoEmail, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(campoSenha, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnLogin)
                .addGap(1, 1, 1)
                .addComponent(btnCadastro)
                .addContainerGap(139, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnCadastroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCadastroActionPerformed
    try{
    cadastro();
    }
    catch(Exception e){
    jLabel1.setText("Informações erradas");}
    }//GEN-LAST:event_btnCadastroActionPerformed

    private void btnLoginActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLoginActionPerformed
        String email = campoEmail.getText();
        String senha = campoSenha.getText();
        TelaAdmin.lista = lista;
        TelaUsuario.lista = lista;
        Display.lista = lista;
        for(Usuario a:lista){
        if(a.Email.equals(email) && a.Senha.equals(senha)){
            if(a.Permissao){
                TelaAdmin.abrir();
                dispose();
                TelaAdmin.u = a;
            }
            else{
                TelaUsuario.abrir();
                dispose();
                TelaUsuario.u = a;
            }
        }
        campoEmail.setText("");
        campoSenha.setText("");
        }
    }//GEN-LAST:event_btnLoginActionPerformed

    private void campoSenhaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_campoSenhaMouseClicked
        campoSenha.setText("");
    }//GEN-LAST:event_campoSenhaMouseClicked

    private void campoEmailMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_campoEmailMouseClicked
        campoEmail.setText("");
    }//GEN-LAST:event_campoEmailMouseClicked

    public void cadastro(){
    String Nome = JOptionPane.showInputDialog(this,"Insira seu nome");
    String Email = JOptionPane.showInputDialog(this, "Insira seu Email");
    int Idade = Integer.parseInt(JOptionPane.showInputDialog(this, "insira sua idade"));
    String Sexo = JOptionPane.showInputDialog(this, "Insira seu sexo");
    String Imagem = null;
    String Senha = JOptionPane.showInputDialog(this, "Insira sua senha");
    Boolean Permissao = false;
    Usuario p = new Usuario(Nome, Email, Idade, Sexo, Imagem, Senha, Permissao);
    lista.add(p);
    criarSerial(p);
    String Serial[] = serial;
    }
    
    public void cadastroAdmin1(){
    String Nome = "Admin";
    String Email = "Admin";
    int Idade = 35;
    String Serial[] = {"A","D","B","4","2","N","M","2","N","M","7","8"};
    String Sexo = "Masculino";
    String Imagem = null;
    String Senha = "Admin";
    Boolean Permissao = true;
    Usuario first = new Usuario(Nome, Email, Idade, Sexo, Imagem, Senha, Permissao);
    first.setSerial(Serial);
    lista.add(first);
    }
    
    public void criarSerial(Usuario a){
        String[] letras = {"A","B","C","D","F","G","H","I","J","K","L","M","N","O","P","Q","R","S","T","U","V","W","X","Y","Z","0","1","2","3","4","5","6","7","8","9"};
        serial = new String[12];
        Random ran = new Random();

            if(a.Permissao){
            serial[0] = letras[ran.nextInt(17)];            
            }
            else{serial[0] = letras[ran.nextInt(17)+17];}

            for(int i = 1; i < 12; i++){
                serial[i] = letras[ran.nextInt(34)];
            }
            a.setSerial(serial);       
    }
    
    public static void main(String args[]) {
            
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                TelaLogin tl = new TelaLogin();
                tl.setVisible(true);
                tl.cadastroAdmin1();
            }
        });
    }
    public static void abrir() {
            
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new TelaLogin().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnCadastro;
    private javax.swing.JButton btnLogin;
    private javax.swing.JTextField campoEmail;
    private javax.swing.JPasswordField campoSenha;
    private javax.swing.JLabel jLabel1;
    // End of variables declaration//GEN-END:variables
}
