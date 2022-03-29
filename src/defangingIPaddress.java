public class defangingIPaddress {
    public static void main(String[] args) {
        String address = "1.1.1.1";
        System.out.println(defang(address));
    }

    static String defang(String address) {
        String s = address.replace(".", "[.]");
        return s;
    }
}
