
package com.akash.ws.trainings;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the com.akash.ws.trainings package. 
 * <p>An ObjectFactory allows you to programatically 
 * construct new instances of the Java representation 
 * for XML content. The Java representation of XML 
 * content can consist of schema derived interfaces 
 * and classes representing the binding of schema 
 * type definitions, element declarations and model 
 * groups.  Factory methods for each of these are 
 * provided in this class.
 * 
 */
@XmlRegistry
public class ObjectFactory {

    private final static QName _GetOrdersRequest_QNAME = new QName("http://trainings.ws.akash.com/", "getOrdersRequest");
    private final static QName _GetOrdersResponse_QNAME = new QName("http://trainings.ws.akash.com/", "getOrdersResponse");
    private final static QName _CreateOrdersRequest_QNAME = new QName("http://trainings.ws.akash.com/", "createOrdersRequest");
    private final static QName _CreateOrdersResponse_QNAME = new QName("http://trainings.ws.akash.com/", "createOrdersResponse");
    private final static QName _UpdateOrdersRequest_QNAME = new QName("http://trainings.ws.akash.com/", "updateOrdersRequest");
    private final static QName _UpdateOrdersResponse_QNAME = new QName("http://trainings.ws.akash.com/", "updateOrdersResponse");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: com.akash.ws.trainings
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link GetOrdersRequest }
     * 
     */
    public GetOrdersRequest createGetOrdersRequest() {
        return new GetOrdersRequest();
    }

    /**
     * Create an instance of {@link GetOrdersResponse }
     * 
     */
    public GetOrdersResponse createGetOrdersResponse() {
        return new GetOrdersResponse();
    }

    /**
     * Create an instance of {@link CreateOrdersRequest }
     * 
     */
    public CreateOrdersRequest createCreateOrdersRequest() {
        return new CreateOrdersRequest();
    }

    /**
     * Create an instance of {@link CreateOrdersResponse }
     * 
     */
    public CreateOrdersResponse createCreateOrdersResponse() {
        return new CreateOrdersResponse();
    }

    /**
     * Create an instance of {@link UpdateOrdersRequest }
     * 
     */
    public UpdateOrdersRequest createUpdateOrdersRequest() {
        return new UpdateOrdersRequest();
    }

    /**
     * Create an instance of {@link UpdateOrdersResponse }
     * 
     */
    public UpdateOrdersResponse createUpdateOrdersResponse() {
        return new UpdateOrdersResponse();
    }

    /**
     * Create an instance of {@link Order }
     * 
     */
    public Order createOrder() {
        return new Order();
    }

    /**
     * Create an instance of {@link Product }
     * 
     */
    public Product createProduct() {
        return new Product();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetOrdersRequest }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://trainings.ws.akash.com/", name = "getOrdersRequest")
    public JAXBElement<GetOrdersRequest> createGetOrdersRequest(GetOrdersRequest value) {
        return new JAXBElement<GetOrdersRequest>(_GetOrdersRequest_QNAME, GetOrdersRequest.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetOrdersResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://trainings.ws.akash.com/", name = "getOrdersResponse")
    public JAXBElement<GetOrdersResponse> createGetOrdersResponse(GetOrdersResponse value) {
        return new JAXBElement<GetOrdersResponse>(_GetOrdersResponse_QNAME, GetOrdersResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CreateOrdersRequest }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://trainings.ws.akash.com/", name = "createOrdersRequest")
    public JAXBElement<CreateOrdersRequest> createCreateOrdersRequest(CreateOrdersRequest value) {
        return new JAXBElement<CreateOrdersRequest>(_CreateOrdersRequest_QNAME, CreateOrdersRequest.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CreateOrdersResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://trainings.ws.akash.com/", name = "createOrdersResponse")
    public JAXBElement<CreateOrdersResponse> createCreateOrdersResponse(CreateOrdersResponse value) {
        return new JAXBElement<CreateOrdersResponse>(_CreateOrdersResponse_QNAME, CreateOrdersResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link UpdateOrdersRequest }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://trainings.ws.akash.com/", name = "updateOrdersRequest")
    public JAXBElement<UpdateOrdersRequest> createUpdateOrdersRequest(UpdateOrdersRequest value) {
        return new JAXBElement<UpdateOrdersRequest>(_UpdateOrdersRequest_QNAME, UpdateOrdersRequest.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link UpdateOrdersResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://trainings.ws.akash.com/", name = "updateOrdersResponse")
    public JAXBElement<UpdateOrdersResponse> createUpdateOrdersResponse(UpdateOrdersResponse value) {
        return new JAXBElement<UpdateOrdersResponse>(_UpdateOrdersResponse_QNAME, UpdateOrdersResponse.class, null, value);
    }

}
