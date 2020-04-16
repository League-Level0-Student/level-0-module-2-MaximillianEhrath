package _06_lottery_numbers;

import javax.swing.*;
import java.util.ArrayList;
import java.util.Random;

public class LotteryNumbers {
    public static void main(String[]args){
// size of ArrayList
        int n = 6;

        //declaring ArrayList with initial size n
        Random rand = new Random();
        ArrayList<Integer> arrli = new ArrayList<>(n);

        // Appending the new element at the end of the list
        for (int i=0; i<n; i++) {
            int num = rand.nextInt(101) + 1;

            arrli.add(num);
        }

        // Printing elements
        System.out.println(arrli);
        JOptionPane.showMessageDialog(null, arrli,"lotto inc", JOptionPane.INFORMATION_MESSAGE);
    }
}
