package Chapter23;

public class QuestionBinary {
    public static void main(String[] args) {
       // binary(cennet);
//Write a function that transforms all letters from [a, m] to 0 and letters from [n, z] to 1 in a string.

    }

    public static void binary(String name) {//'a' n,a,m,e
        String store = "";
        for (int i = 0; i < name.length(); i++) {
            if (name.charAt(i) >= 'a' && name.charAt(i) <= 'm') {
                store += String.valueOf(0);
            }
            if (name.charAt(i) >= 'n' && name.charAt(i) <= 'z') {
                store += "1";
            }
        }
        System.out.println(store);
    }
}