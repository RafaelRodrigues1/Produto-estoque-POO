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
        in.nextLine();
        Produto produto[] = new Produto[a];
        for(int i = 0; i<produto.length; i++){            
            System.out.printf("(CADASTRO) Digite o nome do produto%d: ", i+1);
            String nome = in.nextLine();
            System.out.printf("(CADASTRO) Digite o preço do produto%d: R$", i+1);
            double preco = in.nextDouble();
            System.out.printf("(CADASTRO) Digite a quantidade de entrada do produto%d: ", i+1);
            int quant = in.nextInt();
            in.nextLine();
            produto[i] = new Produto(nome, preco, quant);
            }
        
        do{
            System.out.println("----------------------------------------------");
            System.out.print("Digite nome do produto (0 PARA SAIR): ");
            p = in.nextLine().toUpperCase();
            for (Produto pesquisa : produto) {
                if (p.equals(pesquisa.getNome().toUpperCase())){
                    int resp;
                    do{
                        System.out.print(pesquisa.getNome().toUpperCase() + ": ADICIONAR[1], REMOVER[2] "
                                + "ou CONSULTAR[3]([0] para SAIR)");
                        resp = in.nextInt();
                        in.nextLine();
                        switch(resp){
                            case 1 -> pesquisa.addProduto();
                            case 2 -> pesquisa.removeProduto();
                            case 3 -> pesquisa.infoProduto();
                            case 0 -> System.out.println("Saindo do menu do produto " + pesquisa.getNome().toUpperCase());
                            default -> System.out.println("DIGITE UMA OPÇÃO VÁLIDA!");
                        }
                    }while(resp!=0);
                }                       
            }
        }while(!(produto.equals("0")));
        System.out.println("Fim de programa!"); 
    }    
}
