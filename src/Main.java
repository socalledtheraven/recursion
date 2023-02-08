public class Main {
    public static void main(String[] args) {
        int[] data = {13, 13, 18, 19, 23, 38, 57, 70, 79, 88, 89, 94, 102, 108, 122, 125, 127, 177, 180, 201, 210, 221, 226, 226, 234, 237, 247, 293, 295, 297, 303, 317, 320, 339, 343, 373, 375, 378, 378, 380, 403, 405, 407, 408, 412, 440, 466, 479, 485, 486, 493, 504, 509, 525, 537, 564, 565, 570, 578, 581, 584, 589, 605, 611, 617, 621, 650, 665, 669, 692, 696, 714, 742, 756, 756, 763, 766, 776, 780, 789, 817, 857, 881, 882, 883, 885, 897, 898, 906, 909, 911, 916, 929, 929, 939, 941, 958, 985, 988, 994};
        System.out.println(recursiveBinarySearch(data, 916, data.length-1, 0));
    }

    public static int fib(int n) {
        if (n == 0) {
            return 0;
        } else if (n == 1) {
            return 1;
        }

        return fib(n-1) + fib(n-2);
    }

    public static boolean palindrome(String s) {
        if (s.length() == 1) {
            return true;
        } else if (s.length() == 2) {
            return s.charAt(0) == s.charAt(1);
        }
        return ((s.charAt(0) == s.charAt(s.length()-1)) && (palindrome(s.substring(1, s.length()-2))));
    }

    public static int linearSearch(int[] arr, int n) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == n) {
                return i;
            }
        }
        return -1;
    }

    public static int recursiveBinarySearch(int[] arr, int n, int upper, int lower) {
        int midpoint = (int)((upper+lower)/2);
        System.out.println("mid: " + midpoint);
        if (arr[midpoint] == n) {
            return midpoint;
        } else if (arr.length == 1) {
            return -1;
        }

        if (arr[midpoint] > n) {
            upper = midpoint-1;
            System.out.println("lower, " + arr[midpoint]);
            return recursiveBinarySearch(arr, n, upper, lower);
        } else if (arr[midpoint] < n) {
            lower = midpoint+1;
            System.out.println("higher, " + arr[midpoint]);
            return recursiveBinarySearch(arr, n, upper, lower);
        }
        return -1;
    }
}
