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
 * The DB meta of product. (Singleton)
 * @author DBFlute(AutoGenerator)
 */
public class ProductDbm extends AbstractDBMeta {

    // ===================================================================================
    //                                                                           Singleton
    //                                                                           =========
    private static final ProductDbm _instance = new ProductDbm();
    private ProductDbm() {}
    public static ProductDbm getInstance() { return _instance; }

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
        setupEpg(_epgMap, et -> ((Product)et).getProductId(), (et, vl) -> ((Product)et).setProductId(cti(vl)), "productId");
        setupEpg(_epgMap, et -> ((Product)et).getProductName(), (et, vl) -> ((Product)et).setProductName((String)vl), "productName");
        setupEpg(_epgMap, et -> ((Product)et).getProductHandleCode(), (et, vl) -> ((Product)et).setProductHandleCode((String)vl), "productHandleCode");
        setupEpg(_epgMap, et -> ((Product)et).getProductCategoryCode(), (et, vl) -> ((Product)et).setProductCategoryCode((String)vl), "productCategoryCode");
        setupEpg(_epgMap, et -> ((Product)et).getProductStatusCode(), (et, vl) -> ((Product)et).setProductStatusCode((String)vl), "productStatusCode");
        setupEpg(_epgMap, et -> ((Product)et).getRegularPrice(), (et, vl) -> ((Product)et).setRegularPrice(cti(vl)), "regularPrice");
        setupEpg(_epgMap, et -> ((Product)et).getRegisterDatetime(), (et, vl) -> ((Product)et).setRegisterDatetime(ctldt(vl)), "registerDatetime");
        setupEpg(_epgMap, et -> ((Product)et).getRegisterUser(), (et, vl) -> ((Product)et).setRegisterUser((String)vl), "registerUser");
        setupEpg(_epgMap, et -> ((Product)et).getRegisterProcess(), (et, vl) -> ((Product)et).setRegisterProcess((String)vl), "registerProcess");
        setupEpg(_epgMap, et -> ((Product)et).getUpdateDatetime(), (et, vl) -> ((Product)et).setUpdateDatetime(ctldt(vl)), "updateDatetime");
        setupEpg(_epgMap, et -> ((Product)et).getUpdateUser(), (et, vl) -> ((Product)et).setUpdateUser((String)vl), "updateUser");
        setupEpg(_epgMap, et -> ((Product)et).getUpdateProcess(), (et, vl) -> ((Product)et).setUpdateProcess((String)vl), "updateProcess");
        setupEpg(_epgMap, et -> ((Product)et).getVersionNo(), (et, vl) -> ((Product)et).setVersionNo(ctl(vl)), "versionNo");
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
        setupEfpg(_efpgMap, et -> ((Product)et).getProductCategory(), (et, vl) -> ((Product)et).setProductCategory((OptionalEntity<ProductCategory>)vl), "productCategory");
        setupEfpg(_efpgMap, et -> ((Product)et).getProductStatus(), (et, vl) -> ((Product)et).setProductStatus((OptionalEntity<ProductStatus>)vl), "productStatus");
    }
    public PropertyGateway findForeignPropertyGateway(String prop)
    { return doFindEfpg(_efpgMap, prop); }

    // ===================================================================================
    //                                                                          Table Info
    //                                                                          ==========
    protected final String _tableDbName = "product";
    protected final String _tableDispName = "product";
    protected final String _tablePropertyName = "product";
    protected final TableSqlName _tableSqlName = new TableSqlName("product", _tableDbName);
    { _tableSqlName.xacceptFilter(DBFluteConfig.getInstance().getTableSqlNameFilter()); }
    public String getTableDbName() { return _tableDbName; }
    public String getTableDispName() { return _tableDispName; }
    public String getTablePropertyName() { return _tablePropertyName; }
    public TableSqlName getTableSqlName() { return _tableSqlName; }

    // ===================================================================================
    //                                                                         Column Info
    //                                                                         ===========
    protected final ColumnInfo _columnProductId = cci("product_id", "product_id", null, null, Integer.class, "productId", null, true, true, true, "serial", 10, 0, "nextval('product_product_id_seq'::regclass)", false, null, null, null, "purchaseList", null, false);
//"int64"
    protected final ColumnInfo _columnProductName = cci("product_name", "product_name", null, null, String.class, "productName", null, false, false, true, "varchar", 50, 0, null, false, null, null, null, null, null, false);
