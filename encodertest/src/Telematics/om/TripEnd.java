/*  
 *   This file was generated by openASN.1 - an open source ASN.1 toolkit for java
 *
 *   openASN.1 is Copyright (C) 2007 Clayton Hoss, Marc Weyland
 *
 *   openASN.1 is free software: you can redistribute it and/or modify
 *   it under the terms of the GNU Lesser General Public License as 
 *   published by the Free Software Foundation, either version 3 of 
 *   the License, or (at your option) any later version.
 *
 *   openASN.1 is distributed in the hope that it will be useful,
 *   but WITHOUT ANY WARRANTY; without even the implied warranty of
 *   MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE. See the
 *   GNU Lesser General Public License for more details.
 *
 *   You should have received a copy of the GNU Lesser General Public License
 *   along with openASN.1. If not, see <http://www.gnu.org/licenses/>.
 * 
 */
package Telematics.om;

import java.util.List;

public class TripEnd extends Object {
	public TripEnd() {
	}

	private Type type;

	private String startTime;

	private Position startPosition;

	private String endTime;

	private Position endPosition;

	private Long distance;

	private Long tripTime;

	private Fare fare;

	private List<SalikPasses> salikPasses;

	private String paymentType;

	private Long maxSpeed;

	private Long averageSpeed;

	private Double averageFuelConsumption;

	private Double fuelConsumption;

	private Long co2;

	private Long idleTime;

	private Long odometer;

	private Customer customer;

	private String enterpriseName;

	private List<Driver> driver;

	public Type getType() {
		
		return this.type;
	}
	
	public String getStartTime() {
		
		return this.startTime;
	}
	
	public Position getStartPosition() {
		
		return this.startPosition;
	}
	
	public String getEndTime() {
		
		return this.endTime;
	}
	
	public Position getEndPosition() {
		
		return this.endPosition;
	}
	
	public Long getDistance() {
		
		return this.distance;
	}
	
	public Long getTripTime() {
		
		return this.tripTime;
	}
	
	public Fare getFare() {
		
		return this.fare;
	}
	
	public List<SalikPasses> getSalikPasses() {
		
		return this.salikPasses;
	}
	
	public String getPaymentType() {
		
		return this.paymentType;
	}
	
	public Long getMaxSpeed() {
		
		return this.maxSpeed;
	}
	
	public Long getAverageSpeed() {
		
		return this.averageSpeed;
	}
	
	public Double getAverageFuelConsumption() {
		
		return this.averageFuelConsumption;
	}
	
	public Double getFuelConsumption() {
		
		return this.fuelConsumption;
	}
	
	public Long getCo2() {
		
		return this.co2;
	}
	
	public Long getIdleTime() {
		
		return this.idleTime;
	}
	
	public Long getOdometer() {
		
		return this.odometer;
	}
	
	public Customer getCustomer() {
		
		return this.customer;
	}
	
	public String getEnterpriseName() {
		
		return this.enterpriseName;
	}
	
	public List<Driver> getDriver() {
		
		return this.driver;
	}
	
	public void setType(Type type) {
		
		this.type = type;
	}

	public void setStartTime(String startTime) {
		
		this.startTime = startTime;
	}

	public void setStartPosition(Position startPosition) {
		
		this.startPosition = startPosition;
	}

	public void setEndTime(String endTime) {
		
		this.endTime = endTime;
	}

	public void setEndPosition(Position endPosition) {
		
		this.endPosition = endPosition;
	}

	public void setDistance(Long distance) {
		
		this.distance = distance;
	}

	public void setTripTime(Long tripTime) {
		
		this.tripTime = tripTime;
	}

	public void setFare(Fare fare) {
		
		this.fare = fare;
	}

	public void setSalikPasses(List<SalikPasses> salikPasses) {
		
		this.salikPasses = salikPasses;
	}

	public void setPaymentType(String paymentType) {
		
		this.paymentType = paymentType;
	}

	public void setMaxSpeed(Long maxSpeed) {
		
		this.maxSpeed = maxSpeed;
	}

	public void setAverageSpeed(Long averageSpeed) {
		
		this.averageSpeed = averageSpeed;
	}

	public void setAverageFuelConsumption(Double averageFuelConsumption) {
		
		this.averageFuelConsumption = averageFuelConsumption;
	}

	public void setFuelConsumption(Double fuelConsumption) {
		
		this.fuelConsumption = fuelConsumption;
	}

	public void setCo2(Long co2) {
		
		this.co2 = co2;
	}

	public void setIdleTime(Long idleTime) {
		
		this.idleTime = idleTime;
	}

	public void setOdometer(Long odometer) {
		
		this.odometer = odometer;
	}

	public void setCustomer(Customer customer) {
		
		this.customer = customer;
	}

	public void setEnterpriseName(String enterpriseName) {
		
		this.enterpriseName = enterpriseName;
	}

	public void setDriver(List<Driver> driver) {
		
		this.driver = driver;
	}

