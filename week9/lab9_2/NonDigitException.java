package lab9_2;

public class NonDigitException extends Exception{
    public NonDigitException(){
    }

    public NonDigitException(String message){
        super(message);
    }
}