//"string"
    protected final ColumnInfo _columnProductHandleCode = cci("product_handle_code", "product_handle_code", null, null, String.class, "productHandleCode", null, false, false, true, "varchar", 100, 0, null, false, null, null, null, null, null, false);
//"string"
    protected final ColumnInfo _columnProductCategoryCode = cci("product_category_code", "product_category_code", null, null, String.class, "productCategoryCode", null, false, false, true, "bpchar", 3, 0, null, false, null, null, "productCategory", null, null, false);
//"string"
    protected final ColumnInfo _columnProductStatusCode = cci("product_status_code", "product_status_code", null, null, String.class, "productStatusCode", null, false, false, true, "bpchar", 3, 0, null, false, null, null, "productStatus", null, null, false);
//"string"
    protected final ColumnInfo _columnRegularPrice = cci("regular_price", "regular_price", null, null, Integer.class, "regularPrice", null, false, false, true, "int4", 10, 0, null, false, null, null, null, null, null, false);
//"int64"
    protected final ColumnInfo _columnRegisterDatetime = cci("register_datetime", "register_datetime", null, null, java.time.LocalDateTime.class, "registerDatetime", null, false, false, true, "timestamp", 26, 3, null, false, null, null, null, null, null, false);
//"df.Timestamp"
    protected final ColumnInfo _columnRegisterUser = cci("register_user", "register_user", null, null, String.class, "registerUser", null, false, false, true, "varchar", 200, 0, null, false, null, null, null, null, null, false);
//"string"
    protected final ColumnInfo _columnRegisterProcess = cci("register_process", "register_process", null, null, String.class, "registerProcess", null, false, false, true, "varchar", 200, 0, null, false, null, null, null, null, null, false);
//"string"
    protected final ColumnInfo _columnUpdateDatetime = cci("update_datetime", "update_datetime", null, null, java.time.LocalDateTime.class, "updateDatetime", null, false, false, true, "timestamp", 26, 3, null, false, null, null, null, null, null, false);
//"df.Timestamp"
    protected final ColumnInfo _columnUpdateUser = cci("update_user", "update_user", null, null, String.class, "updateUser", null, false, false, true, "varchar", 200, 0, null, false, null, null, null, null, null, false);
//"string"
    protected final ColumnInfo _columnUpdateProcess = cci("update_process", "update_process", null, null, String.class, "updateProcess", null, false, false, true, "varchar", 200, 0, null, false, null, null, null, null, null, false);
//"string"
    protected final ColumnInfo _columnVersionNo = cci("version_no", "version_no", null, null, Long.class, "versionNo", null, false, false, true, "int8", 19, 0, null, false, OptimisticLockType.VERSION_NO, null, null, null, null, false);
