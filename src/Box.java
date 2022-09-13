public class Box <T>{
    T val;

    public T getVal() {
        return val;
    }

    public void setVal(T val) {
        this.val = val;
    }

    public Box(T val) {
        this.val = val;
    }

    @Override
    public String toString() {
        return "Box{" +
                "val=" + val +
                '}';
    }
}
