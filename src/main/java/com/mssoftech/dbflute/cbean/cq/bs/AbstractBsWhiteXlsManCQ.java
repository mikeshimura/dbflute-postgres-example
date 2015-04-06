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
 * The abstract condition-query of white_xls_man.
 * @author DBFlute(AutoGenerator)
 */
public abstract class AbstractBsWhiteXlsManCQ extends AbstractConditionQuery {

    // ===================================================================================
    //                                                                         Constructor
    //                                                                         ===========
    public AbstractBsWhiteXlsManCQ(ConditionQuery referrerQuery, SqlClause sqlClause, String aliasName, int nestLevel) {
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
        return "white_xls_man";
    }

    // ===================================================================================
    //                                                                               Query
    //                                                                               =====
    /**
     * Equal(=). And NullIgnored, OnlyOnceRegistered. <br>
     * xls_man_id: {PK, NotNull, int8(19)}
     * @param xlsManId The value of xlsManId as equal. (NullAllowed: if null, no condition)
     */
    public void setXlsManId_Equal(Long xlsManId) {
        doSetXlsManId_Equal(xlsManId);
    }

    protected void doSetXlsManId_Equal(Long xlsManId) {
        regXlsManId(CK_EQ, xlsManId);
    }

    /**
     * NotEqual(&lt;&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * xls_man_id: {PK, NotNull, int8(19)}
     * @param xlsManId The value of xlsManId as notEqual. (NullAllowed: if null, no condition)
     */
    public void setXlsManId_NotEqual(Long xlsManId) {
        doSetXlsManId_NotEqual(xlsManId);
    }

    protected void doSetXlsManId_NotEqual(Long xlsManId) {
        regXlsManId(CK_NES, xlsManId);
    }

    /**
     * GreaterThan(&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * xls_man_id: {PK, NotNull, int8(19)}
     * @param xlsManId The value of xlsManId as greaterThan. (NullAllowed: if null, no condition)
     */
    public void setXlsManId_GreaterThan(Long xlsManId) {
        regXlsManId(CK_GT, xlsManId);
    }

    /**
     * LessThan(&lt;). And NullIgnored, OnlyOnceRegistered. <br>
     * xls_man_id: {PK, NotNull, int8(19)}
     * @param xlsManId The value of xlsManId as lessThan. (NullAllowed: if null, no condition)
     */
    public void setXlsManId_LessThan(Long xlsManId) {
        regXlsManId(CK_LT, xlsManId);
    }

    /**
     * GreaterEqual(&gt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * xls_man_id: {PK, NotNull, int8(19)}
     * @param xlsManId The value of xlsManId as greaterEqual. (NullAllowed: if null, no condition)
     */
    public void setXlsManId_GreaterEqual(Long xlsManId) {
        regXlsManId(CK_GE, xlsManId);
    }

    /**
     * LessEqual(&lt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * xls_man_id: {PK, NotNull, int8(19)}
     * @param xlsManId The value of xlsManId as lessEqual. (NullAllowed: if null, no condition)
     */
    public void setXlsManId_LessEqual(Long xlsManId) {
        regXlsManId(CK_LE, xlsManId);
    }

    /**
     * RangeOf with various options. (versatile) <br>
     * {(default) minNumber &lt;= column &lt;= maxNumber} <br>
     * And NullIgnored, OnlyOnceRegistered. <br>
     * xls_man_id: {PK, NotNull, int8(19)}
     * @param minNumber The min number of xlsManId. (NullAllowed: if null, no from-condition)
     * @param maxNumber The max number of xlsManId. (NullAllowed: if null, no to-condition)
     * @param opLambda The callback for option of range-of. (NotNull)
     */
    public void setXlsManId_RangeOf(Long minNumber, Long maxNumber, ConditionOptionCall<RangeOfOption> opLambda) {
        setXlsManId_RangeOf(minNumber, maxNumber, xcROOP(opLambda));
    }

    /**
     * RangeOf with various options. (versatile) <br>
     * {(default) minNumber &lt;= column &lt;= maxNumber} <br>
     * And NullIgnored, OnlyOnceRegistered. <br>
     * xls_man_id: {PK, NotNull, int8(19)}
     * @param minNumber The min number of xlsManId. (NullAllowed: if null, no from-condition)
     * @param maxNumber The max number of xlsManId. (NullAllowed: if null, no to-condition)
     * @param rangeOfOption The option of range-of. (NotNull)
     */
    protected void setXlsManId_RangeOf(Long minNumber, Long maxNumber, RangeOfOption rangeOfOption) {
        regROO(minNumber, maxNumber, xgetCValueXlsManId(), "xls_man_id", rangeOfOption);
    }

    /**
     * InScope {in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * xls_man_id: {PK, NotNull, int8(19)}
     * @param xlsManIdList The collection of xlsManId as inScope. (NullAllowed: if null (or empty), no condition)
     */
    public void setXlsManId_InScope(Collection<Long> xlsManIdList) {
        doSetXlsManId_InScope(xlsManIdList);
    }

