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
 * The base condition-query of member_address.
 * @author DBFlute(AutoGenerator)
 */
public class BsMemberAddressCQ extends AbstractBsMemberAddressCQ {

    // ===================================================================================
    //                                                                           Attribute
    //                                                                           =========
    protected MemberAddressCIQ _inlineQuery;

    // ===================================================================================
    //                                                                         Constructor
    //                                                                         ===========
    public BsMemberAddressCQ(ConditionQuery referrerQuery, SqlClause sqlClause, String aliasName, int nestLevel) {
        super(referrerQuery, sqlClause, aliasName, nestLevel);
    }

    // ===================================================================================
    //                                                                 InlineView/OrClause
    //                                                                 ===================
    /**
     * Prepare InlineView query. <br>
     * {select ... from ... left outer join (select * from member_address) where FOO = [value] ...}
     * <pre>
     * cb.query().queryMemberStatus().<span style="color: #CC4747">inline()</span>.setFoo...;
     * </pre>
     * @return The condition-query for InlineView query. (NotNull)
     */
    public MemberAddressCIQ inline() {
        if (_inlineQuery == null) { _inlineQuery = xcreateCIQ(); }
        _inlineQuery.xsetOnClause(false); return _inlineQuery;
    }

    protected MemberAddressCIQ xcreateCIQ() {
        MemberAddressCIQ ciq = xnewCIQ();
        ciq.xsetBaseCB(_baseCB);
        return ciq;
    }

    protected MemberAddressCIQ xnewCIQ() {
        return new MemberAddressCIQ(xgetReferrerQuery(), xgetSqlClause(), xgetAliasName(), xgetNestLevel(), this);
    }

    /**
     * Prepare OnClause query. <br>
     * {select ... from ... left outer join member_address on ... and FOO = [value] ...}
     * <pre>
     * cb.query().queryMemberStatus().<span style="color: #CC4747">on()</span>.setFoo...;
     * </pre>
     * @return The condition-query for OnClause query. (NotNull)
     * @throws IllegalConditionBeanOperationException When this condition-query is base query.
     */
    public MemberAddressCIQ on() {
        if (isBaseQuery()) { throw new IllegalConditionBeanOperationException("OnClause for local table is unavailable!"); }
        MemberAddressCIQ inlineQuery = inline(); inlineQuery.xsetOnClause(true); return inlineQuery;
    }

    // ===================================================================================
    //                                                                               Query
    //                                                                               =====
    protected ConditionValue _memberAddressId;
    public ConditionValue xdfgetMemberAddressId()
    { if (_memberAddressId == null) { _memberAddressId = nCV(); }
      return _memberAddressId; }
    protected ConditionValue xgetCValueMemberAddressId() { return xdfgetMemberAddressId(); }

    /** 
     * Add order-by as ascend. <br>
     * member_address_id: {PK, ID, NotNull, serial(10)}
     * @return this. (NotNull)
     */
    public BsMemberAddressCQ addOrderBy_MemberAddressId_Asc() { regOBA("member_address_id"); return this; }

    /**
     * Add order-by as descend. <br>
     * member_address_id: {PK, ID, NotNull, serial(10)}
     * @return this. (NotNull)
     */
    public BsMemberAddressCQ addOrderBy_MemberAddressId_Desc() { regOBD("member_address_id"); return this; }

    protected ConditionValue _memberId;
    public ConditionValue xdfgetMemberId()
    { if (_memberId == null) { _memberId = nCV(); }
      return _memberId; }
    protected ConditionValue xgetCValueMemberId() { return xdfgetMemberId(); }

    /** 
     * Add order-by as ascend. <br>
     * member_id: {UQ+, NotNull, int4(10), FK to member}
     * @return this. (NotNull)
     */
    public BsMemberAddressCQ addOrderBy_MemberId_Asc() { regOBA("member_id"); return this; }

    /**
     * Add order-by as descend. <br>
     * member_id: {UQ+, NotNull, int4(10), FK to member}
     * @return this. (NotNull)
     */
    public BsMemberAddressCQ addOrderBy_MemberId_Desc() { regOBD("member_id"); return this; }

    protected ConditionValue _validBeginDate;
    public ConditionValue xdfgetValidBeginDate()
    { if (_validBeginDate == null) { _validBeginDate = nCV(); }
      return _validBeginDate; }
    protected ConditionValue xgetCValueValidBeginDate() { return xdfgetValidBeginDate(); }

    /** 
     * Add order-by as ascend. <br>
     * valid_begin_date: {+UQ, NotNull, date(13)}
     * @return this. (NotNull)
     */
    public BsMemberAddressCQ addOrderBy_ValidBeginDate_Asc() { regOBA("valid_begin_date"); return this; }

