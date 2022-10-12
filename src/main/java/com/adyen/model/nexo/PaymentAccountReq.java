package com.adyen.model.nexo;

import com.google.gson.annotations.SerializedName;
import io.swagger.v3.oas.annotations.media.Schema;


/**
 * Definition: Data related to the account pointed by the payment card -- Usage: Information provided by the Sale System related to the payment account requesting a balance.
 *
 * <p>Java class for PaymentAccountReq complex type.
 *
 * <p>The following schema fragment specifies the expected content contained within this class.
 *
 * <pre>
 * &lt;complexType name="PaymentAccountReq"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="CardAcquisitionReference" type="{}TransactionIdentification" minOccurs="0"/&gt;
 *         &lt;element name="PaymentInstrumentData" type="{}PaymentInstrumentData" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *       &lt;attribute name="Account" type="{}AccountType" default="Default" /&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 */
public class PaymentAccountReq {

    /**
     * The Card acquisition reference.
     */
    @SerializedName("CardAcquisitionReference")
    @Schema(description = "Reference to the last CardAcquisition, to use the same card. --Rule: if the card data comes from a previous CardAcquisition")
    protected TransactionIdentification cardAcquisitionReference;
    /**
     * The Payment instrument data.
     */
    @SerializedName("PaymentInstrumentData")
    @Schema(description = "Data related to the instrument of payment for the transaction.")
    protected PaymentInstrumentData paymentInstrumentData;
    /**
     * The Account.
     */
    @SerializedName("AccountType")
    @Schema(description = "Type of cardholder account used for the transaction")
    protected AccountType accountType;

    /**
     * Gets the value of the cardAcquisitionReference property.
     *
     * @return possible      object is     {@link TransactionIdentification }
     */
    public TransactionIdentification getCardAcquisitionReference() {
        return cardAcquisitionReference;
    }

    /**
     * Sets the value of the cardAcquisitionReference property.
     *
     * @param value allowed object is     {@link TransactionIdentification }
     */
    public void setCardAcquisitionReference(TransactionIdentification value) {
        this.cardAcquisitionReference = value;
    }

    /**
     * Gets the value of the paymentInstrumentData property.
     *
     * @return possible      object is     {@link PaymentInstrumentData }
     */
    public PaymentInstrumentData getPaymentInstrumentData() {
        return paymentInstrumentData;
    }

    /**
     * Sets the value of the paymentInstrumentData property.
     *
     * @param value allowed object is     {@link PaymentInstrumentData }
     */
    public void setPaymentInstrumentData(PaymentInstrumentData value) {
        this.paymentInstrumentData = value;
    }

    /**
     * Gets the value of the AccountType property.
     *
     * @return possible      object is     {@link AccountType }
     */
    public AccountType getAccountType() {
        if (accountType == null) {
            return AccountType.DEFAULT;
        } else {
            return accountType;
        }
    }

    /**
     * Sets the value of the AccountType property.
     *
     * @param value allowed object is     {@link AccountType }
     */
    public void setAccountType(AccountType value) {
        this.accountType = value;
    }

}
