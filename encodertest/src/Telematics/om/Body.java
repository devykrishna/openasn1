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

public class Body extends Object {
	public Body() {
	}

	private Basic basic;

	private Maintenance maintenance;

	private Running running;

	private DrivingSafety drivingSafety;

	private DrivingBehavior drivingBehavior;

	private Diagnostics diagnostics;

	private Event event;

	public Basic getBasic() {
		
		return this.basic;
	}
	
	public Maintenance getMaintenance() {
		
		return this.maintenance;
	}
	
	public Running getRunning() {
		
		return this.running;
	}
	
	public DrivingSafety getDrivingSafety() {
		
		return this.drivingSafety;
	}
	
	public DrivingBehavior getDrivingBehavior() {
		
		return this.drivingBehavior;
	}
	
	public Diagnostics getDiagnostics() {
		
		return this.diagnostics;
	}
	
	public Event getEvent() {
		
		return this.event;
	}
	
	public void setBasic(Basic basic) {
		
		this.basic = basic;
	}

	public void setMaintenance(Maintenance maintenance) {
		
		this.maintenance = maintenance;
	}

	public void setRunning(Running running) {
		
		this.running = running;
	}

	public void setDrivingSafety(DrivingSafety drivingSafety) {
		
		this.drivingSafety = drivingSafety;
	}

	public void setDrivingBehavior(DrivingBehavior drivingBehavior) {
		
		this.drivingBehavior = drivingBehavior;
	}

	public void setDiagnostics(Diagnostics diagnostics) {
		
		this.diagnostics = diagnostics;
	}

	public void setEvent(Event event) {
		
		this.event = event;
	}

	@Override
	public boolean equals(Object anObject) {
		if (this == anObject) return true;
		if ((anObject == null) || (anObject.getClass() != this.getClass())) return false;

		Body comparator = (Body)anObject;

		if ((this.getBasic() != comparator.getBasic()) && ((this.getBasic() == null) || (! this.getBasic().equals(comparator.getBasic())))) return false;
		if ((this.getMaintenance() != comparator.getMaintenance()) && ((this.getMaintenance() == null) || (! this.getMaintenance().equals(comparator.getMaintenance())))) return false;
		if ((this.getRunning() != comparator.getRunning()) && ((this.getRunning() == null) || (! this.getRunning().equals(comparator.getRunning())))) return false;
		if ((this.getDrivingSafety() != comparator.getDrivingSafety()) && ((this.getDrivingSafety() == null) || (! this.getDrivingSafety().equals(comparator.getDrivingSafety())))) return false;
		if ((this.getDrivingBehavior() != comparator.getDrivingBehavior()) && ((this.getDrivingBehavior() == null) || (! this.getDrivingBehavior().equals(comparator.getDrivingBehavior())))) return false;
		if ((this.getDiagnostics() != comparator.getDiagnostics()) && ((this.getDiagnostics() == null) || (! this.getDiagnostics().equals(comparator.getDiagnostics())))) return false;
		if ((this.getEvent() != comparator.getEvent()) && ((this.getEvent() == null) || (! this.getEvent().equals(comparator.getEvent())))) return false;
		return true;
	}

	@Override
	public int hashCode() {
		int hash = 4057;

		hash = 2333 * hash + (null == this.getBasic() ? 0 : this.getBasic().hashCode());
		hash = 59 * hash + (null == this.getMaintenance() ? 0 : this.getMaintenance().hashCode());
		hash = 1229 * hash + (null == this.getRunning() ? 0 : this.getRunning().hashCode());
		hash = 4441 * hash + (null == this.getDrivingSafety() ? 0 : this.getDrivingSafety().hashCode());
		hash = 307 * hash + (null == this.getDrivingBehavior() ? 0 : this.getDrivingBehavior().hashCode());
		hash = 2741 * hash + (null == this.getDiagnostics() ? 0 : this.getDiagnostics().hashCode());
		hash = 157 * hash + (null == this.getEvent() ? 0 : this.getEvent().hashCode());
		return hash;
	}

}
