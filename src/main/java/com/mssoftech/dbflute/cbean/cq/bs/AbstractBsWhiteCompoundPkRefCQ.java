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
 * The abstract condition-query of white_compound_pk_ref.
 * @author DBFlute(AutoGenerator)
 */
public abstract class AbstractBsWhiteCompoundPkRefCQ extends AbstractConditionQuery {

    // ===================================================================================
    //                                                                         Constructor
    //                                                                         ===========
    public AbstractBsWhiteCompoundPkRefCQ(ConditionQuery referrerQuery, SqlClause sqlClause, String aliasName, int nestLevel) {
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
        return "white_compound_pk_ref";
    }

    // ===================================================================================
    //                                                                               Query
    //                                                                               =====
    /**
     * Equal(=). And NullIgnored, OnlyOnceRegistered. <br>
     * multiple_first_id: {PK, NotNull, int4(10)}
     * @param multipleFirstId The value of multipleFirstId as equal. (NullAllowed: if null, no condition)
     */
    public void setMultipleFirstId_Equal(Integer multipleFirstId) {
        doSetMultipleFirstId_Equal(multipleFirstId);
    }

    protected void doSetMultipleFirstId_Equal(Integer multipleFirstId) {
        regMultipleFirstId(CK_EQ, multipleFirstId);
    }

    /**
     * NotEqual(&lt;&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * multiple_first_id: {PK, NotNull, int4(10)}
     * @param multipleFirstId The value of multipleFirstId as notEqual. (NullAllowed: if null, no condition)
     */
    public void setMultipleFirstId_NotEqual(Integer multipleFirstId) {
        doSetMultipleFirstId_NotEqual(multipleFirstId);
    }

    protected void doSetMultipleFirstId_NotEqual(Integer multipleFirstId) {
        regMultipleFirstId(CK_NES, multipleFirstId);
    }

    /**
     * GreaterThan(&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * multiple_first_id: {PK, NotNull, int4(10)}
     * @param multipleFirstId The value of multipleFirstId as greaterThan. (NullAllowed: if null, no condition)
     */
    public void setMultipleFirstId_GreaterThan(Integer multipleFirstId) {
        regMultipleFirstId(CK_GT, multipleFirstId);
    }

    /**
     * LessThan(&lt;). And NullIgnored, OnlyOnceRegistered. <br>
     * multiple_first_id: {PK, NotNull, int4(10)}
     * @param multipleFirstId The value of multipleFirstId as lessThan. (NullAllowed: if null, no condition)
     */
    public void setMultipleFirstId_LessThan(Integer multipleFirstId) {
        regMultipleFirstId(CK_LT, multipleFirstId);
    }

    /**
     * GreaterEqual(&gt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * multiple_first_id: {PK, NotNull, int4(10)}
     * @param multipleFirstId The value of multipleFirstId as greaterEqual. (NullAllowed: if null, no condition)
     */
    public void setMultipleFirstId_GreaterEqual(Integer multipleFirstId) {
        regMultipleFirstId(CK_GE, multipleFirstId);
    }

    /**
     * LessEqual(&lt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * multiple_first_id: {PK, NotNull, int4(10)}
     * @param multipleFirstId The value of multipleFirstId as lessEqual. (NullAllowed: if null, no condition)
     */
    public void setMultipleFirstId_LessEqual(Integer multipleFirstId) {
        regMultipleFirstId(CK_LE, multipleFirstId);
    }

    /**
     * RangeOf with various options. (versatile) <br>
     * {(default) minNumber &lt;= column &lt;= maxNumber} <br>
     * And NullIgnored, OnlyOnceRegistered. <br>
     * multiple_first_id: {PK, NotNull, int4(10)}
     * @param minNumber The min number of multipleFirstId. (NullAllowed: if null, no from-condition)
     * @param maxNumber The max number of multipleFirstId. (NullAllowed: if null, no to-condition)
     * @param opLambda The callback for option of range-of. (NotNull)
     */
    public void setMultipleFirstId_RangeOf(Integer minNumber, Integer maxNumber, ConditionOptionCall<RangeOfOption> opLambda) {
        setMultipleFirstId_RangeOf(minNumber, maxNumber, xcROOP(opLambda));
    }

