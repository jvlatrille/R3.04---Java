import java.util.ArrayList;

public class ObservableMeteo extends Observable {
    private String libelle;
    private String dateHeure;
    private double temperature;
    private double pression;

    public ObservableMeteo(String libelle) {
        this.libelle = libelle;
    }

    public void setDateHeureTemperaturePression(String dateHeure, double temperature, double pression) {
        this.dateHeure = dateHeure;
        this.temperature = temperature;
        this.pression = pression;
        notifierObservateurs();
    }

    public String getDateHeure() {
        return dateHeure;
    }

    public double getTemperature() {
        return temperature;
    }

    public double getPression() {
        return pression;
    }

    @Override
    public String toString() {
        return libelle + " : Date et heure (" + dateHeure + "), Température °C (" + temperature + "), Pression hPa (" + pression + ")";
    }
}
