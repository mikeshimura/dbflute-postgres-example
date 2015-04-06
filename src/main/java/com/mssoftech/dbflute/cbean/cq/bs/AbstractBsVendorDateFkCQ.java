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
 * The abstract condition-query of vendor_date_fk.
 * @author DBFlute(AutoGenerator)
 */
public abstract class AbstractBsVendorDateFkCQ extends AbstractConditionQuery {

    // ===================================================================================
    //                                                                         Constructor
    //                                                                         ===========
    public AbstractBsVendorDateFkCQ(ConditionQuery referrerQuery, SqlClause sqlClause, String aliasName, int nestLevel) {
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
        return "vendor_date_fk";
    }

    // ===================================================================================
    //                                                                               Query
    //                                                                               =====
    /**
     * Equal(=). And NullIgnored, OnlyOnceRegistered. <br>
     * bar_id: {PK, NotNull, int4(10)}
     * @param barId The value of barId as equal. (NullAllowed: if null, no condition)
     */
    public void setBarId_Equal(Integer barId) {
        doSetBarId_Equal(barId);
    }

    protected void doSetBarId_Equal(Integer barId) {
        regBarId(CK_EQ, barId);
    }

    /**
     * NotEqual(&lt;&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * bar_id: {PK, NotNull, int4(10)}
     * @param barId The value of barId as notEqual. (NullAllowed: if null, no condition)
     */
    public void setBarId_NotEqual(Integer barId) {
        doSetBarId_NotEqual(barId);
    }

    protected void doSetBarId_NotEqual(Integer barId) {
        regBarId(CK_NES, barId);
    }

    /**
     * GreaterThan(&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * bar_id: {PK, NotNull, int4(10)}
     * @param barId The value of barId as greaterThan. (NullAllowed: if null, no condition)
     */
    public void setBarId_GreaterThan(Integer barId) {
        regBarId(CK_GT, barId);
    }

    /**
     * LessThan(&lt;). And NullIgnored, OnlyOnceRegistered. <br>
     * bar_id: {PK, NotNull, int4(10)}
     * @param barId The value of barId as lessThan. (NullAllowed: if null, no condition)
     */
    public void setBarId_LessThan(Integer barId) {
        regBarId(CK_LT, barId);
    }

    /**
     * GreaterEqual(&gt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * bar_id: {PK, NotNull, int4(10)}
     * @param barId The value of barId as greaterEqual. (NullAllowed: if null, no condition)
     */
    public void setBarId_GreaterEqual(Integer barId) {
        regBarId(CK_GE, barId);
    }

    /**
     * LessEqual(&lt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * bar_id: {PK, NotNull, int4(10)}
     * @param barId The value of barId as lessEqual. (NullAllowed: if null, no condition)
     */
    public void setBarId_LessEqual(Integer barId) {
        regBarId(CK_LE, barId);
    }

    /**
     * RangeOf with various options. (versatile) <br>
     * {(default) minNumber &lt;= column &lt;= maxNumber} <br>
     * And NullIgnored, OnlyOnceRegistered. <br>
     * bar_id: {PK, NotNull, int4(10)}
     * @param minNumber The min number of barId. (NullAllowed: if null, no from-condition)
     * @param maxNumber The max number of barId. (NullAllowed: if null, no to-condition)
     * @param opLambda The callback for option of range-of. (NotNull)
     */
    public void setBarId_RangeOf(Integer minNumber, Integer maxNumber, ConditionOptionCall<RangeOfOption> opLambda) {
        setBarId_RangeOf(minNumber, maxNumber, xcROOP(opLambda));
    }

