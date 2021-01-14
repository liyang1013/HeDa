package com.heda.cy.system.pojo;

import java.io.Serializable;
import java.util.List;

import lombok.Data;

/**
 * T_Menu
 * @author 
 */
@Data
public class Menu implements Serializable {
    private Integer menuid;

    private String menucode;

    private String menuname;

    private String parentcode;

    private Integer menulevel;

    private String url;

    private Integer menuorder;

    private Integer menuimage;

    private String icon;

    private String tabname;

    private List<Menu> menus;

    private static final long serialVersionUID = 1L;
}