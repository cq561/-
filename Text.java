package shiyan;

import java.text.SimpleDateFormat;
import java.util.Date;

import shiyan.Course;
import shiyan.Student;
import shiyan.Teacher;
public class Text {
	public static void main(String[] args) {
		Student a = new Student();
		Teacher b = new Teacher();
		Course c= new Course();
		SimpleDateFormat df = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");//设置日期格式
		String mName = a.getName();
		int mId = a.getId();
		String mSex = a.getSex();		
		mName = a.getName();
		mId = a.getId();
		mSex = a.getSex();
		int teacherid=b.getId();
		String teachername = b.getName();
		String teachercourse =b.getInstruction();		
		teachername = b.getName();
		teacherid=b.getId();
		teachercourse=b.getInstruction();
		int courseid =c.getId();
		String coursename =c.getName();
		String courseplace =c.getPalce();
		String courseteacher=c.getTeacher();
		String mCourse = a.getCourse();
		courseid =c.getId();
		coursename =c.getName();
		courseplace =c.getPalce();
		courseteacher=c.getTeacher();
		a.setId(123);
		a.setName("李四");
		a.setSex("男");
		b.setId(123);
		b.setName("王一");
		b.setInstruction("java授课老师");
		c.setId(123);
		c.setName("离散数学");
		c.setPalce("教学3-206号楼");
		c.setTeacher("张三");		
		System.out.println("学生选课系统");
		System.out.println("学号 is : " + mId);
		System.out.println("姓名  : " + mName);
		System.out.println("性别  :" + mSex);
		a.setCourse("java");		
		System.out.println("课程  :" + mCourse);
		System.out.println("老师  is :"+teacherid);
		System.out.println("老师名字  ："+teachername);
		System.out.println("老师课程:"+teachercourse);
		System.out.println("课程 id :"+courseid);
		System.out.println("课程 :"+coursename);
		System.out.println("上课地点 :"+courseplace);
		System.out.println("时间 :"+df.format(new Date()));
		System.out.println("讲课老师名字 :"+courseteacher);

	
       
	}
}
