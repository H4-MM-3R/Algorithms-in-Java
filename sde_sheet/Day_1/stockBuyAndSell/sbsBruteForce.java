package sde_sheet.Day_1.stockBuyAndSell;

public class sbsBruteForce {
  static int maxProfit(int[] arr) {
    int maxProfit = 0;
    for (int i = 0; i < arr.length; i++) {
      for (int j = i + 1; j < arr.length; j++) {
        if (arr[j] > arr[i]) {
          maxProfit = Math.max(arr[j] - arr[i], maxProfit);
        }
      }
    }
    return maxProfit;
  }

  public static void main(String[] args) {
    int arr[] = {7, 1, 5, 3, 6, 4};
    int maxProfit = maxProfit(arr);
    System.out.println("Max profit is: " + maxProfit);
  }
}
