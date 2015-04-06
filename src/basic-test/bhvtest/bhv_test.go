package bhvtest

import (
	"database/sql"
	"dbflute/adf/bhv"
	"dbflute/adf/cb"
	"dbflute/adf/entity"
	"fmt"
	_ "github.com/lib/pq"
	"github.com/mikeshimura/dbflute/df"
	"github.com/mikeshimura/dbflute/log"
	"testing"
	"time"
)

func TestSelect(t *testing.T) {
	var Db *sql.DB
	var err error
	Db, err = sql.Open("postgres", "user=exampledb password=exampledb dbname=exampledb sslmode=disable")

	if err != nil {
		log.ErrorConv("factory", err.Error())
	}
	tx, _ := Db.Begin()
	cb1 := cb.CreateMemberCB()
	cb1.Query.SetMemberId_Equal(3)
	l, err1 := bhv.MemberBhv_I.SelectList(cb1, tx)
	fmt.Printf("err %v\n", err1)
	fmt.Println("result no:", l.AllRecordCount)
	tt := (l.List.Get(0)).(*entity.Member)
	fmt.Printf("MemberName %s:\n", tt.GetMemberName())
	tx.Commit()
}

func TestSelect2(t *testing.T) {
	var Db *sql.DB
	var err error
	Db, err = sql.Open("postgres", "user=exampledb password=exampledb dbname=exampledb sslmode=disable")

	if err != nil {
		log.ErrorConv("factory", err.Error())
	}
	tx, _ := Db.Begin()
	cb1 := cb.CreateMemberCB()
	cb1.Query.SetMemberName_PrefixSearch("S")
	cb1.Query.AddOrderBy_MemberId_Asc()
	l, err1 := bhv.MemberBhv_I.SelectList(cb1, tx)
	fmt.Printf("err %v\n", err1)
	fmt.Println("result no:", l.AllRecordCount)
	tt := (l.List.Get(0)).(*entity.Member)
	fmt.Printf("MemberName %s:\n", tt.GetMemberName())
	tx.Commit()
}

func TestInsert(t *testing.T) {
	var Db *sql.DB
	var err error
	Db, err = sql.Open("postgres", "user=exampledb password=exampledb dbname=exampledb sslmode=disable")

	if err != nil {
		log.ErrorConv("factory", err.Error())
	}
	tx, _ := Db.Begin()
	member := entity.CreateMember()
	member.SetMemberName("testName")
	member.SetMemberAccount("testAccount")
	member.SetMemberStatusCode("FML")
	member.SetRegisterDatetime(df.CreateTimestamp(time.Now()))
	member.SetUpdateDatetime(df.CreateTimestamp(time.Now()))
	member.SetRegisterUser("TEST")
	member.SetRegisterProcess("TEST")
	member.SetUpdateProcess("TEST")
	member.SetUpdateUser("TEST")
	_, err1 := bhv.MemberBhv_I.Insert(member, tx)
	fmt.Printf("err %v\n", err1)
	fmt.Printf("MemberId %d:\n", member.GetMemberId())
	cb1 := cb.CreateMemberCB()
	cb1.Query.SetMemberName_Equal("testName")
	l, err2 := bhv.MemberBhv_I.SelectList(cb1, tx)
	fmt.Printf("err %v\n", err2)
	fmt.Println("result no:", l.AllRecordCount)
	tt := (l.List.Get(0)).(*entity.Member)
	fmt.Printf("MemberId %d:\n", tt.GetMemberId())
	df.TxRollback(tx)
}