    protected void doSetXlsManId_InScope(Collection<Long> xlsManIdList) {
        regINS(CK_INS, cTL(xlsManIdList), xgetCValueXlsManId(), "xls_man_id");
    }

    /**
     * NotInScope {not in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * xls_man_id: {PK, NotNull, int8(19)}
     * @param xlsManIdList The collection of xlsManId as notInScope. (NullAllowed: if null (or empty), no condition)
     */
    public void setXlsManId_NotInScope(Collection<Long> xlsManIdList) {
        doSetXlsManId_NotInScope(xlsManIdList);
    }

    protected void doSetXlsManId_NotInScope(Collection<Long> xlsManIdList) {
        regINS(CK_NINS, cTL(xlsManIdList), xgetCValueXlsManId(), "xls_man_id");
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * xls_man_id: {PK, NotNull, int8(19)}
     */
    public void setXlsManId_IsNull() { regXlsManId(CK_ISN, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * xls_man_id: {PK, NotNull, int8(19)}
     */
    public void setXlsManId_IsNotNull() { regXlsManId(CK_ISNN, DOBJ); }

    protected void regXlsManId(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueXlsManId(), "xls_man_id"); }
    protected abstract ConditionValue xgetCValueXlsManId();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * string_converted: {varchar(2147483647)}
     * @param stringConverted The value of stringConverted as equal. (NullAllowed: if null (or empty), no condition)
     */
    public void setStringConverted_Equal(String stringConverted) {
        doSetStringConverted_Equal(fRES(stringConverted));
    }

    protected void doSetStringConverted_Equal(String stringConverted) {
        regStringConverted(CK_EQ, stringConverted);
    }

    /**
     * NotEqual(&lt;&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * string_converted: {varchar(2147483647)}
     * @param stringConverted The value of stringConverted as notEqual. (NullAllowed: if null (or empty), no condition)
     */
    public void setStringConverted_NotEqual(String stringConverted) {
        doSetStringConverted_NotEqual(fRES(stringConverted));
    }

    protected void doSetStringConverted_NotEqual(String stringConverted) {
        regStringConverted(CK_NES, stringConverted);
    }

    /**
     * GreaterThan(&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * string_converted: {varchar(2147483647)}
     * @param stringConverted The value of stringConverted as greaterThan. (NullAllowed: if null (or empty), no condition)
     */
    public void setStringConverted_GreaterThan(String stringConverted) {
        regStringConverted(CK_GT, fRES(stringConverted));
    }

    /**
     * LessThan(&lt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * string_converted: {varchar(2147483647)}
     * @param stringConverted The value of stringConverted as lessThan. (NullAllowed: if null (or empty), no condition)
     */
    public void setStringConverted_LessThan(String stringConverted) {
        regStringConverted(CK_LT, fRES(stringConverted));
    }

    /**
     * GreaterEqual(&gt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * string_converted: {varchar(2147483647)}
     * @param stringConverted The value of stringConverted as greaterEqual. (NullAllowed: if null (or empty), no condition)
     */
    public void setStringConverted_GreaterEqual(String stringConverted) {
        regStringConverted(CK_GE, fRES(stringConverted));
    }

    /**
     * LessEqual(&lt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * string_converted: {varchar(2147483647)}
     * @param stringConverted The value of stringConverted as lessEqual. (NullAllowed: if null (or empty), no condition)
     */
    public void setStringConverted_LessEqual(String stringConverted) {
        regStringConverted(CK_LE, fRES(stringConverted));
    }

    /**
     * InScope {in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * string_converted: {varchar(2147483647)}
     * @param stringConvertedList The collection of stringConverted as inScope. (NullAllowed: if null (or empty), no condition)
     */
    public void setStringConverted_InScope(Collection<String> stringConvertedList) {
        doSetStringConverted_InScope(stringConvertedList);
    }

    protected void doSetStringConverted_InScope(Collection<String> stringConvertedList) {
        regINS(CK_INS, cTL(stringConvertedList), xgetCValueStringConverted(), "string_converted");
    }

    /**
     * NotInScope {not in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * string_converted: {varchar(2147483647)}
     * @param stringConvertedList The collection of stringConverted as notInScope. (NullAllowed: if null (or empty), no condition)
     */
    public void setStringConverted_NotInScope(Collection<String> stringConvertedList) {
        doSetStringConverted_NotInScope(stringConvertedList);
    }

    protected void doSetStringConverted_NotInScope(Collection<String> stringConvertedList) {
        regINS(CK_NINS, cTL(stringConvertedList), xgetCValueStringConverted(), "string_converted");
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * string_converted: {varchar(2147483647)} <br>
     * <pre>e.g. setStringConverted_LikeSearch("xxx", op <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> op.<span style="color: #CC4747">likeContain()</span>);</pre>
     * @param stringConverted The value of stringConverted as likeSearch. (NullAllowed: if null (or empty), no condition)
     * @param opLambda The callback for option of like-search. (NotNull)
     */
    public void setStringConverted_LikeSearch(String stringConverted, ConditionOptionCall<LikeSearchOption> opLambda) {
        setStringConverted_LikeSearch(stringConverted, xcLSOP(opLambda));
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * string_converted: {varchar(2147483647)} <br>
     * <pre>e.g. setStringConverted_LikeSearch("xxx", new <span style="color: #CC4747">LikeSearchOption</span>().likeContain());</pre>
     * @param stringConverted The value of stringConverted as likeSearch. (NullAllowed: if null (or empty), no condition)
     * @param likeSearchOption The option of like-search. (NotNull)
     */
    protected void setStringConverted_LikeSearch(String stringConverted, LikeSearchOption likeSearchOption) {
        regLSQ(CK_LS, fRES(stringConverted), xgetCValueStringConverted(), "string_converted", likeSearchOption);
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br>
     * And NullOrEmptyIgnored, SeveralRegistered. <br>
     * string_converted: {varchar(2147483647)}
     * @param stringConverted The value of stringConverted as notLikeSearch. (NullAllowed: if null (or empty), no condition)
     * @param opLambda The callback for option of like-search. (NotNull)
     */
    public void setStringConverted_NotLikeSearch(String stringConverted, ConditionOptionCall<LikeSearchOption> opLambda) {
        setStringConverted_NotLikeSearch(stringConverted, xcLSOP(opLambda));
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br>
     * And NullOrEmptyIgnored, SeveralRegistered. <br>
     * string_converted: {varchar(2147483647)}
     * @param stringConverted The value of stringConverted as notLikeSearch. (NullAllowed: if null (or empty), no condition)
     * @param likeSearchOption The option of not-like-search. (NotNull)
     */
    protected void setStringConverted_NotLikeSearch(String stringConverted, LikeSearchOption likeSearchOption) {
        regLSQ(CK_NLS, fRES(stringConverted), xgetCValueStringConverted(), "string_converted", likeSearchOption);
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * string_converted: {varchar(2147483647)}
     */
    public void setStringConverted_IsNull() { regStringConverted(CK_ISN, DOBJ); }

    /**
     * IsNullOrEmpty {is null or empty}. And OnlyOnceRegistered. <br>
     * string_converted: {varchar(2147483647)}
     */
    public void setStringConverted_IsNullOrEmpty() { regStringConverted(CK_ISNOE, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * string_converted: {varchar(2147483647)}
     */
    public void setStringConverted_IsNotNull() { regStringConverted(CK_ISNN, DOBJ); }

    protected void regStringConverted(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueStringConverted(), "string_converted"); }
    protected abstract ConditionValue xgetCValueStringConverted();

    /**
     * Equal(=). And NullIgnored, OnlyOnceRegistered. <br>
     * timestamp_zero_default_millis: {timestamp(26, 3)}
     * @param timestampZeroDefaultMillis The value of timestampZeroDefaultMillis as equal. (NullAllowed: if null, no condition)
     */
    public void setTimestampZeroDefaultMillis_Equal(java.time.LocalDateTime timestampZeroDefaultMillis) {
        regTimestampZeroDefaultMillis(CK_EQ,  timestampZeroDefaultMillis);
    }

    /**
     * GreaterThan(&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * timestamp_zero_default_millis: {timestamp(26, 3)}
     * @param timestampZeroDefaultMillis The value of timestampZeroDefaultMillis as greaterThan. (NullAllowed: if null, no condition)
     */
    public void setTimestampZeroDefaultMillis_GreaterThan(java.time.LocalDateTime timestampZeroDefaultMillis) {
        regTimestampZeroDefaultMillis(CK_GT,  timestampZeroDefaultMillis);
    }

    /**
     * LessThan(&lt;). And NullIgnored, OnlyOnceRegistered. <br>
     * timestamp_zero_default_millis: {timestamp(26, 3)}
     * @param timestampZeroDefaultMillis The value of timestampZeroDefaultMillis as lessThan. (NullAllowed: if null, no condition)
     */
    public void setTimestampZeroDefaultMillis_LessThan(java.time.LocalDateTime timestampZeroDefaultMillis) {
        regTimestampZeroDefaultMillis(CK_LT,  timestampZeroDefaultMillis);
    }

    /**
     * GreaterEqual(&gt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * timestamp_zero_default_millis: {timestamp(26, 3)}
     * @param timestampZeroDefaultMillis The value of timestampZeroDefaultMillis as greaterEqual. (NullAllowed: if null, no condition)
     */
    public void setTimestampZeroDefaultMillis_GreaterEqual(java.time.LocalDateTime timestampZeroDefaultMillis) {
        regTimestampZeroDefaultMillis(CK_GE,  timestampZeroDefaultMillis);
    }

    /**
     * LessEqual(&lt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * timestamp_zero_default_millis: {timestamp(26, 3)}
     * @param timestampZeroDefaultMillis The value of timestampZeroDefaultMillis as lessEqual. (NullAllowed: if null, no condition)
     */
    public void setTimestampZeroDefaultMillis_LessEqual(java.time.LocalDateTime timestampZeroDefaultMillis) {
        regTimestampZeroDefaultMillis(CK_LE, timestampZeroDefaultMillis);
    }

    /**
     * FromTo with various options. (versatile) {(default) fromDatetime &lt;= column &lt;= toDatetime} <br>
     * And NullIgnored, OnlyOnceRegistered. <br>
     * timestamp_zero_default_millis: {timestamp(26, 3)}
     * <pre>e.g. setTimestampZeroDefaultMillis_FromTo(fromDate, toDate, op <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> op.<span style="color: #CC4747">compareAsDate()</span>);</pre>
     * @param fromDatetime The from-datetime(yyyy/MM/dd HH:mm:ss.SSS) of timestampZeroDefaultMillis. (NullAllowed: if null, no from-condition)
     * @param toDatetime The to-datetime(yyyy/MM/dd HH:mm:ss.SSS) of timestampZeroDefaultMillis. (NullAllowed: if null, no to-condition)
     * @param opLambda The callback for option of from-to. (NotNull)
     */
    public void setTimestampZeroDefaultMillis_FromTo(java.time.LocalDateTime fromDatetime, java.time.LocalDateTime toDatetime, ConditionOptionCall<FromToOption> opLambda) {
        setTimestampZeroDefaultMillis_FromTo(fromDatetime, toDatetime, xcFTOP(opLambda));
    }

    /**
     * FromTo with various options. (versatile) {(default) fromDatetime &lt;= column &lt;= toDatetime} <br>
     * And NullIgnored, OnlyOnceRegistered. <br>
     * timestamp_zero_default_millis: {timestamp(26, 3)}
     * <pre>e.g. setTimestampZeroDefaultMillis_FromTo(fromDate, toDate, new <span style="color: #CC4747">FromToOption</span>().compareAsDate());</pre>
     * @param fromDatetime The from-datetime(yyyy/MM/dd HH:mm:ss.SSS) of timestampZeroDefaultMillis. (NullAllowed: if null, no from-condition)
     * @param toDatetime The to-datetime(yyyy/MM/dd HH:mm:ss.SSS) of timestampZeroDefaultMillis. (NullAllowed: if null, no to-condition)
     * @param fromToOption The option of from-to. (NotNull)
     */
    protected void setTimestampZeroDefaultMillis_FromTo(java.time.LocalDateTime fromDatetime, java.time.LocalDateTime toDatetime, FromToOption fromToOption) {
        String nm = "timestamp_zero_default_millis"; FromToOption op = fromToOption;
        regFTQ(xfFTHD(fromDatetime, nm, op), xfFTHD(toDatetime, nm, op), xgetCValueTimestampZeroDefaultMillis(), nm, op);
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * timestamp_zero_default_millis: {timestamp(26, 3)}
     */
    public void setTimestampZeroDefaultMillis_IsNull() { regTimestampZeroDefaultMillis(CK_ISN, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * timestamp_zero_default_millis: {timestamp(26, 3)}
     */
    public void setTimestampZeroDefaultMillis_IsNotNull() { regTimestampZeroDefaultMillis(CK_ISNN, DOBJ); }

    protected void regTimestampZeroDefaultMillis(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueTimestampZeroDefaultMillis(), "timestamp_zero_default_millis"); }
    protected abstract ConditionValue xgetCValueTimestampZeroDefaultMillis();

    /**
     * Equal(=). And NullIgnored, OnlyOnceRegistered. <br>
     * timestamp_zero_prefix_millis: {timestamp(26, 3)}
     * @param timestampZeroPrefixMillis The value of timestampZeroPrefixMillis as equal. (NullAllowed: if null, no condition)
     */
    public void setTimestampZeroPrefixMillis_Equal(java.time.LocalDateTime timestampZeroPrefixMillis) {
        regTimestampZeroPrefixMillis(CK_EQ,  timestampZeroPrefixMillis);
    }

    /**
     * GreaterThan(&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * timestamp_zero_prefix_millis: {timestamp(26, 3)}
     * @param timestampZeroPrefixMillis The value of timestampZeroPrefixMillis as greaterThan. (NullAllowed: if null, no condition)
     */
    public void setTimestampZeroPrefixMillis_GreaterThan(java.time.LocalDateTime timestampZeroPrefixMillis) {
        regTimestampZeroPrefixMillis(CK_GT,  timestampZeroPrefixMillis);
    }

    /**
     * LessThan(&lt;). And NullIgnored, OnlyOnceRegistered. <br>
     * timestamp_zero_prefix_millis: {timestamp(26, 3)}
     * @param timestampZeroPrefixMillis The value of timestampZeroPrefixMillis as lessThan. (NullAllowed: if null, no condition)
     */
    public void setTimestampZeroPrefixMillis_LessThan(java.time.LocalDateTime timestampZeroPrefixMillis) {
        regTimestampZeroPrefixMillis(CK_LT,  timestampZeroPrefixMillis);
    }

    /**
     * GreaterEqual(&gt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * timestamp_zero_prefix_millis: {timestamp(26, 3)}
     * @param timestampZeroPrefixMillis The value of timestampZeroPrefixMillis as greaterEqual. (NullAllowed: if null, no condition)
     */
    public void setTimestampZeroPrefixMillis_GreaterEqual(java.time.LocalDateTime timestampZeroPrefixMillis) {
        regTimestampZeroPrefixMillis(CK_GE,  timestampZeroPrefixMillis);
    }

    /**
     * LessEqual(&lt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * timestamp_zero_prefix_millis: {timestamp(26, 3)}
     * @param timestampZeroPrefixMillis The value of timestampZeroPrefixMillis as lessEqual. (NullAllowed: if null, no condition)
     */
    public void setTimestampZeroPrefixMillis_LessEqual(java.time.LocalDateTime timestampZeroPrefixMillis) {
        regTimestampZeroPrefixMillis(CK_LE, timestampZeroPrefixMillis);
    }

    /**
     * FromTo with various options. (versatile) {(default) fromDatetime &lt;= column &lt;= toDatetime} <br>
     * And NullIgnored, OnlyOnceRegistered. <br>
     * timestamp_zero_prefix_millis: {timestamp(26, 3)}
     * <pre>e.g. setTimestampZeroPrefixMillis_FromTo(fromDate, toDate, op <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> op.<span style="color: #CC4747">compareAsDate()</span>);</pre>
     * @param fromDatetime The from-datetime(yyyy/MM/dd HH:mm:ss.SSS) of timestampZeroPrefixMillis. (NullAllowed: if null, no from-condition)
     * @param toDatetime The to-datetime(yyyy/MM/dd HH:mm:ss.SSS) of timestampZeroPrefixMillis. (NullAllowed: if null, no to-condition)
     * @param opLambda The callback for option of from-to. (NotNull)
     */
    public void setTimestampZeroPrefixMillis_FromTo(java.time.LocalDateTime fromDatetime, java.time.LocalDateTime toDatetime, ConditionOptionCall<FromToOption> opLambda) {
        setTimestampZeroPrefixMillis_FromTo(fromDatetime, toDatetime, xcFTOP(opLambda));
    }

    /**
     * FromTo with various options. (versatile) {(default) fromDatetime &lt;= column &lt;= toDatetime} <br>
     * And NullIgnored, OnlyOnceRegistered. <br>
     * timestamp_zero_prefix_millis: {timestamp(26, 3)}
     * <pre>e.g. setTimestampZeroPrefixMillis_FromTo(fromDate, toDate, new <span style="color: #CC4747">FromToOption</span>().compareAsDate());</pre>
     * @param fromDatetime The from-datetime(yyyy/MM/dd HH:mm:ss.SSS) of timestampZeroPrefixMillis. (NullAllowed: if null, no from-condition)
     * @param toDatetime The to-datetime(yyyy/MM/dd HH:mm:ss.SSS) of timestampZeroPrefixMillis. (NullAllowed: if null, no to-condition)
     * @param fromToOption The option of from-to. (NotNull)
     */
    protected void setTimestampZeroPrefixMillis_FromTo(java.time.LocalDateTime fromDatetime, java.time.LocalDateTime toDatetime, FromToOption fromToOption) {
        String nm = "timestamp_zero_prefix_millis"; FromToOption op = fromToOption;
        regFTQ(xfFTHD(fromDatetime, nm, op), xfFTHD(toDatetime, nm, op), xgetCValueTimestampZeroPrefixMillis(), nm, op);
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * timestamp_zero_prefix_millis: {timestamp(26, 3)}
     */
    public void setTimestampZeroPrefixMillis_IsNull() { regTimestampZeroPrefixMillis(CK_ISN, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * timestamp_zero_prefix_millis: {timestamp(26, 3)}
     */
    public void setTimestampZeroPrefixMillis_IsNotNull() { regTimestampZeroPrefixMillis(CK_ISNN, DOBJ); }

    protected void regTimestampZeroPrefixMillis(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueTimestampZeroPrefixMillis(), "timestamp_zero_prefix_millis"); }
    protected abstract ConditionValue xgetCValueTimestampZeroPrefixMillis();

    /**
     * Equal(=). And NullIgnored, OnlyOnceRegistered. <br>
     * timestamp_zero_suffix_millis: {timestamp(26, 3)}
     * @param timestampZeroSuffixMillis The value of timestampZeroSuffixMillis as equal. (NullAllowed: if null, no condition)
     */
    public void setTimestampZeroSuffixMillis_Equal(java.time.LocalDateTime timestampZeroSuffixMillis) {
        regTimestampZeroSuffixMillis(CK_EQ,  timestampZeroSuffixMillis);
    }

    /**
     * GreaterThan(&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * timestamp_zero_suffix_millis: {timestamp(26, 3)}
     * @param timestampZeroSuffixMillis The value of timestampZeroSuffixMillis as greaterThan. (NullAllowed: if null, no condition)
     */
    public void setTimestampZeroSuffixMillis_GreaterThan(java.time.LocalDateTime timestampZeroSuffixMillis) {
        regTimestampZeroSuffixMillis(CK_GT,  timestampZeroSuffixMillis);
    }

    /**
     * LessThan(&lt;). And NullIgnored, OnlyOnceRegistered. <br>
     * timestamp_zero_suffix_millis: {timestamp(26, 3)}
     * @param timestampZeroSuffixMillis The value of timestampZeroSuffixMillis as lessThan. (NullAllowed: if null, no condition)
     */
    public void setTimestampZeroSuffixMillis_LessThan(java.time.LocalDateTime timestampZeroSuffixMillis) {
        regTimestampZeroSuffixMillis(CK_LT,  timestampZeroSuffixMillis);
    }

    /**
     * GreaterEqual(&gt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * timestamp_zero_suffix_millis: {timestamp(26, 3)}
     * @param timestampZeroSuffixMillis The value of timestampZeroSuffixMillis as greaterEqual. (NullAllowed: if null, no condition)
     */
    public void setTimestampZeroSuffixMillis_GreaterEqual(java.time.LocalDateTime timestampZeroSuffixMillis) {
        regTimestampZeroSuffixMillis(CK_GE,  timestampZeroSuffixMillis);
    }

    /**
     * LessEqual(&lt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * timestamp_zero_suffix_millis: {timestamp(26, 3)}
     * @param timestampZeroSuffixMillis The value of timestampZeroSuffixMillis as lessEqual. (NullAllowed: if null, no condition)
     */
    public void setTimestampZeroSuffixMillis_LessEqual(java.time.LocalDateTime timestampZeroSuffixMillis) {
        regTimestampZeroSuffixMillis(CK_LE, timestampZeroSuffixMillis);
    }

    /**
     * FromTo with various options. (versatile) {(default) fromDatetime &lt;= column &lt;= toDatetime} <br>
     * And NullIgnored, OnlyOnceRegistered. <br>
     * timestamp_zero_suffix_millis: {timestamp(26, 3)}
     * <pre>e.g. setTimestampZeroSuffixMillis_FromTo(fromDate, toDate, op <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> op.<span style="color: #CC4747">compareAsDate()</span>);</pre>
     * @param fromDatetime The from-datetime(yyyy/MM/dd HH:mm:ss.SSS) of timestampZeroSuffixMillis. (NullAllowed: if null, no from-condition)
     * @param toDatetime The to-datetime(yyyy/MM/dd HH:mm:ss.SSS) of timestampZeroSuffixMillis. (NullAllowed: if null, no to-condition)
     * @param opLambda The callback for option of from-to. (NotNull)
     */
    public void setTimestampZeroSuffixMillis_FromTo(java.time.LocalDateTime fromDatetime, java.time.LocalDateTime toDatetime, ConditionOptionCall<FromToOption> opLambda) {
        setTimestampZeroSuffixMillis_FromTo(fromDatetime, toDatetime, xcFTOP(opLambda));
    }

    /**
     * FromTo with various options. (versatile) {(default) fromDatetime &lt;= column &lt;= toDatetime} <br>
     * And NullIgnored, OnlyOnceRegistered. <br>
     * timestamp_zero_suffix_millis: {timestamp(26, 3)}
     * <pre>e.g. setTimestampZeroSuffixMillis_FromTo(fromDate, toDate, new <span style="color: #CC4747">FromToOption</span>().compareAsDate());</pre>
     * @param fromDatetime The from-datetime(yyyy/MM/dd HH:mm:ss.SSS) of timestampZeroSuffixMillis. (NullAllowed: if null, no from-condition)
     * @param toDatetime The to-datetime(yyyy/MM/dd HH:mm:ss.SSS) of timestampZeroSuffixMillis. (NullAllowed: if null, no to-condition)
     * @param fromToOption The option of from-to. (NotNull)
     */
    protected void setTimestampZeroSuffixMillis_FromTo(java.time.LocalDateTime fromDatetime, java.time.LocalDateTime toDatetime, FromToOption fromToOption) {
        String nm = "timestamp_zero_suffix_millis"; FromToOption op = fromToOption;
        regFTQ(xfFTHD(fromDatetime, nm, op), xfFTHD(toDatetime, nm, op), xgetCValueTimestampZeroSuffixMillis(), nm, op);
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * timestamp_zero_suffix_millis: {timestamp(26, 3)}
     */
    public void setTimestampZeroSuffixMillis_IsNull() { regTimestampZeroSuffixMillis(CK_ISN, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * timestamp_zero_suffix_millis: {timestamp(26, 3)}
     */
    public void setTimestampZeroSuffixMillis_IsNotNull() { regTimestampZeroSuffixMillis(CK_ISNN, DOBJ); }

    protected void regTimestampZeroSuffixMillis(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueTimestampZeroSuffixMillis(), "timestamp_zero_suffix_millis"); }
    protected abstract ConditionValue xgetCValueTimestampZeroSuffixMillis();

    // ===================================================================================
    //                                                                     ScalarCondition
    //                                                                     ===============
    /**
     * Prepare ScalarCondition as equal. <br>
     * {where FOO = (select max(BAR) from ...)
     * <pre>
     * cb.query().<span style="color: #CC4747">scalar_Equal()</span>.max(new SubQuery&lt;WhiteXlsManCB&gt;() {
     *     public void query(WhiteXlsManCB subCB) {
     *         subCB.specify().setXxx... <span style="color: #3F7E5E">// derived column for function</span>
     *         subCB.query().setYyy...
     *     }
     * });
     * </pre>
     * @return The object to set up a function. (NotNull)
     */
    public HpSSQFunction<WhiteXlsManCB> scalar_Equal() {
        return xcreateSSQFunction(CK_EQ, WhiteXlsManCB.class);
    }

    /**
     * Prepare ScalarCondition as equal. <br>
     * {where FOO &lt;&gt; (select max(BAR) from ...)
     * <pre>
     * cb.query().<span style="color: #CC4747">scalar_NotEqual()</span>.max(new SubQuery&lt;WhiteXlsManCB&gt;() {
     *     public void query(WhiteXlsManCB subCB) {
     *         subCB.specify().setXxx... <span style="color: #3F7E5E">// derived column for function</span>
     *         subCB.query().setYyy...
     *     }
     * });
     * </pre>
     * @return The object to set up a function. (NotNull)
     */
    public HpSSQFunction<WhiteXlsManCB> scalar_NotEqual() {
        return xcreateSSQFunction(CK_NES, WhiteXlsManCB.class);
    }

    /**
     * Prepare ScalarCondition as greaterThan. <br>
     * {where FOO &gt; (select max(BAR) from ...)
     * <pre>
     * cb.query().<span style="color: #CC4747">scalar_GreaterThan()</span>.max(new SubQuery&lt;WhiteXlsManCB&gt;() {
     *     public void query(WhiteXlsManCB subCB) {
     *         subCB.specify().setFoo... <span style="color: #3F7E5E">// derived column for function</span>
     *         subCB.query().setBar...
     *     }
     * });
     * </pre>
     * @return The object to set up a function. (NotNull)
     */
    public HpSSQFunction<WhiteXlsManCB> scalar_GreaterThan() {
        return xcreateSSQFunction(CK_GT, WhiteXlsManCB.class);
    }

    /**
     * Prepare ScalarCondition as lessThan. <br>
     * {where FOO &lt; (select max(BAR) from ...)
     * <pre>
     * cb.query().<span style="color: #CC4747">scalar_LessThan()</span>.max(new SubQuery&lt;WhiteXlsManCB&gt;() {
     *     public void query(WhiteXlsManCB subCB) {
     *         subCB.specify().setFoo... <span style="color: #3F7E5E">// derived column for function</span>
     *         subCB.query().setBar...
     *     }
     * });
     * </pre>
     * @return The object to set up a function. (NotNull)
     */
    public HpSSQFunction<WhiteXlsManCB> scalar_LessThan() {
        return xcreateSSQFunction(CK_LT, WhiteXlsManCB.class);
    }

    /**
     * Prepare ScalarCondition as greaterEqual. <br>
     * {where FOO &gt;= (select max(BAR) from ...)
     * <pre>
     * cb.query().<span style="color: #CC4747">scalar_GreaterEqual()</span>.max(new SubQuery&lt;WhiteXlsManCB&gt;() {
     *     public void query(WhiteXlsManCB subCB) {
     *         subCB.specify().setFoo... <span style="color: #3F7E5E">// derived column for function</span>
     *         subCB.query().setBar...
     *     }
     * });
     * </pre>
     * @return The object to set up a function. (NotNull)
     */
    public HpSSQFunction<WhiteXlsManCB> scalar_GreaterEqual() {
        return xcreateSSQFunction(CK_GE, WhiteXlsManCB.class);
    }

    /**
     * Prepare ScalarCondition as lessEqual. <br>
     * {where FOO &lt;= (select max(BAR) from ...)
     * <pre>
     * cb.query().<span style="color: #CC4747">scalar_LessEqual()</span>.max(new SubQuery&lt;WhiteXlsManCB&gt;() {
     *     public void query(WhiteXlsManCB subCB) {
     *         subCB.specify().setFoo... <span style="color: #3F7E5E">// derived column for function</span>
     *         subCB.query().setBar...
     *     }
     * });
     * </pre>
     * @return The object to set up a function. (NotNull)
     */
    public HpSSQFunction<WhiteXlsManCB> scalar_LessEqual() {
        return xcreateSSQFunction(CK_LE, WhiteXlsManCB.class);
    }

    @SuppressWarnings("unchecked")
    protected <CB extends ConditionBean> void xscalarCondition(String fn, SubQuery<CB> sq, String rd, HpSSQOption<CB> op) {
        assertObjectNotNull("subQuery", sq);
        WhiteXlsManCB cb = xcreateScalarConditionCB(); sq.query((CB)cb);
        String pp = keepScalarCondition(cb.query()); // for saving query-value
        op.setPartitionByCBean((CB)xcreateScalarConditionPartitionByCB()); // for using partition-by
        registerScalarCondition(fn, cb.query(), pp, rd, op);
    }
    public abstract String keepScalarCondition(WhiteXlsManCQ sq);

    protected WhiteXlsManCB xcreateScalarConditionCB() {
        WhiteXlsManCB cb = newMyCB(); cb.xsetupForScalarCondition(this); return cb;
    }

    protected WhiteXlsManCB xcreateScalarConditionPartitionByCB() {
        WhiteXlsManCB cb = newMyCB(); cb.xsetupForScalarConditionPartitionBy(this); return cb;
    }

    // ===================================================================================
    //                                                                       MyselfDerived
    //                                                                       =============
    public void xsmyselfDerive(String fn, SubQuery<WhiteXlsManCB> sq, String al, DerivedReferrerOption op) {
        assertObjectNotNull("subQuery", sq);
        WhiteXlsManCB cb = new WhiteXlsManCB(); cb.xsetupForDerivedReferrer(this);
        lockCall(() -> sq.query(cb)); String pp = keepSpecifyMyselfDerived(cb.query()); String pk = "xls_man_id";
        registerSpecifyMyselfDerived(fn, cb.query(), pk, pk, pp, "myselfDerived", al, op);
    }
    public abstract String keepSpecifyMyselfDerived(WhiteXlsManCQ sq);

    /**
     * Prepare for (Query)MyselfDerived (correlated sub-query).
     * @return The object to set up a function for myself table. (NotNull)
     */
    public HpQDRFunction<WhiteXlsManCB> myselfDerived() {
        return xcreateQDRFunctionMyselfDerived(WhiteXlsManCB.class);
    }
    @SuppressWarnings("unchecked")
    protected <CB extends ConditionBean> void xqderiveMyselfDerived(String fn, SubQuery<CB> sq, String rd, Object vl, DerivedReferrerOption op) {
        assertObjectNotNull("subQuery", sq);
        WhiteXlsManCB cb = new WhiteXlsManCB(); cb.xsetupForDerivedReferrer(this); sq.query((CB)cb);
        String pk = "xls_man_id";
        String sqpp = keepQueryMyselfDerived(cb.query()); // for saving query-value.
        String prpp = keepQueryMyselfDerivedParameter(vl);
        registerQueryMyselfDerived(fn, cb.query(), pk, pk, sqpp, "myselfDerived", rd, vl, prpp, op);
    }
    public abstract String keepQueryMyselfDerived(WhiteXlsManCQ sq);
    public abstract String keepQueryMyselfDerivedParameter(Object vl);

    // ===================================================================================
    //                                                                        MyselfExists
    //                                                                        ============
    /**
     * Prepare for MyselfExists (correlated sub-query).
     * @param subCBLambda The implementation of sub-query. (NotNull)
     */
    public void myselfExists(SubQuery<WhiteXlsManCB> subCBLambda) {
        assertObjectNotNull("subCBLambda", subCBLambda);
        WhiteXlsManCB cb = new WhiteXlsManCB(); cb.xsetupForMyselfExists(this);
        lockCall(() -> subCBLambda.query(cb)); String pp = keepMyselfExists(cb.query());
        registerMyselfExists(cb.query(), pp);
    }
    public abstract String keepMyselfExists(WhiteXlsManCQ sq);

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
    protected WhiteXlsManCB newMyCB() {
        return new WhiteXlsManCB();
    }
    // very internal (for suppressing warn about 'Not Use Import')
    protected String xabUDT() { return Date.class.getName(); }
    protected String xabCQ() { return WhiteXlsManCQ.class.getName(); }
    protected String xabLSO() { return LikeSearchOption.class.getName(); }
    protected String xabSSQS() { return HpSSQSetupper.class.getName(); }
    protected String xabSCP() { return SubQuery.class.getName(); }
}
