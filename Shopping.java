public class Shopping {
    private String nome;
    private Endereco endereco;
    private Loja[] lojas;

    //Método contrutor
    public Shopping(String nome, Endereco endereco, int quantidadeMaximaLojas){

        this.nome = nome;
        this.endereco = endereco;
        this.lojas = new Loja[quantidadeMaximaLojas];

    }

    //Métodos de acesso Getters and Setters
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Endereco getEndereco() {
        return endereco;
    }

    public void setEndereco(Endereco endereco) {
        this.endereco = endereco;
    }

    public Loja[] getLojas() {
        return lojas;
    }

    public void setLojas(Loja[] lojas) {
        this.lojas = lojas;
    }

    //Método Insere Loja
    public boolean insereLoja(Loja loja) {
        for (int i = 0; i < lojas.length; i++) {
            if (lojas[i] == null) {
                lojas[i] = loja;
                return true; // Loja inserida com sucesso
            }
        }
        return false; // Não há lugar no array para inserir a loja
    }

    //método removeLoja
    public boolean removeLoja(String nomeLoja){
        for(int i = 0; i < lojas.length; i++){
            if(lojas[i] != null && lojas[i].getNome().equals(nomeLoja)){
                lojas[i] = null;
                return true;
            }
        }
        return false;
    }

    //método quantidadeLojasPorTipo
    public int quantidadeLojasPorTipo(String tipoLoja){
        int quantidade = 0;

    for (Loja loja : lojas) {
        if (loja instanceof Informatica && tipoLoja.equalsIgnoreCase("Informática")) {
            quantidade++;
        } else if (loja instanceof Cosmetico && tipoLoja.equalsIgnoreCase("Cosmético")) {
            quantidade++;
        } else if (loja instanceof Vestuario && tipoLoja.equalsIgnoreCase("Vestuário")) {
            quantidade++;
        } else if (loja instanceof Bijuteria && tipoLoja.equalsIgnoreCase("Bijuteria")) {
            quantidade++;
        } else if (loja instanceof Alimentacao && tipoLoja.equalsIgnoreCase("Alimentação")) {
            quantidade++;
        }
    }

    if (quantidade == 0) {
        return -1; // Nenhum tipo de loja correspondente encontrado
    }

    return quantidade;
}

    


    //método lojaSeguroMaisCaro
    public Informatica lojaSeguroMaisCaro() {
        Informatica lojaMaisCara = null;
        double maiorValorSeguro = 0.0;
        
        for (Loja loja : lojas) {
            if (loja instanceof Informatica) {
                Informatica informatica = (Informatica) loja;
                double valorSeguro = informatica.getSeguroEletronicos();
                
                if (valorSeguro > maiorValorSeguro) {
                    maiorValorSeguro = valorSeguro;
                    lojaMaisCara = informatica;
                }
            }
        }
        
        return lojaMaisCara;
    }



    @Override
    public String toString(){
        return "Shopping[\n"+
        " Nome: " + this.nome +
        " Endereco: " + this.endereco +
        " Lojas: " + lojas.length + "]";


    }

}


