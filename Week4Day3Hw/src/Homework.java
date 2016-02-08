/**
 * Created by charlie on 2/4/16.
 */
public class Homework {
    public static void main(String[] args) {}

    /**
     * Week 4 Day 3 HW
     *
     * http://codingbat.com/prob/p186759
     * Given a string, return true if the first instance of "x" in the string is immediately followed by another "x".
     * @param str
     * @return
     *
     * CodingBat says all tests passed
     */
    boolean doubleX(String str) {
        return str.matches("[^x]*xx.*");
    }

    /**
     * Week 4 Day 3 HW
     *
     * http://codingbat.com/prob/p100905
     * Given a string, if the string "del" appears starting at index 1, return a string where that "del" has been
     * deleted. Otherwise, return the string unchanged.
     * @param str
     * @return
     *
     * CodingBat says all tests passed
     */
    public String delDel(String str) {
        if (str.matches(".del.*")) {
            return str.substring(0,1) + str.substring(4);
        } else {
            return str;
        }
    }

    /**
     * Week 5 Day 1 HW
     *
     * http://codingbat.com/prob/p101475
     * Given a string and a non-negative int n, we'll say that the front of the string is the first 3 chars,
     * or whatever is there if the string is less than length 3. Return n copies of the front;
     * @param str
     * @param n
     * @return
     *
     * CodingBat says all tests passed
     */
    public String frontTimes(String str, int n) {
        if (str.length() > 3) {
            str = str.substring(0, 3);
        }
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < n; i++) {
            sb.append(str);
        }
        return sb.toString();
    }

    /**
     * Week 5 Day 1 HW
     *
     * http://codingbat.com/prob/p121596
     * Given a string, return a string made of the chars at indexes 0,1, 4,5, 8,9 ... so "kittens" yields "kien".
     * @param str
     * @return
     *
     * CodingBat says all tests passed
     */
    public String altPairs(String str) {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < str.length(); i += 4) {
            sb.append(str.charAt(i));
            if (i + 1 < str.length()) {
                sb.append(str.charAt(i + 1));
            }
        }
        return sb.toString();
    }
}
