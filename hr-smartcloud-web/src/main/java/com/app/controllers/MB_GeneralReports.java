package com.app.controllers;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.ViewScoped;
import com.jk.web.controllers.JKManagedBeanWithOrmSupport;
import com.app.models.GeneralReports;

@ManagedBean(name = "mbGeneralReports")
@ViewScoped
public class MB_GeneralReports extends JKManagedBeanWithOrmSupport<GeneralReports> {

}