/**
 * This file is part of the Endava Graduates training program
 * Created by Calin Radu 22.07.2015
 */
package com.endava.flowcontrol;


public class EveryNth {

    /**
     * @return String with every (n+1)th letter of the initial string, starting from the first
     */
    public String everyNth(String str, int n) {
        StringBuilder strBuild = new StringBuilder();
        for (int i = 0; i < str.length(); i += n) {
            strBuild.append(str.charAt(i));
        }
        return strBuild.toString();
    }
}
