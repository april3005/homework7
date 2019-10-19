import java.util.Scanner;

public class Main {


    public static void main(String[] args) {
        System.out.println("Кто вам нужен, man или woman?");
        Scanner scan = new Scanner(System.in);
        String input = scan.nextLine();

            printInfo(input);


    }

    public static void printInfo(String obj) {

            switch (obj) {
                case "man":
                    A m = new Man();
                    System.out.println("Man");

                    System.out.println(m.getAge());
                    System.out.println(m.getWeight());
                    System.out.println(m.getHeight());

                    m.method1(20, 60, 172);
                    m.method2(30, 80, 185);
                    break;
                case "woman":
                    A w = new Woman();
                    System.out.println("Woman");

                    System.out.println(w.getAge());
                    System.out.println(w.getWeight());
                    System.out.println(w.getHeight());

                    w.method1(25, 55, 178);
                    w.method2(28, 48, 169);
                    break;
            }
    }
}
