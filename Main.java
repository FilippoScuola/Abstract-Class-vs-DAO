import java.util.*;

public class Main {
    

    public static void main(String[] args) {
        VeicoloDAO dao = new VeicoloDAO();
        List<Veicolo> database = dao.listaVeicoli();
    	
    	boolean uscita = false;
        int scelta;
        do{
            scelta = Menu.ScegliVoce();
            switch(scelta){
                case 0: 
                    System.out.println("Grazie per aver usato il programma.");
                    uscita = true;
                    break;
                case 1:
                    System.out.println("Ecco la lista di tutti i veicoli");
                    for(Veicolo a : database){
                        System.out.println("\t-" + a.toString());
                    }
                    break;
                case 2:
                    String marca = ChiediDati.ChiediStringa("Inserire la marca dell'auto");
                    String modello = ChiediDati.ChiediStringa("Inserire modello");
                	String targa = ChiediDati.ChiediStringa("Inserire la targa dell'auto");
                	Auto a = new Auto(marca,modello);
                    a.setTarga(targa);
                    dao.salva(a);
                    break;
                case 3:
                    System.out.println("Ecco l'elenco descrittivo di tutte le auto.");
                    for(Veicolo v : database) {
                    	if(v instanceof Auto) {
                    		System.out.println(v.toString());
                    		v.accelera();
                    		v.frena();
                    		System.out.println();
                    		
                    	}
                    }
                    break;
                case 4:
                    String marca_bici = ChiediDati.ChiediStringa("Inserisci marca");
                    String modello_bici = ChiediDati.ChiediStringa("Inserisci modello");
                    Bici b = new Bici(marca_bici,modello_bici);
                    dao.salva(b);
                    break;
            
                case 5:
                	System.out.println("Ecco l'elenco descrittivo di tutte le bici.");
                    for(Veicolo v : database) {
                    	if(v instanceof Bici) {
                    		System.out.println(v.toString());
                    		v.accelera();
                    		v.frena();
                    		System.out.println();
                    		
                    	}
                    }
                    break;
                default:
                    System.out.println("Scelta non valida. Riprova.");
                    break;
            }
        }while(!uscita);
    }
}
