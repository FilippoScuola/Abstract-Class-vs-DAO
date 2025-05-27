
public abstract class Veicolo{
    //Dichiarazione variabili della classe astratta
    private String marca;
    private String modello;
    
    
    // costruttore
    public Veicolo(String marca, String modello) {
        this.marca = marca;
        this.modello = modello;
    }

    //Dichiarazione dei metodi per ottenere il valore delle variabili
    
    public String getMarca() {
        return this.marca;
    }

    public String getModello() {
        return this.modello;
    }

    //Metodi per impostare il valore delle variabili
    public void setMarca(String marca) {
        this.marca = marca;
    }

    public void setModello(String modello) {
        this.modello = modello;
    }
    
    //Metodo toString per ottenere la rappresentazione del veicolo
    @Override
    public String toString() {
        return (this.marca + ";" + this.modello );
    }

    //Metodi astratti relativi al veicolo
    public abstract void setTarga(String targa);

    public abstract String getTarga();

    public abstract void accelera();

    public abstract void frena();
}