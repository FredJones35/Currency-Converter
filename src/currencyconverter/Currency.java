package currencyconverter;
/*
public enum Currency {
    USD,
    EUR,
    JPY;
    @Override
    public String toString(){
        switch(this){
            case USD:
                return "USD";
            case EUR:
                return "EUR";
            case JPY:
                return "JPY";  
        }
        return "USD";
    }
    int toCurr(){
        int s = 0;
        switch(this){
            case USD:
                return 0;
            case EUR:
                return 1;
            case JPY:
                return 2;  
        }
        return s;
    }
}
*/

public enum Currency {
    USD("USD"), // United States Dollar
    EUR("EUR"), // Euro
    JPY("JPY"), // Japanese Yen
    GBP("GBP"), // British Pound Sterling
    AUD("AUD"), // Australian Dollar
    CAD("CAD"), // Canadian Dollar
    CHF("CHF"), // Swiss Franc
    CNY("CNY"), // Chinese Yuan Renminbi
    HKD("HKD"), // Hong Kong Dollar
    NZD("NZD"), // New Zealand Dollar
    SEK("SEK"), // Swedish Krona
    KRW("KRW"), // South Korean Won
    SGD("SGD"), // Singapore Dollar
    NOK("NOK"), // Norwegian Krone
    MXN("MXN"), // Mexican Peso
    INR("INR"), // Indian Rupee
    RUB("RUB"), // Russian Ruble
    ZAR("ZAR"), // South African Rand
    TRY("TRY"), // Turkish Lira
    BRL("BRL"), // Brazilian Real
    TWD("TWD"), // Taiwan Dollar
    DKK("DKK"), // Danish Krone
    PLN("PLN"), // Polish Zloty
    THB("THB"), // Thai Baht
    IDR("IDR"), // Indonesian Rupiah
    HUF("HUF"), // Hungarian Forint
    CZK("CZK"), // Czech Koruna
    ILS("ILS"), // Israeli New Shekel
    CLP("CLP"), // Chilean Peso
    PHP("PHP"), // Philippine Peso
    AED("AED"), // UAE Dirham
    COP("COP"), // Colombian Peso
    SAR("SAR"), // Saudi Riyal
    MYR("MYR"), // Malaysian Ringgit
    RON("RON"), // Romanian Leu
    VND("VND"), // Vietnamese Dong
    PKR("PKR"), // Pakistani Rupee
    BDT("BDT"), // Bangladeshi Taka
    NGN("NGN"), // Nigerian Naira
    KES("KES"), // Kenyan Shilling
    EGP("EGP"), // Egyptian Pound
    QAR("QAR"), // Qatari Riyal
    KWD("KWD"), // Kuwaiti Dinar
    BHD("BHD"), // Bahraini Dinar
    OMR("OMR"), // Omani Rial
    LKR("LKR"), // Sri Lankan Rupee
    MMK("MMK"), // Myanmar Kyat
    UAH("UAH"), // Ukrainian Hryvnia
    MAD("MAD"), // Moroccan Dirham
    ARS("ARS"), // Argentine Peso
    PEN("PEN"), // Peruvian Sol
    DZD("DZD"), // Algerian Dinar
    JOD("JOD"), // Jordanian Dinar
    IRR("IRR"), // Iranian Rial
    IQD("IQD"), // Iraqi Dinar
    TND("TND"), // Tunisian Dinar
    ETB("ETB"), // Ethiopian Birr
    UGX("UGX"), // Ugandan Shilling
    GHS("GHS"), // Ghanaian Cedi
    XOF("XOF"), // West African CFA Franc
    XAF("XAF"), // Central African CFA Franc
    XPF("XPF"), // CFP Franc
    BGN("BGN"), // Bulgarian Lev
    HRK("HRK"), // Croatian Kuna
    ISK("ISK"), // Icelandic Krona
    RSD("RSD"), // Serbian Dinar
    MKD("MKD"), // Macedonian Denar
    GEL("GEL"), // Georgian Lari
    AMD("AMD"), // Armenian Dram
    AZN("AZN"), // Azerbaijani Manat
    BYN("BYN"), // Belarusian Ruble
    KZT("KZT"), // Kazakhstani Tenge
    MNT("MNT"), // Mongolian Tugrik,
    LAK("LAK"), // Lao Kip
    NPR("NPR"), // Nepalese Rupee
    MOP("MOP"), // Macanese Pataca
    BOB("BOB"), // Bolivian Boliviano
    PYG("PYG"), // Paraguayan Guarani
    UYU("UYU"), // Uruguayan Peso
    CRC("CRC"), // Costa Rican Colon
    GTQ("GTQ"), // Guatemalan Quetzal
    HNL("HNL"), // Honduran Lempira
    NIO("NIO"), // Nicaraguan Cordoba
    SVC("SVC"), // Salvadoran Colon
    JMD("JMD"), // Jamaican Dollar
    BBD("BBD"), // Barbadian Dollar
    TTD("TTD"), // Trinidad and Tobago Dollar
    BSD("BSD"), // Bahamian Dollar
    KYD("KYD"), // Cayman Islands Dollar
    BZD("BZD"), // Belize Dollar
    FJD("FJD"), // Fiji Dollar
    PGK("PGK"), // Papua New Guinea Kina
    WST("WST"), // Samoan Tala
    TOP("TOP"), // Tongan Paʻanga
    VUV("VUV"), // Vanuatu Vatu
    SCR("SCR"), // Seychelles Rupee
    MUR("MUR"), // Mauritian Rupee
    MVR("MVR"), // Maldivian Rufiyaa
    LSL("LSL"), // Lesotho Loti
    SZL("SZL"), // Eswatini Lilangeni
    BWP("BWP"), // Botswana Pula
    NAD("NAD"), // Namibian Dollar
    ZMW("ZMW"), // Zambian Kwacha
    MWK("MWK"), // Malawian Kwacha
    XCD("XCD"), // East Caribbean Dollar
    TZS("TZS"); // Tanzanian Shilling

    private final String code;

    Currency(String code) {
        this.code = code;
    }

    @Override
    public String toString() {
        return code;
    }
}
