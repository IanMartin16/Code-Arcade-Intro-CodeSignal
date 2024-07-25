class Solution {
    public static int solution(int year) {
    
        if (year % 100 == 0) {   //checa si el año es divisible entre 100 para asignarle el siglo que corresponde
            return year / 100;
        } else {
            return (year / 100) + 1;    //de lo contrario se le asigna el siglo siguiente que corresponda
        }
    
    }
}



//Given a year, return the century it is in. The first century spans from the year 1 up to and including the year 100, the second 
//from the year 101 up to and including the year 200, etc.