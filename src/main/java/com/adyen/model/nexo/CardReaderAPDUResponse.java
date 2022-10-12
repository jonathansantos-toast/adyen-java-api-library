package com.adyen.model.nexo;

import com.google.gson.annotations.SerializedName;
import io.swagger.v3.oas.annotations.media.Schema;


/**
 * Definition: Content of the Card Reader APDU Response messageType. -- Usage: It contains the result of the requested service, APDU response sent by the chip of the card in response to the APDU request.
 *
 * <p>Java class for CardReaderAPDUResponse complex type.
 *
 * <p>The following schema fragment specifies the expected content contained within this class.
 *
 * <pre>
 * &lt;complexType name="CardReaderAPDUResponse"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="Response" type="{}Response"/&gt;
 *         &lt;element name="APDUData" type="{}APDUData" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *       &lt;attribute name="CardStatusWords" use="required" type="{}CardStatusWords" /&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 */
public class CardReaderAPDUResponse {

    /**
     * The Response.
     */
    @SerializedName("Response")
    @Schema(description = "Result of a message request processing.")
    protected Response response;
    /**
     * The Apdu data.
     */
    @SerializedName("APDUData")
    @Schema(description = "Data field of the APDU command (Lc + Data)")
    protected byte[] apduData;
    /**
     * The Card status words.
     */
    @SerializedName("CardStatusWords")
    @Schema(description = "Status of a smartcard response to a command (SW1-SW2)")
    protected byte[] cardStatusWords;

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
     * Gets the value of the apduData property.
     *
     * @return possible      object is     byte[]
     */
    public byte[] getAPDUData() {
        return apduData;
    }

    /**
     * Sets the value of the apduData property.
     *
     * @param value allowed object is     byte[]
     */
    public void setAPDUData(byte[] value) {
        this.apduData = value;
    }

    /**
     * Gets the value of the cardStatusWords property.
     *
     * @return possible      object is     byte[]
     */
    public byte[] getCardStatusWords() {
        return cardStatusWords;
    }

    /**
     * Sets the value of the cardStatusWords property.
     *
     * @param value allowed object is     byte[]
     */
    public void setCardStatusWords(byte[] value) {
        this.cardStatusWords = value;
    }

}
