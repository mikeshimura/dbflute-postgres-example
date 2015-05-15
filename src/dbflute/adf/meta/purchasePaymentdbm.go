package meta

import (
	"github.com/mikeshimura/dbflute/df"
)

type PurchasePaymentDbm_T struct {
	df.BaseDBMeta
	ColumnPurchasePaymentId *df.ColumnInfo
	ColumnPurchaseId *df.ColumnInfo
	ColumnPaymentAmount *df.ColumnInfo
	ColumnPaymentDatetime *df.ColumnInfo
	ColumnPaymentMethodCode *df.ColumnInfo
	ColumnRegisterDatetime *df.ColumnInfo
	ColumnRegisterUser *df.ColumnInfo
	ColumnUpdateDatetime *df.ColumnInfo
	ColumnUpdateUser *df.ColumnInfo
}

func (b *PurchasePaymentDbm_T) GetProjectName() string {
	return df.DBCurrent_I.ProjectName
}
func (b *PurchasePaymentDbm_T) foreignPurchase() *df.ForeignInfo {
	columns := []*df.ColumnInfo{
		PurchasePaymentDbm.GetColumnInfoByPropertyName("purchaseId"),
		PurchaseDbm.GetColumnInfoByPropertyName("purchaseId"),
	}

	return b.BaseDBMeta.Cfi("fk_purchase_payment_purchase", "Purchase",
		columns, 0, false, false, false, false,
		"", nil, false, "purchasePaymentList")
}	
func (b *PurchasePaymentDbm_T) CreateForeignInfoMap() {
	b.ForeignInfoMap = make(map[string]*df.ForeignInfo)
	b.ForeignInfoMap["Purchase"] = b.foreignPurchase()
}

func (b *PurchasePaymentDbm_T) GetDbCurrent() *df.DBCurrent {
	return df.DBCurrent_I
}

var PurchasePaymentDbm *PurchasePaymentDbm_T

