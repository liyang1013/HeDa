package com.heda.cy.system.service.impl;

import com.heda.cy.system.mapper.ZhangtaoMapper;
import com.heda.cy.system.pojo.Zhangtao;
import com.heda.cy.system.service.IZhangtaoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ZhangtaoServiceImpl implements IZhangtaoService {

    @Autowired
    private ZhangtaoMapper zhangtaoMapper;
    @Override
    public List<Zhangtao> minorZhangtao() {
        return zhangtaoMapper.minorZhangtao();
    }

    @Override
    public Zhangtao majorZhangtao() {
        return zhangtaoMapper.majorZhangtao();
    }
}
