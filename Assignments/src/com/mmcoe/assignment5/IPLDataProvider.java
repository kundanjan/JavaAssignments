package com.mmcoe.assignment5;

import java.util.List;
import java.util.Arrays;

public class IPLDataProvider {
	public static void loadData(IPLService service) {
		service.addTeam(new Team("CSK"), Arrays.asList(
			new Player("MS Dhoni", 7, "WK", "Indian", 12),
			new Player("Ruturaj Gaikwad", 31, "Batsman", "Indian", 7),
			new Player("Deepak Chahar", 90, "Bowler", "Indian", 4),
			new Player("Moeen Ali", 18, "All-rounder", "English", 6),
			new Player("Shivam Dube", 25, "All-rounder", "Indian", 3.5),
			new Player("Tushar Deshpande", 8, "Bowler", "Indian", 2),
			new Player("Devon Conway", 88, "Batsman", "Kiwi", 6.5)
		));

		service.addTeam(new Team("MI"), Arrays.asList(
			new Player("Rohit Sharma", 45, "Batsman", "Indian", 15),
			new Player("Suryakumar Yadav", 63, "Batsman", "Indian", 10),
			new Player("Jasprit Bumrah", 93, "Bowler", "Indian", 12),
			new Player("Ishan Kishan", 23, "WK", "Indian", 8),
			new Player("Tim David", 85, "Batsman", "Australian", 5.5),
			new Player("Piyush Chawla", 6, "Bowler", "Indian", 2),
			new Player("Tilak Varma", 9, "Batsman", "Indian", 3)
		));

		service.addTeam(new Team("RCB"), Arrays.asList(
			new Player("Virat Kohli", 18, "Batsman", "Indian", 17),
			new Player("Faf du Plessis", 13, "Batsman", "South African", 8),
			new Player("Glenn Maxwell", 32, "All-rounder", "Australian", 9),
			new Player("Mohammed Siraj", 77, "Bowler", "Indian", 5),
			new Player("Dinesh Karthik", 1, "WK", "Indian", 4.5),
			new Player("Wanindu Hasaranga", 5, "All-rounder", "Sri Lankan", 7)
		));

		service.addTeam(new Team("KKR"), Arrays.asList(
			new Player("Shreyas Iyer", 41, "Batsman", "Indian", 10),
			new Player("Andre Russell", 12, "All-rounder", "West Indian", 8),
			new Player("Sunil Narine", 74, "All-rounder", "West Indian", 6),
			new Player("Rinku Singh", 35, "Batsman", "Indian", 4),
			new Player("Varun Chakravarthy", 29, "Bowler", "Indian", 5),
			new Player("Nitish Rana", 27, "All-rounder", "Indian", 3.5)
		));

		service.addTeam(new Team("RR"), Arrays.asList(
			new Player("Sanju Samson", 11, "WK", "Indian", 10),
			new Player("Jos Buttler", 17, "WK", "English", 7),
			new Player("Yashasvi Jaiswal", 19, "Batsman", "Indian", 3),
			new Player("Ravichandran Ashwin", 99, "All-rounder", "Indian", 5),
			new Player("Shimron Hetmyer", 3, "Batsman", "West Indian", 6.5),
			new Player("Trent Boult", 18, "Bowler", "Kiwi", 6)
		));
	}
}
