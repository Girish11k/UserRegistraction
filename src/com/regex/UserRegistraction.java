/**
 * Purpose : User Registration
 *           User will input mobileValidate
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

            String regex = "^(91){1}[0-9]{9}$";

            System.out.println("Enter your Mobile number");

            // String input

            String mobile = sc.next();

            // compile the regex to create pattern
            // using compile() method

            Pattern pattern = Pattern.compile(regex);

            // get a matcher object from pattern

            Matcher matcher = pattern.matcher(mobile);

            if(matcher.matches()){
                System.out.println("Given mobile id is valid");
            }else
            {
                System.out.println("Given mobile id is not valid");
            }
        }

    }


