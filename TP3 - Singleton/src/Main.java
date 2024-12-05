public class Main {
    public static void main(String[] args) {
        // a)
        SingletonChefCuisinier leCuisinier;
        SingletonChefCuisinier leChef;

        // b)
        leCuisinier = SingletonChefCuisinier.getInstance();

        // c)
        leCuisinier.setNom("Navarro");

        leCuisinier.setNationalite("Espagnol");

        // d)
        leChef = SingletonChefCuisinier.getInstance();

        // e)
        System.out.println("Nom: " + leChef.getNationalite());
    }
}