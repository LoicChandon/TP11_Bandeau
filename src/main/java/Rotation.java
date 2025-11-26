
import bandeau.Bandeau;

public class Rotation implements Effect {
    @Override
    public void play(Bandeau bandeau) {
       String oldMessage = bandeau.getMessage();
        bandeau.setMessage("Je tourne !");
        
        // Tour complet
        for (int i = 0; i <= 100; i++) {
            bandeau.setRotation(2 * Math.PI * (i / 100.0));
            bandeau.sleep(10);
        }
        
        bandeau.setRotation(0.0);
        bandeau.setMessage(oldMessage);
    }
    
}
