import java.util.Scanner;

public class PassValid {
    public static String[] forbiddenWords = {"Passwort1", "Abc123456", "qwerty"};

    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a password: ");
        String s = scanner.nextLine();
        if (passValid(s))
            System.out.println("The password is valid");
        else {
            if (!passLength(s))
                System.out.println("The password must be at least 8 characters long");
            if (!containsDigits(s))
                System.out.println("The password must contain at least one number");
            if (!containsUpper(s))
                System.out.println("The password must contain at least one capital letter");
            if (!containsLower(s))
                System.out.println("The password must contain at least one lowercase letter");
            if (containsForbiddenWord(s))
                System.out.println("The password contains a forbidden word");
        }

    }
    public static boolean passValid(String s){
        return passLength(s)&&containsDigits(s)&&containsUpper(s)&&containsLower(s)&&!containsForbiddenWord(s);
    }

    public static boolean passLength(String s){
        return (s.length() >= 8);
    }

    public static boolean containsDigits(String s){
        for (char c : s.toCharArray())
            if (Character.isDigit(c)) return true;
        return false;
    }

    public static boolean containsUpper(String s){
        for (char c : s.toCharArray())
            if (Character.isUpperCase(c)) return true;
        return false;
    }

    public static boolean containsLower(String s){
        for (char c : s.toCharArray())
            if (Character.isLowerCase(c)) return true;
        return false;
    }

    public static boolean containsForbiddenWord(String s){
        for (String st : forbiddenWords)
            if (s.contains(st)) return true;
        return false;
    }
}
