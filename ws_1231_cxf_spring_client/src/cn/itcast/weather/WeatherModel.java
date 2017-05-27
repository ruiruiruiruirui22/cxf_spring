
package cn.itcast.weather;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>weatherModel complex type�� Java �ࡣ
 * 
 * <p>����ģʽƬ��ָ�������ڴ����е�Ԥ�����ݡ�
 * 
 * <pre>
 * &lt;complexType name="weatherModel">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="data" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         &lt;element name="detail" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="temperature_max" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="temperature_min" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "weatherModel", propOrder = {
    "data",
    "detail",
    "temperatureMax",
    "temperatureMin"
})
public class WeatherModel {

    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar data;
    protected String detail;
    @XmlElement(name = "temperature_max")
    protected int temperatureMax;
    @XmlElement(name = "temperature_min")
    protected int temperatureMin;

    /**
     * ��ȡdata���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getData() {
        return data;
    }

    /**
     * ����data���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setData(XMLGregorianCalendar value) {
        this.data = value;
    }

    /**
     * ��ȡdetail���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDetail() {
        return detail;
    }

    /**
     * ����detail���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDetail(String value) {
        this.detail = value;
    }

    /**
     * ��ȡtemperatureMax���Ե�ֵ��
     * 
     */
    public int getTemperatureMax() {
        return temperatureMax;
    }

    /**
     * ����temperatureMax���Ե�ֵ��
     * 
     */
    public void setTemperatureMax(int value) {
        this.temperatureMax = value;
    }

    /**
     * ��ȡtemperatureMin���Ե�ֵ��
     * 
     */
    public int getTemperatureMin() {
        return temperatureMin;
    }

    /**
     * ����temperatureMin���Ե�ֵ��
     * 
     */
    public void setTemperatureMin(int value) {
        this.temperatureMin = value;
    }

}
