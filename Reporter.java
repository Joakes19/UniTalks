import java.sql.*;
import java.util.*;

public class Reporter{
	ReportWriter databaseWriter;
	public Reporter(){
		databaseWriter = new ReportWriter();
	}
	
	public void reportUser(int clientID, int reportedClientID, Date reportDate, int reportTypeID, String reportReason, int reportEvidenceID){//This function reports a user
		databaseWriter.writeReportRecord(clientID, reportedClientID, reportDate, reportType, reportReason, reportEvidenceID);
	}
}