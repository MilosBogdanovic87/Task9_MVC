package milosbogdanovic;

public class HanojView {
	
	// View predstavlja korisnički interfejs za igranje Hanojskih tornjeva. U ovom primeru, jednostavno ispisujemo poruku na konzoli koja će korisnika uputiti kako da pokrene igricu.

    public void ispisiPorukuZaIgru() {
        System.out.println("Da biste igrali Hanojske tornjeve, pozovite sledeću funkciju:");
        System.out.println("resiHanojskeTornjeve(char a, char b, char c, int n)");
        System.out.println("gde su 'a', 'b' i 'c' karakteri koji predstavljaju štapiće na kojima su diskovi,");
        System.out.println("a 'n' predstavlja broj diskova koji se nalaze na početnom štapiću 'a'.");
    }
    
}
