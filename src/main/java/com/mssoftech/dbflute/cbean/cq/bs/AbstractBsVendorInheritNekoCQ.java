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
 * The abstract condition-query of vendor_inherit_neko.
 * @author DBFlute(AutoGenerator)
 */
public abstract class AbstractBsVendorInheritNekoCQ extends AbstractConditionQuery {

    // ===================================================================================
    //                                                                         Constructor
    //                                                                         ===========
    public AbstractBsVendorInheritNekoCQ(ConditionQuery referrerQuery, SqlClause sqlClause, String aliasName, int nestLevel) {
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
        return "vendor_inherit_neko";
    }

    // ===================================================================================
    //                                                                               Query
    //                                                                               =====
    /**
     * Equal(=). And NullIgnored, OnlyOnceRegistered. <br>
     * inu_id: {NotNull, int4(10)}
     * @param inuId The value of inuId as equal. (NullAllowed: if null, no condition)
     */
    public void setInuId_Equal(Integer inuId) {
        doSetInuId_Equal(inuId);
    }

    protected void doSetInuId_Equal(Integer inuId) {
        regInuId(CK_EQ, inuId);
    }

    /**
     * NotEqual(&lt;&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * inu_id: {NotNull, int4(10)}
     * @param inuId The value of inuId as notEqual. (NullAllowed: if null, no condition)
     */
    public void setInuId_NotEqual(Integer inuId) {
        doSetInuId_NotEqual(inuId);
    }

    protected void doSetInuId_NotEqual(Integer inuId) {
        regInuId(CK_NES, inuId);
    }

    /**
     * GreaterThan(&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * inu_id: {NotNull, int4(10)}
     * @param inuId The value of inuId as greaterThan. (NullAllowed: if null, no condition)
     */
    public void setInuId_GreaterThan(Integer inuId) {
        regInuId(CK_GT, inuId);
    }

    /**
     * LessThan(&lt;). And NullIgnored, OnlyOnceRegistered. <br>
     * inu_id: {NotNull, int4(10)}
     * @param inuId The value of inuId as lessThan. (NullAllowed: if null, no condition)
     */
    public void setInuId_LessThan(Integer inuId) {
        regInuId(CK_LT, inuId);
    }

    /**
     * GreaterEqual(&gt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * inu_id: {NotNull, int4(10)}
     * @param inuId The value of inuId as greaterEqual. (NullAllowed: if null, no condition)
     */
    public void setInuId_GreaterEqual(Integer inuId) {
        regInuId(CK_GE, inuId);
    }

    /**
     * LessEqual(&lt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * inu_id: {NotNull, int4(10)}
     * @param inuId The value of inuId as lessEqual. (NullAllowed: if null, no condition)
     */
    public void setInuId_LessEqual(Integer inuId) {
        regInuId(CK_LE, inuId);
    }

    /**
     * RangeOf with various options. (versatile) <br>
     * {(default) minNumber &lt;= column &lt;= maxNumber} <br>
     * And NullIgnored, OnlyOnceRegistered. <br>
     * inu_id: {NotNull, int4(10)}
     * @param minNumber The min number of inuId. (NullAllowed: if null, no from-condition)
     * @param maxNumber The max number of inuId. (NullAllowed: if null, no to-condition)
     * @param opLambda The callback for option of range-of. (NotNull)
     */
    public void setInuId_RangeOf(Integer minNumber, Integer maxNumber, ConditionOptionCall<RangeOfOption> opLambda) {
        setInuId_RangeOf(minNumber, maxNumber, xcROOP(opLambda));
    }

    /**
     * RangeOf with various options. (versatile) <br>
     * {(default) minNumber &lt;= column &lt;= maxNumber} <br>
     * And NullIgnored, OnlyOnceRegistered. <br>
     * inu_id: {NotNull, int4(10)}
     * @param minNumber The min number of inuId. (NullAllowed: if null, no from-condition)
     * @param maxNumber The max number of inuId. (NullAllowed: if null, no to-condition)
     * @param rangeOfOption The option of range-of. (NotNull)
     */
    protected void setInuId_RangeOf(Integer minNumber, Integer maxNumber, RangeOfOption rangeOfOption) {
        regROO(minNumber, maxNumber, xgetCValueInuId(), "inu_id", rangeOfOption);
    }

    /**
     * InScope {in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * inu_id: {NotNull, int4(10)}
     * @param inuIdList The collection of inuId as inScope. (NullAllowed: if null (or empty), no condition)
     */
    public void setInuId_InScope(Collection<Integer> inuIdList) {
        doSetInuId_InScope(inuIdList);
    }

    protected void doSetInuId_InScope(Collection<Integer> inuIdList) {
        regINS(CK_INS, cTL(inuIdList), xgetCValueInuId(), "inu_id");
    }

    /**
     * NotInScope {not in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * inu_id: {NotNull, int4(10)}
     * @param inuIdList The collection of inuId as notInScope. (NullAllowed: if null (or empty), no condition)
     */
    public void setInuId_NotInScope(Collection<Integer> inuIdList) {
        doSetInuId_NotInScope(inuIdList);
    }

