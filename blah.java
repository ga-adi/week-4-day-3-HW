/**
 * Created by ShowMe on 2/3/16.
 */
public class blah {
    public static void main(String[] args) {
    }


    //Problem 1
    public boolean doubleX(String str) {

        String[] split = str.split("");
        boolean test = false;

        for (int i = 0; i < split.length - 1; i++) {

            if (split[i].equals("x")) {
                if (split[i + 1].equals("x")) {
                    test = true;
                    break;
                } else {
                    test = false;
                    break;
                }
            } else {
                test = false;
            }
        }
        return test;
    }

    //Problem 2
    //Note: The online compiler sets split[0] = "".
    //I moved each digit up by 1 to account for that.
    //However, if testing here, all digits need to be moved down by 1 as it appears split[0] = the first character of the string.
    public static String delDel(String str) {
        String[] split = str.split("");
        String newWord = "";
        if (split.length < 4) {
            return str;
        } else if (split[2].equals("d") && split[3].equals("e") && split[4].equals("l")) {

            for (int i = 5; i < split.length; i++) {
                newWord += split[i];
            }
            return split[1] + newWord;
        } else {
            return str;
        }
    }
}
