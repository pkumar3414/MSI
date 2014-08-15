package com.myshipinfo.bean;

import java.sql.Date;
import java.sql.Timestamp;

import com.pac.bean.GenericBean;

public class CRGeneratedReportDetailsBean extends GenericBean {
	private static final long serialVersionUID = 1L;

	private long generatedRptDetId;
	private long savedSchedRptId;
	private String reportFileName;
	private String reportSentEmailIds;
	private long cost;
	private long fileSize;
	private Timestamp completionDate;
	private Timestamp expiresDate;
	private String criteria;
	private Timestamp lastNotified;
	private boolean reportGeneratedStatus;
	private String emailSubject;
	private String emailBody;
	private String physicalFileName;
	private long reportTypeId;
	private String status;
	private String exceptionDetails;
	private Date nextSubmitDateEstimated;
	private long fileLocationServer;
	private String runningOnHostname;

	// Custom Fields. Not from DB.
	private boolean isScheduled;
	private String usersInterested;
	private String usersScheduled;
	private String reportName;

	public long getFileLocationServer() {
		return fileLocationServer;
	}

	public void setFileLocationServer(long fileLocationServer) {
		this.fileLocationServer = fileLocationServer;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	public String getExceptionDetails() {
		return exceptionDetails;
	}

	public void setExceptionDetails(String exceptionDetails) {
		this.exceptionDetails = exceptionDetails;
	}

	public long getReportTypeId() {
		return reportTypeId;
	}

	public void setReportTypeId(long reportTypeId) {
		this.reportTypeId = reportTypeId;
	}

	public String getPhysicalFileName() {
		return physicalFileName;
	}

	public void setPhysicalFileName(String physicalFileName) {
		this.physicalFileName = physicalFileName;
	}

	public String getCriteria() {
		return criteria;
	}

	public void setCriteria(String criteria) {
		this.criteria = criteria;
	}

	public long getGeneratedRptDetId() {
		return generatedRptDetId;
	}

	public void setGeneratedRptDetId(long generatedRptDetId) {
		this.generatedRptDetId = generatedRptDetId;
	}

	public long getSavedSchedRptId() {
		return savedSchedRptId;
	}

	public void setSavedSchedRptId(long savedSchedRptId) {
		this.savedSchedRptId = savedSchedRptId;
	}

	public String getReportFileName() {
		return reportFileName;
	}

	public void setReportFileName(String reportFileName) {
		this.reportFileName = reportFileName;
	}

	public Timestamp getLastNotified() {
		return lastNotified;
	}

	public void setLastNotified(Timestamp lastNotified) {
		this.lastNotified = lastNotified;
	}

	public boolean isReportGeneratedStatus() {
		return reportGeneratedStatus;
	}

	public void setReportGeneratedStatus(boolean reportGeneratedStatus) {
		this.reportGeneratedStatus = reportGeneratedStatus;
	}

	public String getEmailSubject() {
		return emailSubject;
	}

	public void setEmailSubject(String emailSubject) {
		this.emailSubject = emailSubject;
	}

	public String getEmailBody() {
		return emailBody;
	}

	public void setEmailBody(String email_body) {
		this.emailBody = email_body;
	}

	public String getReportSentEmailIds() {
		return reportSentEmailIds;
	}

	public void setReportSentEmailIds(String reportSentEmailIds) {
		this.reportSentEmailIds = reportSentEmailIds;
	}

	public long getCost() {
		return cost;
	}

	public void setCost(long cost) {
		this.cost = cost;
	}

	public long getFileSize() {
		return fileSize;
	}

	public void setFileSize(long file_size) {
		this.fileSize = file_size;
	}

	public Timestamp getCompletionDate() {
		return completionDate;
	}

	public void setCompletionDate(Timestamp completionDate) {
		this.completionDate = completionDate;
	}

	public Timestamp getExpiresDate() {
		return expiresDate;
	}

	public void setExpiresDate(Timestamp expiresDate) {
		this.expiresDate = expiresDate;
	}

	public Date getNextSubmitDateEstimated() {
		return nextSubmitDateEstimated;
	}

	public void setNextSubmitDateEstimated(Date nextSubmitDateEstimated) {
		this.nextSubmitDateEstimated = nextSubmitDateEstimated;
	}

	public boolean isScheduled() {
		return isScheduled;
	}

	public void setScheduled(boolean isScheduled) {
		this.isScheduled = isScheduled;
	}

	public String getUsersInterested() {
		return usersInterested;
	}

	public void setUsersInterested(String usersInterested) {
		this.usersInterested = usersInterested;
	}

	public String getUsersScheduled() {
		return usersScheduled;
	}

	public void setUsersScheduled(String usersScheduled) {
		this.usersScheduled = usersScheduled;
	}

	public String getReportName() {
		return reportName;
	}

	public void setReportName(String reportName) {
		this.reportName = reportName;
	}

	public String getRunningOnHostname() {
		return runningOnHostname;
	}

	public void setRunningOnHostname(String runningOnHostname) {
		this.runningOnHostname = runningOnHostname;
	}

}
