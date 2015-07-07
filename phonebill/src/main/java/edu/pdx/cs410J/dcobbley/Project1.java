/** Description of Project1
        *
        * @author David Cobbley
        * @version 1.0 July 7, 2015.
        *  
        */
package edu.pdx.cs410J.dcobbley;

import edu.pdx.cs410J.AbstractPhoneBill;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

/**
 * The main class for the CS410J Phone Bill Project
 */
public class Project1 {

  static phonebill myPhoneBill;
  static String customer;
  static String callerNumber;
  static String calleeNumber;
  static String startTime;
  static String endTime;

  public static void main(String[] args) {
    Class c = AbstractPhoneBill.class;  // Refer to one of Dave's classes so that we can be sure it is on the classpath
    if(args.length ==0)
      System.err.println("Missing command line arguments");
    if(args.length <6)
      System.err.println("Not enough arguments");

    customer = args[0];
    callerNumber = args[1];
    calleeNumber = args[2];
    startTime = args[3] + " ";
    startTime += args[4];
    endTime = args[5] + " ";
    endTime += args[6];

    myPhoneBill = new phonebill(customer, new phonecall(callerNumber, calleeNumber, startTime, endTime));


    for(int x = 7; x < args.length; x++)
    {
      if(x > 8)
        break;
      switch (args[x])
      {
        case "-README":
          System.out.println("Readme called");
          break;
        case "-print":
          System.out.println( myPhoneBill.getPhoneCalls());
          break;
        default:
          System.err.println("Command Line Argument not found");
          break;
      }
    }

    System.exit(1);
  }

}