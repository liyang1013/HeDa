package com.heda.cy.baseDoc.pojo;

import java.io.Serializable;
import java.util.Date;
import lombok.Data;

/**
 * Inventory
 * @author 
 */
@Data
public class Inventory implements Serializable {
    private String cinvcode;

    private String cinvaddcode;

    private String cinvname;

    private String cinvstd;

    private String cinvccode;

    private String cvencode;

    private String creplaceitem;

    private String cposition;

    private Boolean bsale;

    private Boolean bpurchase;

    private Boolean bself;

    private Boolean bcomsume;

    private Boolean bproducing;

    private Boolean bservice;

    private Boolean baccessary;

    private Double itaxrate;

    private Double iinvweight;

    private Double ivolume;

    private Double iinvrcost;

    private Double iinvsprice;

    private Double iinvscost;

    private Double iinvlscost;

    private Double iinvncost;

    private Double iinvadvance;

    private Double iinvbatch;

    private Double isafenum;

    private Double itopsum;

    private Double ilowsum;

    private Double ioverstock;

    private String cinvabc;

    private Boolean binvquality;

    private Boolean binvbatch;

    private Boolean binventrust;

    private Boolean binvoverstock;

    private Byte[] dsdate;

    private Byte[] dedate;

    private Boolean bfree1;

    private Boolean bfree2;

    private String cinvdefine1;

    private String cinvdefine2;

    private String cinvdefine3;

    private Integer iId;

    private Boolean binvtype;

    private Double iinvmpcost;

    private String cquality;

    private Double iinvsalecost;

    private Double iinvscost1;

    private Double iinvscost2;

    private Double iinvscost3;

    private Boolean bfree3;

    private Boolean bfree4;

    private Boolean bfree5;

    private Boolean bfree6;

    private Boolean bfree7;

    private Boolean bfree8;

    private Boolean bfree9;

    private Boolean bfree10;

    private String ccreateperson;

    private String cmodifyperson;

    private Byte[] dmodifydate;

    private Double fsubscribepoint;

    private Double fvagquantity;

    private String cvaluetype;

    private Boolean bfixexch;

    private Double foutexcess;

    private Double finexcess;

    private Short imassdate;

    private Short iwarndays;

    private Double fexpensesexch;

    private Boolean btrack;

    private Boolean bserial;

    private Boolean bbarcode;

    private Integer iid;

    private String cbarcode;

    private String cinvdefine4;

    private String cinvdefine5;

    private String cinvdefine6;

    private String cinvdefine7;

    private String cinvdefine8;

    private String cinvdefine9;

    private String cinvdefine10;

    private Integer cinvdefine11;

    private Integer cinvdefine12;

    private Double cinvdefine13;

    private Double cinvdefine14;

    private Byte[] cinvdefine15;

    private Byte[] cinvdefine16;

    private Byte igrouptype;

    private String cgroupcode;

    private String ccomunitcode;

    private String casscomunitcode;

    private String csacomunitcode;

    private String cpucomunitcode;

    private String cstcomunitcode;

    private String ccacomunitcode;

    private String cfrequency;

    private Short ifrequency;

    private Short idays;

    private Byte[] dlastdate;

    private Double iwastage;

    private Boolean bsolitude;

    private String centerprise;

    private String caddress;

    private String cfile;

    private String clabel;

    private String ccheckout;

    private String clicence;

    private Boolean bspecialties;

    private String cdefwarehouse;

    private Double ihighprice;

    private Double iexpsalerate;

    private String cpricegroup;

    private String coffergrade;

    private Double iofferrate;

    private String cmonth;

    private Short iadvancedate;

    private String ccurrencyname;

    private String cproduceaddress;

    private String cproducenation;

    private String cregisterno;

    private String centerno;

    private String cpackingtype;

    private String cenglishname;

    private Boolean bpropertycheck;

    private String cpreparationtype;

    private String ccommodity;

    private Byte irecipebatch;

    private String cnotpatentname;

    private Byte[] pubufts;

    private Boolean bpromotsales;

    private Short iplanpolicy;

    private Short iropmethod;

