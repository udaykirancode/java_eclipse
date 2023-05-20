package kiran1;

public class assignment {
	int id;
	String name;
	String mailid;
	long phNo;
	assignment(int id,String name){
		this.id=id;
		this.name=name;
		
	}
	assignment(String mailid,long phnno){
		this.mailid=mailid;
		this.phNo=phnno;
	}
	public static void dis1() {
		assignment u=new assignment(890,"uday");
		System.out.println(u.id+" "+ u.name);
	}
	public static void dis2() {
		assignment u=new assignment("uday@gmail.com",7731923290l);
		System.out.println(u.mailid+" " +u.phNo);
	}

	public static void main(String[] args) {
		dis1();
		dis2();

	}

}
