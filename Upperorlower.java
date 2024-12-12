package javaprograms;
import java.util.*;
public class Upperorlower {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
	System.out.print("Enter ant character:  ");
	char ch = sc.next().charAt(0);
	 if (ch >= 'A' && ch <= 'Z') {
	System.out.println(ch+" "+"is an UpperCase character"); 
	 }
					     
	else if (ch >= 'a' && ch <= 'z') {
	System.out.println(ch+" "+"is an LowerCase character" );
	}
	 
       else{System.out.println(ch+""+"is not an alphabetic character" ); }
	}

}
