/* Practice Task 5: Real Scenario — Modular Project
Objective: Build a mini project with reusable packages.
Create package utils → Class DateUtil to format and display date.
Create package models → Class User with user info.
Create package services → Class UserService to register and show users.
Create a main class App in package main that imports and uses all the above.*/

package utils;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
public class DateUtil
{
 public static String getCurrentDateTime()
 {
  LocalDateTime now=LocalDateTime.now();
  DateTimeFormatter formatter=DateTimeFormatter.ofPattern("dd-MM-yyyy HH:mm");
  return now.format(formatter);
 }
}