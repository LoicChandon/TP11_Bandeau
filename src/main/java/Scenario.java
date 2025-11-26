import java.util.ArrayList;
import java.util.List;

import bandeau.Bandeau;

public class Scenario {

        // Classe interne privée : simple structure de données
    private static class Etape {
        Effect effect;
        int repetitions;

        public Etape(Effect effect, int repetitions) {
            this.effect = effect;
            this.repetitions = repetitions;
        }
    }

    private final List<Etape> etapes = new ArrayList<>();

    /**
     * Ajoute un effet au scénario.
     * @param e L'effet à ajouter
     * @param repetitions Nombre de répétitions de l'effet
     */
    public void ajouterEffect(Effect e, int repetitions) {
        if (repetitions > 0) {
            etapes.add(new Etape(e, repetitions));
        }
    }

    /**
     * Joue le scénario complet sur le bandeau.
     * @param b Le bandeau cible
     */
    public void play(Bandeau b) {
        for (Etape etape : etapes) {
            for (int i = 0; i < etape.repetitions; i++) {
                etape.effect.play(b);
            }
        }
    }
    
}
