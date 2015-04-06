package com.mssoftech.dbflute.bsbhv.loader;

import java.util.List;

import org.dbflute.bhv.*;
import com.mssoftech.dbflute.exbhv.*;
import com.mssoftech.dbflute.exentity.*;

/**
 * The referrer loader of member_service as TABLE. <br>
 * <pre>
 * [primary key]
 *     member_service_id
 *
 * [column]
 *     member_service_id, member_id, service_point_count, service_rank_code, register_datetime, register_process, register_user, update_datetime, update_process, update_user, version_no
 *
 * [sequence]
 *     member_service_member_service_id_seq
 *
 * [identity]
 *     
 *
 * [version-no]
 *     version_no
 *
 * [foreign table]
 *     member, service_rank
 *
 * [referrer table]
 *     
 *
 * [foreign property]
 *     member, serviceRank
 *
 * [referrer property]
 *     
 * </pre>
 * @author DBFlute(AutoGenerator)
 */
public class LoaderOfMemberService {

    // ===================================================================================
    //                                                                           Attribute
    //                                                                           =========
    protected List<MemberService> _selectedList;
    protected BehaviorSelector _selector;
    protected MemberServiceBhv _myBhv; // lazy-loaded

    // ===================================================================================
    //                                                                   Ready for Loading
    //                                                                   =================
    public LoaderOfMemberService ready(List<MemberService> selectedList, BehaviorSelector selector)
    { _selectedList = selectedList; _selector = selector; return this; }

    protected MemberServiceBhv myBhv()
    { if (_myBhv != null) { return _myBhv; } else { _myBhv = _selector.select(MemberServiceBhv.class); return _myBhv; } }

    // ===================================================================================
    //                                                                    Pull out Foreign
    //                                                                    ================
    protected LoaderOfMember _foreignMemberLoader;
    public LoaderOfMember pulloutMember() {
        if (_foreignMemberLoader == null)
        { _foreignMemberLoader = new LoaderOfMember().ready(myBhv().pulloutMember(_selectedList), _selector); }
        return _foreignMemberLoader;
    }

    protected LoaderOfServiceRank _foreignServiceRankLoader;
    public LoaderOfServiceRank pulloutServiceRank() {
        if (_foreignServiceRankLoader == null)
        { _foreignServiceRankLoader = new LoaderOfServiceRank().ready(myBhv().pulloutServiceRank(_selectedList), _selector); }
        return _foreignServiceRankLoader;
    }

    // ===================================================================================
    //                                                                            Accessor
    //                                                                            ========
    public List<MemberService> getSelectedList() { return _selectedList; }
    public BehaviorSelector getSelector() { return _selector; }
}