    /**
     * RangeOf with various options. (versatile) <br>
     * {(default) minNumber &lt;= column &lt;= maxNumber} <br>
     * And NullIgnored, OnlyOnceRegistered. <br>
     * bar_id: {PK, NotNull, int4(10)}
     * @param minNumber The min number of barId. (NullAllowed: if null, no from-condition)
     * @param maxNumber The max number of barId. (NullAllowed: if null, no to-condition)
     * @param rangeOfOption The option of range-of. (NotNull)
     */
    protected void setBarId_RangeOf(Integer minNumber, Integer maxNumber, RangeOfOption rangeOfOption) {
        regROO(minNumber, maxNumber, xgetCValueBarId(), "bar_id", rangeOfOption);
    }

    /**
     * InScope {in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * bar_id: {PK, NotNull, int4(10)}
     * @param barIdList The collection of barId as inScope. (NullAllowed: if null (or empty), no condition)
     */
    public void setBarId_InScope(Collection<Integer> barIdList) {
        doSetBarId_InScope(barIdList);
    }

    protected void doSetBarId_InScope(Collection<Integer> barIdList) {
        regINS(CK_INS, cTL(barIdList), xgetCValueBarId(), "bar_id");
    }

    /**
     * NotInScope {not in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * bar_id: {PK, NotNull, int4(10)}
     * @param barIdList The collection of barId as notInScope. (NullAllowed: if null (or empty), no condition)
     */
    public void setBarId_NotInScope(Collection<Integer> barIdList) {
        doSetBarId_NotInScope(barIdList);
    }

