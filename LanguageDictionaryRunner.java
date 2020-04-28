package assignment.level1;

import java.util.*;





public class LanguageDictionaryRunner {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner obj = new Scanner(System.in);
		LanguageDictionary newdDictionary = new LanguageDictionary();
		
		String [] syString1={"Namaste", "Namaskaar","Vanakkam", "Aadaab"," Chibai"};
		newdDictionary.generateWord("good morning", syString1);
		
		String [] syString2={"Buena nuei","Dobry viechar","Boas noites","Guten Abend","Kalinishta","Erev tov"};
		newdDictionary.generateWord("good evening", syString2);
		
		String [] syString3={"Gracias","Grazie","Danke sehr","Takk","Mahalo","Merci "};
		newdDictionary.generateWord("thank you", syString3);
		
		
		while(true) {
boolean exit=false;
		System.out.println("\n");	
		System.out.println("enter the option for dictionary acess");
		System.out.println("1:For searching word");
		System.out.println("2 For adding new word in the dictionary");
		System.out.println("3:For adding new Synonym");
		System.out.println("4:For deleting the  word");
		System.out.println("5:For exit");
		System.out.println("\n");
		Scanner obj0 = new Scanner(System.in);
		int ans = obj0.nextInt();
		switch (ans) {
		case 1: {
			System.out.println("enter the word to be search");
			Scanner obj1 = new Scanner(System.in);
			String word1 = obj1.nextLine();
			boolean ans1=newdDictionary.getsynonyms(word1);
			if(ans1==false) {
			   System.out.println("select option2 for addition of new word\n");	
			}
			
			break;
			
		}

		case 2: {
			System.out.println("Enter the word to be generated");
			Scanner obj2 = new Scanner(System.in);
			String word=obj2.nextLine();
			System.out.println("enter the synonyms for the word");
			String[] synoString = obj.nextLine().split(" ");
			newdDictionary.generateWord(word, synoString);
			break;
		}

		case 3: {
           System.out.println("enter the word in which synoynm to be added");
           Scanner obj3 = new Scanner(System.in);
        	String word=obj3.nextLine();
        	System.out.println("enter the synonym for the word");
        	String syString=obj.nextLine();
        	newdDictionary.addSynonym(word, syString);
        	break;
			
		}

		case 4: {
			System.out.println("enter the word to be deleted");
			Scanner obj4 = new Scanner(System.in);
			String word=obj4.nextLine();
			newdDictionary.deletWord(word);
			break;
		}

		case 5: {
			exit=true;
           break;
		}

		default:
			throw new IllegalArgumentException("Unexpected value: " + ans);
		}

	   if(exit==true) {
		   System.out.println("exit successful");
		   break;
	   }
	
		
		
		}
		
		
	}	

	
	
	
	
	
	
	

}
