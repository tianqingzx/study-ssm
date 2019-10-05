package com.zx.pojo;

import java.util.Date;

public class Friend {
	private long srcUserId;
	private long destUserId;
	private Date friendTime;
	
	public Friend() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Friend(long srcUserId, long destUserId, Date friendTime) {
		super();
		this.srcUserId = srcUserId;
		this.destUserId = destUserId;
		this.friendTime = friendTime;
	}
	/**
	 * @return the srcUserId
	 */
	public long getSrcUserId() {
		return srcUserId;
	}
	/**
	 * @param srcUserId the srcUserId to set
	 */
	public void setSrcUserId(long srcUserId) {
		this.srcUserId = srcUserId;
	}
	/**
	 * @return the destUserId
	 */
	public long getDestUserId() {
		return destUserId;
	}
	/**
	 * @param destUserId the destUserId to set
	 */
	public void setDestUserId(Long destUserId) {
		this.destUserId = destUserId;
	}
	/**
	 * @return the friendTime
	 */
	public Date getFriendTime() {
		return friendTime;
	}
	/**
	 * @param friendTime the friendTime to set
	 */
	public void setFriendTime(Date friendTime) {
		this.friendTime = friendTime;
	}
	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "Friend [srcUserId=" + srcUserId + ", destUserId=" + destUserId + ", friendTime=" + friendTime.toLocaleString() + "]";
	}
	

}
