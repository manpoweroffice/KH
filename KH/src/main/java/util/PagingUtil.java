package util;

public class PagingUtil {

	private int startCount; //�� ���������� ������ �Խñ��� ���� ��ȣ
	private int endCount; //�� ���������� ������ �Խñ��� �� ��ȣ
	private StringBuffer pagingHtml; //����¡ ������
	
   /**
	* currentPage : ���� ������
	* totalCount : ��ü �Խñ� ��
	* blockCount : �� ȭ�鿡 ������ �Խñ� ��
	* blockPage : �� ȭ�鿡 ������ ������ ��
	* pageUrl : ȣ�� ������ url
	* addKey : �ΰ����� key ���� ���� null ó�� (&num=1 �̷� �������� ������ ��)
   **/
	
	public PagingUtil(int currentPage,int totalCount,int blockCount,int blockPage,String pageUrl){
		this(null,null,currentPage,totalCount,blockCount,blockPage,pageUrl,null);
	}
	
	public PagingUtil(int currentPage,int totalCount,int blockCount,int blockPage, String pageUrl,String addKey){
		this(null,null,currentPage,totalCount,blockCount,blockPage,pageUrl,addKey);
	}
	public PagingUtil(String keyField,String keyWord,int currentPage,int totalCount,int blockCount,int blockPage,String pageUrl){
		this(keyField,keyWord,currentPage,totalCount,blockCount,blockPage,pageUrl,null);
	}
	public PagingUtil(String keyField,String keyWord,int currentPage,int totalCount,int blockCount,int blockPage,String pageUrl,String addKey){
		if(addKey==null)addKey="";
		
		//��ü ������ ��
		int totalPage= (int)Math.ceil((double)totalCount/blockCount);
		if(totalPage==0){
			totalPage=1;
		}
		//���� �������� ��ü ������ �� ���� ũ�� ��ü ������ ���� ����
		if(currentPage>totalPage){
			currentPage=totalPage;
		}
		//���� �������� ó���� ������ ���� ��ȣ ��������
		startCount =(currentPage-1)*blockCount+1;
		endCount = currentPage* blockCount;
		//���� �������� ������ ������ �� ���ϱ�
		int startPage= (int)((currentPage-1)/blockPage)*blockPage+1;
		int endPage= startPage+blockPage-1;
		//������ �������� ��ü ������ ������ ũ�� ��ü ������ ���� ����
		if(endPage>totalPage){
			endPage=totalPage;
		}
		//���� block������
		pagingHtml= new StringBuffer();
		if(currentPage>blockPage){
			if(keyWord==null){//�˻� �̻���
				pagingHtml.append("<a href="+pageUrl+"?pageNum="+(startPage-1)+addKey+">");
			}else{//�˻� ����
				pagingHtml.append("<a href="+pageUrl+"?keyField="+keyField+"&keyWord="+keyWord+"&pageNum"+(startPage-1)+addKey+">");
			}
			pagingHtml.append("����");
			pagingHtml.append("</a>");
		}
		pagingHtml.append(" | ");
		//������ ��ȣ.���� �������� ���������� �����ϰ� ��ũ�� ����.
        for (int i = startPage; i <= endPage; i++) {
            if (i > totalPage) {
                break;
            }
            if (i == currentPage) {
                pagingHtml.append(" <b> <font color='red'>");
                pagingHtml.append(i);
                pagingHtml.append("</font></b>");
            } else {
                if(keyWord==null){//�˻� �̻���
                    pagingHtml.append(" <a href='"+pageUrl+"?pageNum=");
                }else{
                    pagingHtml.append(" <a href='"+pageUrl+"?keyField="+keyField+"&keyWord="+keyWord+"&pageNum=");
                }
                pagingHtml.append(i);
                pagingHtml.append(addKey+"'>");
                pagingHtml.append(i);
                pagingHtml.append("</a>");
            }
            pagingHtml.append(" ");
        }
        pagingHtml.append(" | ");
		//���� block������
		if(totalPage-startPage>=blockPage){
			if(keyWord==null){
				pagingHtml.append("<a href="+pageUrl+"?pageNum="+(endPage+1)+addKey+">");
			}else{
				pagingHtml.append("<a href="+pageUrl+"?keyField="+keyField+"&keyWord="+keyWord+"&pageNum="+(endPage+1)+addKey+">");
			}
			pagingHtml.append("����");
			pagingHtml.append("</a>");
		}
	}

	public int getStartCount() {
		return startCount;
	}

	public int getEndCount() {
		return endCount;
	}

	public StringBuffer getPagingHtml() {
		return pagingHtml;
	}
}
