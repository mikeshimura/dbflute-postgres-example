package com.mssoftech.dbflute.bsentity;

import java.util.List;
import java.util.ArrayList;

import org.dbflute.dbmeta.DBMeta;
import org.dbflute.dbmeta.AbstractEntity;
import org.dbflute.dbmeta.accessory.DomainEntity;
import com.mssoftech.dbflute.allcommon.DBMetaInstanceHandler;
import com.mssoftech.dbflute.exentity.*;

/**
 * The entity of white_xls_man as TABLE. <br>
 * <pre>
 * [primary-key]
 *     xls_man_id
 * 
 * [column]
 *     xls_man_id, string_converted, timestamp_zero_default_millis, timestamp_zero_prefix_millis, timestamp_zero_suffix_millis
 * 
 * [sequence]
 *     
 * 
 * [identity]
 *     
 * 
 * [version-no]
 *     
 * 
 * [foreign table]
 *     
 * 
 * [referrer table]
 *     
 * 
 * [foreign property]
 *     
 * 
 * [referrer property]
 *     
 * 
 * [get/set template]
 * /= = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = =
 * Long xlsManId = entity.getXlsManId();
 * String stringConverted = entity.getStringConverted();
 * java.time.LocalDateTime timestampZeroDefaultMillis = entity.getTimestampZeroDefaultMillis();
 * java.time.LocalDateTime timestampZeroPrefixMillis = entity.getTimestampZeroPrefixMillis();
 * java.time.LocalDateTime timestampZeroSuffixMillis = entity.getTimestampZeroSuffixMillis();
 * entity.setXlsManId(xlsManId);
 * entity.setStringConverted(stringConverted);
 * entity.setTimestampZeroDefaultMillis(timestampZeroDefaultMillis);
 * entity.setTimestampZeroPrefixMillis(timestampZeroPrefixMillis);
 * entity.setTimestampZeroSuffixMillis(timestampZeroSuffixMillis);
 * = = = = = = = = = =/
 * </pre>
 * @author DBFlute(AutoGenerator)
 */
public abstract class BsWhiteXlsMan extends AbstractEntity implements DomainEntity {

    // ===================================================================================
    //                                                                          Definition
    //                                                                          ==========
    /** The serial version UID for object serialization. (Default) */
    private static final long serialVersionUID = 1L;

    // ===================================================================================
    //                                                                           Attribute
    //                                                                           =========
    /** xls_man_id: {PK, NotNull, int8(19)} */
    protected Long _xlsManId;

    /** string_converted: {varchar(2147483647)} */
    protected String _stringConverted;

    /** timestamp_zero_default_millis: {timestamp(26, 3)} */
    protected java.time.LocalDateTime _timestampZeroDefaultMillis;

    /** timestamp_zero_prefix_millis: {timestamp(26, 3)} */
    protected java.time.LocalDateTime _timestampZeroPrefixMillis;

    /** timestamp_zero_suffix_millis: {timestamp(26, 3)} */
    protected java.time.LocalDateTime _timestampZeroSuffixMillis;

    // ===================================================================================
    //                                                                             DB Meta
    //                                                                             =======
    /** {@inheritDoc} */
    public DBMeta asDBMeta() {
        return DBMetaInstanceHandler.findDBMeta(asTableDbName());
    }

    /** {@inheritDoc} */
    public String asTableDbName() {
        return "white_xls_man";
    }

    // ===================================================================================
    //                                                                        Key Handling
    //                                                                        ============
    /** {@inheritDoc} */
    public boolean hasPrimaryKeyValue() {
        if (_xlsManId == null) { return false; }
        return true;
    }

