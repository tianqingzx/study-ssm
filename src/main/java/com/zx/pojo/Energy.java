package com.zx.pojo;

import java.util.Date;

public class Energy {
	private long energyId;
	private long ownUserId;
	private Date createTime;
	private int initValue;
	private int remainValue;
	private boolean useUp;
	
	public Energy() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Energy(long energyId, long ownUserId, Date createTime, int initValue, int remainValue, boolean useUp) {
		super();
		this.energyId = energyId;
		this.ownUserId = ownUserId;
		this.createTime = createTime;
		this.initValue = initValue;
		this.remainValue = remainValue;
		this.useUp = useUp;
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
	 * @return the ownUserId
	 */
	public long getOwnUserId() {
		return ownUserId;
	}

	/**
	 * @param ownUserId the ownUserId to set
	 */
	public void setOwnUserId(long ownUserId) {
		this.ownUserId = ownUserId;
	}

	/**
	 * @return the createTime
	 */
	public Date getCreateTime() {
		return createTime;
	}

	/**
	 * @param createTime the createTime to set
	 */
	public void setCreateTime(Date createTime) {
		this.createTime = createTime;
	}

	/**
	 * @return the initValue
	 */
	public int getInitValue() {
		return initValue;
	}

	/**
	 * @param initValue the initValue to set
	 */
	public void setInitValue(int initValue) {
		this.initValue = initValue;
	}

	/**
	 * @return the remainValue
	 */
	public int getRemainValue() {
		return remainValue;
	}

	/**
	 * @param remainValue the remainValue to set
	 */
	public void setRemainValue(int remainValue) {
		this.remainValue = remainValue;
	}

	/**
	 * @return the useUp
	 */
	public boolean isUseUp() {
		return useUp;
	}

	/**
	 * @param useUp the useUp to set
	 */
	public void setUseUp(boolean useUp) {
		this.useUp = useUp;
	}

	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "Energy [energyId=" + energyId + ", ownUserId=" + ownUserId + ", createTime=" + createTime.toLocaleString()
				+ ", initValue=" + initValue + ", remainValue=" + remainValue + ", useUp=" + useUp + "]";
	}
	
	
}
