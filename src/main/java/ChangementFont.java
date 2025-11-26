
import java.awt.Font;

import bandeau.Bandeau;


public class ChangementFont implements Effect {
    @Override
    public void play(Bandeau bandeau) {
        String oldMessage = bandeau.getMessage();
        bandeau.setMessage("Changement de police !");
        
        String[] fonts = {"Serif", "SansSerif", "Monospaced", "Dialog", "DialogInput"};
        
        for (String font : fonts) {
            bandeau.setFont(new Font(font, Font.BOLD, 20));
            bandeau.sleep(1000);
        }
        
        bandeau.setFont(new Font("Default", Font.PLAIN, 20));
        bandeau.setMessage(oldMessage);
    }
    
}
