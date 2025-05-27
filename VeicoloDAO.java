
import java.util.ArrayList;
import java.util.List;

public class VeicoloDAO {
    //dichiarazione della lista 
    private List<Veicolo> database = new ArrayList<>();

    // metodo per salvare un veicolo all'interno del vector
    public void salva(Veicolo veicolo) {
        database.add(veicolo);
    }

    // metodo che ritorna la lista con i veicoli
    public List<Veicolo> listaVeicoli() {
        return database;
    }
}
