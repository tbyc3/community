package com.nowcoder.community.dao;

import org.springframework.stereotype.Repository;

@Repository("alphaHibernate")
public class AlphaDaoHirbernateImpl implements AlphaDao{
    @Override
    public String select() {
        return "Hirbenate";
    }
}
