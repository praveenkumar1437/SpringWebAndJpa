package org.zensar.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.zensar.entity.Employee;

@Controller
@RequestMapping(path = "/emp")
public class EmployeeFormController {

	@RequestMapping(method = RequestMethod.GET)
	public String homePage() {

		return "homepage";
	}

	@RequestMapping(method = RequestMethod.GET, path = "/addemp")
	public String addEmp(Model model) {

		model.addAttribute("employee", new Employee());

		return "addemp";
	}

	@RequestMapping(method = RequestMethod.GET, path = "/updateemp")
	public String updateemp() {
		return "updateemp";
	}

	@RequestMapping(method = RequestMethod.GET, path = "/searchemp")
	public String searchemp() {
		return "searchemp";
	}

	@RequestMapping(method = RequestMethod.GET, path = "/deleteemp")
	public String deleteemp() {
		return "deleteemp";
	}
}
