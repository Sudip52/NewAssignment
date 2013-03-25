package com.lftechnology.assignment;

import java.io.BufferedInputStream;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class WordsManipulation {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		ArrayList<String> wordsArray = new ArrayList<String>();
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the words?");
		System.out.println("Press 'end' to exit");
		do{
				
			wordsArray.add(sc.next());
		}while(!sc.hasNext("end"));
	
		System.out.println("Words in WordsArray Are:" + wordsArray);
		Set<String> duplicateWords = new HashSet<String>();
		Set<String> uniqueWords = new HashSet<String>();
		Set<String> uniqueNRepeatedWords = new HashSet<String>();
		for (String word : wordsArray)
		{
			if(!uniqueWords.add(word))
				duplicateWords.add(word);
		}
	uniqueWords.removeAll(duplicateWords);
	uniqueNRepeatedWords.addAll(wordsArray);
	uniqueNRepeatedWords.remove(duplicateWords);
	System.out.println("Duplicate Words Are: " + duplicateWords);
	System.out.println("Uniques Words Are: " + uniqueWords);
	System.out.println("Uniques Word Count is " + uniqueWords.size());
	System.out.println("Uniques word and repeaded words are: " + uniqueNRepeatedWords);
	}
	
	}
 



