### 计G202 陈庆 2020322100
# -
# 选课系统
## 一，实验目的
初步了解分析系统需求，从学生选课角度了解系统中的实体及其关系，学会定义类中的属性以及方法；  
掌握面向对象的类设计方法（属性、方法）;    
掌握类的继承用法，通过构造方法实例化对象；  
学会使用super()，用于实例化子类；  
掌握使用Object根类的toString（）方法,应用在相关对象的信息输出中。
## 二,实验要求
1.编写上述实体类以及测试主类（注意类之间继承关系的适用）  
2.在测试主类中，实例化多个类实体，模拟学生选课操作、打印课程信息（信息包括：编号、课程名称、上课地点、时间、授课教师 等）；模拟学生退课操作，再打印课程信息。
## 三,实验流程

## 四，核心代码
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
## 五 实验结果
![image](https://github.com/cq561/-/blob/main/1.png)
## 六, 编程感想
此次实验比较难 自己没有单独完成的能力，借鉴了同学的部分代码和网上的知识，但还是没有达到自己想要的地步，好多功能还是不能实现。对于super的继承有了更深的认识，也希望在下一步的实验中能够运用到这些知识。
