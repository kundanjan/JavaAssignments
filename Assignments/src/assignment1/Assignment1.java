package assignment1;

class Alpha
{
    public Alpha(){
        System.out.println("Alpha Constructor");
    }
    public void demo()
    {
        System.out.println("Alpha Demo");
    }
}

class Beta extends Alpha
{
    public Beta()
    {
        System.out.println("Beta Constructor");
    }
    public void test()
    {
        System.out.println("Beta test");
    }
    public void demo()
    {
        System.out.println("Beta demo");
    }
}

public class Assignment1
{
    public static void main(String[] args)
    {
        Beta b = new Beta();
        b.demo();
        b.test();

        // Upcasting: Beta -> Alpha (implicit)
        Alpha a = new Beta();
        a.demo();

        // Downcasting: Alpha -> Beta (explicit)
        Beta down = (Beta) a;
        down.demo();
        down.test();


        Object obj = new Beta();
        if (obj instanceof Beta) {
            Beta safe = (Beta) obj;
            safe.demo();
        }
    }
}
