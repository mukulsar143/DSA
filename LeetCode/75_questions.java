
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

    public static void main(String args[]) {
        String str1 = "ABC", str2 = "MNC";
        strAlt(str1, str2);
        gcdString(str1, str2);

    }
}
