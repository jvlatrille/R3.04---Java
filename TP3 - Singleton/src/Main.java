public class Main {
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
}