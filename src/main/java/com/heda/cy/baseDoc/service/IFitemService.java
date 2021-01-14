package com.heda.cy.baseDoc.service;

import com.heda.cy.baseDoc.pojo.Fitem;
import com.heda.cy.baseDoc.pojo.FitemClass;
import com.heda.cy.baseDoc.pojo.Fitemss;

import java.util.List;

public interface IFitemService {
    List<Fitem> fitem(String u8name);


    List<FitemClass> fitemclass(Fitem fitem);

    void SyncFitemclass(List<FitemClass> fitemClassList, String u8name,String cclasstable);

    List<Fitemss> fitems(Fitemss fitemss);

    void SyncFitemss(List<Fitemss> fitemssList, String u8name,String ctable);
}
