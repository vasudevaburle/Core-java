package com.tns.inheritance;

public class Activa extends Bullet{
	private long maxspeed;
// set getters and setters
	
	public long getMaxspeed() {
		return maxspeed;
	}

	public void setMaxspeed(long maxspeed) {
		this.maxspeed = maxspeed;
	}

	@Override
	public String toString() {
		return "Activa [maxspeed=" + maxspeed + "]";
	}

	public void setCompanyName(String string) {
		// TODO Auto-generated method stub
		
	}

}