    /**
     * RangeOf with various options. (versatile) <br>
     * {(default) minNumber &lt;= column &lt;= maxNumber} <br>
     * And NullIgnored, OnlyOnceRegistered. <br>
     * multiple_first_id: {PK, NotNull, int4(10)}
     * @param minNumber The min number of multipleFirstId. (NullAllowed: if null, no from-condition)
     * @param maxNumber The max number of multipleFirstId. (NullAllowed: if null, no to-condition)
     * @param rangeOfOption The option of range-of. (NotNull)
     */
    protected void setMultipleFirstId_RangeOf(Integer minNumber, Integer maxNumber, RangeOfOption rangeOfOption) {
        regROO(minNumber, maxNumber, xgetCValueMultipleFirstId(), "multiple_first_id", rangeOfOption);
    }

    /**
     * InScope {in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * multiple_first_id: {PK, NotNull, int4(10)}
     * @param multipleFirstIdList The collection of multipleFirstId as inScope. (NullAllowed: if null (or empty), no condition)
     */
    public void setMultipleFirstId_InScope(Collection<Integer> multipleFirstIdList) {
        doSetMultipleFirstId_InScope(multipleFirstIdList);
    }

    protected void doSetMultipleFirstId_InScope(Collection<Integer> multipleFirstIdList) {
        regINS(CK_INS, cTL(multipleFirstIdList), xgetCValueMultipleFirstId(), "multiple_first_id");
    }

    /**
     * NotInScope {not in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * multiple_first_id: {PK, NotNull, int4(10)}
     * @param multipleFirstIdList The collection of multipleFirstId as notInScope. (NullAllowed: if null (or empty), no condition)
     */
    public void setMultipleFirstId_NotInScope(Collection<Integer> multipleFirstIdList) {
        doSetMultipleFirstId_NotInScope(multipleFirstIdList);
    }

