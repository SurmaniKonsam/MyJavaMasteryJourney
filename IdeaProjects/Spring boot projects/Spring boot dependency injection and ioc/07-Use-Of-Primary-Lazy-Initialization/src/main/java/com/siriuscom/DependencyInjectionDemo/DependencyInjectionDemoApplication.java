package com.siriuscom.DependencyInjectionDemo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class DependencyInjectionDemoApplication {

	public static void main(String[] args) {
		SpringApplication.run(DependencyInjectionDemoApplication.class, args);
	}

	/*
		Class : StaminaCoach
		Class : EssayCoach
		Class : FightCoach
		Class : MindfulnessCoach
		Class : StrengthCoach
		The meaning of these instances is that during time of running our spring application all our classes got
		initialized, which mean that each class are taking their own memory and processor to get instanced. However,
		we can however reduce that by use of lazy initialization.

		Lazy Initialization -> Lazy initialization means the class will remain idle if annotated with @lazy, it won't
		get initialized, until that class is specifically called.

		Hence, let's try to annotate each class with @Lazy.
		Let's try to run again after all the class/components/beans are annotated with @Lazy.
		Only staminaCoach got initialized because, we used @Qualifier on that component, and also having annotated with
		@Lazy made it idle until finally when it was called upon by the spring to get initialized.

		Hence, yeah this is the use of @Lazy.
	 */

}
