public class poorPigs {
    public static void main(String[] args) {
        int buckets = 1000, minutesToDie = 15, minutesToTest = 60;
        System.out.println(poorPig(buckets, minutesToDie, minutesToTest));
    }

    static int poorPig(int buckets, int minutesToDie, int minutesToTest) {
        int T = minutesToTest / minutesToDie; // Trial count
        return (int) Math.ceil(Math.log(buckets) / Math.log(T + 1));
    }
}
