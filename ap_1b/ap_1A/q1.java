import java.util.*;

public class q1
{
    
    /*
     * 
     * Christopher Xie, October 20, 1A
     */


    public static void terminalHaiku()
    {
        System.out.println("Now that I am here,");
        System.out.println("For exam I am prepared");
        System.out.print("I shall have no fear.");
         
        
    }
    
    public static void IO(){
        Scanner scn = new Scanner(System.in);
        System.out.println("What is your favourite course at school?");
        String course = scn.nextLine();
        System.out.println("What is your favourite show?");
        String show = scn.nextLine();
        System.out.println("How many hours do you spend studying each day?");
        int hoursStudy = scn.nextInt();
        System.out.println("How many hours do you spend watching shows each day?");
        int hoursShow = scn.nextInt();
        System.out.println("Summary: \nYour favourite course is "+course+".\nYour favourite show is "+show+".\nYou spend "+hoursStudy+" hours studying each day.\nYou spend "+hoursShow+" hours watching shows each day.\nIn total, you spend "+(hoursStudy+hoursShow)+" hours studying and watching shows each day.");
    }

}
