package com.wayen.pmis.controllers;

import com.wayen.pmis.common.ResponseData;
import com.wayen.pmis.doo.Employee;
import com.wayen.pmis.mapper.EmployeeMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;


@Controller
@RequestMapping("/emp")
public class EmployeeController {
    @Autowired
    private EmployeeMapper empMp;

    @RequestMapping(value = "list",method = RequestMethod.GET)
    @ResponseBody
    public ResponseData<Employee> list(@RequestBody String ddd){
        ResponseData<Employee> resp= new ResponseData<Employee>();
        resp.setData(empMp.query());
        resp.setStatus(200);
        resp.setMessage("hello");
        return resp;
    }

    @RequestMapping(value = "create",method = RequestMethod.POST)
    @ResponseBody
    public ResponseData<Employee> create(@RequestBody Employee emp){
        ResponseData<Employee> resp= new ResponseData<Employee>();
        resp.setStatus(200);
        empMp.create(emp);
        return resp;
    }
}
