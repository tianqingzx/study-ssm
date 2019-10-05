package com.zx.pojo;

public class User {

	private long userId;
	private String nickName;
	private String headPortrait;
	private int energy;

	@Override
	public String toString() {
		return "User [userId=" + userId + ", nickName=" + nickName + ", headPortrait=" + headPortrait + ", energy="
				+ energy + "]";
	}

	public long getUserId() {
		return userId;
	}

	public void setUserId(Long userId) {
		this.userId = userId;
	}

	public String getNickName() {
		return nickName;
	}

	public void setNickName(String nickName) {
		this.nickName = nickName;
	}

	public String getHeadPortrait() {
		return headPortrait;
	}

	public void setHeadPortrait(String headPortrait) {
		this.headPortrait = headPortrait;
	}

	public int getEnergy() {
		return energy;
	}

	public void setEnergy(int energy) {
		this.energy = energy;
	}

}
