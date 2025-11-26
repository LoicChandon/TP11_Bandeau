
import java.util.Random;

import bandeau.Bandeau;

public class Tremblement implements Effect {
    @Override
    public void play(Bandeau bandeau) {
        String oldMessage = bandeau.getMessage();
        bandeau.setMessage("Je tremble (oskour) !");
        
         Random rand = new Random();
        
        for (int i = 0; i < 20; i++) {

            double angle = (rand.nextDouble() - 0.5) * 0.2; 
            bandeau.setRotation(angle);
            bandeau.sleep(50);
        }
        
        bandeau.setRotation(0.0);
        bandeau.setMessage(oldMessage);
    }
    
}
