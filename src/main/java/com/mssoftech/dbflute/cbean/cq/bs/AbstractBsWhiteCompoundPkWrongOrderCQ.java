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
 * The abstract condition-query of white_compound_pk_wrong_order.
 * @author DBFlute(AutoGenerator)
 */
public abstract class AbstractBsWhiteCompoundPkWrongOrderCQ extends AbstractConditionQuery {

    // ===================================================================================
    //                                                                         Constructor
    //                                                                         ===========
    public AbstractBsWhiteCompoundPkWrongOrderCQ(ConditionQuery referrerQuery, SqlClause sqlClause, String aliasName, int nestLevel) {
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
        return "white_compound_pk_wrong_order";
    }

    // ===================================================================================
    //                                                                               Query
    //                                                                               =====
    /**
     * Equal(=). And NullIgnored, OnlyOnceRegistered. <br>
     * first_id: {PK, NotNull, int4(10)}
     * @param firstId The value of firstId as equal. (NullAllowed: if null, no condition)
     */
    public void setFirstId_Equal(Integer firstId) {
        doSetFirstId_Equal(firstId);
    }

    protected void doSetFirstId_Equal(Integer firstId) {
        regFirstId(CK_EQ, firstId);
    }

    /**
     * NotEqual(&lt;&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * first_id: {PK, NotNull, int4(10)}
     * @param firstId The value of firstId as notEqual. (NullAllowed: if null, no condition)
     */
    public void setFirstId_NotEqual(Integer firstId) {
        doSetFirstId_NotEqual(firstId);
    }

    protected void doSetFirstId_NotEqual(Integer firstId) {
        regFirstId(CK_NES, firstId);
    }

    /**
     * GreaterThan(&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * first_id: {PK, NotNull, int4(10)}
     * @param firstId The value of firstId as greaterThan. (NullAllowed: if null, no condition)
     */
    public void setFirstId_GreaterThan(Integer firstId) {
        regFirstId(CK_GT, firstId);
    }

    /**
     * LessThan(&lt;). And NullIgnored, OnlyOnceRegistered. <br>
     * first_id: {PK, NotNull, int4(10)}
     * @param firstId The value of firstId as lessThan. (NullAllowed: if null, no condition)
     */
    public void setFirstId_LessThan(Integer firstId) {
        regFirstId(CK_LT, firstId);
    }

    /**
     * GreaterEqual(&gt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * first_id: {PK, NotNull, int4(10)}
     * @param firstId The value of firstId as greaterEqual. (NullAllowed: if null, no condition)
     */
    public void setFirstId_GreaterEqual(Integer firstId) {
        regFirstId(CK_GE, firstId);
    }

    /**
     * LessEqual(&lt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * first_id: {PK, NotNull, int4(10)}
     * @param firstId The value of firstId as lessEqual. (NullAllowed: if null, no condition)
     */
    public void setFirstId_LessEqual(Integer firstId) {
        regFirstId(CK_LE, firstId);
    }

    /**
     * RangeOf with various options. (versatile) <br>
     * {(default) minNumber &lt;= column &lt;= maxNumber} <br>
     * And NullIgnored, OnlyOnceRegistered. <br>
     * first_id: {PK, NotNull, int4(10)}
     * @param minNumber The min number of firstId. (NullAllowed: if null, no from-condition)
     * @param maxNumber The max number of firstId. (NullAllowed: if null, no to-condition)
     * @param opLambda The callback for option of range-of. (NotNull)
     */
    public void setFirstId_RangeOf(Integer minNumber, Integer maxNumber, ConditionOptionCall<RangeOfOption> opLambda) {
        setFirstId_RangeOf(minNumber, maxNumber, xcROOP(opLambda));
    }

    /**
     * RangeOf with various options. (versatile) <br>
     * {(default) minNumber &lt;= column &lt;= maxNumber} <br>
     * And NullIgnored, OnlyOnceRegistered. <br>
     * first_id: {PK, NotNull, int4(10)}
     * @param minNumber The min number of firstId. (NullAllowed: if null, no from-condition)
     * @param maxNumber The max number of firstId. (NullAllowed: if null, no to-condition)
     * @param rangeOfOption The option of range-of. (NotNull)
     */
    protected void setFirstId_RangeOf(Integer minNumber, Integer maxNumber, RangeOfOption rangeOfOption) {
        regROO(minNumber, maxNumber, xgetCValueFirstId(), "first_id", rangeOfOption);
    }

