import java.util.*;
import java.util.stream.Collectors;

public class Main {

    public static boolean existaStudent(List<Student> lista, Student deCautat) {
        for (Student s : lista) {
            if (s.getNume().equals(deCautat.getNume()) && s.getPrenume().equals(deCautat.getPrenume()) && s.getFormatieDeStudiu().equals(deCautat.getFormatieDeStudiu())) {
                return true;
            }
        }
        return false;
    }

    static void main(String[] args) {
        //PROBLEMA 1:
        /*List<Integer> x = new ArrayList<>();
        List<Integer> y = new ArrayList<>();
        Random rand = new Random();

        for (int i = 0; i < 5; i++)
            x.add(rand.nextInt(11));
        for (int i = 0; i < 7; i++)
            y.add(rand.nextInt(11));

        Collections.sort(x);
        Collections.sort(y);

        System.out.println("X: " + x);
        System.out.println("Y: " + y);

        List<Integer> XplusY = new ArrayList<>(x);
        XplusY.addAll(y);
        Collections.sort(XplusY);
        System.out.println("XplusY: " + XplusY);

        Set<Integer> zSet = new TreeSet<>(x);
        zSet.retainAll(y);
        System.out.println("zSet: " + zSet);

        List<Integer> XminusY = new ArrayList<>(x);
        XminusY.removeAll(y);
        System.out.println("XminusY: " + XminusY);

        int p = 4;
        List<Integer> XplusYlimitedbyP = new ArrayList<>(XplusY);
*/
        //PROBLEMA 2
        Student s1 = new Student(448, "Razvan", "Siminiceanu", "TI22/1");
        Student s2 = new Student(460, "Andrei", "Straculencu", "TI22/1");
        Student s3 = new Student(455, "Patrik", "Rucarean", "TI22/1");
        List<Student> listaStudenti = new ArrayList<>(Arrays.asList(s1, s2, s3));

        System.out.println("Lista de studenti:");
        for (Student s : listaStudenti) {
            System.out.println(s);
        }

        Student cautat1 = new Student(120, "Alis", "Popa", "TI21/2");
        System.out.println("\nEste Alis Popa in lista? " + existaStudent(listaStudenti, cautat1));

        Student cautat2 = new Student(112, "Maria", "Popa", "TI21/1");
        System.out.println("Este Maria Popa in lista? " + existaStudent(listaStudenti, cautat2));
    }
}