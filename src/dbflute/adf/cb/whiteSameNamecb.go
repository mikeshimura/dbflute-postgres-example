package cb

import (
	"github.com/mikeshimura/dbflute/df"
	"dbflute/adf/cq"
	"dbflute/adf/meta"
)

type WhiteSameNameCB struct {
	BaseConditionBean *df.BaseConditionBean
	query             *cq.WhiteSameNameCQ
}

func CreateWhiteSameNameCB() *WhiteSameNameCB {
	cb := new(WhiteSameNameCB)
	cb.BaseConditionBean = new(df.BaseConditionBean)
	cb.BaseConditionBean.DBMetaProvider = df.DBMetaProvider_I
	cb.BaseConditionBean.TableDbName = "WhiteSameName"
	cb.BaseConditionBean.Name = "WhiteSameNameCB"
	cb.BaseConditionBean.SqlClause = df.CreateSqlClause(cb, df.DBCurrent_I)
	var dmx df.DBMeta = meta.WhiteSameNameDbm
	(*cb.BaseConditionBean.SqlClause).SetDBMeta(&dmx)
	(*cb.BaseConditionBean.SqlClause).SetUseSelectIndex(true)
	return cb
}

func (l *WhiteSameNameCB) Query() *cq.WhiteSameNameCQ {
	if l.query == nil {
		l.query = cq.CreateWhiteSameNameCQ(nil, l.BaseConditionBean.SqlClause, (*l.BaseConditionBean.SqlClause).GetBasePorintAliasName(), 0)
		var cb df.ConditionBean = l
		l.query.BaseConditionQuery.BaseCB = &cb	
	}
	return l.query
}
func (l *WhiteSameNameCB) GetBaseConditionBean() *df.BaseConditionBean {
	return l.BaseConditionBean
}

func (l *WhiteSameNameCB) AllowEmptyStringQuery() {
	l.BaseConditionBean.AllowEmptyStringQuery()
}


func (l *WhiteSameNameCB) FetchFirst(fetchSize int){
	(*l.GetBaseConditionBean().SqlClause).FetchFirst(fetchSize)
}

func (l *WhiteSameNameCB) OrScopeQuery(fquery func(*WhiteSameNameCB)){
	(*l.BaseConditionBean.SqlClause).MakeOrScopeQueryEffective()
	fquery(l)
	(*l.BaseConditionBean.SqlClause).CloseOrScopeQuery()
}

type WhiteSameNameNss struct {
	Query *cq.WhiteSameNameCQ
}
func (p *WhiteSameNameNss) hasConditionQuery() bool {
	return p.Query != nil
}