import java.util.*;

public class Main {
    public static void main(String[] args) {
        Set<Student> setStudenti = new HashSet<>();
        setStudenti.add(new Student(112, "Maria", "Popa", "TI21/1"));
        setStudenti.add(new Student(115, "Ion", "Ionescu", "TI21/2"));
        setStudenti.add(new Student(120, "Alis", "Georgescu", "TI21/2"));

        Student cautat1 = new Student(120, "Alis", "Popa", "TI21/2");
        System.out.println("Alis Popa prezenta? " + setStudenti.contains(cautat1));

        Student cautat2 = new Student(112, "Maria", "Popa", "TI21/1");
        System.out.println("Maria Popa prezenta? " + setStudenti.contains(cautat2));
    }
}