import java.util.Arrays;

public class BigO {


    // big O(1)--> each single line only be executed for one time. 1+1+1+1===O(4)===>O(1)
    public static int sum(int a, int b) {
        int total = a + b;
        return total;
    }

    // Linear search   Big O(n)
    public static void linearSearch() {
        int n = 10;
        for (int i = 0; i <= n; i++) {
            System.out.println("I am batman " + i);
        }
    }

    public static int linearSearch2(int[] arr, int key) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == key) {
                return i;
            }
        }
        return -1;

    }  // O(n)

    // O(n^2) ---> QuadraticTime
    public static void QuadraticTime() {
        int m = 5;
        int n = 5;
        for (int i = 0; i <= m; i++) {
            for (int j = 0; j <= n; j++) {
                System.out.print(i + "" + j + " ");
            }
            System.out.println();
        }
    }

    // (1+n+n+n)(1+n+n+n)
    // (1+3n)(1+3n) --> 1+3n +3n +9n^2 --> 9n^2+6n+1--> Quadratic equation
    // 9n^2+6n -->3n(3n+2) -->9n^2 --> O(n^2)


    // o(n^3) o(n) cube
    public static void tripleNestedLoop(int n) {
        for (int x = 0; x < n; x++) {
            for (int y = 0; y < n; y++) {
                for (int z = 0; z < n; z++) {
                    System.out.print(x + "" + y + "" + z + " ");
                }
                System.out.println();
            }
        }
        //(1+n+n)(1+n+n)(1+n+n+n) => (1+2n)(1+2n)(1+3n)=>n^3 + n^2 +n + 1 -> cubic equations
    }

    // 3x+9y+8z = 79
    // 0 + 63 + 16 =79 -->0, 7, 2
    public static void multiNumberEquation(int n) {
        for (int x = 0; x < n; x++) {
            for (int y = 0; y < n; y++) {
                for (int z = 0; z < n; z++) {
                    if (3 * x + 9 * y + 8 * z == 79) {
                        System.out.println(x + ", " + y + ", " + z);
                    }
                }
            }
        }
    }

    // O(LOG N)  --> Logarithmic time -- run time increases logarithmically with the input size  -- binary search
    // https://www.cs.usfca.edu/~galles/visualization/Search.html

    public static int binarySearch(int[] arr, int x) {
        int low = 0;
        int high = arr.length - 1;
        while (low <= high) {
            int mid = (low + high) / 2;
            if (arr[mid] == x) {
                return mid;
            } else if (arr[mid] < x) {
                low = mid + 1;
            } else {
                high = mid - 1;
            }
        }
        return -1;
    }
    // merge sort algo  o(n log n)  -- divide and conquer.(divide and sort - merge)



    public static void main(String[] args) {
        int s1 = sum(2, 3); // O(1)
        System.out.println(s1);
        int arr[] = {1, 2, 3, 4, 5, 6};
        System.out.println(arr[2]);  // O(1)

        // Linear search
        linearSearch();
        int index = linearSearch2(new int[]{2, 3, 4, 5, 6, 7}, 7);
        System.out.println("index = " + index);
        // o(1)===>BEST CASE3x+py+8z = 79
        //O(N)==> WORST CASE

        // O(n^2) QuadraticTime
        QuadraticTime();

        // cube time tripleNestedLoop o(n^3)
        tripleNestedLoop(5);
        multiNumberEquation(10);

        // binary search
        int[] arr2 = {1, 2, 3, 4, 5, 6, 7, 8, 9, 45, 34, 23, 45};
        Arrays.sort(arr2);
        int ix = binarySearch(arr2, 5);
        System.out.println("ix = " + ix);//ix = 4


    }
}
