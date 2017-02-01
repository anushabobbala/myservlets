package com.neoapp.web;

public class CmdLineView {
	public static void main(String[] args) throws Exception {
		Model model = new Model();
		Emp obj = model.getEmployee("2");
		if (obj != null) {
			String eno = obj.getNo();
			String ename = obj.getName();
			float esal = obj.getSalary();

			System.out.printf("Employee no=%s, name=%s, salary=%.2f", eno, ename, esal);
		}
	}
}