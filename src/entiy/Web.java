package entiy;

import java.sql.Date;

public class Web {
	private int id;
	private String name;
	private Date birthday;
	private String sex;
	private String work;
	private String address;
	private String phone;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Date getBirthday() {
		return birthday;
	}
	public void setBirthday(Date birthday) {
		this.birthday = birthday;
	}
	public String getSex() {
		return sex;
	}
	public void setSex(String sex) {
		this.sex = sex;
	}
	public String getWork() {
		return work;
	}
	public void setWork(String work) {
		this.work = work;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public String getPhone() {
		return phone;
	}
	public void setPhone(String phone) {
		this.phone = phone;
	}
	
	public Web() {}
	
	public Web(int id, String name, Date birthday, String sex, String work, String address, String phone) {
		this.id = id;
		this.name = name;
		this.birthday = birthday;
		this.sex = sex;
		this.work = work;
		this.address = address;
		this.phone = phone;
	}
	public Web(String name, Date birthday, String sex, String work, String address, String phone,int id) {
		this.id = id;
		this.name = name;
		this.birthday = birthday;
		this.sex = sex;
		this.work = work;
		this.address = address;
		this.phone = phone;
	}
	public Web(String name, Date birthday, String sex, String work, String address, String phone) {
		this.name = name;
		this.birthday = birthday;
		this.sex = sex;
		this.work = work;
		this.address = address;
		this.phone = phone;
	}
	

}
