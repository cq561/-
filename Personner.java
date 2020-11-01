package shiyan;

public class Personner {
	static int id;
	static String name;
	static String sex;
	static String course;
	public Personner(int id,String name,String sex) {
		this.id=id;
		this.name=name;
		this.sex=sex;
	}
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
		public String getSex() {
			return sex;
		}
		public void setSex(String sex) {
			this.sex = sex;
		}		
		public String getCourse() {
			return course;
		}

		public void setCourse(String course) {
			this.course = course;
		}

 }
	
	
