import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Text text = new Text(new Scanner(System.in).nextLine());
        TextService textService = new TextService();
        textService.textModifier(text);

    }
    
}



