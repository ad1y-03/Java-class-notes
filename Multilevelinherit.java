public class Multilevelinherit {
    public static void main(String[] args) {
        Dog d = new Dog();
        d.bark();
        d.eat();
        d.weep()
    }
    
}

class Animal {
    void eat(){
        System.out.println("Animals can eat");
    }
}
class Dog extends Animal {
    void bark(){
        System.out.println("Dog can bark");
    }
}
class Puppy extend Dog{
    void weep(){
        System.out.println("puppy can weep");
    }
}

