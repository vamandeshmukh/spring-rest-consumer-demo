package spring.rest.consumer.demo.client;

import java.util.List;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import spring.rest.consumer.demo.model.Employee;

@FeignClient(value = "empClient", url = "http://localhost:9999/")
public interface EmpClient {

	@RequestMapping(method = RequestMethod.GET, value = "/emp/get-all-emps")
	List<Employee> getAllEmps();

	@RequestMapping(method = RequestMethod.GET, value = "/emp/get-emp-by-id/{employeeId}", produces = "application/json")
	Employee getEmpById(@PathVariable("employeeId") int employeeId);
}