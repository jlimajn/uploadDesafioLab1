import java.time.LocalDate;

public class Data{
    private int dia;
    private int mes;
    private int ano;
    
    //Método Construtor
    public Data(int dia, int mes, int ano){
    this.dia = dia;
    this.mes = mes;
    this.ano = ano;
    validadorDeData();
    }
    
    //Validador de data: Retorna true ou false (caso false atribui valor padrão de data)
    public void validadorDeData(){
        boolean validaData = true;
        
        if (mes < 1 || mes > 12){
            validaData = false;
        }
        else if (dia < 1 || dia > validadorDiaMes()){
            validaData = false;
        }
        if (!validaData) {
            System.out.println("Data Inválida! Atribuído valor Padrão 1/1/2000");
            this.dia = 1;
            this.mes = 1;
            this.ano = 2000;
        }
    }
    
    //Validador dias do Mês: retorna 28, 29, 30 ou 31 para comparação em validadorDeData()
    public int validadorDiaMes(){
        int validadorDiaMes = 0;
        
        switch (mes){
            //caso mes = fevereiro bissexto = 29 dias, se não 28 dias
            case 2:
                validadorDiaMes = (verificaAnoBissexto()) ? 29: 28;
            break;
            
            //caso mes = Abril, mes com 30 dias
            case 4:
                validadorDiaMes = 30;
            break;
            
            //caso mes = Junho, mes com 30 dias;
            case 6:
                validadorDiaMes = 30;
            break;
            
            //caso mes = Setembro, mes com 30 dias;
            case 9:
                validadorDiaMes = 30;
            break;
            
            //caso mes = Novembro, mes com 30 dias;
            case 11:
                validadorDiaMes = 30;
            break;
            
            //caso nenhuma das alternativas, retona 31 dias
            default:
                validadorDiaMes = 31;        
        }
        
        return validadorDiaMes;
    }
    
    //Método verifica ano Bissexto
    public boolean verificaAnoBissexto(){
        if (ano % 4 == 0){
            return true;
        }
        else {
            return false;
        }
        
    }
    
    //Métodos de acesso Getters and Setters
    public int getDia(){
        return dia;
    }
    
     public int getMes(){
        return mes;
    }
    
    public int getAno(){
        return ano;
    }
    
    public void setDia(int dia){
        this.dia = dia;
    }
    
    public void setMes(int mes){
        this.mes = mes;
    }
    
    public void setAno(int ano){
        this.ano = ano;
    }
    
    //Método toString 
    @Override
    public String toString(){
        return "Data["+ dia + "/" + mes + "/"+ ano + "]"; 
    }
}
