package lab4;
import java.util.Scanner;
public class QueneTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		QueueArrayBased queue1 = new QueueArrayBased();
		//System.out.println("Type anything to start");
		Scanner scanner = new Scanner(System.in);
		//Scanner scanner2 = new Scanner(System.in);
		int number = 0;
		//scanner.nextLine();
		//int loopCount = 0;
		
		//sample data
		queue1.enqueue("milk");
		queue1.enqueue("egg");
		queue1.enqueue("fish");
		
		//System.out.print(queue1.peek());
		
		/*
		while(number != 6) {
			
				System.out.println("Welcome to PrintServer! Please select a number from the list: "
						+ "\n1. Enqueue a job (User enters job details)"
						+ "\n2. Dequeue a job"
						+ "\n3. Peek at the job at front of the queue"
						+ "\n4. Empty the queue"
						+ "\n5. Display all jobs"
						+ "\n6. Quit the program");
				
				System.out.print("\nEnter your choice: ");
				number = scanner.nextInt();
				scanner.nextLine();
				
				if(number == 1) {
					System.out.println("Job details");
					System.out.print("\nEnter your members: ");
					String members = scanner.nextLine();
					//System.out.print("");
					
					System.out.print("\nEnter your ID: ");
					int id = scanner.nextInt();
					scanner.nextLine();
					
					System.out.print("\nEnter your Document Name: ");
					String doc_name = scanner.nextLine();
					
					System.out.print("\nEnter your pages: ");
					int pages = scanner.nextInt();
					scanner.nextLine();
					
					PrintJob myJob = new PrintJob(members, id, doc_name, pages);
					
					queue1.enqueue(myJob);
				}
				
				else if(number == 2) {
					queue1.dequeue();
				}
				
				else if(number == 3) {
					System.out.println(queue1.peek());
				}
				
				else if(number == 4) {
					queue1.dequeueAll();
				}
				else if(number == 5) {
					queue1.displayQueue(); 
				}

			}//End of while loop
			*/
			System.out.println("End");

	}

}
