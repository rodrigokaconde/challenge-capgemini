package com.rfoliveira.secureString2;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.Scanner;

@SpringBootApplication
public class SecureString2Application {

	public static void main(String[] args) {
		SpringApplication.run(SecureString2Application.class, args);
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter Password: ");
		String password = sc.next();
		System.out.println(ValidPassword.validPassword(password));
	}

}
