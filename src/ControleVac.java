import java.util.ArrayList;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class ControleVac {
    private ArrayList<LocalDate> dataInicio =  new ArrayList<>();
    private ArrayList<ArrayList<Vacina>> vacinas = new ArrayList<>();

    public void tomarDose(Vacina v){
        int linha = procuraVac(v);
        if(linha != -1){
            vacinas.get(linha).add(v);
        } else{
            ArrayList<Vacina> novaLinha = new ArrayList<>();
            novaLinha.add(v);
            vacinas.add(novaLinha);
            dataInicio.add(LocalDate.now());
        }

    }
    void geraRelatorio(){
        for(int i = 0; i < vacinas.size()-1; i++){
            for(int n = 0; n < vacinas.get(i).size()-1; n++){

            }
        }
    }

    int procuraVac(Vacina v){
        for(int i = 0; i < vacinas.size();i++){
            if(v.getNome().equals(vacinas.get(i).get(0).getNome());i++)return i;
        }
        return -1;
    }
}