    protected void doSetMultipleFirstId_NotInScope(Collection<Integer> multipleFirstIdList) {
        regINS(CK_NINS, cTL(multipleFirstIdList), xgetCValueMultipleFirstId(), "multiple_first_id");
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * multiple_first_id: {PK, NotNull, int4(10)}
     */
    public void setMultipleFirstId_IsNull() { regMultipleFirstId(CK_ISN, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * multiple_first_id: {PK, NotNull, int4(10)}
     */
    public void setMultipleFirstId_IsNotNull() { regMultipleFirstId(CK_ISNN, DOBJ); }

    protected void regMultipleFirstId(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueMultipleFirstId(), "multiple_first_id"); }
    protected abstract ConditionValue xgetCValueMultipleFirstId();

    /**
     * Equal(=). And NullIgnored, OnlyOnceRegistered. <br>
     * multiple_second_id: {PK, NotNull, int4(10)}
     * @param multipleSecondId The value of multipleSecondId as equal. (NullAllowed: if null, no condition)
     */
    public void setMultipleSecondId_Equal(Integer multipleSecondId) {
        doSetMultipleSecondId_Equal(multipleSecondId);
    }

    protected void doSetMultipleSecondId_Equal(Integer multipleSecondId) {
        regMultipleSecondId(CK_EQ, multipleSecondId);
    }

    /**
     * NotEqual(&lt;&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * multiple_second_id: {PK, NotNull, int4(10)}
     * @param multipleSecondId The value of multipleSecondId as notEqual. (NullAllowed: if null, no condition)
     */
    public void setMultipleSecondId_NotEqual(Integer multipleSecondId) {
        doSetMultipleSecondId_NotEqual(multipleSecondId);
    }

    protected void doSetMultipleSecondId_NotEqual(Integer multipleSecondId) {
        regMultipleSecondId(CK_NES, multipleSecondId);
    }

    /**
     * GreaterThan(&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * multiple_second_id: {PK, NotNull, int4(10)}
     * @param multipleSecondId The value of multipleSecondId as greaterThan. (NullAllowed: if null, no condition)
     */
    public void setMultipleSecondId_GreaterThan(Integer multipleSecondId) {
        regMultipleSecondId(CK_GT, multipleSecondId);
    }

    /**
     * LessThan(&lt;). And NullIgnored, OnlyOnceRegistered. <br>
     * multiple_second_id: {PK, NotNull, int4(10)}
     * @param multipleSecondId The value of multipleSecondId as lessThan. (NullAllowed: if null, no condition)
     */
    public void setMultipleSecondId_LessThan(Integer multipleSecondId) {
        regMultipleSecondId(CK_LT, multipleSecondId);
    }

    /**
     * GreaterEqual(&gt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * multiple_second_id: {PK, NotNull, int4(10)}
     * @param multipleSecondId The value of multipleSecondId as greaterEqual. (NullAllowed: if null, no condition)
     */
    public void setMultipleSecondId_GreaterEqual(Integer multipleSecondId) {
        regMultipleSecondId(CK_GE, multipleSecondId);
    }

    /**
     * LessEqual(&lt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * multiple_second_id: {PK, NotNull, int4(10)}
     * @param multipleSecondId The value of multipleSecondId as lessEqual. (NullAllowed: if null, no condition)
     */
    public void setMultipleSecondId_LessEqual(Integer multipleSecondId) {
        regMultipleSecondId(CK_LE, multipleSecondId);
    }

    /**
     * RangeOf with various options. (versatile) <br>
     * {(default) minNumber &lt;= column &lt;= maxNumber} <br>
     * And NullIgnored, OnlyOnceRegistered. <br>
     * multiple_second_id: {PK, NotNull, int4(10)}
     * @param minNumber The min number of multipleSecondId. (NullAllowed: if null, no from-condition)
     * @param maxNumber The max number of multipleSecondId. (NullAllowed: if null, no to-condition)
     * @param opLambda The callback for option of range-of. (NotNull)
     */
    public void setMultipleSecondId_RangeOf(Integer minNumber, Integer maxNumber, ConditionOptionCall<RangeOfOption> opLambda) {
        setMultipleSecondId_RangeOf(minNumber, maxNumber, xcROOP(opLambda));
    }

    /**
     * RangeOf with various options. (versatile) <br>
     * {(default) minNumber &lt;= column &lt;= maxNumber} <br>
     * And NullIgnored, OnlyOnceRegistered. <br>
     * multiple_second_id: {PK, NotNull, int4(10)}
     * @param minNumber The min number of multipleSecondId. (NullAllowed: if null, no from-condition)
     * @param maxNumber The max number of multipleSecondId. (NullAllowed: if null, no to-condition)
     * @param rangeOfOption The option of range-of. (NotNull)
     */
    protected void setMultipleSecondId_RangeOf(Integer minNumber, Integer maxNumber, RangeOfOption rangeOfOption) {
        regROO(minNumber, maxNumber, xgetCValueMultipleSecondId(), "multiple_second_id", rangeOfOption);
    }

    /**
     * InScope {in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * multiple_second_id: {PK, NotNull, int4(10)}
     * @param multipleSecondIdList The collection of multipleSecondId as inScope. (NullAllowed: if null (or empty), no condition)
     */
    public void setMultipleSecondId_InScope(Collection<Integer> multipleSecondIdList) {
        doSetMultipleSecondId_InScope(multipleSecondIdList);
    }

    protected void doSetMultipleSecondId_InScope(Collection<Integer> multipleSecondIdList) {
        regINS(CK_INS, cTL(multipleSecondIdList), xgetCValueMultipleSecondId(), "multiple_second_id");
    }

    /**
     * NotInScope {not in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * multiple_second_id: {PK, NotNull, int4(10)}
     * @param multipleSecondIdList The collection of multipleSecondId as notInScope. (NullAllowed: if null (or empty), no condition)
     */
    public void setMultipleSecondId_NotInScope(Collection<Integer> multipleSecondIdList) {
        doSetMultipleSecondId_NotInScope(multipleSecondIdList);
    }

    protected void doSetMultipleSecondId_NotInScope(Collection<Integer> multipleSecondIdList) {
        regINS(CK_NINS, cTL(multipleSecondIdList), xgetCValueMultipleSecondId(), "multiple_second_id");
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * multiple_second_id: {PK, NotNull, int4(10)}
     */
    public void setMultipleSecondId_IsNull() { regMultipleSecondId(CK_ISN, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * multiple_second_id: {PK, NotNull, int4(10)}
     */
    public void setMultipleSecondId_IsNotNull() { regMultipleSecondId(CK_ISNN, DOBJ); }

    protected void regMultipleSecondId(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueMultipleSecondId(), "multiple_second_id"); }
    protected abstract ConditionValue xgetCValueMultipleSecondId();

    /**
     * Equal(=). And NullIgnored, OnlyOnceRegistered. <br>
     * ref_first_id: {NotNull, int4(10), FK to white_compound_pk}
     * @param refFirstId The value of refFirstId as equal. (NullAllowed: if null, no condition)
     */
    public void setRefFirstId_Equal(Integer refFirstId) {
        doSetRefFirstId_Equal(refFirstId);
    }

    protected void doSetRefFirstId_Equal(Integer refFirstId) {
        regRefFirstId(CK_EQ, refFirstId);
    }

    /**
     * NotEqual(&lt;&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * ref_first_id: {NotNull, int4(10), FK to white_compound_pk}
     * @param refFirstId The value of refFirstId as notEqual. (NullAllowed: if null, no condition)
     */
    public void setRefFirstId_NotEqual(Integer refFirstId) {
        doSetRefFirstId_NotEqual(refFirstId);
    }

    protected void doSetRefFirstId_NotEqual(Integer refFirstId) {
        regRefFirstId(CK_NES, refFirstId);
    }

    /**
     * GreaterThan(&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * ref_first_id: {NotNull, int4(10), FK to white_compound_pk}
     * @param refFirstId The value of refFirstId as greaterThan. (NullAllowed: if null, no condition)
     */
    public void setRefFirstId_GreaterThan(Integer refFirstId) {
        regRefFirstId(CK_GT, refFirstId);
    }

    /**
     * LessThan(&lt;). And NullIgnored, OnlyOnceRegistered. <br>
     * ref_first_id: {NotNull, int4(10), FK to white_compound_pk}
     * @param refFirstId The value of refFirstId as lessThan. (NullAllowed: if null, no condition)
     */
    public void setRefFirstId_LessThan(Integer refFirstId) {
        regRefFirstId(CK_LT, refFirstId);
    }

    /**
     * GreaterEqual(&gt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * ref_first_id: {NotNull, int4(10), FK to white_compound_pk}
     * @param refFirstId The value of refFirstId as greaterEqual. (NullAllowed: if null, no condition)
     */
    public void setRefFirstId_GreaterEqual(Integer refFirstId) {
        regRefFirstId(CK_GE, refFirstId);
    }

    /**
     * LessEqual(&lt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * ref_first_id: {NotNull, int4(10), FK to white_compound_pk}
     * @param refFirstId The value of refFirstId as lessEqual. (NullAllowed: if null, no condition)
     */
    public void setRefFirstId_LessEqual(Integer refFirstId) {
        regRefFirstId(CK_LE, refFirstId);
    }

    /**
     * RangeOf with various options. (versatile) <br>
     * {(default) minNumber &lt;= column &lt;= maxNumber} <br>
     * And NullIgnored, OnlyOnceRegistered. <br>
     * ref_first_id: {NotNull, int4(10), FK to white_compound_pk}
     * @param minNumber The min number of refFirstId. (NullAllowed: if null, no from-condition)
     * @param maxNumber The max number of refFirstId. (NullAllowed: if null, no to-condition)
     * @param opLambda The callback for option of range-of. (NotNull)
     */
    public void setRefFirstId_RangeOf(Integer minNumber, Integer maxNumber, ConditionOptionCall<RangeOfOption> opLambda) {
        setRefFirstId_RangeOf(minNumber, maxNumber, xcROOP(opLambda));
    }

    /**
     * RangeOf with various options. (versatile) <br>
     * {(default) minNumber &lt;= column &lt;= maxNumber} <br>
     * And NullIgnored, OnlyOnceRegistered. <br>
     * ref_first_id: {NotNull, int4(10), FK to white_compound_pk}
     * @param minNumber The min number of refFirstId. (NullAllowed: if null, no from-condition)
     * @param maxNumber The max number of refFirstId. (NullAllowed: if null, no to-condition)
     * @param rangeOfOption The option of range-of. (NotNull)
     */
    protected void setRefFirstId_RangeOf(Integer minNumber, Integer maxNumber, RangeOfOption rangeOfOption) {
        regROO(minNumber, maxNumber, xgetCValueRefFirstId(), "ref_first_id", rangeOfOption);
    }

    /**
     * InScope {in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * ref_first_id: {NotNull, int4(10), FK to white_compound_pk}
     * @param refFirstIdList The collection of refFirstId as inScope. (NullAllowed: if null (or empty), no condition)
     */
    public void setRefFirstId_InScope(Collection<Integer> refFirstIdList) {
        doSetRefFirstId_InScope(refFirstIdList);
    }

    protected void doSetRefFirstId_InScope(Collection<Integer> refFirstIdList) {
        regINS(CK_INS, cTL(refFirstIdList), xgetCValueRefFirstId(), "ref_first_id");
    }

    /**
     * NotInScope {not in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * ref_first_id: {NotNull, int4(10), FK to white_compound_pk}
     * @param refFirstIdList The collection of refFirstId as notInScope. (NullAllowed: if null (or empty), no condition)
     */
    public void setRefFirstId_NotInScope(Collection<Integer> refFirstIdList) {
        doSetRefFirstId_NotInScope(refFirstIdList);
    }

    protected void doSetRefFirstId_NotInScope(Collection<Integer> refFirstIdList) {
        regINS(CK_NINS, cTL(refFirstIdList), xgetCValueRefFirstId(), "ref_first_id");
    }

    protected void regRefFirstId(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueRefFirstId(), "ref_first_id"); }
    protected abstract ConditionValue xgetCValueRefFirstId();

    /**
     * Equal(=). And NullIgnored, OnlyOnceRegistered. <br>
     * ref_second_id: {NotNull, int4(10), FK to white_compound_pk}
     * @param refSecondId The value of refSecondId as equal. (NullAllowed: if null, no condition)
     */
    public void setRefSecondId_Equal(Integer refSecondId) {
        doSetRefSecondId_Equal(refSecondId);
    }

    protected void doSetRefSecondId_Equal(Integer refSecondId) {
        regRefSecondId(CK_EQ, refSecondId);
    }

    /**
     * NotEqual(&lt;&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * ref_second_id: {NotNull, int4(10), FK to white_compound_pk}
     * @param refSecondId The value of refSecondId as notEqual. (NullAllowed: if null, no condition)
     */
    public void setRefSecondId_NotEqual(Integer refSecondId) {
        doSetRefSecondId_NotEqual(refSecondId);
    }

    protected void doSetRefSecondId_NotEqual(Integer refSecondId) {
        regRefSecondId(CK_NES, refSecondId);
    }

    /**
     * GreaterThan(&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * ref_second_id: {NotNull, int4(10), FK to white_compound_pk}
     * @param refSecondId The value of refSecondId as greaterThan. (NullAllowed: if null, no condition)
     */
    public void setRefSecondId_GreaterThan(Integer refSecondId) {
        regRefSecondId(CK_GT, refSecondId);
    }

    /**
     * LessThan(&lt;). And NullIgnored, OnlyOnceRegistered. <br>
     * ref_second_id: {NotNull, int4(10), FK to white_compound_pk}
     * @param refSecondId The value of refSecondId as lessThan. (NullAllowed: if null, no condition)
     */
    public void setRefSecondId_LessThan(Integer refSecondId) {
        regRefSecondId(CK_LT, refSecondId);
    }

    /**
     * GreaterEqual(&gt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * ref_second_id: {NotNull, int4(10), FK to white_compound_pk}
     * @param refSecondId The value of refSecondId as greaterEqual. (NullAllowed: if null, no condition)
     */
    public void setRefSecondId_GreaterEqual(Integer refSecondId) {
        regRefSecondId(CK_GE, refSecondId);
    }

    /**
     * LessEqual(&lt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * ref_second_id: {NotNull, int4(10), FK to white_compound_pk}
     * @param refSecondId The value of refSecondId as lessEqual. (NullAllowed: if null, no condition)
     */
    public void setRefSecondId_LessEqual(Integer refSecondId) {
        regRefSecondId(CK_LE, refSecondId);
    }

    /**
     * RangeOf with various options. (versatile) <br>
     * {(default) minNumber &lt;= column &lt;= maxNumber} <br>
     * And NullIgnored, OnlyOnceRegistered. <br>
     * ref_second_id: {NotNull, int4(10), FK to white_compound_pk}
     * @param minNumber The min number of refSecondId. (NullAllowed: if null, no from-condition)
     * @param maxNumber The max number of refSecondId. (NullAllowed: if null, no to-condition)
     * @param opLambda The callback for option of range-of. (NotNull)
     */
    public void setRefSecondId_RangeOf(Integer minNumber, Integer maxNumber, ConditionOptionCall<RangeOfOption> opLambda) {
        setRefSecondId_RangeOf(minNumber, maxNumber, xcROOP(opLambda));
    }

    /**
     * RangeOf with various options. (versatile) <br>
     * {(default) minNumber &lt;= column &lt;= maxNumber} <br>
     * And NullIgnored, OnlyOnceRegistered. <br>
     * ref_second_id: {NotNull, int4(10), FK to white_compound_pk}
     * @param minNumber The min number of refSecondId. (NullAllowed: if null, no from-condition)
     * @param maxNumber The max number of refSecondId. (NullAllowed: if null, no to-condition)
     * @param rangeOfOption The option of range-of. (NotNull)
     */
    protected void setRefSecondId_RangeOf(Integer minNumber, Integer maxNumber, RangeOfOption rangeOfOption) {
        regROO(minNumber, maxNumber, xgetCValueRefSecondId(), "ref_second_id", rangeOfOption);
    }

    /**
     * InScope {in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * ref_second_id: {NotNull, int4(10), FK to white_compound_pk}
     * @param refSecondIdList The collection of refSecondId as inScope. (NullAllowed: if null (or empty), no condition)
     */
    public void setRefSecondId_InScope(Collection<Integer> refSecondIdList) {
        doSetRefSecondId_InScope(refSecondIdList);
    }

    protected void doSetRefSecondId_InScope(Collection<Integer> refSecondIdList) {
        regINS(CK_INS, cTL(refSecondIdList), xgetCValueRefSecondId(), "ref_second_id");
    }

    /**
     * NotInScope {not in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * ref_second_id: {NotNull, int4(10), FK to white_compound_pk}
     * @param refSecondIdList The collection of refSecondId as notInScope. (NullAllowed: if null (or empty), no condition)
     */
    public void setRefSecondId_NotInScope(Collection<Integer> refSecondIdList) {
        doSetRefSecondId_NotInScope(refSecondIdList);
    }

    protected void doSetRefSecondId_NotInScope(Collection<Integer> refSecondIdList) {
        regINS(CK_NINS, cTL(refSecondIdList), xgetCValueRefSecondId(), "ref_second_id");
    }

    protected void regRefSecondId(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueRefSecondId(), "ref_second_id"); }
    protected abstract ConditionValue xgetCValueRefSecondId();

    // ===================================================================================
    //                                                                     ScalarCondition
    //                                                                     ===============
    /**
     * Prepare ScalarCondition as equal. <br>
     * {where FOO = (select max(BAR) from ...)
     * <pre>
     * cb.query().<span style="color: #CC4747">scalar_Equal()</span>.max(new SubQuery&lt;WhiteCompoundPkRefCB&gt;() {
     *     public void query(WhiteCompoundPkRefCB subCB) {
     *         subCB.specify().setXxx... <span style="color: #3F7E5E">// derived column for function</span>
     *         subCB.query().setYyy...
     *     }
     * });
     * </pre>
     * @return The object to set up a function. (NotNull)
     */
    public HpSSQFunction<WhiteCompoundPkRefCB> scalar_Equal() {
        return xcreateSSQFunction(CK_EQ, WhiteCompoundPkRefCB.class);
    }

    /**
     * Prepare ScalarCondition as equal. <br>
     * {where FOO &lt;&gt; (select max(BAR) from ...)
     * <pre>
     * cb.query().<span style="color: #CC4747">scalar_NotEqual()</span>.max(new SubQuery&lt;WhiteCompoundPkRefCB&gt;() {
     *     public void query(WhiteCompoundPkRefCB subCB) {
     *         subCB.specify().setXxx... <span style="color: #3F7E5E">// derived column for function</span>
     *         subCB.query().setYyy...
     *     }
     * });
     * </pre>
     * @return The object to set up a function. (NotNull)
     */
    public HpSSQFunction<WhiteCompoundPkRefCB> scalar_NotEqual() {
        return xcreateSSQFunction(CK_NES, WhiteCompoundPkRefCB.class);
    }

    /**
     * Prepare ScalarCondition as greaterThan. <br>
     * {where FOO &gt; (select max(BAR) from ...)
     * <pre>
     * cb.query().<span style="color: #CC4747">scalar_GreaterThan()</span>.max(new SubQuery&lt;WhiteCompoundPkRefCB&gt;() {
     *     public void query(WhiteCompoundPkRefCB subCB) {
     *         subCB.specify().setFoo... <span style="color: #3F7E5E">// derived column for function</span>
     *         subCB.query().setBar...
     *     }
     * });
     * </pre>
     * @return The object to set up a function. (NotNull)
     */
    public HpSSQFunction<WhiteCompoundPkRefCB> scalar_GreaterThan() {
        return xcreateSSQFunction(CK_GT, WhiteCompoundPkRefCB.class);
    }

    /**
     * Prepare ScalarCondition as lessThan. <br>
     * {where FOO &lt; (select max(BAR) from ...)
     * <pre>
     * cb.query().<span style="color: #CC4747">scalar_LessThan()</span>.max(new SubQuery&lt;WhiteCompoundPkRefCB&gt;() {
     *     public void query(WhiteCompoundPkRefCB subCB) {
     *         subCB.specify().setFoo... <span style="color: #3F7E5E">// derived column for function</span>
     *         subCB.query().setBar...
     *     }
     * });
     * </pre>
     * @return The object to set up a function. (NotNull)
     */
    public HpSSQFunction<WhiteCompoundPkRefCB> scalar_LessThan() {
        return xcreateSSQFunction(CK_LT, WhiteCompoundPkRefCB.class);
    }

    /**
     * Prepare ScalarCondition as greaterEqual. <br>
     * {where FOO &gt;= (select max(BAR) from ...)
     * <pre>
     * cb.query().<span style="color: #CC4747">scalar_GreaterEqual()</span>.max(new SubQuery&lt;WhiteCompoundPkRefCB&gt;() {
     *     public void query(WhiteCompoundPkRefCB subCB) {
     *         subCB.specify().setFoo... <span style="color: #3F7E5E">// derived column for function</span>
     *         subCB.query().setBar...
     *     }
     * });
     * </pre>
     * @return The object to set up a function. (NotNull)
     */
    public HpSSQFunction<WhiteCompoundPkRefCB> scalar_GreaterEqual() {
        return xcreateSSQFunction(CK_GE, WhiteCompoundPkRefCB.class);
    }

    /**
     * Prepare ScalarCondition as lessEqual. <br>
     * {where FOO &lt;= (select max(BAR) from ...)
     * <pre>
     * cb.query().<span style="color: #CC4747">scalar_LessEqual()</span>.max(new SubQuery&lt;WhiteCompoundPkRefCB&gt;() {
     *     public void query(WhiteCompoundPkRefCB subCB) {
     *         subCB.specify().setFoo... <span style="color: #3F7E5E">// derived column for function</span>
     *         subCB.query().setBar...
     *     }
     * });
     * </pre>
     * @return The object to set up a function. (NotNull)
     */
    public HpSSQFunction<WhiteCompoundPkRefCB> scalar_LessEqual() {
        return xcreateSSQFunction(CK_LE, WhiteCompoundPkRefCB.class);
    }

    @SuppressWarnings("unchecked")
    protected <CB extends ConditionBean> void xscalarCondition(String fn, SubQuery<CB> sq, String rd, HpSSQOption<CB> op) {
        assertObjectNotNull("subQuery", sq);
        WhiteCompoundPkRefCB cb = xcreateScalarConditionCB(); sq.query((CB)cb);
        String pp = keepScalarCondition(cb.query()); // for saving query-value
        op.setPartitionByCBean((CB)xcreateScalarConditionPartitionByCB()); // for using partition-by
        registerScalarCondition(fn, cb.query(), pp, rd, op);
    }
    public abstract String keepScalarCondition(WhiteCompoundPkRefCQ sq);

    protected WhiteCompoundPkRefCB xcreateScalarConditionCB() {
        WhiteCompoundPkRefCB cb = newMyCB(); cb.xsetupForScalarCondition(this); return cb;
    }

    protected WhiteCompoundPkRefCB xcreateScalarConditionPartitionByCB() {
        WhiteCompoundPkRefCB cb = newMyCB(); cb.xsetupForScalarConditionPartitionBy(this); return cb;
    }

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
    protected WhiteCompoundPkRefCB newMyCB() {
        return new WhiteCompoundPkRefCB();
    }
    // very internal (for suppressing warn about 'Not Use Import')
    protected String xabUDT() { return Date.class.getName(); }
    protected String xabCQ() { return WhiteCompoundPkRefCQ.class.getName(); }
    protected String xabLSO() { return LikeSearchOption.class.getName(); }
    protected String xabSSQS() { return HpSSQSetupper.class.getName(); }
    protected String xabSCP() { return SubQuery.class.getName(); }
}
