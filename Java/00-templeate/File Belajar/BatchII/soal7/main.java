package BatchII.soal7;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

class Employee implements Comparator {
    String name; String id;
    public Employee(){} public Employee(String name, String id){
    this.name=name;
    this.id=id;
    }
    @Override
    public int compare(Employee obj1, Employee obj2) {
        return obj2.name.compareTo(obj1.name);
    }
    @Override
    public String toString() {
        return "{"+"name"+ name + ", id " + id+"}";
    }
}
class ComparatorUsage {
    public static void main(String args[]) { 
        Employee emp1 =new Employee("sam","4");
        Employee emp2 =new Employee("amy","2");
        ArrayList<Employee> list=new ArrayList<Employee>();
        list.add(emp1);
        list.add(emp2); 
        Collections.sort(list,new Employee());
        System.out.println(list);
    }
}