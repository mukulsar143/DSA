
import java.util.*;

class LeetCode {

    // Merge String Lternatively
    public static String strAlt(String str1, String str2) {
        StringBuilder result = new StringBuilder();
        int i = 0;
        while (i < str1.length() || i < str2.length()) {
            if (i < str1.length()) {
                result.append(str1.charAt(i));
            }
            if (i < str2.length()) {
                result.append(str2.charAt(i));
            }
            i++;
        }
        return result.toString();
    }

    // GCD Strings
    public static int gcd(int len1, int len2) {
        while (len2 != 0) {
            int temp = len1 % len2;
            len1 = len2;
            len2 = temp;
        }
        return len1;
    }

    public static String gcdString(String str1, String str2) {
        if (!(str1 + str2).equals(str2 + str1)) {
            return "";
        }

        int lengcd = gcd(str1.length(), str2.length());
        return str1.substring(0, lengcd);
    }

    // Kids With n candies
    public static List<Boolean> candies(int candies[], int extraCan) {
        int maxCan = -1;
        List<Boolean> res = new ArrayList<>();
        for (int candy : candies) {
            if (candy > maxCan) {
                maxCan = candy;
            }
        }
        for (int candy : candies) {
            if (candy + extraCan >= maxCan) {
                res.add(true);
            } else {
                res.add(false);
            }
        }
        return res;
    }

    // can place flowrerbed
    public static boolean flowerBed(int flowerbed[], int n) {
        int len = flowerbed.length;

        for (int i = 0; i < len; i++) {
            boolean emptyleft = (i == 0) || (flowerbed[i - 1] == 0);
            boolean emptyright = (i == len - 1) || (flowerbed[i + 1] == 0);
            if (emptyleft && emptyright && flowerbed[i] == 0) {
                flowerbed[i] = n;
                n--;
            }
        }
        return n <= 0;
    }

    // Reverse vowels
    public static String vowelsStr(String s) {
        char chars[] = s.toCharArray();
        int left = 0;
        int right = chars.length - 1;

        while (left < right) {
            while (left < right && !isVowel(chars[left])) {
                left++;
            }
            while (left < right && !isVowel(chars[right])) {
                right--;
            }
            char temp = chars[left];
            chars[left] = chars[right];
            chars[right] = temp;

            left++;
            right--;
        }
        return new String(chars);
    }

    public static boolean isVowel(char c) {
        return c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u' || c == 'A' || c == 'E' || c == 'I' || c == 'U';
    }

    public static void main(String args[]) {
        String str1 = "ABC", str2 = "MNC";
        String str3 = "ABCABC", str4 = "ABC";
        System.out.println(strAlt(str1, str2));
        System.out.println(gcdString(str3, str4));
        System.out.println();
        int arr[] = {2, 4, 5, 9, 7};
        List<Boolean> res = candies(arr, 3);
        System.out.println(res);
        int arr1[] = {1, 0, 0, 0, 1, 0, 0, 0};
        boolean res2 = flowerBed(arr1, 2);
        System.out.print(res2);
        System.out.println();
        String s = "IceCreAm";
        System.out.println(vowelsStr(s));
    }
}
