package com.mssoftech.dbflute.bsentity;

import java.util.List;
import java.util.ArrayList;

import org.dbflute.Entity;
import org.dbflute.dbmeta.DBMeta;
import org.dbflute.dbmeta.AbstractEntity;
import org.dbflute.dbmeta.accessory.DomainEntity;
import org.dbflute.optional.OptionalEntity;
import com.mssoftech.dbflute.allcommon.DBMetaInstanceHandler;
import com.mssoftech.dbflute.exentity.*;

/**
 * The entity of purchase_payment as TABLE. <br>
 * 購入支払: 購入に対する支払。<br>
 * 分割払いもできるのでmanyとなり、会員からの孫テーブルのテストができてうれしい。
 * <pre>
 * [primary-key]
 *     purchase_payment_id
 * 
 * [column]
 *     purchase_payment_id, purchase_id, payment_amount, payment_datetime, payment_method_code, register_datetime, register_user, update_datetime, update_user
 * 
 * [sequence]
 *     purchase_payment_purchase_payment_id_seq
 * 
 * [identity]
 *     
 * 
 * [version-no]
 *     
 * 
 * [foreign table]
 *     purchase
 * 
 * [referrer table]
 *     
 * 
 * [foreign property]
 *     purchase
 * 
 * [referrer property]
 *     
 * 
 * [get/set template]
 * /= = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = =
 * Long purchasePaymentId = entity.getPurchasePaymentId();
 * Long purchaseId = entity.getPurchaseId();
 * java.math.BigDecimal paymentAmount = entity.getPaymentAmount();
 * java.time.LocalDateTime paymentDatetime = entity.getPaymentDatetime();
 * String paymentMethodCode = entity.getPaymentMethodCode();
 * java.time.LocalDateTime registerDatetime = entity.getRegisterDatetime();
 * String registerUser = entity.getRegisterUser();
 * java.time.LocalDateTime updateDatetime = entity.getUpdateDatetime();
 * String updateUser = entity.getUpdateUser();
 * entity.setPurchasePaymentId(purchasePaymentId);
 * entity.setPurchaseId(purchaseId);
 * entity.setPaymentAmount(paymentAmount);
 * entity.setPaymentDatetime(paymentDatetime);
 * entity.setPaymentMethodCode(paymentMethodCode);
 * entity.setRegisterDatetime(registerDatetime);
 * entity.setRegisterUser(registerUser);
 * entity.setUpdateDatetime(updateDatetime);
 * entity.setUpdateUser(updateUser);
 * = = = = = = = = = =/
 * </pre>
 * @author DBFlute(AutoGenerator)
 */
public abstract class BsPurchasePayment extends AbstractEntity implements DomainEntity {

    // ===================================================================================
    //                                                                          Definition
    //                                                                          ==========
    /** The serial version UID for object serialization. (Default) */
    private static final long serialVersionUID = 1L;

    // ===================================================================================
    //                                                                           Attribute
    //                                                                           =========
    /** purchase_payment_id: {PK, ID, NotNull, bigserial(19)} */
    protected Long _purchasePaymentId;

    /** purchase_id: {NotNull, int8(19), FK to purchase} */
    protected Long _purchaseId;

    /** payment_amount: {NotNull, numeric(10, 2)} */
    protected java.math.BigDecimal _paymentAmount;

    /** payment_datetime: {IX+, NotNull, timestamp(26, 3)} */
    protected java.time.LocalDateTime _paymentDatetime;

    /** payment_method_code: {NotNull, bpchar(3)} */
    protected String _paymentMethodCode;

    /** register_datetime: {NotNull, timestamp(26, 3)} */
    protected java.time.LocalDateTime _registerDatetime;

    /** register_user: {NotNull, varchar(200)} */
    protected String _registerUser;

    /** update_datetime: {NotNull, timestamp(26, 3)} */
    protected java.time.LocalDateTime _updateDatetime;

    /** update_user: {NotNull, varchar(200)} */
    protected String _updateUser;

    // ===================================================================================
    //                                                                             DB Meta
    //                                                                             =======
    /** {@inheritDoc} */
    public DBMeta asDBMeta() {
        return DBMetaInstanceHandler.findDBMeta(asTableDbName());
    }

    /** {@inheritDoc} */
    public String asTableDbName() {
        return "purchase_payment";
    }

    // ===================================================================================
    //                                                                        Key Handling
    //                                                                        ============
    /** {@inheritDoc} */
    public boolean hasPrimaryKeyValue() {
        if (_purchasePaymentId == null) { return false; }
        return true;
    }

    // ===================================================================================
    //                                                                    Foreign Property
    //                                                                    ================
    /** purchase by my purchase_id, named 'purchase'. */
    protected OptionalEntity<Purchase> _purchase;

