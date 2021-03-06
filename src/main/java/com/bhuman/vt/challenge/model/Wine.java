package com.bhuman.vt.challenge.model;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Wine implements Serializable {

	private static final long serialVersionUID = -6892434771833441384L;

	// this is a simplified model for demonstration purposes

	private Set<GrapeComponent> components = new HashSet<GrapeComponent>();
	private List<GrapeComponent> percentageComponents = new ArrayList<GrapeComponent>();
	private String lotCode;
	private double volume;
	private String description;
	private String tankCode;
	private String productState;
	private String ownerName;

	public Wine(String lotCode, double volume) {
		this.lotCode = lotCode;
		this.volume = volume;
	}
	
	public Set<GrapeComponent> getComponents() {
		return components;
	}

	public String getLotCode() {
		return lotCode;
	}

	public void setLotCode(String lotCode) {
		this.lotCode = lotCode;
	}

	public double getVolume() {
		return Math.round(volume);
	}

	public void setVolume(double volume) {
		this.volume = volume;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public String getTankCode() {
		return tankCode;
	}

	public void setTankCode(String tankCode) {
		this.tankCode = tankCode;
	}

	public String getProductState() {
		return productState;
	}

	public void setProductState(String productState) {
		this.productState = productState;
	}

	public String getOwnerName() {
		return ownerName;
	}

	public void setOwnerName(String ownerName) {
		this.ownerName = ownerName;
	}

	public void setComponents(Set<GrapeComponent> components) {
		this.components = components;
	}
	/*
	 * Get a list of components in descending order by percentage
	 * By default return the first 5 components
	 */
	public List<GrapeComponent> getPercentageComponents() {
		percentageComponents = new ArrayList<GrapeComponent>(components);
		Collections.sort(percentageComponents);
		return percentageComponents;
		//THE BELOW CODE MAYBE USED WHEN IMPLEMENTING THE 5 ROW LIMIT
		/*if(this.percentageComponents.size() > 5) {
			return this.percentageComponents.subList(0, 5); 
		} else {
			return percentageComponents;	
		}*/
	}

	public void setPercentageComponents(List<GrapeComponent> percentageComponents) {
		this.percentageComponents = percentageComponents;
	}

}
