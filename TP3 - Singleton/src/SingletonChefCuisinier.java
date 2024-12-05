public class SingletonChefCuisinier {
    private static SingletonChefCuisinier instance = null;

    private SingletonChefCuisinier() {};

    public static SingletonChefCuisinier getInstance() {
        if (instance == null) {
            instance = new SingletonChefCuisinier();
        }
        return instance;
    }

    private String nom;
    private String prenom;
    private String nationalite;

    public void setNom(String n) {
        nom = n;
    }

    public void setPrenom(String p) {
        prenom = p;
    }

    public String getNom() {
        return nom;
    }

    public String getPrenom() {
        return prenom;
    }

    public void setNationalite(String n) {
        nationalite = n;
    }

    public String getNationalite() {
        return nationalite;
    }
}