    /**
     * [get] purchase by my purchase_id, named 'purchase'. <br>
     * Optional: alwaysPresent(), ifPresent().orElse(), get(), ...
     * @return The entity of foreign property 'purchase'. (NotNull, EmptyAllowed: when e.g. null FK column, no setupSelect)
     */
    public OptionalEntity<Purchase> getPurchase() {
        if (_purchase == null) { _purchase = OptionalEntity.relationEmpty(this, "purchase"); }
        return _purchase;
    }

    /**
     * [set] purchase by my purchase_id, named 'purchase'.
     * @param purchase The entity of foreign property 'purchase'. (NullAllowed)
     */
    public void setPurchase(OptionalEntity<Purchase> purchase) {
        _purchase = purchase;
    }

    // ===================================================================================
    //                                                                   Referrer Property
    //                                                                   =================
    protected <ELEMENT> List<ELEMENT> newReferrerList() {
        return new ArrayList<ELEMENT>();
    }

    // ===================================================================================
    //                                                                      Basic Override
    //                                                                      ==============
    @Override
    protected boolean doEquals(Object obj) {
        if (obj instanceof BsPurchasePayment) {
            BsPurchasePayment other = (BsPurchasePayment)obj;
            if (!xSV(_purchasePaymentId, other._purchasePaymentId)) { return false; }
            return true;
        } else {
            return false;
        }
    }

    @Override
    protected int doHashCode(int initial) {
        int hs = initial;
        hs = xCH(hs, asTableDbName());
        hs = xCH(hs, _purchasePaymentId);
        return hs;
    }

    @Override
    protected String doBuildStringWithRelation(String li) {
        StringBuilder sb = new StringBuilder();
        if (_purchase != null && _purchase.isPresent())
        { sb.append(li).append(xbRDS(_purchase, "purchase")); }
        return sb.toString();
    }
    protected <ET extends Entity> String xbRDS(org.dbflute.optional.OptionalEntity<ET> et, String name) { // buildRelationDisplayString()
        return et.get().buildDisplayString(name, true, true);
    }

    @Override
    protected String doBuildColumnString(String dm) {
        StringBuilder sb = new StringBuilder();
        sb.append(dm).append(xfND(_purchasePaymentId));
        sb.append(dm).append(xfND(_purchaseId));
        sb.append(dm).append(xfND(_paymentAmount));
        sb.append(dm).append(xfND(_paymentDatetime));
        sb.append(dm).append(xfND(_paymentMethodCode));
        sb.append(dm).append(xfND(_registerDatetime));
        sb.append(dm).append(xfND(_registerUser));
        sb.append(dm).append(xfND(_updateDatetime));
        sb.append(dm).append(xfND(_updateUser));
        if (sb.length() > dm.length()) {
            sb.delete(0, dm.length());
        }
        sb.insert(0, "{").append("}");
        return sb.toString();
    }

    @Override
    protected String doBuildRelationString(String dm) {
        StringBuilder sb = new StringBuilder();
        if (_purchase != null && _purchase.isPresent())
        { sb.append(dm).append("purchase"); }
        if (sb.length() > dm.length()) {
            sb.delete(0, dm.length()).insert(0, "(").append(")");
        }
        return sb.toString();
    }

    @Override
    public PurchasePayment clone() {
        return (PurchasePayment)super.clone();
    }

    // ===================================================================================
    //                                                                            Accessor
    //                                                                            ========
    /**
     * [get] purchase_payment_id: {PK, ID, NotNull, bigserial(19)} <br>
     * 購入支払ID: 連番
     * @return The value of the column 'purchase_payment_id'. (basically NotNull if selected: for the constraint)
     */
    public Long getPurchasePaymentId() {
        checkSpecifiedProperty("purchasePaymentId");
        return _purchasePaymentId;
    }

    /**
     * [set] purchase_payment_id: {PK, ID, NotNull, bigserial(19)} <br>
     * 購入支払ID: 連番
     * @param purchasePaymentId The value of the column 'purchase_payment_id'. (basically NotNull if update: for the constraint)
     */
    public void setPurchasePaymentId(Long purchasePaymentId) {
        registerModifiedProperty("purchasePaymentId");
        _purchasePaymentId = purchasePaymentId;
    }

    /**
     * [get] purchase_id: {NotNull, int8(19), FK to purchase} <br>
     * 購入ID: 支払い対象の購入へのID
     * @return The value of the column 'purchase_id'. (basically NotNull if selected: for the constraint)
     */
    public Long getPurchaseId() {
        checkSpecifiedProperty("purchaseId");
        return _purchaseId;
    }

    /**
     * [set] purchase_id: {NotNull, int8(19), FK to purchase} <br>
     * 購入ID: 支払い対象の購入へのID
     * @param purchaseId The value of the column 'purchase_id'. (basically NotNull if update: for the constraint)
     */
    public void setPurchaseId(Long purchaseId) {
        registerModifiedProperty("purchaseId");
        _purchaseId = purchaseId;
    }

