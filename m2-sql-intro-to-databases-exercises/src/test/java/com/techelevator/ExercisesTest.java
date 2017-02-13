package com.techelevator;

import static org.junit.Assert.*;

import java.io.File;
import java.io.FileReader;
import java.sql.SQLException;
import java.util.HashMap;
import java.util.Map;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.datasource.SingleConnectionDataSource;
import org.springframework.jdbc.support.rowset.SqlRowSet;

public class ExercisesTest {

	private final static String FS = File.separator;
	
	private static SingleConnectionDataSource dataSource;
	private static Solutions solutions;
	
	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
		//TO-DO: Reset the database
		// createdb -U postgres world
		// psql -U postgres -d world -f world.sql
		
		
		//Load the Solutions
		String solutionFilename = System.getProperty("user.dir") + FS + "src" + FS + "main" + FS + "resources" + FS + "intro-to-databases-exercises.sql";
		try (FileReader fr = new FileReader(solutionFilename)) {
			solutions = new Solutions(fr);
		}
		
		//Obtain a datasource
		dataSource = new SingleConnectionDataSource();
		dataSource.setUrl("jdbc:postgresql://localhost:5432/world");
		dataSource.setUsername("postgres");
		dataSource.setPassword("postgres1");
		/* The following line disables autocommit for connections 
		 * returned by this DataSource. This allows us to rollback
		 * any changes after each test */
		dataSource.setAutoCommit(false);
	}

	@AfterClass
	public static void closeDataSource() throws SQLException {
		dataSource.destroy();
	}

	@Test
	public void testSolution1() {
		Map <String, Integer> pseudoTable = new HashMap<>();
		String sql = solutions.getSolutionCode("1");
		JdbcTemplate jdbcTemplate = new JdbcTemplate(dataSource);
		SqlRowSet results = jdbcTemplate.queryForRowSet(sql);
		while (results.next()) {
			pseudoTable.put(results.getString("name"), results.getInt("population"));
		}
		assertEquals(27, pseudoTable.size());
	}

	@Test
	public void testSolution2() {
		Map <String, Integer> pseudoTable = new HashMap<>();
		String sql = solutions.getSolutionCode("2");
		JdbcTemplate jdbcTemplate = new JdbcTemplate(dataSource);
		SqlRowSet results = jdbcTemplate.queryForRowSet(sql);
		while (results.next()) {
			pseudoTable.put(results.getString("name"), results.getInt("population"));
		}
		assertEquals(1, pseudoTable.size());
	}

}
