package radio;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Radio r=new Radio();
			while(true)
			{
				System.out.println("1.P\n2.CU\n3.CD\n4.VU\n5.VD\n6.Q");
				Scanner s1=new Scanner(System.in);
				System.out.println("Enter choice");
				int choice2 = s1.nextInt(); 

				if(choice2>=1 && choice2<=5)
				{
					switch(choice2)
					{
					case 1:r.power="ON";
					System.out.println("Current_state: channel: "+r.channel+" volume: "+r.vol+" power: "+r.power);
					break;
					case 2:
						if(r.power=="ON")
							r.chup();
						else
							System.out.println("Turn power on!");
					break;
					case 3:
						if(r.power=="ON")
							r.chdn();
						else
							System.out.println("Turn power on!");
					break;
					case 4:
						if(r.power=="ON")
							r.volup();
						else
							System.out.println("Turn power on!");
					break;
					case 5:
						if(r.power=="ON")
							r.voldown();
						else
							System.out.println("Turn power on!");
					break;
					}
				}
				else if(choice2==6)
				{
					break;
				}
				else
				{
					System.out.println("Invalid choice");
				}
			}
	}

}


