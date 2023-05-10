package milosbogdanovic;

public class HanojModel {
	
	// Model predstavlja logiku igrice Hanojskih tornjeva. Klasa sadržati rekurzivnu funkciju hanoj koja se koristi za rešavanje problema.

    public void resiHanojskeTornjeve(char a, char b, char c, int n) {
        if (n > 0) {
            resiHanojskeTornjeve(a, c, b, n-1);
            System.out.println(a + " -> " + b);
            resiHanojskeTornjeve(c, b, a, n - 1);
        }
    }
    
}
