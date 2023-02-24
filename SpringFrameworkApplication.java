package com.sbmaster.spring.couples;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

import com.sbmaster.spring.couples.game.AbstractGameRunner;
import com.sbmaster.spring.couples.game.GameRunner;
import com.sbmaster.spring.couples.game.GamingConsole;
import com.sbmaster.spring.couples.game.MarioGame;
import com.sbmaster.spring.couples.game.MarioTight;
import com.sbmaster.spring.couples.game.MrsPacmanGame;
import com.sbmaster.spring.couples.game.PacmanGame;
import com.sbmaster.spring.couples.game.RunnerTight;
import com.sbmaster.spring.couples.game.SuperContraGame;
import com.sbmaster.spring.couples.game.TetrisTight;
import com.sbmaster.spring.couples.springgame.Runner;

@SpringBootApplication
public class SpringFrameworkApplication {

	public static void main(String[] args) {
		
		// Tight coupling
		
		System.out.println("\nTightly Coupled Classes");
		System.out.println("\nThe dependent 'runner' class must have new variables and methods,\nor there may be a new 'runner' class created for each game type.");
		MarioTight marioTight = new MarioTight();
		RunnerTight marioTightRunner = new RunnerTight(marioTight);
		TetrisTight tetrisTight = new TetrisTight();
		RunnerTight tetrisTightRunner = new RunnerTight(tetrisTight);
		marioTightRunner.marioRun();
		tetrisTightRunner.tetrisRun();
		
		// Loose coupling with interface and abstract class.
				
		System.out.println("\nLoosely Coupled using interface or abstract class.");
		GamingConsole mario = new MarioGame();
		GameRunner runner = new GameRunner(mario);
		runner.run();
		GamingConsole superContra = new SuperContraGame();
		GameRunner scRunner = new GameRunner(superContra);
		scRunner.run();
		GamingConsole pacman = new PacmanGame();
		GameRunner pacmanRunner = new GameRunner(pacman);
		pacmanRunner.run();
		// For MrsPacmanGame we use an abstract class instead of an interface.
		AbstractGameRunner mrsPacmanRunner = new AbstractGameRunner(new MrsPacmanGame());
		mrsPacmanRunner.run();
		
		// Loose coupling with Spring Framework
		
		System.out.println("\n\nSpring Framework loosely coupled");
		System.out.println("\t@Component annotation added to classes");
		System.out.println("\t@Autowired annotation added to interface variable in classes where used.");
		System.out.println("\t\tpublic class Runner {"
				+ "\n\t\t\t"
				+ "@Autowired\n\t\t\t"
				+ "private GamingConsole game;"
				+ "\n\t\t ... }");
		// Create the application context and assign it to a variable.
		ConfigurableApplicationContext context = SpringApplication.run(SpringFrameworkApplication.class, args);
		// Get the Bean for the runner class from the context assign to variable. 
		Runner gameRunner = context.getBean(Runner.class);
		gameRunner.run();
		
	}

}
