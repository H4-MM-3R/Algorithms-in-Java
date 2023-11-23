package sde_sheet.Day_3.majorityElement;

public class meBruteForce {
    public static int majorityElement(int[] arr) {
        int len = arr.length;

        for (int i = 0; i < len; i++) {
            int cnt = 0;

            for (int j = 0; j < len; j++) {
                if (arr[j] == arr[i]) {
                    cnt++;
                }
            }

            // check if frquency is greater than n/2:
            if (cnt > (len / 2))
                return arr[i];
        }
        return -1;
    }

    public static void main(String args[]) {
        int[] arr = { 2, 2, 1, 1, 1, 2, 2 };
        int ans = majorityElement(arr);
        System.out.println("The majority element is: " + ans);
    }
}
