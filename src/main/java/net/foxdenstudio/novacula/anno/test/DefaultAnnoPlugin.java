package net.foxdenstudio.novacula.anno.test;

import net.foxdenstudio.novacula.anno.NovaClassListener;
import net.foxdenstudio.novacula.anno.NovaMethodListener;
import net.foxdenstudio.novacula.anno.requests.IWebServiceRequest;
import net.foxdenstudio.novacula.anno.responses.IWebServiceResponse;
import net.foxdenstudio.novacula.core.StartupArgs;

import java.util.Date;

/**
 * Created by d4rkfly3r (Joshua F.) on 12/25/15.
 */
@NovaClassListener(name = "def")
public class DefaultAnnoPlugin {

    @NovaMethodListener(name = "index")
    public IWebServiceResponse getIndexPage(IWebServiceRequest request) {
        System.err.println("YA IM HERE");
        String make = "";
        make += "HTTP/1.1 404 Not Found\r\n";
        make += "Date: " + new Date().toString() + "\r\n";
        make += "Server: NovaServer1.5r\n";
        make += "Accept-Ranges: bytes\r\n";
        make += ("Content-Type: text/html\r\n");
        make += "\r\n";
        make += "<html>\r\n";
        make += "<Title>404 File Not Found</Title>\r\n";
        make += "<body style='background-color: #2A3132;'>\r\n";
        make += "<p>&nbsp;</p><p>&nbsp;</p><p>&nbsp;</p>\r\n";
        make += "<div align='center'><center>\r\n";
        make += "<div style='width: 60%;padding: 7px;background-color: #763626;'>\r\n";
        make += "<p align='center'><font color='#FFFFFF' size='6'><strong>404 File Not Found</strong></font></p>\r\n";
        make += "<p><font color='#FFFFFF' size='4'>The Web Server cannot find the requested file or script.  Please check the URL to be sure that it is correct.</font></p>\r\n";
        make += "<p><font color='#FFFFFF' size='4'>If the problem persists, please contact the webmaster at " + StartupArgs.MAILTO + "</font></p>\r\n";
        make += "</div>\r\n";
        make += "</center></div>\r\n";
        make += "</html>" + "\r\n";
        return make::getBytes;
    }
}
