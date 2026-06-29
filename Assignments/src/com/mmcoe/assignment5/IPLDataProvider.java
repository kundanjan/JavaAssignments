package com.mmcoe.assignment5;

import java.util.List;
import java.util.Arrays;

public class IPLDataProvider {
	public static void loadData(IPLService service) {
		service.addTeam(new Team("Chennai Super Kings"), Arrays.asList(
			new Player("MS Dhoni", 12),
			new Player("Ruturaj Gaikwad", 7),
			new Player("Deepak Chahar", 4),
			new Player("Moeen Ali", 6),
			new Player("Shivam Dube", 3.5),
			new Player("Tushar Deshpande", 2),
			new Player("Devon Conway", 6.5)
		));

		service.addTeam(new Team("Mumbai Indians"), Arrays.asList(
			new Player("Rohit Sharma", 15),
			new Player("Suryakumar Yadav", 10),
			new Player("Jasprit Bumrah", 12),
			new Player("Ishan Kishan", 8),
			new Player("Tim David", 5.5),
			new Player("Piyush Chawla", 2),
			new Player("Tilak Varma", 3)
		));

		service.addTeam(new Team("Royal Challengers Bangalore"), Arrays.asList(
			new Player("Virat Kohli", 17),
			new Player("Faf du Plessis", 8),
			new Player("Glenn Maxwell", 9),
			new Player("Mohammed Siraj", 5),
			new Player("Dinesh Karthik", 4.5),
			new Player("Wanindu Hasaranga", 7)
		));

		service.addTeam(new Team("Kolkata Knight Riders"), Arrays.asList(
			new Player("Shreyas Iyer", 10),
			new Player("Andre Russell", 8),
			new Player("Sunil Narine", 6),
			new Player("Rinku Singh", 4),
			new Player("Varun Chakravarthy", 5),
			new Player("Nitish Rana", 3.5)
		));

		service.addTeam(new Team("Rajasthan Royals"), Arrays.asList(
			new Player("Sanju Samson", 10),
			new Player("Jos Buttler", 7),
			new Player("Yashasvi Jaiswal", 3),
			new Player("Ravichandran Ashwin", 5),
			new Player("Shimron Hetmyer", 6.5),
			new Player("Trent Boult", 6)
		));
	}
}
