package Javaprograms;

public class Stringbuffer {
	 static void togglechar(char str[]) {
		 for(int i=0; i<str.length; i++) {
			 if (str[i]>='A' && str[i]<='Z')
		            str[i] = (char) (str[i] + 'a' - 'A');
		        else if (str[i]>='a' && str[i]<='z')
		            str[i] = (char) (str[i] + 'A' - 'a');
		    }
		}


	 public static void main(String[] args)
	 {
	     char str[] = "I am Sample".toCharArray();
	     togglechar(str);
	     System.out.println("String after toggle ");
	     System.out.println(String.valueOf(str));
	 }
	 }