package com.mmcoe.assignment5;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class IPLDataProvider {
	public static void loadData(IPLService service) {
		try {
			Map<String, List<Player>> teamPlayers = Files.lines(Paths.get("src/com/mmcoe/assignment5/ipl-data.csv"))
				.skip(1)
				.map(line -> line.split(","))
				.collect(Collectors.groupingBy(
					record -> record[0],
					Collectors.mapping(
						record -> new Player(record[1], Integer.parseInt(record[2]), record[3], record[4], Double.parseDouble(record[5])),
						Collectors.toList()
					)
				));

			teamPlayers.forEach((teamName, players) ->
				service.addTeam(new Team(teamName), players)
			);
		} catch (IOException e) {
			System.out.println("Error reading CSV: " + e.getMessage());
		}
	}
}
