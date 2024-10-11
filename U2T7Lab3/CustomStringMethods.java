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

    public String pigLatin(String orig) {
        String firstLetter = orig.substring(0,1);
        return orig.substring(1) + firstLetter + "ay";
    }

    public String removeCharacter(String myString, int removeIdx) {
        if (removeIdx == 0) {
            return myString.substring(1);
        } else if (removeIdx > myString.length() - 1) {
            return myString;
        }
        String firstPart = myString.substring(0,removeIdx);
        String secondPart = myString.substring(removeIdx + 1);
        return firstPart + secondPart;
    }

    public String insertAt(String orig, String insertText, String searchStr) {
        int strLocation = orig.indexOf(searchStr);
        if (strLocation == -1) {
            return orig + insertText;
        }
        String firstPart = orig.substring(0, strLocation);
        String secondPart = orig.substring(strLocation);
        return firstPart + insertText + secondPart;
    }

    public String endUp(String myString, int numToCap) {
        if (numToCap >= myString.length()) {
            return myString.toUpperCase();
        }
        String firstPart = myString.substring(0, myString.length() - numToCap);
        String secondPart = myString.substring(myString.length() - numToCap).toUpperCase();
        return firstPart + secondPart;
    }

    public String yellOrWhisper(String myString) {
        String lowerCaseFirstLetter = myString.substring(0, 1).toLowerCase();
        if (lowerCaseFirstLetter.equals(myString.substring(0, 1))) {
            return myString.toLowerCase();
        }
        return myString.toUpperCase();
    }
}
