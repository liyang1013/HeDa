package com.heda.cy.baseDoc.pojo;

import java.io.Serializable;
import java.util.Date;
import lombok.Data;

/**
 * code
 * @author 
 */
@Data
public class Code extends CodeKey implements Serializable {
    private Integer iId;

    private String cclass;

    private String cclassEngl;

    private String cclassany;

    private String cclassanyEngl;

    private String ccodeName;

    private String ccodeEngl;

    private Byte igrade;

    private Boolean bproperty;

    private String cbookType;

    private String cbookTypeEngl;

    private String chelp;

    private String cexchName;

    private String cmeasure;

    private Boolean bperson;

    private Boolean bcus;

    private Boolean bsup;

    private Boolean bdept;

    private Boolean bitem;

    private String cassItem;

    private Boolean br;

    private Boolean be;

    private String cgather;

    private Boolean bend;

    private Boolean bexchange;

    private Boolean bcash;

    private Boolean bbank;

    private Boolean bused;

    private Boolean bdC;

    private  Byte[] dbegin;

    private  Byte[] dend;

    private Byte itrans;

    private Boolean bclose;

    private String cother;

    private Integer iotherused;

    private Boolean bcdefine1;

    private Boolean bcdefine2;

    private Boolean bcdefine3;

    private Boolean bcdefine4;

    private Boolean bcdefine5;

    private Boolean bcdefine6;

    private Boolean bcdefine7;

    private Boolean bcdefine8;

    private Boolean bcdefine9;

    private Boolean bcdefine10;

    private Integer iviewitem;

    private Boolean bgcjs;

    private Boolean bcashitem;

    private  Byte[] pubufts;

    private Boolean bcdefine11;

    private Boolean bcdefine12;

    private Boolean bcdefine13;

    private Boolean bcdefine14;

    private Boolean bcdefine15;

    private Boolean bcdefine16;

    private Boolean breport;

    private String cuserdefinetype;

    private Byte[] dmodifydate;

    private Boolean bparacc;

    private static final long serialVersionUID = 1L;
}