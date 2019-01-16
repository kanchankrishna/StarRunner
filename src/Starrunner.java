import java.util.Scanner;
import java.lang.Math;

public class Starrunner {
static Scanner questionScanner = new Scanner (System.in);
static int numberright = 0;
	public static void main(String[] args) throws InterruptedException {
		
		//welcomes the user and gives background information on the game
		System.out.println("Welcome to the Starrunner game!");
		System.out.println("You are currently trapped in this apocalypse, and you must answer a series of questions to escape certain death!");
		System.out.println("Before we run out of time, let's chooose a character.");
		System.out.println();
		System.out.println("You have three options; press Enter to continue.");
		System.out.println();
		//choosing a character
		    System.out.println("First, we have the Dave the Deathkiller! He is completely ruthless with his victims, and he has the strength of the Hulk. Do not underestimate his toughness.");
		    Thread.sleep(3000);
		    System.out.println("Second, we have Iris the Indomitable! This powerful woman has the wits of a fox and is guranteed to escape major danger. Do not underestimate her cognitive thinking.");
		    Thread.sleep(3000);
		    System.out.println("Lastly, we have Lash the Inhuman! This creature is more mysterious than ever. It will protect, but can be very dangerous at times. Do not underestimate his powers.");
		    System.out.println("Now, which character do you want? ");
		    String characterName = questionScanner.nextLine();
		    System.out.println("Your character is " +characterName+ "!");
		    //2 game rules that the user must follow
		    System.out.println("Two simple rules:");
		    System.out.println(); 
		    System.out.println("1) You must answer 7 out of 10 questions right.");
		    System.out.println("2) You only get 2 chances per question, or else you get killed.");
		    System.out.println();
		    //build staircase so that I can show the user that the questions get harder as the number of asterisks increase
		    //IMPORTANT! The purpose of the staircase is to show how many questions the user has answered in the game. The purpose again is to show
		    //the user's progress in terms of how many questions were answered, regardless of whether or not the answer was right. 
		    System.out.println("Here's what the game will start out to look like: ");
		    drawStaircase(0);
		    //explains more rules
		    System.out.println("As you can see, there are ten rows of stars. Each row represents a question.");
		    System.out.println("If you answer the first question right, the first row gets taken away. Your goal is to get rid of the stars in at least the first 7 rows.");
		    System.out.println("If you get a question wrong, you remain at the same row, but you only have 2 chances or you die. Have fun!");
		    
		    //I decided to place my code for each individual question in to a method for two reasons.
		    //1) It was a more organized and efficient way of writing my code because I would be able to easily refer to it in times of conflict.
		    //2) It makes the code easily readable for the reader.
		    //calling methods
		    //first question
		    handleQ1();
		    //second question
		    handleQ2();
		    //third question
		    handleQ3();
		    //fourth question
		    handleQ4();
		    //fifth question
		    handleQ5();
		    //sixth question
		    handleQ6();
		    //seventh question
		    handleQ7();
		    //eighth question
		    handleQ8();
		    //ninth question
		    handleQ9();
		    //tenth question
		    handleQ10();
		    //This specific piece of code will determine how many questions the user has gotten right throughout the game, as I track that 
		    //measurement through the variable numberright.
		    if (numberright >= 7) {
		    	System.out.println("Great job! You got at least 7 out of 10 questions right and are no longer trapped! Bye!");
		    	System.exit(0);
		    	}
		    }
		    
	    //declaring another method instead of repeating the same code over and over again. this is way more efficient
			public static void drawStaircase(int start) { //start is from which row will it start until max (the number of rows it will print)
			  for (int i=start; i<10; i++){
			      for (int j=0; j<i; j++) {
			        System.out.print("*"); //should be on the same line
			      }
			      System.out.println("*"); //but on the next line for this
			    }
			  }

