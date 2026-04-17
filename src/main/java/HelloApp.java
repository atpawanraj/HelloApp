public class HelloApp {

    public static void main(String[] args) {

        String names = "World";

        if (args.length > 0) {

            StringBuilder nameBuilder = new StringBuilder();

            for (String name : args) {
                nameBuilder.append(name).append(", ");
            }

            if (nameBuilder.length() > 0) {
                names = nameBuilder.substring(0, nameBuilder.length() - 2);
            }
        }

        System.out.println("Hello, " + names + "!");
    }
}