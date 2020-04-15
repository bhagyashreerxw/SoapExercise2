
/**
 * Please modify this class to meet your needs
 * This class is not complete
 */

package com.reactiveworks.productwebservice.webservice;

import java.util.logging.Logger;
import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebResult;
import javax.jws.WebService;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.ws.RequestWrapper;
import javax.xml.ws.ResponseWrapper;

/**
 * This class was generated by Apache CXF 3.2.1
 * 2020-03-27T10:02:00.759-07:00
 * Generated source version: 3.2.1
 * 
 */

@javax.jws.WebService(
                      serviceName = "ProductWebServiceService",
                      portName = "ProductWebServicePort",
                      targetNamespace = "http://webservice.productwebservice.reactiveworks.com/",
                      wsdlLocation = "file:/C:/Users/reactiveworks13/soap-webservice/soapn-exercise/productclient/WebContent/wsdl/productwebservice.wsdl",
                      endpointInterface = "com.reactiveworks.productwebservice.webservice.ProductWebService")
                      
public class ProductWebServicePortImpl implements ProductWebService {

    private static final Logger LOG = Logger.getLogger(ProductWebServicePortImpl.class.getName());

    /* (non-Javadoc)
     * @see com.reactiveworks.productwebservice.webservice.ProductWebService#addProducts(java.util.List<com.reactiveworks.productwebservice.webservice.Product> product)*
     */
    public void addProducts(java.util.List<com.reactiveworks.productwebservice.webservice.Product> product) throws ProductWebServiceFailureException_Exception   { 
        LOG.info("Executing operation addProducts");
        System.out.println(product);
        try {
        } catch (java.lang.Exception ex) {
            ex.printStackTrace();
            throw new RuntimeException(ex);
        }
        //throw new ProductWebServiceFailureException_Exception("ProductWebServiceFailureException...");
    }

    /* (non-Javadoc)
     * @see com.reactiveworks.productwebservice.webservice.ProductWebService#getProducts(java.lang.String productId)*
     */
    public java.util.List<com.reactiveworks.productwebservice.webservice.Product> getProducts(java.lang.String productId) throws ProductWebServiceFailureException_Exception   { 
        LOG.info("Executing operation getProducts");
        System.out.println(productId);
        try {
            java.util.List<com.reactiveworks.productwebservice.webservice.Product> _return = new java.util.ArrayList<com.reactiveworks.productwebservice.webservice.Product>();
            com.reactiveworks.productwebservice.webservice.Product _returnVal1 = new com.reactiveworks.productwebservice.webservice.Product();
            _returnVal1.setProductId("ProductId-1889353481");
            _returnVal1.setProductName("ProductName-2101836623");
            _returnVal1.setProductCategory("ProductCategory1534040220");
            _returnVal1.setPrice(Integer.valueOf(-1353203769));
            java.util.List<java.lang.String> _returnVal1AvailableCities = new java.util.ArrayList<java.lang.String>();
            java.lang.String _returnVal1AvailableCitiesVal1 = "_returnVal1AvailableCitiesVal-428974409";
            _returnVal1AvailableCities.add(_returnVal1AvailableCitiesVal1);
            _returnVal1.getAvailableCities().addAll(_returnVal1AvailableCities);
            _return.add(_returnVal1);
            return _return;
        } catch (java.lang.Exception ex) {
            ex.printStackTrace();
            throw new RuntimeException(ex);
        }
        //throw new ProductWebServiceFailureException_Exception("ProductWebServiceFailureException...");
    }

    /* (non-Javadoc)
     * @see com.reactiveworks.productwebservice.webservice.ProductWebService#deleteProduct(java.lang.String productId)*
     */
    public void deleteProduct(java.lang.String productId) throws ProductWebServiceFailureException_Exception   { 
        LOG.info("Executing operation deleteProduct");
        System.out.println(productId);
        try {
        } catch (java.lang.Exception ex) {
            ex.printStackTrace();
            throw new RuntimeException(ex);
        }
        //throw new ProductWebServiceFailureException_Exception("ProductWebServiceFailureException...");
    }

}