func Create_PurchasePaymentDbm() {
	PurchasePaymentDbm = new(PurchasePaymentDbm_T)
	PurchasePaymentDbm.TableDbName = "purchase_payment"
	PurchasePaymentDbm.TableDispName = "purchase_payment"
	PurchasePaymentDbm.TablePropertyName = "purchasePayment"
	PurchasePaymentDbm.TableSqlName = new(df.TableSqlName)
	PurchasePaymentDbm.TableSqlName.TableSqlName = "purchase_payment"
	PurchasePaymentDbm.TableSqlName.CorrespondingDbName = PurchasePaymentDbm.TableDbName

	var purchasePayment df.DBMeta
	purchasePayment = PurchasePaymentDbm
	PurchasePaymentDbm.DBMeta=&purchasePayment
	purchasePaymentIdSqlName := new(df.ColumnSqlName)
	purchasePaymentIdSqlName.ColumnSqlName = "purchase_payment_id"
	purchasePaymentIdSqlName.IrregularChar = false
	PurchasePaymentDbm.ColumnPurchasePaymentId = df.CCI(&purchasePayment, "purchase_payment_id", purchasePaymentIdSqlName, "", "", "Long.class", "purchasePaymentId", "", true, true,true, "bigserial", 19, 0, "nextval('purchase_payment_purchase_payment_id_seq'::regclass)",false,"","", "","","",false,"int64")
	purchaseIdSqlName := new(df.ColumnSqlName)
	purchaseIdSqlName.ColumnSqlName = "purchase_id"
	purchaseIdSqlName.IrregularChar = false
	PurchasePaymentDbm.ColumnPurchaseId = df.CCI(&purchasePayment, "purchase_id", purchaseIdSqlName, "", "", "Long.class", "purchaseId", "", false, false,true, "int8", 19, 0, "",false,"","", "purchase","","",false,"int64")
	paymentAmountSqlName := new(df.ColumnSqlName)
	paymentAmountSqlName.ColumnSqlName = "payment_amount"
	paymentAmountSqlName.IrregularChar = false
	PurchasePaymentDbm.ColumnPaymentAmount = df.CCI(&purchasePayment, "payment_amount", paymentAmountSqlName, "", "", "java.math.BigDecimal.class", "paymentAmount", "", false, false,true, "numeric", 10, 2, "",false,"","", "","","",false,"df.Numeric")
	paymentDatetimeSqlName := new(df.ColumnSqlName)
	paymentDatetimeSqlName.ColumnSqlName = "payment_datetime"
	paymentDatetimeSqlName.IrregularChar = false
	PurchasePaymentDbm.ColumnPaymentDatetime = df.CCI(&purchasePayment, "payment_datetime", paymentDatetimeSqlName, "", "", "java.time.LocalDateTime.class", "paymentDatetime", "", false, false,true, "timestamp", 26, 3, "",false,"","", "","","",false,"df.Timestamp")
	paymentMethodCodeSqlName := new(df.ColumnSqlName)
	paymentMethodCodeSqlName.ColumnSqlName = "payment_method_code"
	paymentMethodCodeSqlName.IrregularChar = false
	PurchasePaymentDbm.ColumnPaymentMethodCode = df.CCI(&purchasePayment, "payment_method_code", paymentMethodCodeSqlName, "", "", "String.class", "paymentMethodCode", "", false, false,true, "bpchar", 3, 0, "",false,"","", "","","",false,"string")
	registerDatetimeSqlName := new(df.ColumnSqlName)
	registerDatetimeSqlName.ColumnSqlName = "register_datetime"
	registerDatetimeSqlName.IrregularChar = false
	PurchasePaymentDbm.ColumnRegisterDatetime = df.CCI(&purchasePayment, "register_datetime", registerDatetimeSqlName, "", "", "java.time.LocalDateTime.class", "registerDatetime", "", false, false,true, "timestamp", 26, 3, "",false,"","", "","","",false,"df.Timestamp")
	registerUserSqlName := new(df.ColumnSqlName)
	registerUserSqlName.ColumnSqlName = "register_user"
	registerUserSqlName.IrregularChar = false
	PurchasePaymentDbm.ColumnRegisterUser = df.CCI(&purchasePayment, "register_user", registerUserSqlName, "", "", "String.class", "registerUser", "", false, false,true, "varchar", 200, 0, "",false,"","", "","","",false,"string")
	updateDatetimeSqlName := new(df.ColumnSqlName)
	updateDatetimeSqlName.ColumnSqlName = "update_datetime"
	updateDatetimeSqlName.IrregularChar = false
	PurchasePaymentDbm.ColumnUpdateDatetime = df.CCI(&purchasePayment, "update_datetime", updateDatetimeSqlName, "", "", "java.time.LocalDateTime.class", "updateDatetime", "", false, false,true, "timestamp", 26, 3, "",false,"","", "","","",false,"df.Timestamp")
	updateUserSqlName := new(df.ColumnSqlName)
	updateUserSqlName.ColumnSqlName = "update_user"
	updateUserSqlName.IrregularChar = false
	PurchasePaymentDbm.ColumnUpdateUser = df.CCI(&purchasePayment, "update_user", updateUserSqlName, "", "", "String.class", "updateUser", "", false, false,true, "varchar", 200, 0, "",false,"","", "","","",false,"string")

	PurchasePaymentDbm.ColumnInfoList = new(df.List)
	PurchasePaymentDbm.ColumnInfoList.Add(PurchasePaymentDbm.ColumnPurchasePaymentId)
	PurchasePaymentDbm.ColumnInfoList.Add(PurchasePaymentDbm.ColumnPurchaseId)
	PurchasePaymentDbm.ColumnInfoList.Add(PurchasePaymentDbm.ColumnPaymentAmount)
	PurchasePaymentDbm.ColumnInfoList.Add(PurchasePaymentDbm.ColumnPaymentDatetime)
	PurchasePaymentDbm.ColumnInfoList.Add(PurchasePaymentDbm.ColumnPaymentMethodCode)
	PurchasePaymentDbm.ColumnInfoList.Add(PurchasePaymentDbm.ColumnRegisterDatetime)
	PurchasePaymentDbm.ColumnInfoList.Add(PurchasePaymentDbm.ColumnRegisterUser)
	PurchasePaymentDbm.ColumnInfoList.Add(PurchasePaymentDbm.ColumnUpdateDatetime)
	PurchasePaymentDbm.ColumnInfoList.Add(PurchasePaymentDbm.ColumnUpdateUser)


	PurchasePaymentDbm.ColumnInfoMap=make(map[string]int)
	PurchasePaymentDbm.ColumnInfoMap["purchasePaymentId"]=0
		PurchasePaymentDbm.ColumnInfoMap["purchaseId"]=1
		PurchasePaymentDbm.ColumnInfoMap["paymentAmount"]=2
		PurchasePaymentDbm.ColumnInfoMap["paymentDatetime"]=3
		PurchasePaymentDbm.ColumnInfoMap["paymentMethodCode"]=4
		PurchasePaymentDbm.ColumnInfoMap["registerDatetime"]=5
		PurchasePaymentDbm.ColumnInfoMap["registerUser"]=6
		PurchasePaymentDbm.ColumnInfoMap["updateDatetime"]=7
		PurchasePaymentDbm.ColumnInfoMap["updateUser"]=8
	    PurchasePaymentDbm.PrimaryKey = true
    PurchasePaymentDbm.CompoundPrimaryKey = false
	ui := new(df.UniqueInfo)
	ui.DbMeta = &purchasePayment
	ui.Primary = true
	ui.UniqueColumnList = new(df.List)
	ui.UniqueColumnList.Add(PurchasePaymentDbm.ColumnPurchasePaymentId)

	PurchasePaymentDbm.PrimaryInfo = new(df.PrimaryInfo)
	PurchasePaymentDbm.PrimaryInfo.UniqueInfo = ui
	
	PurchasePaymentDbm.SequenceFlag = true
	PurchasePaymentDbm.SequenceName = "purchase_payment_purchase_payment_id_seq"
	PurchasePaymentDbm.SequenceIncrementSize = 1
	PurchasePaymentDbm.SequenceCacheSize = 0
	var purchasePaymentMeta df.DBMeta = PurchasePaymentDbm
	df.DBMetaInstanceHandler_I.TableDbNameInstanceMap["PurchasePayment"] = &purchasePaymentMeta
}
