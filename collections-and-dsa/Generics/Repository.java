import java.util.ArrayList;

public class Repository<T> {

    private ArrayList<T> list = new ArrayList<>();

    public void add(T obj) {
        list.add(obj);
    }

    public void remove(T obj) {
        list.remove(obj);
    }

    public ArrayList<T> getAll() {
        return list;
    }
}