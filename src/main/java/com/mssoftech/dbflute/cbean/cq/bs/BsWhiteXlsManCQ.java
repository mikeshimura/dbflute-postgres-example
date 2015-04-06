package com.mssoftech.dbflute.cbean.cq.bs;

import java.util.Map;

import org.dbflute.cbean.*;
import org.dbflute.cbean.chelper.*;
import org.dbflute.cbean.coption.*;
import org.dbflute.cbean.cvalue.ConditionValue;
import org.dbflute.cbean.sqlclause.SqlClause;
import org.dbflute.exception.IllegalConditionBeanOperationException;
import com.mssoftech.dbflute.cbean.cq.ciq.*;
import com.mssoftech.dbflute.cbean.*;
import com.mssoftech.dbflute.cbean.cq.*;

/**
 * The base condition-query of white_xls_man.
 * @author DBFlute(AutoGenerator)
 */
public class BsWhiteXlsManCQ extends AbstractBsWhiteXlsManCQ {

    // ===================================================================================
    //                                                                           Attribute
    //                                                                           =========
    protected WhiteXlsManCIQ _inlineQuery;

    // ===================================================================================
    //                                                                         Constructor
    //                                                                         ===========
    public BsWhiteXlsManCQ(ConditionQuery referrerQuery, SqlClause sqlClause, String aliasName, int nestLevel) {
        super(referrerQuery, sqlClause, aliasName, nestLevel);
    }

    // ===================================================================================
    //                                                                 InlineView/OrClause
    //                                                                 ===================
    /**
     * Prepare InlineView query. <br>
     * {select ... from ... left outer join (select * from white_xls_man) where FOO = [value] ...}
     * <pre>
     * cb.query().queryMemberStatus().<span style="color: #CC4747">inline()</span>.setFoo...;
     * </pre>
     * @return The condition-query for InlineView query. (NotNull)
     */
    public WhiteXlsManCIQ inline() {
        if (_inlineQuery == null) { _inlineQuery = xcreateCIQ(); }
        _inlineQuery.xsetOnClause(false); return _inlineQuery;
    }

    protected WhiteXlsManCIQ xcreateCIQ() {
        WhiteXlsManCIQ ciq = xnewCIQ();
        ciq.xsetBaseCB(_baseCB);
        return ciq;
    }

    protected WhiteXlsManCIQ xnewCIQ() {
        return new WhiteXlsManCIQ(xgetReferrerQuery(), xgetSqlClause(), xgetAliasName(), xgetNestLevel(), this);
    }

    /**
     * Prepare OnClause query. <br>
     * {select ... from ... left outer join white_xls_man on ... and FOO = [value] ...}
     * <pre>
     * cb.query().queryMemberStatus().<span style="color: #CC4747">on()</span>.setFoo...;
     * </pre>
     * @return The condition-query for OnClause query. (NotNull)
     * @throws IllegalConditionBeanOperationException When this condition-query is base query.
     */
    public WhiteXlsManCIQ on() {
        if (isBaseQuery()) { throw new IllegalConditionBeanOperationException("OnClause for local table is unavailable!"); }
        WhiteXlsManCIQ inlineQuery = inline(); inlineQuery.xsetOnClause(true); return inlineQuery;
    }

    // ===================================================================================
    //                                                                               Query
    //                                                                               =====
    protected ConditionValue _xlsManId;
    public ConditionValue xdfgetXlsManId()
    { if (_xlsManId == null) { _xlsManId = nCV(); }
      return _xlsManId; }
    protected ConditionValue xgetCValueXlsManId() { return xdfgetXlsManId(); }

    /** 
     * Add order-by as ascend. <br>
     * xls_man_id: {PK, NotNull, int8(19)}
     * @return this. (NotNull)
     */
    public BsWhiteXlsManCQ addOrderBy_XlsManId_Asc() { regOBA("xls_man_id"); return this; }

    /**
     * Add order-by as descend. <br>
     * xls_man_id: {PK, NotNull, int8(19)}
     * @return this. (NotNull)
     */
    public BsWhiteXlsManCQ addOrderBy_XlsManId_Desc() { regOBD("xls_man_id"); return this; }

    protected ConditionValue _stringConverted;
    public ConditionValue xdfgetStringConverted()
    { if (_stringConverted == null) { _stringConverted = nCV(); }
      return _stringConverted; }
    protected ConditionValue xgetCValueStringConverted() { return xdfgetStringConverted(); }

