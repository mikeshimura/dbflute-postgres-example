package com.mssoftech.dbflute.bsentity;

import java.util.List;
import java.util.ArrayList;

import org.dbflute.Entity;
import org.dbflute.dbmeta.DBMeta;
import org.dbflute.dbmeta.AbstractEntity;
import org.dbflute.dbmeta.accessory.DomainEntity;
import org.dbflute.optional.OptionalEntity;
import com.mssoftech.dbflute.allcommon.DBMetaInstanceHandler;
import com.mssoftech.dbflute.exentity.*;

/**
 * The entity of member_security as TABLE. <br>
 * 会員セキュリティ情報: 会員とは one-to-one で、会員一人につき必ず一つのセキュリティ情報がある
 * <pre>
 * [primary-key]
 *     member_id
 * 
 * [column]
 *     member_id, login_password, reminder_question, reminder_answer, reminder_use_count, register_datetime, register_process, register_user, update_datetime, update_process, update_user, version_no
 * 
 * [sequence]
 *     
 * 
 * [identity]
 *     
 * 
 * [version-no]
 *     version_no
 * 
 * [foreign table]
 *     member
 * 
 * [referrer table]
 *     
 * 
 * [foreign property]
 *     member
 * 
 * [referrer property]
 *     
 * 
 * [get/set template]
 * /= = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = =
 * Integer memberId = entity.getMemberId();
 * String loginPassword = entity.getLoginPassword();
 * String reminderQuestion = entity.getReminderQuestion();
 * String reminderAnswer = entity.getReminderAnswer();
 * Integer reminderUseCount = entity.getReminderUseCount();
 * java.time.LocalDateTime registerDatetime = entity.getRegisterDatetime();
 * String registerProcess = entity.getRegisterProcess();
 * String registerUser = entity.getRegisterUser();
 * java.time.LocalDateTime updateDatetime = entity.getUpdateDatetime();
 * String updateProcess = entity.getUpdateProcess();
 * String updateUser = entity.getUpdateUser();
 * Long versionNo = entity.getVersionNo();
 * entity.setMemberId(memberId);
 * entity.setLoginPassword(loginPassword);
 * entity.setReminderQuestion(reminderQuestion);
 * entity.setReminderAnswer(reminderAnswer);
 * entity.setReminderUseCount(reminderUseCount);
 * entity.setRegisterDatetime(registerDatetime);
 * entity.setRegisterProcess(registerProcess);
 * entity.setRegisterUser(registerUser);
 * entity.setUpdateDatetime(updateDatetime);
 * entity.setUpdateProcess(updateProcess);
 * entity.setUpdateUser(updateUser);
 * entity.setVersionNo(versionNo);
 * = = = = = = = = = =/
 * </pre>
 * @author DBFlute(AutoGenerator)
 */
public abstract class BsMemberSecurity extends AbstractEntity implements DomainEntity {

    // ===================================================================================
    //                                                                          Definition
    //                                                                          ==========
    /** The serial version UID for object serialization. (Default) */
    private static final long serialVersionUID = 1L;

    // ===================================================================================
    //                                                                           Attribute
    //                                                                           =========
    /** member_id: {PK, NotNull, int4(10), FK to member} */
    protected Integer _memberId;

    /** login_password: {NotNull, varchar(50)} */
    protected String _loginPassword;

    /** reminder_question: {NotNull, varchar(50)} */
    protected String _reminderQuestion;

    /** reminder_answer: {NotNull, varchar(50)} */
    protected String _reminderAnswer;

    /** reminder_use_count: {NotNull, int4(10)} */
    protected Integer _reminderUseCount;

    /** register_datetime: {NotNull, timestamp(26, 3)} */
    protected java.time.LocalDateTime _registerDatetime;

    /** register_process: {NotNull, varchar(200)} */
    protected String _registerProcess;

    /** register_user: {NotNull, varchar(200)} */
    protected String _registerUser;

    /** update_datetime: {NotNull, timestamp(26, 3)} */
    protected java.time.LocalDateTime _updateDatetime;

    /** update_process: {NotNull, varchar(200)} */
    protected String _updateProcess;

    /** update_user: {NotNull, varchar(200)} */
    protected String _updateUser;

