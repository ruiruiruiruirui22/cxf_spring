package cn.itcast.ws.cxf;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

import org.junit.Before;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import cn.itcast.weather.WeatherInterface;
import cn.itcast.weather.WeatherModel;

/**
 * 
 * <p>
 * Title: ClientTest
 * </p>
 * <p>
 * Description: cxf+spring整合，客户端测试
 * </p>
 * <p>
 * Company: www.itcast.com
 * </p>
 * 
 * @author 传智.燕青
 * @date 2014-12-31上午11:16:04
 * @version 1.0
 */
public class ClientTest {

	private ApplicationContext applicationContext;

	@Before
	public void before() {

		applicationContext = new ClassPathXmlApplicationContext(
				"applicationContext.xml");

	}

	@Test
	public void testCxfSpringClient() {
		// 从spring容器中取出porttype
		WeatherInterface weatherInterface = (WeatherInterface) applicationContext
				.getBean("weatherClient");

		// 调用portType的方法
		List<WeatherModel> list = weatherInterface.queryWeather("郑州");

		for (WeatherModel weatherModel : list) {
			System.out.println(weatherModel.getDetail());
			Date date = weatherModel.getData().toGregorianCalendar().getTime();
			System.out.println(new SimpleDateFormat("yyyy-MM-dd").format(date));
			System.out.println(weatherModel.getTemperatureMax());
			System.out.println(weatherModel.getTemperatureMin());
		}
	}

}
