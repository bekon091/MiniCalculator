/**
 * @author Kevin Uy
 * @version 1.0.0
 * @since 4/18/2020
 *
 */
public class UnitTests {
    public static void main(String args[]){
        multiplyTest();
        divideTest();
        calculateTest();
    }

    public static void multiplyTest(){ //
        int expectedOutput = 5;
        int input = 5;
        MiniCalculator calc = new MiniCalculator();
        calc.multiply(input);
        if(expectedOutput != calc.calculate()){ //Testing the method; expected success
            System.out.println("FAILED MULTIPLY");
        }
        else{
            System.out.println("SUCCESSFUL MULTIPLY");
        }
    }

    public static void divideTest(){
        double expectedOutput = 0.5;
        int input = 2;
        MiniCalculator calc = new MiniCalculator();
        calc.divide(input);
        if(expectedOutput != calc.calculate()){ //Testing the method; expected failure because it's a double result that is expected
            System.out.println("FAILED DIVIDE");
        }
        else{
            System.out.println("SUCCESSFUL DIVIDE");
        }
    }

    public static void calculateTest(){
        MiniCalculator calc = new MiniCalculator();
        if(calc.calculate() != 1){ //Testing the method; expected success
            System.out.println("FAILED CALCULATE");
        }
        else{
            System.out.println("SUCCESSFUL CALCUlATE");
        }
    }
}
