import java.awt.Color;

import bandeau.Bandeau;


public class DemoScenario {
     public static void main(String[] args) {
    Bandeau bandeau = new Bandeau();

    bandeau.setBackground(Color.WHITE);
    Scenario scenario = new Scenario();

    bandeau.setMessage("TP Demo Scenario !");
    scenario.ajouterEffect(new Rotation(), 2);
    scenario.ajouterEffect(new ChangementFont(), 1);
    scenario.ajouterEffect(new Tremblement(), 3);
    
    bandeau.sleep(1000);
    scenario.play(bandeau);
    bandeau.setMessage("C'est fini !! (c'était sympatoche)");
    bandeau.sleep(3000);
    bandeau.close();
    }
}
