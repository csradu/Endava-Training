/**
 * This file is part of the Endava Graduates training program
 * Created by Calin Radu 20.07.2015
 */

public class Main {
    public static void main(String[] args) {
        PasswordMaker pm = new PasswordMaker("Calin", "Radu", 22);
        System.out.println(pm.getPassword());
    }
}
