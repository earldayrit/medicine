package controllers;

import java.util.List;

import models.Employee;

import org.bson.types.ObjectId;

import dao.JongoDAO;
import play.data.Form;
import play.mvc.Controller;
import play.mvc.Result;
import views.html.employee;

public class EmployeeController extends Controller {
	
	static JongoDAO<Employee> employeeDao = new JongoDAO<>(Employee.class);
	
	 public static Result getEmployee() {
		List<Employee> employees = employeeDao.findAll();
	    return ok(employee.render("Employee List",employees));
	 }
	 
	 public static Result setEmployee() {
		Employee employee = Form.form(Employee.class).bindFromRequest().get();
		
		if(employee.getId() == null){
			employeeDao.save(employee);
		}else{
			employeeDao.update(employee.getId(), employee);
		}
		
	    return redirect(routes.EmployeeController.getEmployee());
	 }
	 
	 public static Result removeEmployee(ObjectId id) {
		employeeDao.delete(id);
		return redirect(routes.EmployeeController.getEmployee());
	 }

}
