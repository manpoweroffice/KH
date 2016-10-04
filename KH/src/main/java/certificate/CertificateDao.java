package certificate;

import org.mybatis.spring.support.SqlSessionDaoSupport;

public class CertificateDao extends SqlSessionDaoSupport{
	public CertificateCommand select_c(String stu_num) {
		return getSqlSession().selectOne("stuInfo.select_c", stu_num);
	}
	
	public void update_state(CertificateCommand command){
		getSqlSession().update("stuInfo.update_state",command);
	}
}
