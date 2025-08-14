public class strSpeed {

    private static final int ITERATIONS = 100_000;

    public static void main(String[] args) {
        long startTime, endTime;

        // Test String
        startTime = System.nanoTime();
        String str = "";
        for (int i = 0; i < ITERATIONS; i++) {
            str += "a";
        }
        endTime = System.nanoTime();
        System.out.println("String time: " + (endTime - startTime) / 1_000_000 + " ms");

        // Test StringBuilder
        startTime = System.nanoTime();
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < ITERATIONS; i++) {
            sb.append("a");
        }
        endTime = System.nanoTime();
        System.out.println("StringBuilder time: " + (endTime - startTime) / 1_000_000 + " ms");

        // Test StringBuffer
        startTime = System.nanoTime();
        StringBuffer sbuf = new StringBuffer();
        for (int i = 0; i < ITERATIONS; i++) {
            sbuf.append("a");
        }
        endTime = System.nanoTime();
        System.out.println("StringBuffer time: " + (endTime - startTime) / 1_000_000 + " ms");
    }
}


