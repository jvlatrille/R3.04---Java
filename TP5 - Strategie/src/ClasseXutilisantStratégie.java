public class ClasseXutilisantStratégie {
    private IStratégie uneStratégie;

    public void setLaStratégie(IStratégie stratégie) {
        this.uneStratégie = stratégie;
    }

    public void opérationMétier() {
        System.out.println("Commencement de l’opération métier");
        uneStratégie.méthodeDeStratégie();
        System.out.println("Terminaison de l’opération métier");
    }
}
