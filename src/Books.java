import java.util.*;

class Books implements Comparator<Books> {
    private int pageNumber;
    private float price;
    private String author;

    public Books(int pageNumber, float price, String author) {
        this.pageNumber = pageNumber;
        this.price = price;
        this.author = author;
    }

    @Override
    public int compare(Books o1, Books o2) {
        return 0;
    }

    @Override
    public String toString() {
        return "Books{" +
                "pageNumber=" + pageNumber +
                ", price=" + price +
                ", author='" + author + '\'' +
                '}';
    }

    public static void main(String[] args) {

        List<Books> list = new ArrayList<>();
        list.add(new Books(853, 5000, "V"));
        list.add(new Books(459, 10000, "K"));
        list.add(new Books(265, 6000, "R"));
        list.add(new Books(409, 2000, "L"));
        list.add(new Books(13, 3000, "C"));

        Comparator<Books> b = Comparator.comparingInt(o -> o.pageNumber);
        Collections.sort(list, b);
        Iterator itr = list.iterator();
        while (itr.hasNext()) {
            System.out.println(itr.next());
        }
    }
}

