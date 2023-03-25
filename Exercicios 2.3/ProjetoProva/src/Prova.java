
import java.util.Scanner;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author fuzil
 */
public class Prova {
    
    private String nome;
    private double pontos;
    private String Nivel;

    public Prova() {
        this("",0,"");
    }

    public Prova(String nome, double pontos, String Nivel) {
        this.nome = nome;
        this.pontos = pontos;
        this.Nivel = Nivel;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double getPontos() {
        return pontos;
    }

    public void setPontos(double pontos) {
        this.pontos = pontos;
    }

    public String getNivel() {
        return Nivel;
    }

    public void setNivel(String Nivel) {
        this.Nivel = Nivel;
    }
    
    public void nivelProva(){
        Scanner leia=new Scanner(System.in);
        System.out.println("Digite o nome do Aluno:");
        setNome(leia.next());
        
        System.out.println("Digite a quantidade de pontos obtida de 0 a 300:");
        setPontos(leia.nextDouble());
        
        
    }
    
    public void listarResultado(){
        
        if( getPontos()<=100){
            setNivel("Nível 1");
        }else if (getPontos()>100 && getPontos()<200){
            setNivel("Nível 2");
        }else if (getPontos()>=200){
            setNivel("Nivel 3");
        }
        
    }
    
    public String listarSituacao(){
        return "Os dados do participante: "+
                "\n Nome:" +getNome()+
                "\n Pontos:" + getPontos()+
                "\n Nivel:" + getNivel();
    }
    
}
