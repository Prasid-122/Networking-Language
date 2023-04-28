/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package httpexample;

/**
 *
 * @author Prasid
 */
public class URLSplitter {
   public static void main(String[] args) {
      // Original URL
      String url = "https://www.example.com/index.html?name=networking&technology=java";
      
      // Splitting the URL
      String[] parts = url.split("\\?");
      String part1 = parts[0]; // Part1 = https://www.example.com/index.html
      String part2 = parts[1]; // Part2 = name=networking&technology=java
      
      // Splitting the Part2
      String[] part2Parts = part2.split("&");
      String part2Part1 = part2Parts[0]; // Part2Part1 = name=networking 
      String part2Part2 = part2Parts[1]; // Part2Part2 = technology=java 
      
      // Printing the Parts
      System.out.println("Part1 = " + part1);
      System.out.println("Part2Part1 = " + part2Part1);
      System.out.println("Part2Part2 = " + part2Part2);
   }
}