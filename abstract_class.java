public class abstract_class {
    public static void main(String args[]) {
        Horse h=new Horse();
        h.eat();
        h.walk();   
    }
}
abstract class Animal{
    String color;
    Animal(){
        color="Brown";
        System.out.println(color);
    }
    void eat(){
        System.out.println("This animal eats");
    }
    abstract void walk();
}
class Horse extends Animal{
    void walk(){
        System.out.println("It walks on 4 legs.");
    }
}