/**
 * Purpose : User Registration
 *           User will input passwordValidate
 *           Validate the user inputs using regex.
 *           If matches, return valid else not valid
 *
 * @author : Girish Kirodiwal
 * @since : 09.07.2021
 */


package com.regex;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

     class UserRegistration {

        public static void main(String[] args ){

            // Declare the object and initialize with
            // predefined standard input object

            Scanner sc = new Scanner(System.in);

            //Regex Pattern

            String regex = "^(?=.{8,20})(?=.*[0-9])(?=.*[a-z])(?=.*[A-Z])(?=.*[@#$%^&+=]).*$";

            System.out.println("Enter your Password");

            // String input

            String password = sc.next();

            // compile the regex to create pattern
            // using compile() method

            Pattern pattern = Pattern.compile(regex);

            // get a matcher object from pattern

            Matcher matcher = pattern.matcher(password);

            if(matcher.matches()){

                System.out.println("Given password is valid");
            }else
            {
                System.out.println("Given password is not valid");
            }
        }

    }


