

class Menu // HA IL COMPITO DI RESTITUIRE UNA SCELTA DI MENU' FORNITA DAGLI UTENTI
{



 // per definire un menù customizzato basta variare il contenuto delle stringhe componenti il seguente vettore
 public final static String SCELTE[] = 
  {
   "Digita 0 per uscire", 
   "Digita 1 per Visualizzare l'elenco descrittivo di tutti i veicoli.",
   "Digita 2 per Aggiungere una nuova auto data marca, modello e targa.",
   "Digita 3 per Visualizzare l'elenco di tutte le auto.",
   "Digita 4 per Aggiungere una bici data la marca e modello.",
   "Digita 5 per Visualizzare l'elenco di tutte le bici.",
  };



 public static int ScegliVoce() // chiede una scelta da un menù
  {
   int scelta;
   String prompt = "Fai la tua scelta, digitando un numero";

   System.out.println(ChiediDati.SEPARATORE + ChiediDati.SEPARATORE);
   for (int i = 0; i < SCELTE.length; i++)
      {
       System.out.println(SCELTE[i]);
      }
   scelta = ChiediDati.ChiediIntero(prompt, 0, (SCELTE.length) - 1);
   System.out.println(ChiediDati.SEPARATORE + ChiediDati.SEPARATORE);

   return scelta;
  }

}