import java.util.Scanner;

public class Main {

    static rec[] recs = new rec[9];


    public static void main(String[] args) {
        for (int i = 0; i < recs.length; i++) {
            recs[i] = new rec();
            recs[i].owner = Integer.toString(i+1);
        }
        Scanner scanner = new Scanner(System.in);
        int input;

        System.out.println(render());


        while(true){
            System.out.print("What colomn X: ");
            input = scanner.nextInt();
            recs[input - 1].changeOwner("X");
            System.out.println(render());
            if(check()){
                System.out.println("X Won");
                break;
            }

            System.out.print("What colomn O: ");
            input = scanner.nextInt();
            recs[input - 1].changeOwner("O");
            System.out.println(render());
            if(check()){
                System.out.println("O Won");
                break;
            }
        }



    }
    public static String render(){
        String c00 = recs[0].owner;
        String c01 = recs[1].owner;
        String c02 = recs[2].owner;
        String c10 = recs[3].owner;
        String c11 = recs[4].owner;
        String c12 = recs[5].owner;
        String c20 = recs[6].owner;
        String c21 = recs[7].owner;
        String c22 = recs[8].owner;

        // Build the board string using these variables
        String board =
                " " + c00 + " | " + c01 + " | " + c02 + " \n" +
                        "---+---+---\n" +
                        " " + c10 + " | " + c11 + " | " + c12 + " \n" +
                        "---+---+---\n" +
                        " " + c20 + " | " + c21 + " | " + c22 + " ";
        return board;
    }
    public static boolean check(){
        if ((recs[0].owner == recs[1].owner) && (recs[1].owner == recs[2].owner)){
            return true;
        }
        else if ((recs[3].owner == recs[4].owner) && (recs[4].owner == recs[5].owner)) {
            return true;
        }
        else if ((recs[6].owner == recs[7].owner) && (recs[7].owner == recs[8].owner)){
            return true;
        }
        if ((recs[0].owner == recs[3].owner) && (recs[3].owner == recs[6].owner)){
            return true;
        }
        else if ((recs[1].owner == recs[4].owner) && (recs[4].owner == recs[7].owner)) {
            return true;
        }
        else if ((recs[2].owner == recs[5].owner) && (recs[5].owner == recs[8].owner)){
            return true;
        }
        else if ((recs[0].owner == recs[4].owner) && (recs[4].owner == recs[8].owner)) {
            return true;
        }
        else if ((recs[2].owner == recs[4].owner) && (recs[4].owner == recs[6].owner)){
            return true;
        }

        return false;
    }
}
