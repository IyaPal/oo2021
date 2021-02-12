import java.sql.Date;
import java.util.Arrays;
import java.util.List;

import javax.lang.model.util.ElementScanner6;

public class Homework {
    public static String age(int birthYear, int birthMonth, int birthDay){
        int years = 2020 - birthYear; 
        int months = years*12 + 12 - birthMonth+1;
        int monthDays;
        

        if (Arrays.asList(1,3,5,7,8,10,12).contains(birthMonth)) {
             monthDays = 32-birthDay;
            }
         else if (birthMonth == 2) {
             monthDays = 28-birthDay;
            }
         else {
             monthDays = 31-birthDay;
         }
         int days = years/4 + years*365 + (12 - birthMonth+1)*30 + (12 - birthMonth+1)/2+1 + monthDays+12;
         

        return days + " " + months + " " + years;
    }
    public static void main(String[] args) {
        System.out.println(age(1993, 11, 29));
        System.out.println();
        


    }
}
