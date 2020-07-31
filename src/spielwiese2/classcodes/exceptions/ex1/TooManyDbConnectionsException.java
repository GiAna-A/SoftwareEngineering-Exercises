package spielwiese2.classcodes.exceptions.ex1;

public class TooManyDbConnectionsException extends RuntimeException {
    public TooManyDbConnectionsException(String message){
        super(message);

    }
}
