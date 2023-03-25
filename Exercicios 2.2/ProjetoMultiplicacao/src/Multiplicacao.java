
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
public class Multiplicacao {
    
    private Scanner leia= new Scanner(System.in);
    private int valor;
    private int resultado;

    public Multiplicacao() {
        this (0,0);
        
        //para double 0.0
        // para int 0
    }

    public Multiplicacao(int valor, int resultado) {
        this.valor = valor;
        this.resultado = resultado;
    }

    public Scanner getLeia() {
        return leia;
    }

    public void setLeia(Scanner leia) {
        this.leia = leia;
    }

    public int getValor() {
        return valor;
    }

    public void setValor(int valor) {
        this.valor = valor;
    }

    public int getResultado() {
        return resultado;
    }

    public void setResultado(int resultado) {
        this.resultado = resultado;
    }
    
    public void  Multiplicacao4(){
        System.out.println("Digite um número inteiro, para ser multiplicado por 4");
        setValor(leia.nextInt());
        resultado=valor*4;
        // também pode ser escrito de forma a inserir o resultado através de uma função
        //setResultado(getValor()*4)
        
    }
    
    public String MostrarMultiplicacao(){
        return "O resultado" + getResultado();
        //System.out.println("O resultado da multiplicação do número digitado é:"+getResultado());
        
    }

    
}
