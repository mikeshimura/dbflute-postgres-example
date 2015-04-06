package com.mssoftech.dbflute.bsentity.dbmeta;

import java.util.List;
import java.util.Map;

import org.dbflute.Entity;
import org.dbflute.optional.OptionalEntity;
import org.dbflute.dbmeta.AbstractDBMeta;
import org.dbflute.dbmeta.info.*;
import org.dbflute.dbmeta.name.*;
import org.dbflute.dbmeta.property.PropertyGateway;
import org.dbflute.dbway.DBDef;
import com.mssoftech.dbflute.allcommon.*;
import com.mssoftech.dbflute.exentity.*;

/**
 * The DB meta of purchase_payment. (Singleton)
 * @author DBFlute(AutoGenerator)
 */
public class PurchasePaymentDbm extends AbstractDBMeta {

    // ===================================================================================
    //                                                                           Singleton
    //                                                                           =========
    private static final PurchasePaymentDbm _instance = new PurchasePaymentDbm();
    private PurchasePaymentDbm() {}
    public static PurchasePaymentDbm getInstance() { return _instance; }

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
        setupEpg(_epgMap, et -> ((PurchasePayment)et).getPurchasePaymentId(), (et, vl) -> ((PurchasePayment)et).setPurchasePaymentId(ctl(vl)), "purchasePaymentId");
        setupEpg(_epgMap, et -> ((PurchasePayment)et).getPurchaseId(), (et, vl) -> ((PurchasePayment)et).setPurchaseId(ctl(vl)), "purchaseId");
        setupEpg(_epgMap, et -> ((PurchasePayment)et).getPaymentAmount(), (et, vl) -> ((PurchasePayment)et).setPaymentAmount(ctb(vl)), "paymentAmount");
        setupEpg(_epgMap, et -> ((PurchasePayment)et).getPaymentDatetime(), (et, vl) -> ((PurchasePayment)et).setPaymentDatetime(ctldt(vl)), "paymentDatetime");
        setupEpg(_epgMap, et -> ((PurchasePayment)et).getPaymentMethodCode(), (et, vl) -> ((PurchasePayment)et).setPaymentMethodCode((String)vl), "paymentMethodCode");
        setupEpg(_epgMap, et -> ((PurchasePayment)et).getRegisterDatetime(), (et, vl) -> ((PurchasePayment)et).setRegisterDatetime(ctldt(vl)), "registerDatetime");
        setupEpg(_epgMap, et -> ((PurchasePayment)et).getRegisterUser(), (et, vl) -> ((PurchasePayment)et).setRegisterUser((String)vl), "registerUser");
        setupEpg(_epgMap, et -> ((PurchasePayment)et).getUpdateDatetime(), (et, vl) -> ((PurchasePayment)et).setUpdateDatetime(ctldt(vl)), "updateDatetime");
        setupEpg(_epgMap, et -> ((PurchasePayment)et).getUpdateUser(), (et, vl) -> ((PurchasePayment)et).setUpdateUser((String)vl), "updateUser");
    }
    public PropertyGateway findPropertyGateway(String prop)
    { return doFindEpg(_epgMap, prop); }

    // -----------------------------------------------------
    //                                      Foreign Property
    //                                      ----------------
    protected final Map<String, PropertyGateway> _efpgMap = newHashMap();
    { xsetupEfpg(); }
    @SuppressWarnings("unchecked")
    protected void xsetupEfpg() {
        setupEfpg(_efpgMap, et -> ((PurchasePayment)et).getPurchase(), (et, vl) -> ((PurchasePayment)et).setPurchase((OptionalEntity<Purchase>)vl), "purchase");
    }
    public PropertyGateway findForeignPropertyGateway(String prop)
    { return doFindEfpg(_efpgMap, prop); }

    // ===================================================================================
    //                                                                          Table Info
    //                                                                          ==========
    protected final String _tableDbName = "purchase_payment";
    protected final String _tableDispName = "purchase_payment";
    protected final String _tablePropertyName = "purchasePayment";
    protected final TableSqlName _tableSqlName = new TableSqlName("purchase_payment", _tableDbName);
    { _tableSqlName.xacceptFilter(DBFluteConfig.getInstance().getTableSqlNameFilter()); }
    public String getTableDbName() { return _tableDbName; }
    public String getTableDispName() { return _tableDispName; }
    public String getTablePropertyName() { return _tablePropertyName; }
    public TableSqlName getTableSqlName() { return _tableSqlName; }

    // ===================================================================================
    //                                                                         Column Info
    //                                                                         ===========
    protected final ColumnInfo _columnPurchasePaymentId = cci("purchase_payment_id", "purchase_payment_id", null, null, Long.class, "purchasePaymentId", null, true, true, true, "bigserial", 19, 0, "nextval('purchase_payment_purchase_payment_id_seq'::regclass)", false, null, null, null, null, null, false);
//"int64"
    protected final ColumnInfo _columnPurchaseId = cci("purchase_id", "purchase_id", null, null, Long.class, "purchaseId", null, false, false, true, "int8", 19, 0, null, false, null, null, "purchase", null, null, false);
//"int64"
    protected final ColumnInfo _columnPaymentAmount = cci("payment_amount", "payment_amount", null, null, java.math.BigDecimal.class, "paymentAmount", null, false, false, true, "numeric", 10, 2, null, false, null, null, null, null, null, false);
//"df.Numeric"
    protected final ColumnInfo _columnPaymentDatetime = cci("payment_datetime", "payment_datetime", null, null, java.time.LocalDateTime.class, "paymentDatetime", null, false, false, true, "timestamp", 26, 3, null, false, null, null, null, null, null, false);
