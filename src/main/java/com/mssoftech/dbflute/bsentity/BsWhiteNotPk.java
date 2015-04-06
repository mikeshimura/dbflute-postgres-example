package com.mssoftech.dbflute.bsentity;

import java.util.List;
import java.util.ArrayList;

import org.dbflute.dbmeta.DBMeta;
import org.dbflute.dbmeta.AbstractEntity;
import org.dbflute.dbmeta.accessory.DomainEntity;
import com.mssoftech.dbflute.allcommon.DBMetaInstanceHandler;
import com.mssoftech.dbflute.exentity.*;

/**
 * The entity of white_not_pk as TABLE. <br>
 * <pre>
 * [primary-key]
 *     
 * 
 * [column]
 *     not_pk_id, not_pk_name, not_pk_integer
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
 * Long notPkId = entity.getNotPkId();
 * String notPkName = entity.getNotPkName();
 * Integer notPkInteger = entity.getNotPkInteger();
 * entity.setNotPkId(notPkId);
 * entity.setNotPkName(notPkName);
 * entity.setNotPkInteger(notPkInteger);
 * = = = = = = = = = =/
 * </pre>
 * @author DBFlute(AutoGenerator)
 */
public abstract class BsWhiteNotPk extends AbstractEntity implements DomainEntity {

    // ===================================================================================
    //                                                                          Definition
    //                                                                          ==========
    /** The serial version UID for object serialization. (Default) */
    private static final long serialVersionUID = 1L;

    // ===================================================================================
    //                                                                           Attribute
    //                                                                           =========
    /** not_pk_id: {NotNull, int8(19)} */
    protected Long _notPkId;

    /** not_pk_name: {varchar(2147483647)} */
    protected String _notPkName;

    /** not_pk_integer: {int4(10)} */
    protected Integer _notPkInteger;

    // ===================================================================================
    //                                                                             DB Meta
    //                                                                             =======
    /** {@inheritDoc} */
    public DBMeta asDBMeta() {
        return DBMetaInstanceHandler.findDBMeta(asTableDbName());
    }

    /** {@inheritDoc} */
    public String asTableDbName() {
        return "white_not_pk";
    }

    // ===================================================================================
    //                                                                        Key Handling
    //                                                                        ============
    /** {@inheritDoc} */
    public boolean hasPrimaryKeyValue() {
        return false;
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
        if (obj instanceof BsWhiteNotPk) {
            BsWhiteNotPk other = (BsWhiteNotPk)obj;
            if (!xSV(_notPkId, other._notPkId)) { return false; }
            if (!xSV(_notPkName, other._notPkName)) { return false; }
            if (!xSV(_notPkInteger, other._notPkInteger)) { return false; }
            return true;
        } else {
            return false;
        }
    }

    @Override
    protected int doHashCode(int initial) {
        int hs = initial;
        hs = xCH(hs, asTableDbName());
        hs = xCH(hs, _notPkId);
        hs = xCH(hs, _notPkName);
        hs = xCH(hs, _notPkInteger);
        return hs;
    }

    @Override
    protected String doBuildStringWithRelation(String li) {
        return "";
    }

    @Override
    protected String doBuildColumnString(String dm) {
        StringBuilder sb = new StringBuilder();
        sb.append(dm).append(xfND(_notPkId));
        sb.append(dm).append(xfND(_notPkName));
        sb.append(dm).append(xfND(_notPkInteger));
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
    public WhiteNotPk clone() {
        return (WhiteNotPk)super.clone();
    }

    // ===================================================================================
    //                                                                            Accessor
    //                                                                            ========
    /**
     * [get] not_pk_id: {NotNull, int8(19)} <br>
     * @return The value of the column 'not_pk_id'. (basically NotNull if selected: for the constraint)
     */
    public Long getNotPkId() {
        checkSpecifiedProperty("notPkId");
        return _notPkId;
    }

    /**
     * [set] not_pk_id: {NotNull, int8(19)} <br>
     * @param notPkId The value of the column 'not_pk_id'. (basically NotNull if update: for the constraint)
     */
    public void setNotPkId(Long notPkId) {
        registerModifiedProperty("notPkId");
        _notPkId = notPkId;
    }

    /**
     * [get] not_pk_name: {varchar(2147483647)} <br>
     * @return The value of the column 'not_pk_name'. (NullAllowed even if selected: for no constraint)
     */
    public String getNotPkName() {
        checkSpecifiedProperty("notPkName");
        return _notPkName;
    }

    /**
     * [set] not_pk_name: {varchar(2147483647)} <br>
     * @param notPkName The value of the column 'not_pk_name'. (NullAllowed: null update allowed for no constraint)
     */
    public void setNotPkName(String notPkName) {
        registerModifiedProperty("notPkName");
        _notPkName = notPkName;
    }

    /**
     * [get] not_pk_integer: {int4(10)} <br>
     * @return The value of the column 'not_pk_integer'. (NullAllowed even if selected: for no constraint)
     */
    public Integer getNotPkInteger() {
        checkSpecifiedProperty("notPkInteger");
        return _notPkInteger;
    }

    /**
     * [set] not_pk_integer: {int4(10)} <br>
     * @param notPkInteger The value of the column 'not_pk_integer'. (NullAllowed: null update allowed for no constraint)
     */
    public void setNotPkInteger(Integer notPkInteger) {
        registerModifiedProperty("notPkInteger");
        _notPkInteger = notPkInteger;
    }
}
