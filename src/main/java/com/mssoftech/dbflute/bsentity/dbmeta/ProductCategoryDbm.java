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
 * The DB meta of product_category. (Singleton)
 * @author DBFlute(AutoGenerator)
 */
public class ProductCategoryDbm extends AbstractDBMeta {

    // ===================================================================================
    //                                                                           Singleton
    //                                                                           =========
    private static final ProductCategoryDbm _instance = new ProductCategoryDbm();
    private ProductCategoryDbm() {}
    public static ProductCategoryDbm getInstance() { return _instance; }

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
        setupEpg(_epgMap, et -> ((ProductCategory)et).getProductCategoryCode(), (et, vl) -> ((ProductCategory)et).setProductCategoryCode((String)vl), "productCategoryCode");
        setupEpg(_epgMap, et -> ((ProductCategory)et).getProductCategoryName(), (et, vl) -> ((ProductCategory)et).setProductCategoryName((String)vl), "productCategoryName");
        setupEpg(_epgMap, et -> ((ProductCategory)et).getParentCategoryCode(), (et, vl) -> ((ProductCategory)et).setParentCategoryCode((String)vl), "parentCategoryCode");
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
        setupEfpg(_efpgMap, et -> ((ProductCategory)et).getProductCategorySelf(), (et, vl) -> ((ProductCategory)et).setProductCategorySelf((OptionalEntity<ProductCategory>)vl), "productCategorySelf");
    }
    public PropertyGateway findForeignPropertyGateway(String prop)
    { return doFindEfpg(_efpgMap, prop); }

    // ===================================================================================
    //                                                                          Table Info
    //                                                                          ==========
    protected final String _tableDbName = "product_category";
    protected final String _tableDispName = "product_category";
    protected final String _tablePropertyName = "productCategory";
    protected final TableSqlName _tableSqlName = new TableSqlName("product_category", _tableDbName);
    { _tableSqlName.xacceptFilter(DBFluteConfig.getInstance().getTableSqlNameFilter()); }
    public String getTableDbName() { return _tableDbName; }
    public String getTableDispName() { return _tableDispName; }
    public String getTablePropertyName() { return _tablePropertyName; }
    public TableSqlName getTableSqlName() { return _tableSqlName; }

    // ===================================================================================
    //                                                                         Column Info
    //                                                                         ===========
    protected final ColumnInfo _columnProductCategoryCode = cci("product_category_code", "product_category_code", null, null, String.class, "productCategoryCode", null, true, false, true, "bpchar", 3, 0, null, false, null, null, null, "productList,productCategorySelfList", null, false);
//"string"
    protected final ColumnInfo _columnProductCategoryName = cci("product_category_name", "product_category_name", null, null, String.class, "productCategoryName", null, false, false, true, "varchar", 50, 0, null, false, null, null, null, null, null, false);
//"string"
    protected final ColumnInfo _columnParentCategoryCode = cci("parent_category_code", "parent_category_code", null, null, String.class, "parentCategoryCode", null, false, false, false, "bpchar", 3, 0, null, false, null, null, "productCategorySelf", null, null, false);
//"df.NullString"

    /**
     * product_category_code: {PK, NotNull, bpchar(3)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnProductCategoryCode() { return _columnProductCategoryCode; }
    /**
     * product_category_name: {NotNull, varchar(50)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnProductCategoryName() { return _columnProductCategoryName; }
    /**
     * parent_category_code: {bpchar(3), FK to product_category}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnParentCategoryCode() { return _columnParentCategoryCode; }

    protected List<ColumnInfo> ccil() {
        List<ColumnInfo> ls = newArrayList();
        ls.add(columnProductCategoryCode());
        ls.add(columnProductCategoryName());
        ls.add(columnParentCategoryCode());
        return ls;
    }

    { initializeInformationResource(); }

    // ===================================================================================
    //                                                                         Unique Info
    //                                                                         ===========
    // -----------------------------------------------------
    //                                       Primary Element
    //                                       ---------------
    protected UniqueInfo cpui() { return hpcpui(columnProductCategoryCode()); }
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
     * product_category by my parent_category_code, named 'productCategorySelf'.
     * @return The information object of foreign property. (NotNull)
     */
    public ForeignInfo foreignProductCategorySelf() {
        Map<ColumnInfo, ColumnInfo> mp = newLinkedHashMap(columnParentCategoryCode(), ProductCategoryDbm.getInstance().columnProductCategoryCode());
        return cfi("fk_product_category_parent", "productCategorySelf", this, ProductCategoryDbm.getInstance(), mp, 0, org.dbflute.optional.OptionalEntity.class, false, false, false, false, null, null, false, "productCategorySelfList", false);
    }

    // -----------------------------------------------------
    //                                     Referrer Property
    //                                     -----------------
    /**
     * product by product_category_code, named 'productList'.
     * @return The information object of referrer property. (NotNull)
     */
    public ReferrerInfo referrerProductList() {
        Map<ColumnInfo, ColumnInfo> mp = newLinkedHashMap(columnProductCategoryCode(), ProductDbm.getInstance().columnProductCategoryCode());
        return cri("fk_product_product_category", "productList", this, ProductDbm.getInstance(), mp, false, "productCategory");
    }
    /**
     * product_category by parent_category_code, named 'productCategorySelfList'.
     * @return The information object of referrer property. (NotNull)
     */
    public ReferrerInfo referrerProductCategorySelfList() {
        Map<ColumnInfo, ColumnInfo> mp = newLinkedHashMap(columnProductCategoryCode(), ProductCategoryDbm.getInstance().columnParentCategoryCode());
        return cri("fk_product_category_parent", "productCategorySelfList", this, ProductCategoryDbm.getInstance(), mp, false, "productCategorySelf");
    }

    // ===================================================================================
    //                                                                        Various Info
    //                                                                        ============

    // ===================================================================================
    //                                                                           Type Name
    //                                                                           =========
    public String getEntityTypeName() { return "com.mssoftech.dbflute.exentity.ProductCategory"; }
    public String getConditionBeanTypeName() { return "com.mssoftech.dbflute.cbean.ProductCategoryCB"; }
    public String getBehaviorTypeName() { return "com.mssoftech.dbflute.exbhv.ProductCategoryBhv"; }

    // ===================================================================================
    //                                                                         Object Type
    //                                                                         ===========
    public Class<ProductCategory> getEntityType() { return ProductCategory.class; }

    // ===================================================================================
    //                                                                     Object Instance
    //                                                                     ===============
    public ProductCategory newEntity() { return new ProductCategory(); }

    // ===================================================================================
    //                                                                   Map Communication
    //                                                                   =================
    public void acceptPrimaryKeyMap(Entity et, Map<String, ? extends Object> mp)
    { doAcceptPrimaryKeyMap((ProductCategory)et, mp); }
    public void acceptAllColumnMap(Entity et, Map<String, ? extends Object> mp)
    { doAcceptAllColumnMap((ProductCategory)et, mp); }
    public Map<String, Object> extractPrimaryKeyMap(Entity et) { return doExtractPrimaryKeyMap(et); }
    public Map<String, Object> extractAllColumnMap(Entity et) { return doExtractAllColumnMap(et); }
}
