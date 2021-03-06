package cq

import (
	"github.com/mikeshimura/dbflute/df"
)

type WhiteSameNameRefCQ struct {
	BaseConditionQuery *df.BaseConditionQuery
	SameNameRefId *df.ConditionValue
	SameNameId *df.ConditionValue
	NextSameNameId *df.ConditionValue
    conditionQueryWhiteSameName *WhiteSameNameCQ
}

func (q *WhiteSameNameRefCQ) GetBaseConditionQuery() *df.BaseConditionQuery{
	return q.BaseConditionQuery
}


func (q *WhiteSameNameRefCQ) getCValueSameNameRefId() *df.ConditionValue {
	if q.SameNameRefId == nil {
		q.SameNameRefId = new(df.ConditionValue)
	}
	return q.SameNameRefId
}



func (q *WhiteSameNameRefCQ) SetSameNameRefId_Equal(value int64) *WhiteSameNameRefCQ {
	q.regSameNameRefId(df.CK_EQ_C, value)
	return q
}
func (q *WhiteSameNameRefCQ) SetSameNameRefId_InScope(list *df.List){
	q.BaseConditionQuery.RegINS(df.CK_INS_C, list,
		 q.getCValueSameNameRefId(), "sameNameRefId")
}
func (q *WhiteSameNameRefCQ) SetSameNameRefId_NotEqual(value int64) *WhiteSameNameRefCQ {
	q.regSameNameRefId(df.CK_NE_C, value)
	return q
}

func (q *WhiteSameNameRefCQ) SetSameNameRefId_GreaterThan(value int64) *WhiteSameNameRefCQ {
	q.regSameNameRefId(df.CK_GT_C, value)
	return q
}

func (q *WhiteSameNameRefCQ) SetSameNameRefId_LessThan(value int64) *WhiteSameNameRefCQ {
	q.regSameNameRefId(df.CK_LT_C, value)
	return q
}

func (q *WhiteSameNameRefCQ) SetSameNameRefId_GreaterEqual(value int64) *WhiteSameNameRefCQ {
	q.regSameNameRefId(df.CK_GE_C, value)
	return q
}

func (q *WhiteSameNameRefCQ) SetSameNameRefId_LessEqual(value int64) *WhiteSameNameRefCQ {
	q.regSameNameRefId(df.CK_LE_C, value)
	return q
}
func (q *WhiteSameNameRefCQ) SetSameNameRefId_RangeOf(minNumber int64, maxNumber int64, rangeOfOption *df.RangeOfOption) error {
	return q.BaseConditionQuery.RegROO(minNumber,maxNumber,q.getCValueSameNameRefId(),"sameNameRefId",rangeOfOption)
}	


func (q *WhiteSameNameRefCQ) SetSameNameRefId_IsNull() *WhiteSameNameRefCQ {
	q.regSameNameRefId(df.CK_ISN_C, 0)
	return q
}
func (q *WhiteSameNameRefCQ) SetSameNameRefId_IsNotNull() *WhiteSameNameRefCQ {
	q.regSameNameRefId(df.CK_ISNN_C, 0)
	return q
}
func (q *WhiteSameNameRefCQ) AddOrderBy_SameNameRefId_Asc() *WhiteSameNameRefCQ {
	q.BaseConditionQuery.RegOBA("sameNameRefId")
	return q
}
func (q *WhiteSameNameRefCQ) AddOrderBy_SameNameRefId_Desc() *WhiteSameNameRefCQ {
	q.BaseConditionQuery.RegOBD("sameNameRefId")
	return q
}
func (q *WhiteSameNameRefCQ) regSameNameRefId(key *df.ConditionKey, value interface{}) {
	if q.SameNameRefId == nil {
		q.SameNameRefId = new(df.ConditionValue)
	}
	q.BaseConditionQuery.RegQ(key, value, q.SameNameRefId, "sameNameRefId")
}

func (q *WhiteSameNameRefCQ) getCValueSameNameId() *df.ConditionValue {
	if q.SameNameId == nil {
		q.SameNameId = new(df.ConditionValue)
	}
	return q.SameNameId
}



