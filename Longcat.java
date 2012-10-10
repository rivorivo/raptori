public class Longcat {

    // Source: http://encyclopediadramatica.com/Longcat

    public static final String HEAD_ROW = "" +
            "    /\\___/\\         \n" +
            "   /       \\         \n" +
            "  |  #    # |         \n" +
            "  \\     @   |        \n" +
            "   \\   _|_ /         \n" +
            "   /       \\______   \n" +
            "  / _______ ___   \\  \n" +
            "  |_____   \\   \\__/ \n" +
            "   |    \\__/         \n";
    public static final String BODY_ROW = "" +
            "   |       |          \n";
    public static final String FEET_ROW = "" +
            "   /        \\        \n" +
            "  /   ____   \\       \n" +
            "  |  /    \\  |       \n" +
            "  | |      | |        \n" +
            " /  |      |  \\      \n" +
            " \\__/      \\__/     \n";

    private final int bodySize;

    public Longcat(int bodySize) {
        this.bodySize = bodySize;
    }

    public String getBody() {
        String body = "";
        for (int i = 0; i < bodySize; i++) {
            body += BODY_ROW;
        }
        return body;
    }

    public String toString() {
        return HEAD_ROW + getBody() + FEET_ROW;
    }

    public static void main(String[] args) {
        if (args.length < 1) {
            System.out.println("Usage: java Longcat STOMACH_LENGTH");
            System.exit(1);
        }

        Longcat cat = new Longcat(Integer.parseInt(args[0]));
        System.out.println(cat);
    }
}
