package MathCharpter;

/**
 * created by Hannah Li on 19/1/8
 * Project name: LeetcodeProject
 * LeetCode NO.:67
 */
public class AddBinary67 {

    public static void main(String[] args){
        String a = "11";
        String b = "1";
        System.out.print(addBinary2(a,b));
    }

    /**
     * Given two binary strings, return their sum (also a binary string).
     * The input strings are both non-empty and contains only characters 1 or 0.
     * Input: a = "11", b = "1"
     * Output: "100"
     */

    public static String addBinary2(String a, String b) {
        StringBuilder sb = new StringBuilder();
        int i = a.length() - 1, j = b.length() -1, carry = 0;
        while (i >= 0 || j >= 0) {
            int sum = carry;
            if (j >= 0) sum += b.charAt(j--) - '0';
            if (i >= 0) sum += a.charAt(i--) - '0';
            sb.append(sum % 2);
            carry = sum / 2;
        }
        if (carry != 0) sb.append(carry);
        return sb.reverse().toString();
    }
}