func (q *WhiteSameNameRefCQ) SetSameNameId_Equal(value int64) *WhiteSameNameRefCQ {
	q.regSameNameId(df.CK_EQ_C, value)
	return q
}
func (q *WhiteSameNameRefCQ) SetSameNameId_InScope(list *df.List){
	q.BaseConditionQuery.RegINS(df.CK_INS_C, list,
		 q.getCValueSameNameId(), "sameNameId")
}
func (q *WhiteSameNameRefCQ) SetSameNameId_NotEqual(value int64) *WhiteSameNameRefCQ {
	q.regSameNameId(df.CK_NE_C, value)
	return q
}

func (q *WhiteSameNameRefCQ) SetSameNameId_GreaterThan(value int64) *WhiteSameNameRefCQ {
	q.regSameNameId(df.CK_GT_C, value)
	return q
}

func (q *WhiteSameNameRefCQ) SetSameNameId_LessThan(value int64) *WhiteSameNameRefCQ {
	q.regSameNameId(df.CK_LT_C, value)
	return q
}

func (q *WhiteSameNameRefCQ) SetSameNameId_GreaterEqual(value int64) *WhiteSameNameRefCQ {
	q.regSameNameId(df.CK_GE_C, value)
	return q
}

func (q *WhiteSameNameRefCQ) SetSameNameId_LessEqual(value int64) *WhiteSameNameRefCQ {
	q.regSameNameId(df.CK_LE_C, value)
	return q
}
func (q *WhiteSameNameRefCQ) SetSameNameId_RangeOf(minNumber int64, maxNumber int64, rangeOfOption *df.RangeOfOption) error {
	return q.BaseConditionQuery.RegROO(minNumber,maxNumber,q.getCValueSameNameId(),"sameNameId",rangeOfOption)
}	


func (q *WhiteSameNameRefCQ) AddOrderBy_SameNameId_Asc() *WhiteSameNameRefCQ {
	q.BaseConditionQuery.RegOBA("sameNameId")
	return q
}
func (q *WhiteSameNameRefCQ) AddOrderBy_SameNameId_Desc() *WhiteSameNameRefCQ {
	q.BaseConditionQuery.RegOBD("sameNameId")
	return q
}
func (q *WhiteSameNameRefCQ) regSameNameId(key *df.ConditionKey, value interface{}) {
	if q.SameNameId == nil {
		q.SameNameId = new(df.ConditionValue)
	}
	q.BaseConditionQuery.RegQ(key, value, q.SameNameId, "sameNameId")
}

func (q *WhiteSameNameRefCQ) getCValueNextSameNameId() *df.ConditionValue {
	if q.NextSameNameId == nil {
		q.NextSameNameId = new(df.ConditionValue)
	}
	return q.NextSameNameId
}



func (q *WhiteSameNameRefCQ) SetNextSameNameId_Equal(value int64) *WhiteSameNameRefCQ {
	q.regNextSameNameId(df.CK_EQ_C, value)
	return q
}
func (q *WhiteSameNameRefCQ) SetNextSameNameId_InScope(list *df.List){
	q.BaseConditionQuery.RegINS(df.CK_INS_C, list,
		 q.getCValueNextSameNameId(), "nextSameNameId")
}
func (q *WhiteSameNameRefCQ) SetNextSameNameId_NotEqual(value int64) *WhiteSameNameRefCQ {
	q.regNextSameNameId(df.CK_NE_C, value)
	return q
}

func (q *WhiteSameNameRefCQ) SetNextSameNameId_GreaterThan(value int64) *WhiteSameNameRefCQ {
	q.regNextSameNameId(df.CK_GT_C, value)
	return q
}

func (q *WhiteSameNameRefCQ) SetNextSameNameId_LessThan(value int64) *WhiteSameNameRefCQ {
	q.regNextSameNameId(df.CK_LT_C, value)
	return q
}

