public class Hangman {

    public static void main(String[] args ){

        if(args.length == 0) {
            System.out.println("No word found..");
            System.exit(0);
        }
        Game g = new Game(args[0]);
        Prompter prompter = new Prompter(g);
        prompter.play();
    }
}