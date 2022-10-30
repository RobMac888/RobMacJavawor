package com.qa;//long code - can use maven dependency to reduce

import java.util.Objects;
import javax.validation.constraints.NotNull;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.RequiredArgsConstructor;
import lombok.Setter;
import lombok.ToString;


@NoArgsConstructor
@AllArgsConstructor
//@Getter
//@Setter
//@Equalsandhashcode
//@String
@Data
//@required constric

public class Computer {
	private int ID;
	private String brand;
	private String cpu;
	private int RAM;
	private float price;
	private int storage;
	private String OS;
	private String graphiccard;
	private int noOfProc;
	private float weight;
	private int size;
	@NotNull
	private float battery;
	private int noOfPort;
	private boolean HDMI;
	
	private String resolution;  //attributes - may be 50 or so
	public int getID() {
		return ID;
	}
	public void setID(int iD) {
		ID = iD;
	}
	public String getBrand() {
		return brand;
	}
	public void setBrand(String brand) {
		this.brand = brand;
	}
	public String getCpu() {
		return cpu;
	}
	public void setCpu(String cpu) {
		this.cpu = cpu;
	}
	public int getRAM() {
		return RAM;
	}
	public void setRAM(int rAM) {
		RAM = rAM;
	}
	public float getPrice() {
		return price;
	}
	public void setPrice(float price) {
		this.price = price;
	}
	public int getStorage() {
		return storage;
	}
	public void setStorage(int storage) {
		this.storage = storage;
	}
	public String getOS() {
		return OS;
	}
	public void setOS(String oS) {
		OS = oS;
	}
	public String getGraphiccard() {
		return graphiccard;
	}
	public void setGraphiccard(String graphiccard) {
		this.graphiccard = graphiccard;
	}
	public int getNoOfProc() {
		return noOfProc;
	}
	public void setNoOfProc(int noOfProc) {
		this.noOfProc = noOfProc;
	}
	public float getWeight() {
		return weight;
	}
	public void setWeight(float weight) {
		this.weight = weight;
	}
	public int getSize() {
		return size;
	}
	public void setSize(int size) {
		this.size = size;
	}
	public float getBattery() {
		return battery;
	}
	public void setBattery(float battery) {
		this.battery = battery;
	}
	public int getNoOfPort() {
		return noOfPort;
	}
	public void setNoOfPort(int noOfPort) {
		this.noOfPort = noOfPort;
	}
	public boolean isHDMI() {
		return HDMI;
	}
	public void setHDMI(boolean hDMI) {
		HDMI = hDMI;
	}
	public String getResolution() {
		return resolution;
	}
	public void setResolution(String resolution) {
		this.resolution = resolution;
	}
	public Computer(int iD, String brand, String cpu, int rAM, float price, int storage, String oS, String graphiccard,
			int noOfProc, float weight, int size, float battery, int noOfPort, boolean hDMI, String resolution) {
		super();
		ID = iD;
		this.brand = brand;
		this.cpu = cpu;
		RAM = rAM;
		this.price = price;
		this.storage = storage;
		OS = oS;
		this.graphiccard = graphiccard;
		this.noOfProc = noOfProc;
		this.weight = weight;
		this.size = size;
		this.battery = battery;
		this.noOfPort = noOfPort;
		HDMI = hDMI;
		this.resolution = resolution;
	}
	@Override
	public int hashCode() {
		return Objects.hash(HDMI, ID, OS, RAM, battery, brand, cpu, graphiccard, noOfPort, noOfProc, price, resolution,
				size, storage, weight);
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Computer other = (Computer) obj;
		return HDMI == other.HDMI && ID == other.ID && Objects.equals(OS, other.OS) && RAM == other.RAM
				&& Float.floatToIntBits(battery) == Float.floatToIntBits(other.battery)
				&& Objects.equals(brand, other.brand) && Objects.equals(cpu, other.cpu)
				&& Objects.equals(graphiccard, other.graphiccard) && noOfPort == other.noOfPort
				&& noOfProc == other.noOfProc && Float.floatToIntBits(price) == Float.floatToIntBits(other.price)
				&& Objects.equals(resolution, other.resolution) && size == other.size && storage == other.storage
				&& Float.floatToIntBits(weight) == Float.floatToIntBits(other.weight);
	}
}
/*@NoArgsConstructor
@AllArgsConstructor
//@Getter
//@Setter
//@EqualsAndHashCode
//@ToString
@Data
//@RequiredArgsConstructor
public class Computer {
	private int Id;
	private String brand;
	private String cpu;
	private int RAM;
	private float price;
	private int storage;
	private String OS;
	private String graphicCard;
	private int noOfProc;
	private float weight;
	private int size;
	@NotNull
	private float battery;
	private int noOfPorts;
	private boolean HDMI;
	
	private String resolution;
	private final String typeOfKeyboard="wired";
}
*/