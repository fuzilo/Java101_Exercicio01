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
public class Passagem {
    
    //scanner
    Scanner leia=new Scanner(System.in);    
    
//Declaração de atributos
     
    private String nomePassageiro;
    private String telefone;
    private String rg;
    private String localViagem;
    private String data;
    private String horario;
    private String numPoltrona;

    
    public Passagem() {
        this("","","","","","","");
    }

    public Passagem(String nomePassageiro, String telefone, String rg, String localViagem, String data, String horario, String numPoltrona) {
        
        this.nomePassageiro = nomePassageiro;
        this.telefone = telefone;
        this.rg = rg;
        this.localViagem = localViagem;
        this.data = data;
        this.horario = horario;
        this.numPoltrona = numPoltrona;
    }

    public String getNomePassageiro() {
        return nomePassageiro;
    }

    public void setNomePassageiro(String nomePassageiro) {
        this.nomePassageiro = nomePassageiro;
    }

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    public String getRg() {
        return rg;
    }

    public void setRg(String rg) {
        this.rg = rg;
    }

    public String getLocalViagem() {
        return localViagem;
    }

    public void setLocalViagem(String localViagem) {
        this.localViagem = localViagem;
    }

    public String getData() {
        return data;
    }

    public void setData(String data) {
        this.data = data;
    }

    public String getHorario() {
        return horario;
    }

    public void setHorario(String horario) {
        this.horario = horario;
    }

    public String getNumPoltrona() {
        return numPoltrona;
    }

    public void setNumPoltrona(String numPoltrona) {
        this.numPoltrona = numPoltrona;
    }

//criar métodos cadastrar e mostrar os dados. separar passageiros e passagem

public void cadastrarDadosPassageiro(){
    System.out.println("Digite o nome do Passageiro\n");
    setNomePassageiro(leia.next());
    
        System.out.println("Digite o telefone do Passageiro\n");
    setTelefone(leia.next());
    
        System.out.println("Digite o RG do Passageiro\n");
    setRg(leia.next());
    }

public void cadastrarDadosPassagem(){
    System.out.println("Digite o destino da Viagem\n");
    setLocalViagem(leia.next());
    System.out.println("Digite a data da Viagem\n");
    setData(leia.next());
    System.out.println("Digite o horário de partida\n");
    setHorario(leia.next());
    System.out.println("Digite o numero da poltrona\n");
    setNumPoltrona(leia.next());
    
}

public void mostrarDadosPassageiro(){
    System.out.println("Os dados do passageiro:\n"+
            "Nome: "+getNomePassageiro()+
            "\nTelefone: "+getTelefone()+
            "\nRG: "+getRg());
}

public void mostrarDadosPassagem(){
    System.out.println("Os dados da viagem:\n"+
            "Destino: "+getLocalViagem()+
            "\nData da Viajem: "+getData()+
            "\nHorário de partida:  "+getHorario()+
            "\nNumPoltrona:   "+getNumPoltrona());       
                       
}





}