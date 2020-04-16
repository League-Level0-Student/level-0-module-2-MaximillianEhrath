package _15_voting_booth;

import java.util.Scanner;

public class VotingBooth {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("How old are you?");
        String agesStr = sc.nextLine();
        int ages = Integer.parseInt(agesStr);
        if (ages >= 18){
            System.out.println("Ask who is going to be the next president.");
            String president = sc.nextLine();
            System.out.println(president);
        }
        else{
            System.out.println("You aren't old enough to vote yet.");
        }
    }

    }
