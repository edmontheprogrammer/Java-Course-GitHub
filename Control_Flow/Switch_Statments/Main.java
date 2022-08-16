public class Main {

    public static void main(String[] args) {
        // Switch Statments
        int role = 1;

        switch (role) {
            case 1:
                System.out.println("You're an admin");
                break;
            case 2:
                System.out.println("You're a moderator");
                break;
            default:
                System.out.println("You're a guest");
        }

        // if (role == "admin")
        // System.out.println("You're an admin");
        // else if (role == "moderator")
        // System.out.println("You're a moderator");
        // else
        // System.out.println("You're a guest");
    }
}