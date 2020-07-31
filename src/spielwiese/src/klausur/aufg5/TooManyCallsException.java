package spielwiese.src.klausur.aufg5;

public class TooManyCallsException extends Exception{

 //erstmal Klasse als Exception machen (dadurch bekommt Methoden von Exception)
	public TooManyCallsException (String message){
            super(message);
        }
}
