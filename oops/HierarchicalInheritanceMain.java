// ==========================================
// 1. COMMON PARENT CLASS
// ==========================================
class Animal {
    String name;

    public Animal(String name) {
        this.name = name;
        System.out.println("1. [Parent: Animal] Constructor executed for: " + this.name);
    }

    public void eat() {
        System.out.println(name + " is eating.");
    }
}

// ==========================================
// 2. CHILD CLASS A (Dog extends Animal)
// ==========================================
class Dog extends Animal {
    public Dog(String name) {
        super(name);
        System.out.println("2. [Child A: Dog] Constructor executed.");
    }

    public void bark() {
        System.out.println(name + " says: Woof!");
    }
}

// ==========================================
// 3. CHILD CLASS B (Cat extends Animal)
// ==========================================
class Cat extends Animal {
    public Cat(String name) {
        super(name);
        System.out.println("2. [Child B: Cat] Constructor executed.");
    }

    public void meow() {
        System.out.println(name + " says: Meow!");
    }
}

// ==========================================
// 4. MAIN CLASS (Execution)
// ==========================================
public class HierarchicalInheritanceMain {
    public static void main(String[] args) {
        System.out.println("--- Creating Object 1: Dog ---");
        Dog myDog = new Dog("Buddy");
        myDog.eat();
        myDog.bark();

        System.out.println("\n--- Creating Object 2: Cat ---");
        Cat myCat = new Cat("Whiskers");
        myCat.eat();
        myCat.meow();
    }
}