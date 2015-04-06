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
 * The DB meta of member_security. (Singleton)
 * @author DBFlute(AutoGenerator)
 */
public class MemberSecurityDbm extends AbstractDBMeta {

    // ===================================================================================
    //                                                                           Singleton
    //                                                                           =========
    private static final MemberSecurityDbm _instance = new MemberSecurityDbm();
    private MemberSecurityDbm() {}
    public static MemberSecurityDbm getInstance() { return _instance; }

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
        setupEpg(_epgMap, et -> ((MemberSecurity)et).getMemberId(), (et, vl) -> ((MemberSecurity)et).setMemberId(cti(vl)), "memberId");
        setupEpg(_epgMap, et -> ((MemberSecurity)et).getLoginPassword(), (et, vl) -> ((MemberSecurity)et).setLoginPassword((String)vl), "loginPassword");
        setupEpg(_epgMap, et -> ((MemberSecurity)et).getReminderQuestion(), (et, vl) -> ((MemberSecurity)et).setReminderQuestion((String)vl), "reminderQuestion");
        setupEpg(_epgMap, et -> ((MemberSecurity)et).getReminderAnswer(), (et, vl) -> ((MemberSecurity)et).setReminderAnswer((String)vl), "reminderAnswer");
        setupEpg(_epgMap, et -> ((MemberSecurity)et).getReminderUseCount(), (et, vl) -> ((MemberSecurity)et).setReminderUseCount(cti(vl)), "reminderUseCount");
        setupEpg(_epgMap, et -> ((MemberSecurity)et).getRegisterDatetime(), (et, vl) -> ((MemberSecurity)et).setRegisterDatetime(ctldt(vl)), "registerDatetime");
        setupEpg(_epgMap, et -> ((MemberSecurity)et).getRegisterProcess(), (et, vl) -> ((MemberSecurity)et).setRegisterProcess((String)vl), "registerProcess");
        setupEpg(_epgMap, et -> ((MemberSecurity)et).getRegisterUser(), (et, vl) -> ((MemberSecurity)et).setRegisterUser((String)vl), "registerUser");
        setupEpg(_epgMap, et -> ((MemberSecurity)et).getUpdateDatetime(), (et, vl) -> ((MemberSecurity)et).setUpdateDatetime(ctldt(vl)), "updateDatetime");
        setupEpg(_epgMap, et -> ((MemberSecurity)et).getUpdateProcess(), (et, vl) -> ((MemberSecurity)et).setUpdateProcess((String)vl), "updateProcess");
        setupEpg(_epgMap, et -> ((MemberSecurity)et).getUpdateUser(), (et, vl) -> ((MemberSecurity)et).setUpdateUser((String)vl), "updateUser");
        setupEpg(_epgMap, et -> ((MemberSecurity)et).getVersionNo(), (et, vl) -> ((MemberSecurity)et).setVersionNo(ctl(vl)), "versionNo");
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
        setupEfpg(_efpgMap, et -> ((MemberSecurity)et).getMember(), (et, vl) -> ((MemberSecurity)et).setMember((OptionalEntity<Member>)vl), "member");
    }
    public PropertyGateway findForeignPropertyGateway(String prop)
    { return doFindEfpg(_efpgMap, prop); }

    // ===================================================================================
    //                                                                          Table Info
    //                                                                          ==========
    protected final String _tableDbName = "member_security";
    protected final String _tableDispName = "member_security";
    protected final String _tablePropertyName = "memberSecurity";
    protected final TableSqlName _tableSqlName = new TableSqlName("member_security", _tableDbName);
    { _tableSqlName.xacceptFilter(DBFluteConfig.getInstance().getTableSqlNameFilter()); }
    public String getTableDbName() { return _tableDbName; }
    public String getTableDispName() { return _tableDispName; }
    public String getTablePropertyName() { return _tablePropertyName; }
    public TableSqlName getTableSqlName() { return _tableSqlName; }

    // ===================================================================================
    //                                                                         Column Info
    //                                                                         ===========
    protected final ColumnInfo _columnMemberId = cci("member_id", "member_id", null, null, Integer.class, "memberId", null, true, false, true, "int4", 10, 0, null, false, null, null, "member", null, null, false);
//"int64"
    protected final ColumnInfo _columnLoginPassword = cci("login_password", "login_password", null, null, String.class, "loginPassword", null, false, false, true, "varchar", 50, 0, null, false, null, null, null, null, null, false);
//"string"
    protected final ColumnInfo _columnReminderQuestion = cci("reminder_question", "reminder_question", null, null, String.class, "reminderQuestion", null, false, false, true, "varchar", 50, 0, null, false, null, null, null, null, null, false);
//"string"
    protected final ColumnInfo _columnReminderAnswer = cci("reminder_answer", "reminder_answer", null, null, String.class, "reminderAnswer", null, false, false, true, "varchar", 50, 0, null, false, null, null, null, null, null, false);
//"string"
    protected final ColumnInfo _columnReminderUseCount = cci("reminder_use_count", "reminder_use_count", null, null, Integer.class, "reminderUseCount", null, false, false, true, "int4", 10, 0, null, false, null, null, null, null, null, false);
//"int64"
    protected final ColumnInfo _columnRegisterDatetime = cci("register_datetime", "register_datetime", null, null, java.time.LocalDateTime.class, "registerDatetime", null, false, false, true, "timestamp", 26, 3, null, false, null, null, null, null, null, false);
