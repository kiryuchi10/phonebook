package himedia.phonebook.repositories.vo;

public class PhonebookVo {
//	id NUMBER(10) PRIMARY KEY,
//    name VARCHAR2(10),
//    hp VARCHAR2(20),
//    tel VARCHAR2(20)
	private Integer id;
	private String name;
	private String hp;
	private String tel;
	public PhonebookVo() {
	}
	public PhonebookVo(String name, String hp, String tel) {
		super();
		this.name = name;
		this.hp = hp;
		this.tel = tel;
	}
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getHp() {
		return hp;
	}
	public void setHp(String hp) {
		this.hp = hp;
	}
	public String getTel() {
		return tel;
	}
	public void setTel(String tel) {
		this.tel = tel;
	}
	@Override
	public String toString() {
		return "PhonebookVo [id=" + id + ", name=" + name + ", hp=" + hp + ", tel=" + tel + "]";
	}
	
	
}
