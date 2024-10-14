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

}

public static void main(String[] args) {
    SingletonChefCuisinier leCuisinier;
    SingletonChefCuisinier leChef;

    leCuisinier = SingletonChefCuisinier.getInstance();
    leChef = SingletonChefCuisinier.getInstance();

    leCuisinier.setNom("Navarro");
    leCuisinier.setPrenom("Prilippe");

    System.out.println("Nom: " + leChef.getNom());
    System.out.println("Prenom: " + leChef.getPrenom());
}