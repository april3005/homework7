public abstract class A {
    private int age;
    private int weight;
    private int height;

    public abstract void method1 (int age,int weight,int height);
    public abstract void method2 (int age,int weight,int height);

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        this.height = height;
    }
}


