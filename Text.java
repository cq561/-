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
		SimpleDateFormat df = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");//�������ڸ�ʽ
		String mName = a.getName();
		int mId = a.getId();
		String mSex = a.getSex();
		a.setId(123);
		a.setName("����");
		a.setSex("��");
		mName = a.getName();
		mId = a.getId();
		mSex = a.getSex();
		int teacherid=b.getId();
		String teachername = b.getName();
		String teachercourse =b.getInstruction();
		b.setId(123);
		b.setName("��һ");
		b.setInstruction("java�ڿ���ʦ");
		teachername = b.getName();
		teacherid=b.getId();
		teachercourse=b.getInstruction();
		int courseid =c.getId();
		String coursename =c.getName();
		String courseplace =c.getPalce();
		String courseteacher=c.getTeacher();
		String mCourse = a.getCourse();
		c.setId(123);
		c.setName("��ɢ��ѧ");
		c.setPalce("��ѧ3-206��¥");
		c.setTeacher("����");
		courseid =c.getId();
		coursename =c.getName();
		courseplace =c.getPalce();
		courseteacher=c.getTeacher();
		System.out.println("ѧ��ѡ��ϵͳ");
		System.out.println("ѧ�� is : " + mId);
		System.out.println("����  : " + mName);
		System.out.println("�Ա�  :" + mSex);
		a.setCourse("java");		
		System.out.println("�γ�  :" + mCourse);
		System.out.println("��ʦ  is :"+teacherid);
		System.out.println("��ʦ����  ��"+teachername);
		System.out.println("��ʦ�γ�:"+teachercourse);
		System.out.println("�γ� id :"+courseid);
		System.out.println("�γ� :"+coursename);
		System.out.println("�Ͽεص� :"+courseplace);
		System.out.println("ʱ�� :"+df.format(new Date()));
		System.out.println("������ʦ���� :"+courseteacher);

	
       
	}
}
