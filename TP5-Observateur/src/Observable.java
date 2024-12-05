import java.util.ArrayList;

public abstract class Observable {
    protected ArrayList<Observateur> mesObservateurs = new ArrayList<>();

    public boolean ajouterObservateur(Observateur obs) {
        return mesObservateurs.add(obs);
    }

    public boolean supprimerObservateur(Observateur obs) {
        return mesObservateurs.remove(obs);
    }

    public boolean existeObservateur(Observateur obs) {
        return mesObservateurs.contains(obs);
    }

    protected void notifierObservateurs() {
        for (Observateur obs : mesObservateurs) {
            obs.reagir();
        }
    }
}
