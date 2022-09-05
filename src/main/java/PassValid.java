import java.util.Scanner;

public class PassValid {

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
            if (containsBadWord(s))
                System.out.println("The password contains a forbidden word");
        }

    }
    public static boolean passValid(String s){
        return passLength(s)&&containsDigits(s)&&containsUpper(s)&&containsLower(s)&&!containsBadWord(s);
    }

    /**
     * Checks if string length has at least 8 characters
     * @param s string to be checked
     * @return true if length >= 8 else false
     */
    public static boolean passLength(String s){
        return (s.length() >= 8);
    }

    /**
     * Checks if string contains at least one digit
     * @param s string to be checked
     * @return true if contains numbers else false
     */
    public static boolean containsDigits(String s){
        char[] arr = s.toCharArray();
        for (char c : arr){
            if (Character.isDigit(s.charAt(c)))
                return true;
        }
        return false;
    }

    public static boolean containsUpper(String s){
        char[] arr = s.toCharArray();
        for (int i = 0;i < arr.length; i++){
            if (Character.isUpperCase(s.charAt(i)))
                return true;
        }
        return false;
    }

    public static boolean containsLower(String s){
        char[] arr = s.toCharArray();
        for (int i = 0;i < arr.length; i++){
            if (Character.isLowerCase(s.charAt(i)))
                return true;
        }
        return false;
    }

    public static boolean containsBadWord(String s){
        String[] arr = {"Passwort1", "Abc123456", "qwerty"};
        for (int i = 0;i < arr.length; i++){
            if (s.contains(arr[i]))
                return true;
        }
        return false;
    }
}
