package cb

import (
	"github.com/mikeshimura/dbflute/df"
	"dbflute/adf/cq"
	"dbflute/adf/meta"
)

type WhiteNotPkCB struct {
	BaseConditionBean *df.BaseConditionBean
	query             *cq.WhiteNotPkCQ
}

func CreateWhiteNotPkCB() *WhiteNotPkCB {
	cb := new(WhiteNotPkCB)
	cb.BaseConditionBean = new(df.BaseConditionBean)
	cb.BaseConditionBean.DBMetaProvider = df.DBMetaProvider_I
	cb.BaseConditionBean.TableDbName = "WhiteNotPk"
	cb.BaseConditionBean.Name = "WhiteNotPkCB"
	cb.BaseConditionBean.SqlClause = df.CreateSqlClause(cb, df.DBCurrent_I)
	var dmx df.DBMeta = meta.WhiteNotPkDbm
	(*cb.BaseConditionBean.SqlClause).SetDBMeta(&dmx)
	(*cb.BaseConditionBean.SqlClause).SetUseSelectIndex(true)
	return cb
}

func (l *WhiteNotPkCB) Query() *cq.WhiteNotPkCQ {
	if l.query == nil {
		l.query = cq.CreateWhiteNotPkCQ(nil, l.BaseConditionBean.SqlClause, (*l.BaseConditionBean.SqlClause).GetBasePorintAliasName(), 0)
		var cb df.ConditionBean = l
		l.query.BaseConditionQuery.BaseCB = &cb	
	}
	return l.query
}
func (l *WhiteNotPkCB) GetBaseConditionBean() *df.BaseConditionBean {
	return l.BaseConditionBean
}

func (l *WhiteNotPkCB) AllowEmptyStringQuery() {
	l.BaseConditionBean.AllowEmptyStringQuery()
}


func (l *WhiteNotPkCB) FetchFirst(fetchSize int){
	(*l.GetBaseConditionBean().SqlClause).FetchFirst(fetchSize)
}

func (l *WhiteNotPkCB) OrScopeQuery(fquery func(*WhiteNotPkCB)){
	(*l.BaseConditionBean.SqlClause).MakeOrScopeQueryEffective()
	fquery(l)
	(*l.BaseConditionBean.SqlClause).CloseOrScopeQuery()
}

type WhiteNotPkNss struct {
	Query *cq.WhiteNotPkCQ
}
func (p *WhiteNotPkNss) hasConditionQuery() bool {
	return p.Query != nil
}