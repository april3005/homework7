public class Woman extends A {
    @Override
    public void method1(int age, int weight, int height) {

        System.out.println("Age: " + getAge() + " Weight: " + getWeight() + " Height: " + getHeight());
    }

    @Override
    public void method2(int age, int weight,int height) {

        System.out.println("Age: " + getAge() + " Weight: " + getWeight() + " Height: " + getHeight());
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
