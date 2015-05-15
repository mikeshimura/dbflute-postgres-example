package cb

import (
	"github.com/mikeshimura/dbflute/df"
	"dbflute/adf/cq"
	"dbflute/adf/meta"
)

type WhiteCompoundPkCB struct {
	BaseConditionBean *df.BaseConditionBean
	query             *cq.WhiteCompoundPkCQ
}

func CreateWhiteCompoundPkCB() *WhiteCompoundPkCB {
	cb := new(WhiteCompoundPkCB)
	cb.BaseConditionBean = new(df.BaseConditionBean)
	cb.BaseConditionBean.DBMetaProvider = df.DBMetaProvider_I
	cb.BaseConditionBean.TableDbName = "WhiteCompoundPk"
	cb.BaseConditionBean.Name = "WhiteCompoundPkCB"
	cb.BaseConditionBean.SqlClause = df.CreateSqlClause(cb, df.DBCurrent_I)
	var dmx df.DBMeta = meta.WhiteCompoundPkDbm
	(*cb.BaseConditionBean.SqlClause).SetDBMeta(&dmx)
	(*cb.BaseConditionBean.SqlClause).SetUseSelectIndex(true)
	return cb
}

func (l *WhiteCompoundPkCB) Query() *cq.WhiteCompoundPkCQ {
	if l.query == nil {
		l.query = cq.CreateWhiteCompoundPkCQ(nil, l.BaseConditionBean.SqlClause, (*l.BaseConditionBean.SqlClause).GetBasePorintAliasName(), 0)
		var cb df.ConditionBean = l
		l.query.BaseConditionQuery.BaseCB = &cb	
	}
	return l.query
}
func (l *WhiteCompoundPkCB) GetBaseConditionBean() *df.BaseConditionBean {
	return l.BaseConditionBean
}

func (l *WhiteCompoundPkCB) AllowEmptyStringQuery() {
	l.BaseConditionBean.AllowEmptyStringQuery()
}


func (l *WhiteCompoundPkCB) FetchFirst(fetchSize int){
	(*l.GetBaseConditionBean().SqlClause).FetchFirst(fetchSize)
}

func (l *WhiteCompoundPkCB) OrScopeQuery(fquery func(*WhiteCompoundPkCB)){
	(*l.BaseConditionBean.SqlClause).MakeOrScopeQueryEffective()
	fquery(l)
	(*l.BaseConditionBean.SqlClause).CloseOrScopeQuery()
}

type WhiteCompoundPkNss struct {
	Query *cq.WhiteCompoundPkCQ
}
func (p *WhiteCompoundPkNss) hasConditionQuery() bool {
	return p.Query != nil
}