import java.util.*;

// Rename this class to Book
// and also make this class public

// ideally this class should implement Comparable instead of Comparable
class Books {
    private int pageNumber;
    private float price;
    private String author;

    // getters for each of the members
    
    public Books(int pageNumber, float price, String author) {
        this.pageNumber = pageNumber;
        this.price = price;
        this.author = author;
    }

    @Override
    public String toString() {
        return "Books{" +
                "pageNumber=" + pageNumber +
                ", price=" + price +
                ", author='" + author + '\'' +
                '}';
    }

    // put the meain method in some other class
    public static void main(String[] args) {

        List<Books> list = new ArrayList<>();
        list.add(new Books(853, 5000, "V"));
        list.add(new Books(459, 10000, "K"));
        list.add(new Books(265, 6000, "R"));
        list.add(new Books(409, 2000, "L"));
        list.add(new Books(13, 3000, "C"));

        // you could have used method reference - use getter
        Comparator<Books> b = Comparator.comparingInt(o -> o.pageNumber);
        Collections.sort(list, b);
        
        // you could have used streams to loop over this list
        Iterator itr = list.iterator();
        while (itr.hasNext()) {
            System.out.println(itr.next());
        }
    }
}

