package com.adyen.model.nexo;

import com.google.gson.annotations.SerializedName;
import io.swagger.v3.oas.annotations.media.Schema;

import java.util.Arrays;


/**
 * <p>Java class for PINRequestType.
 *
 * <p>The following schema fragment specifies the expected content contained within this class.
 *
 * <pre>
 * &lt;simpleType name="PINRequestType"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="PINVerify"/&gt;
 *     &lt;enumeration value="PINVerifyOnly"/&gt;
 *     &lt;enumeration value="PINEnter"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 */
public enum PINRequestType {


    /**
     * The PIN Entering and Verify.
     */
    @SerializedName("PINVerify")
    @Schema(description = "The PIN Entering and Verify.")
    PIN_VERIFY("PINVerify"),

    /**
     * The PIN Verify only, the PIN is entered before and the PIN Block (encrypted PIN) is provided.
     */
    @SerializedName("PINVerifyOnly")
    @Schema(description = "The PIN Verify only, the PIN is entered before and the PIN Block (encrypted PIN) is provided.")
    PIN_VERIFY_ONLY("PINVerifyOnly"),

    /**
     * The PIN is entered by the Cardholder, encrypted by the POI, and provided as a result.
     */
    @SerializedName("PINEnter")
    @Schema(description = "The PIN is entered by the Cardholder, encrypted by the POI, and provided as a result.")
    PIN_ENTER("PINEnter");
    private final String value;

    PINRequestType(String v) {
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
     * From value pin request type.
     *
     * @param v the v
     * @return the pin request type
     */
    public static PINRequestType fromValue(String v) {
        return Arrays.stream(values()).
                filter(s -> s.value.equals(v)).
                findFirst().orElseThrow(() -> new IllegalArgumentException(v));
    }

}
