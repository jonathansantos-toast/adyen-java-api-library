package com.adyen.model.nexo;

import com.google.gson.annotations.SerializedName;
import io.swagger.v3.oas.annotations.media.Schema;

import java.util.Arrays;


/**
 * <p>Java class for ServicesEnabledType.
 *
 * <p>The following schema fragment specifies the expected content contained within this class.
 *
 * <pre>
 * &lt;simpleType name="ServicesEnabledType"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="CardAcquisition"/&gt;
 *     &lt;enumeration value="Payment"/&gt;
 *     &lt;enumeration value="Loyalty"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 */
public enum ServicesEnabledType {


    /**
     * Enable the POI to process a card acquisition before the request of the Sale System (e.g. the same processing than the CardAcquisition command, but no more)
     */
    @SerializedName("CardAcquisition")
    @Schema(description = "Enable the POI to process a card acquisition before the request of the Sale System (e.g. the same processing than the CardAcquisition command, but no more)")
    CARD_ACQUISITION("CardAcquisition"),

    /**
     * Enable the POI to start a payment transaction before the request of the Sale System (e.g. the same processing than the Payment command)
     */
    @SerializedName("Payment")
    @Schema(description = "Enable the POI to start a payment transaction before the request of the Sale System (e.g. the same processing than the Payment command)")
    PAYMENT("Payment"),

    /**
     * Enable the POI to start a loyalty transaction before the request of the Sale System (e.g. the same processing than the Loyalty command)
     */
    @SerializedName("Loyalty")
    @Schema(description = "Enable the POI to start a loyalty transaction before the request of the Sale System (e.g. the same processing than the Loyalty command)")
    LOYALTY("Loyalty");
    private final String value;

    ServicesEnabledType(String v) {
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
     * From value services enabled type.
     *
     * @param v the v
     * @return the services enabled type
     */
    public static ServicesEnabledType fromValue(String v) {
        return Arrays.stream(values()).
                filter(s -> s.value.equals(v)).
                findFirst().orElseThrow(() -> new IllegalArgumentException(v));
    }

}
