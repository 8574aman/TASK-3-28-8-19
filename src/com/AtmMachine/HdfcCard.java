package com.AtmMachine;

public class HdfcCard  implements AtmCards {
	public void withdraw(){
		System.out.println("Money withdraw successfully from HDFC");
		}
		public void deposit(){
		System.out.println("Money Deposit successfully to HDFC");
		}
		public void viewStatement(){
		System.out.println("Your transactions till now in HDFC");
		}
		public void changePassword(){
		System.out.println("Password Updated successfully in HDFC");
		}

		}
