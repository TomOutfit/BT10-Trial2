/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author User
 */
public class MyString implements IString{

    @Override
    public int f1(String str) {
        String[] parts = str.split(" ");
        int count = 0;
        for (String part : parts) {
            if (part.matches("[a-zA-Z]")) {
                count++;
            }
        }
        return count;
    }

    @Override
    public String f2(String str) {
        String[] parts = str.split(" ");
        return parts[0];
    }
}