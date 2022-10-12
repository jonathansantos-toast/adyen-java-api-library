package com.adyen.model.nexo;

import com.google.gson.annotations.SerializedName;
import io.swagger.v3.oas.annotations.media.Schema;

import java.util.ArrayList;
import java.util.List;


/**
 * Definition: Functional profile of the Sale Terminal. -- Usage: Sent in the Login Request to identify the functions that might be requested by the Sale Terminal during the session.  The value of this data element contains:  One of the generic profile: Basic, Standard or Extended,   A list (possibly
 *
 * <p>Java class for SaleProfile complex type.
 *
 * <p>The following schema fragment specifies the expected content contained within this class.
 *
 * <pre>
 * &lt;complexType name="SaleProfile"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="ServiceProfiles" type="{}ServiceProfiles" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *       &lt;attribute name="GenericProfile" type="{}GenericProfileType" default="Standard" /&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 */
public class SaleProfile {

    /**
     * The Service profiles.
     */
    @SerializedName("ServiceProfiles")
    @Schema(description = "Service profiles of the Sale to POI protocol. --Rule: If a service profile could be requested")
    protected List<ServiceProfilesType> serviceProfiles;
    /**
     * The Generic profile.
     */
    @SerializedName("GenericProfile")
    @Schema(description = "Functional profile of the Sale to POI protocol.")
    protected GenericProfileType genericProfile;

    /**
     * Gets the value of the serviceProfiles property.
     * <p>
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the serviceProfiles property.
     * <p>
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getServiceProfiles().add(newItem);
     * </pre>
     * <p>
     * <p>
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ServiceProfilesType }
     *
     * @return the service profiles
     */
    public List<ServiceProfilesType> getServiceProfiles() {
        if (serviceProfiles == null) {
            serviceProfiles = new ArrayList<>();
        }
        return this.serviceProfiles;
    }

    /**
     * Gets the value of the genericProfile property.
     *
     * @return possible      object is     {@link GenericProfileType }
     */
    public GenericProfileType getGenericProfile() {
        if (genericProfile == null) {
            return GenericProfileType.STANDARD;
        } else {
            return genericProfile;
        }
    }

    /**
     * Sets the value of the genericProfile property.
     *
     * @param value allowed object is     {@link GenericProfileType }
     */
    public void setGenericProfile(GenericProfileType value) {
        this.genericProfile = value;
    }

}
