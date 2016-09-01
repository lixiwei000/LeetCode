/**
 * @author NikoBelic
 * @create 16/8/17 11:55
 */
public class ClassLoaderTest
{
    private static ClassLoaderTest loader = new ClassLoaderTest();
    private static int a;
    private static int b=2;

    public ClassLoaderTest()
    {
        a++;
        b++;
        System.out.println("a=" + a + ",b=" + b);
    }
    public static ClassLoaderTest get()
    {
        return loader;
    }
    public static void printV()
    {
        System.out.println("a=" + a + ",b=" + b);
    }
    public static void main(String[] args)
    {
        ClassLoaderTest t = new ClassLoaderTest();
        t.get();
        t.printV();
    }

}
