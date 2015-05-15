package cb

import (
	"github.com/mikeshimura/dbflute/df"
	"dbflute/adf/cq"
	"dbflute/adf/meta"
)

type WhiteXlsManCB struct {
	BaseConditionBean *df.BaseConditionBean
	query             *cq.WhiteXlsManCQ
}

func CreateWhiteXlsManCB() *WhiteXlsManCB {
	cb := new(WhiteXlsManCB)
	cb.BaseConditionBean = new(df.BaseConditionBean)
	cb.BaseConditionBean.DBMetaProvider = df.DBMetaProvider_I
	cb.BaseConditionBean.TableDbName = "WhiteXlsMan"
	cb.BaseConditionBean.Name = "WhiteXlsManCB"
	cb.BaseConditionBean.SqlClause = df.CreateSqlClause(cb, df.DBCurrent_I)
	var dmx df.DBMeta = meta.WhiteXlsManDbm
	(*cb.BaseConditionBean.SqlClause).SetDBMeta(&dmx)
	(*cb.BaseConditionBean.SqlClause).SetUseSelectIndex(true)
	return cb
}

func (l *WhiteXlsManCB) Query() *cq.WhiteXlsManCQ {
	if l.query == nil {
		l.query = cq.CreateWhiteXlsManCQ(nil, l.BaseConditionBean.SqlClause, (*l.BaseConditionBean.SqlClause).GetBasePorintAliasName(), 0)
		var cb df.ConditionBean = l
		l.query.BaseConditionQuery.BaseCB = &cb	
	}
	return l.query
}
func (l *WhiteXlsManCB) GetBaseConditionBean() *df.BaseConditionBean {
	return l.BaseConditionBean
}

func (l *WhiteXlsManCB) AllowEmptyStringQuery() {
	l.BaseConditionBean.AllowEmptyStringQuery()
}


func (l *WhiteXlsManCB) FetchFirst(fetchSize int){
	(*l.GetBaseConditionBean().SqlClause).FetchFirst(fetchSize)
}

func (l *WhiteXlsManCB) OrScopeQuery(fquery func(*WhiteXlsManCB)){
	(*l.BaseConditionBean.SqlClause).MakeOrScopeQueryEffective()
	fquery(l)
	(*l.BaseConditionBean.SqlClause).CloseOrScopeQuery()
}

type WhiteXlsManNss struct {
	Query *cq.WhiteXlsManCQ
}
func (p *WhiteXlsManNss) hasConditionQuery() bool {
	return p.Query != nil
}