package telran;



public class Main {
    public static String n = "Not";

    public static void main(String[] args) {

        characterMovement("Not everything is as scary as it seems");
    }
    public static void characterMovement(String s) {
        StringBuilder Not = new StringBuilder(s);
            if(s.startsWith(n)){
                  Not.delete(0,3);
                        Not.insert(s.length()-3, (" " + n.toLowerCase()));
            }else{
                Not.insert(0,(n + " "));
            }
        System.out.println(Not);
    }
}