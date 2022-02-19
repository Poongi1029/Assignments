class Rectangle extends Shape5 {
@Override
public String draw() {
return "Rectangle drawn : []";
}

@Override
public void calculateArea() {
	// TODO Auto-generated method stub
	
}
}

class Line5 extends Shape5{
@Override
public String draw() {
return "line drawn : ------";
}

@Override
public void calculateArea() {
	// TODO Auto-generated method stub
	
}
}

class Cube5 extends Shape5 {
@Override
public String draw() {
return "Cube drawn : ";
}

@Override
public void calculateArea() {
	// TODO Auto-generated method stub
	
}
}
abstract class Shape5{
final int b = 1;
abstract public String draw();
public void display(){
System.out.println("This is display method");
}
abstract public void calculateArea();
}

public class Assignment2q5 extends Shape5{
public static void main(String args[]){
Assignment2q5 obj = new Assignment2q5();
obj.display();
//obj.b=200;
}

@Override
public String draw() {
	// TODO Auto-generated method stub
	return null;
}

@Override
public void calculateArea() {
	// TODO Auto-generated method stub
	
}
}