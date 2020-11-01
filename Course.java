package shiyan;

class Course  {
	String Name;
	int id;
	String palce;
	String teacher;
    public String getName() {
		return Name;
	}
	public void setName(String name) {
		Name = name;
	}
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getPalce() {
		return palce;
	}
	public void setPalce(String palce) {
		this.palce = palce;
	}
	
	public String getTeacher() {
		return teacher;
	}
	public void setTeacher(String teacher) {
		this.teacher = teacher;
	}
}