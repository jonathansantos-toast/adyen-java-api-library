package com.adyen.model.nexo;

import com.google.gson.annotations.SerializedName;
import io.swagger.v3.oas.annotations.media.Schema;

import java.util.ArrayList;
import java.util.List;


/**
 * Definition: Content of the Payment Response messageType. -- Usage: It conveys Information related to the Payment transaction processed by the POI System
 *
 * <p>Java class for PaymentResponse complex type.
 *
 * <p>The following schema fragment specifies the expected content contained within this class.
 *
 * <pre>
 * &lt;complexType name="PaymentResponse"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="Response" type="{}Response"/&gt;
 *         &lt;element name="SaleData" type="{}SaleData"/&gt;
 *         &lt;element name="POIData" type="{}POIData"/&gt;
 *         &lt;element name="PaymentResult" type="{}PaymentResult" minOccurs="0"/&gt;
 *         &lt;element name="LoyaltyResult" type="{}LoyaltyResult" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="PaymentReceipt" type="{}PaymentReceipt" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="CustomerOrder" type="{}CustomerOrder" maxOccurs="unbounded" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 */
public class PaymentResponse {

    /**
     * The Response.
     */
    @SerializedName("Response")
    @Schema(description = "Result of a message request processing.")
    protected Response response;
    /**
     * The Sale data.
     */
    @SerializedName("SaleData")
    @Schema(description = "Data related to the Sale System. --Rule: Copy")
    protected SaleData saleData;
    /**
     * The Poi data.
     */
    @SerializedName("POIData")
    @Schema(description = "Data related to the POI System.")
    protected POIData poiData;
    /**
     * The Payment result.
     */
    @SerializedName("PaymentResult")
    @Schema(description = "Data related to the result of a processed payment transaction. --Rule: If one data element is present")
    protected PaymentResult paymentResult;
    /**
     * The Loyalty result.
     */
    @SerializedName("LoyaltyResult")
    @Schema(description = "Data related to the result of a processed loyalty transaction. --Rule: Loyalty cards used with the payment transaction")
    protected List<LoyaltyResult> loyaltyResult;
    /**
     * The Payment receipt.
     */
    @SerializedName("PaymentReceipt")
    @Schema(description = "Customer or Merchant payment receipt. --Rule: If Basic profile implementation with no printer on the POI.")
    protected List<PaymentReceipt> paymentReceipt;
    /**
     * The Customer order.
     */
    @SerializedName("CustomerOrder")
    @Schema(description = "Customer order attached to a card, recorded in the POI system. --Rule: If the list of customer orders has been requested.")
    protected List<CustomerOrder> customerOrder;

    /**
     * Gets the value of the response property.
     *
     * @return possible      object is     {@link Response }
     */
    public Response getResponse() {
        return response;
    }

    /**
     * Sets the value of the response property.
     *
     * @param value allowed object is     {@link Response }
     */
    public void setResponse(Response value) {
        this.response = value;
    }

    /**
     * Gets the value of the saleData property.
     *
     * @return possible      object is     {@link SaleData }
     */
    public SaleData getSaleData() {
        return saleData;
    }

    /**
     * Sets the value of the saleData property.
     *
     * @param value allowed object is     {@link SaleData }
     */
    public void setSaleData(SaleData value) {
        this.saleData = value;
    }

    /**
     * Gets the value of the poiData property.
     *
     * @return possible      object is     {@link POIData }
     */
    public POIData getPOIData() {
        return poiData;
    }

    /**
     * Sets the value of the poiData property.
     *
     * @param value allowed object is     {@link POIData }
     */
    public void setPOIData(POIData value) {
        this.poiData = value;
    }

    /**
     * Gets the value of the paymentResult property.
     *
     * @return possible      object is     {@link PaymentResult }
     */
    public PaymentResult getPaymentResult() {
        return paymentResult;
    }

    /**
     * Sets the value of the paymentResult property.
     *
     * @param value allowed object is     {@link PaymentResult }
     */
    public void setPaymentResult(PaymentResult value) {
        this.paymentResult = value;
    }

    /**
     * Gets the value of the loyaltyResult property.
     * <p>
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the loyaltyResult property.
     * <p>
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getLoyaltyResult().add(newItem);
     * </pre>
     * <p>
     * <p>
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link LoyaltyResult }
     *
     * @return the loyalty result
     */
    public List<LoyaltyResult> getLoyaltyResult() {
        if (loyaltyResult == null) {
            loyaltyResult = new ArrayList<>();
        }
        return this.loyaltyResult;
    }

    /**
     * Gets the value of the paymentReceipt property.
     * <p>
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the paymentReceipt property.
     * <p>
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getPaymentReceipt().add(newItem);
     * </pre>
     * <p>
     * <p>
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link PaymentReceipt }
     *
     * @return the payment receipt
     */
    public List<PaymentReceipt> getPaymentReceipt() {
        if (paymentReceipt == null) {
            paymentReceipt = new ArrayList<>();
        }
        return this.paymentReceipt;
    }

    /**
     * Gets the value of the customerOrder property.
     * <p>
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the customerOrder property.
     * <p>
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getCustomerOrder().add(newItem);
     * </pre>
     * <p>
     * <p>
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link CustomerOrder }
     *
     * @return the customer order
     */
    public List<CustomerOrder> getCustomerOrder() {
        if (customerOrder == null) {
            customerOrder = new ArrayList<>();
        }
        return this.customerOrder;
    }

}
