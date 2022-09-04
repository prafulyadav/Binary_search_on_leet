//35. Search Insert Position

public class solution_sip {
    public static void main(String[] args) {
        int nums[] = {1, 3, 5, 6};
        int key = 7;

        int s = 0;
        int e = nums.length - 1;

        while (s <= e) {
            int mid = s + (e - s) / 2;
            if (nums[mid] == key) {
                System.out.println(mid);
                break;
            } else if (key < nums[mid]) {
                e = mid - 1;
            } else {
                s = mid + 1;
            }
        }
        System.out.println(s);
    }
}

