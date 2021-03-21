package com.kpis.web.test;

import java.util.List;

public class VO {
	List<PassengersGroup> passengersGroup;
	List<SegmentInformation> segmentGroup;
	List<PricingOptionGroup> pricingOptionGroup;


	int i;

	public int getI() {
		return i;
	}

	public void setI(int i) {
		this.i = i;
	}

	public List<PassengersGroup> getPassengersGroup() {
		return passengersGroup;
	}

	public void setPassengersGroup(List<PassengersGroup> passengersGroup) {
		this.passengersGroup = passengersGroup;
	}

	public List<SegmentInformation> getSegmentGroup() {
		return segmentGroup;
	}

	public void setSegmentGroup(List<SegmentInformation> segmentGroup) {
		this.segmentGroup = segmentGroup;
	}

	public List<PricingOptionGroup> getPricingOptionGroup() {
		return pricingOptionGroup;
	}

	public void setPricingOptionGroup(List<PricingOptionGroup> pricingOptionGroup) {
		this.pricingOptionGroup = pricingOptionGroup;
	}

}
