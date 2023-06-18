import java.util.Scanner;

import static java.lang.System.in;


public class Principal {
    public static void main(String[] args){
        boolean entrada = true;
        int opcao;
            System.out.println("-------------------------------Laboratório 1--------------------------------");
            while (entrada == true){
            System.out.println("--------------------Gerenciador de Lojas Shopping Center--------------------");    
            System.out.println(
            "[1] - Criar uma Loja:"+"\n"+
            "[2] - Criar um Produto:"+"\n"+
            "[3] - Sair:"+"\n");
            System.out.println("----------------------------------------------------------------------------"+"\n");
            System.out.println("----------------------------------------------------------------------------"+"\n");
            
            Scanner input = new Scanner(System.in); 
            opcao = input.nextInt();
            
       
       
                switch (opcao){
            
                    case 1:
                        Loja loja = Principal.criaLoja();
                        loja.toString();
                        System.out.println("Loja criada\n");
                        System.out.println(loja.toString());

                    break;
            
                    case 2: 
                        Produto p = Principal.criaProduto();
                        System.out.println("Produto criado\n");
                        System.out.println(p.toString());
                        //System.out.println("\nEstá vencido? " + p.estaVencido(new Data(20, 10, 2023)));

                    break;
        
                    case 3:
                        entrada = false;
                        System.out.println("Obrigado por utilizar o programa!");   
                    break;
            
                    default:
                        System.out.println("Valor Inválido");
        
    
         }
         
        
     }
    }

    private static Loja criaLoja(){
        Teclado t = new Teclado();
        
         System.out.println("[Criando loja]\n");
         String nome = t.leString("Nome: ");
         int quantidadeFuncionarios = t.leInt("Quantidade de funcionários: ");
         double salarioBaseFuncionario = t.leDouble("Salário base: ");
        
         System.out.println("Endereço\n");
         String nomeDaRua = t.leString("Rua: ");
         String numero = t.leString("Número: ");
         String complemento = t.leString("Complemento: ");
         String cidade = t.leString("Cidade: ");
         String estado = t.leString("Estado: ");
         String pais = t.leString("País: ");
         String cep = t.leString("CEP: ");
         Endereco endereco = new Endereco(nomeDaRua, cidade, estado, pais, cep, numero, complemento);
        
         System.out.println("Data de fundação\n");
         int dia = t.leInt("Dia: ");
         int mes = t.leInt("Mês: ");
         int ano = t.leInt("Ano: ");
         Data dataFundacao = new Data(dia, mes, ano);
        
         System.out.println("Estoque de Produtos: \n");
         int quantidadeMaximaProdutos = t.leInt("Tamanho de Estoque: ");
         Produto[] estoqueProdutos = new Produto[quantidadeMaximaProdutos];

         Loja loja = new Loja(nome, quantidadeFuncionarios, salarioBaseFuncionario, endereco, dataFundacao, quantidadeMaximaProdutos);
         //loja.insereProduto(criaProduto());
         loja.imprimeProdutos();
         
         return loja;
         
         }

         private static Produto criaProduto(){
             Teclado t = new Teclado();
            
             System.out.println("[Criando produto]");
             String nome = t.leString("Nome: ");
             double preco = t.leDouble("Preço: ");
             System.out.println("Data de validade");
             int dia = t.leInt("Dia: ");
             int mes = t.leInt("Mês: ");
             int ano = t.leInt("Ano: ");
             Data dataValidade = new Data(dia, mes, ano);
            
             Produto produto = new Produto(nome, preco, dataValidade);
            
             return produto;
             }
      
     
     
    
}
    

