package com.yuan.controller;

import com.yuan.dao.DepartmentDao;
import com.yuan.dao.EmployeeDao;
import com.yuan.pojo.Department;
import com.yuan.pojo.Employee;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpServletRequest;
import java.util.Collection;

/**
 * @ClassName EmplController
 * @Desc TODO
 * @Author XinTai-Yuan
 * @Date 2021/7/12 10:41
 * @Version 1.0
 **/
@Controller
public class EmplController {

    @Autowired
    private EmployeeDao employeeDao;

    @Autowired
    private DepartmentDao departmentDao;

    /*
     * @param request
     * @return:java.lang.String
     * @Author XinTai-Yuan
     * @Description  查询所有员工
     * @Date 2021/7/12 10:59
     **/
    @GetMapping("/list")
    public String list(HttpServletRequest request){
        Collection<Employee> employees = employeeDao.getAll();
        request.setAttribute("employees",employees);
        return "empl/list";
    }

    /*
     * @param request
     * @return:java.lang.String
     * @Author XinTai-Yuan
     * @Description  跳转到添加员工页面，并查出所有部门在页面上显示
     * @Date 2021/7/12 15:58
     **/
    @GetMapping("/add")
    public String add(Model model){

        Collection<Department> departments = departmentDao.getDepartments();
        model.addAttribute("departments",departments);
        return "empl/add";
    }


    /*
     * @param model
    * @param employee
     * @return:java.lang.String
     * @Author XinTai-Yuan
     * @Description  来到添加页面进行添加员工
     * @Date 2021/7/12 17:35
     **/
    @PostMapping("/successAdd")
    public String successAdd(Model model,Employee employee){
        employeeDao.save(employee);
        return "redirect:/list";
    }

    /*
     * @param
     * @return:java.lang.String
     * @Author XinTai-Yuan
     * @Description 来到员工修改页面，查出当前员工并在页面上回显
     * @Date 2021/7/12 17:38
     **/
    @GetMapping("/edit/{id}")
    public String edit(@PathVariable("id") Integer id,Model model){
        Employee employee = employeeDao.get(id);

        //查出部门
        Collection<Department> departments = departmentDao.getDepartments();
        model.addAttribute("departments",departments);

        model.addAttribute("emp",employee);
        return "empl/edit";
    }


    /*
     * @param employee
     * @return:java.lang.String
     * @Author XinTai-Yuan
     * @Description  修改员工信息，通过put方式提交
     * @Date 2021/7/12 20:05
     **/
    @PutMapping("/successAdd")
    public String updateEmployee(Employee employee){
       employeeDao.save(employee);
        return "redirect:/list";
    }

    @DeleteMapping("/delete/{id}")
    public String delete(@PathVariable("id") Integer id){
        employeeDao.delete(id);
        return "redirect:/list";
    }

}
