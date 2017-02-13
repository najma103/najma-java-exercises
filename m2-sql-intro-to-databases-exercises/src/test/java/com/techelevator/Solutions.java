package com.techelevator;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.Reader;
import java.util.HashMap;
import java.util.Map;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Solutions {

	Map<String, Solution> solutions = new HashMap<>(); 
	
	public Solutions(Reader reader) throws IOException {
		try (BufferedReader br = new BufferedReader(reader)){
			//From beginning of line, 2 hyphens, any amount of white space, any number of digits, a single period, and any amount of whitespace
			Pattern p = Pattern.compile("^--(?<ID>\\s*\\d+)[.]\\s*");
			boolean inSolution = false;
			String id = "";
			String code = "";
			String currentLine;
			while ((currentLine = br.readLine()) != null) {
				Matcher m = p.matcher(currentLine);
				if (m.find()) {
					if (inSolution) {
						//Add the current solution, and reset code in preparation for the next solution just found
						solutions.put(id, new Solution(id, code));
						code = "";
					}
					id = m.group("ID").trim();
					inSolution = true;
				}
				if (inSolution) {
					code += currentLine + System.lineSeparator();
				}
			}
			if (inSolution && code.length() > 0) {
				//EOF while still in a solution, add the solution as it is, and hope for the best :-)
				solutions.put(id, new Solution(id, code));
			}
		}
		catch (IOException e) {
			throw e;
		}
	}
	
	public String getSolutionCode(String id) {
		Solution s = solutions.get(id);
		return s != null? s.getCode() : null; //Return null if solution not found by id
	}
}
