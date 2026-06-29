package assignment4;

import java.util.Scanner;

public class IPLMain {
	public static void main(String[] args) {
		Team[] teams = new Team[5];

		teams[0] = new Team("Chennai Super Kings", 7);
		teams[0].addPlayer(new Player("MS Dhoni", 12));
		teams[0].addPlayer(new Player("Ruturaj Gaikwad", 7));
		teams[0].addPlayer(new Player("Deepak Chahar", 4));
		teams[0].addPlayer(new Player("Moeen Ali", 6));
		teams[0].addPlayer(new Player("Shivam Dube", 3.5));
		teams[0].addPlayer(new Player("Tushar Deshpande", 2));
		teams[0].addPlayer(new Player("Devon Conway", 6.5));

		teams[1] = new Team("Mumbai Indians", 7);
		teams[1].addPlayer(new Player("Rohit Sharma", 15));
		teams[1].addPlayer(new Player("Suryakumar Yadav", 10));
		teams[1].addPlayer(new Player("Jasprit Bumrah", 12));
		teams[1].addPlayer(new Player("Ishan Kishan", 8));
		teams[1].addPlayer(new Player("Tim David", 5.5));
		teams[1].addPlayer(new Player("Piyush Chawla", 2));
		teams[1].addPlayer(new Player("Tilak Varma", 3));

		teams[2] = new Team("Royal Challengers Bangalore", 6);
		teams[2].addPlayer(new Player("Virat Kohli", 17));
		teams[2].addPlayer(new Player("Faf du Plessis", 8));
		teams[2].addPlayer(new Player("Glenn Maxwell", 9));
		teams[2].addPlayer(new Player("Mohammed Siraj", 5));
		teams[2].addPlayer(new Player("Dinesh Karthik", 4.5));
		teams[2].addPlayer(new Player("Wanindu Hasaranga", 7));

		teams[3] = new Team("Kolkata Knight Riders", 6);
		teams[3].addPlayer(new Player("Shreyas Iyer", 10));
		teams[3].addPlayer(new Player("Andre Russell", 8));
		teams[3].addPlayer(new Player("Sunil Narine", 6));
		teams[3].addPlayer(new Player("Rinku Singh", 4));
		teams[3].addPlayer(new Player("Varun Chakravarthy", 5));
		teams[3].addPlayer(new Player("Nitish Rana", 3.5));

		teams[4] = new Team("Rajasthan Royals", 6);
		teams[4].addPlayer(new Player("Sanju Samson", 10));
		teams[4].addPlayer(new Player("Jos Buttler", 7));
		teams[4].addPlayer(new Player("Yashasvi Jaiswal", 3));
		teams[4].addPlayer(new Player("Ravichandran Ashwin", 5));
		teams[4].addPlayer(new Player("Shimron Hetmyer", 6.5));
		teams[4].addPlayer(new Player("Trent Boult", 6));

		Scanner sc = new Scanner(System.in);
		System.out.print("Enter team name: ");
		String input = sc.nextLine().trim();
		sc.close();

		boolean found = false;
		for (Team t : teams) {
			if (t.getName().equalsIgnoreCase(input)) {
				t.displayPlayers();
				found = true;
				break;
			}
		}

		if (!found) {
			System.out.println("Team not found!");
		}
	}
}
