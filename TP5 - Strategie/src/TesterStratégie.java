public class TesterStratégie {
    public static void main(String[] args) {
        ClasseXutilisantStratégie objetX = new ClasseXutilisantStratégie();

        IStratégie maStratégie = new StratégieConcrète1();
        objetX.setLaStratégie(maStratégie);
        objetX.opérationMétier(); // Comportement 1

        maStratégie = new StratégieConcrète2();
        objetX.setLaStratégie(maStratégie);
        objetX.opérationMétier(); // Comportement 2
    }
}
