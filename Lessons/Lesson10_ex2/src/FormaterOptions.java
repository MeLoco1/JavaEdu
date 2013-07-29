import java.util.ArrayList;

/**
 * Created with IntelliJ IDEA.
 * User: loco
 * Date: 7/28/13
 * Time: 1:16 PM
 * To change this template use File | Settings | File Templates.
 */
public class FormaterOptions {
    private ArrayList<Formater> formaters;

    public ArrayList<Formater> getFormaters() {
        return formaters;
    }

    public void setFormaters(ArrayList<Formater> formaters) {
        this.formaters = formaters;
    }

    public FormaterOptions(ArrayList<Formater> formaters) {

        this.formaters = formaters;
    }
}
