
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
        
        Scanner leia=new Scanner(System.in);
        Temperatura temp = new Temperatura();
        
        int t;
        Double C,F;
        
        System.out.println("Escolha 1 para Farenheit ou 2 para Celsius");
        t=(leia.nextInt());
        
        if (t==1){
            System.out.println("Digite a temperatura em Celcius:");
            C=leia.nextDouble();
            temp.CalcularTempFahrenheit(C);
           
            
        }else{
            System.out.println("Digite a temperatura em Fahrenheit:");
            F=leia.nextDouble();
            temp.CalcularTempCelsius(F);
            
        }
        
        
        
       
    }
    
}
