import java.util.Scanner;

public class tugas {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

    while (true) {
        System.out.println( "====lybrary system====");
        System.out.println("1. login as student");
        System.out.println("2. login as admin");
        System.out.println("3. exit");
        System.out.print("choose option (1-3) ");
        int option = input.nextInt();

        switch (option) {
            case 1:
                Scanner Nim = new Scanner(System.in);
                System.out.print("enter your Nim: ");
                String nim = Nim.nextLine();

                if (nim.length() == 15){
                        System.out.println("login berhasil");
                } else {
                    System.out.println("NIM salah");
                }

                break;

            case 2:
                Scanner admin = new Scanner(System.in);

                System.out.print("enter your username (admin)");
                String user =admin.next();
                System.out.print("enter your password (admin)");
                String pass = admin.next();

                if (user.equals("admin") && pass.equals("admin")){
                    System.out.println("login berhasil");
                } else {
                    System.out.println("admin salah");
                }

                break;

            case 3:
                System.out.println("arigato");
                input.close();
                System.exit(0);

            default:
                System.out.println("input salah");
                break;

            }
        }
    }
}
