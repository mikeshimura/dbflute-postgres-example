package com.mssoftech.dbflute.cbean.cq.bs;

import java.util.*;

import org.dbflute.cbean.*;
import org.dbflute.cbean.chelper.*;
import org.dbflute.cbean.ckey.*;
import org.dbflute.cbean.coption.*;
import org.dbflute.cbean.cvalue.ConditionValue;
import org.dbflute.cbean.ordering.*;
import org.dbflute.cbean.scoping.*;
import org.dbflute.cbean.sqlclause.SqlClause;
import org.dbflute.dbmeta.DBMetaProvider;
import com.mssoftech.dbflute.allcommon.*;
import com.mssoftech.dbflute.cbean.*;
import com.mssoftech.dbflute.cbean.cq.*;

/**
 * The abstract condition-query of purchase.
 * @author DBFlute(AutoGenerator)
 */
public abstract class AbstractBsPurchaseCQ extends AbstractConditionQuery {

    // ===================================================================================
    //                                                                         Constructor
    //                                                                         ===========
    public AbstractBsPurchaseCQ(ConditionQuery referrerQuery, SqlClause sqlClause, String aliasName, int nestLevel) {
        super(referrerQuery, sqlClause, aliasName, nestLevel);
    }

    // ===================================================================================
    //                                                                             DB Meta
    //                                                                             =======
    @Override
    protected DBMetaProvider xgetDBMetaProvider() {
        return DBMetaInstanceHandler.getProvider();
    }

    public String asTableDbName() {
        return "purchase";
    }

    // ===================================================================================
    //                                                                               Query
    //                                                                               =====
    /**
     * Equal(=). And NullIgnored, OnlyOnceRegistered. <br>
     * purchase_id: {PK, ID, NotNull, bigserial(19)}
     * @param purchaseId The value of purchaseId as equal. (NullAllowed: if null, no condition)
     */
    public void setPurchaseId_Equal(Long purchaseId) {
        doSetPurchaseId_Equal(purchaseId);
    }

    protected void doSetPurchaseId_Equal(Long purchaseId) {
        regPurchaseId(CK_EQ, purchaseId);
    }

    /**
     * NotEqual(&lt;&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * purchase_id: {PK, ID, NotNull, bigserial(19)}
     * @param purchaseId The value of purchaseId as notEqual. (NullAllowed: if null, no condition)
     */
    public void setPurchaseId_NotEqual(Long purchaseId) {
        doSetPurchaseId_NotEqual(purchaseId);
    }

    protected void doSetPurchaseId_NotEqual(Long purchaseId) {
        regPurchaseId(CK_NES, purchaseId);
    }

    /**
     * GreaterThan(&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * purchase_id: {PK, ID, NotNull, bigserial(19)}
     * @param purchaseId The value of purchaseId as greaterThan. (NullAllowed: if null, no condition)
     */
    public void setPurchaseId_GreaterThan(Long purchaseId) {
        regPurchaseId(CK_GT, purchaseId);
    }

    /**
     * LessThan(&lt;). And NullIgnored, OnlyOnceRegistered. <br>
     * purchase_id: {PK, ID, NotNull, bigserial(19)}
     * @param purchaseId The value of purchaseId as lessThan. (NullAllowed: if null, no condition)
     */
    public void setPurchaseId_LessThan(Long purchaseId) {
        regPurchaseId(CK_LT, purchaseId);
    }

    /**
     * GreaterEqual(&gt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * purchase_id: {PK, ID, NotNull, bigserial(19)}
     * @param purchaseId The value of purchaseId as greaterEqual. (NullAllowed: if null, no condition)
     */
    public void setPurchaseId_GreaterEqual(Long purchaseId) {
        regPurchaseId(CK_GE, purchaseId);
    }

    /**
     * LessEqual(&lt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * purchase_id: {PK, ID, NotNull, bigserial(19)}
     * @param purchaseId The value of purchaseId as lessEqual. (NullAllowed: if null, no condition)
     */
    public void setPurchaseId_LessEqual(Long purchaseId) {
        regPurchaseId(CK_LE, purchaseId);
    }

    /**
     * RangeOf with various options. (versatile) <br>
     * {(default) minNumber &lt;= column &lt;= maxNumber} <br>
     * And NullIgnored, OnlyOnceRegistered. <br>
     * purchase_id: {PK, ID, NotNull, bigserial(19)}
     * @param minNumber The min number of purchaseId. (NullAllowed: if null, no from-condition)
     * @param maxNumber The max number of purchaseId. (NullAllowed: if null, no to-condition)
     * @param opLambda The callback for option of range-of. (NotNull)
     */
    public void setPurchaseId_RangeOf(Long minNumber, Long maxNumber, ConditionOptionCall<RangeOfOption> opLambda) {
        setPurchaseId_RangeOf(minNumber, maxNumber, xcROOP(opLambda));
    }

    /**
     * RangeOf with various options. (versatile) <br>
     * {(default) minNumber &lt;= column &lt;= maxNumber} <br>
     * And NullIgnored, OnlyOnceRegistered. <br>
     * purchase_id: {PK, ID, NotNull, bigserial(19)}
     * @param minNumber The min number of purchaseId. (NullAllowed: if null, no from-condition)
     * @param maxNumber The max number of purchaseId. (NullAllowed: if null, no to-condition)
     * @param rangeOfOption The option of range-of. (NotNull)
     */
    protected void setPurchaseId_RangeOf(Long minNumber, Long maxNumber, RangeOfOption rangeOfOption) {
        regROO(minNumber, maxNumber, xgetCValuePurchaseId(), "purchase_id", rangeOfOption);
    }

    /**
     * InScope {in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * purchase_id: {PK, ID, NotNull, bigserial(19)}
     * @param purchaseIdList The collection of purchaseId as inScope. (NullAllowed: if null (or empty), no condition)
     */
    public void setPurchaseId_InScope(Collection<Long> purchaseIdList) {
        doSetPurchaseId_InScope(purchaseIdList);
    }

    protected void doSetPurchaseId_InScope(Collection<Long> purchaseIdList) {
        regINS(CK_INS, cTL(purchaseIdList), xgetCValuePurchaseId(), "purchase_id");
    }

    /**
     * NotInScope {not in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * purchase_id: {PK, ID, NotNull, bigserial(19)}
     * @param purchaseIdList The collection of purchaseId as notInScope. (NullAllowed: if null (or empty), no condition)
     */
    public void setPurchaseId_NotInScope(Collection<Long> purchaseIdList) {
        doSetPurchaseId_NotInScope(purchaseIdList);
    }

    protected void doSetPurchaseId_NotInScope(Collection<Long> purchaseIdList) {
        regINS(CK_NINS, cTL(purchaseIdList), xgetCValuePurchaseId(), "purchase_id");
    }

    /**
     * Set up ExistsReferrer (correlated sub-query). <br>
     * {exists (select purchase_id from purchase_payment where ...)} <br>
     * purchase_payment by purchase_id, named 'purchasePaymentAsOne'.
     * <pre>
     * cb.query().<span style="color: #CC4747">existsPurchasePayment</span>(paymentCB <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     paymentCB.query().set...
     * });
     * </pre>
     * @param subCBLambda The callback for sub-query of PurchasePaymentList for 'exists'. (NotNull)
     */
    public void existsPurchasePayment(SubQuery<PurchasePaymentCB> subCBLambda) {
        assertObjectNotNull("subCBLambda", subCBLambda);
        PurchasePaymentCB cb = new PurchasePaymentCB(); cb.xsetupForExistsReferrer(this);
        lockCall(() -> subCBLambda.query(cb)); String pp = keepPurchaseId_ExistsReferrer_PurchasePaymentList(cb.query());
        registerExistsReferrer(cb.query(), "purchase_id", "purchase_id", pp, "purchasePaymentList");
    }
    public abstract String keepPurchaseId_ExistsReferrer_PurchasePaymentList(PurchasePaymentCQ sq);

    /**
     * Set up NotExistsReferrer (correlated sub-query). <br>
     * {not exists (select purchase_id from purchase_payment where ...)} <br>
     * purchase_payment by purchase_id, named 'purchasePaymentAsOne'.
     * <pre>
     * cb.query().<span style="color: #CC4747">notExistsPurchasePayment</span>(paymentCB <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     paymentCB.query().set...
     * });
     * </pre>
     * @param subCBLambda The callback for sub-query of PurchaseId_NotExistsReferrer_PurchasePaymentList for 'not exists'. (NotNull)
     */
    public void notExistsPurchasePayment(SubQuery<PurchasePaymentCB> subCBLambda) {
        assertObjectNotNull("subCBLambda", subCBLambda);
        PurchasePaymentCB cb = new PurchasePaymentCB(); cb.xsetupForExistsReferrer(this);
        lockCall(() -> subCBLambda.query(cb)); String pp = keepPurchaseId_NotExistsReferrer_PurchasePaymentList(cb.query());
        registerNotExistsReferrer(cb.query(), "purchase_id", "purchase_id", pp, "purchasePaymentList");
    }
    public abstract String keepPurchaseId_NotExistsReferrer_PurchasePaymentList(PurchasePaymentCQ sq);

    public void xsderivePurchasePaymentList(String fn, SubQuery<PurchasePaymentCB> sq, String al, DerivedReferrerOption op) {
        assertObjectNotNull("subQuery", sq);
        PurchasePaymentCB cb = new PurchasePaymentCB(); cb.xsetupForDerivedReferrer(this);
        lockCall(() -> sq.query(cb)); String pp = keepPurchaseId_SpecifyDerivedReferrer_PurchasePaymentList(cb.query());
        registerSpecifyDerivedReferrer(fn, cb.query(), "purchase_id", "purchase_id", pp, "purchasePaymentList", al, op);
    }
    public abstract String keepPurchaseId_SpecifyDerivedReferrer_PurchasePaymentList(PurchasePaymentCQ sq);