    /** 
     * Add order-by as ascend. <br>
     * string_converted: {varchar(2147483647)}
     * @return this. (NotNull)
     */
    public BsWhiteXlsManCQ addOrderBy_StringConverted_Asc() { regOBA("string_converted"); return this; }

    /**
     * Add order-by as descend. <br>
     * string_converted: {varchar(2147483647)}
     * @return this. (NotNull)
     */
    public BsWhiteXlsManCQ addOrderBy_StringConverted_Desc() { regOBD("string_converted"); return this; }

    protected ConditionValue _timestampZeroDefaultMillis;
    public ConditionValue xdfgetTimestampZeroDefaultMillis()
    { if (_timestampZeroDefaultMillis == null) { _timestampZeroDefaultMillis = nCV(); }
      return _timestampZeroDefaultMillis; }
    protected ConditionValue xgetCValueTimestampZeroDefaultMillis() { return xdfgetTimestampZeroDefaultMillis(); }

    /** 
     * Add order-by as ascend. <br>
     * timestamp_zero_default_millis: {timestamp(26, 3)}
     * @return this. (NotNull)
     */
    public BsWhiteXlsManCQ addOrderBy_TimestampZeroDefaultMillis_Asc() { regOBA("timestamp_zero_default_millis"); return this; }

    /**
     * Add order-by as descend. <br>
     * timestamp_zero_default_millis: {timestamp(26, 3)}
     * @return this. (NotNull)
     */
    public BsWhiteXlsManCQ addOrderBy_TimestampZeroDefaultMillis_Desc() { regOBD("timestamp_zero_default_millis"); return this; }

    protected ConditionValue _timestampZeroPrefixMillis;
    public ConditionValue xdfgetTimestampZeroPrefixMillis()
    { if (_timestampZeroPrefixMillis == null) { _timestampZeroPrefixMillis = nCV(); }
      return _timestampZeroPrefixMillis; }
    protected ConditionValue xgetCValueTimestampZeroPrefixMillis() { return xdfgetTimestampZeroPrefixMillis(); }

    /** 
     * Add order-by as ascend. <br>
     * timestamp_zero_prefix_millis: {timestamp(26, 3)}
     * @return this. (NotNull)
     */
    public BsWhiteXlsManCQ addOrderBy_TimestampZeroPrefixMillis_Asc() { regOBA("timestamp_zero_prefix_millis"); return this; }

    /**
     * Add order-by as descend. <br>
     * timestamp_zero_prefix_millis: {timestamp(26, 3)}
     * @return this. (NotNull)
     */
    public BsWhiteXlsManCQ addOrderBy_TimestampZeroPrefixMillis_Desc() { regOBD("timestamp_zero_prefix_millis"); return this; }

    protected ConditionValue _timestampZeroSuffixMillis;
    public ConditionValue xdfgetTimestampZeroSuffixMillis()
    { if (_timestampZeroSuffixMillis == null) { _timestampZeroSuffixMillis = nCV(); }
      return _timestampZeroSuffixMillis; }
    protected ConditionValue xgetCValueTimestampZeroSuffixMillis() { return xdfgetTimestampZeroSuffixMillis(); }

    /** 
     * Add order-by as ascend. <br>
     * timestamp_zero_suffix_millis: {timestamp(26, 3)}
     * @return this. (NotNull)
     */
    public BsWhiteXlsManCQ addOrderBy_TimestampZeroSuffixMillis_Asc() { regOBA("timestamp_zero_suffix_millis"); return this; }

    /**
     * Add order-by as descend. <br>
     * timestamp_zero_suffix_millis: {timestamp(26, 3)}
     * @return this. (NotNull)
     */
    public BsWhiteXlsManCQ addOrderBy_TimestampZeroSuffixMillis_Desc() { regOBD("timestamp_zero_suffix_millis"); return this; }

