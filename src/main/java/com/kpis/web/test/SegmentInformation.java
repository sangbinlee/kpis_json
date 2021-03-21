package com.kpis.web.test;

public class SegmentInformation {

	BoardPointDetails boardPointDetails;
	CompanyDetails companyDetails;
	FlightDate flightDate;
	FlightIdentification flightIdentification;
	FlightTypeDetails flightTypeDetails;
	String itemNumber;
	OffpointDetails offpointDetails;

	public FlightDate getFlightDate() {
		return flightDate;
	}

	public void setFlightDate(FlightDate flightDate) {
		this.flightDate = flightDate;
	}

	public BoardPointDetails getBoardPointDetails() {
		return boardPointDetails;
	}

	public void setBoardPointDetails(BoardPointDetails boardPointDetails) {
		this.boardPointDetails = boardPointDetails;
	}

	public OffpointDetails getOffpointDetails() {
		return offpointDetails;
	}

	public void setOffpointDetails(OffpointDetails offpointDetails) {
		this.offpointDetails = offpointDetails;
	}

	public CompanyDetails getCompanyDetails() {
		return companyDetails;
	}

	public void setCompanyDetails(CompanyDetails companyDetails) {
		this.companyDetails = companyDetails;
	}

	public FlightIdentification getFlightIdentification() {
		return flightIdentification;
	}

	public void setFlightIdentification(FlightIdentification flightIdentification) {
		this.flightIdentification = flightIdentification;
	}

	public FlightTypeDetails getFlightTypeDetails() {
		return flightTypeDetails;
	}

	public void setFlightTypeDetails(FlightTypeDetails flightTypeDetails) {
		this.flightTypeDetails = flightTypeDetails;
	}

	public String getItemNumber() {
		return itemNumber;
	}

	public void setItemNumber(String itemNumber) {
		this.itemNumber = itemNumber;
	}

}
