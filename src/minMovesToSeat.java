import java.util.Arrays;
public class minMovesToSeat {
    public static void main(String[] args) {
        int[] seats = { 4, 1, 5, 9 };
        int[] students = { 1, 3, 2, 6 };
        System.out.println(minMovesToSeatEveryone(seats, students));
    }

    static int minMovesToSeatEveryone(int[] seats, int[] students) {
        int count = 0;
        Arrays.sort(seats);
        Arrays.sort(students);
        for (int i = 0; i < seats.length; i++) {
            count = count + Math.abs(students[i] - seats[i]);
        }
        return count;
    }
}
