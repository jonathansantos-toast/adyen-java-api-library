package com.adyen.model.nexo;

import com.google.gson.annotations.SerializedName;
import io.swagger.v3.oas.annotations.media.Schema;

import java.math.BigDecimal;
import java.math.BigInteger;


/**
 * Definition: Totals of the payment transaction during the reconciliation period.
 *
 * <p>Java class for PaymentTotals complex type.
 *
 * <p>The following schema fragment specifies the expected content contained within this class.
 *
 * <pre>
 * &lt;complexType name="PaymentTotals"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;attribute name="Transaction" use="required" type="{}TransactionType" /&gt;
 *       &lt;attribute name="TransactionCount" use="required" type="{}TransactionCount" /&gt;
 *       &lt;attribute name="TransactionAmount" use="required" type="{}SimpleAmountType" /&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 */
public class PaymentTotals {

    /**
     * The Transaction.
     */
    @SerializedName("TransactionType")
    @Schema(description = "Type of transaction for which totals are grouped. --Rule: Debit, Credit, ReverseDebit, ReverseCredit, OneTimeReservation, CompletedDeffered, FirstReservation, UpdateReservation,")
    protected TransactionType transactionType;
    /**
     * The Transaction count.
     */
    @SerializedName("TransactionCount")
    @Schema(description = "Number of processed transaction during the period.")
    protected BigInteger transactionCount;
    /**
     * The Transaction amount.
     */
    @SerializedName("TransactionAmount")
    @Schema(description = "Sum of amount of processed transaction during the period.")
    protected BigDecimal transactionAmount;

    /**
     * Gets the value of the transactionType property.
     *
     * @return possible      object is     {@link TransactionType }
     */
    public TransactionType getTransactionType() {
        return transactionType;
    }

    /**
     * Sets the value of the transactionType property.
     *
     * @param value allowed object is     {@link TransactionType }
     */
    public void setTransactionType(TransactionType value) {
        this.transactionType = value;
    }

    /**
     * Gets the value of the transactionCount property.
     *
     * @return possible      object is     {@link BigInteger }
     */
    public BigInteger getTransactionCount() {
        return transactionCount;
    }

    /**
     * Sets the value of the transactionCount property.
     *
     * @param value allowed object is     {@link BigInteger }
     */
    public void setTransactionCount(BigInteger value) {
        this.transactionCount = value;
    }

    /**
     * Gets the value of the transactionAmount property.
     *
     * @return possible      object is     {@link BigDecimal }
     */
    public BigDecimal getTransactionAmount() {
        return transactionAmount;
    }

    /**
     * Sets the value of the transactionAmount property.
     *
     * @param value allowed object is     {@link BigDecimal }
     */
    public void setTransactionAmount(BigDecimal value) {
        this.transactionAmount = value;
    }

}
