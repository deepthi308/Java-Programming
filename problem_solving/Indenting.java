import java. util. Scanner;

public class Indenting{
    public static void main(String[] args){
        String str;
        Integer number;
        String tempNum = "";
        
        Scanner scanner = new Scanner(System.in);
        
         System.out.println("================================");
        
        for(int i=0; i<3; i++)
        {
           str = scanner.next();
           number = scanner.nextInt();
           
        if(number<10)
        {
            tempNum = "00" + number.toString();
            System.out.printf("%-15s%-15s\n", str, tempNum);
        }
        else if(number<100)
        {
             tempNum = "0" + number.toString();
             System.out.printf("%-15s%-15s\n", str, tempNum);
        }
        else{
            number = number+0;
            System.out.printf("%-15s%-15s\n", str, number);
        }
        
        }
        
        System.out.println("================================");
        
    }
}


