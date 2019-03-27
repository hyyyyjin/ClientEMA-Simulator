package com.mir.smartgrid.simulator.profile.openadr;


public class ConnectedPartyRegistration {

	private String srcEMA, destEMA, responseDescription, requestID, duration, service;
	private int responseCode;
	private String profile;

	
	public ConnectedPartyRegistration(){
		
	}
	
	public ConnectedPartyRegistration(String srcEMA, String destEMA, int responseCode, String responseDescription,
			String requestID, String profile, String duration, String service, String version, String time) {

	}

	public String getSrcEMA() {
		return srcEMA;
	}

	public void setSrcEMA(String srcEMA) {
		this.srcEMA = srcEMA;
	}

	public String getDestEMA() {
		return destEMA;
	}

	public void setDestEMA(String destEMA) {
		this.destEMA = destEMA;
	}

	public String getResponseDescription() {
		return responseDescription;
	}

	public void setResponseDescription(String responseDescription) {
		this.responseDescription = responseDescription;
	}

	public String getRequestID() {
		return requestID;
	}

	public void setRequestID(String requestID) {
		this.requestID = requestID;
	}

	public String getDuration() {
		return duration;
	}

	public void setDuration(String duration) {
		this.duration = duration;
	}

	public String getService() {
		return service;
	}

	public void setService(String service) {
		this.service = service;
	}


	public int getResponseCode() {
		return responseCode;
	}

	public void setResponseCode(int responseCode) {
		this.responseCode = responseCode;
	}

	public String getProfile() {
		return profile;
	}

	public void setProfile(String profile) {
		this.profile = profile;
	}

	@Override
	public String toString() {

		return "{\"vtnID" + "\":" + "\"" + getSrcEMA() + "\"" + ", "
				+ "\"venID" + "\":" + "\"" + getDestEMA() + "\"" + ", "
				+"\"responseCode" + "\":" + "\"" + getResponseCode() + "\"" + ", "
				+"\"responseDescription" + "\":" + "\"" + getResponseDescription() + "\"" + ", "
				+"\"requestID" + "\":" + "\"" + getRequestID() + "\"" + ", "
				+"\"duration" + "\":" + "\"" + getDuration() + "\"" + ", "
				+"\"service" + "\":" + "\"" + getService() + "\"" + ", "
				+"\"registrationID" + "\":" + "\"" + "" + "\"" + ", "
				+ "\"oadrProfile" + "\": "+ getProfile() + "}";
	}

}
