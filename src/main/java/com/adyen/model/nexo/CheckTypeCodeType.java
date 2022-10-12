package com.adyen.model.nexo;

import com.google.gson.annotations.SerializedName;

import java.util.Arrays;


/**
 * <p>Java class for CheckTypeCodeType.
 *
 * <p>The following schema fragment specifies the expected content contained within this class.
 *
 * <pre>
 * &lt;simpleType name="CheckTypeCodeType"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="Personal"/&gt;
 *     &lt;enumeration value="Company"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 */
public enum CheckTypeCodeType {

    /**
     * Personal check type code type.
     */
    @SerializedName("Personal")
    PERSONAL("Personal"),
    /**
     * Company check type code type.
     */
    @SerializedName("Company")
    COMPANY("Company");
    private final String value;

    CheckTypeCodeType(String v) {
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
     * From value check type code type.
     *
     * @param v the v
     * @return the check type code type
     */
    public static CheckTypeCodeType fromValue(String v) {
        return Arrays.stream(values()).
                filter(s -> s.value.equals(v)).
                findFirst().orElseThrow(() -> new IllegalArgumentException(v));
    }

}
