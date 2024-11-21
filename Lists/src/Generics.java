public class Generics <T> {
    private T value;
    public Generics(T value) {
        this.value=value;
    }

    public Generics() {

    }
    public T getT() {
        return value;
    }
    public void setT(T value) {
        this.value = value;
    }
}
