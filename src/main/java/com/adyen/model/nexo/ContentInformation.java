package com.adyen.model.nexo;

import com.google.gson.annotations.SerializedName;


/**
 * Definition: General Cryptographic Message Syntax (CMS) data structure -- Reference: RFC 3852: Cryptographic Message Syntax (CMS) -- Usage: This data structure contains two data elements:  The type of content of the CMS data structure   The content itself These CMS data structures could be nested to allow a sequence of cryptographic processings on a part of a messageType (e.g.
 *
 * <p>Java class for ContentInformation complex type.
 *
 * <p>The following schema fragment specifies the expected content contained within this class.
 *
 * <pre>
 * &lt;complexType name="ContentInformation"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;choice&gt;
 *           &lt;element name="EnvelopedData" type="{}EnvelopedData"/&gt;
 *           &lt;element name="AuthenticatedData" type="{}AuthenticatedData"/&gt;
 *           &lt;element name="SignedData" type="{}SignedData"/&gt;
 *           &lt;element name="DigestedData" type="{}DigestedData"/&gt;
 *           &lt;element name="NamedKeyEncryptedData" type="{}NamedKeyEncryptedData"/&gt;
 *         &lt;/choice&gt;
 *       &lt;/sequence&gt;
 *       &lt;attribute name="Content" use="required" type="{}ContentType" /&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 */
public class ContentInformation {

    /**
     * The Enveloped data.
     */
    @SerializedName("EnvelopedData")
    protected EnvelopedData envelopedData;
    /**
     * The Authenticated data.
     */
    @SerializedName("AuthenticatedData")
    protected AuthenticatedData authenticatedData;
    /**
     * The Signed data.
     */
    @SerializedName("SignedData")
    protected SignedData signedData;
    /**
     * The Digested data.
     */
    @SerializedName("DigestedData")
    protected DigestedData digestedData;
    /**
     * The Named key encrypted data.
     */
    @SerializedName("NamedKeyEncryptedData")
    protected NamedKeyEncryptedData namedKeyEncryptedData;
    /**
     * The Content.
     */
    @SerializedName("ContentType")
    protected ContentType contentType;

    /**
     * Gets the value of the envelopedData property.
     *
     * @return possible      object is     {@link EnvelopedData }
     */
    public EnvelopedData getEnvelopedData() {
        return envelopedData;
    }

    /**
     * Sets the value of the envelopedData property.
     *
     * @param value allowed object is     {@link EnvelopedData }
     */
    public void setEnvelopedData(EnvelopedData value) {
        this.envelopedData = value;
    }

    /**
     * Gets the value of the authenticatedData property.
     *
     * @return possible      object is     {@link AuthenticatedData }
     */
    public AuthenticatedData getAuthenticatedData() {
        return authenticatedData;
    }

    /**
     * Sets the value of the authenticatedData property.
     *
     * @param value allowed object is     {@link AuthenticatedData }
     */
    public void setAuthenticatedData(AuthenticatedData value) {
        this.authenticatedData = value;
    }

    /**
     * Gets the value of the signedData property.
     *
     * @return possible      object is     {@link SignedData }
     */
    public SignedData getSignedData() {
        return signedData;
    }

    /**
     * Sets the value of the signedData property.
     *
     * @param value allowed object is     {@link SignedData }
     */
    public void setSignedData(SignedData value) {
        this.signedData = value;
    }

    /**
     * Gets the value of the digestedData property.
     *
     * @return possible      object is     {@link DigestedData }
     */
    public DigestedData getDigestedData() {
        return digestedData;
    }

    /**
     * Sets the value of the digestedData property.
     *
     * @param value allowed object is     {@link DigestedData }
     */
    public void setDigestedData(DigestedData value) {
        this.digestedData = value;
    }

    /**
     * Gets the value of the namedKeyEncryptedData property.
     *
     * @return possible      object is     {@link NamedKeyEncryptedData }
     */
    public NamedKeyEncryptedData getNamedKeyEncryptedData() {
        return namedKeyEncryptedData;
    }

    /**
     * Sets the value of the namedKeyEncryptedData property.
     *
     * @param value allowed object is     {@link NamedKeyEncryptedData }
     */
    public void setNamedKeyEncryptedData(NamedKeyEncryptedData value) {
        this.namedKeyEncryptedData = value;
    }

    /**
     * Gets the value of the contentType property.
     *
     * @return possible      object is     {@link ContentType }
     */
    public ContentType getContentType() {
        return contentType;
    }

    /**
     * Sets the value of the contentType property.
     *
     * @param value allowed object is     {@link ContentType }
     */
    public void setContentType(ContentType value) {
        this.contentType = value;
    }

}
