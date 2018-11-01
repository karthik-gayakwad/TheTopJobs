package com.topjobs.TopJobs.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.topjobs.TopJobs.Employeer;
import com.topjobs.TopJobs.EmployeerService;

@RestController
public class JBController {
	

	@Autowired
	private EmployeerService es;
	@RequestMapping("/TTD")
	public String Hello(){
		return "TTD";
	}
	@RequestMapping("/employeers")
		public List<Employeer> getAllEmplyeers(){
			return es.getAllEmplyeers();
		}
	@RequestMapping("/getemployeer/{name}")
	public Employeer getEmployeer(@PathVariable String name){
		return es.getEmployeer(name);
	}
	@RequestMapping("/validateemployeer/{email}/{pw}")
	public String validate(@PathVariable String email,@PathVariable String pw){
		return es.validatepw(email,pw);
	}
	@RequestMapping(method=RequestMethod.POST,value="/addemployeer")
	public void addEmployeer(@RequestBody Employeer employeer){
		es.addEmployeer(employeer);
	}
	@RequestMapping(method=RequestMethod.PUT,value="/upemployeer/{name}")
	public void updateEmployeer(@RequestBody Employeer employeer,@PathVariable String name){
		es.updateEmployeer(name,employeer);
	}
	@RequestMapping(method=RequestMethod.DELETE,value="/employeer/{email}")
	public void deleteEmployeers(@PathVariable String email){
		es.deleteEmployeer(email);
	}
}
