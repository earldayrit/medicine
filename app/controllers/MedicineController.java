package controllers;

import java.util.List;

import com.google.common.collect.Lists;

import models.Medicine;
import play.data.Form;
import play.mvc.Controller;
import play.mvc.Result;

public class MedicineController extends Controller{
	
	public static Result getMedicine(){
		Medicine meds = new Medicine();
//		List<Medicine> medicines = Medicine.medicineDao().findAll();
		return TODO; //create view for meds
	}
	
	public static Result setMedicine(){
//		Medicine medicine = Form.form(Medicine.class).bindFromRequest().get();
    	//insert function
		return TODO; //create view for meds
	}

}
