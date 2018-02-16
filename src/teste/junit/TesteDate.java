package teste.junit;

import static org.junit.Assert.*;

import java.util.Calendar;

import org.junit.Test;

import br.com.valdir.project.report.util.DateUtils;

public class TesteDate {

	@Test
	public void testData(){
		try {
			assertEquals("16022018", DateUtils.getDateAtualReportName());
			assertEquals("'2018-02-16'", DateUtils.formatDateSql(Calendar.getInstance().getTime()));
			assertEquals("2018-02-16", DateUtils.formatDateSqlSimple(Calendar.getInstance().getTime()));
			
		} catch (Exception e) {
			e.printStackTrace();
			fail(e.getMessage());
		}
		
	}
	
}