    /**
     * Add order-by as descend. <br>
     * valid_begin_date: {+UQ, NotNull, date(13)}
     * @return this. (NotNull)
     */
    public BsMemberAddressCQ addOrderBy_ValidBeginDate_Desc() { regOBD("valid_begin_date"); return this; }

    protected ConditionValue _validEndDate;
    public ConditionValue xdfgetValidEndDate()
    { if (_validEndDate == null) { _validEndDate = nCV(); }
      return _validEndDate; }
    protected ConditionValue xgetCValueValidEndDate() { return xdfgetValidEndDate(); }

    /** 
     * Add order-by as ascend. <br>
     * valid_end_date: {NotNull, date(13)}
     * @return this. (NotNull)
     */
    public BsMemberAddressCQ addOrderBy_ValidEndDate_Asc() { regOBA("valid_end_date"); return this; }

    /**
     * Add order-by as descend. <br>
     * valid_end_date: {NotNull, date(13)}
     * @return this. (NotNull)
     */
    public BsMemberAddressCQ addOrderBy_ValidEndDate_Desc() { regOBD("valid_end_date"); return this; }

    protected ConditionValue _address;
    public ConditionValue xdfgetAddress()
    { if (_address == null) { _address = nCV(); }
      return _address; }
    protected ConditionValue xgetCValueAddress() { return xdfgetAddress(); }

    /** 
     * Add order-by as ascend. <br>
     * address: {NotNull, varchar(200)}
     * @return this. (NotNull)
     */
    public BsMemberAddressCQ addOrderBy_Address_Asc() { regOBA("address"); return this; }

    /**
     * Add order-by as descend. <br>
     * address: {NotNull, varchar(200)}
     * @return this. (NotNull)
     */
    public BsMemberAddressCQ addOrderBy_Address_Desc() { regOBD("address"); return this; }

    protected ConditionValue _regionId;
    public ConditionValue xdfgetRegionId()
    { if (_regionId == null) { _regionId = nCV(); }
      return _regionId; }
    protected ConditionValue xgetCValueRegionId() { return xdfgetRegionId(); }

    /** 
     * Add order-by as ascend. <br>
     * region_id: {NotNull, int4(10), FK to region}
     * @return this. (NotNull)
     */
    public BsMemberAddressCQ addOrderBy_RegionId_Asc() { regOBA("region_id"); return this; }

    /**
     * Add order-by as descend. <br>
     * region_id: {NotNull, int4(10), FK to region}
     * @return this. (NotNull)
     */
    public BsMemberAddressCQ addOrderBy_RegionId_Desc() { regOBD("region_id"); return this; }

    protected ConditionValue _registerDatetime;
    public ConditionValue xdfgetRegisterDatetime()
    { if (_registerDatetime == null) { _registerDatetime = nCV(); }
      return _registerDatetime; }
    protected ConditionValue xgetCValueRegisterDatetime() { return xdfgetRegisterDatetime(); }

    /** 
     * Add order-by as ascend. <br>
     * register_datetime: {NotNull, timestamp(26, 3)}
     * @return this. (NotNull)
     */
    public BsMemberAddressCQ addOrderBy_RegisterDatetime_Asc() { regOBA("register_datetime"); return this; }

    /**
     * Add order-by as descend. <br>
     * register_datetime: {NotNull, timestamp(26, 3)}
     * @return this. (NotNull)
     */
    public BsMemberAddressCQ addOrderBy_RegisterDatetime_Desc() { regOBD("register_datetime"); return this; }

    protected ConditionValue _registerProcess;
    public ConditionValue xdfgetRegisterProcess()
    { if (_registerProcess == null) { _registerProcess = nCV(); }
      return _registerProcess; }
    protected ConditionValue xgetCValueRegisterProcess() { return xdfgetRegisterProcess(); }

    /** 
     * Add order-by as ascend. <br>
     * register_process: {NotNull, varchar(200)}
     * @return this. (NotNull)
     */
    public BsMemberAddressCQ addOrderBy_RegisterProcess_Asc() { regOBA("register_process"); return this; }

    /**
     * Add order-by as descend. <br>
     * register_process: {NotNull, varchar(200)}
     * @return this. (NotNull)
     */
    public BsMemberAddressCQ addOrderBy_RegisterProcess_Desc() { regOBD("register_process"); return this; }

    protected ConditionValue _registerUser;
    public ConditionValue xdfgetRegisterUser()
    { if (_registerUser == null) { _registerUser = nCV(); }
      return _registerUser; }
    protected ConditionValue xgetCValueRegisterUser() { return xdfgetRegisterUser(); }

