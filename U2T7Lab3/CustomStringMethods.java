package U2T7Lab3;

public class CustomStringMethods {
    
    public CustomStringMethods() { }

    public boolean longerThan(String myString, int maxLength) {
        if (myString.length()<=maxLength) {
            return false;
        } else {
            return true;
        }
    
    }

    public String funnyString(String str, int idx) {
        String x = str.substring(idx, idx + 1);
        str = x + str + x;
        return str;
    }

    public String halvesReversed(String myString) {
        String firstHalf = myString.substring(0, myString.length()/2);
        String secondHalf = myString.substring(myString.length()/2);
        String reversedHalves = secondHalf + firstHalf;
        return reversedHalves;
    }
  
  


    
}
