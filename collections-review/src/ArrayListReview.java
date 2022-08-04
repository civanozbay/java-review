import java.util.*;

public class ArrayListReview {
    public static void main(String[] args) {
        List<Student> students = new ArrayList<>() ;
        students.add(new Student(1,"Jose"));
        students.add(new Student(2,"Sayed"));
        students.add(new Student(3,"Nick"));
        students.add(new Student(4,"Ronnie"));
        System.out.println(students);

        for(int i=0; i<students.size();i++){System.out.println(students.get(i));}
        // iterator
        System.out.println("printing with iterator ..............");
        Iterator iter = students.listIterator();
        while (iter.hasNext()){
            System.out.println(iter.next());
        }
        // backwards iteration
        System.out.println("printing with iterator backwards..............");
        while (((ListIterator<?>) iter).hasPrevious()){
            System.out.println(((ListIterator<?>) iter).previous());
        }
        // for each loop
        System.out.println("Printing for each loop .. ......... .........");
        for(Student student:students) System.out.println(student);

        System.out.println("Printing with lambda .. ......... .........");
        // lambda
        students.forEach(student -> System.out.println(student));
        // sorting elements in List
        System.out.println("Printing with sorted lıst wıth comp .. ......... .........");
        Collections.sort(students,new sortByIdDesc());
        System.out.println(students);

    }
    static class sortByIdDesc implements Comparator<Student>{
        @Override
        public int compare(Student o1, Student o2){
            return o1.id-o2.id;
        }
    }
    static class sortByNameDesc implements Comparator<Student>{
        @Override
        public int compare(Student o1, Student o2){
            return o2.name.compareToIgnoreCase(o1.name);
        }
    }

}
