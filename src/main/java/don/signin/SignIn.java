package don.signin;

import java.io.IOException;

import com.gargoylesoftware.htmlunit.FailingHttpStatusCodeException;
import com.gargoylesoftware.htmlunit.WebClient;
import com.gargoylesoftware.htmlunit.html.DomElement;
import com.gargoylesoftware.htmlunit.html.DomNodeList;
import com.gargoylesoftware.htmlunit.html.HtmlPage;

public class SignIn {

	public static void changeMyStatus(String status){
		WebClient webClient = new WebClient();
		HtmlPage page;
		try {
			
			page = webClient.getPage("http://pdf1.ndr.com:8080/inout/inout_handler.jsp?name=Dongdong_L&status="+status);
			DomNodeList<DomElement> list= page.getElementsByTagName("input");
			list.get(2).click();
		
		} catch (FailingHttpStatusCodeException | IOException e) {
			e.printStackTrace();
		}

	}
	
}
