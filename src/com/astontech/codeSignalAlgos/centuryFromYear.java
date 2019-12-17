package com.workspace.workspace.codeSignalAlgos;

public class centuryFromYear {

    public static void main(String[] args) {
        System.out.println(centuryFromYear(1701));
    }

    static int centuryFromYear(int year) {
        double temp = Math.floor(year / 100.00);
        double yearsIntoCentery =  (year/100.00) - temp;
        if (yearsIntoCentery > 0) {
            return (int) temp + 1;
        }
        return (int) temp;
    }
}
