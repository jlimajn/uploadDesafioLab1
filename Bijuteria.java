

public class Bijuteria extends Loja {
    private double metaVendas;

    //Construtor 
    public Bijuteria(String nome, int quantidadeFuncionarios, double salarioBaseFuncionario, Endereco endereco, Data dataFundacao, double metaVendas, int quantidadeMaximaProdutos){
        super(nome, quantidadeFuncionarios, salarioBaseFuncionario, endereco, dataFundacao, quantidadeMaximaProdutos);
        this.metaVendas = metaVendas;

    }
    
    public double getMetaVendas() {
        return metaVendas;
    }

    public void setMetaVendas(double metaVendas) {
        this.metaVendas = metaVendas;
    }

    @Override
    public String toString(){
        return super.toString() + "Meta de Vendas: " + this.metaVendas + "]"; //Herda toString de Loja e concatena variavel meta de vendas
    }


}

