package com.mssoftech.dbflute.bsentity;

import java.util.List;
import java.util.ArrayList;

import org.dbflute.dbmeta.DBMeta;
import org.dbflute.dbmeta.AbstractEntity;
import org.dbflute.dbmeta.accessory.DomainEntity;
import com.mssoftech.dbflute.allcommon.DBMetaInstanceHandler;
import com.mssoftech.dbflute.exentity.*;

/**
 * The entity of vendor_inherit_neko as TABLE. <br>
 * <pre>
 * [primary-key]
 *     neko_id
 * 
 * [column]
 *     inu_id, inu_name, inu_date, neko_id, neko_name, neko_date
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
 * Integer inuId = entity.getInuId();
 * String inuName = entity.getInuName();
 * java.time.LocalDate inuDate = entity.getInuDate();
 * Integer nekoId = entity.getNekoId();
 * String nekoName = entity.getNekoName();
 * java.time.LocalDate nekoDate = entity.getNekoDate();
 * entity.setInuId(inuId);
 * entity.setInuName(inuName);
 * entity.setInuDate(inuDate);
 * entity.setNekoId(nekoId);
 * entity.setNekoName(nekoName);
 * entity.setNekoDate(nekoDate);
 * = = = = = = = = = =/
 * </pre>
 * @author DBFlute(AutoGenerator)
 */
public abstract class BsVendorInheritNeko extends AbstractEntity implements DomainEntity {

    // ===================================================================================
    //                                                                          Definition
    //                                                                          ==========
    /** The serial version UID for object serialization. (Default) */
    private static final long serialVersionUID = 1L;

    // ===================================================================================
    //                                                                           Attribute
    //                                                                           =========
    /** inu_id: {NotNull, int4(10)} */
    protected Integer _inuId;

    /** inu_name: {NotNull, varchar(2147483647)} */
    protected String _inuName;

    /** inu_date: {date(13)} */
    protected java.time.LocalDate _inuDate;

    /** neko_id: {PK, NotNull, int4(10)} */
    protected Integer _nekoId;

    /** neko_name: {NotNull, varchar(2147483647)} */
    protected String _nekoName;

    /** neko_date: {date(13)} */
    protected java.time.LocalDate _nekoDate;

    // ===================================================================================
    //                                                                             DB Meta
    //                                                                             =======
    /** {@inheritDoc} */
    public DBMeta asDBMeta() {
        return DBMetaInstanceHandler.findDBMeta(asTableDbName());
    }

    /** {@inheritDoc} */
    public String asTableDbName() {
        return "vendor_inherit_neko";
    }

    // ===================================================================================
    //                                                                        Key Handling
    //                                                                        ============
    /** {@inheritDoc} */
    public boolean hasPrimaryKeyValue() {
        if (_nekoId == null) { return false; }
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
        if (obj instanceof BsVendorInheritNeko) {
            BsVendorInheritNeko other = (BsVendorInheritNeko)obj;
            if (!xSV(_nekoId, other._nekoId)) { return false; }
            return true;
        } else {
            return false;
        }
    }

    @Override
    protected int doHashCode(int initial) {
        int hs = initial;
        hs = xCH(hs, asTableDbName());
        hs = xCH(hs, _nekoId);
        return hs;
    }

    @Override
    protected String doBuildStringWithRelation(String li) {
        return "";
    }

    @Override
    protected String doBuildColumnString(String dm) {
        StringBuilder sb = new StringBuilder();
        sb.append(dm).append(xfND(_inuId));
        sb.append(dm).append(xfND(_inuName));
        sb.append(dm).append(xfND(_inuDate));
        sb.append(dm).append(xfND(_nekoId));
        sb.append(dm).append(xfND(_nekoName));
        sb.append(dm).append(xfND(_nekoDate));
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
    public VendorInheritNeko clone() {
        return (VendorInheritNeko)super.clone();
    }

    // ===================================================================================
    //                                                                            Accessor
    //                                                                            ========
    /**
     * [get] inu_id: {NotNull, int4(10)} <br>
     * @return The value of the column 'inu_id'. (basically NotNull if selected: for the constraint)
     */
    public Integer getInuId() {
        checkSpecifiedProperty("inuId");
        return _inuId;
    }

    /**
     * [set] inu_id: {NotNull, int4(10)} <br>
     * @param inuId The value of the column 'inu_id'. (basically NotNull if update: for the constraint)
     */
    public void setInuId(Integer inuId) {
        registerModifiedProperty("inuId");
        _inuId = inuId;
    }

    /**
     * [get] inu_name: {NotNull, varchar(2147483647)} <br>
     * @return The value of the column 'inu_name'. (basically NotNull if selected: for the constraint)
     */
    public String getInuName() {
        checkSpecifiedProperty("inuName");
        return _inuName;
    }

    /**
     * [set] inu_name: {NotNull, varchar(2147483647)} <br>
     * @param inuName The value of the column 'inu_name'. (basically NotNull if update: for the constraint)
     */
    public void setInuName(String inuName) {
        registerModifiedProperty("inuName");
        _inuName = inuName;
    }

    /**
     * [get] inu_date: {date(13)} <br>
     * @return The value of the column 'inu_date'. (NullAllowed even if selected: for no constraint)
     */
    public java.time.LocalDate getInuDate() {
        checkSpecifiedProperty("inuDate");
        return _inuDate;
    }

    /**
     * [set] inu_date: {date(13)} <br>
     * @param inuDate The value of the column 'inu_date'. (NullAllowed: null update allowed for no constraint)
     */
    public void setInuDate(java.time.LocalDate inuDate) {
        registerModifiedProperty("inuDate");
        _inuDate = inuDate;
    }

    /**
     * [get] neko_id: {PK, NotNull, int4(10)} <br>
     * @return The value of the column 'neko_id'. (basically NotNull if selected: for the constraint)
     */
    public Integer getNekoId() {
        checkSpecifiedProperty("nekoId");
        return _nekoId;
    }

    /**
     * [set] neko_id: {PK, NotNull, int4(10)} <br>
     * @param nekoId The value of the column 'neko_id'. (basically NotNull if update: for the constraint)
     */
    public void setNekoId(Integer nekoId) {
        registerModifiedProperty("nekoId");
        _nekoId = nekoId;
    }

    /**
     * [get] neko_name: {NotNull, varchar(2147483647)} <br>
     * @return The value of the column 'neko_name'. (basically NotNull if selected: for the constraint)
     */
    public String getNekoName() {
        checkSpecifiedProperty("nekoName");
        return _nekoName;
    }

    /**
     * [set] neko_name: {NotNull, varchar(2147483647)} <br>
     * @param nekoName The value of the column 'neko_name'. (basically NotNull if update: for the constraint)
     */
    public void setNekoName(String nekoName) {
        registerModifiedProperty("nekoName");
        _nekoName = nekoName;
    }

    /**
     * [get] neko_date: {date(13)} <br>
     * @return The value of the column 'neko_date'. (NullAllowed even if selected: for no constraint)
     */
    public java.time.LocalDate getNekoDate() {
        checkSpecifiedProperty("nekoDate");
        return _nekoDate;
    }

    /**
     * [set] neko_date: {date(13)} <br>
     * @param nekoDate The value of the column 'neko_date'. (NullAllowed: null update allowed for no constraint)
     */
    public void setNekoDate(java.time.LocalDate nekoDate) {
        registerModifiedProperty("nekoDate");
        _nekoDate = nekoDate;
    }
}
