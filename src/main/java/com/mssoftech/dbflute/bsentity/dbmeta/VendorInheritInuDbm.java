package com.mssoftech.dbflute.bsentity.dbmeta;

import java.util.List;
import java.util.Map;

import org.dbflute.Entity;
import org.dbflute.dbmeta.AbstractDBMeta;
import org.dbflute.dbmeta.info.*;
import org.dbflute.dbmeta.name.*;
import org.dbflute.dbmeta.property.PropertyGateway;
import org.dbflute.dbway.DBDef;
import com.mssoftech.dbflute.allcommon.*;
import com.mssoftech.dbflute.exentity.*;

/**
 * The DB meta of vendor_inherit_inu. (Singleton)
 * @author DBFlute(AutoGenerator)
 */
public class VendorInheritInuDbm extends AbstractDBMeta {

    // ===================================================================================
    //                                                                           Singleton
    //                                                                           =========
    private static final VendorInheritInuDbm _instance = new VendorInheritInuDbm();
    private VendorInheritInuDbm() {}
    public static VendorInheritInuDbm getInstance() { return _instance; }

    // ===================================================================================
    //                                                                       Current DBDef
    //                                                                       =============
    public String getProjectName() { return DBCurrent.getInstance().projectName(); }
    public String getProjectPrefix() { return DBCurrent.getInstance().projectPrefix(); }
    public String getGenerationGapBasePrefix() { return DBCurrent.getInstance().generationGapBasePrefix(); }
    public DBDef getCurrentDBDef() { return DBCurrent.getInstance().currentDBDef(); }

    // ===================================================================================
    //                                                                    Property Gateway
    //                                                                    ================
    // -----------------------------------------------------
    //                                       Column Property
    //                                       ---------------
    protected final Map<String, PropertyGateway> _epgMap = newHashMap();
    { xsetupEpg(); }
    protected void xsetupEpg() {
        setupEpg(_epgMap, et -> ((VendorInheritInu)et).getInuId(), (et, vl) -> ((VendorInheritInu)et).setInuId(cti(vl)), "inuId");
        setupEpg(_epgMap, et -> ((VendorInheritInu)et).getInuName(), (et, vl) -> ((VendorInheritInu)et).setInuName((String)vl), "inuName");
        setupEpg(_epgMap, et -> ((VendorInheritInu)et).getInuDate(), (et, vl) -> ((VendorInheritInu)et).setInuDate(ctld(vl)), "inuDate");
    }
    public PropertyGateway findPropertyGateway(String prop)
    { return doFindEpg(_epgMap, prop); }

    // ===================================================================================
    //                                                                          Table Info
    //                                                                          ==========
    protected final String _tableDbName = "vendor_inherit_inu";
    protected final String _tableDispName = "vendor_inherit_inu";
    protected final String _tablePropertyName = "vendorInheritInu";
    protected final TableSqlName _tableSqlName = new TableSqlName("vendor_inherit_inu", _tableDbName);
    { _tableSqlName.xacceptFilter(DBFluteConfig.getInstance().getTableSqlNameFilter()); }
    public String getTableDbName() { return _tableDbName; }
    public String getTableDispName() { return _tableDispName; }
    public String getTablePropertyName() { return _tablePropertyName; }
    public TableSqlName getTableSqlName() { return _tableSqlName; }

    // ===================================================================================
    //                                                                         Column Info
    //                                                                         ===========
    protected final ColumnInfo _columnInuId = cci("inu_id", "inu_id", null, null, Integer.class, "inuId", null, true, false, true, "int4", 10, 0, null, false, null, null, null, null, null, false);
//"int64"
    protected final ColumnInfo _columnInuName = cci("inu_name", "inu_name", null, null, String.class, "inuName", null, false, false, true, "varchar", 2147483647, 0, null, false, null, null, null, null, null, false);
//"string"
    protected final ColumnInfo _columnInuDate = cci("inu_date", "inu_date", null, null, java.time.LocalDate.class, "inuDate", null, false, false, false, "date", 13, 0, null, false, null, null, null, null, null, false);
//"df.NullDate"

    /**
     * inu_id: {PK, NotNull, int4(10)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnInuId() { return _columnInuId; }
    /**
     * inu_name: {NotNull, varchar(2147483647)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnInuName() { return _columnInuName; }
    /**
     * inu_date: {date(13)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnInuDate() { return _columnInuDate; }

    protected List<ColumnInfo> ccil() {
        List<ColumnInfo> ls = newArrayList();
        ls.add(columnInuId());
        ls.add(columnInuName());
        ls.add(columnInuDate());
        return ls;
    }

    { initializeInformationResource(); }

    // ===================================================================================
    //                                                                         Unique Info
    //                                                                         ===========
    // -----------------------------------------------------
    //                                       Primary Element
    //                                       ---------------
    protected UniqueInfo cpui() { return hpcpui(columnInuId()); }
    public boolean hasPrimaryKey() { return true; }
    public boolean hasCompoundPrimaryKey() { return false; }

    // ===================================================================================
    //                                                                       Relation Info
    //                                                                       =============
    // cannot cache because it uses related DB meta instance while booting
    // (instead, cached by super's collection)
    // -----------------------------------------------------
    //                                      Foreign Property
    //                                      ----------------

    // -----------------------------------------------------
    //                                     Referrer Property
    //                                     -----------------

    // ===================================================================================
    //                                                                        Various Info
    //                                                                        ============

    // ===================================================================================
    //                                                                           Type Name
    //                                                                           =========
    public String getEntityTypeName() { return "com.mssoftech.dbflute.exentity.VendorInheritInu"; }
    public String getConditionBeanTypeName() { return "com.mssoftech.dbflute.cbean.VendorInheritInuCB"; }
    public String getBehaviorTypeName() { return "com.mssoftech.dbflute.exbhv.VendorInheritInuBhv"; }

    // ===================================================================================
    //                                                                         Object Type
    //                                                                         ===========
    public Class<VendorInheritInu> getEntityType() { return VendorInheritInu.class; }

    // ===================================================================================
    //                                                                     Object Instance
    //                                                                     ===============
    public VendorInheritInu newEntity() { return new VendorInheritInu(); }

    // ===================================================================================
    //                                                                   Map Communication
    //                                                                   =================
    public void acceptPrimaryKeyMap(Entity et, Map<String, ? extends Object> mp)
    { doAcceptPrimaryKeyMap((VendorInheritInu)et, mp); }
    public void acceptAllColumnMap(Entity et, Map<String, ? extends Object> mp)
    { doAcceptAllColumnMap((VendorInheritInu)et, mp); }
    public Map<String, Object> extractPrimaryKeyMap(Entity et) { return doExtractPrimaryKeyMap(et); }
    public Map<String, Object> extractAllColumnMap(Entity et) { return doExtractAllColumnMap(et); }
}
