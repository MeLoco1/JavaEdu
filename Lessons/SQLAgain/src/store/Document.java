package store;
/**
 * Created with IntelliJ IDEA.
 * User: loco
 * Date: 10/27/13
 * Time: 12:20 PM
 * To change this template use File | Settings | File Templates.
 */
public class Document {
    private int number;
    private String serie;

    public Document(int number, String serie) {
        this.number = number;
        this.serie = serie;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Document)) return false;

        Document document = (Document) o;

        if (number != document.number) return false;
        if (serie != null ? !serie.equals(document.serie) : document.serie != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = number;
        result = 31 * result + (serie != null ? serie.hashCode() : 0);
        return result;
    }

    @Override
    public String toString() {
        return "Document{" +
                "number=" + number +
                ", serie='" + serie + '\'' +
                '}' + '\n';
    }

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public String getSerie() {
        return serie;
    }

    public void setSerie(String serie) {
        this.serie = serie;
    }
}
