public class  Child extends Parent
{
    public void m2(){
        System.out.println("i am in m2");
    }


    public static void main(String[] args) {
        Parent  p = new child();
        p.m1();
        p.m2();
    }
}