    /** version_no: {NotNull, int8(19)} */
    protected Long _versionNo;

    // ===================================================================================
    //                                                                             DB Meta
    //                                                                             =======
    /** {@inheritDoc} */
    public DBMeta asDBMeta() {
        return DBMetaInstanceHandler.findDBMeta(asTableDbName());
    }

    /** {@inheritDoc} */
    public String asTableDbName() {
        return "member_security";
    }

    // ===================================================================================
    //                                                                        Key Handling
    //                                                                        ============
    /** {@inheritDoc} */
    public boolean hasPrimaryKeyValue() {
        if (_memberId == null) { return false; }
        return true;
    }

    // ===================================================================================
    //                                                                    Foreign Property
    //                                                                    ================
    /** member by my member_id, named 'member'. */
    protected OptionalEntity<Member> _member;

    /**
     * [get] member by my member_id, named 'member'. <br>
     * Optional: alwaysPresent(), ifPresent().orElse(), get(), ...
     * @return The entity of foreign property 'member'. (NotNull, EmptyAllowed: when e.g. null FK column, no setupSelect)
     */
    public OptionalEntity<Member> getMember() {
        if (_member == null) { _member = OptionalEntity.relationEmpty(this, "member"); }
        return _member;
    }

    /**
     * [set] member by my member_id, named 'member'.
     * @param member The entity of foreign property 'member'. (NullAllowed)
     */
    public void setMember(OptionalEntity<Member> member) {
        _member = member;
    }

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
        if (obj instanceof BsMemberSecurity) {
            BsMemberSecurity other = (BsMemberSecurity)obj;
            if (!xSV(_memberId, other._memberId)) { return false; }
            return true;
        } else {
            return false;
        }
    }

    @Override
    protected int doHashCode(int initial) {
        int hs = initial;
        hs = xCH(hs, asTableDbName());
        hs = xCH(hs, _memberId);
        return hs;
    }

    @Override
    protected String doBuildStringWithRelation(String li) {
        StringBuilder sb = new StringBuilder();
        if (_member != null && _member.isPresent())
        { sb.append(li).append(xbRDS(_member, "member")); }
        return sb.toString();
    }
    protected <ET extends Entity> String xbRDS(org.dbflute.optional.OptionalEntity<ET> et, String name) { // buildRelationDisplayString()
        return et.get().buildDisplayString(name, true, true);
    }

    @Override
    protected String doBuildColumnString(String dm) {
        StringBuilder sb = new StringBuilder();
        sb.append(dm).append(xfND(_memberId));
        sb.append(dm).append(xfND(_loginPassword));
        sb.append(dm).append(xfND(_reminderQuestion));
        sb.append(dm).append(xfND(_reminderAnswer));
        sb.append(dm).append(xfND(_reminderUseCount));
        sb.append(dm).append(xfND(_registerDatetime));
        sb.append(dm).append(xfND(_registerProcess));
        sb.append(dm).append(xfND(_registerUser));
        sb.append(dm).append(xfND(_updateDatetime));
        sb.append(dm).append(xfND(_updateProcess));
        sb.append(dm).append(xfND(_updateUser));
        sb.append(dm).append(xfND(_versionNo));
        if (sb.length() > dm.length()) {
            sb.delete(0, dm.length());
        }
        sb.insert(0, "{").append("}");
        return sb.toString();
    }

    @Override
    protected String doBuildRelationString(String dm) {
        StringBuilder sb = new StringBuilder();
        if (_member != null && _member.isPresent())
        { sb.append(dm).append("member"); }
        if (sb.length() > dm.length()) {
            sb.delete(0, dm.length()).insert(0, "(").append(")");
        }
        return sb.toString();
    }

    @Override
    public MemberSecurity clone() {
        return (MemberSecurity)super.clone();
    }

    // ===================================================================================
    //                                                                            Accessor
    //                                                                            ========
    /**
     * [get] member_id: {PK, NotNull, int4(10), FK to member} <br>
     * 会員ID: そのまま one-to-one を構成するためのFKとなる。
     * @return The value of the column 'member_id'. (basically NotNull if selected: for the constraint)
     */
    public Integer getMemberId() {
        checkSpecifiedProperty("memberId");
        return _memberId;
    }

    /**
     * [set] member_id: {PK, NotNull, int4(10), FK to member} <br>
     * 会員ID: そのまま one-to-one を構成するためのFKとなる。
     * @param memberId The value of the column 'member_id'. (basically NotNull if update: for the constraint)
     */
    public void setMemberId(Integer memberId) {
        registerModifiedProperty("memberId");
        _memberId = memberId;
    }

    /**
     * [get] login_password: {NotNull, varchar(50)} <br>
     * ログインパスワード: ログイン時に利用するパスワード。<br>
     * 本当は良くないが、Exampleなのでひとまず暗号化していない。
     * @return The value of the column 'login_password'. (basically NotNull if selected: for the constraint)
     */
    public String getLoginPassword() {
        checkSpecifiedProperty("loginPassword");
        return _loginPassword;
    }

    /**
     * [set] login_password: {NotNull, varchar(50)} <br>
     * ログインパスワード: ログイン時に利用するパスワード。<br>
     * 本当は良くないが、Exampleなのでひとまず暗号化していない。
     * @param loginPassword The value of the column 'login_password'. (basically NotNull if update: for the constraint)
     */
    public void setLoginPassword(String loginPassword) {
        registerModifiedProperty("loginPassword");
        _loginPassword = loginPassword;
    }

    /**
     * [get] reminder_question: {NotNull, varchar(50)} <br>
     * リマインダ質問: パスワードを忘れた際のリマインダ機能における質問の内容。
     * @return The value of the column 'reminder_question'. (basically NotNull if selected: for the constraint)
     */
    public String getReminderQuestion() {
        checkSpecifiedProperty("reminderQuestion");
        return _reminderQuestion;
    }

    /**
     * [set] reminder_question: {NotNull, varchar(50)} <br>
     * リマインダ質問: パスワードを忘れた際のリマインダ機能における質問の内容。
     * @param reminderQuestion The value of the column 'reminder_question'. (basically NotNull if update: for the constraint)
     */
    public void setReminderQuestion(String reminderQuestion) {
        registerModifiedProperty("reminderQuestion");
        _reminderQuestion = reminderQuestion;
    }

    /**
     * [get] reminder_answer: {NotNull, varchar(50)} <br>
     * リマインダ回答: パスワードを忘れた際のリマインダ機能における質問の答え。
     * @return The value of the column 'reminder_answer'. (basically NotNull if selected: for the constraint)
     */
    public String getReminderAnswer() {
        checkSpecifiedProperty("reminderAnswer");
        return _reminderAnswer;
    }

    /**
     * [set] reminder_answer: {NotNull, varchar(50)} <br>
     * リマインダ回答: パスワードを忘れた際のリマインダ機能における質問の答え。
     * @param reminderAnswer The value of the column 'reminder_answer'. (basically NotNull if update: for the constraint)
     */
    public void setReminderAnswer(String reminderAnswer) {
        registerModifiedProperty("reminderAnswer");
        _reminderAnswer = reminderAnswer;
    }

    /**
     * [get] reminder_use_count: {NotNull, int4(10)} <br>
     * リマインダ利用回数: リマインダを利用した回数。<br>
     * 多いと忘れっぽい会員と言えるが、<br>
     * そんなことを知ってもしょうがない。
     * @return The value of the column 'reminder_use_count'. (basically NotNull if selected: for the constraint)
     */
    public Integer getReminderUseCount() {
        checkSpecifiedProperty("reminderUseCount");
        return _reminderUseCount;
    }

    /**
     * [set] reminder_use_count: {NotNull, int4(10)} <br>
     * リマインダ利用回数: リマインダを利用した回数。<br>
     * 多いと忘れっぽい会員と言えるが、<br>
     * そんなことを知ってもしょうがない。
     * @param reminderUseCount The value of the column 'reminder_use_count'. (basically NotNull if update: for the constraint)
     */
    public void setReminderUseCount(Integer reminderUseCount) {
        registerModifiedProperty("reminderUseCount");
        _reminderUseCount = reminderUseCount;
    }

    /**
     * [get] register_datetime: {NotNull, timestamp(26, 3)} <br>
     * @return The value of the column 'register_datetime'. (basically NotNull if selected: for the constraint)
     */
    public java.time.LocalDateTime getRegisterDatetime() {
        checkSpecifiedProperty("registerDatetime");
        return _registerDatetime;
    }

    /**
     * [set] register_datetime: {NotNull, timestamp(26, 3)} <br>
     * @param registerDatetime The value of the column 'register_datetime'. (basically NotNull if update: for the constraint)
     */
    public void setRegisterDatetime(java.time.LocalDateTime registerDatetime) {
        registerModifiedProperty("registerDatetime");
        _registerDatetime = registerDatetime;
    }

    /**
     * [get] register_process: {NotNull, varchar(200)} <br>
     * @return The value of the column 'register_process'. (basically NotNull if selected: for the constraint)
     */
    public String getRegisterProcess() {
        checkSpecifiedProperty("registerProcess");
        return _registerProcess;
    }

    /**
     * [set] register_process: {NotNull, varchar(200)} <br>
     * @param registerProcess The value of the column 'register_process'. (basically NotNull if update: for the constraint)
     */
    public void setRegisterProcess(String registerProcess) {
        registerModifiedProperty("registerProcess");
        _registerProcess = registerProcess;
    }

    /**
     * [get] register_user: {NotNull, varchar(200)} <br>
     * @return The value of the column 'register_user'. (basically NotNull if selected: for the constraint)
     */
    public String getRegisterUser() {
        checkSpecifiedProperty("registerUser");
        return _registerUser;
    }

    /**
     * [set] register_user: {NotNull, varchar(200)} <br>
     * @param registerUser The value of the column 'register_user'. (basically NotNull if update: for the constraint)
     */
    public void setRegisterUser(String registerUser) {
        registerModifiedProperty("registerUser");
        _registerUser = registerUser;
    }

    /**
     * [get] update_datetime: {NotNull, timestamp(26, 3)} <br>
     * @return The value of the column 'update_datetime'. (basically NotNull if selected: for the constraint)
     */
    public java.time.LocalDateTime getUpdateDatetime() {
        checkSpecifiedProperty("updateDatetime");
        return _updateDatetime;
    }

    /**
     * [set] update_datetime: {NotNull, timestamp(26, 3)} <br>
     * @param updateDatetime The value of the column 'update_datetime'. (basically NotNull if update: for the constraint)
     */
    public void setUpdateDatetime(java.time.LocalDateTime updateDatetime) {
        registerModifiedProperty("updateDatetime");
        _updateDatetime = updateDatetime;
    }

    /**
     * [get] update_process: {NotNull, varchar(200)} <br>
     * @return The value of the column 'update_process'. (basically NotNull if selected: for the constraint)
     */
    public String getUpdateProcess() {
        checkSpecifiedProperty("updateProcess");
        return _updateProcess;
    }

    /**
     * [set] update_process: {NotNull, varchar(200)} <br>
     * @param updateProcess The value of the column 'update_process'. (basically NotNull if update: for the constraint)
     */
    public void setUpdateProcess(String updateProcess) {
        registerModifiedProperty("updateProcess");
        _updateProcess = updateProcess;
    }

    /**
     * [get] update_user: {NotNull, varchar(200)} <br>
     * @return The value of the column 'update_user'. (basically NotNull if selected: for the constraint)
     */
    public String getUpdateUser() {
        checkSpecifiedProperty("updateUser");
        return _updateUser;
    }

    /**
     * [set] update_user: {NotNull, varchar(200)} <br>
     * @param updateUser The value of the column 'update_user'. (basically NotNull if update: for the constraint)
     */
    public void setUpdateUser(String updateUser) {
        registerModifiedProperty("updateUser");
        _updateUser = updateUser;
    }

    /**
     * [get] version_no: {NotNull, int8(19)} <br>
     * @return The value of the column 'version_no'. (basically NotNull if selected: for the constraint)
     */
    public Long getVersionNo() {
        checkSpecifiedProperty("versionNo");
        return _versionNo;
    }

    /**
     * [set] version_no: {NotNull, int8(19)} <br>
     * @param versionNo The value of the column 'version_no'. (basically NotNull if update: for the constraint)
     */
    public void setVersionNo(Long versionNo) {
        registerModifiedProperty("versionNo");
        _versionNo = versionNo;
    }
}
