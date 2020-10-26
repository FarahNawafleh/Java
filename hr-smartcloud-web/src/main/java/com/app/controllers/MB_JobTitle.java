package com.app.controllers;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.ViewScoped;
import com.jk.web.controllers.JKManagedBeanWithOrmSupport;
import com.app.models.JobTitle;

@ManagedBean(name = "mbJobTitle")
@ViewScoped
public class MB_JobTitle extends JKManagedBeanWithOrmSupport<JobTitle> {

}