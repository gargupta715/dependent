package com.example.dependent;

import com.example.dependency.DependencyApplication;
import com.example.dependency.DependencyUtil;

public class DependentApplication {

	public static void main(String[] args) {
//		SpringApplication.run(DependentApplication.class, args);
		System.out.println("Hiiiii");
		DependencyApplication.main(args);
		System.out.println(DependencyUtil.hello());
	}

}
