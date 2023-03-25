import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author fuzil
 */
public class Principal {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        Combustivel comb= new Combustivel();
        
        Scanner leia = new Scanner(System.in);
        
        System.out.println("Digite a Kilometragem Rodada");
        double km = leia.nextDouble();
        comb.CalcularLitros(km);
        
        System.out.println("Digite o valor do combustivel");
        double ValorComb = leia.nextDouble();
        comb.CalcularTotalGasto(ValorComb);

        System.out.println("O Valor gasto foi de: "+comb.getTotalGasto()+ " Reais");
        
    }
    
}