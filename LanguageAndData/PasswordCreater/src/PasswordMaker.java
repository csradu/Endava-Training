/**
 * This file is part of the Endava Graduates training program
 * Created by Calin Radu 20.07.2015
 */

/**
 * Class for building passwords having certain parameters
 */
public class PasswordMaker {

    private static final int MAGIC_NUMBER = 5;

    private final String MAGIC_STRING;

    private String firstName;
    private String lastName;
    private int age;

    public PasswordMaker(String firstName, String lastName, int age) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.age = age;

        RandomStringGenerator generator = new RandomStringGenerator(20, "abcdefghijklmnopqrstuvwxyz");
        MAGIC_STRING = generator.next();
    }

    /**
     * Generates a password made of: - last age%3 letters of the first name
     *                               -
     * @return
     */
    public String getPassword() {
        String password = "";
        password += firstName.substring(firstName.length() - age % 3);
        RandomStringGenerator generator1 = new RandomStringGenerator(10, MAGIC_STRING);
        String magicAlphabet = generator1.next();
        RandomStringGenerator generator2 = new RandomStringGenerator(MAGIC_NUMBER, magicAlphabet);
        password += generator2.next();
        password += Integer.toString(age + lastName.length());

        return password;
    }

}
