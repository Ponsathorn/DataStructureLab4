package lab4;
import java.util.Scanner;
public class QueneTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		QueueArrayBased queue1 = new QueueArrayBased();
		
		Scanner scanner = new Scanner(System.in);
		Scanner scanner2 = new Scanner(System.in);
		int number = 0;
		String jobName;
		
		while(number != 6) {
			
				System.out.println("Welcome to StackTest! Please select a number from the list: "
						+ "\n1. Enqueue a job (User enters job details)"
						+ "\n2. Dequeue a job"
						+ "\n3. Peek at the job at front of the queue"
						+ "\n4. Empty the queue"
						+ "\n5. Display all jobs"
						+ "\n6. Quit the program");
				if(number == 1) {
					System.out.println("Enter your job: ");
					jobName = scanner2.nextLine();
					queue1.enqueue(jobName);
				}
				
				else if(number == 2) {
					queue1.dequeue();
				}
				
				else if(number == 3) {
					queue1.peek();
				}
				
				else if(number == 4) {
					queue1.dequeueAll();
				}
				else if(number == 5) {
					//queue1.displayQueue(); 
				}
				
			number = scanner.nextInt();
			}//End of while loop
		
			System.out.println("End");

	}

}
