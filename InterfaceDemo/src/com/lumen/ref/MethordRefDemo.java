package com.lumen.ref;

import java.util.Arrays;
import java.util.List;

interface AreaClaculator {

	void calcArea(double x, double y);
}

interface NameChecker{
	String checkName(String name);
}
interface CourseDetail{
	List<String> showCourse();
	
}


class Shape{
	public void rectangleArea(double x,double y) {
		System.out.println("Rect "+(x*y));
	}
	public static void triArea(double x,double y) {
		System.out.println(0.5*x*y);
	}
}


class Details{
	String showName(String name) {
		if(name.equals("yash"))
			return "Hello "+name; 
		return name;
		
	}
}
class course{
	String CorseName;

	@Override
	public String toString() {
		return "course [CorseName=" + CorseName + "]";
	}
	
}

public class MethordRefDemo {

	public static void main(String[] args) {
		AreaClaculator areaClaculator = (x,y)->System.out.println(x*y);
		areaClaculator.calcArea(10, 20);
		
//		referring methord
		Shape myShape = new Shape();
		AreaClaculator areaClaculator1 = myShape::rectangleArea;
		areaClaculator1.calcArea(20, 70);
		
		Details details = new Details();
		NameChecker nameChecker = details::showName;
		System.out.println(nameChecker.checkName("Yash"));
		
		
//		refering to the static methord
//		areaClaculator1
		CourseDetail courseDetail = ()->Arrays.asList("java","c++","python");
		courseDetail.showCourse().forEach(course->System.out.println(course));
		
	}

}
