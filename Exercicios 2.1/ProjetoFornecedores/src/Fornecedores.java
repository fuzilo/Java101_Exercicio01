
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
public class Fornecedores {
    private Scanner leia=new Scanner(System.in);
    
    private String nomeFornecedor;
    private String nomeProduto;
    private String descricaoProduto;

    public Fornecedores() {
        this("","","");
    }

    public Fornecedores(String nomeFornecedor, String nomeProduto, String descricaoProduto) {
        this.nomeFornecedor = nomeFornecedor;
        this.nomeProduto = nomeProduto;
        this.descricaoProduto = descricaoProduto;
    }

    public Scanner getLeia() {
        return leia;
    }

    public void setLeia(Scanner leia) {
        this.leia = leia;
    }

    public String getNomeFornecedor() {
        return nomeFornecedor;
    }

    public void setNomeFornecedor(String nomeFornecedor) {
        this.nomeFornecedor = nomeFornecedor;
    }

    public String getNomeProduto() {
        return nomeProduto;
    }

    public void setNomeProduto(String nomeProduto) {
        this.nomeProduto = nomeProduto;
    }

    public String getDescricaoProduto() {
        return descricaoProduto;
    }

    public void setDescricaoProduto(String descricaoProduto) {
        this.descricaoProduto = descricaoProduto;
    }
    
    
    //Cadastrar Fonecedores e listar fornecedores
    
    public void cadastrarFornecedor(){
        System.out.println("Digite o Fornecedor.");
        setNomeFornecedor(leia.next());
        System.out.println("Digite o nome do Produto:");
        setNomeProduto(leia.next());
        System.out.println("Insira a descrição do Produto:");
        setDescricaoProduto(leia.next());
        
    }
    
    public void listarFornecedor(){
        System.out.println("Os dados do produto são:\n"
                +"\nProduto: " +getNomeProduto()
                +"\nDescrição do Produto: " +getDescricaoProduto()
                +"\nFornecedor: "+getNomeFornecedor()
        );
        
    }
    
}
