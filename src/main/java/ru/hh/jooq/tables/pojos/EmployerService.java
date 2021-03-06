/*
 * This file is generated by jOOQ.
*/
package ru.hh.jooq.tables.pojos;


import java.io.Serializable;
import java.time.LocalDate;
import java.time.LocalDateTime;


/**
 * This class is generated by jOOQ.
 */
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class EmployerService implements Serializable {

    private static final long serialVersionUID = -441438357;

    private final Integer       employerServiceId;
    private final Integer       serviceId;
    private final LocalDateTime creationTime;
    private final Long          price;
    private final Integer       buyedByManagerId;
    private final Integer       number;
    private final Integer       billId;
    private final Boolean       isCredit;
    private final LocalDateTime activationTime;
    private final LocalDateTime expirationTime;
    private final Integer       payerId;
    private final Integer       orderId;
    private final LocalDate     countableExpireDate;
    private final Long          paidCost;
    private final Long          paidCostFix;
    private final Integer       accountId;
    private final String        currency;
    private final Boolean       welcomePack;
    private final Boolean       cancelationWaiting;
    private final Integer       digestVersion;
    private final Boolean       specialOffer;
    private final Integer       prolongates;
    private final LocalDateTime lastNotificationDate;
    private final LocalDateTime firstActivationTime;
    private final Long          priceRollback;
    private final Long          paidCostRollback;
    private final Long          paidCostFixRollback;

    public EmployerService(EmployerService value) {
        this.employerServiceId = value.employerServiceId;
        this.serviceId = value.serviceId;
        this.creationTime = value.creationTime;
        this.price = value.price;
        this.buyedByManagerId = value.buyedByManagerId;
        this.number = value.number;
        this.billId = value.billId;
        this.isCredit = value.isCredit;
        this.activationTime = value.activationTime;
        this.expirationTime = value.expirationTime;
        this.payerId = value.payerId;
        this.orderId = value.orderId;
        this.countableExpireDate = value.countableExpireDate;
        this.paidCost = value.paidCost;
        this.paidCostFix = value.paidCostFix;
        this.accountId = value.accountId;
        this.currency = value.currency;
        this.welcomePack = value.welcomePack;
        this.cancelationWaiting = value.cancelationWaiting;
        this.digestVersion = value.digestVersion;
        this.specialOffer = value.specialOffer;
        this.prolongates = value.prolongates;
        this.lastNotificationDate = value.lastNotificationDate;
        this.firstActivationTime = value.firstActivationTime;
        this.priceRollback = value.priceRollback;
        this.paidCostRollback = value.paidCostRollback;
        this.paidCostFixRollback = value.paidCostFixRollback;
    }

    public EmployerService(
        Integer       employerServiceId,
        Integer       serviceId,
        LocalDateTime creationTime,
        Long          price,
        Integer       buyedByManagerId,
        Integer       number,
        Integer       billId,
        Boolean       isCredit,
        LocalDateTime activationTime,
        LocalDateTime expirationTime,
        Integer       payerId,
        Integer       orderId,
        LocalDate     countableExpireDate,
        Long          paidCost,
        Long          paidCostFix,
        Integer       accountId,
        String        currency,
        Boolean       welcomePack,
        Boolean       cancelationWaiting,
        Integer       digestVersion,
        Boolean       specialOffer,
        Integer       prolongates,
        LocalDateTime lastNotificationDate,
        LocalDateTime firstActivationTime,
        Long          priceRollback,
        Long          paidCostRollback,
        Long          paidCostFixRollback
    ) {
        this.employerServiceId = employerServiceId;
        this.serviceId = serviceId;
        this.creationTime = creationTime;
        this.price = price;
        this.buyedByManagerId = buyedByManagerId;
        this.number = number;
        this.billId = billId;
        this.isCredit = isCredit;
        this.activationTime = activationTime;
        this.expirationTime = expirationTime;
        this.payerId = payerId;
        this.orderId = orderId;
        this.countableExpireDate = countableExpireDate;
        this.paidCost = paidCost;
        this.paidCostFix = paidCostFix;
        this.accountId = accountId;
        this.currency = currency;
        this.welcomePack = welcomePack;
        this.cancelationWaiting = cancelationWaiting;
        this.digestVersion = digestVersion;
        this.specialOffer = specialOffer;
        this.prolongates = prolongates;
        this.lastNotificationDate = lastNotificationDate;
        this.firstActivationTime = firstActivationTime;
        this.priceRollback = priceRollback;
        this.paidCostRollback = paidCostRollback;
        this.paidCostFixRollback = paidCostFixRollback;
    }

    public Integer getEmployerServiceId() {
        return this.employerServiceId;
    }

    public Integer getServiceId() {
        return this.serviceId;
    }

    public LocalDateTime getCreationTime() {
        return this.creationTime;
    }

    public Long getPrice() {
        return this.price;
    }

    public Integer getBuyedByManagerId() {
        return this.buyedByManagerId;
    }

    public Integer getNumber() {
        return this.number;
    }

    public Integer getBillId() {
        return this.billId;
    }

    public Boolean getIsCredit() {
        return this.isCredit;
    }

    public LocalDateTime getActivationTime() {
        return this.activationTime;
    }

    public LocalDateTime getExpirationTime() {
        return this.expirationTime;
    }

    public Integer getPayerId() {
        return this.payerId;
    }

    public Integer getOrderId() {
        return this.orderId;
    }

    public LocalDate getCountableExpireDate() {
        return this.countableExpireDate;
    }

    public Long getPaidCost() {
        return this.paidCost;
    }

    public Long getPaidCostFix() {
        return this.paidCostFix;
    }

    public Integer getAccountId() {
        return this.accountId;
    }

    public String getCurrency() {
        return this.currency;
    }

    public Boolean getWelcomePack() {
        return this.welcomePack;
    }

    public Boolean getCancelationWaiting() {
        return this.cancelationWaiting;
    }

    public Integer getDigestVersion() {
        return this.digestVersion;
    }

    public Boolean getSpecialOffer() {
        return this.specialOffer;
    }

    public Integer getProlongates() {
        return this.prolongates;
    }

    public LocalDateTime getLastNotificationDate() {
        return this.lastNotificationDate;
    }

    public LocalDateTime getFirstActivationTime() {
        return this.firstActivationTime;
    }

    public Long getPriceRollback() {
        return this.priceRollback;
    }

    public Long getPaidCostRollback() {
        return this.paidCostRollback;
    }

    public Long getPaidCostFixRollback() {
        return this.paidCostFixRollback;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder("EmployerService (");

        sb.append(employerServiceId);
        sb.append(", ").append(serviceId);
        sb.append(", ").append(creationTime);
        sb.append(", ").append(price);
        sb.append(", ").append(buyedByManagerId);
        sb.append(", ").append(number);
        sb.append(", ").append(billId);
        sb.append(", ").append(isCredit);
        sb.append(", ").append(activationTime);
        sb.append(", ").append(expirationTime);
        sb.append(", ").append(payerId);
        sb.append(", ").append(orderId);
        sb.append(", ").append(countableExpireDate);
        sb.append(", ").append(paidCost);
        sb.append(", ").append(paidCostFix);
        sb.append(", ").append(accountId);
        sb.append(", ").append(currency);
        sb.append(", ").append(welcomePack);
        sb.append(", ").append(cancelationWaiting);
        sb.append(", ").append(digestVersion);
        sb.append(", ").append(specialOffer);
        sb.append(", ").append(prolongates);
        sb.append(", ").append(lastNotificationDate);
        sb.append(", ").append(firstActivationTime);
        sb.append(", ").append(priceRollback);
        sb.append(", ").append(paidCostRollback);
        sb.append(", ").append(paidCostFixRollback);

        sb.append(")");
        return sb.toString();
    }
}
