package com.app.controllers;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.ViewScoped;
import com.jk.web.controllers.JKManagedBeanWithOrmSupport;
import com.app.models.EmployeeReports;

@ManagedBean(name = "mbEmployeeReports")
@ViewScoped
public class MB_EmployeeReports extends JKManagedBeanWithOrmSupport<EmployeeReports> {

}