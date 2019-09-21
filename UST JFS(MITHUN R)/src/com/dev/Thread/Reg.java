package com.dev.Thread;

import java.util.regex.Matcher;
import java.util.regex.Pattern;


	public class Reg {

//		https://github.com/rohitjaishwal/JAVA-RegEx/blob/master/JavaRegEx/src/com/dev/regex/PatternConcept.java

		public static void main(String[] args) {
			Pattern pat = Pattern.compile("\\d");// represents any number bet (0-9)
			Matcher mat = pat.matcher("1");
			System.out.println("For \\d:"+mat.matches());
			
			pat = Pattern.compile("\\d+");// represents any number
			mat = pat.matcher("100000");
			System.out.println("For \\d+:"+mat.matches());
			
			pat = Pattern.compile("\\D"); // represents anything but numbers (single char)
			mat = pat.matcher("@");
			System.out.println("For \\D:"+mat.matches());
			
			pat = Pattern.compile("\\D+"); // represents anything but numbers
			mat = pat.matcher("@qwertybh$");
			System.out.println("For \\D+:"+mat.matches());
			
			pat = Pattern.compile("\\s"); // represents single space
			mat = pat.matcher(" ");
			System.out.println("For \\s:"+mat.matches());
			
			pat = Pattern.compile("\\s+"); // represents multiple spaces
			mat = pat.matcher("     ");
			System.out.println("For \\s+:"+mat.matches());
			
			pat = Pattern.compile("\\S"); // represents anything but space(single char) 
			mat = pat.matcher("$");
			System.out.println("For \\S:"+mat.matches());
			
			pat = Pattern.compile("\\S+"); // represents anything but spaces 
			mat = pat.matcher("v4545v$%");
			System.out.println("For \\S+:"+mat.matches());
			
			pat = Pattern.compile("\\w"); // represents single char 
			mat = pat.matcher("9");
			System.out.println("For \\w:"+mat.matches());
			
			pat = Pattern.compile("\\w+"); // represents multiple char 
			mat = pat.matcher("qwe45@78rty");
			System.out.println("For \\w+:"+mat.matches());
			
			pat = Pattern.compile("\\W"); // represents anything but char (special char)
			mat = pat.matcher("!");
			System.out.println("For \\W:"+mat.matches());
			
			pat = Pattern.compile("\\W+"); // represents anything but chars (special chars)
			mat = pat.matcher("!!$^#(");
			System.out.println("For \\W+:"+mat.matches());
			
			
			
			
			
			
			
		}

	}

	


