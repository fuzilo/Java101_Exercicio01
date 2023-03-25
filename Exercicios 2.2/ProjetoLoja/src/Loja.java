
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
public class Loja {
    
        private String razaoSocial;
        private String cpfCliente;
        private double valorCompra;
        private double qtdItensComp;
        private double valorTotalCompra;

    public Loja() {
        
        this("","",0,0,0);
              
        
    }

    public Loja(String razaoSocial, String cpfCliente, double valorCompra, double qtdItensComp, double valorTotalCompra) {
        this.razaoSocial = razaoSocial;
        this.cpfCliente = cpfCliente;
        this.valorCompra = valorCompra;
        this.qtdItensComp = qtdItensComp;
        this.valorTotalCompra = valorTotalCompra;
    }

    public double getValorTotalCompra() {
        return valorTotalCompra;
    }

    public void setValorTotalCompra(double valorTotalCompra) {
        this.valorTotalCompra = valorTotalCompra;
    }

    public String getRazaoSocial() {
        return razaoSocial;
    }

    public void setRazaoSocial(String razaoSocial) {
        this.razaoSocial = razaoSocial;
    }

    public String getCpfCliente() {
        return cpfCliente;
    }

    public void setCpfCliente(String cpfCliente) {
        this.cpfCliente = cpfCliente;
    }

    public double getValorCompra() {
        return valorCompra;
    }

    public void setValorCompra(double valorCompra) {
        this.valorCompra = valorCompra;
    }

    public double getQtdItensComp() {
        return qtdItensComp;
    }

    public void setQtdItensComp(double qtdItensComp) {
        this.qtdItensComp = qtdItensComp;
    }
       
    
    public void InserirDadosLoja(){
        Scanner leia= new Scanner(System.in);
        System.out.println("Insira a Razão SOcial da Loja:");
        setRazaoSocial(leia.next());
        System.out.println("Digite o CPF do Cliente:");
        setCpfCliente(leia.next());
        System.out.println("Insira o valor Unitário do produto:");
        setValorCompra(leia.nextDouble());
        System.out.println("Insira a quantidade de produtos comprados:");
        setQtdItensComp(leia.nextDouble());
        
        
    }
       public String MostrarDadosLoja(){
           return "Os dados da Loja e do Cliente são: " +
                   "\nLoja: "+ getRazaoSocial() +
                   "\nCPF:"+ getCpfCliente() +
                   "\nValor Unitário: "+ getValorCompra()+
                   "\nQuantidade comprada: "+ getQtdItensComp()
                   ;
       }
       
     public double CalcularCompraLoja(){

        setValorTotalCompra(getQtdItensComp()*getValorCompra());
                System.out.println("O valor Total da Compra é: "); 
              return getValorTotalCompra();
         
            
     }   
       
}
