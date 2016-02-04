/**
 * Created by Wasabi on 2/3/2016.
 */
public class JavaChallenge {
    public static void main(String[] args) {

    }


    public boolean doubleX(String str) {

        int firstXIndex = str.indexOf("x");
        if(str.length() == firstXIndex+1){
            return false;
        }else if(str.charAt(firstXIndex+1) == 'x'){
            return true;
        }return false;
    }

    public String delDel(String str){
        int delIndex = str.indexOf("del");
        if(delIndex == 1) {
            return str.substring(0, delIndex) + str.substring(delIndex + 3, str.length());
        } return str;
    }
}
