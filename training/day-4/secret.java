class sample {
    private String s = "kiran is spy";

    private void job() {
        System.out.println("i am on work:");
    }
}

public class secret {
    public static void main(String[] args) throws Exception {
        sample s = new sample();
        Class<?> c = s.getClass();

        // Access and invoke private method
        java.lang.reflect.Method m = c.getDeclaredMethod("job");
        m.setAccessible(true);
        m.invoke(s);

        // Access and read private field
        java.lang.reflect.Field f = c.getDeclaredField("s");
        f.setAccessible(true);
        System.out.println(f.get(s)); // prints: kiran is spy
        f.set(s, "kiran is undercover");
        System.out.println(f.get(s));
    }
}
