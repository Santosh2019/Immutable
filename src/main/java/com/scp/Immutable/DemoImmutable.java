package com.scp.Immutable;
import java.util.ArrayList;
import java.util.Arrays;
final class Vendor1{
	final private int vendorId;
	private String vendorName;
	public int getVendorId() {
		return vendorId;
	}
	public String getVendorName() {
		return vendorName;
	}
	public Vendor1(int vendorId, String vendorName) {
		super();
		this.vendorId = vendorId;
		this.vendorName = vendorName;
	}
	@Override
	public String toString() {
		return " \n Vendor1: Id :" + vendorId + ", Name :" + vendorName + "";
	}
		
	
}
final class Mobile1{
	
		final private int mobilePrice;
		private String mobileName;
		Vendor1 vendor1;
		final ArrayList<Integer>listOfNums;
		public ArrayList<Integer>getInstace(){
			return new ArrayList<>(listOfNums);
			
		}
		
		public Mobile1(int mobilePrice, String mobileName, Vendor1 vendor1, ArrayList<Integer> listOfNums) {
			super();
			this.mobilePrice = mobilePrice;
			this.mobileName = mobileName;
			this.vendor1 = vendor1;
			this.listOfNums = listOfNums;
		}

		public int getMobilePrice() {
			return mobilePrice;
		}
		public String getMobileName() {
			return mobileName;
		}
		public Vendor1 getVendor1() {
			return vendor1;
		}
		//factory method 
		public static Mobile1 getInstance(int mobilePrice, String mobileName, Vendor1 vendor1, ArrayList<Integer> listOfNums) {
			return new Mobile1 (mobilePrice, mobileName, vendor1, listOfNums);
			
		}

		@Override
		public String toString() {
			return "Mobile1 [mobilePrice=" + mobilePrice + ", mobileName=" + mobileName + ", vendor1=" + vendor1
					+ ", listOfNums=" + listOfNums + "]";
		}
		
} 

public class DemoImmutable {
	public static void main(String[] args) {
		Vendor1 vendor=new Vendor1(201, "uk"); 
		ArrayList<Integer>listOfNums1=new ArrayList<>(Arrays.asList(10,20));
		Mobile1 mobile=Mobile1.getInstance(101, "Samsng", vendor , listOfNums1);
		System.out.println(mobile);	
	}
}
