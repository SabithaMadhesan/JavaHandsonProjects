package com.ticket.project;

public class Pojo {
	int id;
	String AssigneeName;
	String ReporterName;
	String Heading;
	String Status;

	public Pojo(int id, String assigneeName, String reporterName, String heading, String status) {
		// super();
		this.id = id;
		AssigneeName = assigneeName;
		ReporterName = reporterName;
		Heading = heading;
		Status = status;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getAssigneeName() {
		return AssigneeName;
	}

	public void setAssigneeName(String assigneeName) {
		AssigneeName = assigneeName;
	}

	public String getReporterName() {
		return ReporterName;
	}

	public void setReporterName(String reporterName) {
		ReporterName = reporterName;
	}

	public String getHeading() {
		return Heading;
	}

	public void setHeading(String heading) {
		Heading = heading;
	}

	public String getStatus() {
		return Status;
	}

	public void setStatus(String status) {
		Status = status;
	}

}
