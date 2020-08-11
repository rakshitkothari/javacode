import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

class Employee implements Comparable<Employee> {
    int ID;
    int salary;
    int age;

    public Employee(int id, int salary, int age) {
        this.ID = id;
        this.salary = salary;
        this.age = age;
    }

    public int compareTo(Employee s) {
        return this.salary - s.salary;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "ID=" + ID +
                ", salary=" + salary +
                ", age=" + age +
                '}';
    }

    public static void main(String[] args) {

        List<Employee> list = new ArrayList<>();
        list.add(new Employee(97, 5000, 22));
        list.add(new Employee(29, 10000, 34));
        list.add(new Employee(45, 6000, 27));
        list.add(new Employee(78, 2000, 33));
        list.add(new Employee(32, 3000, 20));

        Collections.sort(list);
        Iterator itr = list.iterator();
        while (itr.hasNext()) {
            System.out.println(itr.next());
        }
    }
}







