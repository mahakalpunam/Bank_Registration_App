package bank.model;

public class Register {
	private int accnumber;
	private String accFname;
	private String accUname;
	private String accPasword;
	private float accBal;
	
	public Register() {
		
	}

	public Register(int accnumber, String accFname, String accUname, String accPasword, float accBal) {
		super();
		this.accnumber = accnumber;
		this.accFname = accFname;
		this.accUname = accUname;
		this.accPasword = accPasword;
		this.accBal = accBal;
	}

	public int getAccnumber() {
		return accnumber;
	}

	public void setAccnumber(int accnumber) {
		this.accnumber = accnumber;
	}

	public String getAccFname() {
		return accFname;
	}

	public void setAccFname(String accFname) {
		this.accFname = accFname;
	}

	public String getAccUname() {
		return accUname;
	}

	public void setAccUname(String accUname) {
		this.accUname = accUname;
	}

	public String getAccPasword() {
		return accPasword;
	}

	public void setAccPasword(String accPasword) {
		this.accPasword = accPasword;
	}

	public float getAccBal() {
		return accBal;
	}

	public void setAccBal(float accBal) {
		this.accBal = accBal;
	}
	
	
	

}
