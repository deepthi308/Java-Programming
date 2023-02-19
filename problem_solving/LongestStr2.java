package problem_solving;

import java.util.HashSet;

public class LongestStr2 {



			public static void main(String[] args) {
				
				String str = "abcdaeb";
				String finalans = longest(str);
				System.out.println(finalans);
				
				
			}

			private static String longest(String str) {
				HashSet<Character> set = new HashSet<Character>();
				int maxLength = 0;
				String longestTillnow = "";
				
			
				String longestoverall = "";
					
				//take each character form the given string
				for(int i =0; i<str.length();i++) {
					char c = str.charAt(i);                               
						
					
					if(!set.contains(c)) {									
						
						set.add(c);		
					
						longestTillnow = longestTillnow + c;		
						
					}else {
						longestTillnow="";    
						set.clear();   
					}
					
					if(longestTillnow.length() > longestoverall.length()) {
						longestoverall=longestTillnow;
					}
					
				}
				
				//System.out.println("Max Length of longest Substring is " + set.size());
				
				return longestoverall;
			}

		}

