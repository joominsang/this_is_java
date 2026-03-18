package com.mjc813;

import com.mjc813_2.TransJson2;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
	public static void main(String[] args) {
		Student stu = new Student("이순신", "mjc9283819", Major.InfoTelecom);
		TransJson2 tj = new TransJson2(); // com.mjc813_2.* 패키지는 외부에서 사용 불가능한 설정을 module-info.java에 했지만 상관없이 외부에서 사용 가능하게 된다.

		String strJson = tj.toJsonStringFromObject(stu);
		System.out.println(strJson);

		Object res = tj.toObjectFromJsonString(strJson, Student.class);
		if ( res instanceof Student stu2 ) {
			System.out.println(stu2);
		}
		System.out.println(tj.hashCode());
		System.out.println(res.hashCode());
	}
}