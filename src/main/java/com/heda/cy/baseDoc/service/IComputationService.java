package com.heda.cy.baseDoc.service;

import com.heda.cy.baseDoc.pojo.Computationgroup;
import com.heda.cy.baseDoc.pojo.Computationunit;

import java.util.List;

public interface IComputationService {
    List<Computationgroup> computationGroup(Computationgroup computationgroup);

    void SynccomputationGroup(List<Computationgroup> computationgroupList, String u8name);

    List<Computationunit> computationgroup(Computationunit computationunit);

    void Synccomputationunit(List<Computationunit> computationunitList, String u8name);
}
