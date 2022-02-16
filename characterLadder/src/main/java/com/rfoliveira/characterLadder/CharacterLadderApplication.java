package com.rfoliveira.characterLadder;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.Scanner;

@SpringBootApplication
public class CharacterLadderApplication {

	public static void main(String[] args) {
		SpringApplication.run(CharacterLadderApplication.class, args);
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter N: ");
		int n = sc.nextInt();

		System.out.print(Ladder.buildLadder(n));
	}

}
