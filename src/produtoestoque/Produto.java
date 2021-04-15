package produtoestoque;

import java.util.Scanner;

/**
 * @author RafaelRodrigues1
 */
public class Produto {
    
    
    Scanner in = new Scanner(System.in);
    private String nome;
    private double preco;
    private int quantidade;

    public Produto(String nome, double preco, int quant){
        this.nome = nome;
        this.preco = preco;
        this.quantidade = quant;
    }
    
    public String getNome(){
        return this.nome;
    }
    
    public double getPreco(){
        return this.preco;
    }
    
    public int getQuantidade(){
        return this.quantidade;
    }
    
    public void setQuantidade(int quantidade){
        this.quantidade = quantidade;
    }
    
    private Double calcPrecoTotal(){
        double precototal = getPreco()*getQuantidade();
        return precototal;
    }
    
    public void addProduto(){
        System.out.print("Quantos produtos deseja adicionar ao estoque? ");
        this.quantidade += in.nextInt();
    }
    
    public void removeProduto(){
        System.out.print("Quantos produtos deseja remover do estoque? ");
        this.quantidade -= in.nextInt();
    }
    
    public void infoProduto(){
        System.out.printf("Nome do produto: \t%s\n", getNome());
        System.out.printf("Preço do produto: \tR$%.2f\n", getPreco());
        System.out.printf("Quantidade em estoque: \t%d\n", getQuantidade());
        System.out.printf("Valor total: \t\tR$%.2f\n", this.calcPrecoTotal());
    }    
}
