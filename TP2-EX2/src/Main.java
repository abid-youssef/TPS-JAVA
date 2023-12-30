//// FlyBehavior interface
//interface FlyBehavior {
//    void fly();
//}
//
//// QuackBehavior interface
//interface QuackBehavior {
//    void quack();
//}
//
//
//class FlyWithWings implements FlyBehavior {
//    @Override
//    public void fly() {
//        System.out.println("Flying with wings!");
//    }
//}
//
//// Concrete implementation of FlyBehavior for ducks that cannot fly
//class FlyNoWay implements FlyBehavior {
//    @Override
//    public void fly() {
//        System.out.println("Unable to fly!");
//    }
//}
//
//// Concrete implementation of QuackBehavior for ducks that quack
//class Quack implements QuackBehavior {
//    @Override
//    public void quack() {
//        System.out.println("Quack! Quack!");
//    }
//}
//
//// Concrete implementation of QuackBehavior for ducks that squeak
//class Squeak implements QuackBehavior {
//    @Override
//    public void quack() {
//        System.out.println("Squeak! Squeak!");
//    }
//}
//
//// Duck class using the Strategy Pattern
//class Duck {
//    private FlyBehavior flyBehavior;
//    private QuackBehavior quackBehavior;
//
//    public Duck(FlyBehavior flyBehavior, QuackBehavior quackBehavior) {
//        this.flyBehavior = flyBehavior;
//        this.quackBehavior = quackBehavior;
//    }
//
//    public void performFly() {
//        flyBehavior.fly();
//    }
//
//    public void performQuack() {
//        quackBehavior.quack();
//    }
//
//    public void swim() {
//        System.out.println("All ducks can swim!");
//    }
//}
//
//// MallardDuck class
//class MallardDuck extends Duck {
//    public MallardDuck() {
//        // Mallard ducks fly and quack
//        super(new FlyWithWings(), new Quack());
//    }
//}
//
//// RubberDuck class
//class RubberDuck extends Duck {
//    public RubberDuck() {
//        // Rubber ducks cannot fly and squeak
//        super(new FlyNoWay(), new Squeak());
//    }
//
//}
//
//public class Main {
//    public static void main(String[] args) {
//        Duck mallardDuck = new MallardDuck();
//        Duck rubberDuck = new RubberDuck();
//
//        mallardDuck.performFly();  // Outputs: Flying with wings!
//        mallardDuck.performQuack(); // Outputs: Quack! Quack!
//        mallardDuck.swim();         // Outputs: All ducks can swim!
//
//        rubberDuck.performFly();    // Outputs: Unable to fly!
//        rubberDuck.performQuack();  // Outputs: Squeak! Squeak!
//        rubberDuck.swim();          // Outputs: All ducks can swim!
//    }
//}
//

interface Flyable {
    void fly();
}
interface Quackable {
    void quack();
}
class Duck
{
    public void display(){
        System.out.println("I am a duck");
    }
    public void swim(){
        System.out.println("I can swim");
    }
    //OTHER duck-like methods

}

class MallardDuck extends Duck implements Flyable, Quackable
{
    public void fly(){
        System.out.println("I can fly");
    }
    public void quack(){
        System.out.println("I can quack");
    }
}
class RedheadDuck extends Duck implements Flyable, Quackable
{
    public void fly(){
        System.out.println("I can fly");
    }
    public void quack(){
        System.out.println("I can quack");
    }
}
class RubberDuck extends Duck implements Quackable
{
    public void quack(){
        System.out.println("I can quack");
    }
}
class DecoyDuck extends Duck
{
    public void display(){
        System.out.println("I am a decoy duck");
    }
}
public class Main {
    public static void main(String[] args) {
        MallardDuck Mduck = new MallardDuck();
        RedheadDuck RedDuck = new RedheadDuck();
        RubberDuck Rduck = new RubberDuck();
        DecoyDuck Dduck = new DecoyDuck();

        Mduck.display();
        Mduck.swim();
        RedDuck.display();
        RedDuck.swim();

        Mduck.fly();
        Mduck.quack();
    }
}