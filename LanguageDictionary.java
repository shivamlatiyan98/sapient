package assignment.level1;

import java.util.*;


public class LanguageDictionary {
	
	public Map<String, TreeSet<String>>dictionaryMap;

	
	public LanguageDictionary() {
		super();
		dictionaryMap=new HashMap<String, TreeSet<String>>();	
	    	
	}
	
	
	
	
	
	public void generateWord(String word,String [] synonyms) {
		dictionaryMap.put(word,new TreeSet<String>());
		
		for(String synString: synonyms) {
			dictionaryMap.get(word).add(synString);
			
		}
		
		

		
	}
	
	
	public void addSynonym(String word,String syString) {
		
		if(!dictionaryMap.get(word).add(syString));
		
		System.out.println("word not in the dictionary");
	
	}
	
	public boolean getsynonyms(String word) {
		
		if(dictionaryMap.get(word)==null) {
			System.out.println("obj not found");
			return false;
		}
		TreeSet<String>cuTreeSet=dictionaryMap.get(word);
		
		for(String synString: cuTreeSet) {
			System.out.print(synString+",");
		}
		return true;
		
		
	}		
		
	public  void deletWord(String word) {
		
		if(dictionaryMap.get(word)==null) {
		System.out.println("word not in dictionary");	
		}
		
		dictionaryMap.remove(word);
		
		
	}
		
		
		
		
		
		
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

