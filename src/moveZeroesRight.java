public class moveZeroesRight {
    public static void main(String[] args) {
        int orgArr[] = { 1, 0, 6, 0, 3, 0, 2, 0, 6, 8, 4, 6, 0, 0, 3, 0, 0, 0, 2, 0, 3 };
        int i = 0;
        int j = 1;
        while (j < orgArr.length) {

            if (orgArr[i] != 0 && orgArr[j] == 0) {
                i++;
            } else if (orgArr[i] == 0 && orgArr[j] == 0) {
                j++;
            } else if (orgArr[i] == 0 && orgArr[j] != 0) {
                int temp = orgArr[i];
                orgArr[i] = orgArr[j];
                orgArr[j] = temp;
                i++;
                j++;
            } else if (orgArr[i] == 0 && orgArr[j] != 0) {
                j++;
            }

        }
        for (i = 0; i < orgArr.length; i++) {
            System.out.println(orgArr[i]);
        }
    }
}
