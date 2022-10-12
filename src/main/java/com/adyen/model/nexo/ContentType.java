package com.adyen.model.nexo;

import com.google.gson.annotations.SerializedName;

import java.util.Arrays;


/**
 * <p>Java class for ContentType.
 *
 * <p>The following schema fragment specifies the expected content contained within this class.
 *
 * <pre>
 * &lt;simpleType name="ContentType"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="id-data"/&gt;
 *     &lt;enumeration value="id-signedData"/&gt;
 *     &lt;enumeration value="id-envelopedData"/&gt;
 *     &lt;enumeration value="id-digestedData"/&gt;
 *     &lt;enumeration value="id-encryptedData"/&gt;
 *     &lt;enumeration value="id-ct-authData"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 */
public enum ContentType {


    /**
     * Generic, non cryptographic, or unqualified data content - (OID: iso(1) member-body(2) us(840) rsadsi(113549) pkcs(1) pkcs7(7) 1)
     */
    @SerializedName("id-data")
    ID_DATA("id-data"),

    /**
     * Signature CMS data content  - (OID: iso(1) member-body(2) us(840) rsadsi(113549) pkcs(1) pkcs7(7) 2)
     */
    @SerializedName("id-signedData")
    ID_SIGNED_DATA("id-signedData"),

    /**
     * Encrypted CMS data content, with encryption key - (OID: iso(1) member-body(2) us(840) rsadsi(113549) pkcs(1) pkcs7(7) 3)
     */
    @SerializedName("id-envelopedData")
    ID_ENVELOPED_DATA("id-envelopedData"),

    /**
     * Message digest CMS data content - (OID: iso(1) member-body(2) us(840) rsadsi(113549) pkcs(1) pkcs7(7) 5)
     */
    @SerializedName("id-digestedData")
    ID_DIGESTED_DATA("id-digestedData"),

    /**
     * Encrypted CMS data content - (OID: iso(1) member-body(2) us(840) rsadsi(113549) pkcs(1) pkcs7(7) 6)
     */
    @SerializedName("id-encryptedData")
    ID_ENCRYPTED_DATA("id-encryptedData"),

    /**
     * MAC CMS data content, with encryption key - (OID: iso(1) member- body(2) us(840) rsadsi(113549) pkcs(1) pkcs9(9) smime(16) ct(1) 2)
     */
    @SerializedName("id-ct-authData")
    ID_CT_AUTH_DATA("id-ct-authData");
    private final String value;

    ContentType(String v) {
        value = v;
    }

    /**
     * Value string.
     *
     * @return the string
     */
    public String value() {
        return value;
    }

    /**
     * From value content type.
     *
     * @param v the v
     * @return the content type
     */
    public static ContentType fromValue(String v) {
        return Arrays.stream(values()).
                filter(s -> s.value.equals(v)).
                findFirst().orElseThrow(() -> new IllegalArgumentException(v));
    }

}