    // ===================================================================================
    //                                                                    Foreign Property
    //                                                                    ================
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
        if (obj instanceof BsWhiteXlsMan) {
            BsWhiteXlsMan other = (BsWhiteXlsMan)obj;
            if (!xSV(_xlsManId, other._xlsManId)) { return false; }
            return true;
        } else {
            return false;
        }
    }

    @Override
    protected int doHashCode(int initial) {
        int hs = initial;
        hs = xCH(hs, asTableDbName());
        hs = xCH(hs, _xlsManId);
        return hs;
    }

    @Override
    protected String doBuildStringWithRelation(String li) {
        return "";
    }

    @Override
    protected String doBuildColumnString(String dm) {
        StringBuilder sb = new StringBuilder();
        sb.append(dm).append(xfND(_xlsManId));
        sb.append(dm).append(xfND(_stringConverted));
        sb.append(dm).append(xfND(_timestampZeroDefaultMillis));
        sb.append(dm).append(xfND(_timestampZeroPrefixMillis));
        sb.append(dm).append(xfND(_timestampZeroSuffixMillis));
        if (sb.length() > dm.length()) {
            sb.delete(0, dm.length());
        }
        sb.insert(0, "{").append("}");
        return sb.toString();
    }

    @Override
    protected String doBuildRelationString(String dm) {
        return "";
    }

    @Override
    public WhiteXlsMan clone() {
        return (WhiteXlsMan)super.clone();
    }

    // ===================================================================================
    //                                                                            Accessor
    //                                                                            ========
    /**
     * [get] xls_man_id: {PK, NotNull, int8(19)} <br>
     * @return The value of the column 'xls_man_id'. (basically NotNull if selected: for the constraint)
     */
    public Long getXlsManId() {
        checkSpecifiedProperty("xlsManId");
        return _xlsManId;
    }

    /**
     * [set] xls_man_id: {PK, NotNull, int8(19)} <br>
     * @param xlsManId The value of the column 'xls_man_id'. (basically NotNull if update: for the constraint)
     */
    public void setXlsManId(Long xlsManId) {
        registerModifiedProperty("xlsManId");
        _xlsManId = xlsManId;
    }

    /**
     * [get] string_converted: {varchar(2147483647)} <br>
     * @return The value of the column 'string_converted'. (NullAllowed even if selected: for no constraint)
     */
    public String getStringConverted() {
        checkSpecifiedProperty("stringConverted");
        return _stringConverted;
    }

    /**
     * [set] string_converted: {varchar(2147483647)} <br>
     * @param stringConverted The value of the column 'string_converted'. (NullAllowed: null update allowed for no constraint)
     */
    public void setStringConverted(String stringConverted) {
        registerModifiedProperty("stringConverted");
        _stringConverted = stringConverted;
    }

    /**
     * [get] timestamp_zero_default_millis: {timestamp(26, 3)} <br>
     * @return The value of the column 'timestamp_zero_default_millis'. (NullAllowed even if selected: for no constraint)
     */
    public java.time.LocalDateTime getTimestampZeroDefaultMillis() {
        checkSpecifiedProperty("timestampZeroDefaultMillis");
        return _timestampZeroDefaultMillis;
    }

    /**
     * [set] timestamp_zero_default_millis: {timestamp(26, 3)} <br>
     * @param timestampZeroDefaultMillis The value of the column 'timestamp_zero_default_millis'. (NullAllowed: null update allowed for no constraint)
     */
    public void setTimestampZeroDefaultMillis(java.time.LocalDateTime timestampZeroDefaultMillis) {
        registerModifiedProperty("timestampZeroDefaultMillis");
        _timestampZeroDefaultMillis = timestampZeroDefaultMillis;
    }

    /**
     * [get] timestamp_zero_prefix_millis: {timestamp(26, 3)} <br>
     * @return The value of the column 'timestamp_zero_prefix_millis'. (NullAllowed even if selected: for no constraint)
     */
    public java.time.LocalDateTime getTimestampZeroPrefixMillis() {
        checkSpecifiedProperty("timestampZeroPrefixMillis");
        return _timestampZeroPrefixMillis;
    }

    /**
     * [set] timestamp_zero_prefix_millis: {timestamp(26, 3)} <br>
     * @param timestampZeroPrefixMillis The value of the column 'timestamp_zero_prefix_millis'. (NullAllowed: null update allowed for no constraint)
     */
    public void setTimestampZeroPrefixMillis(java.time.LocalDateTime timestampZeroPrefixMillis) {
        registerModifiedProperty("timestampZeroPrefixMillis");
        _timestampZeroPrefixMillis = timestampZeroPrefixMillis;
    }

    /**
     * [get] timestamp_zero_suffix_millis: {timestamp(26, 3)} <br>
     * @return The value of the column 'timestamp_zero_suffix_millis'. (NullAllowed even if selected: for no constraint)
     */
    public java.time.LocalDateTime getTimestampZeroSuffixMillis() {
        checkSpecifiedProperty("timestampZeroSuffixMillis");
        return _timestampZeroSuffixMillis;
    }

    /**
     * [set] timestamp_zero_suffix_millis: {timestamp(26, 3)} <br>
     * @param timestampZeroSuffixMillis The value of the column 'timestamp_zero_suffix_millis'. (NullAllowed: null update allowed for no constraint)
     */
    public void setTimestampZeroSuffixMillis(java.time.LocalDateTime timestampZeroSuffixMillis) {
        registerModifiedProperty("timestampZeroSuffixMillis");
        _timestampZeroSuffixMillis = timestampZeroSuffixMillis;
    }
}
