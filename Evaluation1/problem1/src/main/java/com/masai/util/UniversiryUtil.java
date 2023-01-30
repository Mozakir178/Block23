package com.masai.util;

import com.masai.dao.UniversityDAO;
import com.masai.dao.UniversityDAOJdbcImpl;
import com.masai.dao.UniversityDaoOrmImpl;

public class UniversiryUtil {

    public static UniversityDAO getInstance(String dao) throws Exception {

        if(dao.equalsIgnoreCase("JDBC")){
            return new  UniversityDAOJdbcImpl();
        }
        else if(dao.equalsIgnoreCase("ORM")){
            return  new UniversityDaoOrmImpl();
        }
        else throw new Exception("Please enter correct approach name") ;
    }
}
