public class Main {
    public static void main(String[] args) {
        IComposant pizza = new ComposantPizza();
        System.out.println(pizza.toString());

        pizza = new DecorerAvecOlives(pizza);
        System.out.println(pizza.toString());

        pizza = new DecorerAvecChampignons(pizza);
        System.out.println(pizza.toString());
    }
}