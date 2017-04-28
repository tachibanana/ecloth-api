package com.javar.dev.ecloth.model;

public class GeneralFeature {

	private int featureId;
	private String featureKey;
	private String featureValue;
	
	public GeneralFeature(){
		
	}
	
	public GeneralFeature(int featureId, String featureKey, String featureValue) {
		super();
		this.featureId = featureId;
		this.featureKey = featureKey;
		this.featureValue = featureValue;
	}

	public int getFeatureId() {
		return featureId;
	}

	public void setFeatureId(int featureId) {
		this.featureId = featureId;
	}

	public String getFeatureKey() {
		return featureKey;
	}

	public void setFeatureKey(String featureKey) {
		this.featureKey = featureKey;
	}

	public String getFeatureValue() {
		return featureValue;
	}

	public void setFeatureValue(String featureValue) {
		this.featureValue = featureValue;
	}
	
}
