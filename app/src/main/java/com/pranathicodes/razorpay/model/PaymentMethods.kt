package com.pranathicodes.razorpay.model

import com.google.gson.annotations.SerializedName

data class PaymentMethods (

    @SerializedName("amex"                ) var amex              : Boolean?           = null,
    @SerializedName("app"                 ) var app               : App?               = App(),
    @SerializedName("card"                ) var card              : Boolean?           = null,
    @SerializedName("card_networks"       ) var cardNetworks      : CardNetworks?      = CardNetworks(),
    @SerializedName("card_subtype"        ) var cardSubtype       : CardSubtype?       = CardSubtype(),
    @SerializedName("cod"                 ) var cod               : Boolean?           = null,
    @SerializedName("credit_card"         ) var creditCard        : Boolean?           = null,
    @SerializedName("debit_card"          ) var debitCard         : Boolean?           = null,
    @SerializedName("entity"              ) var entity            : String?            = null,
    @SerializedName("google_pay_cards"    ) var googlePayCards    : Boolean?           = null,
    @SerializedName("gpay"                ) var gpay              : Boolean?           = null,
    @SerializedName("nach"                ) var nach              : Boolean?           = null,
    @SerializedName("netbanking"          ) var netbanking        : Netbanking?        = Netbanking(),
    @SerializedName("offline"             ) var offline           : Boolean?           = null,
    @SerializedName("paylater"            ) var paylater          : Paylater?          = Paylater(),
    @SerializedName("prepaid_card"        ) var prepaidCard       : Boolean?           = null,
    @SerializedName("sodexo"              ) var sodexo            : Boolean?           = null,
    @SerializedName("upi"                 ) var upi               : Boolean?           = null,
    @SerializedName("upi_intent"          ) var upiIntent         : Boolean?           = null,
    @SerializedName("upi_type"            ) var upiType           : UpiType?           = UpiType(),
    @SerializedName("wallet"              ) var wallet            : Wallet?            = Wallet()

)

data class App (

    @SerializedName("cred"    ) var cred    : Int? = 0,
    @SerializedName("giropay" ) var giropay : Int? = 0,
    @SerializedName("poli"    ) var poli    : Int? = 0,
    @SerializedName("sofort"  ) var sofort  : Int? = 0,
    @SerializedName("trustly" ) var trustly : Int? = 0,
    @SerializedName("twid"    ) var twid    : Int? = 0

)

data class CardNetworks (

    @SerializedName("AMEX"  ) var AMEX  : Int? = 0,
    @SerializedName("BAJAJ" ) var BAJAJ : Int? = 0,
    @SerializedName("DICL"  ) var DICL  : Int? = 0,
    @SerializedName("JCB"   ) var JCB   : Int? = 0,
    @SerializedName("MAES"  ) var MAES  : Int? = 0,
    @SerializedName("MC"    ) var MC    : Int? = 0,
    @SerializedName("RUPAY" ) var RUPAY : Int? = 0,
    @SerializedName("UNP"   ) var UNP   : Int? = 0,
    @SerializedName("VISA"  ) var VISA  : Int? = 0

)

data class CardSubtype (

    @SerializedName("business" ) var business : Int? = null,
    @SerializedName("consumer" ) var consumer : Int? = null,
    @SerializedName("premium"  ) var premium  : Int? = null

)

data class Netbanking (

    @SerializedName("AIRP"   ) var AIRP  : String? = null,
    @SerializedName("ALLA"   ) var ALLA  : String? = null,
    @SerializedName("AUBL"   ) var AUBL  : String? = null,
    @SerializedName("BARB_R" ) var BARBR : String? = null,
    @SerializedName("CBIN"   ) var CBIN  : String? = null,
    @SerializedName("CNRB"   ) var CNRB  : String? = null,
    @SerializedName("CORP"   ) var CORP  : String? = null,
    @SerializedName("CSBK"   ) var CSBK  : String? = null,
    @SerializedName("DCBL"   ) var DCBL  : String? = null,
    @SerializedName("DEUT"   ) var DEUT  : String? = null,
    @SerializedName("DLXB"   ) var DLXB  : String? = null,
    @SerializedName("ESFB"   ) var ESFB  : String? = null,
    @SerializedName("FSFB"   ) var FSFB  : String? = null,
    @SerializedName("IBKL"   ) var IBKL  : String? = null,
    @SerializedName("IDFB"   ) var IDFB  : String? = null,
    @SerializedName("IDIB"   ) var IDIB  : String? = null,
    @SerializedName("INDB"   ) var INDB  : String? = null,
    @SerializedName("IOBA"   ) var IOBA  : String? = null,
    @SerializedName("JAKA"   ) var JAKA  : String? = null,
    @SerializedName("JSFB"   ) var JSFB  : String? = null,
    @SerializedName("KARB"   ) var KARB  : String? = null,
    @SerializedName("KVBL"   ) var KVBL  : String? = null,
    @SerializedName("LAVB_R" ) var LAVBR : String? = null,
    @SerializedName("MAHB"   ) var MAHB  : String? = null,
    @SerializedName("NSPB"   ) var NSPB  : String? = null,
    @SerializedName("ORBC"   ) var ORBC  : String? = null,
    @SerializedName("PSIB"   ) var PSIB  : String? = null,
    @SerializedName("PUNB_R" ) var PUNBR : String? = null,
    @SerializedName("RATN"   ) var RATN  : String? = null,
    @SerializedName("SIBL"   ) var SIBL  : String? = null,
    @SerializedName("SRCB"   ) var SRCB  : String? = null,
    @SerializedName("SVCB"   ) var SVCB  : String? = null,
    @SerializedName("TMBL"   ) var TMBL  : String? = null,
    @SerializedName("UBIN"   ) var UBIN  : String? = null,
    @SerializedName("UCBA"   ) var UCBA  : String? = null,
    @SerializedName("UJVN"   ) var UJVN  : String? = null,
    @SerializedName("UTBI"   ) var UTBI  : String? = null,
    @SerializedName("VIJB"   ) var VIJB  : String? = null,
    @SerializedName("YESB"   ) var YESB  : String? = null

)

data class Paylater (

    @SerializedName("amazonpay"     ) var amazonpay    : Boolean? = null,
    @SerializedName("epaylater"     ) var epaylater    : Boolean? = null,
    @SerializedName("getsimpl"      ) var getsimpl     : Boolean? = null,
    @SerializedName("hdfc"          ) var hdfc         : Boolean? = null,
    @SerializedName("icic"          ) var icic         : Boolean? = null,
    @SerializedName("kkbk"          ) var kkbk         : Boolean? = null,
    @SerializedName("lazypay"       ) var lazypay      : Boolean? = null,
    @SerializedName("rzpx_postpaid" ) var rzpxPostpaid : Boolean? = null

)

data class UpiType (

    @SerializedName("collect" ) var collect : Int? = null,
    @SerializedName("intent"  ) var intent  : Int? = null

)

data class Wallet (

    @SerializedName("airtelmoney" ) var airtelmoney : Boolean? = null,
    @SerializedName("freecharge"  ) var freecharge  : Boolean? = null,
    @SerializedName("jiomoney"    ) var jiomoney    : Boolean? = null,
    @SerializedName("mobikwik"    ) var mobikwik    : Boolean? = null,
    @SerializedName("olamoney"    ) var olamoney    : Boolean? = null

)


