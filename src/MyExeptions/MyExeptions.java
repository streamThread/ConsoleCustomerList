package MyExeptions;

abstract public class MyExeptions extends RuntimeException {

    public MyExeptions(String s) {
        super(s);
    }

    public static class NotValidEmailException extends MyExeptions {

        public NotValidEmailException() {
            super("Invalid input e'mail's format. Correct format: vasily.petrov@gmail.com");
        }

    }

    public static class NotValidNameException extends MyExeptions {

        public NotValidNameException() {
            super("Invalid input name's format. Correct format: Василий Петров");
        }
    }

    public static class NotValidPhoneException extends MyExeptions {

        public NotValidPhoneException() {
            super("Invalid input phone's format. Correct format: +79215637722");
        }
    }
}



