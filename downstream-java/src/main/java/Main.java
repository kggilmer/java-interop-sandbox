import org.test.kotlinsdk.TestRequest;

public class Main {
    public static void main(String[] args) {
        TestRequest tr = new TestRequest();

        System.out.println(tr.getClass().getCanonicalName());
    }
}
