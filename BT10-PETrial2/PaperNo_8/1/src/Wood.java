/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author User
 */
public class Wood {
    private String source;
    private int year;

    public Wood() {
    }

    public Wood(String source, int year) {
        this.source = source;
        this.year = year;
    }

    public String getSource() {
        String newSource = source.substring(0, source.length()-1);
        return newSource;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year - getYear();
    }
}
