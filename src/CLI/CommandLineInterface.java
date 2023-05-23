package CLI;


import java.util.Scanner;

public class CommandLineInterface {

    public void run() throws Exception {
        Scanner scanner = new Scanner(System.in);
        boolean flag = true;
        while (flag) {
            String input = scanner.nextLine();

            if (input.equalsIgnoreCase("exit")) {
                System.out.println("Exiting");
                return;
            }else{
                flag = processCommand(input);
            }

        }
        scanner.close();

    }

    private static boolean processCommand(String command) throws Exception {
        String[] tokens = command.split(" ");
        String action = tokens[0].toLowerCase();
        CommandCollection cc = new CommandCollection();


        switch (action) {
            case "help":
                cc.help();
                break;
            case "open":
                cc.open(tokens[1]);
                break;
            case "close":
                cc.close();
                break;
            case "save":
                cc.save();
                break;
            case "saveas":
                cc.saveas(tokens[1]);
                break;
            default:
                System.out.println("Unknown command: " + action);
                break;
        }
        return true;
    }
}