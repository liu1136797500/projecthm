package cn.itsource.service.impl;

import cn.itsource.dao.DeptDao;
import cn.itsource.model.Dept;
import cn.itsource.service.DeptService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * 用途：
 * 隐无为-2019/1/12
 */
@Service
public class DeptServiceImpl implements DeptService {
    @Autowired
    DeptDao deptDao;
    @Override
    public List<Dept> queryAll() {
        return deptDao.queryAll();
    }
}
