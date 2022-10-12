package com.adyen.model.nexo;

import com.google.gson.annotations.SerializedName;

import java.util.Arrays;


/**
 * <p>Java class for CharacterStyleType.
 *
 * <p>The following schema fragment specifies the expected content contained within this class.
 *
 * <pre>
 * &lt;simpleType name="CharacterStyleType"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="Normal"/&gt;
 *     &lt;enumeration value="Bold"/&gt;
 *     &lt;enumeration value="Italic"/&gt;
 *     &lt;enumeration value="Underlined"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 */
public enum CharacterStyleType {

    /**
     * Normal character style type.
     */
    @SerializedName("Normal")
    NORMAL("Normal"),
    /**
     * Bold character style type.
     */
    @SerializedName("Bold")
    BOLD("Bold"),
    /**
     * Italic character style type.
     */
    @SerializedName("Italic")
    ITALIC("Italic"),
    /**
     * Underlined character style type.
     */
    @SerializedName("Underlined")
    UNDERLINED("Underlined");
    private final String value;

    CharacterStyleType(String v) {
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
     * From value character style type.
     *
     * @param v the v
     * @return the character style type
     */
    public static CharacterStyleType fromValue(String v) {
        return Arrays.stream(values()).
                filter(s -> s.value.equals(v)).
                findFirst().orElseThrow(() -> new IllegalArgumentException(v));
    }

}