    /**
     * InScope {in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * first_id: {PK, NotNull, int4(10)}
     * @param firstIdList The collection of firstId as inScope. (NullAllowed: if null (or empty), no condition)
     */
    public void setFirstId_InScope(Collection<Integer> firstIdList) {
        doSetFirstId_InScope(firstIdList);
    }

    protected void doSetFirstId_InScope(Collection<Integer> firstIdList) {
        regINS(CK_INS, cTL(firstIdList), xgetCValueFirstId(), "first_id");
    }

    /**
     * NotInScope {not in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * first_id: {PK, NotNull, int4(10)}
     * @param firstIdList The collection of firstId as notInScope. (NullAllowed: if null (or empty), no condition)
     */
    public void setFirstId_NotInScope(Collection<Integer> firstIdList) {
        doSetFirstId_NotInScope(firstIdList);
    }

    protected void doSetFirstId_NotInScope(Collection<Integer> firstIdList) {
        regINS(CK_NINS, cTL(firstIdList), xgetCValueFirstId(), "first_id");
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * first_id: {PK, NotNull, int4(10)}
     */
    public void setFirstId_IsNull() { regFirstId(CK_ISN, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * first_id: {PK, NotNull, int4(10)}
     */
    public void setFirstId_IsNotNull() { regFirstId(CK_ISNN, DOBJ); }

    protected void regFirstId(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueFirstId(), "first_id"); }
    protected abstract ConditionValue xgetCValueFirstId();

    /**
     * Equal(=). And NullIgnored, OnlyOnceRegistered. <br>
     * second_id: {PK, NotNull, int4(10)}
     * @param secondId The value of secondId as equal. (NullAllowed: if null, no condition)
     */
    public void setSecondId_Equal(Integer secondId) {
        doSetSecondId_Equal(secondId);
    }

    protected void doSetSecondId_Equal(Integer secondId) {
        regSecondId(CK_EQ, secondId);
    }

    /**
     * NotEqual(&lt;&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * second_id: {PK, NotNull, int4(10)}
     * @param secondId The value of secondId as notEqual. (NullAllowed: if null, no condition)
     */
    public void setSecondId_NotEqual(Integer secondId) {
        doSetSecondId_NotEqual(secondId);
    }

    protected void doSetSecondId_NotEqual(Integer secondId) {
        regSecondId(CK_NES, secondId);
    }

    /**
     * GreaterThan(&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * second_id: {PK, NotNull, int4(10)}
     * @param secondId The value of secondId as greaterThan. (NullAllowed: if null, no condition)
     */
    public void setSecondId_GreaterThan(Integer secondId) {
        regSecondId(CK_GT, secondId);
    }

    /**
     * LessThan(&lt;). And NullIgnored, OnlyOnceRegistered. <br>
     * second_id: {PK, NotNull, int4(10)}
     * @param secondId The value of secondId as lessThan. (NullAllowed: if null, no condition)
     */
    public void setSecondId_LessThan(Integer secondId) {
        regSecondId(CK_LT, secondId);
    }

    /**
     * GreaterEqual(&gt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * second_id: {PK, NotNull, int4(10)}
     * @param secondId The value of secondId as greaterEqual. (NullAllowed: if null, no condition)
     */
    public void setSecondId_GreaterEqual(Integer secondId) {
        regSecondId(CK_GE, secondId);
    }

    /**
     * LessEqual(&lt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * second_id: {PK, NotNull, int4(10)}
     * @param secondId The value of secondId as lessEqual. (NullAllowed: if null, no condition)
     */
    public void setSecondId_LessEqual(Integer secondId) {
        regSecondId(CK_LE, secondId);
    }

    /**
     * RangeOf with various options. (versatile) <br>
     * {(default) minNumber &lt;= column &lt;= maxNumber} <br>
     * And NullIgnored, OnlyOnceRegistered. <br>
     * second_id: {PK, NotNull, int4(10)}
     * @param minNumber The min number of secondId. (NullAllowed: if null, no from-condition)
     * @param maxNumber The max number of secondId. (NullAllowed: if null, no to-condition)
     * @param opLambda The callback for option of range-of. (NotNull)
     */
    public void setSecondId_RangeOf(Integer minNumber, Integer maxNumber, ConditionOptionCall<RangeOfOption> opLambda) {
        setSecondId_RangeOf(minNumber, maxNumber, xcROOP(opLambda));
    }

    /**
     * RangeOf with various options. (versatile) <br>
     * {(default) minNumber &lt;= column &lt;= maxNumber} <br>
     * And NullIgnored, OnlyOnceRegistered. <br>
     * second_id: {PK, NotNull, int4(10)}
     * @param minNumber The min number of secondId. (NullAllowed: if null, no from-condition)
     * @param maxNumber The max number of secondId. (NullAllowed: if null, no to-condition)
     * @param rangeOfOption The option of range-of. (NotNull)
     */
    protected void setSecondId_RangeOf(Integer minNumber, Integer maxNumber, RangeOfOption rangeOfOption) {
        regROO(minNumber, maxNumber, xgetCValueSecondId(), "second_id", rangeOfOption);
    }

    /**
     * InScope {in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * second_id: {PK, NotNull, int4(10)}
     * @param secondIdList The collection of secondId as inScope. (NullAllowed: if null (or empty), no condition)
     */
    public void setSecondId_InScope(Collection<Integer> secondIdList) {
        doSetSecondId_InScope(secondIdList);
    }

    protected void doSetSecondId_InScope(Collection<Integer> secondIdList) {
        regINS(CK_INS, cTL(secondIdList), xgetCValueSecondId(), "second_id");
    }

    /**
     * NotInScope {not in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * second_id: {PK, NotNull, int4(10)}
     * @param secondIdList The collection of secondId as notInScope. (NullAllowed: if null (or empty), no condition)
     */
    public void setSecondId_NotInScope(Collection<Integer> secondIdList) {
        doSetSecondId_NotInScope(secondIdList);
    }

    protected void doSetSecondId_NotInScope(Collection<Integer> secondIdList) {
        regINS(CK_NINS, cTL(secondIdList), xgetCValueSecondId(), "second_id");
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * second_id: {PK, NotNull, int4(10)}
     */
    public void setSecondId_IsNull() { regSecondId(CK_ISN, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * second_id: {PK, NotNull, int4(10)}
     */
    public void setSecondId_IsNotNull() { regSecondId(CK_ISNN, DOBJ); }

    protected void regSecondId(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueSecondId(), "second_id"); }
    protected abstract ConditionValue xgetCValueSecondId();

    /**
     * Equal(=). And NullIgnored, OnlyOnceRegistered. <br>
     * third_id: {PK, NotNull, int4(10)}
     * @param thirdId The value of thirdId as equal. (NullAllowed: if null, no condition)
     */
    public void setThirdId_Equal(Integer thirdId) {
        doSetThirdId_Equal(thirdId);
    }

    protected void doSetThirdId_Equal(Integer thirdId) {
        regThirdId(CK_EQ, thirdId);
    }

    /**
     * NotEqual(&lt;&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * third_id: {PK, NotNull, int4(10)}
     * @param thirdId The value of thirdId as notEqual. (NullAllowed: if null, no condition)
     */
    public void setThirdId_NotEqual(Integer thirdId) {
        doSetThirdId_NotEqual(thirdId);
    }

    protected void doSetThirdId_NotEqual(Integer thirdId) {
        regThirdId(CK_NES, thirdId);
    }

    /**
     * GreaterThan(&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * third_id: {PK, NotNull, int4(10)}
     * @param thirdId The value of thirdId as greaterThan. (NullAllowed: if null, no condition)
     */
    public void setThirdId_GreaterThan(Integer thirdId) {
        regThirdId(CK_GT, thirdId);
    }

    /**
     * LessThan(&lt;). And NullIgnored, OnlyOnceRegistered. <br>
     * third_id: {PK, NotNull, int4(10)}
     * @param thirdId The value of thirdId as lessThan. (NullAllowed: if null, no condition)
     */
    public void setThirdId_LessThan(Integer thirdId) {
        regThirdId(CK_LT, thirdId);
    }

    /**
     * GreaterEqual(&gt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * third_id: {PK, NotNull, int4(10)}
     * @param thirdId The value of thirdId as greaterEqual. (NullAllowed: if null, no condition)
     */
    public void setThirdId_GreaterEqual(Integer thirdId) {
        regThirdId(CK_GE, thirdId);
    }

    /**
     * LessEqual(&lt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * third_id: {PK, NotNull, int4(10)}
     * @param thirdId The value of thirdId as lessEqual. (NullAllowed: if null, no condition)
     */
    public void setThirdId_LessEqual(Integer thirdId) {
        regThirdId(CK_LE, thirdId);
    }

    /**
     * RangeOf with various options. (versatile) <br>
     * {(default) minNumber &lt;= column &lt;= maxNumber} <br>
     * And NullIgnored, OnlyOnceRegistered. <br>
     * third_id: {PK, NotNull, int4(10)}
     * @param minNumber The min number of thirdId. (NullAllowed: if null, no from-condition)
     * @param maxNumber The max number of thirdId. (NullAllowed: if null, no to-condition)
     * @param opLambda The callback for option of range-of. (NotNull)
     */
    public void setThirdId_RangeOf(Integer minNumber, Integer maxNumber, ConditionOptionCall<RangeOfOption> opLambda) {
        setThirdId_RangeOf(minNumber, maxNumber, xcROOP(opLambda));
    }

    /**
     * RangeOf with various options. (versatile) <br>
     * {(default) minNumber &lt;= column &lt;= maxNumber} <br>
     * And NullIgnored, OnlyOnceRegistered. <br>
     * third_id: {PK, NotNull, int4(10)}
     * @param minNumber The min number of thirdId. (NullAllowed: if null, no from-condition)
     * @param maxNumber The max number of thirdId. (NullAllowed: if null, no to-condition)
     * @param rangeOfOption The option of range-of. (NotNull)
     */
    protected void setThirdId_RangeOf(Integer minNumber, Integer maxNumber, RangeOfOption rangeOfOption) {
        regROO(minNumber, maxNumber, xgetCValueThirdId(), "third_id", rangeOfOption);
    }

    /**
     * InScope {in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * third_id: {PK, NotNull, int4(10)}
     * @param thirdIdList The collection of thirdId as inScope. (NullAllowed: if null (or empty), no condition)
     */
    public void setThirdId_InScope(Collection<Integer> thirdIdList) {
        doSetThirdId_InScope(thirdIdList);
    }

    protected void doSetThirdId_InScope(Collection<Integer> thirdIdList) {
        regINS(CK_INS, cTL(thirdIdList), xgetCValueThirdId(), "third_id");
    }

    /**
     * NotInScope {not in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * third_id: {PK, NotNull, int4(10)}
     * @param thirdIdList The collection of thirdId as notInScope. (NullAllowed: if null (or empty), no condition)
     */
    public void setThirdId_NotInScope(Collection<Integer> thirdIdList) {
        doSetThirdId_NotInScope(thirdIdList);
    }

    protected void doSetThirdId_NotInScope(Collection<Integer> thirdIdList) {
        regINS(CK_NINS, cTL(thirdIdList), xgetCValueThirdId(), "third_id");
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * third_id: {PK, NotNull, int4(10)}
     */
    public void setThirdId_IsNull() { regThirdId(CK_ISN, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * third_id: {PK, NotNull, int4(10)}
     */
    public void setThirdId_IsNotNull() { regThirdId(CK_ISNN, DOBJ); }

    protected void regThirdId(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueThirdId(), "third_id"); }
    protected abstract ConditionValue xgetCValueThirdId();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * wrong_name: {varchar(200)}
     * @param wrongName The value of wrongName as equal. (NullAllowed: if null (or empty), no condition)
     */
    public void setWrongName_Equal(String wrongName) {
        doSetWrongName_Equal(fRES(wrongName));
    }

    protected void doSetWrongName_Equal(String wrongName) {
        regWrongName(CK_EQ, wrongName);
    }

    /**
     * NotEqual(&lt;&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * wrong_name: {varchar(200)}
     * @param wrongName The value of wrongName as notEqual. (NullAllowed: if null (or empty), no condition)
     */
    public void setWrongName_NotEqual(String wrongName) {
        doSetWrongName_NotEqual(fRES(wrongName));
    }

    protected void doSetWrongName_NotEqual(String wrongName) {
        regWrongName(CK_NES, wrongName);
    }

    /**
     * GreaterThan(&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * wrong_name: {varchar(200)}
     * @param wrongName The value of wrongName as greaterThan. (NullAllowed: if null (or empty), no condition)
     */
    public void setWrongName_GreaterThan(String wrongName) {
        regWrongName(CK_GT, fRES(wrongName));
    }

    /**
     * LessThan(&lt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * wrong_name: {varchar(200)}
     * @param wrongName The value of wrongName as lessThan. (NullAllowed: if null (or empty), no condition)
     */
    public void setWrongName_LessThan(String wrongName) {
        regWrongName(CK_LT, fRES(wrongName));
    }

    /**
     * GreaterEqual(&gt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * wrong_name: {varchar(200)}
     * @param wrongName The value of wrongName as greaterEqual. (NullAllowed: if null (or empty), no condition)
     */
    public void setWrongName_GreaterEqual(String wrongName) {
        regWrongName(CK_GE, fRES(wrongName));
    }

    /**
     * LessEqual(&lt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * wrong_name: {varchar(200)}
     * @param wrongName The value of wrongName as lessEqual. (NullAllowed: if null (or empty), no condition)
     */
    public void setWrongName_LessEqual(String wrongName) {
        regWrongName(CK_LE, fRES(wrongName));
    }

    /**
     * InScope {in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * wrong_name: {varchar(200)}
     * @param wrongNameList The collection of wrongName as inScope. (NullAllowed: if null (or empty), no condition)
     */
    public void setWrongName_InScope(Collection<String> wrongNameList) {
        doSetWrongName_InScope(wrongNameList);
    }

    protected void doSetWrongName_InScope(Collection<String> wrongNameList) {
        regINS(CK_INS, cTL(wrongNameList), xgetCValueWrongName(), "wrong_name");
    }

    /**
     * NotInScope {not in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * wrong_name: {varchar(200)}
     * @param wrongNameList The collection of wrongName as notInScope. (NullAllowed: if null (or empty), no condition)
     */
    public void setWrongName_NotInScope(Collection<String> wrongNameList) {
        doSetWrongName_NotInScope(wrongNameList);
    }

    protected void doSetWrongName_NotInScope(Collection<String> wrongNameList) {
        regINS(CK_NINS, cTL(wrongNameList), xgetCValueWrongName(), "wrong_name");
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * wrong_name: {varchar(200)} <br>
     * <pre>e.g. setWrongName_LikeSearch("xxx", op <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> op.<span style="color: #CC4747">likeContain()</span>);</pre>
     * @param wrongName The value of wrongName as likeSearch. (NullAllowed: if null (or empty), no condition)
     * @param opLambda The callback for option of like-search. (NotNull)
     */
    public void setWrongName_LikeSearch(String wrongName, ConditionOptionCall<LikeSearchOption> opLambda) {
        setWrongName_LikeSearch(wrongName, xcLSOP(opLambda));
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * wrong_name: {varchar(200)} <br>
     * <pre>e.g. setWrongName_LikeSearch("xxx", new <span style="color: #CC4747">LikeSearchOption</span>().likeContain());</pre>
     * @param wrongName The value of wrongName as likeSearch. (NullAllowed: if null (or empty), no condition)
     * @param likeSearchOption The option of like-search. (NotNull)
     */
    protected void setWrongName_LikeSearch(String wrongName, LikeSearchOption likeSearchOption) {
        regLSQ(CK_LS, fRES(wrongName), xgetCValueWrongName(), "wrong_name", likeSearchOption);
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br>
     * And NullOrEmptyIgnored, SeveralRegistered. <br>
     * wrong_name: {varchar(200)}
     * @param wrongName The value of wrongName as notLikeSearch. (NullAllowed: if null (or empty), no condition)
     * @param opLambda The callback for option of like-search. (NotNull)
     */
    public void setWrongName_NotLikeSearch(String wrongName, ConditionOptionCall<LikeSearchOption> opLambda) {
        setWrongName_NotLikeSearch(wrongName, xcLSOP(opLambda));
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br>
     * And NullOrEmptyIgnored, SeveralRegistered. <br>
     * wrong_name: {varchar(200)}
     * @param wrongName The value of wrongName as notLikeSearch. (NullAllowed: if null (or empty), no condition)
     * @param likeSearchOption The option of not-like-search. (NotNull)
     */
    protected void setWrongName_NotLikeSearch(String wrongName, LikeSearchOption likeSearchOption) {
        regLSQ(CK_NLS, fRES(wrongName), xgetCValueWrongName(), "wrong_name", likeSearchOption);
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * wrong_name: {varchar(200)}
     */
    public void setWrongName_IsNull() { regWrongName(CK_ISN, DOBJ); }

    /**
     * IsNullOrEmpty {is null or empty}. And OnlyOnceRegistered. <br>
     * wrong_name: {varchar(200)}
     */
    public void setWrongName_IsNullOrEmpty() { regWrongName(CK_ISNOE, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * wrong_name: {varchar(200)}
     */
    public void setWrongName_IsNotNull() { regWrongName(CK_ISNN, DOBJ); }

    protected void regWrongName(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueWrongName(), "wrong_name"); }
    protected abstract ConditionValue xgetCValueWrongName();

    // ===================================================================================
    //                                                                     ScalarCondition
    //                                                                     ===============
    /**
     * Prepare ScalarCondition as equal. <br>
     * {where FOO = (select max(BAR) from ...)
     * <pre>
     * cb.query().<span style="color: #CC4747">scalar_Equal()</span>.max(new SubQuery&lt;WhiteCompoundPkWrongOrderCB&gt;() {
     *     public void query(WhiteCompoundPkWrongOrderCB subCB) {
     *         subCB.specify().setXxx... <span style="color: #3F7E5E">// derived column for function</span>
     *         subCB.query().setYyy...
     *     }
     * });
     * </pre>
     * @return The object to set up a function. (NotNull)
     */
    public HpSSQFunction<WhiteCompoundPkWrongOrderCB> scalar_Equal() {
        return xcreateSSQFunction(CK_EQ, WhiteCompoundPkWrongOrderCB.class);
    }

    /**
     * Prepare ScalarCondition as equal. <br>
     * {where FOO &lt;&gt; (select max(BAR) from ...)
     * <pre>
     * cb.query().<span style="color: #CC4747">scalar_NotEqual()</span>.max(new SubQuery&lt;WhiteCompoundPkWrongOrderCB&gt;() {
     *     public void query(WhiteCompoundPkWrongOrderCB subCB) {
     *         subCB.specify().setXxx... <span style="color: #3F7E5E">// derived column for function</span>
     *         subCB.query().setYyy...
     *     }
     * });
     * </pre>
     * @return The object to set up a function. (NotNull)
     */
    public HpSSQFunction<WhiteCompoundPkWrongOrderCB> scalar_NotEqual() {
        return xcreateSSQFunction(CK_NES, WhiteCompoundPkWrongOrderCB.class);
    }

    /**
     * Prepare ScalarCondition as greaterThan. <br>
     * {where FOO &gt; (select max(BAR) from ...)
     * <pre>
     * cb.query().<span style="color: #CC4747">scalar_GreaterThan()</span>.max(new SubQuery&lt;WhiteCompoundPkWrongOrderCB&gt;() {
     *     public void query(WhiteCompoundPkWrongOrderCB subCB) {
     *         subCB.specify().setFoo... <span style="color: #3F7E5E">// derived column for function</span>
     *         subCB.query().setBar...
     *     }
     * });
     * </pre>
     * @return The object to set up a function. (NotNull)
     */
    public HpSSQFunction<WhiteCompoundPkWrongOrderCB> scalar_GreaterThan() {
        return xcreateSSQFunction(CK_GT, WhiteCompoundPkWrongOrderCB.class);
    }

    /**
     * Prepare ScalarCondition as lessThan. <br>
     * {where FOO &lt; (select max(BAR) from ...)
     * <pre>
     * cb.query().<span style="color: #CC4747">scalar_LessThan()</span>.max(new SubQuery&lt;WhiteCompoundPkWrongOrderCB&gt;() {
     *     public void query(WhiteCompoundPkWrongOrderCB subCB) {
     *         subCB.specify().setFoo... <span style="color: #3F7E5E">// derived column for function</span>
     *         subCB.query().setBar...
     *     }
     * });
     * </pre>
     * @return The object to set up a function. (NotNull)
     */
    public HpSSQFunction<WhiteCompoundPkWrongOrderCB> scalar_LessThan() {
        return xcreateSSQFunction(CK_LT, WhiteCompoundPkWrongOrderCB.class);
    }

    /**
     * Prepare ScalarCondition as greaterEqual. <br>
     * {where FOO &gt;= (select max(BAR) from ...)
     * <pre>
     * cb.query().<span style="color: #CC4747">scalar_GreaterEqual()</span>.max(new SubQuery&lt;WhiteCompoundPkWrongOrderCB&gt;() {
     *     public void query(WhiteCompoundPkWrongOrderCB subCB) {
     *         subCB.specify().setFoo... <span style="color: #3F7E5E">// derived column for function</span>
     *         subCB.query().setBar...
     *     }
     * });
     * </pre>
     * @return The object to set up a function. (NotNull)
     */
    public HpSSQFunction<WhiteCompoundPkWrongOrderCB> scalar_GreaterEqual() {
        return xcreateSSQFunction(CK_GE, WhiteCompoundPkWrongOrderCB.class);
    }

    /**
     * Prepare ScalarCondition as lessEqual. <br>
     * {where FOO &lt;= (select max(BAR) from ...)
     * <pre>
     * cb.query().<span style="color: #CC4747">scalar_LessEqual()</span>.max(new SubQuery&lt;WhiteCompoundPkWrongOrderCB&gt;() {
     *     public void query(WhiteCompoundPkWrongOrderCB subCB) {
     *         subCB.specify().setFoo... <span style="color: #3F7E5E">// derived column for function</span>
     *         subCB.query().setBar...
     *     }
     * });
     * </pre>
     * @return The object to set up a function. (NotNull)
     */
    public HpSSQFunction<WhiteCompoundPkWrongOrderCB> scalar_LessEqual() {
        return xcreateSSQFunction(CK_LE, WhiteCompoundPkWrongOrderCB.class);
    }

    @SuppressWarnings("unchecked")
    protected <CB extends ConditionBean> void xscalarCondition(String fn, SubQuery<CB> sq, String rd, HpSSQOption<CB> op) {
        assertObjectNotNull("subQuery", sq);
        WhiteCompoundPkWrongOrderCB cb = xcreateScalarConditionCB(); sq.query((CB)cb);
        String pp = keepScalarCondition(cb.query()); // for saving query-value
        op.setPartitionByCBean((CB)xcreateScalarConditionPartitionByCB()); // for using partition-by
        registerScalarCondition(fn, cb.query(), pp, rd, op);
    }
    public abstract String keepScalarCondition(WhiteCompoundPkWrongOrderCQ sq);

    protected WhiteCompoundPkWrongOrderCB xcreateScalarConditionCB() {
        WhiteCompoundPkWrongOrderCB cb = newMyCB(); cb.xsetupForScalarCondition(this); return cb;
    }

    protected WhiteCompoundPkWrongOrderCB xcreateScalarConditionPartitionByCB() {
        WhiteCompoundPkWrongOrderCB cb = newMyCB(); cb.xsetupForScalarConditionPartitionBy(this); return cb;
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
    protected WhiteCompoundPkWrongOrderCB newMyCB() {
        return new WhiteCompoundPkWrongOrderCB();
    }
    // very internal (for suppressing warn about 'Not Use Import')
    protected String xabUDT() { return Date.class.getName(); }
    protected String xabCQ() { return WhiteCompoundPkWrongOrderCQ.class.getName(); }
    protected String xabLSO() { return LikeSearchOption.class.getName(); }
    protected String xabSSQS() { return HpSSQSetupper.class.getName(); }
    protected String xabSCP() { return SubQuery.class.getName(); }
}
