package com.heda.cy.baseDoc.service.impl;

import com.heda.cy.baseDoc.mapper.ComputationgroupMapper;
import com.heda.cy.baseDoc.mapper.ComputationunitMapper;
import com.heda.cy.baseDoc.pojo.*;
import com.heda.cy.baseDoc.service.IComputationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
public class ComputationServiceImpl implements IComputationService {

    @Autowired
    private ComputationgroupMapper computationgroupMapper;
    @Autowired
    private ComputationunitMapper computationunitMapper;

    
    @Override
    public List<Computationgroup> computationGroup(Computationgroup computationgroup) {
        return computationgroupMapper.computationGroup(computationgroup);
    }

    @Override
    @Transactional
    public void SynccomputationGroup(List<Computationgroup> computationgroupList, String u8name) {
        computationgroupList.forEach(computationgroup -> {
            computationgroup.setU8name(u8name);
            Computationgroup computationgroup1 = computationgroupMapper.selectByPrimaryKey(computationgroup);
            if(computationgroup1 == null) computationgroupMapper.insertSelective(computationgroup); else computationgroupMapper.updateByPrimaryKeySelective(computationgroup);
        });
    }

    @Override
    public List<Computationunit> computationgroup(Computationunit computationunit) {
        return computationunitMapper.computationgroup(computationunit);
    }

    @Override
    @Transactional
    public void Synccomputationunit(List<Computationunit> computationunitList, String u8name) {
        for(Computationunit computationunit : computationunitList){

            Computationgroup computationgroup = new Computationgroup();
            computationgroup.setU8name(u8name);
            computationgroup.setCgroupcode(computationunit.getCgroupcode());
            if(computationgroupMapper.selectByPrimaryKey(computationgroup) == null) throw new RuntimeException("计量单位组编码"+computationunit.getCgroupcode()+"不存在");

            computationunit.setU8name(u8name);
            Computationunit computationunit1 = computationunitMapper.selectByPrimaryKey(computationunit);
            if(computationunit1 == null) computationunitMapper.insertSelective(computationunit); else computationunitMapper.updateByPrimaryKeySelective(computationunit);
        }
    }
}
