package Code300;

public class JumpSearch {
    public static int jumpSearch(int[] arr, int x) {
        int n = arr.length; // 10
        int searchJump = (int) Math.sqrt(n);  // 3 chia 3 doan de search
        int prev = 0; // gia tri truoc

        //1, 3, 5, 7, 9, 11, 13, 15, 17, 19
        // [1,3,5] [7,9,11] [13,15,17] [19]


        while (arr[Math.min(searchJump, n) - 1] < x) {
            prev = searchJump;
            searchJump += (int) Math.sqrt(n);
            if (prev >= n)
                return -1;
        }

        // vong 1:
        // x: 7
        // searchJump = 3
        // arr[Math.min(searchJump, n) - 1] => arr[Math.min(3, 10) - 1] => 2 < 7 => true
        // prev = searchJump; => prev = 3
        // searchJump += (int) Math.sqrt(n); => searchJump = 3 + 3 = 6
        //  if (prev >= n) => 3 >= 10 => false => ko lam gi

        // vong 2
        // x: 7
        // searchJump = 6
        // arr[Math.min(searchJump, n) - 1] => arr[Math.min(6, 10) - 1] => 5 < 7 => true
        // prev = searchJump; => prev = 6
        // searchJump += (int) Math.sqrt(n); => searchJump = 6 + 3 = 9
        //  if (prev >= n) => 6 >= 10 => false => ko lam gi

        // vong 3
        // x: 7
        // searchJump = 9
        // arr[Math.min(searchJump, n) - 1] => arr[Math.min(9, 10) - 1] => 8 < 7 => false => ket thuc vong lap 1

        while (arr[prev] < x) {
            prev++;
            if (prev == Math.min(searchJump, n))
                return -1;
        }

        // vong 1:
        // x: 7
        // prev: 6
        // arr[prev] => arr[6] = 13
        // arr[prev] < x =>  13 < 7 => false ko lam gi

        if (arr[prev] == x)
            return prev;

        return -1;
    }

    public static void main(String[] args) {
        int[] arr = {1, 3, 5, 7, 9, 11, 13, 15, 17, 19};
        int x = 7;

        int index = jumpSearch(arr, x);
        System.out.println("Element " + x + " is present at index " + index);
    }
}
