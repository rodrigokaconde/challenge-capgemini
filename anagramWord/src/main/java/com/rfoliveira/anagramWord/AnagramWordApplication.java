package com.rfoliveira.anagramWord;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.Scanner;

@SpringBootApplication
public class AnagramWordApplication {

	public static void main(String[] args) {

		SpringApplication.run(AnagramWordApplication.class, args);
		System.out.print("Enter word: ");
		Scanner sc = new Scanner(System.in);
		String word = sc.next();
		int anagramNumbers;

		anagramNumbers = CheckQuantityAnagrams.checkAnagrams(word);
		System.out.println(anagramNumbers);
	}

}
