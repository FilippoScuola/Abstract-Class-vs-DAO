public class Bici extends Veicolo{
    //costruttore
    public Bici(String marca,String modello){
        super(marca,modello);
    }

    // sovrascrizione del metodo astratto "setTarga" per impostare la targa del veicolo
    @Override
    public void setTarga(String targa){}

    // sovrascrizione del metodo astratto "getTarga" per ottenere la targa del veicolo
    @Override 
    public String getTarga() {
        return "Targa non disponibile";
    }

    // sovrascrizione del metodo astratto "accelera"
    @Override
    public void accelera(){
        System.out.println("La bici avanza");
    }

    // sovrascrizione del metodo astratto "frena"
    @Override
    public void frena(){
        System.out.println("La bici frena");
    }
}