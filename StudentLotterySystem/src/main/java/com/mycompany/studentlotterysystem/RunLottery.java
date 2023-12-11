package com.mycompany.studentlotterysystem;


import java.util.ArrayList;
import java.util.InputMismatchException;

public class RunLottery {
    
    private static ArrayList<Student> stdList;
    private static Integer numberofWinners;
    
    public RunLottery(ArrayList<Student> stdList, Integer numberofWinners) {
        this.stdList = stdList;
        this.numberofWinners = numberofWinners;
    }
    
   
    public static ArrayList<Student> Lottery() {
     
        ArrayList<Student> Winners = new ArrayList<Student>();
        
        boolean error = false;
        
        // Loop to keep asking for the number of winners until a valid number is entered
        while(true) {
            
            try {
                if (error)
                return null;
                
                error = numberofWinners > stdList.size();
                
            } catch (InputMismatchException e) {
                error = true;
                continue;
            }
            
            if (error) {
                return null;
            } else 
                break;
                
        }
        // Randomly chooses Students and adds them to "Winner" array
        for (int i = 0; i < numberofWinners; i++){
            int W = (int) (Math.random()*stdList.size());
            Winners.add(stdList.get(W));
            stdList.remove(W);
            System.out.println(stdList);
            System.out.println(Winners);
        }
        
        return Winners;
    }
    
    public ArrayList<Student> getLosers() {
        return stdList;
    }
  

}


    
    
   
