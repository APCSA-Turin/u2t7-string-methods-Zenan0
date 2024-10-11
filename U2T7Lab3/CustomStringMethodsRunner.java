package U2T7Lab3;

public class CustomStringMethodsRunner {
        public static void main(String[] args) {
        CustomStringMethods methods = new CustomStringMethods();
        Boolean trueOrFalse = methods.longerThan("apple", 5);
        System.out.println(trueOrFalse);
        String str = methods.funnyString("computer", 3);
        System.out.println(str);
        str = methods.halvesReversed("see you later!");
        System.out.println(str);
        str = methods.pigLatin("Brooklyn");
        System.out.println(str);
        str = methods.removeCharacter("Hi friend", 2);
        System.out.println(str);
        str = methods.insertAt("spooooky!", "YIKES", "o");
        System.out.println(str);
        str = methods.endUp("Shhhh! Be quiet", 3);
        System.out.println(str);
        str = methods.yellOrWhisper("Abcdefghijk");
        System.out.println(str);
    }
}
