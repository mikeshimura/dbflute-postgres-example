package com.mssoftech.dbflute.bsentity;

import java.util.List;
import java.util.ArrayList;

import org.dbflute.dbmeta.DBMeta;
import org.dbflute.dbmeta.AbstractEntity;
import org.dbflute.dbmeta.accessory.DomainEntity;
import com.mssoftech.dbflute.allcommon.DBMetaInstanceHandler;
import com.mssoftech.dbflute.exentity.*;

/**
 * The entity of vendor_date_pk as TABLE. <br>
 * <pre>
 * [primary-key]
 *     foo_date
 * 
 * [column]
 *     foo_date, foo_name
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
 *     vendor_date_fk
 * 
 * [foreign property]
 *     
 * 
 * [referrer property]
 *     vendorDateFkList
 * 
 * [get/set template]
 * /= = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = =
 * java.time.LocalDate fooDate = entity.getFooDate();
 * String fooName = entity.getFooName();
 * entity.setFooDate(fooDate);
 * entity.setFooName(fooName);
 * = = = = = = = = = =/
 * </pre>
 * @author DBFlute(AutoGenerator)
 */
public abstract class BsVendorDatePk extends AbstractEntity implements DomainEntity {

    // ===================================================================================
    //                                                                          Definition
    //                                                                          ==========
    /** The serial version UID for object serialization. (Default) */
    private static final long serialVersionUID = 1L;

    // ===================================================================================
    //                                                                           Attribute
    //                                                                           =========
    /** foo_date: {PK, NotNull, date(13)} */
    protected java.time.LocalDate _fooDate;

    /** foo_name: {NotNull, varchar(2147483647)} */
    protected String _fooName;

    // ===================================================================================
    //                                                                             DB Meta
    //                                                                             =======
    /** {@inheritDoc} */
    public DBMeta asDBMeta() {
        return DBMetaInstanceHandler.findDBMeta(asTableDbName());
    }

    /** {@inheritDoc} */
    public String asTableDbName() {
        return "vendor_date_pk";
    }

    // ===================================================================================
    //                                                                        Key Handling
    //                                                                        ============
    /** {@inheritDoc} */
    public boolean hasPrimaryKeyValue() {
        if (_fooDate == null) { return false; }
        return true;
    }

    // ===================================================================================
    //                                                                    Foreign Property
    //                                                                    ================
    // ===================================================================================
    //                                                                   Referrer Property
    //                                                                   =================
    /** vendor_date_fk by bar_date, named 'vendorDateFkList'. */
    protected List<VendorDateFk> _vendorDateFkList;

    /**
     * [get] vendor_date_fk by bar_date, named 'vendorDateFkList'.
     * @return The entity list of referrer property 'vendorDateFkList'. (NotNull: even if no loading, returns empty list)
     */
    public List<VendorDateFk> getVendorDateFkList() {
        if (_vendorDateFkList == null) { _vendorDateFkList = newReferrerList(); }
        return _vendorDateFkList;
    }

    /**
     * [set] vendor_date_fk by bar_date, named 'vendorDateFkList'.
     * @param vendorDateFkList The entity list of referrer property 'vendorDateFkList'. (NullAllowed)
     */
    public void setVendorDateFkList(List<VendorDateFk> vendorDateFkList) {
        _vendorDateFkList = vendorDateFkList;
    }

    protected <ELEMENT> List<ELEMENT> newReferrerList() {
        return new ArrayList<ELEMENT>();
    }

    // ===================================================================================
    //                                                                      Basic Override
    //                                                                      ==============
    @Override
    protected boolean doEquals(Object obj) {
        if (obj instanceof BsVendorDatePk) {
            BsVendorDatePk other = (BsVendorDatePk)obj;
            if (!xSV(_fooDate, other._fooDate)) { return false; }
            return true;
        } else {
            return false;
        }
    }

    @Override
    protected int doHashCode(int initial) {
        int hs = initial;
        hs = xCH(hs, asTableDbName());
        hs = xCH(hs, _fooDate);
        return hs;
    }

    @Override
    protected String doBuildStringWithRelation(String li) {
        StringBuilder sb = new StringBuilder();
        if (_vendorDateFkList != null) { for (VendorDateFk et : _vendorDateFkList)
        { if (et != null) { sb.append(li).append(xbRDS(et, "vendorDateFkList")); } } }
        return sb.toString();
    }

    @Override
    protected String doBuildColumnString(String dm) {
        StringBuilder sb = new StringBuilder();
        sb.append(dm).append(xfND(_fooDate));
        sb.append(dm).append(xfND(_fooName));
        if (sb.length() > dm.length()) {
            sb.delete(0, dm.length());
        }
        sb.insert(0, "{").append("}");
        return sb.toString();
    }

    @Override
    protected String doBuildRelationString(String dm) {
        StringBuilder sb = new StringBuilder();
        if (_vendorDateFkList != null && !_vendorDateFkList.isEmpty())
        { sb.append(dm).append("vendorDateFkList"); }
        if (sb.length() > dm.length()) {
            sb.delete(0, dm.length()).insert(0, "(").append(")");
        }
        return sb.toString();
    }

    @Override
    public VendorDatePk clone() {
        return (VendorDatePk)super.clone();
    }

    // ===================================================================================
    //                                                                            Accessor
    //                                                                            ========
    /**
     * [get] foo_date: {PK, NotNull, date(13)} <br>
     * @return The value of the column 'foo_date'. (basically NotNull if selected: for the constraint)
     */
    public java.time.LocalDate getFooDate() {
        checkSpecifiedProperty("fooDate");
        return _fooDate;
    }

    /**
     * [set] foo_date: {PK, NotNull, date(13)} <br>
     * @param fooDate The value of the column 'foo_date'. (basically NotNull if update: for the constraint)
     */
    public void setFooDate(java.time.LocalDate fooDate) {
        registerModifiedProperty("fooDate");
        _fooDate = fooDate;
    }

    /**
     * [get] foo_name: {NotNull, varchar(2147483647)} <br>
     * @return The value of the column 'foo_name'. (basically NotNull if selected: for the constraint)
     */
    public String getFooName() {
        checkSpecifiedProperty("fooName");
        return _fooName;
    }

    /**
     * [set] foo_name: {NotNull, varchar(2147483647)} <br>
     * @param fooName The value of the column 'foo_name'. (basically NotNull if update: for the constraint)
     */
    public void setFooName(String fooName) {
        registerModifiedProperty("fooName");
        _fooName = fooName;
    }
}
