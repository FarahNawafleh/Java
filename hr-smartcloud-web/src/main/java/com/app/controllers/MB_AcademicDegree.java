package com.app.controllers;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.ViewScoped;
import com.jk.web.controllers.JKManagedBeanWithOrmSupport;
import com.app.models.AcademicDegree;

@ManagedBean(name = "mbAcademicDegree")
@ViewScoped
public class MB_AcademicDegree extends JKManagedBeanWithOrmSupport<AcademicDegree> {

}