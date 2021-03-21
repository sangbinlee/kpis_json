package com.kpis.web.test;


public class PricingOptionGroup {
	public PricingOptionKey getPricingOptionKey() {
		return pricingOptionKey;
	}
	public void setPricingOptionKey(PricingOptionKey pricingOptionKey) {
		this.pricingOptionKey = pricingOptionKey;
	}
	public CarrierInformation getCarrierInformation() {
		return carrierInformation;
	}
	public void setCarrierInformation(CarrierInformation carrierInformation) {
		this.carrierInformation = carrierInformation;
	}
	PricingOptionKey pricingOptionKey;
	CarrierInformation carrierInformation;

}
