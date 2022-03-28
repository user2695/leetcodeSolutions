public class goalParser {
    public static void main(String[] args) {
        String command = "G()(al)";

        System.out.println(interpret(command));
    }

    static String interpret(String command) {
        String s = command.replace("()", "o");
        s = s.replace("(al)", "al");

        return s;
    }

}