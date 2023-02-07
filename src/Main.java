public class Main {
    public static void main(String[] args) {
        int[] data = {13, 13, 18, 19, 23, 38, 57, 70, 79, 88, 89, 94, 102, 108, 122, 125, 127, 177, 180, 201, 210, 221, 226, 226, 234, 237, 247, 293, 295, 297, 303, 317, 320, 339, 343, 373, 375, 378, 378, 380, 403, 405, 407, 408, 412, 440, 466, 479, 485, 486, 493, 504, 509, 525, 537, 564, 565, 570, 578, 581, 584, 589, 605, 611, 617, 621, 650, 665, 669, 692, 696, 714, 742, 756, 756, 763, 766, 776, 780, 789, 817, 857, 881, 882, 883, 885, 897, 898, 906, 909, 911, 916, 929, 929, 939, 941, 958, 985, 988, 994};
        System.out.println(recursiveBinarySearch(data, 102));
    }

    public static int[] getSlice(int[] array, int startIndex, int endIndex) {
        // Get the slice of the Array
        int[] slicedArray = new int[endIndex - startIndex];
        // copying array elements from the original array to the newly created sliced array
        System.arraycopy(array, startIndex, slicedArray, 0, slicedArray.length);
        // returns the slice of an array
        return slicedArray;
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

    public static int recursiveBinarySearch(int[] arr, int n) {
        int midpoint = (int)(arr.length/2);
        if (arr[midpoint] == n) {
            return midpoint;
        } else if (arr.length == 1) {
            return -1;
        }

        if (arr[midpoint] > n) {
            recursiveBinarySearch(getSlice(arr, 0, midpoint), n);
        } else if (arr[midpoint] < n) {
            recursiveBinarySearch(getSlice(arr, midpoint, arr.length), n);
        }
        return -1;
    }
}
