package com.lumen.ref;

class Course{
	String courseName;
	void show() {
		System.out.println("Showing course");
	}
}
interface CourseDetails{
	Course getCourse();
}

public class MethRefConst {
	
	public static void main(String[] args) {
		CourseDetail courseDetail = () -> new Course();
		Course course = courseDetail.getCourse();
		course.show();
	}

}
