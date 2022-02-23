import java.lang.reflect.*;



class Myclass {

    @Execute(Sequence=2)
    public void myMethod1()
    {
        System.out.println("1");
    }
    @Execute(Sequence=1)
    public void myMethod2()
    {
        System.out.println("2");
    }

    @Execute(Sequence=3)
    public void myMethod3()
    {
        System.out.println("3");
    }
}
public class AnnotationQ3 {
    public static void main(String args[])throws Exception{

        Myclass n = new Myclass();
        Method a= n.getClass().getMethod("myMethod1");
        Method b= n.getClass().getMethod("myMethod2");
        Method c= n.getClass().getMethod("myMethod3");
        Execute a1E= a.getAnnotation(Execute.class);
        Execute b1E = b.getAnnotation(Execute.class);
        Execute c1E = c .getAnnotation(Execute.class);
        System.out.println(a);
        System.out.println(b);
        System.out.println(c);
    }}