		//Method for the first question
		public static void handleQ1() {
			    System.out.println();
			    System.out.println("First question: What is 6/2(1+2)");
			    int answer1 = questionScanner.nextInt();
			    if (answer1 == 9) {
			      System.out.println ("Good job!");
			      numberright++;
			      System.out.println("The number of questions you have right is " +numberright+ ". You have 9 more questions remaining.");
			      System.out.println("Here is your progress so far:");
			      System.out.println("Great job removing the first row!");
			      drawStaircase(1);
			      //The user will move on since he/she got the first question right.
			    }
			    else {
			    //Second chance for the user to get the question right
			      System.out.println("Oh no! Try again! What is your second best guess?");
			      answer1 = questionScanner.nextInt();
			      if (answer1 ==9) {
			        numberright++;
			        System.out.println("Phew! You got it! The number of questions you have right is " +numberright+ ".");
			        System.out.println("You have 9 more questions left.");
			        System.out.println("Here is your progress so far: ");
			        drawStaircase(1);
			      }
			      else {
			    	  //The user could not answer the question right in two tries, so the user gets this question wrong.
			        System.out.println("Better luck next time! The correct answer was 9.");
			      }
			   
			    }
			  	
		}
		
		//Method for the second question
		 public static void handleQ2() {
			 System.out.println("Second question: Who was the third president of the US? Answer without a space.");
			    String answer2 = questionScanner.next();
			    if (answer2.equalsIgnoreCase("ThomasJefferson")) {
			      System.out.println("Great job!");
			      numberright++;
			      System.out.println("The number of questions you have right so far is " +numberright+ ". You have 8 more questions left!");
			      System.out.println("Here is your progress: ");
			      drawStaircase(2);
			      //The user will move on since he/she got the second question right.
			    }
			    //Second question second chance
			    else {
			    	System.out.println("Oh no! Try again! What is your second best guess? Remember to answer without a space!");
				      answer2 = questionScanner.next();
				      if (answer2.equalsIgnoreCase("ThomasJefferson")) {
				        numberright++;
				        System.out.println("Phew! You got it! The number of questions you have right is " +numberright+ ".");
				        System.out.println("You have 8 more questions left.");
				        System.out.println("Here is your progress so far: ");
				        drawStaircase(2);
				      }
				      else {
				        System.out.println("Better luck next time! The correct answer was ThomasJefferson.");
				    	//The user could not answer the question right in two tries, so the user gets this question wrong.

				      }
				   
				    }
		 }
		 
		 //Method for the third question
		 public static void handleQ3() {
			 System.out.println ("Third question: Who has won the most Grammy's? Kendrick Lamar, Drake, or Will Smith? Answer without a space.");
				String answer3 = questionScanner.next();
				if (answer3.equalsIgnoreCase("KendrickLamar")) {
					numberright++;
					System.out.println("Great job! Your answer is correct! The number of questions you have right are " +numberright+ ". You have 7 more questions left.");
					System.out.println("Here is your progress: ");
					drawStaircase(3);
				    //The user will move on since he/she got the third question right.
				}
				//Third question second chance
				else {
					System.out.println("Oh no! Try again! What is your second best guess? Remember to answer without a space!");
					answer3 = questionScanner.next();
					if (answer3.equalsIgnoreCase("KendrickLamar")) {
						numberright++;
						System.out.println("Phew! You got it! The number of questions you have right is " +numberright+ ".");
						System.out.println("You have 7 more questions left.");
						System.out.println("Here is your progress so far: ");
						drawStaircase(3);
			      }
			      else {
			        System.out.println("Better luck next time! The correct answer was KendrickLamar.");
			    	 //The user could not answer the question right in two tries, so the user gets this question wrong.

			      }
			   
			    }
			    } 
		
