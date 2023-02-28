package school.mjc.stage0.conditions.task5;

public class SwitchDaysInMonthPrinter {
    public void amountOfDays(int month) {
        switch (month){
            case (1):
                System.out.println("January = " + 31);
               break;
             case(2):
                System.out.println("February = " + 28);
                break;
            case (3):
                System.out.println("March = " + 31);
                break;
            case(4):
                System.out.println("April = " + 30);
                break;
            case(5):
                System.out.println("May = " + 31);
                break;
             case(6):
                System.out.println("June = " + 30);
                break;
             case(7):
                System.out.println("July = " + 31);
                break;
             case(8):
                System.out.println("Agust = " + 31);
                break;
             case(9):
                System.out.println("September = " + 31);
                break;
             case(10):
                System.out.println("October = " + 31);
                break;
             case(11):
                System.out.println("November = " + 30);
                break;
             case(12):
                System.out.println("Desember = " + 31);
                break;
                
            default:
                System.out.println("wrong month);
        }    
    }
    
    public static void main (String[] args){
        SwitchDaysInMonthPrinter main = new SwitchDaysInMonthPrinter();
        main.amountOfDays(2);
        
    }
}
