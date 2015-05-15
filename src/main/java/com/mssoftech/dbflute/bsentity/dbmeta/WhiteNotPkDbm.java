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
 * The DB meta of white_not_pk. (Singleton)
 * @author DBFlute(AutoGenerator)
 */
public class WhiteNotPkDbm extends AbstractDBMeta {

    // ===================================================================================
    //                                                                           Singleton
    //                                                                           =========
    private static final WhiteNotPkDbm _instance = new WhiteNotPkDbm();
    private WhiteNotPkDbm() {}
    public static WhiteNotPkDbm getInstance() { return _instance; }

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
        setupEpg(_epgMap, et -> ((WhiteNotPk)et).getNotPkId(), (et, vl) -> ((WhiteNotPk)et).setNotPkId(ctl(vl)), "notPkId");
        setupEpg(_epgMap, et -> ((WhiteNotPk)et).getNotPkName(), (et, vl) -> ((WhiteNotPk)et).setNotPkName((String)vl), "notPkName");
        setupEpg(_epgMap, et -> ((WhiteNotPk)et).getNotPkInteger(), (et, vl) -> ((WhiteNotPk)et).setNotPkInteger(cti(vl)), "notPkInteger");
    }
    public PropertyGateway findPropertyGateway(String prop)
    { return doFindEpg(_epgMap, prop); }

    // ===================================================================================
    //                                                                          Table Info
    //                                                                          ==========
    protected final String _tableDbName = "white_not_pk";
    protected final String _tableDispName = "white_not_pk";
    protected final String _tablePropertyName = "whiteNotPk";
    protected final TableSqlName _tableSqlName = new TableSqlName("white_not_pk", _tableDbName);
    { _tableSqlName.xacceptFilter(DBFluteConfig.getInstance().getTableSqlNameFilter()); }
    public String getTableDbName() { return _tableDbName; }
    public String getTableDispName() { return _tableDispName; }
    public String getTablePropertyName() { return _tablePropertyName; }
    public TableSqlName getTableSqlName() { return _tableSqlName; }

    // ===================================================================================
    //                                                                         Column Info
    //                                                                         ===========
    protected final ColumnInfo _columnNotPkId = cci("not_pk_id", "not_pk_id", null, null, Long.class, "notPkId", null, false, false, true, "int8", 19, 0, null, false, null, null, null, null, null, false);
//"int64"
    protected final ColumnInfo _columnNotPkName = cci("not_pk_name", "not_pk_name", null, null, String.class, "notPkName", null, false, false, false, "varchar", 2147483647, 0, null, false, null, null, null, null, null, false);
//"sql.NullString"
    protected final ColumnInfo _columnNotPkInteger = cci("not_pk_integer", "not_pk_integer", null, null, Integer.class, "notPkInteger", null, false, false, false, "int4", 10, 0, null, false, null, null, null, null, null, false);
//"sql.NullInt64"

    /**
     * not_pk_id: {NotNull, int8(19)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnNotPkId() { return _columnNotPkId; }
    /**
     * not_pk_name: {varchar(2147483647)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnNotPkName() { return _columnNotPkName; }
    /**
     * not_pk_integer: {int4(10)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnNotPkInteger() { return _columnNotPkInteger; }

    protected List<ColumnInfo> ccil() {
        List<ColumnInfo> ls = newArrayList();
        ls.add(columnNotPkId());
        ls.add(columnNotPkName());
        ls.add(columnNotPkInteger());
        return ls;
    }

    { initializeInformationResource(); }

    // ===================================================================================
    //                                                                         Unique Info
    //                                                                         ===========
    // -----------------------------------------------------
    //                                       Primary Element
    //                                       ---------------
    protected UniqueInfo cpui() {
        throw new UnsupportedOperationException("The table does not have primary key: " + getTableDbName());
    }
    public boolean hasPrimaryKey() { return false; }
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
    public String getEntityTypeName() { return "com.mssoftech.dbflute.exentity.WhiteNotPk"; }
    public String getConditionBeanTypeName() { return "com.mssoftech.dbflute.cbean.WhiteNotPkCB"; }
    public String getBehaviorTypeName() { return "com.mssoftech.dbflute.exbhv.WhiteNotPkBhv"; }

    // ===================================================================================
    //                                                                         Object Type
    //                                                                         ===========
    public Class<WhiteNotPk> getEntityType() { return WhiteNotPk.class; }

    // ===================================================================================
    //                                                                     Object Instance
    //                                                                     ===============
    public WhiteNotPk newEntity() { return new WhiteNotPk(); }

    // ===================================================================================
    //                                                                   Map Communication
    //                                                                   =================
    public void acceptPrimaryKeyMap(Entity et, Map<String, ? extends Object> mp)
    { doAcceptPrimaryKeyMap((WhiteNotPk)et, mp); }
    public void acceptAllColumnMap(Entity et, Map<String, ? extends Object> mp)
    { doAcceptAllColumnMap((WhiteNotPk)et, mp); }
    public Map<String, Object> extractPrimaryKeyMap(Entity et) { return doExtractPrimaryKeyMap(et); }
    public Map<String, Object> extractAllColumnMap(Entity et) { return doExtractAllColumnMap(et); }
}
