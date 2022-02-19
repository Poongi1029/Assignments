abstract class name {
    String name;
    name(String name){
        this.name =name;
    }
    public  abstract String getname();

}
class person extends name{
    person(String name) {
        super(name);
    }
    @Override
    public  String getname(){
        return ("Hello,"+this.name);
    }
}


 abstract class MyClass {
    public abstract void display();
}

class  AbstClassP3ex extends MyClass{
    @Override
    public void display(){
        System.out.println("This is the subclass implementation of the display method ");
    }
}


private abstract class MyClass2 {
    public abstract void display2();
}

class AbstClassP4ex extends MyClass2{
    public void display2(){
        System.out.println("This is not the Private Class ");
    }
}
abstract class MyClass3 {
    public void display3(){
        System.out.println("this is an abstract class without abstract method");
    }
}

class AbstClassP6ex extends MyClass3{
}


public class Assignments2q4 {
    public static void main(String[] args) {
        person user1 = new person("Poonguzhali");
        System.out.println(user1.getname());
     
        name point2 = new name("this is abstract");
        
        new AbstClassP3ex().display();
        new AbstClassP4ex().display2();
        new AbstClassP6ex().display3();

    }
}