//"df.Timestamp"
    protected final ColumnInfo _columnRegisterProcess = cci("register_process", "register_process", null, null, String.class, "registerProcess", null, false, false, true, "varchar", 200, 0, null, false, null, null, null, null, null, false);
//"string"
    protected final ColumnInfo _columnRegisterUser = cci("register_user", "register_user", null, null, String.class, "registerUser", null, false, false, true, "varchar", 200, 0, null, false, null, null, null, null, null, false);
//"string"
    protected final ColumnInfo _columnUpdateDatetime = cci("update_datetime", "update_datetime", null, null, java.time.LocalDateTime.class, "updateDatetime", null, false, false, true, "timestamp", 26, 3, null, false, null, null, null, null, null, false);
//"df.Timestamp"
    protected final ColumnInfo _columnUpdateProcess = cci("update_process", "update_process", null, null, String.class, "updateProcess", null, false, false, true, "varchar", 200, 0, null, false, null, null, null, null, null, false);
//"string"
    protected final ColumnInfo _columnUpdateUser = cci("update_user", "update_user", null, null, String.class, "updateUser", null, false, false, true, "varchar", 200, 0, null, false, null, null, null, null, null, false);
//"string"
    protected final ColumnInfo _columnVersionNo = cci("version_no", "version_no", null, null, Long.class, "versionNo", null, false, false, true, "int8", 19, 0, null, false, OptimisticLockType.VERSION_NO, null, null, null, null, false);
//"int64"

    /**
     * member_id: {PK, NotNull, int4(10), FK to member}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnMemberId() { return _columnMemberId; }
    /**
     * login_password: {NotNull, varchar(50)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnLoginPassword() { return _columnLoginPassword; }
    /**
     * reminder_question: {NotNull, varchar(50)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnReminderQuestion() { return _columnReminderQuestion; }
    /**
     * reminder_answer: {NotNull, varchar(50)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnReminderAnswer() { return _columnReminderAnswer; }
    /**
     * reminder_use_count: {NotNull, int4(10)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnReminderUseCount() { return _columnReminderUseCount; }
    /**
     * register_datetime: {NotNull, timestamp(26, 3)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnRegisterDatetime() { return _columnRegisterDatetime; }
    /**
     * register_process: {NotNull, varchar(200)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnRegisterProcess() { return _columnRegisterProcess; }
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
     * update_process: {NotNull, varchar(200)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnUpdateProcess() { return _columnUpdateProcess; }
    /**
     * update_user: {NotNull, varchar(200)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnUpdateUser() { return _columnUpdateUser; }
    /**
     * version_no: {NotNull, int8(19)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnVersionNo() { return _columnVersionNo; }

    protected List<ColumnInfo> ccil() {
        List<ColumnInfo> ls = newArrayList();
        ls.add(columnMemberId());
        ls.add(columnLoginPassword());
        ls.add(columnReminderQuestion());
        ls.add(columnReminderAnswer());
        ls.add(columnReminderUseCount());
        ls.add(columnRegisterDatetime());
        ls.add(columnRegisterProcess());
        ls.add(columnRegisterUser());
        ls.add(columnUpdateDatetime());
        ls.add(columnUpdateProcess());
        ls.add(columnUpdateUser());
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
    protected UniqueInfo cpui() { return hpcpui(columnMemberId()); }
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
     * member by my member_id, named 'member'.
     * @return The information object of foreign property. (NotNull)
     */
    public ForeignInfo foreignMember() {
        Map<ColumnInfo, ColumnInfo> mp = newLinkedHashMap(columnMemberId(), MemberDbm.getInstance().columnMemberId());
        return cfi("fk_member_sc_info_member", "member", this, MemberDbm.getInstance(), mp, 0, org.dbflute.optional.OptionalEntity.class, true, false, false, false, null, null, false, "memberSecurityAsOne", false);
    }

    // -----------------------------------------------------
    //                                     Referrer Property
    //                                     -----------------

    // ===================================================================================
    //                                                                        Various Info
    //                                                                        ============
    public boolean hasVersionNo() { return true; }
    public ColumnInfo getVersionNoColumnInfo() { return _columnVersionNo; }

    // ===================================================================================
    //                                                                           Type Name
    //                                                                           =========
    public String getEntityTypeName() { return "com.mssoftech.dbflute.exentity.MemberSecurity"; }
    public String getConditionBeanTypeName() { return "com.mssoftech.dbflute.cbean.MemberSecurityCB"; }
    public String getBehaviorTypeName() { return "com.mssoftech.dbflute.exbhv.MemberSecurityBhv"; }

    // ===================================================================================
    //                                                                         Object Type
    //                                                                         ===========
    public Class<MemberSecurity> getEntityType() { return MemberSecurity.class; }

    // ===================================================================================
    //                                                                     Object Instance
    //                                                                     ===============
    public MemberSecurity newEntity() { return new MemberSecurity(); }

    // ===================================================================================
    //                                                                   Map Communication
    //                                                                   =================
    public void acceptPrimaryKeyMap(Entity et, Map<String, ? extends Object> mp)
    { doAcceptPrimaryKeyMap((MemberSecurity)et, mp); }
    public void acceptAllColumnMap(Entity et, Map<String, ? extends Object> mp)
    { doAcceptAllColumnMap((MemberSecurity)et, mp); }
    public Map<String, Object> extractPrimaryKeyMap(Entity et) { return doExtractPrimaryKeyMap(et); }
    public Map<String, Object> extractAllColumnMap(Entity et) { return doExtractAllColumnMap(et); }
}
