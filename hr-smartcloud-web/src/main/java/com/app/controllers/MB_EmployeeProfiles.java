package com.app.controllers;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.ViewScoped;
import com.jk.web.controllers.JKManagedBeanWithOrmSupport;
import com.app.models.EmployeeProfiles;

@ManagedBean(name = "mbEmployeeProfiles")
@ViewScoped
public class MB_EmployeeProfiles extends JKManagedBeanWithOrmSupport<EmployeeProfiles> {

}