    protected void doSetBarId_NotInScope(Collection<Integer> barIdList) {
        regINS(CK_NINS, cTL(barIdList), xgetCValueBarId(), "bar_id");
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * bar_id: {PK, NotNull, int4(10)}
     */
    public void setBarId_IsNull() { regBarId(CK_ISN, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * bar_id: {PK, NotNull, int4(10)}
     */
    public void setBarId_IsNotNull() { regBarId(CK_ISNN, DOBJ); }

    protected void regBarId(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueBarId(), "bar_id"); }
    protected abstract ConditionValue xgetCValueBarId();

    /**
     * Equal(=). And NullIgnored, OnlyOnceRegistered. <br>
     * bar_date: {NotNull, date(13), FK to vendor_date_pk}
     * @param barDate The value of barDate as equal. (NullAllowed: if null, no condition)
     */
    public void setBarDate_Equal(java.time.LocalDate barDate) {
        regBarDate(CK_EQ,  barDate);
    }

    /**
     * GreaterThan(&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * bar_date: {NotNull, date(13), FK to vendor_date_pk}
     * @param barDate The value of barDate as greaterThan. (NullAllowed: if null, no condition)
     */
    public void setBarDate_GreaterThan(java.time.LocalDate barDate) {
        regBarDate(CK_GT,  barDate);
    }

    /**
     * LessThan(&lt;). And NullIgnored, OnlyOnceRegistered. <br>
     * bar_date: {NotNull, date(13), FK to vendor_date_pk}
     * @param barDate The value of barDate as lessThan. (NullAllowed: if null, no condition)
     */
    public void setBarDate_LessThan(java.time.LocalDate barDate) {
        regBarDate(CK_LT,  barDate);
    }

    /**
     * GreaterEqual(&gt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * bar_date: {NotNull, date(13), FK to vendor_date_pk}
     * @param barDate The value of barDate as greaterEqual. (NullAllowed: if null, no condition)
     */
    public void setBarDate_GreaterEqual(java.time.LocalDate barDate) {
        regBarDate(CK_GE,  barDate);
    }

    /**
     * LessEqual(&lt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * bar_date: {NotNull, date(13), FK to vendor_date_pk}
     * @param barDate The value of barDate as lessEqual. (NullAllowed: if null, no condition)
     */
    public void setBarDate_LessEqual(java.time.LocalDate barDate) {
        regBarDate(CK_LE, barDate);
    }

    /**
     * FromTo with various options. (versatile) {(default) fromDatetime &lt;= column &lt;= toDatetime} <br>
     * And NullIgnored, OnlyOnceRegistered. <br>
     * bar_date: {NotNull, date(13), FK to vendor_date_pk}
     * <pre>e.g. setBarDate_FromTo(fromDate, toDate, op <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> op.<span style="color: #CC4747">compareAsDate()</span>);</pre>
     * @param fromDatetime The from-datetime(yyyy/MM/dd HH:mm:ss.SSS) of barDate. (NullAllowed: if null, no from-condition)
     * @param toDatetime The to-datetime(yyyy/MM/dd HH:mm:ss.SSS) of barDate. (NullAllowed: if null, no to-condition)
     * @param opLambda The callback for option of from-to. (NotNull)
     */
    public void setBarDate_FromTo(java.time.LocalDate fromDatetime, java.time.LocalDate toDatetime, ConditionOptionCall<FromToOption> opLambda) {
        setBarDate_FromTo(fromDatetime, toDatetime, xcFTOP(opLambda));
    }

    /**
     * FromTo with various options. (versatile) {(default) fromDatetime &lt;= column &lt;= toDatetime} <br>
     * And NullIgnored, OnlyOnceRegistered. <br>
     * bar_date: {NotNull, date(13), FK to vendor_date_pk}
     * <pre>e.g. setBarDate_FromTo(fromDate, toDate, new <span style="color: #CC4747">FromToOption</span>().compareAsDate());</pre>
     * @param fromDatetime The from-datetime(yyyy/MM/dd HH:mm:ss.SSS) of barDate. (NullAllowed: if null, no from-condition)
     * @param toDatetime The to-datetime(yyyy/MM/dd HH:mm:ss.SSS) of barDate. (NullAllowed: if null, no to-condition)
     * @param fromToOption The option of from-to. (NotNull)
     */
    protected void setBarDate_FromTo(java.time.LocalDate fromDatetime, java.time.LocalDate toDatetime, FromToOption fromToOption) {
        String nm = "bar_date"; FromToOption op = fromToOption;
        regFTQ(xfFTHD(fromDatetime, nm, op), xfFTHD(toDatetime, nm, op), xgetCValueBarDate(), nm, op);
    }

    /**
     * InScope {in ('1965-03-03', '1966-09-15')}. And NullOrEmptyIgnored, NullElementIgnored, SeveralRegistered. <br>
     * bar_date: {NotNull, date(13), FK to vendor_date_pk}
     * @param barDateList The collection of barDate as inScope. (NullAllowed: if null (or empty), no condition)
     */
    public void setBarDate_InScope(Collection<java.time.LocalDate> barDateList) {
        doSetBarDate_InScope(barDateList);
    }

    protected void doSetBarDate_InScope(Collection<java.time.LocalDate> barDateList) {
        regINS(CK_INS, cTL(barDateList), xgetCValueBarDate(), "bar_date");
    }

    protected void regBarDate(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueBarDate(), "bar_date"); }
    protected abstract ConditionValue xgetCValueBarDate();

    // ===================================================================================
    //                                                                     ScalarCondition
    //                                                                     ===============
    /**
     * Prepare ScalarCondition as equal. <br>
     * {where FOO = (select max(BAR) from ...)
     * <pre>
     * cb.query().<span style="color: #CC4747">scalar_Equal()</span>.max(new SubQuery&lt;VendorDateFkCB&gt;() {
     *     public void query(VendorDateFkCB subCB) {
     *         subCB.specify().setXxx... <span style="color: #3F7E5E">// derived column for function</span>
     *         subCB.query().setYyy...
     *     }
     * });
     * </pre>
     * @return The object to set up a function. (NotNull)
     */
    public HpSSQFunction<VendorDateFkCB> scalar_Equal() {
        return xcreateSSQFunction(CK_EQ, VendorDateFkCB.class);
    }

    /**
     * Prepare ScalarCondition as equal. <br>
     * {where FOO &lt;&gt; (select max(BAR) from ...)
     * <pre>
     * cb.query().<span style="color: #CC4747">scalar_NotEqual()</span>.max(new SubQuery&lt;VendorDateFkCB&gt;() {
     *     public void query(VendorDateFkCB subCB) {
     *         subCB.specify().setXxx... <span style="color: #3F7E5E">// derived column for function</span>
     *         subCB.query().setYyy...
     *     }
     * });
     * </pre>
     * @return The object to set up a function. (NotNull)
     */
    public HpSSQFunction<VendorDateFkCB> scalar_NotEqual() {
        return xcreateSSQFunction(CK_NES, VendorDateFkCB.class);
    }

    /**
     * Prepare ScalarCondition as greaterThan. <br>
     * {where FOO &gt; (select max(BAR) from ...)
     * <pre>
     * cb.query().<span style="color: #CC4747">scalar_GreaterThan()</span>.max(new SubQuery&lt;VendorDateFkCB&gt;() {
     *     public void query(VendorDateFkCB subCB) {
     *         subCB.specify().setFoo... <span style="color: #3F7E5E">// derived column for function</span>
     *         subCB.query().setBar...
     *     }
     * });
     * </pre>
     * @return The object to set up a function. (NotNull)
     */
    public HpSSQFunction<VendorDateFkCB> scalar_GreaterThan() {
        return xcreateSSQFunction(CK_GT, VendorDateFkCB.class);
    }

    /**
     * Prepare ScalarCondition as lessThan. <br>
     * {where FOO &lt; (select max(BAR) from ...)
     * <pre>
     * cb.query().<span style="color: #CC4747">scalar_LessThan()</span>.max(new SubQuery&lt;VendorDateFkCB&gt;() {
     *     public void query(VendorDateFkCB subCB) {
     *         subCB.specify().setFoo... <span style="color: #3F7E5E">// derived column for function</span>
     *         subCB.query().setBar...
     *     }
     * });
     * </pre>
     * @return The object to set up a function. (NotNull)
     */
    public HpSSQFunction<VendorDateFkCB> scalar_LessThan() {
        return xcreateSSQFunction(CK_LT, VendorDateFkCB.class);
    }

    /**
     * Prepare ScalarCondition as greaterEqual. <br>
     * {where FOO &gt;= (select max(BAR) from ...)
     * <pre>
     * cb.query().<span style="color: #CC4747">scalar_GreaterEqual()</span>.max(new SubQuery&lt;VendorDateFkCB&gt;() {
     *     public void query(VendorDateFkCB subCB) {
     *         subCB.specify().setFoo... <span style="color: #3F7E5E">// derived column for function</span>
     *         subCB.query().setBar...
     *     }
     * });
     * </pre>
     * @return The object to set up a function. (NotNull)
     */
    public HpSSQFunction<VendorDateFkCB> scalar_GreaterEqual() {
        return xcreateSSQFunction(CK_GE, VendorDateFkCB.class);
    }

    /**
     * Prepare ScalarCondition as lessEqual. <br>
     * {where FOO &lt;= (select max(BAR) from ...)
     * <pre>
     * cb.query().<span style="color: #CC4747">scalar_LessEqual()</span>.max(new SubQuery&lt;VendorDateFkCB&gt;() {
     *     public void query(VendorDateFkCB subCB) {
     *         subCB.specify().setFoo... <span style="color: #3F7E5E">// derived column for function</span>
     *         subCB.query().setBar...
     *     }
     * });
     * </pre>
     * @return The object to set up a function. (NotNull)
     */
    public HpSSQFunction<VendorDateFkCB> scalar_LessEqual() {
        return xcreateSSQFunction(CK_LE, VendorDateFkCB.class);
    }

    @SuppressWarnings("unchecked")
    protected <CB extends ConditionBean> void xscalarCondition(String fn, SubQuery<CB> sq, String rd, HpSSQOption<CB> op) {
        assertObjectNotNull("subQuery", sq);
        VendorDateFkCB cb = xcreateScalarConditionCB(); sq.query((CB)cb);
        String pp = keepScalarCondition(cb.query()); // for saving query-value
        op.setPartitionByCBean((CB)xcreateScalarConditionPartitionByCB()); // for using partition-by
        registerScalarCondition(fn, cb.query(), pp, rd, op);
    }
    public abstract String keepScalarCondition(VendorDateFkCQ sq);

    protected VendorDateFkCB xcreateScalarConditionCB() {
        VendorDateFkCB cb = newMyCB(); cb.xsetupForScalarCondition(this); return cb;
    }

    protected VendorDateFkCB xcreateScalarConditionPartitionByCB() {
        VendorDateFkCB cb = newMyCB(); cb.xsetupForScalarConditionPartitionBy(this); return cb;
    }

    // ===================================================================================
    //                                                                       MyselfDerived
    //                                                                       =============
    public void xsmyselfDerive(String fn, SubQuery<VendorDateFkCB> sq, String al, DerivedReferrerOption op) {
        assertObjectNotNull("subQuery", sq);
        VendorDateFkCB cb = new VendorDateFkCB(); cb.xsetupForDerivedReferrer(this);
        lockCall(() -> sq.query(cb)); String pp = keepSpecifyMyselfDerived(cb.query()); String pk = "bar_id";
        registerSpecifyMyselfDerived(fn, cb.query(), pk, pk, pp, "myselfDerived", al, op);
    }
    public abstract String keepSpecifyMyselfDerived(VendorDateFkCQ sq);

    /**
     * Prepare for (Query)MyselfDerived (correlated sub-query).
     * @return The object to set up a function for myself table. (NotNull)
     */
    public HpQDRFunction<VendorDateFkCB> myselfDerived() {
        return xcreateQDRFunctionMyselfDerived(VendorDateFkCB.class);
    }
    @SuppressWarnings("unchecked")
    protected <CB extends ConditionBean> void xqderiveMyselfDerived(String fn, SubQuery<CB> sq, String rd, Object vl, DerivedReferrerOption op) {
        assertObjectNotNull("subQuery", sq);
        VendorDateFkCB cb = new VendorDateFkCB(); cb.xsetupForDerivedReferrer(this); sq.query((CB)cb);
        String pk = "bar_id";
        String sqpp = keepQueryMyselfDerived(cb.query()); // for saving query-value.
        String prpp = keepQueryMyselfDerivedParameter(vl);
        registerQueryMyselfDerived(fn, cb.query(), pk, pk, sqpp, "myselfDerived", rd, vl, prpp, op);
    }
    public abstract String keepQueryMyselfDerived(VendorDateFkCQ sq);
    public abstract String keepQueryMyselfDerivedParameter(Object vl);

    // ===================================================================================
    //                                                                        MyselfExists
    //                                                                        ============
    /**
     * Prepare for MyselfExists (correlated sub-query).
     * @param subCBLambda The implementation of sub-query. (NotNull)
     */
    public void myselfExists(SubQuery<VendorDateFkCB> subCBLambda) {
        assertObjectNotNull("subCBLambda", subCBLambda);
        VendorDateFkCB cb = new VendorDateFkCB(); cb.xsetupForMyselfExists(this);
        lockCall(() -> subCBLambda.query(cb)); String pp = keepMyselfExists(cb.query());
        registerMyselfExists(cb.query(), pp);
    }
    public abstract String keepMyselfExists(VendorDateFkCQ sq);

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
    protected VendorDateFkCB newMyCB() {
        return new VendorDateFkCB();
    }
    // very internal (for suppressing warn about 'Not Use Import')
    protected String xabUDT() { return Date.class.getName(); }
    protected String xabCQ() { return VendorDateFkCQ.class.getName(); }
    protected String xabLSO() { return LikeSearchOption.class.getName(); }
    protected String xabSSQS() { return HpSSQSetupper.class.getName(); }
    protected String xabSCP() { return SubQuery.class.getName(); }
}
