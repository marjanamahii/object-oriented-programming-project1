/*Name: Marjana Begum
 Id: 1812020238
 Section: Improve 5(c)
 E-mail: cse_1812020238@lus.ac.bd
 Date: 16-07-2021
 */
package marjana;

import java.util.Scanner;

public class Main {

    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        String section;
        System.out.println("Enter section: ");
        section = input.nextLine();
        System.out.println("section: " +section);

        Info myInfo = new Info();
        System.out.println("Name: " +myInfo.name);
        System.out.println("Id: " +myInfo.id);

        Hobby myHobby = new Hobby();
        System.out.println("Hobby: " +myHobby.hobbyName);

    }
}

