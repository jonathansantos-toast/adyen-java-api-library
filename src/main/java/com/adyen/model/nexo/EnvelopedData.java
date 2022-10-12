package com.adyen.model.nexo;

import com.google.gson.annotations.SerializedName;

import java.util.ArrayList;
import java.util.List;


/**
 * Definition: Cryptographic Message Syntax (CMS) data structure containing encrypted data with encryption key -- Reference: RFC 3852: Cryptographic Message Syntax (CMS) -- Usage: This data structure contains:  the version of the data structure (which is v0 in EPAS protocol context)  the protected encrytion key for every adressee (recipient)  the encrypted data
 *
 * <p>Java class for EnvelopedData complex type.
 *
 * <p>The following schema fragment specifies the expected content contained within this class.
 *
 * <pre>
 * &lt;complexType name="EnvelopedData"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;choice maxOccurs="unbounded"&gt;
 *           &lt;element name="KeyTransport" type="{}KeyTransport"/&gt;
 *           &lt;element name="KEK" type="{}KEK"/&gt;
 *         &lt;/choice&gt;
 *         &lt;element name="EncryptedContent" type="{}EncryptedContent"/&gt;
 *       &lt;/sequence&gt;
 *       &lt;attribute name="Version" type="{}VersionType" default="v0" /&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 */
public class EnvelopedData {

    /**
     * The Encrypted content.
     */
    @SerializedName("EncryptedContent")
    protected EncryptedContent encryptedContent;
    /**
     * The Version.
     */
    @SerializedName("Version")
    protected VersionType version;

    /**
     * Gets the value of the encryptedContent property.
     *
     * @return possible      object is     {@link EncryptedContent }
     */
    public EncryptedContent getEncryptedContent() {
        return encryptedContent;
    }

    /**
     * Sets the value of the encryptedContent property.
     *
     * @param value allowed object is     {@link EncryptedContent }
     */
    public void setEncryptedContent(EncryptedContent value) {
        this.encryptedContent = value;
    }

    /**
     * Gets the value of the version property.
     *
     * @return possible      object is     {@link VersionType }
     */
    public VersionType getVersion() {
        if (version == null) {
            return VersionType.V_0;
        } else {
            return version;
        }
    }

    /**
     * Sets the value of the version property.
     *
     * @param value allowed object is     {@link VersionType }
     */
    public void setVersion(VersionType value) {
        this.version = value;
    }

}
