/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author dsm-2
 */
public class Principal {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Loja loja=new Loja();
        
        loja.InserirDadosLoja();
        
        System.out.println(loja.MostrarDadosLoja());
        
        System.out.println(loja.CalcularCompraLoja());
        
    }
    
}
