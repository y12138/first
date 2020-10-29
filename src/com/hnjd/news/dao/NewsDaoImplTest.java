package com.hnjd.news.dao;

import java.sql.SQLException;
import java.util.Date;

import org.junit.Test;

import com.hnjd.news.entity.News;

public class NewsDaoImplTest {

	@Test
	public void testAddNews() throws Exception {
		NewsDao newsDao = new NewsDaoImpl();
		
		News news = new News();
		news.setNtid(2);
		news.setNcreateDate(new Date());
		news.setNauthor("�й�������");
		news.setNpicPath("");
		news.setNsummary("���ʻ��һ�����֯�ڼ�������ġ����羭��չ������д�������ݱ����������ڼ������ķ������߳ɹ��ؽ����˸�Ⱦ�ʡ���Ȼ��Щ����ͬʱ�ӿ��˾���˥�ˣ�����ֻ�Ƕ��ڳɱ�����Ⱦ�ʵĽ��ͣ��������������ڵ��ĸ�Ⱦ�����µ���Ը������룬��˿��ܵ��¸���ľ��ø��ա�");
		news.setNmodifyDate(new Date());
		news.setNcontent("Ŀǰ�������ۼ�ȷ���ѽ�760������������21.2����������ʱ��10��8�գ���������ŦԼʱ����ͳ�ƣ��ڹ�ȥһ���У�����ÿ��ƽ��������4.5����ȷ�ﲡ����������ǰ��ƽ��ˮƽ������9%�������������ķ���������Ԥ���ƣ���2020��10��31�գ������¹����������򽫴ﵽ22.4����23.3���ˡ�\r\n" + 
				"\r\n" + 
				"������һ���棬�׹�ҽ������8�ճƣ�������ͳ�������Ѿ�������¹ڷ��׵������Ƴ̡�����ʾ�������ջص��׹������������ȶ���������˵���¹��Ƴ̵ķ�Ӧ�ǳ��ã�û�в���Ч��������ʾ��ҽ���ŶӸ߶�Ԥ�������տ�����10�ա���ȫ���ط����������\r\n" + 
				"\r\n" + 
				"�������⣬�����ձ������ƣ��������Լ����д�Ⱦ�ԣ���׼���ָ���ѡ���ᡣ������ʾ���Լ����ܽ�����ͳ������������ʽ���С�8����Щʱ�������յľ�ѡ����ȶ���˹�ٷҷ�������������������ͬ��ݵǾ�ѡ�ŶӵĽ��飬���ڶ��α����Ƴ�һ�ܣ��Ա�������Բμӱ��ۡ�");
		news.setNtitle("������������¹������Ƴ� ȫ������ǿ���߹ܿ�");
		newsDao.addNews(news);
	}
	
	@Test
	public void testDeleteNews() throws SQLException {
		NewsDao newsDao = new NewsDaoImpl();
		newsDao.deleteNews(194);
	}

}
