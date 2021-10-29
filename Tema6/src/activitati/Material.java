package activitati;

public class Material implements Activitate{
    @Override
    public String getDescriere() {
        return "Materiale utile pentru intelegerea conceptelor Java";
    }

    @Override
    public String getDurata() {
        return "3";
    }
}
