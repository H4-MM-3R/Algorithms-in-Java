

import java.util.ArrayList;

public class crpOptimal {
  private static void merge(int[] arr, int low, int mid, int high) {
    ArrayList<Integer> temp = new ArrayList<>();
    int left = low;
    int right = mid + 1;

    while (left <= mid && right <= high) {
      if (arr[left] <= arr[right]) {
        temp.add(arr[left]);
        left++;
      } else {
        temp.add(arr[right]);
        right++;
      }
    }

    // if elements on the left half are still left //
    while (left <= mid) {
      temp.add(arr[left]);
      left++;
    }

    // if elements on the right half are still left //
    while (right <= high) {
      temp.add(arr[right]);
      right++;
    }

    // transfering all elements from temporary to arr //
    for (int i = low; i <= high; i++) {
      arr[i] = temp.get(i - low);
    }
  }

  public static int countPairs(int[] arr, int low, int mid, int high) {
    int right = mid + 1;
    int cnt = 0;
    for (int i = low; i <= mid; i++) {
      while (right <= high && arr[i] > 2 * arr[right]) right++;
      cnt += (right - (mid + 1));
    }
    return cnt;
  }

  public static int mergeSort(int[] arr, int low, int high) {
    int cnt = 0;
    if (low >= high) return cnt;
    int mid = (low + high) / 2;
    cnt += mergeSort(arr, low, mid);
    cnt += mergeSort(arr, mid + 1, high);
    cnt += countPairs(arr, low, mid, high);
    merge(arr, low, mid, high);
    return cnt;
  }

  public static int team(int[] skill, int n) {
    return mergeSort(skill, 0, n - 1);
  }

  public static void main(String[] args) {
    int[] arr = {4, 1, 2, 3, 1};
    int n = 5;
    int cnt = team(arr, n);
    System.out.println("The number of reverse pair is: " + cnt);
  }
}
