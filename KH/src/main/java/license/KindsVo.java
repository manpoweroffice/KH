package license;


public class KindsVo {
 
	private String kinds; // �ڰ����̸�
 
 KindsVo(){}
 
 public KindsVo(String kinds){
		super();
		this.kinds = kinds;
	}

public String getKinds() {
	return kinds;
}

public void setKinds(String kinds) {
	this.kinds = kinds;
}

@Override
public String toString() {
	return "KindsVo [kinds=" + kinds + "]";
}
}
