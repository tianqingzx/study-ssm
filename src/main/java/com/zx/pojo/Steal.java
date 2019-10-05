package com.zx.pojo;

import java.util.Date;

public class Steal {
	private long stealUserId;
	private long energyId;
	private int stealEnergyValue;
	private Date stealTime;
	
	public Steal() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Steal(long stealUserId, long energyId, int stealEnergyValue, Date stealTime) {
		super();
		this.stealUserId = stealUserId;
		this.energyId = energyId;
		this.stealEnergyValue = stealEnergyValue;
		this.stealTime = stealTime;
	}

	/**
	 * @return the stealUserId
	 */
	public long getStealUserId() {
		return stealUserId;
	}

	/**
	 * @param stealUserId the stealUserId to set
	 */
	public void setStealUserId(long stealUserId) {
		this.stealUserId = stealUserId;
	}

	/**
	 * @return the energyId
	 */
	public long getEnergyId() {
		return energyId;
	}

	/**
	 * @param energyId the energyId to set
	 */
	public void setEnergyId(long energyId) {
		this.energyId = energyId;
	}

	/**
	 * @return the stealEnergyValue
	 */
	public int getStealEnergyValue() {
		return stealEnergyValue;
	}

	/**
	 * @param stealEnergyValue the stealEnergyValue to set
	 */
	public void setStealEnergyValue(int stealEnergyValue) {
		this.stealEnergyValue = stealEnergyValue;
	}

	/**
	 * @return the stealTime
	 */
	public Date getStealTime() {
		return stealTime;
	}

	/**
	 * @param stealTime the stealTime to set
	 */
	public void setStealTime(Date stealTime) {
		this.stealTime = stealTime;
	}

	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "Steal [stealUserId=" + stealUserId + ", energyId=" + energyId + ", stealEnergyValue=" + stealEnergyValue
				+ ", stealTime=" + stealTime.toLocaleString() + "]";
	}

}
