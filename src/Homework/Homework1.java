package Homework;

public class Homework1 {

    public static void main (String[] args) {
    /*            Homework Part 1
        1. number of hours in a day
	    2. number of max no. of days in a years
	    3. total number of employees in an organisation
	    4. population in a country
	    5. interest rate
	    6. balance in a bank account
	    7. does the sun rise from the west? Store answer
	    8. initials of your name
	    9. Your name


                    Homework Part 2
        Celsius to Fahrenheit	° F = 9/5 ( ° C) + 32
        Kelvin to Fahrenheit	° F = 9/5 (K - 273) + 32
        Fahrenheit to Celsius	° C = 5/9 (° F - 32)
        Celsius to Kelvin	K = ° C + 273
        Kelvin to Celsius	° C = K - 273
        Fahrenheit to Kelvin	K = 5/9 (° F - 32) + 273 */



        //Part 1
        System.out.println("********Part1********");
        System.out.println("");


        //number of hours in a day
        int numHrs = 24;
        System.out.println("There are " + numHrs + " hours in a day");

        //number of max no. of days in a years
        int maxNumDays = 365;
        System.out.println("Number of days in one year: "+ maxNumDays);

        //total number of employees in an organisation
        int numEmp = 500;
        System.out.println("This organisation has " + numEmp + " employees");

        //population in a country
        int countryPop = 328000000;
        System.out.println("The population in America is " + countryPop + " million");

        //interest rate
        double intRate = 12.99;
        System.out.println("The interest rate for this card is: " + intRate + "%");

        //balance in a bank account
        double bankAcc = 25.02;
        System.out.println("Your bank account balance is: " + "$"+bankAcc);

        //does the sun rise from the west? Store answer
        boolean sunRise = false;
        System.out.println("Does the Sun rise from the west? --> " + sunRise);

        //initials of your name
        char f = 'D';
        char l = 'G';
        // or
        String initals = "D.G";
        System.out.println("My initials are " + f + l );

        //Your name;
        String nickName = "Mika";
        System.out.println("My nick name is " + nickName);



         //Part 2
        System.out.println("");
        System.out.println("********Part2********");
        System.out.println("");


        int fahrenheit = 65;
        int kelvin = 1000;
        int celsius = 20;

        //Celsius to Fahrenheit	° F = 9/5 ( ° C) + 32
        double celsiusToFahrenheit = (9.0/5)*celsius+32;
        System.out.println("20° Celsius converted to Fahrenheit:"+ "°"+ celsiusToFahrenheit);

        //Kelvin to Fahrenheit	° F = 9/5 (K - 273) + 32
        double kelvinToFahrenheit = (9.0/5)*(kelvin - 273)+32;
        System.out.println("1000° Kelvin converted to Fahrenheit:"+ "°"+ kelvinToFahrenheit);

        //Fahrenheit to Celsius	° C = 5/9 (° F - 32)
        double fahrenheitToCelsius = 5.0/9*(fahrenheit-32);
        System.out.println("65° Fahrenheit converted to Celsius:"+ "°"+ fahrenheitToCelsius);

        //Celsius to Kelvin	K = ° C + 273
        int celsiusToKelvin = celsius + 273;
        System.out.println("20° Celsius converted to Kelvin:"+ "°"+ celsiusToKelvin);

        //Kelvin to Celsius	° C = K - 273
        int kelvinToCelsius = kelvin - 273;
        System.out.println("1000° Kelvin converted to Celsius:"+ "°"+ kelvinToCelsius);

        //Fahrenheit to Kelvin	K = 5/9 (° F - 32) + 273
        double fahrenheitToKelvin = 5.0/9*(fahrenheit-32)+273;
        System.out.println("65° Fahrenheit converted to Kelvin:"+ "°"+ fahrenheitToKelvin);


    }
}
