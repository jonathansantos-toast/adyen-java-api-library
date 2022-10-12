package com.adyen.model.nexo;

import com.google.gson.annotations.SerializedName;
import io.swagger.v3.oas.annotations.media.Schema;

import java.util.Arrays;


/**
 * <p>Java class for PrinterStatusType.
 *
 * <p>The following schema fragment specifies the expected content contained within this class.
 *
 * <pre>
 * &lt;simpleType name="PrinterStatusType"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="OK"/&gt;
 *     &lt;enumeration value="PaperLow"/&gt;
 *     &lt;enumeration value="NoPaper"/&gt;
 *     &lt;enumeration value="PaperJam"/&gt;
 *     &lt;enumeration value="OutOfOrder"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 */
public enum PrinterStatusType {


    /**
     * The printer is operational.
     */
    @SerializedName("OK")
    OK("OK"),

    /**
     * The printer is operational but paper roll is almost empty.
     */
    @SerializedName("PaperLow")
    @Schema(description = "The printer is operational but paper roll is almost empty.")
    PAPER_LOW("PaperLow"),

    /**
     * Paper roll is empty, an operator must insert a new paper roll.
     */
    @SerializedName("NoPaper")
    @Schema(description = "Paper roll is empty, an operator must insert a new paper roll.")
    NO_PAPER("NoPaper"),

    /**
     * An operator must remove the paper jam manually.
     */
    @SerializedName("PaperJam")
    @Schema(description = "An operator must remove the paper jam manually.")
    PAPER_JAM("PaperJam"),

    /**
     * The printer is out of order.
     */
    @SerializedName("OutOfOrder")
    @Schema(description = "The printer is out of order.")
    OUT_OF_ORDER("OutOfOrder");
    private final String value;

    PrinterStatusType(String v) {
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
     * From value printer status type.
     *
     * @param v the v
     * @return the printer status type
     */
    public static PrinterStatusType fromValue(String v) {
        return Arrays.stream(values()).
                filter(s -> s.value.equals(v)).
                findFirst().orElseThrow(() -> new IllegalArgumentException(v));
    }

}
