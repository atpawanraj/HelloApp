public class HelloApp {

    public static void main(String[] args) {

        String names;

        if (args.length == 0) {
            names = "World";
        } else {
            StringBuilder builder = new StringBuilder();

            boolean first = true;

            for (String name : args) {
                if (!first) {
                    builder.append(", ");
                }

                builder.append(name);
                first = false;
            }

            names = builder.toString();
        }

        System.out.println("Hello, " + names + "!");
    }
}
}