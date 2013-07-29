import java.util.ArrayList;

/**
 * Created with IntelliJ IDEA.
 * User: loco
 * Date: 7/28/13
 * Time: 12:17 PM
 * To change this template use File | Settings | File Templates.
 */
public class City {
    private String name;
    ArrayList<Company> companies;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public ArrayList<Company> getCompanies() {
        return companies;
    }

    public void setCompanies(ArrayList<Company> companies) {
        this.companies = companies;
    }

    public City(String name, ArrayList<Company> companies) {

        this.name = name;
        this.companies = companies;
    }
}
