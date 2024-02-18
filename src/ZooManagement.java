import java.util.Scanner;
public class ZooManagement {
    public static void main (String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Veuillez entrer le nombre de cages a gerer :");
        int nbrCages = scanner.nextInt();
        System.out.println("Veuillez entrer le nom du zoo a gerer :");
        scanner.nextLine();
        String zooName = scanner.nextLine();
        System.out.println("Le zoo " + zooName + " comporte " + nbrCages + " cages.");
        scanner.close();

    }

}
