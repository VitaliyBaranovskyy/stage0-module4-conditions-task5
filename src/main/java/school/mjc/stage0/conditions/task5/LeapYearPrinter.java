package school.mjc.stage0.conditions.task5;

public class LeapYearPrinter {
    public void isLeapYear(int year) {
      int a = year % 4;
        switch(a){
         case(0):
                System.out.println("leap");
                break;
            default:
                System.out.println("not leap");
                
        }
        
    }
    
    public static void main (String[] args){
       LeapYearPrinter main = new LeapYearPrinter();
        main.isLeapYear(2024);
        
    }
}
