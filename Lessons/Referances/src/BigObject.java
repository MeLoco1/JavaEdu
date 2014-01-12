public class BigObject {
    private int value;
    public BigObject(Integer pValue) {
        value = pValue;
    }

    @Override
    protected void finalize() throws Throwable {
        System.out.println("BigObject (" + value + ") finalize()");
        super.finalize();
    }

    @Override
    public String toString() {
        return super.toString();
    }
}
