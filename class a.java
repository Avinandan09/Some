class a 
{
    public a()
    {
    system.out.println("In a");
    }
}

class b extends a
{
    public b()
    {
    System.out.println("In b";);
    }
}

public class main{
    public static void main(string a[])
    {
        b obj=new b();
    }
}