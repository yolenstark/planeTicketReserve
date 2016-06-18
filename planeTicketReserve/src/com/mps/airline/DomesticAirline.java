
package com.mps.airline;

import java.net.MalformedURLException;
import java.net.URL;
import javax.xml.namespace.QName;
import javax.xml.ws.Service;
import javax.xml.ws.WebEndpoint;
import javax.xml.ws.WebServiceClient;
import javax.xml.ws.WebServiceException;
import javax.xml.ws.WebServiceFeature;


/**
 * <a href="http://www.webxml.com.cn/" target="_blank">WebXml.com.cn</a> <strong>国内飞机航班时刻表 WEB 服务</strong>提供：通过出发城市和到达城市查询飞机航班、出发和到达时间、飞行周期、航空公司、机型等信息。国内飞机航班时刻表 WEB 服务提供的飞机航班时刻表数据仅供参考，如有异议请以当地飞机场提供的讯息为准。</br>此国内飞机航班时刻表Web Services请不要用于任何商业目的，若有需要请<a href="http://www.webxml.com.cn/zh_cn/contact_us.aspx" target="_blank">联系我们</a>，欢迎技术交流。 QQ：8409035<br /><strong>使用本站 WEB 服务请注明或链接本站：http://www.webxml.com.cn/ 感谢大家的支持</strong>！<br /><br />&nbsp;
 * 
 * This class was generated by the JAX-WS RI.
 * JAX-WS RI 2.2.9-b130926.1035
 * Generated source version: 2.2
 * 
 */
@WebServiceClient(name = "DomesticAirline", targetNamespace = "http://WebXml.com.cn/", wsdlLocation = "http://ws.webxml.com.cn/webservices/DomesticAirline.asmx?wsdl")
public class DomesticAirline
    extends Service
{

    private final static URL DOMESTICAIRLINE_WSDL_LOCATION;
    private final static WebServiceException DOMESTICAIRLINE_EXCEPTION;
    private final static QName DOMESTICAIRLINE_QNAME = new QName("http://WebXml.com.cn/", "DomesticAirline");

    static {
        URL url = null;
        WebServiceException e = null;
        try {
            url = new URL("http://ws.webxml.com.cn/webservices/DomesticAirline.asmx?wsdl");
        } catch (MalformedURLException ex) {
            e = new WebServiceException(ex);
        }
        DOMESTICAIRLINE_WSDL_LOCATION = url;
        DOMESTICAIRLINE_EXCEPTION = e;
    }

    public DomesticAirline() {
        super(__getWsdlLocation(), DOMESTICAIRLINE_QNAME);
    }

    public DomesticAirline(WebServiceFeature... features) {
        super(__getWsdlLocation(), DOMESTICAIRLINE_QNAME, features);
    }

    public DomesticAirline(URL wsdlLocation) {
        super(wsdlLocation, DOMESTICAIRLINE_QNAME);
    }

    public DomesticAirline(URL wsdlLocation, WebServiceFeature... features) {
        super(wsdlLocation, DOMESTICAIRLINE_QNAME, features);
    }

    public DomesticAirline(URL wsdlLocation, QName serviceName) {
        super(wsdlLocation, serviceName);
    }

    public DomesticAirline(URL wsdlLocation, QName serviceName, WebServiceFeature... features) {
        super(wsdlLocation, serviceName, features);
    }

    /**
     * 
     * @return
     *     returns DomesticAirlineSoap
     */
    @WebEndpoint(name = "DomesticAirlineSoap")
    public DomesticAirlineSoap getDomesticAirlineSoap() {
        return super.getPort(new QName("http://WebXml.com.cn/", "DomesticAirlineSoap"), DomesticAirlineSoap.class);
    }

    /**
     * 
     * @param features
     *     A list of {@link javax.xml.ws.WebServiceFeature} to configure on the proxy.  Supported features not in the <code>features</code> parameter will have their default values.
     * @return
     *     returns DomesticAirlineSoap
     */
    @WebEndpoint(name = "DomesticAirlineSoap")
    public DomesticAirlineSoap getDomesticAirlineSoap(WebServiceFeature... features) {
        return super.getPort(new QName("http://WebXml.com.cn/", "DomesticAirlineSoap"), DomesticAirlineSoap.class, features);
    }

    private static URL __getWsdlLocation() {
        if (DOMESTICAIRLINE_EXCEPTION!= null) {
            throw DOMESTICAIRLINE_EXCEPTION;
        }
        return DOMESTICAIRLINE_WSDL_LOCATION;
    }

}
