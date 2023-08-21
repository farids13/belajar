package JavaGeneric;

public class Pair<T, U> {
    private T first;
    private U second;


    public Pair(T first, U second) {
        this.first = first;
        this.second = second;
    }

    public Pair() {
    }


    public T getFirst() {
        return this.first;
    }

    public void setFirst(T first) {
        this.first = first;
    }

    public U getSecond() {
        return this.second;
    }

    public void setSecond(U second) {
        this.second = second;
    }

}
