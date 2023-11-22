package sde_sheet.Day_2.findDuplicates;

public class fdHashing {
    static int findDuplicate(int[] arr) {
        int len = arr.length;

        int freq[] = new int[len + 1];
        for (int i = 0; i < len; i++) {
            if (freq[arr[i]] == 0) {
                freq[arr[i]] += 1;
            } else {
                return arr[i];
            }
        }
        return 0;
    }

    public static void main(String args[]) {
        int arr[] = { 1, 3, 4, 2, 3 };
        System.out.println("The duplicate element is " + findDuplicate(arr));
    }
}
