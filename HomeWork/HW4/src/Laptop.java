/**
 * Created with IntelliJ IDEA.
 * User: loco
 * Date: 7/23/13
 * Time: 10:42 PM
 * To change this template use File | Settings | File Templates.
 */
public class Laptop extends Product {
    private String cpu;
    private String hdd;
    private String ram;

    public String getCpu() {
        return cpu;
    }

    public void setCpu(String cpu) {
        this.cpu = cpu;
    }

    public String getHdd() {
        return hdd;
    }

    public void setHdd(String hdd) {
        this.hdd = hdd;
    }

    public String getRam() {
        return ram;
    }

    public void setRam(String ram) {
        this.ram = ram;
    }

    public Laptop(int id, String name, String owner, String type, int price, String cpu, String hdd, String ram) {

        super(id, name, owner, type, price);
        this.cpu = cpu;
        this.hdd = hdd;
        this.ram = ram;
    }
}
