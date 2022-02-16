package com.rfoliveira.secureString;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.Scanner;

@SpringBootApplication
public class SecureStringApplication {

	public static void main(String[] args) {
		SpringApplication.run(SecureStringApplication.class, args);
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter password: ");
		String password = sc.next();
		int passworSizeAdd = CheckPasswordLength.checkPassword(password);
		System.out.println(passworSizeAdd);

	}

}
