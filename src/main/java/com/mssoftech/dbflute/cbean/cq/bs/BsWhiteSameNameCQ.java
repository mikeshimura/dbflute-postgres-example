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
 * The base condition-query of white_same_name.
 * @author DBFlute(AutoGenerator)
 */
public class BsWhiteSameNameCQ extends AbstractBsWhiteSameNameCQ {

    // ===================================================================================
    //                                                                           Attribute
    //                                                                           =========
    protected WhiteSameNameCIQ _inlineQuery;

    // ===================================================================================
    //                                                                         Constructor
    //                                                                         ===========
    public BsWhiteSameNameCQ(ConditionQuery referrerQuery, SqlClause sqlClause, String aliasName, int nestLevel) {
        super(referrerQuery, sqlClause, aliasName, nestLevel);
    }

    // ===================================================================================
    //                                                                 InlineView/OrClause
    //                                                                 ===================
    /**
     * Prepare InlineView query. <br>
     * {select ... from ... left outer join (select * from white_same_name) where FOO = [value] ...}
     * <pre>
     * cb.query().queryMemberStatus().<span style="color: #CC4747">inline()</span>.setFoo...;
     * </pre>
     * @return The condition-query for InlineView query. (NotNull)
     */
    public WhiteSameNameCIQ inline() {
        if (_inlineQuery == null) { _inlineQuery = xcreateCIQ(); }
        _inlineQuery.xsetOnClause(false); return _inlineQuery;
    }

    protected WhiteSameNameCIQ xcreateCIQ() {
        WhiteSameNameCIQ ciq = xnewCIQ();
        ciq.xsetBaseCB(_baseCB);
        return ciq;
    }

    protected WhiteSameNameCIQ xnewCIQ() {
        return new WhiteSameNameCIQ(xgetReferrerQuery(), xgetSqlClause(), xgetAliasName(), xgetNestLevel(), this);
    }

    /**
     * Prepare OnClause query. <br>
     * {select ... from ... left outer join white_same_name on ... and FOO = [value] ...}
     * <pre>
     * cb.query().queryMemberStatus().<span style="color: #CC4747">on()</span>.setFoo...;
     * </pre>
     * @return The condition-query for OnClause query. (NotNull)
     * @throws IllegalConditionBeanOperationException When this condition-query is base query.
     */
    public WhiteSameNameCIQ on() {
        if (isBaseQuery()) { throw new IllegalConditionBeanOperationException("OnClause for local table is unavailable!"); }
        WhiteSameNameCIQ inlineQuery = inline(); inlineQuery.xsetOnClause(true); return inlineQuery;
    }

    // ===================================================================================
    //                                                                               Query
    //                                                                               =====
    protected ConditionValue _sameNameId;
    public ConditionValue xdfgetSameNameId()
    { if (_sameNameId == null) { _sameNameId = nCV(); }
      return _sameNameId; }
    protected ConditionValue xgetCValueSameNameId() { return xdfgetSameNameId(); }

    public Map<String, WhiteSameNameRefCQ> xdfgetSameNameId_ExistsReferrer_WhiteSameNameRefList() { return xgetSQueMap("sameNameId_ExistsReferrer_WhiteSameNameRefList"); }
    public String keepSameNameId_ExistsReferrer_WhiteSameNameRefList(WhiteSameNameRefCQ sq) { return xkeepSQue("sameNameId_ExistsReferrer_WhiteSameNameRefList", sq); }

    public Map<String, WhiteSameNameRefCQ> xdfgetSameNameId_NotExistsReferrer_WhiteSameNameRefList() { return xgetSQueMap("sameNameId_NotExistsReferrer_WhiteSameNameRefList"); }
    public String keepSameNameId_NotExistsReferrer_WhiteSameNameRefList(WhiteSameNameRefCQ sq) { return xkeepSQue("sameNameId_NotExistsReferrer_WhiteSameNameRefList", sq); }

    public Map<String, WhiteSameNameRefCQ> xdfgetSameNameId_SpecifyDerivedReferrer_WhiteSameNameRefList() { return xgetSQueMap("sameNameId_SpecifyDerivedReferrer_WhiteSameNameRefList"); }
    public String keepSameNameId_SpecifyDerivedReferrer_WhiteSameNameRefList(WhiteSameNameRefCQ sq) { return xkeepSQue("sameNameId_SpecifyDerivedReferrer_WhiteSameNameRefList", sq); }

    public Map<String, WhiteSameNameRefCQ> xdfgetSameNameId_QueryDerivedReferrer_WhiteSameNameRefList() { return xgetSQueMap("sameNameId_QueryDerivedReferrer_WhiteSameNameRefList"); }
    public String keepSameNameId_QueryDerivedReferrer_WhiteSameNameRefList(WhiteSameNameRefCQ sq) { return xkeepSQue("sameNameId_QueryDerivedReferrer_WhiteSameNameRefList", sq); }
    public Map<String, Object> xdfgetSameNameId_QueryDerivedReferrer_WhiteSameNameRefListParameter() { return xgetSQuePmMap("sameNameId_QueryDerivedReferrer_WhiteSameNameRefList"); }
    public String keepSameNameId_QueryDerivedReferrer_WhiteSameNameRefListParameter(Object pm) { return xkeepSQuePm("sameNameId_QueryDerivedReferrer_WhiteSameNameRefList", pm); }

    /** 
     * Add order-by as ascend. <br>
     * same_name_id: {PK, NotNull, int8(19)}
     * @return this. (NotNull)
     */
    public BsWhiteSameNameCQ addOrderBy_SameNameId_Asc() { regOBA("same_name_id"); return this; }

