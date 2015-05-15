package cb

import (
	"github.com/mikeshimura/dbflute/df"
	"dbflute/adf/cq"
	"dbflute/adf/meta"
)

type WhiteCompoundPkWrongOrderCB struct {
	BaseConditionBean *df.BaseConditionBean
	query             *cq.WhiteCompoundPkWrongOrderCQ
}

func CreateWhiteCompoundPkWrongOrderCB() *WhiteCompoundPkWrongOrderCB {
	cb := new(WhiteCompoundPkWrongOrderCB)
	cb.BaseConditionBean = new(df.BaseConditionBean)
	cb.BaseConditionBean.DBMetaProvider = df.DBMetaProvider_I
	cb.BaseConditionBean.TableDbName = "WhiteCompoundPkWrongOrder"
	cb.BaseConditionBean.Name = "WhiteCompoundPkWrongOrderCB"
	cb.BaseConditionBean.SqlClause = df.CreateSqlClause(cb, df.DBCurrent_I)
	var dmx df.DBMeta = meta.WhiteCompoundPkWrongOrderDbm
	(*cb.BaseConditionBean.SqlClause).SetDBMeta(&dmx)
	(*cb.BaseConditionBean.SqlClause).SetUseSelectIndex(true)
	return cb
}

func (l *WhiteCompoundPkWrongOrderCB) Query() *cq.WhiteCompoundPkWrongOrderCQ {
	if l.query == nil {
		l.query = cq.CreateWhiteCompoundPkWrongOrderCQ(nil, l.BaseConditionBean.SqlClause, (*l.BaseConditionBean.SqlClause).GetBasePorintAliasName(), 0)
		var cb df.ConditionBean = l
		l.query.BaseConditionQuery.BaseCB = &cb	
	}
	return l.query
}
func (l *WhiteCompoundPkWrongOrderCB) GetBaseConditionBean() *df.BaseConditionBean {
	return l.BaseConditionBean
}

func (l *WhiteCompoundPkWrongOrderCB) AllowEmptyStringQuery() {
	l.BaseConditionBean.AllowEmptyStringQuery()
}


func (l *WhiteCompoundPkWrongOrderCB) FetchFirst(fetchSize int){
	(*l.GetBaseConditionBean().SqlClause).FetchFirst(fetchSize)
}

func (l *WhiteCompoundPkWrongOrderCB) OrScopeQuery(fquery func(*WhiteCompoundPkWrongOrderCB)){
	(*l.BaseConditionBean.SqlClause).MakeOrScopeQueryEffective()
	fquery(l)
	(*l.BaseConditionBean.SqlClause).CloseOrScopeQuery()
}

type WhiteCompoundPkWrongOrderNss struct {
	Query *cq.WhiteCompoundPkWrongOrderCQ
}
func (p *WhiteCompoundPkWrongOrderNss) hasConditionQuery() bool {
	return p.Query != nil
}