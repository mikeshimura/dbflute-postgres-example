package bhv

import (
	"database/sql"
	"github.com/mikeshimura/dbflute/df"
	"dbflute/adf/entity"
	"dbflute/adf/cb"
	"dbflute/adf/meta"
)

type WhiteCompoundPkBhv struct {
	BaseBehavior *df.BaseBehavior
}
func (l *WhiteCompoundPkBhv) GetDBMeta() *df.DBMeta{
	var meta df.DBMeta=meta.WhiteCompoundPkDbm
	return &meta
}
func (l *WhiteCompoundPkBhv) GetBaseBehavior() *df.BaseBehavior {
	return l.BaseBehavior
}
func (l *WhiteCompoundPkBhv) Update(whiteCompoundPk *entity.WhiteCompoundPk, tx *sql.Tx, ctx *df.Context) (int64, error) {
	var entity df.Entity = whiteCompoundPk
	return l.BaseBehavior.DoUpdate(&entity, nil, tx, ctx)
}
func (l *WhiteCompoundPkBhv) Insert(whiteCompoundPk *entity.WhiteCompoundPk, tx *sql.Tx, ctx *df.Context) (int64, error) {
	var entity df.Entity = whiteCompoundPk
	return l.BaseBehavior.DoInsert(&entity, nil, tx, ctx)
}
func (l *WhiteCompoundPkBhv) Delete(whiteCompoundPk *entity.WhiteCompoundPk, tx *sql.Tx, ctx *df.Context) (int64, error) {
	var entity df.Entity = whiteCompoundPk
	return l.BaseBehavior.DoDelete(&entity, nil, tx, ctx)
}
func (l *WhiteCompoundPkBhv) SelectList(cb *cb.WhiteCompoundPkCB, tx *sql.Tx) (*df.ListResultBean, error) {

	return l.BaseBehavior.DoSelectList(cb, "WhiteCompoundPk", tx)
}
func (l *WhiteCompoundPkBhv) SelectCount(cb *cb.WhiteCompoundPkCB, tx *sql.Tx) (int64, error) {

	return l.BaseBehavior.DoSelectCount(cb, tx)
}
func (l *WhiteCompoundPkBhv) OutsideSql() *df.OutsideSqlBasicExecutor {
	return l.BaseBehavior.DoOutsideSql()
}

func (l *WhiteCompoundPkBhv) ReadNextVal(tx *sql.Tx) int64{
	return l.BaseBehavior.DoSelectNextVal(tx)
}

var WhiteCompoundPkBhv_I *WhiteCompoundPkBhv
