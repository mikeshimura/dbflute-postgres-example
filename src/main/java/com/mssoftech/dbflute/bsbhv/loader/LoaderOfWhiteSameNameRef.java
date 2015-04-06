package com.mssoftech.dbflute.bsbhv.loader;

import java.util.List;

import org.dbflute.bhv.*;
import com.mssoftech.dbflute.exbhv.*;
import com.mssoftech.dbflute.exentity.*;

/**
 * The referrer loader of white_same_name_ref as TABLE. <br>
 * <pre>
 * [primary key]
 *     same_name_ref_id
 *
 * [column]
 *     same_name_ref_id, same_name_id, next_same_name_id
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
 *     white_same_name
 *
 * [referrer table]
 *     
 *
 * [foreign property]
 *     whiteSameName
 *
 * [referrer property]
 *     
 * </pre>
 * @author DBFlute(AutoGenerator)
 */
public class LoaderOfWhiteSameNameRef {

    // ===================================================================================
    //                                                                           Attribute
    //                                                                           =========
    protected List<WhiteSameNameRef> _selectedList;
    protected BehaviorSelector _selector;
    protected WhiteSameNameRefBhv _myBhv; // lazy-loaded

    // ===================================================================================
    //                                                                   Ready for Loading
    //                                                                   =================
    public LoaderOfWhiteSameNameRef ready(List<WhiteSameNameRef> selectedList, BehaviorSelector selector)
    { _selectedList = selectedList; _selector = selector; return this; }

    protected WhiteSameNameRefBhv myBhv()
    { if (_myBhv != null) { return _myBhv; } else { _myBhv = _selector.select(WhiteSameNameRefBhv.class); return _myBhv; } }

    // ===================================================================================
    //                                                                    Pull out Foreign
    //                                                                    ================
    protected LoaderOfWhiteSameName _foreignWhiteSameNameLoader;
    public LoaderOfWhiteSameName pulloutWhiteSameName() {
        if (_foreignWhiteSameNameLoader == null)
        { _foreignWhiteSameNameLoader = new LoaderOfWhiteSameName().ready(myBhv().pulloutWhiteSameName(_selectedList), _selector); }
        return _foreignWhiteSameNameLoader;
    }

    // ===================================================================================
    //                                                                            Accessor
    //                                                                            ========
    public List<WhiteSameNameRef> getSelectedList() { return _selectedList; }
    public BehaviorSelector getSelector() { return _selector; }
}