    /**
     * Prepare for (Query)DerivedReferrer (correlated sub-query). <br>
     * {FOO &lt;= (select max(BAR) from purchase_payment where ...)} <br>
     * purchase_payment by purchase_id, named 'purchasePaymentAsOne'.
     * <pre>
     * cb.query().<span style="color: #CC4747">derivedPurchasePayment()</span>.<span style="color: #CC4747">max</span>(paymentCB <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     paymentCB.specify().<span style="color: #CC4747">columnFoo...</span> <span style="color: #3F7E5E">// derived column by function</span>
     *     paymentCB.query().setBar... <span style="color: #3F7E5E">// referrer condition</span>
     * }).<span style="color: #CC4747">greaterEqual</span>(123); <span style="color: #3F7E5E">// condition to derived column</span>
     * </pre>
     * @return The object to set up a function for referrer table. (NotNull)
     */
    public HpQDRFunction<PurchasePaymentCB> derivedPurchasePayment() {
        return xcreateQDRFunctionPurchasePaymentList();
    }
    protected HpQDRFunction<PurchasePaymentCB> xcreateQDRFunctionPurchasePaymentList() {
        return xcQDRFunc((fn, sq, rd, vl, op) -> xqderivePurchasePaymentList(fn, sq, rd, vl, op));
    }
    public void xqderivePurchasePaymentList(String fn, SubQuery<PurchasePaymentCB> sq, String rd, Object vl, DerivedReferrerOption op) {
        assertObjectNotNull("subQuery", sq);
        PurchasePaymentCB cb = new PurchasePaymentCB(); cb.xsetupForDerivedReferrer(this);
        lockCall(() -> sq.query(cb)); String sqpp = keepPurchaseId_QueryDerivedReferrer_PurchasePaymentList(cb.query()); String prpp = keepPurchaseId_QueryDerivedReferrer_PurchasePaymentListParameter(vl);
        registerQueryDerivedReferrer(fn, cb.query(), "purchase_id", "purchase_id", sqpp, "purchasePaymentList", rd, vl, prpp, op);
    }
    public abstract String keepPurchaseId_QueryDerivedReferrer_PurchasePaymentList(PurchasePaymentCQ sq);
    public abstract String keepPurchaseId_QueryDerivedReferrer_PurchasePaymentListParameter(Object vl);

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * purchase_id: {PK, ID, NotNull, bigserial(19)}
     */
    public void setPurchaseId_IsNull() { regPurchaseId(CK_ISN, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * purchase_id: {PK, ID, NotNull, bigserial(19)}
     */
    public void setPurchaseId_IsNotNull() { regPurchaseId(CK_ISNN, DOBJ); }

    protected void regPurchaseId(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValuePurchaseId(), "purchase_id"); }
    protected abstract ConditionValue xgetCValuePurchaseId();

    /**
     * Equal(=). And NullIgnored, OnlyOnceRegistered. <br>
     * member_id: {UQ+, NotNull, int4(10), FK to member}
     * @param memberId The value of memberId as equal. (NullAllowed: if null, no condition)
     */
    public void setMemberId_Equal(Integer memberId) {
        doSetMemberId_Equal(memberId);
    }

    protected void doSetMemberId_Equal(Integer memberId) {
        regMemberId(CK_EQ, memberId);
    }

    /**
     * NotEqual(&lt;&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * member_id: {UQ+, NotNull, int4(10), FK to member}
     * @param memberId The value of memberId as notEqual. (NullAllowed: if null, no condition)
     */
    public void setMemberId_NotEqual(Integer memberId) {
        doSetMemberId_NotEqual(memberId);
    }

    protected void doSetMemberId_NotEqual(Integer memberId) {
        regMemberId(CK_NES, memberId);
    }

    /**
     * GreaterThan(&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * member_id: {UQ+, NotNull, int4(10), FK to member}
     * @param memberId The value of memberId as greaterThan. (NullAllowed: if null, no condition)
     */
    public void setMemberId_GreaterThan(Integer memberId) {
        regMemberId(CK_GT, memberId);
    }

    /**
     * LessThan(&lt;). And NullIgnored, OnlyOnceRegistered. <br>
     * member_id: {UQ+, NotNull, int4(10), FK to member}
     * @param memberId The value of memberId as lessThan. (NullAllowed: if null, no condition)
     */
    public void setMemberId_LessThan(Integer memberId) {
        regMemberId(CK_LT, memberId);
    }

    /**
     * GreaterEqual(&gt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * member_id: {UQ+, NotNull, int4(10), FK to member}
     * @param memberId The value of memberId as greaterEqual. (NullAllowed: if null, no condition)
     */
    public void setMemberId_GreaterEqual(Integer memberId) {
        regMemberId(CK_GE, memberId);
    }

    /**
     * LessEqual(&lt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * member_id: {UQ+, NotNull, int4(10), FK to member}
     * @param memberId The value of memberId as lessEqual. (NullAllowed: if null, no condition)
     */
    public void setMemberId_LessEqual(Integer memberId) {
        regMemberId(CK_LE, memberId);
    }

    /**
     * RangeOf with various options. (versatile) <br>
     * {(default) minNumber &lt;= column &lt;= maxNumber} <br>
     * And NullIgnored, OnlyOnceRegistered. <br>
     * member_id: {UQ+, NotNull, int4(10), FK to member}
     * @param minNumber The min number of memberId. (NullAllowed: if null, no from-condition)
     * @param maxNumber The max number of memberId. (NullAllowed: if null, no to-condition)
     * @param opLambda The callback for option of range-of. (NotNull)
     */
    public void setMemberId_RangeOf(Integer minNumber, Integer maxNumber, ConditionOptionCall<RangeOfOption> opLambda) {
        setMemberId_RangeOf(minNumber, maxNumber, xcROOP(opLambda));
    }

    /**
     * RangeOf with various options. (versatile) <br>
     * {(default) minNumber &lt;= column &lt;= maxNumber} <br>
     * And NullIgnored, OnlyOnceRegistered. <br>
     * member_id: {UQ+, NotNull, int4(10), FK to member}
     * @param minNumber The min number of memberId. (NullAllowed: if null, no from-condition)
     * @param maxNumber The max number of memberId. (NullAllowed: if null, no to-condition)
     * @param rangeOfOption The option of range-of. (NotNull)
     */
    protected void setMemberId_RangeOf(Integer minNumber, Integer maxNumber, RangeOfOption rangeOfOption) {
        regROO(minNumber, maxNumber, xgetCValueMemberId(), "member_id", rangeOfOption);
    }

    /**
     * InScope {in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * member_id: {UQ+, NotNull, int4(10), FK to member}
     * @param memberIdList The collection of memberId as inScope. (NullAllowed: if null (or empty), no condition)
     */
    public void setMemberId_InScope(Collection<Integer> memberIdList) {
        doSetMemberId_InScope(memberIdList);
    }

    protected void doSetMemberId_InScope(Collection<Integer> memberIdList) {
        regINS(CK_INS, cTL(memberIdList), xgetCValueMemberId(), "member_id");
    }

    /**
     * NotInScope {not in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * member_id: {UQ+, NotNull, int4(10), FK to member}
     * @param memberIdList The collection of memberId as notInScope. (NullAllowed: if null (or empty), no condition)
     */
    public void setMemberId_NotInScope(Collection<Integer> memberIdList) {
        doSetMemberId_NotInScope(memberIdList);
    }

    protected void doSetMemberId_NotInScope(Collection<Integer> memberIdList) {
        regINS(CK_NINS, cTL(memberIdList), xgetCValueMemberId(), "member_id");
    }

    protected void regMemberId(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueMemberId(), "member_id"); }
    protected abstract ConditionValue xgetCValueMemberId();

    /**
     * Equal(=). And NullIgnored, OnlyOnceRegistered. <br>
     * product_id: {+UQ, IX+, NotNull, int4(10), FK to product}
     * @param productId The value of productId as equal. (NullAllowed: if null, no condition)
     */
    public void setProductId_Equal(Integer productId) {
        doSetProductId_Equal(productId);
    }

    protected void doSetProductId_Equal(Integer productId) {
        regProductId(CK_EQ, productId);
    }

    /**
     * NotEqual(&lt;&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * product_id: {+UQ, IX+, NotNull, int4(10), FK to product}
     * @param productId The value of productId as notEqual. (NullAllowed: if null, no condition)
     */
    public void setProductId_NotEqual(Integer productId) {
        doSetProductId_NotEqual(productId);
    }

    protected void doSetProductId_NotEqual(Integer productId) {
        regProductId(CK_NES, productId);
    }

    /**
     * GreaterThan(&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * product_id: {+UQ, IX+, NotNull, int4(10), FK to product}
     * @param productId The value of productId as greaterThan. (NullAllowed: if null, no condition)
     */
    public void setProductId_GreaterThan(Integer productId) {
        regProductId(CK_GT, productId);
    }

    /**
     * LessThan(&lt;). And NullIgnored, OnlyOnceRegistered. <br>
     * product_id: {+UQ, IX+, NotNull, int4(10), FK to product}
     * @param productId The value of productId as lessThan. (NullAllowed: if null, no condition)
     */
    public void setProductId_LessThan(Integer productId) {
        regProductId(CK_LT, productId);
    }

    /**
     * GreaterEqual(&gt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * product_id: {+UQ, IX+, NotNull, int4(10), FK to product}
     * @param productId The value of productId as greaterEqual. (NullAllowed: if null, no condition)
     */
    public void setProductId_GreaterEqual(Integer productId) {
        regProductId(CK_GE, productId);
    }

    /**
     * LessEqual(&lt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * product_id: {+UQ, IX+, NotNull, int4(10), FK to product}
     * @param productId The value of productId as lessEqual. (NullAllowed: if null, no condition)
     */
    public void setProductId_LessEqual(Integer productId) {
        regProductId(CK_LE, productId);
    }

    /**
     * RangeOf with various options. (versatile) <br>
     * {(default) minNumber &lt;= column &lt;= maxNumber} <br>
     * And NullIgnored, OnlyOnceRegistered. <br>
     * product_id: {+UQ, IX+, NotNull, int4(10), FK to product}
     * @param minNumber The min number of productId. (NullAllowed: if null, no from-condition)
     * @param maxNumber The max number of productId. (NullAllowed: if null, no to-condition)
     * @param opLambda The callback for option of range-of. (NotNull)
     */
    public void setProductId_RangeOf(Integer minNumber, Integer maxNumber, ConditionOptionCall<RangeOfOption> opLambda) {
        setProductId_RangeOf(minNumber, maxNumber, xcROOP(opLambda));
    }

    /**
     * RangeOf with various options. (versatile) <br>
     * {(default) minNumber &lt;= column &lt;= maxNumber} <br>
     * And NullIgnored, OnlyOnceRegistered. <br>
     * product_id: {+UQ, IX+, NotNull, int4(10), FK to product}
     * @param minNumber The min number of productId. (NullAllowed: if null, no from-condition)
     * @param maxNumber The max number of productId. (NullAllowed: if null, no to-condition)
     * @param rangeOfOption The option of range-of. (NotNull)
     */
    protected void setProductId_RangeOf(Integer minNumber, Integer maxNumber, RangeOfOption rangeOfOption) {
        regROO(minNumber, maxNumber, xgetCValueProductId(), "product_id", rangeOfOption);
    }

    /**
     * InScope {in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * product_id: {+UQ, IX+, NotNull, int4(10), FK to product}
     * @param productIdList The collection of productId as inScope. (NullAllowed: if null (or empty), no condition)
     */
    public void setProductId_InScope(Collection<Integer> productIdList) {
        doSetProductId_InScope(productIdList);
    }

    protected void doSetProductId_InScope(Collection<Integer> productIdList) {
        regINS(CK_INS, cTL(productIdList), xgetCValueProductId(), "product_id");
    }

    /**
     * NotInScope {not in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * product_id: {+UQ, IX+, NotNull, int4(10), FK to product}
     * @param productIdList The collection of productId as notInScope. (NullAllowed: if null (or empty), no condition)
     */
    public void setProductId_NotInScope(Collection<Integer> productIdList) {
        doSetProductId_NotInScope(productIdList);
    }

    protected void doSetProductId_NotInScope(Collection<Integer> productIdList) {
        regINS(CK_NINS, cTL(productIdList), xgetCValueProductId(), "product_id");
    }