    // ===================================================================================
    //                                                             SpecifiedDerivedOrderBy
    //                                                             =======================
    /**
     * Add order-by for specified derived column as ascend.
     * <pre>
     * cb.specify().derivedPurchaseList().max(new SubQuery&lt;PurchaseCB&gt;() {
     *     public void query(PurchaseCB subCB) {
     *         subCB.specify().columnPurchaseDatetime();
     *     }
     * }, <span style="color: #CC4747">aliasName</span>);
     * <span style="color: #3F7E5E">// order by [alias-name] asc</span>
     * cb.<span style="color: #CC4747">addSpecifiedDerivedOrderBy_Asc</span>(<span style="color: #CC4747">aliasName</span>);
     * </pre>
     * @param aliasName The alias name specified at (Specify)DerivedReferrer. (NotNull)
     * @return this. (NotNull)
     */
    public BsWhiteXlsManCQ addSpecifiedDerivedOrderBy_Asc(String aliasName) { registerSpecifiedDerivedOrderBy_Asc(aliasName); return this; }

    /**
     * Add order-by for specified derived column as descend.
     * <pre>
     * cb.specify().derivedPurchaseList().max(new SubQuery&lt;PurchaseCB&gt;() {
     *     public void query(PurchaseCB subCB) {
     *         subCB.specify().columnPurchaseDatetime();
     *     }
     * }, <span style="color: #CC4747">aliasName</span>);
     * <span style="color: #3F7E5E">// order by [alias-name] desc</span>
     * cb.<span style="color: #CC4747">addSpecifiedDerivedOrderBy_Desc</span>(<span style="color: #CC4747">aliasName</span>);
     * </pre>
     * @param aliasName The alias name specified at (Specify)DerivedReferrer. (NotNull)
     * @return this. (NotNull)
     */
    public BsWhiteXlsManCQ addSpecifiedDerivedOrderBy_Desc(String aliasName) { registerSpecifiedDerivedOrderBy_Desc(aliasName); return this; }

    // ===================================================================================
    //                                                                         Union Query
    //                                                                         ===========
    public void reflectRelationOnUnionQuery(ConditionQuery bqs, ConditionQuery uqs) {
    }

    // ===================================================================================
    //                                                                       Foreign Query
    //                                                                       =============
    protected Map<String, Object> xfindFixedConditionDynamicParameterMap(String property) {
        return null;
    }

    // ===================================================================================
    //                                                                     ScalarCondition
    //                                                                     ===============
    public Map<String, WhiteXlsManCQ> xdfgetScalarCondition() { return xgetSQueMap("scalarCondition"); }
    public String keepScalarCondition(WhiteXlsManCQ sq) { return xkeepSQue("scalarCondition", sq); }

    // ===================================================================================
    //                                                                       MyselfDerived
    //                                                                       =============
    public Map<String, WhiteXlsManCQ> xdfgetSpecifyMyselfDerived() { return xgetSQueMap("specifyMyselfDerived"); }
    public String keepSpecifyMyselfDerived(WhiteXlsManCQ sq) { return xkeepSQue("specifyMyselfDerived", sq); }

    public Map<String, WhiteXlsManCQ> xdfgetQueryMyselfDerived() { return xgetSQueMap("queryMyselfDerived"); }
    public String keepQueryMyselfDerived(WhiteXlsManCQ sq) { return xkeepSQue("queryMyselfDerived", sq); }
    public Map<String, Object> xdfgetQueryMyselfDerivedParameter() { return xgetSQuePmMap("queryMyselfDerived"); }
    public String keepQueryMyselfDerivedParameter(Object pm) { return xkeepSQuePm("queryMyselfDerived", pm); }

    // ===================================================================================
    //                                                                        MyselfExists
    //                                                                        ============
    protected Map<String, WhiteXlsManCQ> _myselfExistsMap;
    public Map<String, WhiteXlsManCQ> xdfgetMyselfExists() { return xgetSQueMap("myselfExists"); }
    public String keepMyselfExists(WhiteXlsManCQ sq) { return xkeepSQue("myselfExists", sq); }

    // ===================================================================================
    //                                                                       MyselfInScope
    //                                                                       =============
    public Map<String, WhiteXlsManCQ> xdfgetMyselfInScope() { return xgetSQueMap("myselfInScope"); }
    public String keepMyselfInScope(WhiteXlsManCQ sq) { return xkeepSQue("myselfInScope", sq); }

    // ===================================================================================
    //                                                                       Very Internal
    //                                                                       =============
    // very internal (for suppressing warn about 'Not Use Import')
    protected String xCB() { return WhiteXlsManCB.class.getName(); }
    protected String xCQ() { return WhiteXlsManCQ.class.getName(); }
    protected String xCHp() { return HpQDRFunction.class.getName(); }
    protected String xCOp() { return ConditionOption.class.getName(); }
    protected String xMap() { return Map.class.getName(); }
}
