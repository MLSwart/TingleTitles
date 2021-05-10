package title;

import java.util.Scanner;

public class TitleGenerator {
    public static void main(String arg[]){
        //<fuck>ed in the <butt> by the <handsome><ghost> of my <writing career>

        System.out.println("Verb for having sex: to...");
        Scanner scanner = new Scanner(System.in);
        String verb = scanner.nextLine();

        System.out.println("Bodily orifice: ");
        String orifice = scanner.nextLine();

        System.out.println("Positive adjective: ");
        String adjective = scanner.nextLine();

        System.out.println("Ethereal being: ");
        String being = scanner.nextLine();

        System.out.println("Something you're proud of (noun): My ...");
        String noun = scanner.nextLine();

        scanner.close();

        System.out.println(verb + "ed in the " + orifice + " by the " + adjective + " " + being + " of my " + noun);


    }

}
