
import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author dsm-2
 */
public class Quadrado {
    
    Scanner leia=new Scanner(System.in);
    private int numero;
    private int resultado;

        public Quadrado() {
        this(0,0);
        }

    public Quadrado(int numero, int resultado) {
        this.numero = numero;
        this.resultado = resultado;
    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public int getResultado() {
        return resultado;
    }

    public void setResultado(int resultado) {
        this.resultado = resultado;
    }
        
    public void CalcularQuadrado(){
        System.out.println("Digite um numero para ser elevado ao quadrado:\n");
        setNumero(leia.nextInt());
        setResultado((int) Math.pow(getNumero(),2));
                
    }
    
    public String MostrarQuadrado(){
    
        return "O resultado da potenciacao é:"+getResultado();
    }
    
}
