package com.heda.cy.baseDoc.service.impl;

import com.heda.cy.baseDoc.mapper.FitemClassMapper;
import com.heda.cy.baseDoc.mapper.FitemMapper;
import com.heda.cy.baseDoc.mapper.FitemssMapper;
import com.heda.cy.baseDoc.pojo.*;
import com.heda.cy.baseDoc.service.IFitemService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class FitemServiceImpl implements IFitemService {

    @Autowired
    private FitemMapper fitemMapper;
    @Autowired
    private FitemClassMapper fitemClassMapper;
    @Autowired
    private FitemssMapper fitemssMapper;

    @Override
    public List<Fitem> fitem(String u8name) {
        return fitemMapper.fitem(u8name);
    }

    @Override
    public List<FitemClass> fitemclass(Fitem fitem) {
        return fitemClassMapper.fitemclass(fitem);
    }

    @Override
    public void SyncFitemclass(List<FitemClass> fitemClassList, String u8name,String cclasstable) {
        fitemClassList.forEach(fitemClass -> {
            fitemClass.setU8name(u8name);
            fitemClass.setCclasstable(cclasstable);
            FitemClass fitemClass1 = fitemClassMapper.selectByPrimaryKey(fitemClass);
            if(fitemClass1 == null) fitemClassMapper.insertSelective(fitemClass); else fitemClassMapper.updateByPrimaryKeySelective(fitemClass);
        });
    }

    @Override
    public List<Fitemss> fitems(Fitemss fitemss) {
        return fitemssMapper.fitemss(fitemss);
    }

    @Override
    public void SyncFitemss(List<Fitemss> fitemssList, String u8name, String ctable) {
        fitemssList.forEach(fitemss -> {
            FitemClass fitemClass = new FitemClass();
            fitemClass.setU8name(u8name);
            fitemClass.setCitemccode(fitemss.getCitemccode());
            fitemClass.setCclasstable(ctable+"class");
            if(fitemClassMapper.selectByPrimaryKey(fitemClass) == null) throw new RuntimeException("项目大类"+fitemss.getCitemccode()+"不存在");

            fitemss.setU8name(u8name);
            fitemss.setCtable(ctable);
            Fitemss fitemss1 = fitemssMapper.selectByPrimaryKey(fitemss);
            if(fitemss1 == null) fitemssMapper.insertSelective(fitemss); else fitemssMapper.updateByPrimaryKeySelective(fitemss);
        });
    }
}
