package com.app.controllers;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.ViewScoped;
import com.jk.web.controllers.JKManagedBeanWithOrmSupport;
import com.app.models.Salary;

@ManagedBean(name = "mbSalary")
@ViewScoped
public class MB_Salary extends JKManagedBeanWithOrmSupport<Salary> {

}