    /** 
     * Add order-by as ascend. <br>
     * register_user: {NotNull, varchar(200)}
     * @return this. (NotNull)
     */
    public BsMemberAddressCQ addOrderBy_RegisterUser_Asc() { regOBA("register_user"); return this; }

    /**
     * Add order-by as descend. <br>
     * register_user: {NotNull, varchar(200)}
     * @return this. (NotNull)
     */
    public BsMemberAddressCQ addOrderBy_RegisterUser_Desc() { regOBD("register_user"); return this; }

    protected ConditionValue _updateDatetime;
    public ConditionValue xdfgetUpdateDatetime()
    { if (_updateDatetime == null) { _updateDatetime = nCV(); }
      return _updateDatetime; }
    protected ConditionValue xgetCValueUpdateDatetime() { return xdfgetUpdateDatetime(); }

    /** 
     * Add order-by as ascend. <br>
     * update_datetime: {NotNull, timestamp(26, 3)}
     * @return this. (NotNull)
     */
    public BsMemberAddressCQ addOrderBy_UpdateDatetime_Asc() { regOBA("update_datetime"); return this; }

    /**
     * Add order-by as descend. <br>
     * update_datetime: {NotNull, timestamp(26, 3)}
     * @return this. (NotNull)
     */
    public BsMemberAddressCQ addOrderBy_UpdateDatetime_Desc() { regOBD("update_datetime"); return this; }

    protected ConditionValue _updateProcess;
    public ConditionValue xdfgetUpdateProcess()
    { if (_updateProcess == null) { _updateProcess = nCV(); }
      return _updateProcess; }
    protected ConditionValue xgetCValueUpdateProcess() { return xdfgetUpdateProcess(); }

    /** 
     * Add order-by as ascend. <br>
     * update_process: {NotNull, varchar(200)}
     * @return this. (NotNull)
     */
    public BsMemberAddressCQ addOrderBy_UpdateProcess_Asc() { regOBA("update_process"); return this; }

    /**
     * Add order-by as descend. <br>
     * update_process: {NotNull, varchar(200)}
     * @return this. (NotNull)
     */
    public BsMemberAddressCQ addOrderBy_UpdateProcess_Desc() { regOBD("update_process"); return this; }

    protected ConditionValue _updateUser;
    public ConditionValue xdfgetUpdateUser()
    { if (_updateUser == null) { _updateUser = nCV(); }
      return _updateUser; }
    protected ConditionValue xgetCValueUpdateUser() { return xdfgetUpdateUser(); }

    /** 
     * Add order-by as ascend. <br>
     * update_user: {NotNull, varchar(200)}
     * @return this. (NotNull)
     */
    public BsMemberAddressCQ addOrderBy_UpdateUser_Asc() { regOBA("update_user"); return this; }

    /**
     * Add order-by as descend. <br>
     * update_user: {NotNull, varchar(200)}
     * @return this. (NotNull)
     */
    public BsMemberAddressCQ addOrderBy_UpdateUser_Desc() { regOBD("update_user"); return this; }

    protected ConditionValue _versionNo;
    public ConditionValue xdfgetVersionNo()
    { if (_versionNo == null) { _versionNo = nCV(); }
      return _versionNo; }
    protected ConditionValue xgetCValueVersionNo() { return xdfgetVersionNo(); }

    /** 
     * Add order-by as ascend. <br>
     * version_no: {NotNull, int8(19)}
     * @return this. (NotNull)
     */
    public BsMemberAddressCQ addOrderBy_VersionNo_Asc() { regOBA("version_no"); return this; }

    /**
     * Add order-by as descend. <br>
     * version_no: {NotNull, int8(19)}
     * @return this. (NotNull)
     */
    public BsMemberAddressCQ addOrderBy_VersionNo_Desc() { regOBD("version_no"); return this; }

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
    public BsMemberAddressCQ addSpecifiedDerivedOrderBy_Asc(String aliasName) { registerSpecifiedDerivedOrderBy_Asc(aliasName); return this; }

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
    public BsMemberAddressCQ addSpecifiedDerivedOrderBy_Desc(String aliasName) { registerSpecifiedDerivedOrderBy_Desc(aliasName); return this; }

    // ===================================================================================
    //                                                                         Union Query
    //                                                                         ===========
    public void reflectRelationOnUnionQuery(ConditionQuery bqs, ConditionQuery uqs) {
        MemberAddressCQ bq = (MemberAddressCQ)bqs;
        MemberAddressCQ uq = (MemberAddressCQ)uqs;
        if (bq.hasConditionQueryMember()) {
            uq.queryMember().reflectRelationOnUnionQuery(bq.queryMember(), uq.queryMember());
        }
        if (bq.hasConditionQueryRegion()) {
            uq.queryRegion().reflectRelationOnUnionQuery(bq.queryRegion(), uq.queryRegion());
        }
    }

