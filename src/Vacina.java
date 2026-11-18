public class Vacina {
    private int numDoses;
    private int intevaloDias;
    private int idadeInicio;
    private String nome;
    private String descricao;
    public Vacina(int numDoses,int intervaloDias,int idadeInicio,String nome,String descricao){
        this.numDoses = numDoses;
        this.intevaloDias = intervaloDias;
        this.idadeInicio = idadeInicio;
        this.nome = nome;
        this.descricao = descricao;
    }

    public int getNumDoses(){
        return numDoses;
    }
    public int getIntevaloDias(){
        return intevaloDias;
    }

    public int getIdadeInicio(){
        return  idadeInicio;
    }

    public String getNome(){
        return nome;
    }



    void descricaoVac(){
        System.out.println("Nome: " + nome +"\n Descrição: " + descricao);
    }
}
