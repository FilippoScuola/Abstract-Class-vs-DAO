public class Auto extends Veicolo{
    //variabile targa che di tipo stringa
    private String targa;
    //costruttore
    public Auto(String marca,String modello){
        super(marca,modello);
    }

    // sovrascrizione del metodo astratto "setTarga" per impostare la targa del veicolo
    @Override
    public void setTarga(String targa){
        this.targa = targa;
    }
    // sovrascrizione del metodo astratto "getTarga" per ottenere la targa del veicolo
    @Override
    public String getTarga() {
        return this.targa;
    }

    // sovrascrizione del metodo astratto "accelera"
    @Override
    public void accelera(){
        System.out.println("La macchina avanza");
    }

    // sovrascrizione del metodo astratto "frena"
    @Override
    public void frena(){
        System.out.println("La macchina frena");
    }
}