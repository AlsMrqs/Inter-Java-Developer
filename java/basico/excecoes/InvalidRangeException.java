import java.util.Scanner;

public class InvalidRangeException extends Exception {

    public
    InvalidRangeException () {
        super("Invalid range!");
    }

    public
    InvalidRangeException (String str) {
        super(str);
    }

    public static void
    main (String[] args) {
        Number unity;

        try {
            unity = new Number(10);
            System.out.println("Valid unity "+ unity.getNumber());
        } catch (InvalidRangeException err) {
            err.printStackTrace();
        } finally {
	    System.out.println("Can't set a new unity!");
	}
    }
}

class Number {

    private int number;

    public
    Number (int number) throws InvalidRangeException {
        setNumber(number);
    }

    public void
    setNumber (int number) throws InvalidRangeException {
        if (number < -9 || number > 9) {
            throw new InvalidRangeException("Invalid unity!");
        }
        this.number = number;
    }

    public int
    getNumber () { return number; }
}
