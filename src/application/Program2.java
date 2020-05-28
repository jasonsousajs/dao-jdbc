package application;

import java.util.List;
import java.util.Scanner;

import model.dao.DaoFactory;
import model.dao.DepartmentDao;
import model.entities.Department;

public class Program2 {

	public static void main(String[] args) {
		
		DepartmentDao departmentDao = DaoFactory.createDepartmentDao();
		Scanner sc = new Scanner(System.in);
		
		System.out.println("=== TEST 1: department findById ===");
		Department department = departmentDao.findById(2);
		System.out.println(department);
		
		
		System.out.println("\n=== TEST 2: department findAll ===");
		List<Department> list = departmentDao.findAll();
		for (Department obj : list) {
			System.out.println(obj);
		}
		
		System.out.println("\n=== TEST 3 department Insert ===");
		Department newDepartment = new Department(null, "IT");
		departmentDao.insert(newDepartment);
		System.out.println("Inserted! New id = " + newDepartment.getId());
		
		System.out.println("\n=== TEST 4 department Update ===");
		department = departmentDao.findById(1);
		department.setName("Dept Factory");
		departmentDao.update(department);
		System.out.println("Updat completed!");
		
		System.out.println("\n=== TEST 6 department Delete ===");
		System.out.print("Enter if for delete teste: ");
		int id = sc.nextInt();
		departmentDao.deleteById(id);
		System.out.println("Delete completed");
		
		sc.close();
		
		

	}

}