//"df.Timestamp"
    protected final ColumnInfo _columnPaymentMethodCode = cci("payment_method_code", "payment_method_code", null, null, String.class, "paymentMethodCode", null, false, false, true, "bpchar", 3, 0, null, false, null, null, null, null, null, false);
//"string"
    protected final ColumnInfo _columnRegisterDatetime = cci("register_datetime", "register_datetime", null, null, java.time.LocalDateTime.class, "registerDatetime", null, false, false, true, "timestamp", 26, 3, null, false, null, null, null, null, null, false);
//"df.Timestamp"
    protected final ColumnInfo _columnRegisterUser = cci("register_user", "register_user", null, null, String.class, "registerUser", null, false, false, true, "varchar", 200, 0, null, false, null, null, null, null, null, false);
//"string"
    protected final ColumnInfo _columnUpdateDatetime = cci("update_datetime", "update_datetime", null, null, java.time.LocalDateTime.class, "updateDatetime", null, false, false, true, "timestamp", 26, 3, null, false, null, null, null, null, null, false);
//"df.Timestamp"
    protected final ColumnInfo _columnUpdateUser = cci("update_user", "update_user", null, null, String.class, "updateUser", null, false, false, true, "varchar", 200, 0, null, false, null, null, null, null, null, false);
//"string"

    /**
     * purchase_payment_id: {PK, ID, NotNull, bigserial(19)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnPurchasePaymentId() { return _columnPurchasePaymentId; }
    /**
     * purchase_id: {NotNull, int8(19), FK to purchase}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnPurchaseId() { return _columnPurchaseId; }
    /**
     * payment_amount: {NotNull, numeric(10, 2)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnPaymentAmount() { return _columnPaymentAmount; }
    /**
     * payment_datetime: {IX+, NotNull, timestamp(26, 3)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnPaymentDatetime() { return _columnPaymentDatetime; }
    /**
     * payment_method_code: {NotNull, bpchar(3)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnPaymentMethodCode() { return _columnPaymentMethodCode; }
    /**
     * register_datetime: {NotNull, timestamp(26, 3)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnRegisterDatetime() { return _columnRegisterDatetime; }
    /**
     * register_user: {NotNull, varchar(200)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnRegisterUser() { return _columnRegisterUser; }
    /**
     * update_datetime: {NotNull, timestamp(26, 3)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnUpdateDatetime() { return _columnUpdateDatetime; }
    /**
     * update_user: {NotNull, varchar(200)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnUpdateUser() { return _columnUpdateUser; }

    protected List<ColumnInfo> ccil() {
        List<ColumnInfo> ls = newArrayList();
        ls.add(columnPurchasePaymentId());
        ls.add(columnPurchaseId());
        ls.add(columnPaymentAmount());
        ls.add(columnPaymentDatetime());
        ls.add(columnPaymentMethodCode());
        ls.add(columnRegisterDatetime());
        ls.add(columnRegisterUser());
        ls.add(columnUpdateDatetime());
        ls.add(columnUpdateUser());
        return ls;
    }

    { initializeInformationResource(); }

    // ===================================================================================
    //                                                                         Unique Info
    //                                                                         ===========
    // -----------------------------------------------------
    //                                       Primary Element
    //                                       ---------------
    protected UniqueInfo cpui() { return hpcpui(columnPurchasePaymentId()); }
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
    /**
     * purchase by my purchase_id, named 'purchase'.
     * @return The information object of foreign property. (NotNull)
     */
    public ForeignInfo foreignPurchase() {
        Map<ColumnInfo, ColumnInfo> mp = newLinkedHashMap(columnPurchaseId(), PurchaseDbm.getInstance().columnPurchaseId());
        return cfi("fk_purchase_payment_purchase", "purchase", this, PurchaseDbm.getInstance(), mp, 0, org.dbflute.optional.OptionalEntity.class, false, false, false, false, null, null, false, "purchasePaymentList", false);
    }

    // -----------------------------------------------------
    //                                     Referrer Property
    //                                     -----------------

    // ===================================================================================
    //                                                                        Various Info
    //                                                                        ============
    public boolean hasSequence() { return true; }
    public String getSequenceName() { return "purchase_payment_purchase_payment_id_seq"; }
    public Integer getSequenceIncrementSize() { return 1; }
    public Integer getSequenceCacheSize() { return null; }

    // ===================================================================================
    //                                                                           Type Name
    //                                                                           =========
    public String getEntityTypeName() { return "com.mssoftech.dbflute.exentity.PurchasePayment"; }
    public String getConditionBeanTypeName() { return "com.mssoftech.dbflute.cbean.PurchasePaymentCB"; }
    public String getBehaviorTypeName() { return "com.mssoftech.dbflute.exbhv.PurchasePaymentBhv"; }

    // ===================================================================================
    //                                                                         Object Type
    //                                                                         ===========
    public Class<PurchasePayment> getEntityType() { return PurchasePayment.class; }

    // ===================================================================================
    //                                                                     Object Instance
    //                                                                     ===============
    public PurchasePayment newEntity() { return new PurchasePayment(); }

    // ===================================================================================
    //                                                                   Map Communication
    //                                                                   =================
    public void acceptPrimaryKeyMap(Entity et, Map<String, ? extends Object> mp)
    { doAcceptPrimaryKeyMap((PurchasePayment)et, mp); }
    public void acceptAllColumnMap(Entity et, Map<String, ? extends Object> mp)
    { doAcceptAllColumnMap((PurchasePayment)et, mp); }
    public Map<String, Object> extractPrimaryKeyMap(Entity et) { return doExtractPrimaryKeyMap(et); }
    public Map<String, Object> extractAllColumnMap(Entity et) { return doExtractAllColumnMap(et); }
}
