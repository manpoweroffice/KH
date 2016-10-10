package license;
 

import org.mybatis.spring.support.SqlSessionDaoSupport;

public class LicenseDAO extends SqlSessionDaoSupport {

public int upload2(LicenseVo vo){

	return getSqlSession().insert("license.license1",vo);
	
}

public int upload1(StorageVo vo1){
	return getSqlSession().insert("license.license2",vo1);
}
}
 