public class Main {


    public static void main(String[] args) {
        Woman woman = new Woman();
        printInfo(woman);
    }

    private static void printInfo(A a) {
        System.out.println(a.getAge() + " " + a.getWeight() + " " + a.getHeight());

        a.method1(25, 55, 178);
        a.method2(28, 48, 169);



    }

    }