    protected void regProductId(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueProductId(), "product_id"); }
    protected abstract ConditionValue xgetCValueProductId();

    /**
     * Equal(=). And NullIgnored, OnlyOnceRegistered. <br>
     * purchase_datetime: {+UQ, IX+, NotNull, timestamp(26, 3)}
     * @param purchaseDatetime The value of purchaseDatetime as equal. (NullAllowed: if null, no condition)
     */
    public void setPurchaseDatetime_Equal(java.time.LocalDateTime purchaseDatetime) {
        regPurchaseDatetime(CK_EQ,  purchaseDatetime);
    }

    /**
     * GreaterThan(&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * purchase_datetime: {+UQ, IX+, NotNull, timestamp(26, 3)}
     * @param purchaseDatetime The value of purchaseDatetime as greaterThan. (NullAllowed: if null, no condition)
     */
    public void setPurchaseDatetime_GreaterThan(java.time.LocalDateTime purchaseDatetime) {
        regPurchaseDatetime(CK_GT,  purchaseDatetime);
    }

    /**
     * LessThan(&lt;). And NullIgnored, OnlyOnceRegistered. <br>
     * purchase_datetime: {+UQ, IX+, NotNull, timestamp(26, 3)}
     * @param purchaseDatetime The value of purchaseDatetime as lessThan. (NullAllowed: if null, no condition)
     */
    public void setPurchaseDatetime_LessThan(java.time.LocalDateTime purchaseDatetime) {
        regPurchaseDatetime(CK_LT,  purchaseDatetime);
    }

    /**
     * GreaterEqual(&gt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * purchase_datetime: {+UQ, IX+, NotNull, timestamp(26, 3)}
     * @param purchaseDatetime The value of purchaseDatetime as greaterEqual. (NullAllowed: if null, no condition)
     */
    public void setPurchaseDatetime_GreaterEqual(java.time.LocalDateTime purchaseDatetime) {
        regPurchaseDatetime(CK_GE,  purchaseDatetime);
    }

    /**
     * LessEqual(&lt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * purchase_datetime: {+UQ, IX+, NotNull, timestamp(26, 3)}
     * @param purchaseDatetime The value of purchaseDatetime as lessEqual. (NullAllowed: if null, no condition)
     */
    public void setPurchaseDatetime_LessEqual(java.time.LocalDateTime purchaseDatetime) {
        regPurchaseDatetime(CK_LE, purchaseDatetime);
    }

    /**
     * FromTo with various options. (versatile) {(default) fromDatetime &lt;= column &lt;= toDatetime} <br>
     * And NullIgnored, OnlyOnceRegistered. <br>
     * purchase_datetime: {+UQ, IX+, NotNull, timestamp(26, 3)}
     * <pre>e.g. setPurchaseDatetime_FromTo(fromDate, toDate, op <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> op.<span style="color: #CC4747">compareAsDate()</span>);</pre>
     * @param fromDatetime The from-datetime(yyyy/MM/dd HH:mm:ss.SSS) of purchaseDatetime. (NullAllowed: if null, no from-condition)
     * @param toDatetime The to-datetime(yyyy/MM/dd HH:mm:ss.SSS) of purchaseDatetime. (NullAllowed: if null, no to-condition)
     * @param opLambda The callback for option of from-to. (NotNull)
     */
    public void setPurchaseDatetime_FromTo(java.time.LocalDateTime fromDatetime, java.time.LocalDateTime toDatetime, ConditionOptionCall<FromToOption> opLambda) {
        setPurchaseDatetime_FromTo(fromDatetime, toDatetime, xcFTOP(opLambda));
    }

    /**
     * FromTo with various options. (versatile) {(default) fromDatetime &lt;= column &lt;= toDatetime} <br>
     * And NullIgnored, OnlyOnceRegistered. <br>
     * purchase_datetime: {+UQ, IX+, NotNull, timestamp(26, 3)}
     * <pre>e.g. setPurchaseDatetime_FromTo(fromDate, toDate, new <span style="color: #CC4747">FromToOption</span>().compareAsDate());</pre>
     * @param fromDatetime The from-datetime(yyyy/MM/dd HH:mm:ss.SSS) of purchaseDatetime. (NullAllowed: if null, no from-condition)
     * @param toDatetime The to-datetime(yyyy/MM/dd HH:mm:ss.SSS) of purchaseDatetime. (NullAllowed: if null, no to-condition)
     * @param fromToOption The option of from-to. (NotNull)
     */
    protected void setPurchaseDatetime_FromTo(java.time.LocalDateTime fromDatetime, java.time.LocalDateTime toDatetime, FromToOption fromToOption) {
        String nm = "purchase_datetime"; FromToOption op = fromToOption;
        regFTQ(xfFTHD(fromDatetime, nm, op), xfFTHD(toDatetime, nm, op), xgetCValuePurchaseDatetime(), nm, op);
    }

    protected void regPurchaseDatetime(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValuePurchaseDatetime(), "purchase_datetime"); }
    protected abstract ConditionValue xgetCValuePurchaseDatetime();

    /**
     * Equal(=). And NullIgnored, OnlyOnceRegistered. <br>
     * purchase_count: {NotNull, int4(10)}
     * @param purchaseCount The value of purchaseCount as equal. (NullAllowed: if null, no condition)
     */
    public void setPurchaseCount_Equal(Integer purchaseCount) {
        doSetPurchaseCount_Equal(purchaseCount);
    }

    protected void doSetPurchaseCount_Equal(Integer purchaseCount) {
        regPurchaseCount(CK_EQ, purchaseCount);
    }

    /**
     * NotEqual(&lt;&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * purchase_count: {NotNull, int4(10)}
     * @param purchaseCount The value of purchaseCount as notEqual. (NullAllowed: if null, no condition)
     */
    public void setPurchaseCount_NotEqual(Integer purchaseCount) {
        doSetPurchaseCount_NotEqual(purchaseCount);
    }

    protected void doSetPurchaseCount_NotEqual(Integer purchaseCount) {
        regPurchaseCount(CK_NES, purchaseCount);
    }

    /**
     * GreaterThan(&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * purchase_count: {NotNull, int4(10)}
     * @param purchaseCount The value of purchaseCount as greaterThan. (NullAllowed: if null, no condition)
     */
    public void setPurchaseCount_GreaterThan(Integer purchaseCount) {
        regPurchaseCount(CK_GT, purchaseCount);
    }

    /**
     * LessThan(&lt;). And NullIgnored, OnlyOnceRegistered. <br>
     * purchase_count: {NotNull, int4(10)}
     * @param purchaseCount The value of purchaseCount as lessThan. (NullAllowed: if null, no condition)
     */
    public void setPurchaseCount_LessThan(Integer purchaseCount) {
        regPurchaseCount(CK_LT, purchaseCount);
    }

    /**
     * GreaterEqual(&gt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * purchase_count: {NotNull, int4(10)}
     * @param purchaseCount The value of purchaseCount as greaterEqual. (NullAllowed: if null, no condition)
     */
    public void setPurchaseCount_GreaterEqual(Integer purchaseCount) {
        regPurchaseCount(CK_GE, purchaseCount);
    }

    /**
     * LessEqual(&lt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * purchase_count: {NotNull, int4(10)}
     * @param purchaseCount The value of purchaseCount as lessEqual. (NullAllowed: if null, no condition)
     */
    public void setPurchaseCount_LessEqual(Integer purchaseCount) {
        regPurchaseCount(CK_LE, purchaseCount);
    }

    /**
     * RangeOf with various options. (versatile) <br>
     * {(default) minNumber &lt;= column &lt;= maxNumber} <br>
     * And NullIgnored, OnlyOnceRegistered. <br>
     * purchase_count: {NotNull, int4(10)}
     * @param minNumber The min number of purchaseCount. (NullAllowed: if null, no from-condition)
     * @param maxNumber The max number of purchaseCount. (NullAllowed: if null, no to-condition)
     * @param opLambda The callback for option of range-of. (NotNull)
     */
    public void setPurchaseCount_RangeOf(Integer minNumber, Integer maxNumber, ConditionOptionCall<RangeOfOption> opLambda) {
        setPurchaseCount_RangeOf(minNumber, maxNumber, xcROOP(opLambda));
    }

    /**
     * RangeOf with various options. (versatile) <br>
     * {(default) minNumber &lt;= column &lt;= maxNumber} <br>
     * And NullIgnored, OnlyOnceRegistered. <br>
     * purchase_count: {NotNull, int4(10)}
     * @param minNumber The min number of purchaseCount. (NullAllowed: if null, no from-condition)
     * @param maxNumber The max number of purchaseCount. (NullAllowed: if null, no to-condition)
     * @param rangeOfOption The option of range-of. (NotNull)
     */
    protected void setPurchaseCount_RangeOf(Integer minNumber, Integer maxNumber, RangeOfOption rangeOfOption) {
        regROO(minNumber, maxNumber, xgetCValuePurchaseCount(), "purchase_count", rangeOfOption);
    }

    /**
     * InScope {in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * purchase_count: {NotNull, int4(10)}
     * @param purchaseCountList The collection of purchaseCount as inScope. (NullAllowed: if null (or empty), no condition)
     */
    public void setPurchaseCount_InScope(Collection<Integer> purchaseCountList) {
        doSetPurchaseCount_InScope(purchaseCountList);
    }

    protected void doSetPurchaseCount_InScope(Collection<Integer> purchaseCountList) {
        regINS(CK_INS, cTL(purchaseCountList), xgetCValuePurchaseCount(), "purchase_count");
    }

    /**
     * NotInScope {not in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * purchase_count: {NotNull, int4(10)}
     * @param purchaseCountList The collection of purchaseCount as notInScope. (NullAllowed: if null (or empty), no condition)
     */
    public void setPurchaseCount_NotInScope(Collection<Integer> purchaseCountList) {
        doSetPurchaseCount_NotInScope(purchaseCountList);
    }

    protected void doSetPurchaseCount_NotInScope(Collection<Integer> purchaseCountList) {
        regINS(CK_NINS, cTL(purchaseCountList), xgetCValuePurchaseCount(), "purchase_count");
    }

    protected void regPurchaseCount(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValuePurchaseCount(), "purchase_count"); }
    protected abstract ConditionValue xgetCValuePurchaseCount();

    /**
     * Equal(=). And NullIgnored, OnlyOnceRegistered. <br>
     * purchase_price: {IX, NotNull, int4(10)}
     * @param purchasePrice The value of purchasePrice as equal. (NullAllowed: if null, no condition)
     */
    public void setPurchasePrice_Equal(Integer purchasePrice) {
        doSetPurchasePrice_Equal(purchasePrice);
    }

    protected void doSetPurchasePrice_Equal(Integer purchasePrice) {
        regPurchasePrice(CK_EQ, purchasePrice);
    }

    /**
     * NotEqual(&lt;&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * purchase_price: {IX, NotNull, int4(10)}
     * @param purchasePrice The value of purchasePrice as notEqual. (NullAllowed: if null, no condition)
     */
    public void setPurchasePrice_NotEqual(Integer purchasePrice) {
        doSetPurchasePrice_NotEqual(purchasePrice);
    }

    protected void doSetPurchasePrice_NotEqual(Integer purchasePrice) {
        regPurchasePrice(CK_NES, purchasePrice);
    }

    /**
     * GreaterThan(&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * purchase_price: {IX, NotNull, int4(10)}
     * @param purchasePrice The value of purchasePrice as greaterThan. (NullAllowed: if null, no condition)
     */
    public void setPurchasePrice_GreaterThan(Integer purchasePrice) {
        regPurchasePrice(CK_GT, purchasePrice);
    }

    /**
     * LessThan(&lt;). And NullIgnored, OnlyOnceRegistered. <br>
     * purchase_price: {IX, NotNull, int4(10)}
     * @param purchasePrice The value of purchasePrice as lessThan. (NullAllowed: if null, no condition)
     */
    public void setPurchasePrice_LessThan(Integer purchasePrice) {
        regPurchasePrice(CK_LT, purchasePrice);
    }

    /**
     * GreaterEqual(&gt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * purchase_price: {IX, NotNull, int4(10)}
     * @param purchasePrice The value of purchasePrice as greaterEqual. (NullAllowed: if null, no condition)
     */
    public void setPurchasePrice_GreaterEqual(Integer purchasePrice) {
        regPurchasePrice(CK_GE, purchasePrice);
    }

    /**
     * LessEqual(&lt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * purchase_price: {IX, NotNull, int4(10)}
     * @param purchasePrice The value of purchasePrice as lessEqual. (NullAllowed: if null, no condition)
     */
    public void setPurchasePrice_LessEqual(Integer purchasePrice) {
        regPurchasePrice(CK_LE, purchasePrice);
    }

    /**
     * RangeOf with various options. (versatile) <br>
     * {(default) minNumber &lt;= column &lt;= maxNumber} <br>
     * And NullIgnored, OnlyOnceRegistered. <br>
     * purchase_price: {IX, NotNull, int4(10)}
     * @param minNumber The min number of purchasePrice. (NullAllowed: if null, no from-condition)
     * @param maxNumber The max number of purchasePrice. (NullAllowed: if null, no to-condition)
     * @param opLambda The callback for option of range-of. (NotNull)
     */
    public void setPurchasePrice_RangeOf(Integer minNumber, Integer maxNumber, ConditionOptionCall<RangeOfOption> opLambda) {
        setPurchasePrice_RangeOf(minNumber, maxNumber, xcROOP(opLambda));
    }

    /**
     * RangeOf with various options. (versatile) <br>
     * {(default) minNumber &lt;= column &lt;= maxNumber} <br>
     * And NullIgnored, OnlyOnceRegistered. <br>
     * purchase_price: {IX, NotNull, int4(10)}
     * @param minNumber The min number of purchasePrice. (NullAllowed: if null, no from-condition)
     * @param maxNumber The max number of purchasePrice. (NullAllowed: if null, no to-condition)
     * @param rangeOfOption The option of range-of. (NotNull)
     */
    protected void setPurchasePrice_RangeOf(Integer minNumber, Integer maxNumber, RangeOfOption rangeOfOption) {
        regROO(minNumber, maxNumber, xgetCValuePurchasePrice(), "purchase_price", rangeOfOption);
    }

    /**
     * InScope {in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * purchase_price: {IX, NotNull, int4(10)}
     * @param purchasePriceList The collection of purchasePrice as inScope. (NullAllowed: if null (or empty), no condition)
     */
    public void setPurchasePrice_InScope(Collection<Integer> purchasePriceList) {
        doSetPurchasePrice_InScope(purchasePriceList);
    }

    protected void doSetPurchasePrice_InScope(Collection<Integer> purchasePriceList) {
        regINS(CK_INS, cTL(purchasePriceList), xgetCValuePurchasePrice(), "purchase_price");
    }

    /**
     * NotInScope {not in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * purchase_price: {IX, NotNull, int4(10)}
     * @param purchasePriceList The collection of purchasePrice as notInScope. (NullAllowed: if null (or empty), no condition)
     */
    public void setPurchasePrice_NotInScope(Collection<Integer> purchasePriceList) {
        doSetPurchasePrice_NotInScope(purchasePriceList);
    }

    protected void doSetPurchasePrice_NotInScope(Collection<Integer> purchasePriceList) {
        regINS(CK_NINS, cTL(purchasePriceList), xgetCValuePurchasePrice(), "purchase_price");
    }

    protected void regPurchasePrice(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValuePurchasePrice(), "purchase_price"); }
    protected abstract ConditionValue xgetCValuePurchasePrice();

    /**
     * Equal(=). And NullIgnored, OnlyOnceRegistered. <br>
     * payment_complete_flg: {NotNull, int4(10)}
     * @param paymentCompleteFlg The value of paymentCompleteFlg as equal. (NullAllowed: if null, no condition)
     */
    public void setPaymentCompleteFlg_Equal(Integer paymentCompleteFlg) {
        doSetPaymentCompleteFlg_Equal(paymentCompleteFlg);
    }

    protected void doSetPaymentCompleteFlg_Equal(Integer paymentCompleteFlg) {
        regPaymentCompleteFlg(CK_EQ, paymentCompleteFlg);
    }

    /**
     * NotEqual(&lt;&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * payment_complete_flg: {NotNull, int4(10)}
     * @param paymentCompleteFlg The value of paymentCompleteFlg as notEqual. (NullAllowed: if null, no condition)
     */
    public void setPaymentCompleteFlg_NotEqual(Integer paymentCompleteFlg) {
        doSetPaymentCompleteFlg_NotEqual(paymentCompleteFlg);
    }

    protected void doSetPaymentCompleteFlg_NotEqual(Integer paymentCompleteFlg) {
        regPaymentCompleteFlg(CK_NES, paymentCompleteFlg);
    }

    /**
     * GreaterThan(&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * payment_complete_flg: {NotNull, int4(10)}
     * @param paymentCompleteFlg The value of paymentCompleteFlg as greaterThan. (NullAllowed: if null, no condition)
     */
    public void setPaymentCompleteFlg_GreaterThan(Integer paymentCompleteFlg) {
        regPaymentCompleteFlg(CK_GT, paymentCompleteFlg);
    }

    /**
     * LessThan(&lt;). And NullIgnored, OnlyOnceRegistered. <br>
     * payment_complete_flg: {NotNull, int4(10)}
     * @param paymentCompleteFlg The value of paymentCompleteFlg as lessThan. (NullAllowed: if null, no condition)
     */
    public void setPaymentCompleteFlg_LessThan(Integer paymentCompleteFlg) {
        regPaymentCompleteFlg(CK_LT, paymentCompleteFlg);
    }

    /**
     * GreaterEqual(&gt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * payment_complete_flg: {NotNull, int4(10)}
     * @param paymentCompleteFlg The value of paymentCompleteFlg as greaterEqual. (NullAllowed: if null, no condition)
     */
    public void setPaymentCompleteFlg_GreaterEqual(Integer paymentCompleteFlg) {
        regPaymentCompleteFlg(CK_GE, paymentCompleteFlg);
    }

    /**
     * LessEqual(&lt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * payment_complete_flg: {NotNull, int4(10)}
     * @param paymentCompleteFlg The value of paymentCompleteFlg as lessEqual. (NullAllowed: if null, no condition)
     */
    public void setPaymentCompleteFlg_LessEqual(Integer paymentCompleteFlg) {
        regPaymentCompleteFlg(CK_LE, paymentCompleteFlg);
    }

    /**
     * RangeOf with various options. (versatile) <br>
     * {(default) minNumber &lt;= column &lt;= maxNumber} <br>
     * And NullIgnored, OnlyOnceRegistered. <br>
     * payment_complete_flg: {NotNull, int4(10)}
     * @param minNumber The min number of paymentCompleteFlg. (NullAllowed: if null, no from-condition)
     * @param maxNumber The max number of paymentCompleteFlg. (NullAllowed: if null, no to-condition)
     * @param opLambda The callback for option of range-of. (NotNull)
     */
    public void setPaymentCompleteFlg_RangeOf(Integer minNumber, Integer maxNumber, ConditionOptionCall<RangeOfOption> opLambda) {
        setPaymentCompleteFlg_RangeOf(minNumber, maxNumber, xcROOP(opLambda));
    }

    /**
     * RangeOf with various options. (versatile) <br>
     * {(default) minNumber &lt;= column &lt;= maxNumber} <br>
     * And NullIgnored, OnlyOnceRegistered. <br>
     * payment_complete_flg: {NotNull, int4(10)}
     * @param minNumber The min number of paymentCompleteFlg. (NullAllowed: if null, no from-condition)
     * @param maxNumber The max number of paymentCompleteFlg. (NullAllowed: if null, no to-condition)
     * @param rangeOfOption The option of range-of. (NotNull)
     */
    protected void setPaymentCompleteFlg_RangeOf(Integer minNumber, Integer maxNumber, RangeOfOption rangeOfOption) {
        regROO(minNumber, maxNumber, xgetCValuePaymentCompleteFlg(), "payment_complete_flg", rangeOfOption);
    }

    /**
     * InScope {in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * payment_complete_flg: {NotNull, int4(10)}
     * @param paymentCompleteFlgList The collection of paymentCompleteFlg as inScope. (NullAllowed: if null (or empty), no condition)
     */
    public void setPaymentCompleteFlg_InScope(Collection<Integer> paymentCompleteFlgList) {
        doSetPaymentCompleteFlg_InScope(paymentCompleteFlgList);
    }

    protected void doSetPaymentCompleteFlg_InScope(Collection<Integer> paymentCompleteFlgList) {
        regINS(CK_INS, cTL(paymentCompleteFlgList), xgetCValuePaymentCompleteFlg(), "payment_complete_flg");
    }

    /**
     * NotInScope {not in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * payment_complete_flg: {NotNull, int4(10)}
     * @param paymentCompleteFlgList The collection of paymentCompleteFlg as notInScope. (NullAllowed: if null (or empty), no condition)
     */
    public void setPaymentCompleteFlg_NotInScope(Collection<Integer> paymentCompleteFlgList) {
        doSetPaymentCompleteFlg_NotInScope(paymentCompleteFlgList);
    }

    protected void doSetPaymentCompleteFlg_NotInScope(Collection<Integer> paymentCompleteFlgList) {
        regINS(CK_NINS, cTL(paymentCompleteFlgList), xgetCValuePaymentCompleteFlg(), "payment_complete_flg");
    }

    protected void regPaymentCompleteFlg(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValuePaymentCompleteFlg(), "payment_complete_flg"); }
    protected abstract ConditionValue xgetCValuePaymentCompleteFlg();

    /**
     * Equal(=). And NullIgnored, OnlyOnceRegistered. <br>
     * register_datetime: {NotNull, timestamp(26, 3)}
     * @param registerDatetime The value of registerDatetime as equal. (NullAllowed: if null, no condition)
     */
    public void setRegisterDatetime_Equal(java.time.LocalDateTime registerDatetime) {
        regRegisterDatetime(CK_EQ,  registerDatetime);
    }

    /**
     * GreaterThan(&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * register_datetime: {NotNull, timestamp(26, 3)}
     * @param registerDatetime The value of registerDatetime as greaterThan. (NullAllowed: if null, no condition)
     */
    public void setRegisterDatetime_GreaterThan(java.time.LocalDateTime registerDatetime) {
        regRegisterDatetime(CK_GT,  registerDatetime);
    }

    /**
     * LessThan(&lt;). And NullIgnored, OnlyOnceRegistered. <br>
     * register_datetime: {NotNull, timestamp(26, 3)}
     * @param registerDatetime The value of registerDatetime as lessThan. (NullAllowed: if null, no condition)
     */
    public void setRegisterDatetime_LessThan(java.time.LocalDateTime registerDatetime) {
        regRegisterDatetime(CK_LT,  registerDatetime);
    }

    /**
     * GreaterEqual(&gt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * register_datetime: {NotNull, timestamp(26, 3)}
     * @param registerDatetime The value of registerDatetime as greaterEqual. (NullAllowed: if null, no condition)
     */
    public void setRegisterDatetime_GreaterEqual(java.time.LocalDateTime registerDatetime) {
        regRegisterDatetime(CK_GE,  registerDatetime);
    }

    /**
     * LessEqual(&lt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * register_datetime: {NotNull, timestamp(26, 3)}
     * @param registerDatetime The value of registerDatetime as lessEqual. (NullAllowed: if null, no condition)
     */
    public void setRegisterDatetime_LessEqual(java.time.LocalDateTime registerDatetime) {
        regRegisterDatetime(CK_LE, registerDatetime);
    }

    /**
     * FromTo with various options. (versatile) {(default) fromDatetime &lt;= column &lt;= toDatetime} <br>
     * And NullIgnored, OnlyOnceRegistered. <br>
     * register_datetime: {NotNull, timestamp(26, 3)}
     * <pre>e.g. setRegisterDatetime_FromTo(fromDate, toDate, op <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> op.<span style="color: #CC4747">compareAsDate()</span>);</pre>
     * @param fromDatetime The from-datetime(yyyy/MM/dd HH:mm:ss.SSS) of registerDatetime. (NullAllowed: if null, no from-condition)
     * @param toDatetime The to-datetime(yyyy/MM/dd HH:mm:ss.SSS) of registerDatetime. (NullAllowed: if null, no to-condition)
     * @param opLambda The callback for option of from-to. (NotNull)
     */
    public void setRegisterDatetime_FromTo(java.time.LocalDateTime fromDatetime, java.time.LocalDateTime toDatetime, ConditionOptionCall<FromToOption> opLambda) {
        setRegisterDatetime_FromTo(fromDatetime, toDatetime, xcFTOP(opLambda));
    }

    /**
     * FromTo with various options. (versatile) {(default) fromDatetime &lt;= column &lt;= toDatetime} <br>
     * And NullIgnored, OnlyOnceRegistered. <br>
     * register_datetime: {NotNull, timestamp(26, 3)}
     * <pre>e.g. setRegisterDatetime_FromTo(fromDate, toDate, new <span style="color: #CC4747">FromToOption</span>().compareAsDate());</pre>
     * @param fromDatetime The from-datetime(yyyy/MM/dd HH:mm:ss.SSS) of registerDatetime. (NullAllowed: if null, no from-condition)
     * @param toDatetime The to-datetime(yyyy/MM/dd HH:mm:ss.SSS) of registerDatetime. (NullAllowed: if null, no to-condition)
     * @param fromToOption The option of from-to. (NotNull)
     */
    protected void setRegisterDatetime_FromTo(java.time.LocalDateTime fromDatetime, java.time.LocalDateTime toDatetime, FromToOption fromToOption) {
        String nm = "register_datetime"; FromToOption op = fromToOption;
        regFTQ(xfFTHD(fromDatetime, nm, op), xfFTHD(toDatetime, nm, op), xgetCValueRegisterDatetime(), nm, op);
    }

    protected void regRegisterDatetime(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueRegisterDatetime(), "register_datetime"); }
    protected abstract ConditionValue xgetCValueRegisterDatetime();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * register_user: {NotNull, varchar(200)}
     * @param registerUser The value of registerUser as equal. (NullAllowed: if null (or empty), no condition)
     */
    public void setRegisterUser_Equal(String registerUser) {
        doSetRegisterUser_Equal(fRES(registerUser));
    }

    protected void doSetRegisterUser_Equal(String registerUser) {
        regRegisterUser(CK_EQ, registerUser);
    }

    /**
     * NotEqual(&lt;&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * register_user: {NotNull, varchar(200)}
     * @param registerUser The value of registerUser as notEqual. (NullAllowed: if null (or empty), no condition)
     */
    public void setRegisterUser_NotEqual(String registerUser) {
        doSetRegisterUser_NotEqual(fRES(registerUser));
    }

    protected void doSetRegisterUser_NotEqual(String registerUser) {
        regRegisterUser(CK_NES, registerUser);
    }

    /**
     * GreaterThan(&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * register_user: {NotNull, varchar(200)}
     * @param registerUser The value of registerUser as greaterThan. (NullAllowed: if null (or empty), no condition)
     */
    public void setRegisterUser_GreaterThan(String registerUser) {
        regRegisterUser(CK_GT, fRES(registerUser));
    }

    /**
     * LessThan(&lt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * register_user: {NotNull, varchar(200)}
     * @param registerUser The value of registerUser as lessThan. (NullAllowed: if null (or empty), no condition)
     */
    public void setRegisterUser_LessThan(String registerUser) {
        regRegisterUser(CK_LT, fRES(registerUser));
    }

    /**
     * GreaterEqual(&gt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * register_user: {NotNull, varchar(200)}
     * @param registerUser The value of registerUser as greaterEqual. (NullAllowed: if null (or empty), no condition)
     */
    public void setRegisterUser_GreaterEqual(String registerUser) {
        regRegisterUser(CK_GE, fRES(registerUser));
    }

    /**
     * LessEqual(&lt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * register_user: {NotNull, varchar(200)}
     * @param registerUser The value of registerUser as lessEqual. (NullAllowed: if null (or empty), no condition)
     */
    public void setRegisterUser_LessEqual(String registerUser) {
        regRegisterUser(CK_LE, fRES(registerUser));
    }

    /**
     * InScope {in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * register_user: {NotNull, varchar(200)}
     * @param registerUserList The collection of registerUser as inScope. (NullAllowed: if null (or empty), no condition)
     */
    public void setRegisterUser_InScope(Collection<String> registerUserList) {
        doSetRegisterUser_InScope(registerUserList);
    }

    protected void doSetRegisterUser_InScope(Collection<String> registerUserList) {
        regINS(CK_INS, cTL(registerUserList), xgetCValueRegisterUser(), "register_user");
    }

    /**
     * NotInScope {not in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * register_user: {NotNull, varchar(200)}
     * @param registerUserList The collection of registerUser as notInScope. (NullAllowed: if null (or empty), no condition)
     */
    public void setRegisterUser_NotInScope(Collection<String> registerUserList) {
        doSetRegisterUser_NotInScope(registerUserList);
    }

    protected void doSetRegisterUser_NotInScope(Collection<String> registerUserList) {
        regINS(CK_NINS, cTL(registerUserList), xgetCValueRegisterUser(), "register_user");
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * register_user: {NotNull, varchar(200)} <br>
     * <pre>e.g. setRegisterUser_LikeSearch("xxx", op <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> op.<span style="color: #CC4747">likeContain()</span>);</pre>
     * @param registerUser The value of registerUser as likeSearch. (NullAllowed: if null (or empty), no condition)
     * @param opLambda The callback for option of like-search. (NotNull)
     */
    public void setRegisterUser_LikeSearch(String registerUser, ConditionOptionCall<LikeSearchOption> opLambda) {
        setRegisterUser_LikeSearch(registerUser, xcLSOP(opLambda));
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * register_user: {NotNull, varchar(200)} <br>
     * <pre>e.g. setRegisterUser_LikeSearch("xxx", new <span style="color: #CC4747">LikeSearchOption</span>().likeContain());</pre>
     * @param registerUser The value of registerUser as likeSearch. (NullAllowed: if null (or empty), no condition)
     * @param likeSearchOption The option of like-search. (NotNull)
     */
    protected void setRegisterUser_LikeSearch(String registerUser, LikeSearchOption likeSearchOption) {
        regLSQ(CK_LS, fRES(registerUser), xgetCValueRegisterUser(), "register_user", likeSearchOption);
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br>
     * And NullOrEmptyIgnored, SeveralRegistered. <br>
     * register_user: {NotNull, varchar(200)}
     * @param registerUser The value of registerUser as notLikeSearch. (NullAllowed: if null (or empty), no condition)
     * @param opLambda The callback for option of like-search. (NotNull)
     */
    public void setRegisterUser_NotLikeSearch(String registerUser, ConditionOptionCall<LikeSearchOption> opLambda) {
        setRegisterUser_NotLikeSearch(registerUser, xcLSOP(opLambda));
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br>
     * And NullOrEmptyIgnored, SeveralRegistered. <br>
     * register_user: {NotNull, varchar(200)}
     * @param registerUser The value of registerUser as notLikeSearch. (NullAllowed: if null (or empty), no condition)
     * @param likeSearchOption The option of not-like-search. (NotNull)
     */
    protected void setRegisterUser_NotLikeSearch(String registerUser, LikeSearchOption likeSearchOption) {
        regLSQ(CK_NLS, fRES(registerUser), xgetCValueRegisterUser(), "register_user", likeSearchOption);
    }

    protected void regRegisterUser(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueRegisterUser(), "register_user"); }
    protected abstract ConditionValue xgetCValueRegisterUser();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * register_process: {NotNull, varchar(200)}
     * @param registerProcess The value of registerProcess as equal. (NullAllowed: if null (or empty), no condition)
     */
    public void setRegisterProcess_Equal(String registerProcess) {
        doSetRegisterProcess_Equal(fRES(registerProcess));
    }

    protected void doSetRegisterProcess_Equal(String registerProcess) {
        regRegisterProcess(CK_EQ, registerProcess);
    }

    /**
     * NotEqual(&lt;&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * register_process: {NotNull, varchar(200)}
     * @param registerProcess The value of registerProcess as notEqual. (NullAllowed: if null (or empty), no condition)
     */
    public void setRegisterProcess_NotEqual(String registerProcess) {
        doSetRegisterProcess_NotEqual(fRES(registerProcess));
    }

    protected void doSetRegisterProcess_NotEqual(String registerProcess) {
        regRegisterProcess(CK_NES, registerProcess);
    }

    /**
     * GreaterThan(&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * register_process: {NotNull, varchar(200)}
     * @param registerProcess The value of registerProcess as greaterThan. (NullAllowed: if null (or empty), no condition)
     */
    public void setRegisterProcess_GreaterThan(String registerProcess) {
        regRegisterProcess(CK_GT, fRES(registerProcess));
    }

    /**
     * LessThan(&lt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * register_process: {NotNull, varchar(200)}
     * @param registerProcess The value of registerProcess as lessThan. (NullAllowed: if null (or empty), no condition)
     */
    public void setRegisterProcess_LessThan(String registerProcess) {
        regRegisterProcess(CK_LT, fRES(registerProcess));
    }

    /**
     * GreaterEqual(&gt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * register_process: {NotNull, varchar(200)}
     * @param registerProcess The value of registerProcess as greaterEqual. (NullAllowed: if null (or empty), no condition)
     */
    public void setRegisterProcess_GreaterEqual(String registerProcess) {
        regRegisterProcess(CK_GE, fRES(registerProcess));
    }

    /**
     * LessEqual(&lt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * register_process: {NotNull, varchar(200)}
     * @param registerProcess The value of registerProcess as lessEqual. (NullAllowed: if null (or empty), no condition)
     */
    public void setRegisterProcess_LessEqual(String registerProcess) {
        regRegisterProcess(CK_LE, fRES(registerProcess));
    }

    /**
     * InScope {in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * register_process: {NotNull, varchar(200)}
     * @param registerProcessList The collection of registerProcess as inScope. (NullAllowed: if null (or empty), no condition)
     */
    public void setRegisterProcess_InScope(Collection<String> registerProcessList) {
        doSetRegisterProcess_InScope(registerProcessList);
    }

    protected void doSetRegisterProcess_InScope(Collection<String> registerProcessList) {
        regINS(CK_INS, cTL(registerProcessList), xgetCValueRegisterProcess(), "register_process");
    }

    /**
     * NotInScope {not in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * register_process: {NotNull, varchar(200)}
     * @param registerProcessList The collection of registerProcess as notInScope. (NullAllowed: if null (or empty), no condition)
     */
    public void setRegisterProcess_NotInScope(Collection<String> registerProcessList) {
        doSetRegisterProcess_NotInScope(registerProcessList);
    }

    protected void doSetRegisterProcess_NotInScope(Collection<String> registerProcessList) {
        regINS(CK_NINS, cTL(registerProcessList), xgetCValueRegisterProcess(), "register_process");
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * register_process: {NotNull, varchar(200)} <br>
     * <pre>e.g. setRegisterProcess_LikeSearch("xxx", op <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> op.<span style="color: #CC4747">likeContain()</span>);</pre>
     * @param registerProcess The value of registerProcess as likeSearch. (NullAllowed: if null (or empty), no condition)
     * @param opLambda The callback for option of like-search. (NotNull)
     */
    public void setRegisterProcess_LikeSearch(String registerProcess, ConditionOptionCall<LikeSearchOption> opLambda) {
        setRegisterProcess_LikeSearch(registerProcess, xcLSOP(opLambda));
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * register_process: {NotNull, varchar(200)} <br>
     * <pre>e.g. setRegisterProcess_LikeSearch("xxx", new <span style="color: #CC4747">LikeSearchOption</span>().likeContain());</pre>
     * @param registerProcess The value of registerProcess as likeSearch. (NullAllowed: if null (or empty), no condition)
     * @param likeSearchOption The option of like-search. (NotNull)
     */
    protected void setRegisterProcess_LikeSearch(String registerProcess, LikeSearchOption likeSearchOption) {
        regLSQ(CK_LS, fRES(registerProcess), xgetCValueRegisterProcess(), "register_process", likeSearchOption);
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br>
     * And NullOrEmptyIgnored, SeveralRegistered. <br>
     * register_process: {NotNull, varchar(200)}
     * @param registerProcess The value of registerProcess as notLikeSearch. (NullAllowed: if null (or empty), no condition)
     * @param opLambda The callback for option of like-search. (NotNull)
     */
    public void setRegisterProcess_NotLikeSearch(String registerProcess, ConditionOptionCall<LikeSearchOption> opLambda) {
        setRegisterProcess_NotLikeSearch(registerProcess, xcLSOP(opLambda));
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br>
     * And NullOrEmptyIgnored, SeveralRegistered. <br>
     * register_process: {NotNull, varchar(200)}
     * @param registerProcess The value of registerProcess as notLikeSearch. (NullAllowed: if null (or empty), no condition)
     * @param likeSearchOption The option of not-like-search. (NotNull)
     */
    protected void setRegisterProcess_NotLikeSearch(String registerProcess, LikeSearchOption likeSearchOption) {
        regLSQ(CK_NLS, fRES(registerProcess), xgetCValueRegisterProcess(), "register_process", likeSearchOption);
    }

    protected void regRegisterProcess(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueRegisterProcess(), "register_process"); }
    protected abstract ConditionValue xgetCValueRegisterProcess();

    /**
     * Equal(=). And NullIgnored, OnlyOnceRegistered. <br>
     * update_datetime: {NotNull, timestamp(26, 3)}
     * @param updateDatetime The value of updateDatetime as equal. (NullAllowed: if null, no condition)
     */
    public void setUpdateDatetime_Equal(java.time.LocalDateTime updateDatetime) {
        regUpdateDatetime(CK_EQ,  updateDatetime);
    }

    /**
     * GreaterThan(&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * update_datetime: {NotNull, timestamp(26, 3)}
     * @param updateDatetime The value of updateDatetime as greaterThan. (NullAllowed: if null, no condition)
     */
    public void setUpdateDatetime_GreaterThan(java.time.LocalDateTime updateDatetime) {
        regUpdateDatetime(CK_GT,  updateDatetime);
    }

    /**
     * LessThan(&lt;). And NullIgnored, OnlyOnceRegistered. <br>
     * update_datetime: {NotNull, timestamp(26, 3)}
     * @param updateDatetime The value of updateDatetime as lessThan. (NullAllowed: if null, no condition)
     */
    public void setUpdateDatetime_LessThan(java.time.LocalDateTime updateDatetime) {
        regUpdateDatetime(CK_LT,  updateDatetime);
    }

    /**
     * GreaterEqual(&gt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * update_datetime: {NotNull, timestamp(26, 3)}
     * @param updateDatetime The value of updateDatetime as greaterEqual. (NullAllowed: if null, no condition)
     */
    public void setUpdateDatetime_GreaterEqual(java.time.LocalDateTime updateDatetime) {
        regUpdateDatetime(CK_GE,  updateDatetime);
    }

    /**
     * LessEqual(&lt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * update_datetime: {NotNull, timestamp(26, 3)}
     * @param updateDatetime The value of updateDatetime as lessEqual. (NullAllowed: if null, no condition)
     */
    public void setUpdateDatetime_LessEqual(java.time.LocalDateTime updateDatetime) {
        regUpdateDatetime(CK_LE, updateDatetime);
    }

    /**
     * FromTo with various options. (versatile) {(default) fromDatetime &lt;= column &lt;= toDatetime} <br>
     * And NullIgnored, OnlyOnceRegistered. <br>
     * update_datetime: {NotNull, timestamp(26, 3)}
     * <pre>e.g. setUpdateDatetime_FromTo(fromDate, toDate, op <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> op.<span style="color: #CC4747">compareAsDate()</span>);</pre>
     * @param fromDatetime The from-datetime(yyyy/MM/dd HH:mm:ss.SSS) of updateDatetime. (NullAllowed: if null, no from-condition)
     * @param toDatetime The to-datetime(yyyy/MM/dd HH:mm:ss.SSS) of updateDatetime. (NullAllowed: if null, no to-condition)
     * @param opLambda The callback for option of from-to. (NotNull)
     */
    public void setUpdateDatetime_FromTo(java.time.LocalDateTime fromDatetime, java.time.LocalDateTime toDatetime, ConditionOptionCall<FromToOption> opLambda) {
        setUpdateDatetime_FromTo(fromDatetime, toDatetime, xcFTOP(opLambda));
    }

    /**
     * FromTo with various options. (versatile) {(default) fromDatetime &lt;= column &lt;= toDatetime} <br>
     * And NullIgnored, OnlyOnceRegistered. <br>
     * update_datetime: {NotNull, timestamp(26, 3)}
     * <pre>e.g. setUpdateDatetime_FromTo(fromDate, toDate, new <span style="color: #CC4747">FromToOption</span>().compareAsDate());</pre>
     * @param fromDatetime The from-datetime(yyyy/MM/dd HH:mm:ss.SSS) of updateDatetime. (NullAllowed: if null, no from-condition)
     * @param toDatetime The to-datetime(yyyy/MM/dd HH:mm:ss.SSS) of updateDatetime. (NullAllowed: if null, no to-condition)
     * @param fromToOption The option of from-to. (NotNull)
     */
    protected void setUpdateDatetime_FromTo(java.time.LocalDateTime fromDatetime, java.time.LocalDateTime toDatetime, FromToOption fromToOption) {
        String nm = "update_datetime"; FromToOption op = fromToOption;
        regFTQ(xfFTHD(fromDatetime, nm, op), xfFTHD(toDatetime, nm, op), xgetCValueUpdateDatetime(), nm, op);
    }

    protected void regUpdateDatetime(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueUpdateDatetime(), "update_datetime"); }
    protected abstract ConditionValue xgetCValueUpdateDatetime();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * update_user: {NotNull, varchar(200)}
     * @param updateUser The value of updateUser as equal. (NullAllowed: if null (or empty), no condition)
     */
    public void setUpdateUser_Equal(String updateUser) {
        doSetUpdateUser_Equal(fRES(updateUser));
    }

    protected void doSetUpdateUser_Equal(String updateUser) {
        regUpdateUser(CK_EQ, updateUser);
    }

    /**
     * NotEqual(&lt;&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * update_user: {NotNull, varchar(200)}
     * @param updateUser The value of updateUser as notEqual. (NullAllowed: if null (or empty), no condition)
     */
    public void setUpdateUser_NotEqual(String updateUser) {
        doSetUpdateUser_NotEqual(fRES(updateUser));
    }

    protected void doSetUpdateUser_NotEqual(String updateUser) {
        regUpdateUser(CK_NES, updateUser);
    }

    /**
     * GreaterThan(&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * update_user: {NotNull, varchar(200)}
     * @param updateUser The value of updateUser as greaterThan. (NullAllowed: if null (or empty), no condition)
     */
    public void setUpdateUser_GreaterThan(String updateUser) {
        regUpdateUser(CK_GT, fRES(updateUser));
    }

    /**
     * LessThan(&lt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * update_user: {NotNull, varchar(200)}
     * @param updateUser The value of updateUser as lessThan. (NullAllowed: if null (or empty), no condition)
     */
    public void setUpdateUser_LessThan(String updateUser) {
        regUpdateUser(CK_LT, fRES(updateUser));
    }

    /**
     * GreaterEqual(&gt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * update_user: {NotNull, varchar(200)}
     * @param updateUser The value of updateUser as greaterEqual. (NullAllowed: if null (or empty), no condition)
     */
    public void setUpdateUser_GreaterEqual(String updateUser) {
        regUpdateUser(CK_GE, fRES(updateUser));
    }

    /**
     * LessEqual(&lt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * update_user: {NotNull, varchar(200)}
     * @param updateUser The value of updateUser as lessEqual. (NullAllowed: if null (or empty), no condition)
     */
    public void setUpdateUser_LessEqual(String updateUser) {
        regUpdateUser(CK_LE, fRES(updateUser));
    }

    /**
     * InScope {in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * update_user: {NotNull, varchar(200)}
     * @param updateUserList The collection of updateUser as inScope. (NullAllowed: if null (or empty), no condition)
     */
    public void setUpdateUser_InScope(Collection<String> updateUserList) {
        doSetUpdateUser_InScope(updateUserList);
    }

    protected void doSetUpdateUser_InScope(Collection<String> updateUserList) {
        regINS(CK_INS, cTL(updateUserList), xgetCValueUpdateUser(), "update_user");
    }

    /**
     * NotInScope {not in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * update_user: {NotNull, varchar(200)}
     * @param updateUserList The collection of updateUser as notInScope. (NullAllowed: if null (or empty), no condition)
     */
    public void setUpdateUser_NotInScope(Collection<String> updateUserList) {
        doSetUpdateUser_NotInScope(updateUserList);
    }

    protected void doSetUpdateUser_NotInScope(Collection<String> updateUserList) {
        regINS(CK_NINS, cTL(updateUserList), xgetCValueUpdateUser(), "update_user");
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * update_user: {NotNull, varchar(200)} <br>
     * <pre>e.g. setUpdateUser_LikeSearch("xxx", op <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> op.<span style="color: #CC4747">likeContain()</span>);</pre>
     * @param updateUser The value of updateUser as likeSearch. (NullAllowed: if null (or empty), no condition)
     * @param opLambda The callback for option of like-search. (NotNull)
     */
    public void setUpdateUser_LikeSearch(String updateUser, ConditionOptionCall<LikeSearchOption> opLambda) {
        setUpdateUser_LikeSearch(updateUser, xcLSOP(opLambda));
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * update_user: {NotNull, varchar(200)} <br>
     * <pre>e.g. setUpdateUser_LikeSearch("xxx", new <span style="color: #CC4747">LikeSearchOption</span>().likeContain());</pre>
     * @param updateUser The value of updateUser as likeSearch. (NullAllowed: if null (or empty), no condition)
     * @param likeSearchOption The option of like-search. (NotNull)
     */
    protected void setUpdateUser_LikeSearch(String updateUser, LikeSearchOption likeSearchOption) {
        regLSQ(CK_LS, fRES(updateUser), xgetCValueUpdateUser(), "update_user", likeSearchOption);
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br>
     * And NullOrEmptyIgnored, SeveralRegistered. <br>
     * update_user: {NotNull, varchar(200)}
     * @param updateUser The value of updateUser as notLikeSearch. (NullAllowed: if null (or empty), no condition)
     * @param opLambda The callback for option of like-search. (NotNull)
     */
    public void setUpdateUser_NotLikeSearch(String updateUser, ConditionOptionCall<LikeSearchOption> opLambda) {
        setUpdateUser_NotLikeSearch(updateUser, xcLSOP(opLambda));
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br>
     * And NullOrEmptyIgnored, SeveralRegistered. <br>
     * update_user: {NotNull, varchar(200)}
     * @param updateUser The value of updateUser as notLikeSearch. (NullAllowed: if null (or empty), no condition)
     * @param likeSearchOption The option of not-like-search. (NotNull)
     */
    protected void setUpdateUser_NotLikeSearch(String updateUser, LikeSearchOption likeSearchOption) {
        regLSQ(CK_NLS, fRES(updateUser), xgetCValueUpdateUser(), "update_user", likeSearchOption);
    }

    protected void regUpdateUser(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueUpdateUser(), "update_user"); }
    protected abstract ConditionValue xgetCValueUpdateUser();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * update_process: {NotNull, varchar(200)}
     * @param updateProcess The value of updateProcess as equal. (NullAllowed: if null (or empty), no condition)
     */
    public void setUpdateProcess_Equal(String updateProcess) {
        doSetUpdateProcess_Equal(fRES(updateProcess));
    }

    protected void doSetUpdateProcess_Equal(String updateProcess) {
        regUpdateProcess(CK_EQ, updateProcess);
    }

    /**
     * NotEqual(&lt;&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * update_process: {NotNull, varchar(200)}
     * @param updateProcess The value of updateProcess as notEqual. (NullAllowed: if null (or empty), no condition)
     */
    public void setUpdateProcess_NotEqual(String updateProcess) {
        doSetUpdateProcess_NotEqual(fRES(updateProcess));
    }

    protected void doSetUpdateProcess_NotEqual(String updateProcess) {
        regUpdateProcess(CK_NES, updateProcess);
    }

    /**
     * GreaterThan(&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * update_process: {NotNull, varchar(200)}
     * @param updateProcess The value of updateProcess as greaterThan. (NullAllowed: if null (or empty), no condition)
     */
    public void setUpdateProcess_GreaterThan(String updateProcess) {
        regUpdateProcess(CK_GT, fRES(updateProcess));
    }

    /**
     * LessThan(&lt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * update_process: {NotNull, varchar(200)}
     * @param updateProcess The value of updateProcess as lessThan. (NullAllowed: if null (or empty), no condition)
     */
    public void setUpdateProcess_LessThan(String updateProcess) {
        regUpdateProcess(CK_LT, fRES(updateProcess));
    }

    /**
     * GreaterEqual(&gt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * update_process: {NotNull, varchar(200)}
     * @param updateProcess The value of updateProcess as greaterEqual. (NullAllowed: if null (or empty), no condition)
     */
    public void setUpdateProcess_GreaterEqual(String updateProcess) {
        regUpdateProcess(CK_GE, fRES(updateProcess));
    }

    /**
     * LessEqual(&lt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * update_process: {NotNull, varchar(200)}
     * @param updateProcess The value of updateProcess as lessEqual. (NullAllowed: if null (or empty), no condition)
     */
    public void setUpdateProcess_LessEqual(String updateProcess) {
        regUpdateProcess(CK_LE, fRES(updateProcess));
    }

    /**
     * InScope {in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * update_process: {NotNull, varchar(200)}
     * @param updateProcessList The collection of updateProcess as inScope. (NullAllowed: if null (or empty), no condition)
     */
    public void setUpdateProcess_InScope(Collection<String> updateProcessList) {
        doSetUpdateProcess_InScope(updateProcessList);
    }

    protected void doSetUpdateProcess_InScope(Collection<String> updateProcessList) {
        regINS(CK_INS, cTL(updateProcessList), xgetCValueUpdateProcess(), "update_process");
    }

    /**
     * NotInScope {not in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * update_process: {NotNull, varchar(200)}
     * @param updateProcessList The collection of updateProcess as notInScope. (NullAllowed: if null (or empty), no condition)
     */
    public void setUpdateProcess_NotInScope(Collection<String> updateProcessList) {
        doSetUpdateProcess_NotInScope(updateProcessList);
    }

    protected void doSetUpdateProcess_NotInScope(Collection<String> updateProcessList) {
        regINS(CK_NINS, cTL(updateProcessList), xgetCValueUpdateProcess(), "update_process");
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * update_process: {NotNull, varchar(200)} <br>
     * <pre>e.g. setUpdateProcess_LikeSearch("xxx", op <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> op.<span style="color: #CC4747">likeContain()</span>);</pre>
     * @param updateProcess The value of updateProcess as likeSearch. (NullAllowed: if null (or empty), no condition)
     * @param opLambda The callback for option of like-search. (NotNull)
     */
    public void setUpdateProcess_LikeSearch(String updateProcess, ConditionOptionCall<LikeSearchOption> opLambda) {
        setUpdateProcess_LikeSearch(updateProcess, xcLSOP(opLambda));
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * update_process: {NotNull, varchar(200)} <br>
     * <pre>e.g. setUpdateProcess_LikeSearch("xxx", new <span style="color: #CC4747">LikeSearchOption</span>().likeContain());</pre>
     * @param updateProcess The value of updateProcess as likeSearch. (NullAllowed: if null (or empty), no condition)
     * @param likeSearchOption The option of like-search. (NotNull)
     */
    protected void setUpdateProcess_LikeSearch(String updateProcess, LikeSearchOption likeSearchOption) {
        regLSQ(CK_LS, fRES(updateProcess), xgetCValueUpdateProcess(), "update_process", likeSearchOption);
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br>
     * And NullOrEmptyIgnored, SeveralRegistered. <br>
     * update_process: {NotNull, varchar(200)}
     * @param updateProcess The value of updateProcess as notLikeSearch. (NullAllowed: if null (or empty), no condition)
     * @param opLambda The callback for option of like-search. (NotNull)
     */
    public void setUpdateProcess_NotLikeSearch(String updateProcess, ConditionOptionCall<LikeSearchOption> opLambda) {
        setUpdateProcess_NotLikeSearch(updateProcess, xcLSOP(opLambda));
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br>
     * And NullOrEmptyIgnored, SeveralRegistered. <br>
     * update_process: {NotNull, varchar(200)}
     * @param updateProcess The value of updateProcess as notLikeSearch. (NullAllowed: if null (or empty), no condition)
     * @param likeSearchOption The option of not-like-search. (NotNull)
     */
    protected void setUpdateProcess_NotLikeSearch(String updateProcess, LikeSearchOption likeSearchOption) {
        regLSQ(CK_NLS, fRES(updateProcess), xgetCValueUpdateProcess(), "update_process", likeSearchOption);
    }

    protected void regUpdateProcess(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueUpdateProcess(), "update_process"); }
    protected abstract ConditionValue xgetCValueUpdateProcess();

    /**
     * Equal(=). And NullIgnored, OnlyOnceRegistered. <br>
     * version_no: {NotNull, int8(19)}
     * @param versionNo The value of versionNo as equal. (NullAllowed: if null, no condition)
     */
    public void setVersionNo_Equal(Long versionNo) {
        doSetVersionNo_Equal(versionNo);
    }

    protected void doSetVersionNo_Equal(Long versionNo) {
        regVersionNo(CK_EQ, versionNo);
    }

    /**
     * NotEqual(&lt;&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * version_no: {NotNull, int8(19)}
     * @param versionNo The value of versionNo as notEqual. (NullAllowed: if null, no condition)
     */
    public void setVersionNo_NotEqual(Long versionNo) {
        doSetVersionNo_NotEqual(versionNo);
    }

    protected void doSetVersionNo_NotEqual(Long versionNo) {
        regVersionNo(CK_NES, versionNo);
    }

    /**
     * GreaterThan(&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * version_no: {NotNull, int8(19)}
     * @param versionNo The value of versionNo as greaterThan. (NullAllowed: if null, no condition)
     */
    public void setVersionNo_GreaterThan(Long versionNo) {
        regVersionNo(CK_GT, versionNo);
    }

    /**
     * LessThan(&lt;). And NullIgnored, OnlyOnceRegistered. <br>
     * version_no: {NotNull, int8(19)}
     * @param versionNo The value of versionNo as lessThan. (NullAllowed: if null, no condition)
     */
    public void setVersionNo_LessThan(Long versionNo) {
        regVersionNo(CK_LT, versionNo);
    }

    /**
     * GreaterEqual(&gt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * version_no: {NotNull, int8(19)}
     * @param versionNo The value of versionNo as greaterEqual. (NullAllowed: if null, no condition)
     */
    public void setVersionNo_GreaterEqual(Long versionNo) {
        regVersionNo(CK_GE, versionNo);
    }

    /**
     * LessEqual(&lt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * version_no: {NotNull, int8(19)}
     * @param versionNo The value of versionNo as lessEqual. (NullAllowed: if null, no condition)
     */
    public void setVersionNo_LessEqual(Long versionNo) {
        regVersionNo(CK_LE, versionNo);
    }

    /**
     * RangeOf with various options. (versatile) <br>
     * {(default) minNumber &lt;= column &lt;= maxNumber} <br>
     * And NullIgnored, OnlyOnceRegistered. <br>
     * version_no: {NotNull, int8(19)}
     * @param minNumber The min number of versionNo. (NullAllowed: if null, no from-condition)
     * @param maxNumber The max number of versionNo. (NullAllowed: if null, no to-condition)
     * @param opLambda The callback for option of range-of. (NotNull)
     */
    public void setVersionNo_RangeOf(Long minNumber, Long maxNumber, ConditionOptionCall<RangeOfOption> opLambda) {
        setVersionNo_RangeOf(minNumber, maxNumber, xcROOP(opLambda));
    }

    /**
     * RangeOf with various options. (versatile) <br>
     * {(default) minNumber &lt;= column &lt;= maxNumber} <br>
     * And NullIgnored, OnlyOnceRegistered. <br>
     * version_no: {NotNull, int8(19)}
     * @param minNumber The min number of versionNo. (NullAllowed: if null, no from-condition)
     * @param maxNumber The max number of versionNo. (NullAllowed: if null, no to-condition)
     * @param rangeOfOption The option of range-of. (NotNull)
     */
    protected void setVersionNo_RangeOf(Long minNumber, Long maxNumber, RangeOfOption rangeOfOption) {
        regROO(minNumber, maxNumber, xgetCValueVersionNo(), "version_no", rangeOfOption);
    }

    /**
     * InScope {in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * version_no: {NotNull, int8(19)}
     * @param versionNoList The collection of versionNo as inScope. (NullAllowed: if null (or empty), no condition)
     */
    public void setVersionNo_InScope(Collection<Long> versionNoList) {
        doSetVersionNo_InScope(versionNoList);
    }

    protected void doSetVersionNo_InScope(Collection<Long> versionNoList) {
        regINS(CK_INS, cTL(versionNoList), xgetCValueVersionNo(), "version_no");
    }

    /**
     * NotInScope {not in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * version_no: {NotNull, int8(19)}
     * @param versionNoList The collection of versionNo as notInScope. (NullAllowed: if null (or empty), no condition)
     */
    public void setVersionNo_NotInScope(Collection<Long> versionNoList) {
        doSetVersionNo_NotInScope(versionNoList);
    }

    protected void doSetVersionNo_NotInScope(Collection<Long> versionNoList) {
        regINS(CK_NINS, cTL(versionNoList), xgetCValueVersionNo(), "version_no");
    }

    protected void regVersionNo(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueVersionNo(), "version_no"); }
    protected abstract ConditionValue xgetCValueVersionNo();

    // ===================================================================================
    //                                                                     ScalarCondition
    //                                                                     ===============
    /**
     * Prepare ScalarCondition as equal. <br>
     * {where FOO = (select max(BAR) from ...)
     * <pre>
     * cb.query().<span style="color: #CC4747">scalar_Equal()</span>.max(new SubQuery&lt;PurchaseCB&gt;() {
     *     public void query(PurchaseCB subCB) {
     *         subCB.specify().setXxx... <span style="color: #3F7E5E">// derived column for function</span>
     *         subCB.query().setYyy...
     *     }
     * });
     * </pre>
     * @return The object to set up a function. (NotNull)
     */
    public HpSSQFunction<PurchaseCB> scalar_Equal() {
        return xcreateSSQFunction(CK_EQ, PurchaseCB.class);
    }

    /**
     * Prepare ScalarCondition as equal. <br>
     * {where FOO &lt;&gt; (select max(BAR) from ...)
     * <pre>
     * cb.query().<span style="color: #CC4747">scalar_NotEqual()</span>.max(new SubQuery&lt;PurchaseCB&gt;() {
     *     public void query(PurchaseCB subCB) {
     *         subCB.specify().setXxx... <span style="color: #3F7E5E">// derived column for function</span>
     *         subCB.query().setYyy...
     *     }
     * });
     * </pre>
     * @return The object to set up a function. (NotNull)
     */
    public HpSSQFunction<PurchaseCB> scalar_NotEqual() {
        return xcreateSSQFunction(CK_NES, PurchaseCB.class);
    }

    /**
     * Prepare ScalarCondition as greaterThan. <br>
     * {where FOO &gt; (select max(BAR) from ...)
     * <pre>
     * cb.query().<span style="color: #CC4747">scalar_GreaterThan()</span>.max(new SubQuery&lt;PurchaseCB&gt;() {
     *     public void query(PurchaseCB subCB) {
     *         subCB.specify().setFoo... <span style="color: #3F7E5E">// derived column for function</span>
     *         subCB.query().setBar...
     *     }
     * });
     * </pre>
     * @return The object to set up a function. (NotNull)
     */
    public HpSSQFunction<PurchaseCB> scalar_GreaterThan() {
        return xcreateSSQFunction(CK_GT, PurchaseCB.class);
    }

    /**
     * Prepare ScalarCondition as lessThan. <br>
     * {where FOO &lt; (select max(BAR) from ...)
     * <pre>
     * cb.query().<span style="color: #CC4747">scalar_LessThan()</span>.max(new SubQuery&lt;PurchaseCB&gt;() {
     *     public void query(PurchaseCB subCB) {
     *         subCB.specify().setFoo... <span style="color: #3F7E5E">// derived column for function</span>
     *         subCB.query().setBar...
     *     }
     * });
     * </pre>
     * @return The object to set up a function. (NotNull)
     */
    public HpSSQFunction<PurchaseCB> scalar_LessThan() {
        return xcreateSSQFunction(CK_LT, PurchaseCB.class);
    }

    /**
     * Prepare ScalarCondition as greaterEqual. <br>
     * {where FOO &gt;= (select max(BAR) from ...)
     * <pre>
     * cb.query().<span style="color: #CC4747">scalar_GreaterEqual()</span>.max(new SubQuery&lt;PurchaseCB&gt;() {
     *     public void query(PurchaseCB subCB) {
     *         subCB.specify().setFoo... <span style="color: #3F7E5E">// derived column for function</span>
     *         subCB.query().setBar...
     *     }
     * });
     * </pre>
     * @return The object to set up a function. (NotNull)
     */
    public HpSSQFunction<PurchaseCB> scalar_GreaterEqual() {
        return xcreateSSQFunction(CK_GE, PurchaseCB.class);
    }

    /**
     * Prepare ScalarCondition as lessEqual. <br>
     * {where FOO &lt;= (select max(BAR) from ...)
     * <pre>
     * cb.query().<span style="color: #CC4747">scalar_LessEqual()</span>.max(new SubQuery&lt;PurchaseCB&gt;() {
     *     public void query(PurchaseCB subCB) {
     *         subCB.specify().setFoo... <span style="color: #3F7E5E">// derived column for function</span>
     *         subCB.query().setBar...
     *     }
     * });
     * </pre>
     * @return The object to set up a function. (NotNull)
     */
    public HpSSQFunction<PurchaseCB> scalar_LessEqual() {
        return xcreateSSQFunction(CK_LE, PurchaseCB.class);
    }

    @SuppressWarnings("unchecked")
    protected <CB extends ConditionBean> void xscalarCondition(String fn, SubQuery<CB> sq, String rd, HpSSQOption<CB> op) {
        assertObjectNotNull("subQuery", sq);
        PurchaseCB cb = xcreateScalarConditionCB(); sq.query((CB)cb);
        String pp = keepScalarCondition(cb.query()); // for saving query-value
        op.setPartitionByCBean((CB)xcreateScalarConditionPartitionByCB()); // for using partition-by
        registerScalarCondition(fn, cb.query(), pp, rd, op);
    }
    public abstract String keepScalarCondition(PurchaseCQ sq);

    protected PurchaseCB xcreateScalarConditionCB() {
        PurchaseCB cb = newMyCB(); cb.xsetupForScalarCondition(this); return cb;
    }

    protected PurchaseCB xcreateScalarConditionPartitionByCB() {
        PurchaseCB cb = newMyCB(); cb.xsetupForScalarConditionPartitionBy(this); return cb;
    }

    // ===================================================================================
    //                                                                       MyselfDerived
    //                                                                       =============
    public void xsmyselfDerive(String fn, SubQuery<PurchaseCB> sq, String al, DerivedReferrerOption op) {
        assertObjectNotNull("subQuery", sq);
        PurchaseCB cb = new PurchaseCB(); cb.xsetupForDerivedReferrer(this);
        lockCall(() -> sq.query(cb)); String pp = keepSpecifyMyselfDerived(cb.query()); String pk = "purchase_id";
        registerSpecifyMyselfDerived(fn, cb.query(), pk, pk, pp, "myselfDerived", al, op);
    }
    public abstract String keepSpecifyMyselfDerived(PurchaseCQ sq);

    /**
     * Prepare for (Query)MyselfDerived (correlated sub-query).
     * @return The object to set up a function for myself table. (NotNull)
     */
    public HpQDRFunction<PurchaseCB> myselfDerived() {
        return xcreateQDRFunctionMyselfDerived(PurchaseCB.class);
    }
    @SuppressWarnings("unchecked")
    protected <CB extends ConditionBean> void xqderiveMyselfDerived(String fn, SubQuery<CB> sq, String rd, Object vl, DerivedReferrerOption op) {
        assertObjectNotNull("subQuery", sq);
        PurchaseCB cb = new PurchaseCB(); cb.xsetupForDerivedReferrer(this); sq.query((CB)cb);
        String pk = "purchase_id";
        String sqpp = keepQueryMyselfDerived(cb.query()); // for saving query-value.
        String prpp = keepQueryMyselfDerivedParameter(vl);
        registerQueryMyselfDerived(fn, cb.query(), pk, pk, sqpp, "myselfDerived", rd, vl, prpp, op);
    }
    public abstract String keepQueryMyselfDerived(PurchaseCQ sq);
    public abstract String keepQueryMyselfDerivedParameter(Object vl);

    // ===================================================================================
    //                                                                        MyselfExists
    //                                                                        ============
    /**
     * Prepare for MyselfExists (correlated sub-query).
     * @param subCBLambda The implementation of sub-query. (NotNull)
     */
    public void myselfExists(SubQuery<PurchaseCB> subCBLambda) {
        assertObjectNotNull("subCBLambda", subCBLambda);
        PurchaseCB cb = new PurchaseCB(); cb.xsetupForMyselfExists(this);
        lockCall(() -> subCBLambda.query(cb)); String pp = keepMyselfExists(cb.query());
        registerMyselfExists(cb.query(), pp);
    }
    public abstract String keepMyselfExists(PurchaseCQ sq);

    // ===================================================================================
    //                                                                        Manual Order
    //                                                                        ============
    /**
     * Order along manual ordering information.
     * <pre>
     * cb.query().addOrderBy_Birthdate_Asc().<span style="color: #CC4747">withManualOrder</span>(<span style="color: #553000">op</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #553000">op</span>.<span style="color: #CC4747">when_GreaterEqual</span>(priorityDate); <span style="color: #3F7E5E">// e.g. 2000/01/01</span>
     * });
     * <span style="color: #3F7E5E">// order by </span>
     * <span style="color: #3F7E5E">//   case</span>
     * <span style="color: #3F7E5E">//     when BIRTHDATE &gt;= '2000/01/01' then 0</span>
     * <span style="color: #3F7E5E">//     else 1</span>
     * <span style="color: #3F7E5E">//   end asc, ...</span>
     *
     * cb.query().addOrderBy_MemberStatusCode_Asc().<span style="color: #CC4747">withManualOrder</span>(<span style="color: #553000">op</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #553000">op</span>.<span style="color: #CC4747">when_GreaterEqual</span>(priorityDate); <span style="color: #3F7E5E">// e.g. 2000/01/01</span>
     *     <span style="color: #553000">op</span>.<span style="color: #CC4747">when_Equal</span>(CDef.MemberStatus.Withdrawal);
     *     <span style="color: #553000">op</span>.<span style="color: #CC4747">when_Equal</span>(CDef.MemberStatus.Formalized);
     *     <span style="color: #553000">op</span>.<span style="color: #CC4747">when_Equal</span>(CDef.MemberStatus.Provisional);
     * });
     * <span style="color: #3F7E5E">// order by </span>
     * <span style="color: #3F7E5E">//   case</span>
     * <span style="color: #3F7E5E">//     when MEMBER_STATUS_CODE = 'WDL' then 0</span>
     * <span style="color: #3F7E5E">//     when MEMBER_STATUS_CODE = 'FML' then 1</span>
     * <span style="color: #3F7E5E">//     when MEMBER_STATUS_CODE = 'PRV' then 2</span>
     * <span style="color: #3F7E5E">//     else 3</span>
     * <span style="color: #3F7E5E">//   end asc, ...</span>
     * </pre>
     * <p>This function with Union is unsupported!</p>
     * <p>The order values are bound (treated as bind parameter).</p>
     * @param opLambda The callback for option of manual-order containing order values. (NotNull)
     */
    public void withManualOrder(ManualOrderOptionCall opLambda) { // is user public!
        xdoWithManualOrder(cMOO(opLambda));
    }

    // ===================================================================================
    //                                                                    Small Adjustment
    //                                                                    ================
    // ===================================================================================
    //                                                                       Very Internal
    //                                                                       =============
    protected PurchaseCB newMyCB() {
        return new PurchaseCB();
    }
    // very internal (for suppressing warn about 'Not Use Import')
    protected String xabUDT() { return Date.class.getName(); }
    protected String xabCQ() { return PurchaseCQ.class.getName(); }
    protected String xabLSO() { return LikeSearchOption.class.getName(); }
    protected String xabSSQS() { return HpSSQSetupper.class.getName(); }
    protected String xabSCP() { return SubQuery.class.getName(); }
}