    private Short ibatchrule;

    private Double fbatchincrement;

    private Integer iassureprovidedays;

    private Short iteststyle;

    private Short idtmethod;

    private Double fdtrate;

    private Double fdtnum;

    private String cdtunit;

    private Short idtstyle;

    private Integer iqtmethod;

    private Object pictureguid;

    private Boolean bplaninv;

    private Boolean bproxyforeign;

    private Boolean batomodel;

    private Boolean bcheckitem;

    private Boolean bptomodel;

    private Boolean bequipment;

    private String cproductunit;

    private Double forderuplimit;

    private Short cmassunit;

    private Double fretailprice;

    private String cinvdepcode;

    private Integer ialteradvance;

    private Double falterbasenum;

    private String cplanmethod;

    private Boolean bmps;

    private Boolean brop;

    private Boolean breplan;

    private String csrpolicy;

    private Boolean bbillunite;

    private Integer isupplyday;

    private Double fsupplymulti;

    private Double fminsupply;

    private Boolean bcutmantissa;

    private String cinvpersoncode;

    private Integer iinvtfid;

    private String cengineerfigno;

    private Boolean bintotalcost;

    private Short isupplytype;

    private Boolean bconfigfree1;

    private Boolean bconfigfree2;

    private Boolean bconfigfree3;

    private Boolean bconfigfree4;

    private Boolean bconfigfree5;

    private Boolean bconfigfree6;

    private Boolean bconfigfree7;

    private Boolean bconfigfree8;

    private Boolean bconfigfree9;

    private Boolean bconfigfree10;

    private Short idtlevel;

    private String cdtaql;

    private Boolean bperioddt;

    private String cdtperiod;

    private Integer ibigmonth;

    private Integer ibigday;

    private Integer ismallmonth;

    private Integer ismallday;

    private Boolean boutinvdt;

    private Boolean bbackinvdt;

    private Short ienddtstyle;

    private Boolean bdtwarninv;

    private Double fbacktaxrate;

    private String cciqcode;

    private String cwgroupcode;

    private String cwunit;

    private Double fgrossw;

    private String cvgroupcode;

    private String cvunit;

    private Double flength;

    private Double fwidth;

    private Double fheight;

    private Integer idtucounter;

    private Integer idtdcounter;

    private Integer ibatchcounter;

    private String cshopunit;

    private String cpurpersoncode;

    private Boolean bimportmedicine;

    private Boolean bfirstbusimedicine;

    private Boolean bforeexpland;

    private String cinvplancode;

    private Double fconvertrate;

    private Byte[] dreplacedate;

    private Boolean binvmodel;

    private Boolean bkccutmantissa;

    private Boolean breceiptbydt;

    private Double iimptaxrate;

    private Double iexptaxrate;

    private Boolean bexpsale;

    private Double idrawbatch;

    private Boolean bcheckbsatp;

    private String cinvprojectcode;

    private Short itestrule;

    private String crulecode;

    private Boolean bcheckfree1;

    private Boolean bcheckfree2;

    private Boolean bcheckfree3;

    private Boolean bcheckfree4;

    private Boolean bcheckfree5;

    private Boolean bcheckfree6;

    private Boolean bcheckfree7;

    private Boolean bcheckfree8;

    private Boolean bcheckfree9;

    private Boolean bcheckfree10;

    private Boolean bbommain;

    private Boolean bbomsub;

    private Boolean bproductbill;

    private Short icheckatp;

    private Integer iinvatpid;

    private Integer iplantfday;

    private Integer ioverlapday;

    private Boolean bpiece;

    private Boolean bsrvitem;

    private Boolean bsrvfittings;

    private Double fmaxsupply;

    private Double fminsplit;

    private Boolean bspecialorder;

    private Boolean btracksalebill;

    private String cinvmnemcode;

    private Short iplandefault;

    private Double ipfbatchqty;

    private Integer iallocateprintdgt;

    private Boolean bcheckbatch;

    private Boolean bmngoldpart;

    private Short ioldpartmngrule;

    private String u8name;

    private String cinvcname;

    private static final long serialVersionUID = 1L;
}