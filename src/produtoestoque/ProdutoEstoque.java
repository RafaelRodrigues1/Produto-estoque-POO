package produtoestoque;

import java.util.Scanner;

/**
 * @author RafaelRodrigues1
 */
public class ProdutoEstoque {

    public static void main(String[] args) {
        
        Scanner in = new Scanner(System.in);        
        String p = new String();
        System.out.print("Quantos produtos deseja cadastrar? ");
        int a = in.nextInt();
        Produto produto[] = new Produto[a];
        for(int i = 0; i<produto.length; i++){
            produto[i] = new Produto();
            }
        
        for(int i=0; i<produto.length; i++){
            System.out.printf("(CADASTRO) Digite o nome do produto%d: ", i+1);
            produto[i].nome = in.next();
            System.out.printf("(CADASTRO) Digite o preço do produto%d: ", i+1);
            produto[i].preco = in.nextInt();
            System.out.printf("(CADASTRO) Digite a quantidade de entrada do produto%d: ", i+1);
            produto[i].quantidade = in.nextInt();
        }
        
        do{
            System.out.print("Digite nome do produto (0 PARA SAIR): ");
            p = in.next().toUpperCase();
            for (Produto pesquisa : produto) {
                if (p.equals(pesquisa.nome.toUpperCase())) {
                    pesquisa.menuProduto();            
                }
            }
        }while(!(produto.equals("0")));
    }
    
}
