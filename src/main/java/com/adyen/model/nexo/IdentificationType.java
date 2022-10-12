package com.adyen.model.nexo;

import com.google.gson.annotations.SerializedName;
import io.swagger.v3.oas.annotations.media.Schema;

import java.util.Arrays;


/**
 * <p>Java class for IdentificationType.
 *
 * <p>The following schema fragment specifies the expected content contained within this class.
 *
 * <pre>
 * &lt;simpleType name="IdentificationType"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="PAN"/&gt;
 *     &lt;enumeration value="ISOTrack2"/&gt;
 *     &lt;enumeration value="BarCode"/&gt;
 *     &lt;enumeration value="AccountNumber"/&gt;
 *     &lt;enumeration value="PhoneNumber"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 */
public enum IdentificationType {


    /**
     * Standard card identification (card number)
     */
    @SerializedName("PAN")
    PAN("PAN"),

    /**
     * ISO Track 2 including identification.
     */
    @SerializedName("ISOTrack2")
    @Schema(description = "ISO Track 2 including identification.")
    ISO_TRACK_2("ISOTrack2"),

    /**
     * Bar-code with a specific form of identification
     */
    @SerializedName("BarCode")
    @Schema(description = "Bar-code with a specific form of identification")
    BAR_CODE("BarCode"),

    /**
     * Account number
     */
    @SerializedName("AccountNumber")
    @Schema(description = "Account number")
    ACCOUNT_NUMBER("AccountNumber"),

    /**
     * A phone number identifies the account on which the phone card is assigned.
     */
    @SerializedName("PhoneNumber")
    @Schema(description = "A phone number identifies the account on which the phone card is assigned.")
    PHONE_NUMBER("PhoneNumber");
    private final String value;

    IdentificationType(String v) {
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
     * From value identification type.
     *
     * @param v the v
     * @return the identification type
     */
    public static IdentificationType fromValue(String v) {
        return Arrays.stream(values()).
                filter(s -> s.value.equals(v)).
                findFirst().orElseThrow(() -> new IllegalArgumentException(v));
    }

}
