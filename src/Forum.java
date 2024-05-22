import java.util.Scanner;

public class Forum {


    Swedish swedish;
    Spanish spanish;
    English english;


    public static void main(String[] args) {
        Swedish swedish = new Swedish("Börje");
        Spanish spanish = new Spanish("Jorge");
        English english = new English("Keith");
        Human human;

        Scanner scan = new Scanner(System.in);

        System.out.println("1 for swedish, 2 for spanish, 3 for english");
        switch (scan.nextInt()){
            case 1 -> human = new Swedish("alex");
            case 2 -> human = new Spanish("alex");
            default -> human = new English("alex");
        }

        swedish.talk(human);
        spanish.talk(human);
        english.talk(human);


    }
}