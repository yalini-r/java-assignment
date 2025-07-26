import java.util.Scanner;

public class MyString {

    char[] ch;

    // Constructor from String
     public MyString(String s) {
		
        ch = new char[s.length()];
        for (int i = 0; i < s.length(); i++) {
            ch[i] = s.charAt(i);
        }
		
     }

    // 1----->Length
   public int length() {
        int count = 0;
        for (int i = 0; i < ch.length; i++) {
            count++;
        }
        return count;
      }

    // 2------>charAt (renamed from findCharacter)
   public char charAt(int index) {
		
        if (index >= 0 && index < ch.length) {
            return ch[index];
        } else {
            System.out.println("Invalid index");
            
        }
         return '\0';
        }

       // 3---->equals (renamed from isEqualOrNot)
     public boolean equals(String s2) {
        if (ch.length != s2.length()) {
            return false;
        }
		
        for (int i = 0; i < ch.length; i++) {
            if (ch[i] != s2.charAt(i)) {
                return false;
				
            }
			
        }
        return true;
		
      }

       // 4----->toUpperCase
         public String toUpperCase() {
        String result = "";
		
        for (int i = 0; i < ch.length; i++) {
			
            if (ch[i] >= 'a' && ch[i] <= 'z') {
                result += (char)(ch[i] - 32);
            } else {
                result += ch[i];
            }
			
        }
        return result;
      }

       // 5------>toLowerCase
        public String toLowerCase() {
		
        String result = "";
        for (int i = 0; i < ch.length; i++) {
			
            if (ch[i] >= 'A' && ch[i] <= 'Z') {
                result += (char)(ch[i] + 32);
            } else {
                result += ch[i];
            }
			  
        }
        return result;
       }

    //6--------->substring
    public String substring(int start, int end) {
		
        String sub = "";
        for (int i = start; i < end && i < ch.length; i++) {
            sub += ch[i];
        }
        return sub;
		
    }

    // 7----->concat
    public String concat(String s1, String s2) {
        return s1 + s2;
    }

    // 8---->contains
    public boolean contains(String sub) {
        if (sub.length() > ch.length) {
			return false;
		}

        for (int i = 0; i <= ch.length - sub.length(); i++) {
			
            boolean match = true;
            for (int j = 0; j < sub.length(); j++) {
                if (ch[i + j] != sub.charAt(j)) {
                    match = false;
                    break;
                }
            }
            if (match) 
			   return true;
				
        }
        return false;
    }

    // 9------>indexOf
     public int indexOf(char c) {
		 
        for (int i = 0; i < ch.length; i++) {
            if (ch[i] == c) return i;
        }
        return -1;
       }

    // 10-------->replace
      public String replace(char oldChar, char newChar) {
		  
        char[] res = new char[ch.length];
        for (int i = 0; i < ch.length; i++) {
            if (ch[i] == oldChar) {
                res[i] = newChar;
            } else {
                res[i] = ch[i];
            }
        }
        return new String(res);
        }

 
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a word or sentence : ");
        String s = sc.nextLine();
		
        MyString ms = new MyString(s);

        // Length method
        System.out.println("Length of a string: " + ms.length());

      // charAt method
        System.out.print("Enter an index: ");
         int index = sc.nextInt();
          System.out.println("Character at given index - " + index + " : " + ms.charAt(index));
		  
		     sc.nextLine(); 

        // equals  method
       
        System.out.print("Enter another string to comparison: ");
           String s2 = sc.nextLine();
        System.out.println("given string is equal or not : " + ms.equals(s2));

      // toUpperCase
        System.out.println("convert to uppercase: " + ms.toUpperCase());

       // toLowerCase
        System.out.println("convert to lowercase: " + ms.toLowerCase());

      // substring
        System.out.print("Enter start index : ");
          int start = sc.nextInt();
         System.out.print("Enter end index: ");
         int end = sc.nextInt();
        System.out.println("Substring of a given string: " + ms.substring(start, end));

       // concat method
        System.out.println("Concatenated string  is : " + ms.concat(s, s2));
		
		sc.nextLine();

      // contains method
        System.out.print("Enter substring to check : "); 
         String sub = sc.nextLine();
         System.out.println("Contains '" + sub + "' : " + ms.contains(sub));

        // indexOf
        System.out.print("Enter a character to find index: ");
         char c = sc.next().charAt(0);
          System.out.println("Index of '" + c + "': " + ms.indexOf(c));

      // replace
        System.out.print("Enter character to replace: ");
         char c1 = sc.next().charAt(0);
         System.out.print("Enter new character: ");
          char c2 = sc.next().charAt(0);
        System.out.println("After replacement: " + ms.replace(c1, c2));

        sc.close();
    }
}
