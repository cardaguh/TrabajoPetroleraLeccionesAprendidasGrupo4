package com.javabycode.springmvc.controller;

import java.util.List;
import java.util.Locale;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.MessageSource;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.validation.BindingResult;
import org.springframework.validation.FieldError;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.javabycode.springmvc.model.Student;
import com.javabycode.springmvc.service.StudentService;

import com.javabycode.springmvc.service.EmpleadoService;
import com.javabycode.springmvc.model.Empleado;

import com.javabycode.springmvc.model.Incidente;

@Controller
@RequestMapping("/")
public class MyController {

	@Autowired
	StudentService service;
	
	@Autowired
	MessageSource messageSource;
	
	@RequestMapping(value = { "/", "/menu" }, method = RequestMethod.GET)
	public String menu(ModelMap model) {

		return "menu";
	}

	/*
	 * List all existing Students.
	 */
	@RequestMapping(value = {"/list" }, method = RequestMethod.GET)
	public String listStudents(ModelMap model) {

		List<Student> students = service.findAllStudents();
		model.addAttribute("students", students);
		return "allstudents";
	}

	/*
	 * Add a new Student.
	 */
	@RequestMapping(value = { "/new" }, method = RequestMethod.GET)
	public String newStudent(ModelMap model) {
		Student student = new Student();
		model.addAttribute("student", student);
		model.addAttribute("edit", false);
		return "registration";
	}

	/*
	 * Handling POST request for validating the user input and saving Student in database.
	 */
	@RequestMapping(value = { "/new" }, method = RequestMethod.POST)
	public String saveStudent(@Valid Student student, BindingResult result,
			ModelMap model) {

		if (result.hasErrors()) {
			return "registration";
		}
		
		if(!service.isStudentCodeUnique(student.getId(), student.getCode())){
			FieldError codeError =new FieldError("Student","code",messageSource.getMessage("non.unique.code", new String[]{student.getCode()}, Locale.getDefault()));
		    result.addError(codeError);
			return "registration";
		}
		
		service.saveStudent(student);

		model.addAttribute("success", "El proveedor " + student.getName() + " ha sido registrado exitosamente");
		return "success";
	}


	/*
	 * Provide the existing Student for updating.
	 */
	@RequestMapping(value = { "/edit-{code}-student" }, method = RequestMethod.GET)
	public String editStudent(@PathVariable String code, ModelMap model) {
		Student student = service.findStudentByCode(code);
		model.addAttribute("student", student);
		model.addAttribute("edit", true);
		return "registration";
	}
	
	/*
	 * Handling POST request for validating the user input and updating Student in database.
	 */
	@RequestMapping(value = { "/edit-{code}-student" }, method = RequestMethod.POST)
	public String updateStudent(@Valid Student student, BindingResult result,
			ModelMap model, @PathVariable String code) {

		if (result.hasErrors()) {
			return "registration";
		}

		if(!service.isStudentCodeUnique(student.getId(), student.getCode())){
			FieldError codeError =new FieldError("Student","code",messageSource.getMessage("non.unique.code", new String[]{student.getCode()}, Locale.getDefault()));
		    result.addError(codeError);
			return "registration";
		}

		service.updateStudent(student);

		model.addAttribute("success", "El proveedor " + student.getName()	+ " ha sido actualizado exitosamente");
		return "success";
	}

	
	/*
	 * Delete an Student by it's CODE value.
	 */
	@RequestMapping(value = { "/delete-{code}-student" }, method = RequestMethod.GET)
	public String deleteStudent(@PathVariable String code) {
		service.deleteStudentByCode(code);
		return "redirect:/list";
	}
	
	
	// Controlador de empleado
	
	@Autowired
	EmpleadoService serviceEmpleado;
	

