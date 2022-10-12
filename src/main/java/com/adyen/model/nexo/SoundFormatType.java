package com.adyen.model.nexo;

import com.google.gson.annotations.SerializedName;
import io.swagger.v3.oas.annotations.media.Schema;

import java.util.Arrays;


/**
 * <p>Java class for SoundFormatType.
 *
 * <p>The following schema fragment specifies the expected content contained within this class.
 *
 * <pre>
 * &lt;simpleType name="SoundFormatType"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="SoundRef"/&gt;
 *     &lt;enumeration value="MessageRef"/&gt;
 *     &lt;enumeration value="Text"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 */
public enum SoundFormatType {


    /**
     * Preloaded sound File.
     */
    @SerializedName("SoundRef")
    @Schema(description = "Preloaded sound File.")
    SOUND_REF("SoundRef"),

    /**
     * Reference of a preloaded text to play.
     */
    @SerializedName("MessageRef")
    @Schema(description = "Reference of a preloaded text to play.")
    MESSAGE_REF("MessageRef"),

    /**
     * Text to play.
     */
    @SerializedName("Text")
    @Schema(description = "Text to play.")
    TEXT("Text");
    private final String value;

    SoundFormatType(String v) {
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
     * From value sound format type.
     *
     * @param v the v
     * @return the sound format type
     */
    public static SoundFormatType fromValue(String v) {
        return Arrays.stream(values()).
                filter(s -> s.value.equals(v)).
                findFirst().orElseThrow(() -> new IllegalArgumentException(v));
    }

}
