package com.app.controllers;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.ViewScoped;
import com.jk.web.controllers.JKManagedBeanWithOrmSupport;
import com.app.models.Contries;

@ManagedBean(name = "mbContries")
@ViewScoped
public class MB_Contries extends JKManagedBeanWithOrmSupport<Contries> {

}