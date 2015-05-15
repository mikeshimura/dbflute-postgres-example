package bhv

import (
	"database/sql"
	"github.com/mikeshimura/dbflute/df"
	"dbflute/adf/entity"
	"dbflute/adf/cb"
	"dbflute/adf/meta"
)

type WhiteCompoundPkWrongOrderBhv struct {
	BaseBehavior *df.BaseBehavior
}
func (l *WhiteCompoundPkWrongOrderBhv) GetDBMeta() *df.DBMeta{
	var meta df.DBMeta=meta.WhiteCompoundPkWrongOrderDbm
	return &meta
}
func (l *WhiteCompoundPkWrongOrderBhv) GetBaseBehavior() *df.BaseBehavior {
	return l.BaseBehavior
}
func (l *WhiteCompoundPkWrongOrderBhv) Update(whiteCompoundPkWrongOrder *entity.WhiteCompoundPkWrongOrder, tx *sql.Tx, ctx *df.Context) (int64, error) {
	var entity df.Entity = whiteCompoundPkWrongOrder
	return l.BaseBehavior.DoUpdate(&entity, nil, tx, ctx)
}
func (l *WhiteCompoundPkWrongOrderBhv) Insert(whiteCompoundPkWrongOrder *entity.WhiteCompoundPkWrongOrder, tx *sql.Tx, ctx *df.Context) (int64, error) {
	var entity df.Entity = whiteCompoundPkWrongOrder
	return l.BaseBehavior.DoInsert(&entity, nil, tx, ctx)
}
func (l *WhiteCompoundPkWrongOrderBhv) Delete(whiteCompoundPkWrongOrder *entity.WhiteCompoundPkWrongOrder, tx *sql.Tx, ctx *df.Context) (int64, error) {
	var entity df.Entity = whiteCompoundPkWrongOrder
	return l.BaseBehavior.DoDelete(&entity, nil, tx, ctx)
}
func (l *WhiteCompoundPkWrongOrderBhv) SelectList(cb *cb.WhiteCompoundPkWrongOrderCB, tx *sql.Tx) (*df.ListResultBean, error) {

	return l.BaseBehavior.DoSelectList(cb, "WhiteCompoundPkWrongOrder", tx)
}
func (l *WhiteCompoundPkWrongOrderBhv) SelectCount(cb *cb.WhiteCompoundPkWrongOrderCB, tx *sql.Tx) (int64, error) {

	return l.BaseBehavior.DoSelectCount(cb, tx)
}
func (l *WhiteCompoundPkWrongOrderBhv) OutsideSql() *df.OutsideSqlBasicExecutor {
	return l.BaseBehavior.DoOutsideSql()
}

func (l *WhiteCompoundPkWrongOrderBhv) ReadNextVal(tx *sql.Tx) int64{
	return l.BaseBehavior.DoSelectNextVal(tx)
}

var WhiteCompoundPkWrongOrderBhv_I *WhiteCompoundPkWrongOrderBhv