	/*
	 * List all existing Empleados.
	 */
	@RequestMapping(value = {"/list-empleados" }, method = RequestMethod.GET)
	public String listEmpleados(ModelMap model) {

		List<Empleado> empleados = serviceEmpleado.findAllEmpleados();
		model.addAttribute("empleados", empleados);
		return "allempleados";
	}

	/*
	 * Add a new Empleado.
	 */
	@RequestMapping(value = { "/new-empleado" }, method = RequestMethod.GET)
	public String newEmpleado(ModelMap model) {
		Empleado empleado = new Empleado();
		model.addAttribute("empleado", empleado);
		model.addAttribute("edit", false);
		return "registrationempleados";
	}

	/*
	 * Handling POST request for validating the user input and saving Empleado in database.
	 */
	@RequestMapping(value = { "/new-empleado" }, method = RequestMethod.POST)
	public String saveEmpleado(@Valid Empleado empleado, BindingResult result,
			ModelMap model) {

		if (result.hasErrors()) {
			return "registrationempleados";
		}
		
		System.out.println(result);
		
		/*if(!service.isEmpleadoCodeUnique(empleado.getId(), empleado.getId())){
			FieldError codeError =new FieldError("Empleado","code",messageSource.getMessage("non.unique.code", new String[]{empleado.getId()}, Locale.getDefault()));
		    result.addError(codeError);
			return "registration";
		}*/
		
		serviceEmpleado.saveEmpleado(empleado);

		model.addAttribute("success", "Empleado " + empleado.getNombres() + " registered successfully");
		return "success";
	}


	/*
	 * Provide the existing Empleado for updating.
	 */
	@RequestMapping(value = { "/edit-{id}-empleado" }, method = RequestMethod.GET)
	public String editEmpleado(@PathVariable String code, ModelMap model) {
		Student student = service.findStudentByCode(code);
		model.addAttribute("student", student);
		model.addAttribute("edit", true);
		return "registration";
	}
	
	/*
	 * Handling POST request for validating the user input and updating Empleado in database.
	 */
	@RequestMapping(value = { "/edit-{code}-empleado" }, method = RequestMethod.POST)
	public String updateEmpleado(@Valid Empleado empleado, BindingResult result,
			ModelMap model, @PathVariable String code) {

		if (result.hasErrors()) {
			return "registration";
		}

		if(!serviceEmpleado.isEmpleadoCodeUnique(empleado.getId(), empleado.getNombres())){
			FieldError codeError =new FieldError("Empleado","code",messageSource.getMessage("non.unique.code", new String[]{empleado.getNombres()}, Locale.getDefault()));
		    result.addError(codeError);
			return "registration";
		}

		serviceEmpleado.updateEmpleado(empleado);

		model.addAttribute("success", "Empleado " + empleado.getNombres()	+ " updated successfully");
		return "success";
	}

	
	/*
	 * Delete an Student by it's CODE value.
	 */
	@RequestMapping(value = { "/delete-{code}-empleado" }, method = RequestMethod.GET)
	public String deleteEmpleado(@PathVariable String code) {
		serviceEmpleado.deleteEmpleadoByCode(code);
		return "redirect:/list-empleados";
	}
	
	
	// Menu principal para agregar navegacion a las vistas
	
	@RequestMapping(value = {"/new-incidente" }, method = RequestMethod.GET)
	public String incidente(ModelMap model) {
		Incidente incidente = new Incidente();
		model.addAttribute("incidente", incidente);
		model.addAttribute("edit", false);
		return "registrationincidentes";
	}
	
	@RequestMapping(value = {"/new-leccion" }, method = RequestMethod.GET)
	public String leccion(ModelMap model) {

		return "registrationlecciones";
	}
	
	@RequestMapping(value = {"/new-notificacion" }, method = RequestMethod.GET)
	public String notificacion(ModelMap model) {

		return "registrationnotificaciones";
	}
	
	@RequestMapping(value = {"/new-chat" }, method = RequestMethod.GET)
	public String chat(ModelMap model) {

		return "registrationchat";
	}

}
