package com.heda.cy.baseDoc.pojo;

import java.io.Serializable;
import java.util.Date;
import lombok.Data;

/**
 * ComputationUnit
 * @author 
 */
@Data
public class Computationunit implements Serializable {
    private String ccomunitcode;

    private String ccomunitname;

    private String cgroupcode;

    private String cbarcode;

    private Boolean bmainunit;

    private Short ichangrate;

    private Double iproportion;

    private Short inumber;

    private Byte[] pubufts;

    private String censingular;

    private String cenplural;

    private String cunitrefinvcode;

    private String u8name;

    private static final long serialVersionUID = 1L;
}