    // ===================================================================================
    //                                                                       Foreign Query
    //                                                                       =============
    /**
     * Get the condition-query for relation table. <br>
     * member by my member_id, named 'member'.
     * @return The instance of condition-query. (NotNull)
     */
    public MemberCQ queryMember() {
        return xdfgetConditionQueryMember();
    }
    public MemberCQ xdfgetConditionQueryMember() {
        String prop = "member";
        if (!xhasQueRlMap(prop)) { xregQueRl(prop, xcreateQueryMember()); xsetupOuterJoinMember(); }
        return xgetQueRlMap(prop);
    }
    protected MemberCQ xcreateQueryMember() {
        String nrp = xresolveNRP("member_address", "member"); String jan = xresolveJAN(nrp, xgetNNLvl());
        return xinitRelCQ(new MemberCQ(this, xgetSqlClause(), jan, xgetNNLvl()), _baseCB, "member", nrp);
    }
    protected void xsetupOuterJoinMember() { xregOutJo("member"); }
    public boolean hasConditionQueryMember() { return xhasQueRlMap("member"); }

    /**
     * Get the condition-query for relation table. <br>
     * region by my region_id, named 'region'.
     * @return The instance of condition-query. (NotNull)
     */
    public RegionCQ queryRegion() {
        return xdfgetConditionQueryRegion();
    }
    public RegionCQ xdfgetConditionQueryRegion() {
        String prop = "region";
        if (!xhasQueRlMap(prop)) { xregQueRl(prop, xcreateQueryRegion()); xsetupOuterJoinRegion(); }
        return xgetQueRlMap(prop);
    }
    protected RegionCQ xcreateQueryRegion() {
        String nrp = xresolveNRP("member_address", "region"); String jan = xresolveJAN(nrp, xgetNNLvl());
        return xinitRelCQ(new RegionCQ(this, xgetSqlClause(), jan, xgetNNLvl()), _baseCB, "region", nrp);
    }
    protected void xsetupOuterJoinRegion() { xregOutJo("region"); }
    public boolean hasConditionQueryRegion() { return xhasQueRlMap("region"); }

    protected Map<String, Object> xfindFixedConditionDynamicParameterMap(String property) {
        return null;
    }

    // ===================================================================================
    //                                                                     ScalarCondition
    //                                                                     ===============
    public Map<String, MemberAddressCQ> xdfgetScalarCondition() { return xgetSQueMap("scalarCondition"); }
    public String keepScalarCondition(MemberAddressCQ sq) { return xkeepSQue("scalarCondition", sq); }

    // ===================================================================================
    //                                                                       MyselfDerived
    //                                                                       =============
    public Map<String, MemberAddressCQ> xdfgetSpecifyMyselfDerived() { return xgetSQueMap("specifyMyselfDerived"); }
    public String keepSpecifyMyselfDerived(MemberAddressCQ sq) { return xkeepSQue("specifyMyselfDerived", sq); }

    public Map<String, MemberAddressCQ> xdfgetQueryMyselfDerived() { return xgetSQueMap("queryMyselfDerived"); }
    public String keepQueryMyselfDerived(MemberAddressCQ sq) { return xkeepSQue("queryMyselfDerived", sq); }
    public Map<String, Object> xdfgetQueryMyselfDerivedParameter() { return xgetSQuePmMap("queryMyselfDerived"); }
    public String keepQueryMyselfDerivedParameter(Object pm) { return xkeepSQuePm("queryMyselfDerived", pm); }

    // ===================================================================================
    //                                                                        MyselfExists
    //                                                                        ============
    protected Map<String, MemberAddressCQ> _myselfExistsMap;
    public Map<String, MemberAddressCQ> xdfgetMyselfExists() { return xgetSQueMap("myselfExists"); }
    public String keepMyselfExists(MemberAddressCQ sq) { return xkeepSQue("myselfExists", sq); }

    // ===================================================================================
    //                                                                       MyselfInScope
    //                                                                       =============
    public Map<String, MemberAddressCQ> xdfgetMyselfInScope() { return xgetSQueMap("myselfInScope"); }
    public String keepMyselfInScope(MemberAddressCQ sq) { return xkeepSQue("myselfInScope", sq); }

    // ===================================================================================
    //                                                                       Very Internal
    //                                                                       =============
    // very internal (for suppressing warn about 'Not Use Import')
    protected String xCB() { return MemberAddressCB.class.getName(); }
    protected String xCQ() { return MemberAddressCQ.class.getName(); }
    protected String xCHp() { return HpQDRFunction.class.getName(); }
    protected String xCOp() { return ConditionOption.class.getName(); }
    protected String xMap() { return Map.class.getName(); }
}
