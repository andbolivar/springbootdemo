package com.howtodoinjava.demo.model;

public class Employee {

	public Employee() {
		
	}
	public Employee(String macAddress, String datautc, String datea, int winddir, String windspeedmph, int windgusmph, String maxdailygus, String windgustdir, String tempf, String humidity, String dewpoint) {
		super();
		this.macAddress = macAddress;
		this.datautc = datautc;
		this.datea = datea;
		this.winddir = winddir;
		this.windspeedmph = windspeedmph;
		this.windgusmph = windgusmph;
		this.maxdailygust = maxdailygus;
		this.windgustdir = windgustdir;
		this.tempf = tempf;
		this.humidity = humidity;
		this.dewpoint = dewpoint;
	}
	
	private String macAddress;
	private String datautc;
	private String datea;
	private int winddir;
	private String windspeedmph;
	private int windgusmph;
	private String maxdailygust;
	private String windgustdir;
	private String tempf;
	private String humidity;
	private String dewpoint;

	public String getMacAddress() { return macAddress;}
	public void setMacAddress(String macAddress){this.macAddress = macAddress;}
	public String getDatautc() {return datautc;}
	public void setDatautc(String datautc){this.datautc=datautc;}




	@Override
	public String toString() {
		return "Device [macAddress=" + macAddress + ", dateutc=" + datautc
				+ ", date=" + datea + ", winddir=" + winddir + ", windspeedmph=" + windspeedmph
				+ ", windgustmph=" + windgusmph
				+ ", maxdailygust=" + maxdailygust
				+ ", windgustdir=" + windgustdir
				+ ", tempf=" + tempf
				+ ", humidity=" + humidity
				+ ", dewPoint=" + dewpoint
				+ "]";
	}

	public int getWinddir() {
		return winddir;
	}

	public void setWinddir(int winddir) {
		this.winddir = winddir;
	}

	public String getDatea() {
		return datea;
	}

	public void setDatea(String datea) {
		this.datea = datea;
	}

	public String getWindspeedmph() {
		return windspeedmph;
	}

	public void setWindspeedmph(String windspeedmph) {
		this.windspeedmph = windspeedmph;
	}

	public int getWindgusmph() {
		return windgusmph;
	}

	public void setWindgusmph(int windgusmph) {
		this.windgusmph = windgusmph;
	}

	public String getMaxdailygust() {
		return maxdailygust;
	}

	public void setMaxdailygust(String maxdailygust) {
		this.maxdailygust = maxdailygust;
	}

	public String getWindgustdir() {
		return windgustdir;
	}

	public void setWindgustdir(String windgustdir) {
		this.windgustdir = windgustdir;
	}

	public String getTempf() {
		return tempf;
	}

	public void setTempf(String tempf) {
		this.tempf = tempf;
	}

	public String getHumidity() {
		return humidity;
	}

	public void setHumidity(String humidity) {
		this.humidity = humidity;
	}

	public String getDewpoint() {
		return dewpoint;
	}

	public void setDewpoint(String dewpoint) {
		this.dewpoint = dewpoint;
	}
}