	    //Method for the fourth question
		public static void handleQ4() {
			System.out.println("Fourth question: In what year was the Declaration of Independence signed?");
			int answer4 = questionScanner.nextInt();
			if (answer4 == 1776) {
			      System.out.println ("Good job!");
			      numberright++;
			      System.out.println("The number of questions you have right is " +numberright+ ". You have 6 more questions remaining.");
			      System.out.println("Here is your progress so far:");
			      drawStaircase(4); 
			      //The user will move on since he/she answered this question correctly.
			}
			//Fourth question second chance
			else {
			      System.out.println("Oh no! Try again! What is your second best guess?");
			      answer4 = questionScanner.nextInt();
			      if (answer4 == 1776) {
			        numberright++;
			        System.out.println("Phew! You got it! The number of questions you have right is " +numberright+ ".");
			        System.out.println("You have 6 more questions left.");
			        System.out.println("Here is your progress so far: ");
			        drawStaircase(4);
			      }
			      else {
			        System.out.println("Better luck next time! The correct answer was 1776.");
			    	  //The user could not answer the question right in two tries, so the user gets this question wrong.

			      }
			   
			    }
			  	
		}
		
		//Method for the fifth question
		public static void handleQ5() {
			System.out.println("Question 5: How many chromosomes does a human have in total?");
			int answer5 = questionScanner.nextInt();
			if (answer5 == 46) {
				System.out.println("Good job!");
				numberright++;
				System.out.println("The number of questions you have right is " +numberright+ ". You have 5 more questions remaining.");
			    System.out.println("Here is your progress so far:");
			    drawStaircase(5); 
			     //The user will be able to move on since he/she answered this question correctly
			}
			//Fifth question second chance
			else {
				System.out.println("Oh no! Try again! What is your second best guess?");
				answer5 = questionScanner.nextInt();
				if (answer5 == 46) {
					numberright++;
					System.out.println("Phew! You got it! The number of questions you have right is " +numberright+ ".");
					System.out.println("You have 5 more questions left");
					System.out.println("Here is your progress so far: ");
					drawStaircase(5);
				}
				else {
					System.out.println("Better luck next time! The correct answer was 46.");
			    	//The user could not answer the question right in two tries, so the user gets this question wrong.

				}
			}
		}
		
		//Method for sixth question
		public static void handleQ6() {
			System.out.println("Question 6: What is the capital of Florida?");
			String answer6 = questionScanner.next();
			if (answer6.equalsIgnoreCase("Tallahassee")) {
				numberright++;
				System.out.println("Great job! Your answer is correct! The number of questions you have right are " +numberright+ ". You have 4 more questions left.");
				System.out.println("Here is your progress: ");
				drawStaircase(6);
				//The user will be able to move on because he/she answered this question easily
			}
			//Sixth question second chance
			else {
				System.out.println("Oh no! Try again! What is your second best guess? Remember to answer without a space!");
				answer6 = questionScanner.next();
				if (answer6.equalsIgnoreCase("Tallahassee")) {
					numberright++;
					System.out.println("Phew! You got it! The number of questions you have right is " +numberright+ ".");
					System.out.println("You have 4 more questions left.");
					System.out.println("Here is your progress so far: ");
					drawStaircase(6);
		      }
		      else {
		        System.out.println("Better luck next time!  The correct answer was Tallahassee.");
		    	//The user could not answer the question right in two tries, so the user gets this question wrong.
		      }
		   
		    }

		}
			
		
		//Method for the seventh question	
		public static void handleQ7() {
			System.out.println("Question 7: What does the acronym CPU in computer science stand for? Answer without a space!");
			String answer7 = questionScanner.next();
			if (answer7.equalsIgnoreCase("CentralProcessingUnit")) {
				numberright++;
				System.out.println("Great job! Your answer is correct! The number of questions you have right are " +numberright+ ". You have 3 more questions left.");
				System.out.println("Here is your progress: ");
				drawStaircase(7);
				//The user will be able to move on since he/she answered this question without any trouble
			}
			//Seventh question second chance
			else {
				System.out.println("Oh no! Try again! What is your second best guess? Remember to answer without a space!");
				answer7 = questionScanner.next();
				if (answer7.equalsIgnoreCase("CentralProcessingUnit")) {
					numberright++;
					System.out.println("Phew! You got it! The number of questions you have right is " +numberright+ ".");
					System.out.println("You have 3 more questions left.");
					System.out.println("Here is your progress so far: ");
					drawStaircase(7);
		      }
		      else {
		        System.out.println("Better luck next time! The correct answer was CentralProcessingUnit.");
		    	  //The user could not answer the question right in two tries, so the user gets this question wrong.

		      }
		   
		    }
		   
		}
		
