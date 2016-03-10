import java.io.BufferedReader;
import java.util.Scanner;

//calculator runner
public class InteractRunner {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);     //creating input from console
        Calculator calculator= new Calculator();   //instance of class calculator

        while (true)
            start:{
                if(!calculator.isSave()){
                    try {
                        System.out.println("enter first value");
                        calculator.setFirst(Double.parseDouble(sc.next()));
                        System.out.println("enter type of operation(+,-,/,*,e)");
                        calculator.setOperation(sc.next());
                    }
                    catch (Exception e){
                        System.out.println("Please be so kind to provide numbers instead of your shit");
                        break start;
                    }
                }
                try {
                    System.out.println("enter second value");
                    calculator.setSecond(Double.parseDouble(sc.next()));
                }
                catch (Exception e){
                    System.out.println("NUMBERS, ENTER NUMBER BITCH");
                    break start;
                }
                System.out.println("Result: "+calculator.calculate());
                System.out.println("Enter 'y' to exit/ or enter" + "any symbol to continue");
                if (sc.next().equals("y")){
                    System.out.println("Bye-Bye");
                    break;
                }
                else{
                    System.out.println("enter symbol 'y' not save" + "'result'/ enter any symbol 'result' use next?");
                    if (!sc.next().equals("y")){
                        calculator.setSave(true);
                        calculator.setFirst(calculator.getResult());
                    }
                }
            }

    }
}
