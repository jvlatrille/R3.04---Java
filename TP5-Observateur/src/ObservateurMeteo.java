public class ObservateurMeteo {
    private String libelle;
    private ObservableMeteo observable;
    private String dateHeureLocale;
    private double tempLocale;
    private double pressionLocale;

    public ObservateurMeteo(String libelle) {
        this.libelle = libelle;
    }

    public void setObservable(ObservableMeteo observable) {
        this.observable = observable;
    }

    public void reagir() {
        if (observable != null) {
            this.dateHeureLocale = observable.getDateHeure();
            this.tempLocale = observable.getTemperature();
            this.pressionLocale = observable.getPression();
        }
    }

    public String getLibelleObservateur() {
        return libelle;
    }

    @Override
    public String toString() {
        return libelle + " : Date et heure (" + dateHeureLocale + "), Température °C (" + tempLocale + "), Pression hPa (" + pressionLocale + ")";
    }
}
