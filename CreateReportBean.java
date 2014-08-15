package com.myshipinfo.bean;

import java.sql.Date;
import java.util.ArrayList;
import java.util.HashMap;

import org.json.JSONObject;

import com.pac.bean.GenericBean;

//This bean is used in gathering the data from the UI and storing in the DB or converting
//to another bean to show in the VIEW action.

public class CreateReportBean extends GenericBean {
	private static final long serialVersionUID = 1L;

	private boolean isSavedScheduled;
	private long userId;
	private String userName;
	private CRSavedOrScheduledReportBean savedOrScheduledReportBean;

	private String userGroupsCommaSeperated;
	private String groupEmailsCommaSeparated;
	private Date fromDate; // This is only used by Scheduler to send emails.
	private Date toDate; // This is only used by Scheduler to send emails.
	private String action;
	private long savedSchedReportId;
	private CRRPTParametersBean rPTParametersBean = new CRRPTParametersBean();
	private CRQueryBuilderBean queryBuilderBean = new CRQueryBuilderBean();
	private boolean isNewReport;
	private CRGeneratedReportDetailsBean generatedReportDetailsBean;
	private CustomerProfileBean customerProfileBean;
	private String carrierNames;
	private ArrayList<String> controlNumbers = new ArrayList<String>();
	private boolean overwriteIsSavedScheduled;
	private long overwriteSaveOrScheduleRptId;
	private ArrayList<String> payRunNumbers = new ArrayList<String>();
	private HashMap<String, Object> multiSheetParameters = new HashMap<String, Object>();
	private HashMap<String, String> macroParameters = new HashMap<String, String>();
	private StringBuffer statusLog = new StringBuffer();
	private String externalEmailsTO;
	private String externalEmailsCC;
	private String externalEmailsBCC;
	private boolean externalEmailsPresent;
	private JSONObject jsonForNewReportServer;

	public StringBuffer getStatusLog() {
		return statusLog;
	}

	public void setStatusLog(StringBuffer statusLog) {
		this.statusLog = statusLog;
	}

	public HashMap<String, String> getMacroParameters() {
		return macroParameters;
	}

	public void setMacroParameters(HashMap<String, String> macroParameters) {
		this.macroParameters = macroParameters;
	}

	public HashMap<String, Object> getMultiSheetParameters() {
		return multiSheetParameters;
	}

	public void setMultiSheetParameters(HashMap<String, Object> multiSheetParameters) {
		this.multiSheetParameters = multiSheetParameters;
	}

	public ArrayList<String> getPayRunNumbers() {
		return payRunNumbers;
	}

	public void setPayRunNumbers(ArrayList<String> payRunNumbers) {
		this.payRunNumbers = payRunNumbers;
	}

	public boolean isAttachReportToEmail;

	public boolean isOverwriteIsSavedScheduled() {
		return overwriteIsSavedScheduled;
	}

	public void setOverwriteIsSavedScheduled(boolean overwriteIsSavedScheduled) {
		this.overwriteIsSavedScheduled = overwriteIsSavedScheduled;
	}

	public long getOverwriteSaveOrScheduleRptId() {
		return overwriteSaveOrScheduleRptId;
	}

	public void setOverwriteSaveOrScheduleRptId(long overwriteSaveOrScheduleRptId) {
		this.overwriteSaveOrScheduleRptId = overwriteSaveOrScheduleRptId;
	}

	public ArrayList<String> getControlNumbers() {
		return controlNumbers;
	}

	public void setControlNumbers(ArrayList<String> controlNumbers) {
		this.controlNumbers = controlNumbers;
	}

	public String getCarrierNames() {
		return carrierNames;
	}

	public void setCarrierNames(String carrierNames) {
		this.carrierNames = carrierNames;
	}

	public CustomerProfileBean getCustomerProfileBean() {
		return customerProfileBean;
	}

	public void setCustomerProfileBean(CustomerProfileBean customerProfileBean) {
		this.customerProfileBean = customerProfileBean;
	}