    /**
     * Add order-by as descend. <br>
     * same_name_id: {PK, NotNull, int8(19)}
     * @return this. (NotNull)
     */
    public BsWhiteSameNameCQ addOrderBy_SameNameId_Desc() { regOBD("same_name_id"); return this; }

    protected ConditionValue _sameNameName;
    public ConditionValue xdfgetSameNameName()
    { if (_sameNameName == null) { _sameNameName = nCV(); }
      return _sameNameName; }
    protected ConditionValue xgetCValueSameNameName() { return xdfgetSameNameName(); }

    /** 
     * Add order-by as ascend. <br>
     * same_name_name: {varchar(200)}
     * @return this. (NotNull)
     */
    public BsWhiteSameNameCQ addOrderBy_SameNameName_Asc() { regOBA("same_name_name"); return this; }

    /**
     * Add order-by as descend. <br>
     * same_name_name: {varchar(200)}
     * @return this. (NotNull)
     */
    public BsWhiteSameNameCQ addOrderBy_SameNameName_Desc() { regOBD("same_name_name"); return this; }

    protected ConditionValue _sameNameInteger;
    public ConditionValue xdfgetSameNameInteger()
    { if (_sameNameInteger == null) { _sameNameInteger = nCV(); }
      return _sameNameInteger; }
    protected ConditionValue xgetCValueSameNameInteger() { return xdfgetSameNameInteger(); }

    /** 
     * Add order-by as ascend. <br>
     * same_name_integer: {int4(10)}
     * @return this. (NotNull)
     */
    public BsWhiteSameNameCQ addOrderBy_SameNameInteger_Asc() { regOBA("same_name_integer"); return this; }

    /**
     * Add order-by as descend. <br>
     * same_name_integer: {int4(10)}
     * @return this. (NotNull)
     */
    public BsWhiteSameNameCQ addOrderBy_SameNameInteger_Desc() { regOBD("same_name_integer"); return this; }

    protected ConditionValue _nextSchemaProductId;
    public ConditionValue xdfgetNextSchemaProductId()
    { if (_nextSchemaProductId == null) { _nextSchemaProductId = nCV(); }
      return _nextSchemaProductId; }
    protected ConditionValue xgetCValueNextSchemaProductId() { return xdfgetNextSchemaProductId(); }

    /** 
     * Add order-by as ascend. <br>
     * next_schema_product_id: {int4(10)}
     * @return this. (NotNull)
     */
    public BsWhiteSameNameCQ addOrderBy_NextSchemaProductId_Asc() { regOBA("next_schema_product_id"); return this; }

    /**
     * Add order-by as descend. <br>
     * next_schema_product_id: {int4(10)}
     * @return this. (NotNull)
     */
    public BsWhiteSameNameCQ addOrderBy_NextSchemaProductId_Desc() { regOBD("next_schema_product_id"); return this; }

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
    public BsWhiteSameNameCQ addSpecifiedDerivedOrderBy_Asc(String aliasName) { registerSpecifiedDerivedOrderBy_Asc(aliasName); return this; }

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
    public BsWhiteSameNameCQ addSpecifiedDerivedOrderBy_Desc(String aliasName) { registerSpecifiedDerivedOrderBy_Desc(aliasName); return this; }

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
    public Map<String, WhiteSameNameCQ> xdfgetScalarCondition() { return xgetSQueMap("scalarCondition"); }
    public String keepScalarCondition(WhiteSameNameCQ sq) { return xkeepSQue("scalarCondition", sq); }

    // ===================================================================================
    //                                                                       MyselfDerived
    //                                                                       =============
    public Map<String, WhiteSameNameCQ> xdfgetSpecifyMyselfDerived() { return xgetSQueMap("specifyMyselfDerived"); }
    public String keepSpecifyMyselfDerived(WhiteSameNameCQ sq) { return xkeepSQue("specifyMyselfDerived", sq); }

    public Map<String, WhiteSameNameCQ> xdfgetQueryMyselfDerived() { return xgetSQueMap("queryMyselfDerived"); }
    public String keepQueryMyselfDerived(WhiteSameNameCQ sq) { return xkeepSQue("queryMyselfDerived", sq); }
    public Map<String, Object> xdfgetQueryMyselfDerivedParameter() { return xgetSQuePmMap("queryMyselfDerived"); }
    public String keepQueryMyselfDerivedParameter(Object pm) { return xkeepSQuePm("queryMyselfDerived", pm); }

    // ===================================================================================
    //                                                                        MyselfExists
    //                                                                        ============
    protected Map<String, WhiteSameNameCQ> _myselfExistsMap;
    public Map<String, WhiteSameNameCQ> xdfgetMyselfExists() { return xgetSQueMap("myselfExists"); }
    public String keepMyselfExists(WhiteSameNameCQ sq) { return xkeepSQue("myselfExists", sq); }

    // ===================================================================================
    //                                                                       MyselfInScope
    //                                                                       =============
    public Map<String, WhiteSameNameCQ> xdfgetMyselfInScope() { return xgetSQueMap("myselfInScope"); }
    public String keepMyselfInScope(WhiteSameNameCQ sq) { return xkeepSQue("myselfInScope", sq); }

    // ===================================================================================
    //                                                                       Very Internal
    //                                                                       =============
    // very internal (for suppressing warn about 'Not Use Import')
    protected String xCB() { return WhiteSameNameCB.class.getName(); }
    protected String xCQ() { return WhiteSameNameCQ.class.getName(); }
    protected String xCHp() { return HpQDRFunction.class.getName(); }
    protected String xCOp() { return ConditionOption.class.getName(); }
    protected String xMap() { return Map.class.getName(); }
}
