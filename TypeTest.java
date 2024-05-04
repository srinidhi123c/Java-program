
import java.util.Scanner;
import java.util.Random;
public class TypeTest {
    public static final String[] sentence= {"Computer programmers use code to communicate with computers and tell them what to do",
    		"Coding involves writing with coding languages, such as JavaScript and C++",
    		"The basic coding concepts include variable declaration, basic control structures, data structures, object-oriented programming, troubleshooting and debugging, and various programming tools."
    		,"It's true that you can learn programming languages on your own, but it won't be easy."};
    
    public static final String[] paragraph = {"To speak with computers, programmers learn different coding languages. Binary code is the primary language of all computers. Binary code consists of only two numbers: one and zero. In the binary coding language, zero represents off while one represents on.",
    		"Low-level languages, like binary, are considered \"machine-oriented.\" Machine-oriented languages write instructions that must be specified in terms of the capabilities of the processor in question. Coders also refer to low-level languages as assembly language or machine code.",
    		"High-level languages are user-oriented. Most of the popular coding languages, such as Python, fall under this category. Programmers designed high-level languages to convert an algorithm into program code more easily. High-level coding languages are closer to human language — they include more nuance and adaptability than low-level coding languages.",
    		"Coding is the practice of building websites and apps by writing out instructions in a programming language. It governs how data is collected, how sites appear to the user, and every aspect of how you engage with the web.",
    		"Professional coders spend most of their time typing out lines of code, checking for  bugs, testing their code on different platforms and devices, and  perfecting it. It requires focus, acute problem-solving skills, and a sharp eye for detail."};
    
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		Random ra=new Random();
		
		System.out.println("Choose any one");
		System.out.println("1.Sentence");
		System.out.println("2.Paragraph");
		System.out.println("Enter your choice:");
		
		int choice=sc.nextInt();
		sc.nextLine();
		System.out.println();
		String text="";
		
		if(choice==1)
		{
			text=sentence[ra.nextInt(sentence.length)];
		}
		else if(choice==2)
		{
			text=paragraph[ra.nextInt(paragraph.length)];
		}
		else
		{
			System.out.println("enter a valid choice.");
			
		}
		System.out.println("Type the following text.");
		System.out.println(text);
		System.out.println();
		
		System.out.println("press enter to start.");
		sc.nextLine();
		System.out.println("type the text:");
		long start=System.currentTimeMillis();//it record the current time in milliseconds
		String userInput=sc.nextLine();
		long end=System.currentTimeMillis();//it record the current time in millisecond just after the user finish inputing
		
		long time=end-start;
		double second=time/1000.0;// to convert millisecond to second
		
		int textLength=text.length();
		int userInputLength=userInput.length();
		int crtchar=0;
		
		for(int i=0;i<Math.min(textLength, userInputLength);i++)//Math.min(a,b) returns the min value to avoid arrayoutofbounced exception
			
		{
			if(text.charAt(i)==userInput.charAt(i))
			{
				crtchar++;
			}
		}
		int accuracy=(int)(((double)crtchar/textLength)*100);
		System.out.println(accuracy);
		System.out.println(second);
		

	}

}