
import java.util.Scanner;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author fuzil
 */
public class OlimpiadaMatematica {
    
    private String nome;
    private String endereco;
    private double media;
    private double notamenor;
    private double notamaior;

    public OlimpiadaMatematica() {
        this ("","",0.0,0.0,0.0);
    }

    public OlimpiadaMatematica(String nome, String endereco, double media, double notamenor, double notamaior) {
        this.nome = nome;
        this.endereco = endereco;
        this.media = media;
        this.notamenor = notamenor;
        this.notamaior = notamaior;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getEndereco() {
        return endereco;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    public double getMedia() {
        return media;
    }

    public void setMedia(double media) {
        this.media = media;
    }

    public double getNotamenor() {
        return notamenor;
    }

    public void setNotamenor(double notamenor) {
        this.notamenor = notamenor;
    }

    public double getNotamaior() {
        return notamaior;
    }

    public void setNotamaior(double notamaior) {
        this.notamaior = notamaior;
    }
    
    public void CalcularMedia(){
        
        Scanner leia = new Scanner(System.in);
        System.out.println("Digite o nome do participante:");
        setNome(leia.next());
        System.out.println("Digite o endereço do participante");
        setEndereco(leia.next());
        
        System.out.println("Digite a menor nota do aluno:");
        setNotamenor(leia.nextDouble());
        System.out.println("Digite a maior nota do aluno");
        setNotamaior(leia.nextDouble());
        
        setMedia((getNotamenor()+getNotamaior())/2);
        
                
        
    }
    
    public void VerificarMedia(){
    
            if (getMedia()>9)
            {System.out.println("Parabéns. O Aluno está inscrito.");
            } else {
                System.out.println("Infelizmente o aluno tem média insuficiente.");
            }
            
    }
    
    
}