//"int64"

    /**
     * product_id: {PK, ID, NotNull, serial(10)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnProductId() { return _columnProductId; }
    /**
     * product_name: {IX, NotNull, varchar(50)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnProductName() { return _columnProductName; }
    /**
     * product_handle_code: {UQ, NotNull, varchar(100)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnProductHandleCode() { return _columnProductHandleCode; }
    /**
     * product_category_code: {NotNull, bpchar(3), FK to product_category}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnProductCategoryCode() { return _columnProductCategoryCode; }
    /**
     * product_status_code: {NotNull, bpchar(3), FK to product_status}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnProductStatusCode() { return _columnProductStatusCode; }
    /**
     * regular_price: {NotNull, int4(10)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnRegularPrice() { return _columnRegularPrice; }
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
     * register_process: {NotNull, varchar(200)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnRegisterProcess() { return _columnRegisterProcess; }
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
    /**
     * update_process: {NotNull, varchar(200)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnUpdateProcess() { return _columnUpdateProcess; }
    /**
     * version_no: {NotNull, int8(19)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnVersionNo() { return _columnVersionNo; }

    protected List<ColumnInfo> ccil() {
        List<ColumnInfo> ls = newArrayList();
        ls.add(columnProductId());
        ls.add(columnProductName());
        ls.add(columnProductHandleCode());
        ls.add(columnProductCategoryCode());
        ls.add(columnProductStatusCode());
        ls.add(columnRegularPrice());
        ls.add(columnRegisterDatetime());
        ls.add(columnRegisterUser());
        ls.add(columnRegisterProcess());
        ls.add(columnUpdateDatetime());
        ls.add(columnUpdateUser());
        ls.add(columnUpdateProcess());
        ls.add(columnVersionNo());
        return ls;
    }

    { initializeInformationResource(); }

    // ===================================================================================
    //                                                                         Unique Info
    //                                                                         ===========
    // -----------------------------------------------------
    //                                       Primary Element
    //                                       ---------------
    protected UniqueInfo cpui() { return hpcpui(columnProductId()); }
    public boolean hasPrimaryKey() { return true; }
    public boolean hasCompoundPrimaryKey() { return false; }

    // -----------------------------------------------------
    //                                        Unique Element
    //                                        --------------
    public UniqueInfo uniqueOf() { return hpcui(columnProductHandleCode()); }

    // ===================================================================================
    //                                                                       Relation Info
    //                                                                       =============
    // cannot cache because it uses related DB meta instance while booting
    // (instead, cached by super's collection)
    // -----------------------------------------------------
    //                                      Foreign Property
    //                                      ----------------
    /**
     * product_category by my product_category_code, named 'productCategory'.
     * @return The information object of foreign property. (NotNull)
     */
    public ForeignInfo foreignProductCategory() {
        Map<ColumnInfo, ColumnInfo> mp = newLinkedHashMap(columnProductCategoryCode(), ProductCategoryDbm.getInstance().columnProductCategoryCode());
        return cfi("fk_product_product_category", "productCategory", this, ProductCategoryDbm.getInstance(), mp, 0, org.dbflute.optional.OptionalEntity.class, false, false, false, false, null, null, false, "productList", false);
    }
    /**
     * product_status by my product_status_code, named 'productStatus'.
     * @return The information object of foreign property. (NotNull)
     */
    public ForeignInfo foreignProductStatus() {
        Map<ColumnInfo, ColumnInfo> mp = newLinkedHashMap(columnProductStatusCode(), ProductStatusDbm.getInstance().columnProductStatusCode());
        return cfi("fk_product_product_status", "productStatus", this, ProductStatusDbm.getInstance(), mp, 1, org.dbflute.optional.OptionalEntity.class, false, false, false, false, null, null, false, "productList", false);
    }

    // -----------------------------------------------------
    //                                     Referrer Property
    //                                     -----------------
    /**
     * purchase by product_id, named 'purchaseList'.
     * @return The information object of referrer property. (NotNull)
     */
    public ReferrerInfo referrerPurchaseList() {
        Map<ColumnInfo, ColumnInfo> mp = newLinkedHashMap(columnProductId(), PurchaseDbm.getInstance().columnProductId());
        return cri("fk_purchase_product", "purchaseList", this, PurchaseDbm.getInstance(), mp, false, "product");
    }

    // ===================================================================================
    //                                                                        Various Info
    //                                                                        ============
    public boolean hasSequence() { return true; }
    public String getSequenceName() { return "product_product_id_seq"; }
    public Integer getSequenceIncrementSize() { return 1; }
    public Integer getSequenceCacheSize() { return null; }
    public boolean hasVersionNo() { return true; }
    public ColumnInfo getVersionNoColumnInfo() { return _columnVersionNo; }

    // ===================================================================================
    //                                                                           Type Name
    //                                                                           =========
    public String getEntityTypeName() { return "com.mssoftech.dbflute.exentity.Product"; }
    public String getConditionBeanTypeName() { return "com.mssoftech.dbflute.cbean.ProductCB"; }
    public String getBehaviorTypeName() { return "com.mssoftech.dbflute.exbhv.ProductBhv"; }

    // ===================================================================================
    //                                                                         Object Type
    //                                                                         ===========
    public Class<Product> getEntityType() { return Product.class; }

    // ===================================================================================
    //                                                                     Object Instance
    //                                                                     ===============
    public Product newEntity() { return new Product(); }

    // ===================================================================================
    //                                                                   Map Communication
    //                                                                   =================
    public void acceptPrimaryKeyMap(Entity et, Map<String, ? extends Object> mp)
    { doAcceptPrimaryKeyMap((Product)et, mp); }
    public void acceptAllColumnMap(Entity et, Map<String, ? extends Object> mp)
    { doAcceptAllColumnMap((Product)et, mp); }
    public Map<String, Object> extractPrimaryKeyMap(Entity et) { return doExtractPrimaryKeyMap(et); }
    public Map<String, Object> extractAllColumnMap(Entity et) { return doExtractAllColumnMap(et); }
}
