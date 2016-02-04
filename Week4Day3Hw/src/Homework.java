/**
 * Created by charlie on 2/4/16.
 */
public class Homework {
    public static void main(String[] args) {

    }


    //CodingBat says all tests passed
    boolean doubleX(String str) {
        return str.matches("[^x]*xx.*");
    }


    //CodingBat says all tests passed
    public String delDel(String str) {
        if (str.matches(".del.*")) {
            return str.substring(0,1) + str.substring(4);
        } else {
            return str;
        }
    }
}
