package milosbogdanovic;

public class Main {

    public static void main(String[] args) {
        HanojModel model = new HanojModel();
        HanojView view = new HanojView();
        HanojController controller = new HanojController(model, view);
        
        controller.pokreniIgru();
    }

}