    protected void doSetInuId_NotInScope(Collection<Integer> inuIdList) {
        regINS(CK_NINS, cTL(inuIdList), xgetCValueInuId(), "inu_id");
    }

    protected void regInuId(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueInuId(), "inu_id"); }
    protected abstract ConditionValue xgetCValueInuId();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * inu_name: {NotNull, varchar(2147483647)}
     * @param inuName The value of inuName as equal. (NullAllowed: if null (or empty), no condition)
     */
    public void setInuName_Equal(String inuName) {
        doSetInuName_Equal(fRES(inuName));
    }

    protected void doSetInuName_Equal(String inuName) {
        regInuName(CK_EQ, inuName);
    }

    /**
     * NotEqual(&lt;&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * inu_name: {NotNull, varchar(2147483647)}
     * @param inuName The value of inuName as notEqual. (NullAllowed: if null (or empty), no condition)
     */
    public void setInuName_NotEqual(String inuName) {
        doSetInuName_NotEqual(fRES(inuName));
    }

    protected void doSetInuName_NotEqual(String inuName) {
        regInuName(CK_NES, inuName);
    }

    /**
     * GreaterThan(&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * inu_name: {NotNull, varchar(2147483647)}
     * @param inuName The value of inuName as greaterThan. (NullAllowed: if null (or empty), no condition)
     */
    public void setInuName_GreaterThan(String inuName) {
        regInuName(CK_GT, fRES(inuName));
    }

    /**
     * LessThan(&lt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * inu_name: {NotNull, varchar(2147483647)}
     * @param inuName The value of inuName as lessThan. (NullAllowed: if null (or empty), no condition)
     */
    public void setInuName_LessThan(String inuName) {
        regInuName(CK_LT, fRES(inuName));
    }

    /**
     * GreaterEqual(&gt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * inu_name: {NotNull, varchar(2147483647)}
     * @param inuName The value of inuName as greaterEqual. (NullAllowed: if null (or empty), no condition)
     */
    public void setInuName_GreaterEqual(String inuName) {
        regInuName(CK_GE, fRES(inuName));
    }

    /**
     * LessEqual(&lt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * inu_name: {NotNull, varchar(2147483647)}
     * @param inuName The value of inuName as lessEqual. (NullAllowed: if null (or empty), no condition)
     */
    public void setInuName_LessEqual(String inuName) {
        regInuName(CK_LE, fRES(inuName));
    }

    /**
     * InScope {in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * inu_name: {NotNull, varchar(2147483647)}
     * @param inuNameList The collection of inuName as inScope. (NullAllowed: if null (or empty), no condition)
     */
    public void setInuName_InScope(Collection<String> inuNameList) {
        doSetInuName_InScope(inuNameList);
    }

    protected void doSetInuName_InScope(Collection<String> inuNameList) {
        regINS(CK_INS, cTL(inuNameList), xgetCValueInuName(), "inu_name");
    }

    /**
     * NotInScope {not in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * inu_name: {NotNull, varchar(2147483647)}
     * @param inuNameList The collection of inuName as notInScope. (NullAllowed: if null (or empty), no condition)
     */
    public void setInuName_NotInScope(Collection<String> inuNameList) {
        doSetInuName_NotInScope(inuNameList);
    }

    protected void doSetInuName_NotInScope(Collection<String> inuNameList) {
        regINS(CK_NINS, cTL(inuNameList), xgetCValueInuName(), "inu_name");
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * inu_name: {NotNull, varchar(2147483647)} <br>
     * <pre>e.g. setInuName_LikeSearch("xxx", op <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> op.<span style="color: #CC4747">likeContain()</span>);</pre>
     * @param inuName The value of inuName as likeSearch. (NullAllowed: if null (or empty), no condition)
     * @param opLambda The callback for option of like-search. (NotNull)
     */
    public void setInuName_LikeSearch(String inuName, ConditionOptionCall<LikeSearchOption> opLambda) {
        setInuName_LikeSearch(inuName, xcLSOP(opLambda));
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * inu_name: {NotNull, varchar(2147483647)} <br>
     * <pre>e.g. setInuName_LikeSearch("xxx", new <span style="color: #CC4747">LikeSearchOption</span>().likeContain());</pre>
     * @param inuName The value of inuName as likeSearch. (NullAllowed: if null (or empty), no condition)
     * @param likeSearchOption The option of like-search. (NotNull)
     */
    protected void setInuName_LikeSearch(String inuName, LikeSearchOption likeSearchOption) {
        regLSQ(CK_LS, fRES(inuName), xgetCValueInuName(), "inu_name", likeSearchOption);
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br>
     * And NullOrEmptyIgnored, SeveralRegistered. <br>
     * inu_name: {NotNull, varchar(2147483647)}
     * @param inuName The value of inuName as notLikeSearch. (NullAllowed: if null (or empty), no condition)
     * @param opLambda The callback for option of like-search. (NotNull)
     */
    public void setInuName_NotLikeSearch(String inuName, ConditionOptionCall<LikeSearchOption> opLambda) {
        setInuName_NotLikeSearch(inuName, xcLSOP(opLambda));
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br>
     * And NullOrEmptyIgnored, SeveralRegistered. <br>
     * inu_name: {NotNull, varchar(2147483647)}
     * @param inuName The value of inuName as notLikeSearch. (NullAllowed: if null (or empty), no condition)
     * @param likeSearchOption The option of not-like-search. (NotNull)
     */
    protected void setInuName_NotLikeSearch(String inuName, LikeSearchOption likeSearchOption) {
        regLSQ(CK_NLS, fRES(inuName), xgetCValueInuName(), "inu_name", likeSearchOption);
    }

    protected void regInuName(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueInuName(), "inu_name"); }
    protected abstract ConditionValue xgetCValueInuName();

    /**
     * Equal(=). And NullIgnored, OnlyOnceRegistered. <br>
     * inu_date: {date(13)}
     * @param inuDate The value of inuDate as equal. (NullAllowed: if null, no condition)
     */
    public void setInuDate_Equal(java.time.LocalDate inuDate) {
        regInuDate(CK_EQ,  inuDate);
    }

    /**
     * GreaterThan(&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * inu_date: {date(13)}
     * @param inuDate The value of inuDate as greaterThan. (NullAllowed: if null, no condition)
     */
    public void setInuDate_GreaterThan(java.time.LocalDate inuDate) {
        regInuDate(CK_GT,  inuDate);
    }

    /**
     * LessThan(&lt;). And NullIgnored, OnlyOnceRegistered. <br>
     * inu_date: {date(13)}
     * @param inuDate The value of inuDate as lessThan. (NullAllowed: if null, no condition)
     */
    public void setInuDate_LessThan(java.time.LocalDate inuDate) {
        regInuDate(CK_LT,  inuDate);
    }

    /**
     * GreaterEqual(&gt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * inu_date: {date(13)}
     * @param inuDate The value of inuDate as greaterEqual. (NullAllowed: if null, no condition)
     */
    public void setInuDate_GreaterEqual(java.time.LocalDate inuDate) {
        regInuDate(CK_GE,  inuDate);
    }

    /**
     * LessEqual(&lt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * inu_date: {date(13)}
     * @param inuDate The value of inuDate as lessEqual. (NullAllowed: if null, no condition)
     */
    public void setInuDate_LessEqual(java.time.LocalDate inuDate) {
        regInuDate(CK_LE, inuDate);
    }

    /**
     * FromTo with various options. (versatile) {(default) fromDatetime &lt;= column &lt;= toDatetime} <br>
     * And NullIgnored, OnlyOnceRegistered. <br>
     * inu_date: {date(13)}
     * <pre>e.g. setInuDate_FromTo(fromDate, toDate, op <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> op.<span style="color: #CC4747">compareAsDate()</span>);</pre>
     * @param fromDatetime The from-datetime(yyyy/MM/dd HH:mm:ss.SSS) of inuDate. (NullAllowed: if null, no from-condition)
     * @param toDatetime The to-datetime(yyyy/MM/dd HH:mm:ss.SSS) of inuDate. (NullAllowed: if null, no to-condition)
     * @param opLambda The callback for option of from-to. (NotNull)
     */
    public void setInuDate_FromTo(java.time.LocalDate fromDatetime, java.time.LocalDate toDatetime, ConditionOptionCall<FromToOption> opLambda) {
        setInuDate_FromTo(fromDatetime, toDatetime, xcFTOP(opLambda));
    }

    /**
     * FromTo with various options. (versatile) {(default) fromDatetime &lt;= column &lt;= toDatetime} <br>
     * And NullIgnored, OnlyOnceRegistered. <br>
     * inu_date: {date(13)}
     * <pre>e.g. setInuDate_FromTo(fromDate, toDate, new <span style="color: #CC4747">FromToOption</span>().compareAsDate());</pre>
     * @param fromDatetime The from-datetime(yyyy/MM/dd HH:mm:ss.SSS) of inuDate. (NullAllowed: if null, no from-condition)
     * @param toDatetime The to-datetime(yyyy/MM/dd HH:mm:ss.SSS) of inuDate. (NullAllowed: if null, no to-condition)
     * @param fromToOption The option of from-to. (NotNull)
     */
    protected void setInuDate_FromTo(java.time.LocalDate fromDatetime, java.time.LocalDate toDatetime, FromToOption fromToOption) {
        String nm = "inu_date"; FromToOption op = fromToOption;
        regFTQ(xfFTHD(fromDatetime, nm, op), xfFTHD(toDatetime, nm, op), xgetCValueInuDate(), nm, op);
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * inu_date: {date(13)}
     */
    public void setInuDate_IsNull() { regInuDate(CK_ISN, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * inu_date: {date(13)}
     */
    public void setInuDate_IsNotNull() { regInuDate(CK_ISNN, DOBJ); }

    protected void regInuDate(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueInuDate(), "inu_date"); }
    protected abstract ConditionValue xgetCValueInuDate();

    /**
     * Equal(=). And NullIgnored, OnlyOnceRegistered. <br>
     * neko_id: {PK, NotNull, int4(10)}
     * @param nekoId The value of nekoId as equal. (NullAllowed: if null, no condition)
     */
    public void setNekoId_Equal(Integer nekoId) {
        doSetNekoId_Equal(nekoId);
    }

    protected void doSetNekoId_Equal(Integer nekoId) {
        regNekoId(CK_EQ, nekoId);
    }

    /**
     * NotEqual(&lt;&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * neko_id: {PK, NotNull, int4(10)}
     * @param nekoId The value of nekoId as notEqual. (NullAllowed: if null, no condition)
     */
    public void setNekoId_NotEqual(Integer nekoId) {
        doSetNekoId_NotEqual(nekoId);
    }

    protected void doSetNekoId_NotEqual(Integer nekoId) {
        regNekoId(CK_NES, nekoId);
    }

    /**
     * GreaterThan(&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * neko_id: {PK, NotNull, int4(10)}
     * @param nekoId The value of nekoId as greaterThan. (NullAllowed: if null, no condition)
     */
    public void setNekoId_GreaterThan(Integer nekoId) {
        regNekoId(CK_GT, nekoId);
    }

    /**
     * LessThan(&lt;). And NullIgnored, OnlyOnceRegistered. <br>
     * neko_id: {PK, NotNull, int4(10)}
     * @param nekoId The value of nekoId as lessThan. (NullAllowed: if null, no condition)
     */
    public void setNekoId_LessThan(Integer nekoId) {
        regNekoId(CK_LT, nekoId);
    }

    /**
     * GreaterEqual(&gt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * neko_id: {PK, NotNull, int4(10)}
     * @param nekoId The value of nekoId as greaterEqual. (NullAllowed: if null, no condition)
     */
    public void setNekoId_GreaterEqual(Integer nekoId) {
        regNekoId(CK_GE, nekoId);
    }

    /**
     * LessEqual(&lt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * neko_id: {PK, NotNull, int4(10)}
     * @param nekoId The value of nekoId as lessEqual. (NullAllowed: if null, no condition)
     */
    public void setNekoId_LessEqual(Integer nekoId) {
        regNekoId(CK_LE, nekoId);
    }

    /**
     * RangeOf with various options. (versatile) <br>
     * {(default) minNumber &lt;= column &lt;= maxNumber} <br>
     * And NullIgnored, OnlyOnceRegistered. <br>
     * neko_id: {PK, NotNull, int4(10)}
     * @param minNumber The min number of nekoId. (NullAllowed: if null, no from-condition)
     * @param maxNumber The max number of nekoId. (NullAllowed: if null, no to-condition)
     * @param opLambda The callback for option of range-of. (NotNull)
     */
    public void setNekoId_RangeOf(Integer minNumber, Integer maxNumber, ConditionOptionCall<RangeOfOption> opLambda) {
        setNekoId_RangeOf(minNumber, maxNumber, xcROOP(opLambda));
    }

    /**
     * RangeOf with various options. (versatile) <br>
     * {(default) minNumber &lt;= column &lt;= maxNumber} <br>
     * And NullIgnored, OnlyOnceRegistered. <br>
     * neko_id: {PK, NotNull, int4(10)}
     * @param minNumber The min number of nekoId. (NullAllowed: if null, no from-condition)
     * @param maxNumber The max number of nekoId. (NullAllowed: if null, no to-condition)
     * @param rangeOfOption The option of range-of. (NotNull)
     */
    protected void setNekoId_RangeOf(Integer minNumber, Integer maxNumber, RangeOfOption rangeOfOption) {
        regROO(minNumber, maxNumber, xgetCValueNekoId(), "neko_id", rangeOfOption);
    }

    /**
     * InScope {in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * neko_id: {PK, NotNull, int4(10)}
     * @param nekoIdList The collection of nekoId as inScope. (NullAllowed: if null (or empty), no condition)
     */
    public void setNekoId_InScope(Collection<Integer> nekoIdList) {
        doSetNekoId_InScope(nekoIdList);
    }

    protected void doSetNekoId_InScope(Collection<Integer> nekoIdList) {
        regINS(CK_INS, cTL(nekoIdList), xgetCValueNekoId(), "neko_id");
    }

    /**
     * NotInScope {not in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * neko_id: {PK, NotNull, int4(10)}
     * @param nekoIdList The collection of nekoId as notInScope. (NullAllowed: if null (or empty), no condition)
     */
    public void setNekoId_NotInScope(Collection<Integer> nekoIdList) {
        doSetNekoId_NotInScope(nekoIdList);
    }

    protected void doSetNekoId_NotInScope(Collection<Integer> nekoIdList) {
        regINS(CK_NINS, cTL(nekoIdList), xgetCValueNekoId(), "neko_id");
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * neko_id: {PK, NotNull, int4(10)}
     */
    public void setNekoId_IsNull() { regNekoId(CK_ISN, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * neko_id: {PK, NotNull, int4(10)}
     */
    public void setNekoId_IsNotNull() { regNekoId(CK_ISNN, DOBJ); }

    protected void regNekoId(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueNekoId(), "neko_id"); }
    protected abstract ConditionValue xgetCValueNekoId();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * neko_name: {NotNull, varchar(2147483647)}
     * @param nekoName The value of nekoName as equal. (NullAllowed: if null (or empty), no condition)
     */
    public void setNekoName_Equal(String nekoName) {
        doSetNekoName_Equal(fRES(nekoName));
    }

    protected void doSetNekoName_Equal(String nekoName) {
        regNekoName(CK_EQ, nekoName);
    }

    /**
     * NotEqual(&lt;&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * neko_name: {NotNull, varchar(2147483647)}
     * @param nekoName The value of nekoName as notEqual. (NullAllowed: if null (or empty), no condition)
     */
    public void setNekoName_NotEqual(String nekoName) {
        doSetNekoName_NotEqual(fRES(nekoName));
    }

    protected void doSetNekoName_NotEqual(String nekoName) {
        regNekoName(CK_NES, nekoName);
    }

    /**
     * GreaterThan(&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * neko_name: {NotNull, varchar(2147483647)}
     * @param nekoName The value of nekoName as greaterThan. (NullAllowed: if null (or empty), no condition)
     */
    public void setNekoName_GreaterThan(String nekoName) {
        regNekoName(CK_GT, fRES(nekoName));
    }

    /**
     * LessThan(&lt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * neko_name: {NotNull, varchar(2147483647)}
     * @param nekoName The value of nekoName as lessThan. (NullAllowed: if null (or empty), no condition)
     */
    public void setNekoName_LessThan(String nekoName) {
        regNekoName(CK_LT, fRES(nekoName));
    }

    /**
     * GreaterEqual(&gt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * neko_name: {NotNull, varchar(2147483647)}
     * @param nekoName The value of nekoName as greaterEqual. (NullAllowed: if null (or empty), no condition)
     */
    public void setNekoName_GreaterEqual(String nekoName) {
        regNekoName(CK_GE, fRES(nekoName));
    }

    /**
     * LessEqual(&lt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * neko_name: {NotNull, varchar(2147483647)}
     * @param nekoName The value of nekoName as lessEqual. (NullAllowed: if null (or empty), no condition)
     */
    public void setNekoName_LessEqual(String nekoName) {
        regNekoName(CK_LE, fRES(nekoName));
    }

    /**
     * InScope {in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * neko_name: {NotNull, varchar(2147483647)}
     * @param nekoNameList The collection of nekoName as inScope. (NullAllowed: if null (or empty), no condition)
     */
    public void setNekoName_InScope(Collection<String> nekoNameList) {
        doSetNekoName_InScope(nekoNameList);
    }

    protected void doSetNekoName_InScope(Collection<String> nekoNameList) {
        regINS(CK_INS, cTL(nekoNameList), xgetCValueNekoName(), "neko_name");
    }

    /**
     * NotInScope {not in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * neko_name: {NotNull, varchar(2147483647)}
     * @param nekoNameList The collection of nekoName as notInScope. (NullAllowed: if null (or empty), no condition)
     */
    public void setNekoName_NotInScope(Collection<String> nekoNameList) {
        doSetNekoName_NotInScope(nekoNameList);
    }

    protected void doSetNekoName_NotInScope(Collection<String> nekoNameList) {
        regINS(CK_NINS, cTL(nekoNameList), xgetCValueNekoName(), "neko_name");
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * neko_name: {NotNull, varchar(2147483647)} <br>
     * <pre>e.g. setNekoName_LikeSearch("xxx", op <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> op.<span style="color: #CC4747">likeContain()</span>);</pre>
     * @param nekoName The value of nekoName as likeSearch. (NullAllowed: if null (or empty), no condition)
     * @param opLambda The callback for option of like-search. (NotNull)
     */
    public void setNekoName_LikeSearch(String nekoName, ConditionOptionCall<LikeSearchOption> opLambda) {
        setNekoName_LikeSearch(nekoName, xcLSOP(opLambda));
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * neko_name: {NotNull, varchar(2147483647)} <br>
     * <pre>e.g. setNekoName_LikeSearch("xxx", new <span style="color: #CC4747">LikeSearchOption</span>().likeContain());</pre>
     * @param nekoName The value of nekoName as likeSearch. (NullAllowed: if null (or empty), no condition)
     * @param likeSearchOption The option of like-search. (NotNull)
     */
    protected void setNekoName_LikeSearch(String nekoName, LikeSearchOption likeSearchOption) {
        regLSQ(CK_LS, fRES(nekoName), xgetCValueNekoName(), "neko_name", likeSearchOption);
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br>
     * And NullOrEmptyIgnored, SeveralRegistered. <br>
     * neko_name: {NotNull, varchar(2147483647)}
     * @param nekoName The value of nekoName as notLikeSearch. (NullAllowed: if null (or empty), no condition)
     * @param opLambda The callback for option of like-search. (NotNull)
     */
    public void setNekoName_NotLikeSearch(String nekoName, ConditionOptionCall<LikeSearchOption> opLambda) {
        setNekoName_NotLikeSearch(nekoName, xcLSOP(opLambda));
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br>
     * And NullOrEmptyIgnored, SeveralRegistered. <br>
     * neko_name: {NotNull, varchar(2147483647)}
     * @param nekoName The value of nekoName as notLikeSearch. (NullAllowed: if null (or empty), no condition)
     * @param likeSearchOption The option of not-like-search. (NotNull)
     */
    protected void setNekoName_NotLikeSearch(String nekoName, LikeSearchOption likeSearchOption) {
        regLSQ(CK_NLS, fRES(nekoName), xgetCValueNekoName(), "neko_name", likeSearchOption);
    }

    protected void regNekoName(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueNekoName(), "neko_name"); }
    protected abstract ConditionValue xgetCValueNekoName();

    /**
     * Equal(=). And NullIgnored, OnlyOnceRegistered. <br>
     * neko_date: {date(13)}
     * @param nekoDate The value of nekoDate as equal. (NullAllowed: if null, no condition)
     */
    public void setNekoDate_Equal(java.time.LocalDate nekoDate) {
        regNekoDate(CK_EQ,  nekoDate);
    }

    /**
     * GreaterThan(&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * neko_date: {date(13)}
     * @param nekoDate The value of nekoDate as greaterThan. (NullAllowed: if null, no condition)
     */
    public void setNekoDate_GreaterThan(java.time.LocalDate nekoDate) {
        regNekoDate(CK_GT,  nekoDate);
    }

    /**
     * LessThan(&lt;). And NullIgnored, OnlyOnceRegistered. <br>
     * neko_date: {date(13)}
     * @param nekoDate The value of nekoDate as lessThan. (NullAllowed: if null, no condition)
     */
    public void setNekoDate_LessThan(java.time.LocalDate nekoDate) {
        regNekoDate(CK_LT,  nekoDate);
    }

    /**
     * GreaterEqual(&gt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * neko_date: {date(13)}
     * @param nekoDate The value of nekoDate as greaterEqual. (NullAllowed: if null, no condition)
     */
    public void setNekoDate_GreaterEqual(java.time.LocalDate nekoDate) {
        regNekoDate(CK_GE,  nekoDate);
    }

    /**
     * LessEqual(&lt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * neko_date: {date(13)}
     * @param nekoDate The value of nekoDate as lessEqual. (NullAllowed: if null, no condition)
     */
    public void setNekoDate_LessEqual(java.time.LocalDate nekoDate) {
        regNekoDate(CK_LE, nekoDate);
    }

    /**
     * FromTo with various options. (versatile) {(default) fromDatetime &lt;= column &lt;= toDatetime} <br>
     * And NullIgnored, OnlyOnceRegistered. <br>
     * neko_date: {date(13)}
     * <pre>e.g. setNekoDate_FromTo(fromDate, toDate, op <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> op.<span style="color: #CC4747">compareAsDate()</span>);</pre>
     * @param fromDatetime The from-datetime(yyyy/MM/dd HH:mm:ss.SSS) of nekoDate. (NullAllowed: if null, no from-condition)
     * @param toDatetime The to-datetime(yyyy/MM/dd HH:mm:ss.SSS) of nekoDate. (NullAllowed: if null, no to-condition)
     * @param opLambda The callback for option of from-to. (NotNull)
     */
    public void setNekoDate_FromTo(java.time.LocalDate fromDatetime, java.time.LocalDate toDatetime, ConditionOptionCall<FromToOption> opLambda) {
        setNekoDate_FromTo(fromDatetime, toDatetime, xcFTOP(opLambda));
    }

    /**
     * FromTo with various options. (versatile) {(default) fromDatetime &lt;= column &lt;= toDatetime} <br>
     * And NullIgnored, OnlyOnceRegistered. <br>
     * neko_date: {date(13)}
     * <pre>e.g. setNekoDate_FromTo(fromDate, toDate, new <span style="color: #CC4747">FromToOption</span>().compareAsDate());</pre>
     * @param fromDatetime The from-datetime(yyyy/MM/dd HH:mm:ss.SSS) of nekoDate. (NullAllowed: if null, no from-condition)
     * @param toDatetime The to-datetime(yyyy/MM/dd HH:mm:ss.SSS) of nekoDate. (NullAllowed: if null, no to-condition)
     * @param fromToOption The option of from-to. (NotNull)
     */
    protected void setNekoDate_FromTo(java.time.LocalDate fromDatetime, java.time.LocalDate toDatetime, FromToOption fromToOption) {
        String nm = "neko_date"; FromToOption op = fromToOption;
        regFTQ(xfFTHD(fromDatetime, nm, op), xfFTHD(toDatetime, nm, op), xgetCValueNekoDate(), nm, op);
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * neko_date: {date(13)}
     */
    public void setNekoDate_IsNull() { regNekoDate(CK_ISN, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * neko_date: {date(13)}
     */
    public void setNekoDate_IsNotNull() { regNekoDate(CK_ISNN, DOBJ); }

    protected void regNekoDate(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueNekoDate(), "neko_date"); }
    protected abstract ConditionValue xgetCValueNekoDate();

    // ===================================================================================
    //                                                                     ScalarCondition
    //                                                                     ===============
    /**
     * Prepare ScalarCondition as equal. <br>
     * {where FOO = (select max(BAR) from ...)
     * <pre>
     * cb.query().<span style="color: #CC4747">scalar_Equal()</span>.max(new SubQuery&lt;VendorInheritNekoCB&gt;() {
     *     public void query(VendorInheritNekoCB subCB) {
     *         subCB.specify().setXxx... <span style="color: #3F7E5E">// derived column for function</span>
     *         subCB.query().setYyy...
     *     }
     * });
     * </pre>
     * @return The object to set up a function. (NotNull)
     */
    public HpSSQFunction<VendorInheritNekoCB> scalar_Equal() {
        return xcreateSSQFunction(CK_EQ, VendorInheritNekoCB.class);
    }

    /**
     * Prepare ScalarCondition as equal. <br>
     * {where FOO &lt;&gt; (select max(BAR) from ...)
     * <pre>
     * cb.query().<span style="color: #CC4747">scalar_NotEqual()</span>.max(new SubQuery&lt;VendorInheritNekoCB&gt;() {
     *     public void query(VendorInheritNekoCB subCB) {
     *         subCB.specify().setXxx... <span style="color: #3F7E5E">// derived column for function</span>
     *         subCB.query().setYyy...
     *     }
     * });
     * </pre>
     * @return The object to set up a function. (NotNull)
     */
    public HpSSQFunction<VendorInheritNekoCB> scalar_NotEqual() {
        return xcreateSSQFunction(CK_NES, VendorInheritNekoCB.class);
    }

    /**
     * Prepare ScalarCondition as greaterThan. <br>
     * {where FOO &gt; (select max(BAR) from ...)
     * <pre>
     * cb.query().<span style="color: #CC4747">scalar_GreaterThan()</span>.max(new SubQuery&lt;VendorInheritNekoCB&gt;() {
     *     public void query(VendorInheritNekoCB subCB) {
     *         subCB.specify().setFoo... <span style="color: #3F7E5E">// derived column for function</span>
     *         subCB.query().setBar...
     *     }
     * });
     * </pre>
     * @return The object to set up a function. (NotNull)
     */
    public HpSSQFunction<VendorInheritNekoCB> scalar_GreaterThan() {
        return xcreateSSQFunction(CK_GT, VendorInheritNekoCB.class);
    }

    /**
     * Prepare ScalarCondition as lessThan. <br>
     * {where FOO &lt; (select max(BAR) from ...)
     * <pre>
     * cb.query().<span style="color: #CC4747">scalar_LessThan()</span>.max(new SubQuery&lt;VendorInheritNekoCB&gt;() {
     *     public void query(VendorInheritNekoCB subCB) {
     *         subCB.specify().setFoo... <span style="color: #3F7E5E">// derived column for function</span>
     *         subCB.query().setBar...
     *     }
     * });
     * </pre>
     * @return The object to set up a function. (NotNull)
     */
    public HpSSQFunction<VendorInheritNekoCB> scalar_LessThan() {
        return xcreateSSQFunction(CK_LT, VendorInheritNekoCB.class);
    }

    /**
     * Prepare ScalarCondition as greaterEqual. <br>
     * {where FOO &gt;= (select max(BAR) from ...)
     * <pre>
     * cb.query().<span style="color: #CC4747">scalar_GreaterEqual()</span>.max(new SubQuery&lt;VendorInheritNekoCB&gt;() {
     *     public void query(VendorInheritNekoCB subCB) {
     *         subCB.specify().setFoo... <span style="color: #3F7E5E">// derived column for function</span>
     *         subCB.query().setBar...
     *     }
     * });
     * </pre>
     * @return The object to set up a function. (NotNull)
     */
    public HpSSQFunction<VendorInheritNekoCB> scalar_GreaterEqual() {
        return xcreateSSQFunction(CK_GE, VendorInheritNekoCB.class);
    }

    /**
     * Prepare ScalarCondition as lessEqual. <br>
     * {where FOO &lt;= (select max(BAR) from ...)
     * <pre>
     * cb.query().<span style="color: #CC4747">scalar_LessEqual()</span>.max(new SubQuery&lt;VendorInheritNekoCB&gt;() {
     *     public void query(VendorInheritNekoCB subCB) {
     *         subCB.specify().setFoo... <span style="color: #3F7E5E">// derived column for function</span>
     *         subCB.query().setBar...
     *     }
     * });
     * </pre>
     * @return The object to set up a function. (NotNull)
     */
    public HpSSQFunction<VendorInheritNekoCB> scalar_LessEqual() {
        return xcreateSSQFunction(CK_LE, VendorInheritNekoCB.class);
    }

    @SuppressWarnings("unchecked")
    protected <CB extends ConditionBean> void xscalarCondition(String fn, SubQuery<CB> sq, String rd, HpSSQOption<CB> op) {
        assertObjectNotNull("subQuery", sq);
        VendorInheritNekoCB cb = xcreateScalarConditionCB(); sq.query((CB)cb);
        String pp = keepScalarCondition(cb.query()); // for saving query-value
        op.setPartitionByCBean((CB)xcreateScalarConditionPartitionByCB()); // for using partition-by
        registerScalarCondition(fn, cb.query(), pp, rd, op);
    }
    public abstract String keepScalarCondition(VendorInheritNekoCQ sq);

    protected VendorInheritNekoCB xcreateScalarConditionCB() {
        VendorInheritNekoCB cb = newMyCB(); cb.xsetupForScalarCondition(this); return cb;
    }

    protected VendorInheritNekoCB xcreateScalarConditionPartitionByCB() {
        VendorInheritNekoCB cb = newMyCB(); cb.xsetupForScalarConditionPartitionBy(this); return cb;
    }

    // ===================================================================================
    //                                                                       MyselfDerived
    //                                                                       =============
    public void xsmyselfDerive(String fn, SubQuery<VendorInheritNekoCB> sq, String al, DerivedReferrerOption op) {
        assertObjectNotNull("subQuery", sq);
        VendorInheritNekoCB cb = new VendorInheritNekoCB(); cb.xsetupForDerivedReferrer(this);
        lockCall(() -> sq.query(cb)); String pp = keepSpecifyMyselfDerived(cb.query()); String pk = "neko_id";
        registerSpecifyMyselfDerived(fn, cb.query(), pk, pk, pp, "myselfDerived", al, op);
    }
    public abstract String keepSpecifyMyselfDerived(VendorInheritNekoCQ sq);

    /**
     * Prepare for (Query)MyselfDerived (correlated sub-query).
     * @return The object to set up a function for myself table. (NotNull)
     */
    public HpQDRFunction<VendorInheritNekoCB> myselfDerived() {
        return xcreateQDRFunctionMyselfDerived(VendorInheritNekoCB.class);
    }
    @SuppressWarnings("unchecked")
    protected <CB extends ConditionBean> void xqderiveMyselfDerived(String fn, SubQuery<CB> sq, String rd, Object vl, DerivedReferrerOption op) {
        assertObjectNotNull("subQuery", sq);
        VendorInheritNekoCB cb = new VendorInheritNekoCB(); cb.xsetupForDerivedReferrer(this); sq.query((CB)cb);
        String pk = "neko_id";
        String sqpp = keepQueryMyselfDerived(cb.query()); // for saving query-value.
        String prpp = keepQueryMyselfDerivedParameter(vl);
        registerQueryMyselfDerived(fn, cb.query(), pk, pk, sqpp, "myselfDerived", rd, vl, prpp, op);
    }
    public abstract String keepQueryMyselfDerived(VendorInheritNekoCQ sq);
    public abstract String keepQueryMyselfDerivedParameter(Object vl);

    // ===================================================================================
    //                                                                        MyselfExists
    //                                                                        ============
    /**
     * Prepare for MyselfExists (correlated sub-query).
     * @param subCBLambda The implementation of sub-query. (NotNull)
     */
    public void myselfExists(SubQuery<VendorInheritNekoCB> subCBLambda) {
        assertObjectNotNull("subCBLambda", subCBLambda);
        VendorInheritNekoCB cb = new VendorInheritNekoCB(); cb.xsetupForMyselfExists(this);
        lockCall(() -> subCBLambda.query(cb)); String pp = keepMyselfExists(cb.query());
        registerMyselfExists(cb.query(), pp);
    }
    public abstract String keepMyselfExists(VendorInheritNekoCQ sq);

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
    protected VendorInheritNekoCB newMyCB() {
        return new VendorInheritNekoCB();
    }
    // very internal (for suppressing warn about 'Not Use Import')
    protected String xabUDT() { return Date.class.getName(); }
    protected String xabCQ() { return VendorInheritNekoCQ.class.getName(); }
    protected String xabLSO() { return LikeSearchOption.class.getName(); }
    protected String xabSSQS() { return HpSSQSetupper.class.getName(); }
    protected String xabSCP() { return SubQuery.class.getName(); }
}
