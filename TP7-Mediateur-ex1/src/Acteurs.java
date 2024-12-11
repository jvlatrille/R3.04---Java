public abstract class Acteurs  extends Médiateur{
    private Médiateur médiateur;

    public Médiateur getMédiateur() {
        return médiateur;
    }

    public void setMédiateur(Médiateur médiateur) {
        this.médiateur = médiateur;
    }
}

