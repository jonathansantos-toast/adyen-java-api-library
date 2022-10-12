package com.adyen.model.nexo;

import com.google.gson.annotations.SerializedName;

import java.util.Arrays;


/**
 * <p>Java class for BarcodeType.
 *
 * <p>The following schema fragment specifies the expected content contained within this class.
 *
 * <pre>
 * &lt;simpleType name="BarcodeType"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="EAN8"/&gt;
 *     &lt;enumeration value="EAN13"/&gt;
 *     &lt;enumeration value="UPCA"/&gt;
 *     &lt;enumeration value="Code25"/&gt;
 *     &lt;enumeration value="Code128"/&gt;
 *     &lt;enumeration value="PDF417"/&gt;
 *     &lt;enumeration value="QRCode"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 */
public enum BarcodeType {

    /**
     * Ean 8 barcode type.
     */
    @SerializedName("EAN8")
    EAN_8("EAN8"),
    /**
     * Ean 13 barcode type.
     */
    @SerializedName("EAN13")
    EAN_13("EAN13"),
    /**
     * Upca barcode type.
     */
    UPCA("UPCA"),
    /**
     * Code 25 barcode type.
     */
    @SerializedName("Code25")
    CODE_25("Code25"),
    /**
     * Code 128 barcode type.
     */
    @SerializedName("Code128")
    CODE_128("Code128"),
    /**
     * Pdf 417 barcode type.
     */
    @SerializedName("PDF417")
    PDF_417("PDF417"),
    /**
     * Qrcode barcode type.
     */
    @SerializedName("QRCode")
    QRCODE("QRCode");
    private final String value;

    BarcodeType(String v) {
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
     * From value barcode type.
     *
     * @param v the v
     * @return the barcode type
     */
    public static BarcodeType fromValue(String v) {
        return Arrays.stream(values()).
                filter(s -> s.value.equals(v)).
                findFirst().orElseThrow(() -> new IllegalArgumentException(v));
    }

}
