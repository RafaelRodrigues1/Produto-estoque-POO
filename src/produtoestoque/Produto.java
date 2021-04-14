package produtoestoque;

import java.util.Scanner;

/**
 * @author RafaelRodrigues1
 */
public class Produto {
    
    
    Scanner in = new Scanner(System.in);
    public String nome;
    public double preco;
    public int quantidade;
    
    private Double precoTotal(){
        double precototal = this.preco*this.quantidade;
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
        System.out.printf("Nome do produto: \t%s\n", this.nome);
        System.out.printf("Preço do produto: \tR$%.2f\n", this.preco);
        System.out.printf("Quantidade em estoque: \t%d\n", this.quantidade);
        System.out.printf("Valor total: \t\tR$%.2f\n", this.precoTotal());
    }
    
    public void menuProduto(){
        int resp;
        do{
            System.out.print(this.nome + ": ADICIONAR[1], REMOVER[2] ou CONSULTAR[3] produto? ([0] para SAIR)");
            resp = in.nextInt();
            switch(resp){
                case 1 -> this.addProduto();
                case 2 -> this.removeProduto();
                case 3 -> this.infoProduto();
            }
        }while(resp!=0);
    }
    
}
