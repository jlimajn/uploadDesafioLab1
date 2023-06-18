 

public class Loja{
    private String nome;
    private int quantidadeFuncionarios;
    private double salarioBaseFuncionario; 
    private Endereco endereco;
    private Data dataFundacao;
    private Produto[] estoqueProdutos;


    //Método contrutor
    public Loja(String nome, int quantidadeFuncionarios, double salarioBaseFuncionario, Endereco endereco, Data dataFundacao, int quantidadeMaximaProdutos/*Produto[] estoqueProdutos */){
    this.nome = nome;
    this.quantidadeFuncionarios = quantidadeFuncionarios;
    this.salarioBaseFuncionario = salarioBaseFuncionario;
    this.endereco = endereco;
    this.dataFundacao = dataFundacao;
    this.estoqueProdutos = new Produto[quantidadeMaximaProdutos];
    //this.estoqueProdutos = estoqueProdutos;
    }
    
    public Loja(String nome, int quantidadeFuncionarios, Endereco endereco, Data dataFundacao, int quantidadeMaximaProdutos) {
        this.nome = nome;
        this.quantidadeFuncionarios = quantidadeFuncionarios;
        this.endereco = endereco;
        this.dataFundacao = dataFundacao;
        this.salarioBaseFuncionario = -1;
        //this.estoqueProdutos = estoqueProdutos;
       this.estoqueProdutos = new Produto[quantidadeMaximaProdutos];
    }
    
    
    /*public Loja(String nome, int quantidadeFuncionarios) {
        this(nome, quantidadeFuncionarios, -1);
    }*/
    
    //Métodos de acesso Getters and Setters
    public String getNome(){
        return nome;
    }
    
    public int getQuantidadeFuncionarios(){
        return quantidadeFuncionarios;
    }
    
    public double getSalarioBaseFuncionario(){
        return salarioBaseFuncionario;
    }
    
    public Endereco getEndereco(){
        return endereco;
    }
    
    public Data getDataFundacao(){
        return dataFundacao;
    }
    
    public void setNome(String nome){
        this.nome = nome;
    }
    
    public void setQuantidadeFuncionarios(int quantidadeFuncionarios){
        this.quantidadeFuncionarios = quantidadeFuncionarios;
    }
    
    public void setSalarioBaseFuncionario(double salarioBaseFuncionario){
        this.salarioBaseFuncionario = salarioBaseFuncionario;
    }
    
    public void setEndereco(Endereco endereco){
        this.endereco = endereco;
    }
    
    public void setDataFundacao(Data dataFundacao){
        this.dataFundacao = dataFundacao;
    }

    public Produto[] getEstoqueProdutos() {
        return estoqueProdutos;
    }

    public void setEstoqueProdutos(Produto[] estoqueProdutos) {
        this.estoqueProdutos = estoqueProdutos;
    }
    
    //Método gastos com salário
    public double gastosComSalario(){
        if (salarioBaseFuncionario == -1){
            return -1;
        }
        return quantidadeFuncionarios * salarioBaseFuncionario;
    }
    
    //Método tamanho da loja
    public char  tamanhoDaLoja(){
        if (quantidadeFuncionarios <= 9){
            return 'P';
        }
        else if (quantidadeFuncionarios >= 10 && quantidadeFuncionarios <= 30){
            return 'M';
        }
        else{
            return 'G';
        }
    } 
    
    // método imprimeProdutos
    public void imprimeProdutos(){
        System.out.println("Lista de Produtos da Loja: ");
        for (int i = 0; i < estoqueProdutos.length; i++){
            System.out.println(estoqueProdutos[i]);
        }
    }

    
    // método insereProdutos
    public boolean insereProduto(Produto produto) {
        for (int i = 0; i < estoqueProdutos.length; i++) {
            if (estoqueProdutos[i] == null) {
                estoqueProdutos[i] = produto;
                return true;
            }
        }
        return false;
    }

    //método removeProduto
    public boolean removeProduto(String nomeProduto) {
        for (int i = 0; i < estoqueProdutos.length; i++) {
            if (estoqueProdutos[i] != null && estoqueProdutos[i].getNome().equals(nomeProduto)) {
                estoqueProdutos[i] = null;
                return true;
            }
        }
        return false;
    }


    
    //Método toString 
    @Override
    public String toString(){
        return "Loja [\n" +
                    " Nome: " + this.nome +
                    " Quantidade de Funcionários: " + this.quantidadeFuncionarios + 
                    " Salário Base: " + this.salarioBaseFuncionario + "]" + "\n" +
                    " Endereco: " + this.endereco+"\n" +
                    " Data de Fundacao: " + this.dataFundacao + "\n" +
                    " Quantidade de Produtos no Estoque: " + estoqueProdutos.length + "]\n\n\n"; 
    }
}

