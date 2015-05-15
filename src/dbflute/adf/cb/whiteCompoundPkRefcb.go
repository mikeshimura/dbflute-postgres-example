package cb

import (
	"github.com/mikeshimura/dbflute/df"
	"dbflute/adf/cq"
	"dbflute/adf/meta"
)

type WhiteCompoundPkRefCB struct {
	BaseConditionBean *df.BaseConditionBean
	query             *cq.WhiteCompoundPkRefCQ
    NssWhiteCompoundPk *WhiteCompoundPkNss
}

func CreateWhiteCompoundPkRefCB() *WhiteCompoundPkRefCB {
	cb := new(WhiteCompoundPkRefCB)
	cb.BaseConditionBean = new(df.BaseConditionBean)
	cb.BaseConditionBean.DBMetaProvider = df.DBMetaProvider_I
	cb.BaseConditionBean.TableDbName = "WhiteCompoundPkRef"
	cb.BaseConditionBean.Name = "WhiteCompoundPkRefCB"
	cb.BaseConditionBean.SqlClause = df.CreateSqlClause(cb, df.DBCurrent_I)
	var dmx df.DBMeta = meta.WhiteCompoundPkRefDbm
	(*cb.BaseConditionBean.SqlClause).SetDBMeta(&dmx)
	(*cb.BaseConditionBean.SqlClause).SetUseSelectIndex(true)
	return cb
}

func (l *WhiteCompoundPkRefCB) Query() *cq.WhiteCompoundPkRefCQ {
	if l.query == nil {
		l.query = cq.CreateWhiteCompoundPkRefCQ(nil, l.BaseConditionBean.SqlClause, (*l.BaseConditionBean.SqlClause).GetBasePorintAliasName(), 0)
		var cb df.ConditionBean = l
		l.query.BaseConditionQuery.BaseCB = &cb	
	}
	return l.query
}
func (l *WhiteCompoundPkRefCB) GetBaseConditionBean() *df.BaseConditionBean {
	return l.BaseConditionBean
}

func (l *WhiteCompoundPkRefCB) AllowEmptyStringQuery() {
	l.BaseConditionBean.AllowEmptyStringQuery()
}

func (l *WhiteCompoundPkRefCB) SetupSelect_WhiteCompoundPk() *WhiteCompoundPkNss {
	l.BaseConditionBean.DoSetupSelect(l.Query().GetBaseConditionQuery(),
		l.Query().QueryWhiteCompoundPk().GetBaseConditionQuery())
	if l.NssWhiteCompoundPk == nil || !l.NssWhiteCompoundPk.hasConditionQuery() {
		l.NssWhiteCompoundPk = new(WhiteCompoundPkNss)
		l.NssWhiteCompoundPk.Query = l.Query().QueryWhiteCompoundPk()
	}
	return l.NssWhiteCompoundPk
}

func (l *WhiteCompoundPkRefCB) FetchFirst(fetchSize int){
	(*l.GetBaseConditionBean().SqlClause).FetchFirst(fetchSize)
}

func (l *WhiteCompoundPkRefCB) OrScopeQuery(fquery func(*WhiteCompoundPkRefCB)){
	(*l.BaseConditionBean.SqlClause).MakeOrScopeQueryEffective()
	fquery(l)
	(*l.BaseConditionBean.SqlClause).CloseOrScopeQuery()
}

type WhiteCompoundPkRefNss struct {
	Query *cq.WhiteCompoundPkRefCQ
    NssWhiteCompoundPk *WhiteCompoundPkNss
}
func (p *WhiteCompoundPkRefNss) WithWhiteCompoundPk() *WhiteCompoundPkNss{
	(*p.Query.BaseConditionQuery.BaseCB).GetBaseConditionBean().
	DoSetupSelect(p.Query.BaseConditionQuery,p.Query.QueryWhiteCompoundPk().GetBaseConditionQuery())
	if p.NssWhiteCompoundPk == nil || !p.NssWhiteCompoundPk.hasConditionQuery() {
		p.NssWhiteCompoundPk = new(WhiteCompoundPkNss)
		p.NssWhiteCompoundPk.Query = p.Query.QueryWhiteCompoundPk()
	}
	return p.NssWhiteCompoundPk
}
func (p *WhiteCompoundPkRefNss) hasConditionQuery() bool {
	return p.Query != nil
}