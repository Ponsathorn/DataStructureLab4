package lab4;
import java.util.Scanner;
public class QueneTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		QueueArrayBased queue1 = new QueueArrayBased();
		//PrintJob myJob = new PrintJob(null, 0, null, 0);
		Scanner scanner = new Scanner(System.in);
		//Scanner scanner2 = new Scanner(System.in);
		int number = 0;
		
		//int loopCount = 0;
		
		while(number != 6) {
			
				System.out.println("Welcome to PrintServer! Please select a number from the list: "
						+ "\n1. Enqueue a job (User enters job details)"
						+ "\n2. Dequeue a job"
						+ "\n3. Peek at the job at front of the queue"
						+ "\n4. Empty the queue"
						+ "\n5. Display all jobs"
						+ "\n6. Quit the program");
				if(number == 1) {
					System.out.println("Job details");
					System.out.println("Enter your members: ");
					String members = scanner.nextLine();
					
					System.out.println("Enter your members: ");
					int id = scanner.nextInt();
					
					System.out.println("Enter your members: ");
					String doc_name = scanner.nextLine();
					
					System.out.println("Enter your members: ");
					int pages = scanner.nextInt();
					
					PrintJob myJob = new PrintJob(members, id, doc_name, pages);
					
					queue1.enqueue(myJob);
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
