import static org.junit.Assert.*;

import java.io.IOException;
import java.net.MalformedURLException;

import org.junit.Ignore;
import org.junit.Test;

import com.gargoylesoftware.htmlunit.FailingHttpStatusCodeException;
import com.gargoylesoftware.htmlunit.WebClient;
import com.gargoylesoftware.htmlunit.html.DomElement;
import com.gargoylesoftware.htmlunit.html.DomNodeList;
import com.gargoylesoftware.htmlunit.html.HtmlPage;

public class TestLoadPage {
	
	@Test
	public void testLoadSignInPage() throws FailingHttpStatusCodeException, MalformedURLException, IOException {
		WebClient webClient = new WebClient();
		HtmlPage page = webClient.getPage("http://pdf1.ndr.com:8080/inout/inout.jsp");
		
		assertEquals("Employee Check-In", page.getTitleText());
		
		assertTrue(page.asText().contains("Dongdong_L"));
	}
	
	@Test
	@Ignore
	public void testFindMyName() throws FailingHttpStatusCodeException, MalformedURLException, IOException {
		WebClient webClient = new WebClient();
		HtmlPage page = webClient.getPage("http://pdf1.ndr.com:8080/inout/inout_handler.jsp?name=Dongdong_L&status=in");

		DomNodeList<DomElement> list= page.getElementsByTagName("input");
		
		list.get(2).click();
		
		//System.out.println(list);
	}
}
