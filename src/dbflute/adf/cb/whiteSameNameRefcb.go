package cb

import (
	"github.com/mikeshimura/dbflute/df"
	"dbflute/adf/cq"
	"dbflute/adf/meta"
)

type WhiteSameNameRefCB struct {
	BaseConditionBean *df.BaseConditionBean
	query             *cq.WhiteSameNameRefCQ
    NssWhiteSameName *WhiteSameNameNss
}

func CreateWhiteSameNameRefCB() *WhiteSameNameRefCB {
	cb := new(WhiteSameNameRefCB)
	cb.BaseConditionBean = new(df.BaseConditionBean)
	cb.BaseConditionBean.DBMetaProvider = df.DBMetaProvider_I
	cb.BaseConditionBean.TableDbName = "WhiteSameNameRef"
	cb.BaseConditionBean.Name = "WhiteSameNameRefCB"
	cb.BaseConditionBean.SqlClause = df.CreateSqlClause(cb, df.DBCurrent_I)
	var dmx df.DBMeta = meta.WhiteSameNameRefDbm
	(*cb.BaseConditionBean.SqlClause).SetDBMeta(&dmx)
	(*cb.BaseConditionBean.SqlClause).SetUseSelectIndex(true)
	return cb
}

func (l *WhiteSameNameRefCB) Query() *cq.WhiteSameNameRefCQ {
	if l.query == nil {
		l.query = cq.CreateWhiteSameNameRefCQ(nil, l.BaseConditionBean.SqlClause, (*l.BaseConditionBean.SqlClause).GetBasePorintAliasName(), 0)
		var cb df.ConditionBean = l
		l.query.BaseConditionQuery.BaseCB = &cb	
	}
	return l.query
}
func (l *WhiteSameNameRefCB) GetBaseConditionBean() *df.BaseConditionBean {
	return l.BaseConditionBean
}

func (l *WhiteSameNameRefCB) AllowEmptyStringQuery() {
	l.BaseConditionBean.AllowEmptyStringQuery()
}

func (l *WhiteSameNameRefCB) SetupSelect_WhiteSameName() *WhiteSameNameNss {
	l.BaseConditionBean.DoSetupSelect(l.Query().GetBaseConditionQuery(),
		l.Query().QueryWhiteSameName().GetBaseConditionQuery())
	if l.NssWhiteSameName == nil || !l.NssWhiteSameName.hasConditionQuery() {
		l.NssWhiteSameName = new(WhiteSameNameNss)
		l.NssWhiteSameName.Query = l.Query().QueryWhiteSameName()
	}
	return l.NssWhiteSameName
}

func (l *WhiteSameNameRefCB) FetchFirst(fetchSize int){
	(*l.GetBaseConditionBean().SqlClause).FetchFirst(fetchSize)
}

func (l *WhiteSameNameRefCB) OrScopeQuery(fquery func(*WhiteSameNameRefCB)){
	(*l.BaseConditionBean.SqlClause).MakeOrScopeQueryEffective()
	fquery(l)
	(*l.BaseConditionBean.SqlClause).CloseOrScopeQuery()
}

type WhiteSameNameRefNss struct {
	Query *cq.WhiteSameNameRefCQ
    NssWhiteSameName *WhiteSameNameNss
}
func (p *WhiteSameNameRefNss) WithWhiteSameName() *WhiteSameNameNss{
	(*p.Query.BaseConditionQuery.BaseCB).GetBaseConditionBean().
	DoSetupSelect(p.Query.BaseConditionQuery,p.Query.QueryWhiteSameName().GetBaseConditionQuery())
	if p.NssWhiteSameName == nil || !p.NssWhiteSameName.hasConditionQuery() {
		p.NssWhiteSameName = new(WhiteSameNameNss)
		p.NssWhiteSameName.Query = p.Query.QueryWhiteSameName()
	}
	return p.NssWhiteSameName
}
func (p *WhiteSameNameRefNss) hasConditionQuery() bool {
	return p.Query != nil
}