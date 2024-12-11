import java.util.ArrayList;

public class ServeurDeChat extends Médiateur{
    private ArrayList<Utilisateurs> lesUtilisateurs = new ArrayList<Utilisateurs>();
    private String nomChat;

    public boolean existe(Utilisateurs utilisateur) {
        if (lesUtilisateurs.contains(utilisateur)) {
            return true;
        }
        return false;
    }

    public void ajouter(Utilisateurs utilisateur) {
        if (!existe(utilisateur)) {
            lesUtilisateurs.add(utilisateur);
        }
    }

    public void enlever(Utilisateurs utilisateur) {
        if (existe(utilisateur)) {
            lesUtilisateurs.remove(utilisateur);
        }
    }

    public void diffuserMessage(Utilisateurs auteur, String message) {
        for (Utilisateurs utilisateur : lesUtilisateurs) {
            if (!utilisateur.equals(auteur)) {
                utilisateur.recevoirMessageDe(auteur, message);
            }
        }
    }


}