	@Override
	public boolean equals(Object anObject) {
		if (this == anObject) return true;
		if ((anObject == null) || (anObject.getClass() != this.getClass())) return false;

		TripEnd comparator = (TripEnd)anObject;

		if ((this.getType() != comparator.getType()) && ((this.getType() == null) || (! this.getType().equals(comparator.getType())))) return false;
		if ((this.getStartTime() != comparator.getStartTime()) && ((this.getStartTime() == null) || (! this.getStartTime().equals(comparator.getStartTime())))) return false;
		if ((this.getStartPosition() != comparator.getStartPosition()) && ((this.getStartPosition() == null) || (! this.getStartPosition().equals(comparator.getStartPosition())))) return false;
		if ((this.getEndTime() != comparator.getEndTime()) && ((this.getEndTime() == null) || (! this.getEndTime().equals(comparator.getEndTime())))) return false;
		if ((this.getEndPosition() != comparator.getEndPosition()) && ((this.getEndPosition() == null) || (! this.getEndPosition().equals(comparator.getEndPosition())))) return false;
		if ((this.getDistance() != comparator.getDistance()) && ((this.getDistance() == null) || (! this.getDistance().equals(comparator.getDistance())))) return false;
		if ((this.getTripTime() != comparator.getTripTime()) && ((this.getTripTime() == null) || (! this.getTripTime().equals(comparator.getTripTime())))) return false;
		if ((this.getFare() != comparator.getFare()) && ((this.getFare() == null) || (! this.getFare().equals(comparator.getFare())))) return false;
		if ((this.getSalikPasses() != comparator.getSalikPasses()) && ((this.getSalikPasses() == null) || (! this.getSalikPasses().equals(comparator.getSalikPasses())))) return false;
		if ((this.getPaymentType() != comparator.getPaymentType()) && ((this.getPaymentType() == null) || (! this.getPaymentType().equals(comparator.getPaymentType())))) return false;
		if ((this.getMaxSpeed() != comparator.getMaxSpeed()) && ((this.getMaxSpeed() == null) || (! this.getMaxSpeed().equals(comparator.getMaxSpeed())))) return false;
		if ((this.getAverageSpeed() != comparator.getAverageSpeed()) && ((this.getAverageSpeed() == null) || (! this.getAverageSpeed().equals(comparator.getAverageSpeed())))) return false;
		if ((this.getAverageFuelConsumption() != comparator.getAverageFuelConsumption()) && ((this.getAverageFuelConsumption() == null) || (! this.getAverageFuelConsumption().equals(comparator.getAverageFuelConsumption())))) return false;
		if ((this.getFuelConsumption() != comparator.getFuelConsumption()) && ((this.getFuelConsumption() == null) || (! this.getFuelConsumption().equals(comparator.getFuelConsumption())))) return false;
		if ((this.getCo2() != comparator.getCo2()) && ((this.getCo2() == null) || (! this.getCo2().equals(comparator.getCo2())))) return false;
		if ((this.getIdleTime() != comparator.getIdleTime()) && ((this.getIdleTime() == null) || (! this.getIdleTime().equals(comparator.getIdleTime())))) return false;
		if ((this.getOdometer() != comparator.getOdometer()) && ((this.getOdometer() == null) || (! this.getOdometer().equals(comparator.getOdometer())))) return false;
		if ((this.getCustomer() != comparator.getCustomer()) && ((this.getCustomer() == null) || (! this.getCustomer().equals(comparator.getCustomer())))) return false;
		if ((this.getEnterpriseName() != comparator.getEnterpriseName()) && ((this.getEnterpriseName() == null) || (! this.getEnterpriseName().equals(comparator.getEnterpriseName())))) return false;
		if ((this.getDriver() != comparator.getDriver()) && ((this.getDriver() == null) || (! this.getDriver().equals(comparator.getDriver())))) return false;
		return true;
	}

	@Override
	public int hashCode() {
		int hash = 1721;

		hash = 1609 * hash + (null == this.getType() ? 0 : this.getType().hashCode());
		hash = 857 * hash + (null == this.getStartTime() ? 0 : this.getStartTime().hashCode());
		hash = 6263 * hash + (null == this.getStartPosition() ? 0 : this.getStartPosition().hashCode());
		hash = 797 * hash + (null == this.getEndTime() ? 0 : this.getEndTime().hashCode());
		hash = 419 * hash + (null == this.getEndPosition() ? 0 : this.getEndPosition().hashCode());
		hash = 7703 * hash + (null == this.getDistance() ? 0 : this.getDistance().hashCode());
		hash = 2099 * hash + (null == this.getTripTime() ? 0 : this.getTripTime().hashCode());
		hash = 6857 * hash + (null == this.getFare() ? 0 : this.getFare().hashCode());
		hash = 31 * hash + (null == this.getSalikPasses() ? 0 : this.getSalikPasses().hashCode());
		hash = 43 * hash + (null == this.getPaymentType() ? 0 : this.getPaymentType().hashCode());
		hash = 47 * hash + (null == this.getMaxSpeed() ? 0 : this.getMaxSpeed().hashCode());
		hash = 3739 * hash + (null == this.getAverageSpeed() ? 0 : this.getAverageSpeed().hashCode());
		hash = 5147 * hash + (null == this.getAverageFuelConsumption() ? 0 : this.getAverageFuelConsumption().hashCode());
		hash = 6133 * hash + (null == this.getFuelConsumption() ? 0 : this.getFuelConsumption().hashCode());
		hash = 6779 * hash + (null == this.getCo2() ? 0 : this.getCo2().hashCode());
		hash = 1559 * hash + (null == this.getIdleTime() ? 0 : this.getIdleTime().hashCode());
		hash = 2293 * hash + (null == this.getOdometer() ? 0 : this.getOdometer().hashCode());
		hash = 7591 * hash + (null == this.getCustomer() ? 0 : this.getCustomer().hashCode());
		hash = 7607 * hash + (null == this.getEnterpriseName() ? 0 : this.getEnterpriseName().hashCode());
		hash = 827 * hash + (null == this.getDriver() ? 0 : this.getDriver().hashCode());
		return hash;
	}

}
