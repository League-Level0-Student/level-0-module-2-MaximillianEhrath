package _14_rollercoaster;

import java.util.Scanner;

public class RollerCoaster {
        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            System.out.println("How tall are you?");
            String heightStr = sc.nextLine();
            float height = Float.parseFloat(heightStr);
            if (height >= 5.5){
                System.out.println("Enjoy the the ride.");
            }
            else{
                System.out.println("You can't go on the roller coaster yet. You have to be 5.5 feet or higher.");
            }
        }


}
