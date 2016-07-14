package webcontroller;

import java.util.List;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import model.Employee;
import service.EmployeeDAO;


@Controller
public class RequestMappingController {
     
//	@Autowired
//    private VocabDAO vocabDao;
	
	@Autowired
	private EmployeeDAO employeeDao;
	
    @RequestMapping("/")
    public ModelAndView handleRequest() throws Exception {
    	
//        List<Vocab> listVocabs = vocabDao.getListVocab();
//        ModelAndView model = new ModelAndView("home");
//        model.addObject("vocabList", listVocabs);

        List<Employee> listEmployees = employeeDao.getListEmployees();
        ModelAndView model = new ModelAndView("list_employees");
        model.addObject("employeeList",listEmployees);
        
        return model;
    }
    
    @RequestMapping(value={"/addOrEditEmployee","/viewEditEmployee/addOrEditEmployee"},method = RequestMethod.POST)
    public ModelAndView addOrEditEmployee( @Valid @ModelAttribute("emp")Employee emp, BindingResult result,ModelMap model)  {
    		
    		if (result.hasErrors()) {
    			return new ModelAndView("employee_form","emp",emp);
    		}
    		
    	employeeDao.addOrEditNewEmployee(emp);
    	return new ModelAndView("redirect:/");
    }
    
    
    @RequestMapping(value="/viewNewEmployee",method={RequestMethod.GET})
    public String viewNewEmployee(ModelMap model) throws Exception {
    	model.addAttribute("emp",new Employee());
    		
    	return "employee_form";
    }
    
    @RequestMapping(value="/viewEditEmployee/{num}",method={RequestMethod.GET})
    public ModelAndView viewEditEmployee(@PathVariable String num) throws Exception {
    	
    	Employee emp = employeeDao.getEmployeeByNumber(num);
    	return  new ModelAndView("employee_form", "emp",  emp);
    }
    
    
    @RequestMapping(value="/deleteEmployee/{num}",method={RequestMethod.GET})
    public ModelAndView deleteEmployee(@PathVariable("num")String num) throws Exception {
    	
    	Employee emp = employeeDao.getEmployeeByNumber(num);	
    	employeeDao.delectEmployee(emp);
    	return new ModelAndView("redirect:/");
    }
}