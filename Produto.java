import java.time.LocalDate;


public class Produto{
    private String nome;
    private double preco;
    private Data dataValidade;
    
    //Método construtor
    public Produto(String nome, double preco, Data dataValidade){
        this.nome = nome;
        this.preco = preco;
        this.dataValidade = dataValidade;
    }   

    //Métodos de acesso Getters and Setters
    public String getNome(){
        return nome;
    }
    
    public double getPreco(){
        return preco;
    }
    
    public Data getDataValidade(){
        return dataValidade;
    }
    
    public void setNome(String nome){
        this.nome = nome;
    }
    
    public void setPreco(double preco){
        this.preco = preco;
    }
    
    public void setDataValidade(Data data){
        this.dataValidade = dataValidade;
    }
    
// método para verificar se o produto está vencido
public boolean estaVencido(Data validade) {
    Data prod = getDataValidade();
    if(prod.getAno() < validade.getAno()){
        return true;
    }else if(prod.getAno() == validade.getAno()){
        if(prod.getMes() < validade.getMes()){
            return false;
        }else if(prod.getMes() == validade.getMes()){
            if(prod.getDia() <= validade.getDia()){
                return false;
            }else{
                return true;
            }
        }else{
            return true;
        }
    }else{
        return true;
    }
}
    
    
/*// método para verificar se o produto está vencido
public boolean estaVencido() {
    Data hoje = new Data(23, 10, 2023);
    if (hoje.getAno() > dataValidade.getAno()) {
        return true;
    } else if (hoje.getAno() == dataValidade.getAno() && hoje.getMes() > dataValidade.getMes()) {
        return true;
    } else if (hoje.getAno() == dataValidade.getAno() && hoje.getMes() == dataValidade.getMes() && hoje.getDia() > dataValidade.getDia()) {
        return true;
    } else {
        return false;
    }
}*/

public String exibeCondValidade() {
    if (estaVencido(new Data(20, 10, 2023))) {
        return "PRODUTO VENCIDO";
    } else {
        return "PRODUTO NÃO VENCIDO";
    }
}


    
    //Método toString 
    @Override
    public String toString(){
        return "Produto [\n"+
                        " Nome: " +this.nome +
                        " Preço: " +this.preco + "]" + "\n\n" + exibeCondValidade() + "\n\n\n"; 
    }
}