package FabricMethod;

/**
 * Created with IntelliJ IDEA.
 * User: loco
 * Date: 11/3/13
 * Time: 2:03 PM
 * To change this template use File | Settings | File Templates.
 */
public abstract class Car {
    private String bodyType;
    private String wheelType;
    private String paintType;

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder();
        sb.append("Car");
        sb.append("{bodyType='").append(bodyType).append('\'');
        sb.append(", wheelType='").append(wheelType).append('\'');
        sb.append(", paintType='").append(paintType).append('\'');
        sb.append('}');
        return sb.toString();
    }

    public abstract void ride();

    public void setBodyType(String bodyType) {
        this.bodyType = bodyType;
    }

    public void setWheelType(String wheelType) {
        this.wheelType = wheelType;
    }

    public void setPaintType(String paintType) {
        this.paintType = paintType;
    }
}
