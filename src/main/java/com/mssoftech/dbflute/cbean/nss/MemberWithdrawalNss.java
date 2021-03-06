package com.mssoftech.dbflute.cbean.nss;

import com.mssoftech.dbflute.cbean.cq.MemberWithdrawalCQ;

/**
 * The nest select set-upper of member_withdrawal.
 * @author DBFlute(AutoGenerator)
 */
public class MemberWithdrawalNss {

    // ===================================================================================
    //                                                                           Attribute
    //                                                                           =========
    protected final MemberWithdrawalCQ _query;
    public MemberWithdrawalNss(MemberWithdrawalCQ query) { _query = query; }
    public boolean hasConditionQuery() { return _query != null; }

    // ===================================================================================
    //                                                                     Nested Relation
    //                                                                     ===============
    /**
     * With nested relation columns to select clause. <br>
     * member by my member_id, named 'member'.
     * @return The set-upper of more nested relation. {...with[nested-relation].with[more-nested-relation]} (NotNull)
     */
    public MemberNss withMember() {
        _query.xdoNss(() -> _query.queryMember());
        return new MemberNss(_query.queryMember());
    }
    /**
     * With nested relation columns to select clause. <br>
     * withdrawal_reason by my withdrawal_reason_code, named 'withdrawalReason'.
     */
    public void withWithdrawalReason() {
        _query.xdoNss(() -> _query.queryWithdrawalReason());
    }
}
