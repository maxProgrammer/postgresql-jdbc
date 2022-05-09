package com.maxprogrammer.model.dao;

import com.maxprogrammer.db.DB;
import com.maxprogrammer.model.dao.Impl.DepartmentDaoJDBC;
import com.maxprogrammer.model.dao.Impl.SellerDaoJDBC;

public class DaoFactory {

    public static SellerDao createSellerDao() {
        return new SellerDaoJDBC(DB.getConnection());
    }

    public static DepartmentDao createDepartmentDao() {
        return new DepartmentDaoJDBC(DB.getConnection());
    }
}
