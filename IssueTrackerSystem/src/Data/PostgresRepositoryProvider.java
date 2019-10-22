package Data;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Vector;

import org.postgresql.ds.PGSimpleDataSource;
import Business.Issue;
import Presentation.IRepositoryProvider;

/**
 * Encapsulates create/read/update/delete operations to PostgreSQL database
 * @author Lijun
 */
public class PostgresRepositoryProvider implements IRepositoryProvider {
	   // connection parameters - ENTER YOUR LOGIN AND PASSWORD HERE
    private final String userid = "y18s2c9120_unikey";
    private final String passwd = "password";
    private final String myHost = "soit-db-pro-2.ucc.usyd.edu.au";

	private Connection openConnection() throws SQLException
	{
		PGSimpleDataSource source = new PGSimpleDataSource();
		source.setServerName(myHost);
		source.setDatabaseName(userid);
		source.setUser(userid);
		source.setPassword(passwd);
		Connection conn = source.getConnection();
	    
	    return conn;
	}

	/**
	 * Find the user associated issues as per the assignment description
	 * @param userId the user id
	 * @return
	 */
	@Override
	public Vector<Issue> findUserIssues(int userId) {		
		Vector<Issue> results = new Vector<Issue>();
		// TODO - list all user associated issues from db using sql
		
		// the following code illustrates the structure of Issue
		Issue issue = new Issue();
		int creator = 1;
		issue.setCreator(creator);
		int verifier = 1;
		issue.setVerifier(verifier);
		int resolver = 1;
		issue.setResolver(resolver);
		issue.setTitle("myTitle");
		issue.setDescription("myDescription");
		issue.setId(1);
		results.add(issue);

		return results;
	}

	/**
	 * Find the associated issues for the user with the given userId based 
	 * on the searchString provided as the parameter, and based on the assignment description
	 * @param searchString: see assignment description search specification
	 * @param userId: the userId for the user associated issues to look through
	 * @return
	 */
	@Override
	public Vector<Issue> findIssueBasedOnExpressionSearchedOnTitleAndDescription(
			String searchString, int userId) {
		
		Vector<Issue> results = new Vector<Issue>();
		// TODO - find necessary issues using sql database based on search input
		
		return results;
	}

	/**
	 * Add the details for a new issue to the database
	 * @param issue: the new issue to add
	 */
	@Override
	public void addIssue(Issue issue) {
	    //TODO - add an issue
	    //Insert a new issue to database
	}
	
	/**
	 * Update the details for a given issue
	 * @param issue : the issue for which to update details
	 */
	@Override
	public void updateIssue(Issue issue) {
		//TODO - update the issue using db
	}
}
