package studentNote;

public class Student {
	private String name;
	private String address;
	private String phoneNumber;
	private String weChat;
	private String mail;
	private String QQ;
	private String personalLanguage;
	
	public void initStudent(String n,String a,String phone,String w,String m,
			String q,String per)
	{
		name = n;
		address = a;
		phoneNumber = phone;
		weChat = w;
		mail = m;
		QQ = q;
		personalLanguage = per;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public String getPhoneNumber() {
		return phoneNumber;
	}
	public void setPhoneNumber(String phoneNumber) {
		this.phoneNumber = phoneNumber;
	}
	public String getWeChat() {
		return weChat;
	}
	public void setWeChat(String weChat) {
		this.weChat = weChat;
	}
	public String getMail() {
		return mail;
	}
	public void setMail(String mail) {
		this.mail = mail;
	}
	public String getQQ() {
		return QQ;
	}
	public void setQQ(String qQ) {
		QQ = qQ;
	}
	public String getPersonalLanguage() {
		return personalLanguage;
	}
	public void setPersonalLanguage(String personalLanguage) {
		this.personalLanguage = personalLanguage;
	}
	
}
