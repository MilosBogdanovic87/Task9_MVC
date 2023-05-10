package milosbogdanovic;

public class HanojController {
	
	// Controller povezuje Model i View, odnosno upravlja interakcijom između njih. Ovaj controller sadrži samo jednostavnu metodu koja će pozvati funkciju resiHanojskeTornjeve iz HanojModel klase i ispisuje poruku za korisnika.

    private HanojModel model;
    private HanojView view;

    public HanojController(HanojModel model, HanojView view) {
        this.model = model;
        this.view = view;
    }

    public void pokreniIgru() {
        view.ispisiPorukuZaIgru();
        model.resiHanojskeTornjeve('A', 'B', 'C', 4);
    }
    
}