	public CRGeneratedReportDetailsBean getGeneratedReportDetailsBean() {
		return generatedReportDetailsBean;
	}

	public void setGeneratedReportDetailsBean(CRGeneratedReportDetailsBean generatedReportDetailsBean) {
		this.generatedReportDetailsBean = generatedReportDetailsBean;
	}

	public boolean isNewReport() {
		return isNewReport;
	}

	public void setNewReport(boolean isNewReport) {
		this.isNewReport = isNewReport;
	}

	public CRQueryBuilderBean getQueryBuilderBean() {
		return queryBuilderBean;
	}

	public void setQueryBuilderBean(CRQueryBuilderBean queryBuilderBean) {
		this.queryBuilderBean = queryBuilderBean;
	}

	public CRRPTParametersBean getrPTParametersBean() {
		return rPTParametersBean;
	}

	public void setrPTParametersBean(CRRPTParametersBean rPTParametersBean) {
		this.rPTParametersBean = rPTParametersBean;
	}

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public Date getFromDate() {
		return fromDate;
	}

	public void setFromDate(Date fromDate) {
		this.fromDate = fromDate;
	}

	public Date getToDate() {
		return toDate;
	}

	public void setToDate(Date toDate) {
		this.toDate = toDate;
	}

	public boolean isSavedScheduled() {
		return isSavedScheduled;
	}

	public void setSavedScheduled(boolean isSavedScheduled) {
		this.isSavedScheduled = isSavedScheduled;
	}

	public long getUserId() {
		return userId;
	}

	public void setUserId(long userId) {
		this.userId = userId;
	}

	public String getAction() {
		return action;
	}

	public void setAction(String action) {
		this.action = action;
	}

	public long getSavedSchedReportId() {
		return savedSchedReportId;
	}

	public void setSavedSchedReportId(long savedSchedReportId) {
		this.savedSchedReportId = savedSchedReportId;
	}

	public CRSavedOrScheduledReportBean getSavedOrScheduledReportBean() {
		return savedOrScheduledReportBean;
	}

	public void setSavedOrScheduledReportBean(CRSavedOrScheduledReportBean savedOrScheduledReportBean) {
		this.savedOrScheduledReportBean = savedOrScheduledReportBean;
	}

	public String getUserGroupsCommaSeperated() {
		return userGroupsCommaSeperated;
	}

	public void setUserGroupsCommaSeperated(String userGroupsCommaSeperated) {
		this.userGroupsCommaSeperated = userGroupsCommaSeperated;
	}

	public String getGroupEmailsCommaSeparated() {
		return groupEmailsCommaSeparated;
	}

	public void setGroupEmailsCommaSeparated(String groupEmailsCommaSeparated) {
		this.groupEmailsCommaSeparated = groupEmailsCommaSeparated;
	}

	public String getExternalEmailsTO() {
		return externalEmailsTO;
	}

	public void setExternalEmailsTO(String externalEmailsTO) {
		this.externalEmailsTO = externalEmailsTO;
	}

	public String getExternalEmailsCC() {
		return externalEmailsCC;
	}

	public void setExternalEmailsCC(String externalEmailsCC) {
		this.externalEmailsCC = externalEmailsCC;
	}

	public String getExternalEmailsBCC() {
		return externalEmailsBCC;
	}

	public void setExternalEmailsBCC(String externalEmailsBCC) {
		this.externalEmailsBCC = externalEmailsBCC;
	}

	public boolean isExternalEmailsPresent() {
		return externalEmailsPresent;
	}

	public void setExternalEmailsPresent(boolean externalEmailsPresent) {
		this.externalEmailsPresent = externalEmailsPresent;
	}

	public JSONObject getJsonForNewReportServer() {
		return jsonForNewReportServer;
	}

	public void setJsonForNewReportServer(JSONObject jsonForNewReportServer) {
		this.jsonForNewReportServer = jsonForNewReportServer;
	}

}
