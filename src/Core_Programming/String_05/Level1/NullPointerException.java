package CoreProgramming.StringFunctions.Level1;
public class NullPointerException {
    public static void nullPointerException(){
        String text = null;
        System.out.println(text.length());
    }
    public static void handleNullPointerException(){
        String text = null;
        try{
            System.out.println(text.length());
        }
        catch(java.lang.NullPointerException e){
            System.out.println("NUllPointerException handled: text is null");
        }
    }
    public static void main(String[] args) {
        // nullPointerException();
        handleNullPointerException();
    }
}