    /**
     * [get] payment_amount: {NotNull, numeric(10, 2)} <br>
     * 支払金額: 支払った金額。さて、小数点なのはなぜでしょう？
     * @return The value of the column 'payment_amount'. (basically NotNull if selected: for the constraint)
     */
    public java.math.BigDecimal getPaymentAmount() {
        checkSpecifiedProperty("paymentAmount");
        return _paymentAmount;
    }

    /**
     * [set] payment_amount: {NotNull, numeric(10, 2)} <br>
     * 支払金額: 支払った金額。さて、小数点なのはなぜでしょう？
     * @param paymentAmount The value of the column 'payment_amount'. (basically NotNull if update: for the constraint)
     */
    public void setPaymentAmount(java.math.BigDecimal paymentAmount) {
        registerModifiedProperty("paymentAmount");
        _paymentAmount = paymentAmount;
    }

    /**
     * [get] payment_datetime: {IX+, NotNull, timestamp(26, 3)} <br>
     * 支払日時: 支払ったときの日時
     * @return The value of the column 'payment_datetime'. (basically NotNull if selected: for the constraint)
     */
    public java.time.LocalDateTime getPaymentDatetime() {
        checkSpecifiedProperty("paymentDatetime");
        return _paymentDatetime;
    }

    /**
     * [set] payment_datetime: {IX+, NotNull, timestamp(26, 3)} <br>
     * 支払日時: 支払ったときの日時
     * @param paymentDatetime The value of the column 'payment_datetime'. (basically NotNull if update: for the constraint)
     */
    public void setPaymentDatetime(java.time.LocalDateTime paymentDatetime) {
        registerModifiedProperty("paymentDatetime");
        _paymentDatetime = paymentDatetime;
    }

    /**
     * [get] payment_method_code: {NotNull, bpchar(3)} <br>
     * 支払方法コード: 手渡しや銀行振込など
     * @return The value of the column 'payment_method_code'. (basically NotNull if selected: for the constraint)
     */
    public String getPaymentMethodCode() {
        checkSpecifiedProperty("paymentMethodCode");
        return _paymentMethodCode;
    }

    /**
     * [set] payment_method_code: {NotNull, bpchar(3)} <br>
     * 支払方法コード: 手渡しや銀行振込など
     * @param paymentMethodCode The value of the column 'payment_method_code'. (basically NotNull if update: for the constraint)
     */
    public void setPaymentMethodCode(String paymentMethodCode) {
        registerModifiedProperty("paymentMethodCode");
        _paymentMethodCode = paymentMethodCode;
    }

    /**
     * [get] register_datetime: {NotNull, timestamp(26, 3)} <br>
     * @return The value of the column 'register_datetime'. (basically NotNull if selected: for the constraint)
     */
    public java.time.LocalDateTime getRegisterDatetime() {
        checkSpecifiedProperty("registerDatetime");
        return _registerDatetime;
    }

    /**
     * [set] register_datetime: {NotNull, timestamp(26, 3)} <br>
     * @param registerDatetime The value of the column 'register_datetime'. (basically NotNull if update: for the constraint)
     */
    public void setRegisterDatetime(java.time.LocalDateTime registerDatetime) {
        registerModifiedProperty("registerDatetime");
        _registerDatetime = registerDatetime;
    }

    /**
     * [get] register_user: {NotNull, varchar(200)} <br>
     * @return The value of the column 'register_user'. (basically NotNull if selected: for the constraint)
     */
    public String getRegisterUser() {
        checkSpecifiedProperty("registerUser");
        return _registerUser;
    }

    /**
     * [set] register_user: {NotNull, varchar(200)} <br>
     * @param registerUser The value of the column 'register_user'. (basically NotNull if update: for the constraint)
     */
    public void setRegisterUser(String registerUser) {
        registerModifiedProperty("registerUser");
        _registerUser = registerUser;
    }

    /**
     * [get] update_datetime: {NotNull, timestamp(26, 3)} <br>
     * @return The value of the column 'update_datetime'. (basically NotNull if selected: for the constraint)
     */
    public java.time.LocalDateTime getUpdateDatetime() {
        checkSpecifiedProperty("updateDatetime");
        return _updateDatetime;
    }

    /**
     * [set] update_datetime: {NotNull, timestamp(26, 3)} <br>
     * @param updateDatetime The value of the column 'update_datetime'. (basically NotNull if update: for the constraint)
     */
    public void setUpdateDatetime(java.time.LocalDateTime updateDatetime) {
        registerModifiedProperty("updateDatetime");
        _updateDatetime = updateDatetime;
    }

    /**
     * [get] update_user: {NotNull, varchar(200)} <br>
     * @return The value of the column 'update_user'. (basically NotNull if selected: for the constraint)
     */
    public String getUpdateUser() {
        checkSpecifiedProperty("updateUser");
        return _updateUser;
    }

    /**
     * [set] update_user: {NotNull, varchar(200)} <br>
     * @param updateUser The value of the column 'update_user'. (basically NotNull if update: for the constraint)
     */
    public void setUpdateUser(String updateUser) {
        registerModifiedProperty("updateUser");
        _updateUser = updateUser;
    }
}
