/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sistema_semed;

/**
 *
 * @author ti
 */
public class Sistema_semed {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        JFrm_login login = new JFrm_login();
        /* Foi cria do variavel login para realizar a ativação do Jframe 
        JFrm_login.java.
        */
        login.setLocationRelativeTo(null);
        //Comando para a janela aparecer no centro.
        login.setVisible(true);
        // Comando para tornar a janela visivel.
    }
    
}
