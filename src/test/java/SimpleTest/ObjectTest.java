package SimpleTest;

import org.junit.Test;

public class ObjectTest {
    Object o = null;
    Class<?> c = null;
    private String str = new String("ok");

    @Test
    public void test() {
        System.out.println(str.getClass().getName());
    }
}
