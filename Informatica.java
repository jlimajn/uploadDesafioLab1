public class Informatica extends Loja {
    private double seguroEletronicos;

    //Construtor
    public Informatica(String nome, int quantidadeFuncionarios, double salarioBaseFuncionario, Endereco endereco, Data dataFundacao, double seguroEletronicos, int quantidadeMaximaProdutos){
        super(nome, quantidadeFuncionarios, salarioBaseFuncionario, endereco, dataFundacao, quantidadeMaximaProdutos);
        this.seguroEletronicos = seguroEletronicos;

    }
    
    public double getSeguroEletronicos() {
        return seguroEletronicos;
    }

    public void setSeguroEletronicos(double seguroEletronicos) {
        this.seguroEletronicos = seguroEletronicos;
    }

    @Override
    public String toString(){
        return super.toString() + "Seguro Eletronicos: " + this.seguroEletronicos + "]"; //Herda toString de produto e concatena variavel Seguro Eletronicos
    }

}
