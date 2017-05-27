package cn.itcast.ws.service;

import java.util.List;

import javax.jws.WebParam;
import javax.jws.WebResult;
import javax.jws.WebService;
import javax.xml.ws.BindingType;

import cn.itcast.ws.pojo.WeatherModel;

/**
 * 
 * <p>Title: WeatherInterface</p>
 * <p>Description: 天气查询</p>
 * <p>Company: www.itcast.com</p> 
 * @author	传智.燕青
 * @date	2014-12-31上午9:05:43
 * @version 1.0
 */
@WebService(
		targetNamespace="http://weather.itcast.cn/",//指定 wsdl的命名空间
		name="WeatherInterface",//指定portType的名称
		portName="WeatherInterfacePort",//指定port的名称
		serviceName="WeatherService"//服务视图的名称
		//endpointInterface="cn.itcast.ws.service.WeatherInterface2"//指定哪个接口中方法要发布成webservice服务，接口中加上@webservice注解
		)
@BindingType(javax.xml.ws.soap.SOAPBinding.SOAP12HTTP_BINDING)
public interface WeatherInterface {
	
	//查询三天天气
	public @WebResult(name="result") List<WeatherModel> queryWeather(@WebParam(name="cityName") String cityName);

}
