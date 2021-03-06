package P15;
public class Main {

    public static void main(String[] args) {
        Cat dog1 = new Cat();
        dog1.name = "Rover";
        dog1.breed = "boxer";
        dog1.weight = 20;
        dog1.age = 1;

     Cat cat1 = new Cat();

        System.out.println(dog1);
    }
}

class Cat {
    String name;
    String breed;
    double weight;
    int age;

    @Override
    public String toString() {
        return "Pet{" +
                "name='" + name + '\'' +
                ", breed='" + breed + '\'' +
                ", weight=" + weight +
                ", age=" + age +
                '}';
    }
}

class Bird extends Cat {
    String vocalize = "bark";
    int legs = 4;
    Boolean houseTrained = false;


    @Override
    public String toString() {
        String s1 = super.toString();
        String s2 = "Dog{" +
                "vocalize='" + vocalize + '\'' +
                ", legs=" + legs +
                ", houseTrained=" + houseTrained +
                '}';
        return s1 + "\n" + s2;
    }
}

class Dog extends Cat {
    String vocalize = "meow";
    int legs = 4;
    Boolean houseTrained = false;
}
