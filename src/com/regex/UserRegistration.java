
/**
 * Valid First Name with first letter starting with capital and has minimum 3 characters in it.
 *
// * @author: GIRISH KIRODIWAL
// * @since: 09.07.2021
 */

package com.regex;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

    public class UserRegistration {

        public static void main(String[] args ){

            // Declare the object and initialize with
            // predefined standard input object

            Scanner sc = new Scanner(System.in);

            //Regex Pattern

            String regex = "^[A-Z]{1}[a-z]{2}$";

            System.out.println("Enter your name");

            // String input

            String name = sc.next();

            // compile the regex to create pattern
            // using compile() method

            Pattern pattern = Pattern.compile(regex);

            // get a matcher object from pattern

            Matcher matcher = pattern.matcher(name);

            if(matcher.matches()){
                System.out.println("Given name id is valid");
            }else
            {
                System.out.println("Given name id is not valid");
            }
        }

    }
