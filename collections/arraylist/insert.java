import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class insert {
    private String col;

    public insert(String colu) {
        this.col = colu;
    }

    @Override
    public String toString() {
        return col;
    }

    public static void main(String[] args) {
        List<insert> al = new ArrayList<>();
        insert obj = new insert("Black");
        insert obj2 = new insert("Green");
        al.add(obj);
        al.add(obj2);
        al.add(0, new insert("Red"));
        Iterator<insert> itr = al.iterator();
        while (itr.hasNext()) {
            System.out.println(itr.next());
        }
    }
}
