package spielwiese2.classcodes.exceptions.ex3;

public class Main {
    public static void main(String[] args) throws NumberTooSmallException, NumberTooLargeException{
        SafeCalculator calculator= new SafeCalculator();
        int result=0;

        try{

            result= calculator.calculate(Integer.MIN_VALUE, 2);

        }catch(NumberTooSmallException e){
            System.out.println("Numbers are too small");
        }catch (NumberTooLargeException e){
            System.out.println("Numbers are too large");
        }
        try{
            result= calculator.calculate(Integer.MIN_VALUE, 2);
        }catch (NumberTooLargeException| NumberTooSmallException e){
            System.out.println("hfgksjdbfk");
        }






    }
}