		//Method for the eighth question
		public static void handleQ8() {
			System.out.println("What is the largest continent on the Earth?");
			String answer8 = questionScanner.next();
			if (answer8.equalsIgnoreCase("Asia")) {
				numberright++;
				System.out.println("Great job! Your answer is correct! The number of questions you have right are " +numberright+ ". You have 2 more questions left.");
				System.out.println("Here is your progress: ");
				drawStaircase(8);	
				//The user will be able to move on because he/she answered this question without any difficulty
			}
			//Eighth question second chance
			else {
				System.out.println("Oh no! Try again! What is your second best guess? Remember to answer without a space!");
				answer8 = questionScanner.next();
				if (answer8.equalsIgnoreCase("Asia")) {
					numberright++;
					System.out.println("Phew! You got it! The number of questions you have right is " +numberright+ ".");
					System.out.println("You have 2 more questions left.");
					System.out.println("Here is your progress so far: ");
					drawStaircase(8);
			}
				else {
					System.out.println("Better luck next time! The correct answer was Asia.");
			    	//The user could not answer the question right in two tries, so the user gets this question wrong.

				}
			}
				
		}
		
		//Method for the ninth question
		public static void handleQ9() {
			System.out.println("Ninth question: What is the largest ocean in the world?");
			String answer9 = questionScanner.next();
			if (answer9.equalsIgnoreCase("PacificOcean") || (answer9.equalsIgnoreCase("Pacific")) || (answer9.equalsIgnoreCase("ThePacific"))) {
				numberright++;
				System.out.println("Great job! Your answer is correct! The number of questions you have right are " +numberright+ ". You have 1 more question left.");
				System.out.println("Here is your progress: ");
				drawStaircase(9);
				//The user can move on because he/she answered the question without any trouble
			}
			//Ninth question second chance
			else {
				System.out.println("Oh no! Try again! What is your second best guess? Remember to answer without a space!");
				answer9 = questionScanner.next();
				if (answer9.equalsIgnoreCase("PacificOcean")) {
					numberright++;
					System.out.println("Phew! You got it! The number of questions you have right is " +numberright+ ".");
					System.out.println("You have 1 more question left.");
					System.out.println("Here is your progress so far: ");
					drawStaircase(9);
		      }
		      else {
		        System.out.println("Better luck next time! The correct answer was the PacificOcean.");
		    	//The user could not answer the question right in two tries, so the user gets this question wrong.

		      }
		   
		    }
		   
			}	
		
		//Method for the tenth question
		public static void handleQ10() {
			System.out.println("Final question! What word in the English language is spelled incorrectly?");
			String answer10 = questionScanner.next();
			if (answer10.equalsIgnoreCase("Incorrectly")) {
				numberright++;
				System.out.println("Great job! Your answer is correct! The number of questions you have right are " +numberright+ ". You are done answering the questions.");
			}
			//Tenth question second chance
			else {
				System.out.println("Oh no! Try again! What is your second best guess? Remember to answer without a space!");
				answer10 = questionScanner.next();
				if (answer10.equalsIgnoreCase("Incorrectly")) {
					numberright++;
					System.out.println("Phew! You got it! The number of questions you have right is " +numberright+ ". Congratulations! You made it, and you are done.");
		      }
		      else {
		        System.out.println("You got the last question wrong. The correct answer was Incorrectly.");
		    	//The user could not answer the question right in two tries, so the user gets this question wrong.

		      }
		    }
			}	
		}