func (q *WhiteSameNameRefCQ) SetNextSameNameId_GreaterEqual(value int64) *WhiteSameNameRefCQ {
	q.regNextSameNameId(df.CK_GE_C, value)
	return q
}

func (q *WhiteSameNameRefCQ) SetNextSameNameId_LessEqual(value int64) *WhiteSameNameRefCQ {
	q.regNextSameNameId(df.CK_LE_C, value)
	return q
}
func (q *WhiteSameNameRefCQ) SetNextSameNameId_RangeOf(minNumber int64, maxNumber int64, rangeOfOption *df.RangeOfOption) error {
	return q.BaseConditionQuery.RegROO(minNumber,maxNumber,q.getCValueNextSameNameId(),"nextSameNameId",rangeOfOption)
}	


func (q *WhiteSameNameRefCQ) AddOrderBy_NextSameNameId_Asc() *WhiteSameNameRefCQ {
	q.BaseConditionQuery.RegOBA("nextSameNameId")
	return q
}
func (q *WhiteSameNameRefCQ) AddOrderBy_NextSameNameId_Desc() *WhiteSameNameRefCQ {
	q.BaseConditionQuery.RegOBD("nextSameNameId")
	return q
}
func (q *WhiteSameNameRefCQ) regNextSameNameId(key *df.ConditionKey, value interface{}) {
	if q.NextSameNameId == nil {
		q.NextSameNameId = new(df.ConditionValue)
	}
	q.BaseConditionQuery.RegQ(key, value, q.NextSameNameId, "nextSameNameId")
}


func (q *WhiteSameNameRefCQ) QueryWhiteSameName() *WhiteSameNameCQ {
	if q.conditionQueryWhiteSameName == nil {
		q.conditionQueryWhiteSameName = q.xcreateQueryWhiteSameName()
		q.xsetupOuterJoinWhiteSameName()
	}
	return q.conditionQueryWhiteSameName
}

func (q *WhiteSameNameRefCQ) xcreateQueryWhiteSameName() *WhiteSameNameCQ {
	nrp := q.BaseConditionQuery.ResolveNextRelationPath("WhiteSameNameRef", "WhiteSameName")
	jan := q.BaseConditionQuery.ResolveJoinAliasName(nrp)
	var basecq df.ConditionQuery = q
	cq := CreateWhiteSameNameCQ(&basecq, q.BaseConditionQuery.SqlClause, jan, q.BaseConditionQuery.NestLevel+1)
	cq.BaseConditionQuery.BaseCB = q.BaseConditionQuery.BaseCB
	cq.BaseConditionQuery.ForeignPropertyName = "WhiteSameName"
	cq.BaseConditionQuery.RelationPath = nrp
	return cq
}
func (q *WhiteSameNameRefCQ) xsetupOuterJoinWhiteSameName() {
	    cq := q.QueryWhiteSameName()
        joinOnMap := make(map[string]string)
        joinOnMap["sameNameId"]="sameNameId"
        q.BaseConditionQuery.RegisterOuterJoin(
        	cq.BaseConditionQuery.ConditionQuery, joinOnMap, "WhiteSameName");
}	
	
func CreateWhiteSameNameRefCQ(referrerQuery *df.ConditionQuery, sqlClause *df.SqlClause, aliasName string, nestlevel int8) *WhiteSameNameRefCQ {
	cq := new(WhiteSameNameRefCQ)
	cq.BaseConditionQuery = new(df.BaseConditionQuery)
	cq.BaseConditionQuery.TableDbName = "WhiteSameNameRef"
	cq.BaseConditionQuery.ReferrerQuery = referrerQuery
	cq.BaseConditionQuery.SqlClause = sqlClause
	cq.BaseConditionQuery.AliasName = aliasName
	cq.BaseConditionQuery.NestLevel = nestlevel
	cq.BaseConditionQuery.DBMetaProvider = df.DBMetaProvider_I
	cq.BaseConditionQuery.CQ_PROPERTY = "Query"
	var cqi df.ConditionQuery = cq
	cq.BaseConditionQuery.ConditionQuery=&cqi
	return cq
}	