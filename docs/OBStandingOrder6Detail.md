

# OBStandingOrder6Detail


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**accountId** | **String** | A unique and immutable identifier used to identify the account resource. This identifier has no meaning to the account owner. |  |
|**standingOrderId** | **String** | A unique and immutable identifier used to identify the standing order resource. This identifier has no meaning to the account owner. |  [optional] |
|**frequency** | **String** | Individual Definitions: NotKnown - Not Known EvryDay - Every day EvryWorkgDay - Every working day IntrvlDay - An interval specified in number of calendar days (02 to 31) IntrvlWkDay - An interval specified in weeks (01 to 09), and the day within the week (01 to 07) WkInMnthDay - A monthly interval, specifying the week of the month (01 to 05) and day within the week (01 to 07) IntrvlMnthDay - An interval specified in months (between 01 to 06, 12, 24), specifying the day within the month (-05 to -01, 01 to 31) QtrDay - Quarterly (either ENGLISH, SCOTTISH, or RECEIVED) ENGLISH &#x3D; Paid on the 25th March, 24th June, 29th September and 25th December. SCOTTISH &#x3D; Paid on the 2nd February, 15th May, 1st August and 11th November. RECEIVED &#x3D; Paid on the 20th March, 19th June, 24th September and 20th December. Individual Patterns: NotKnown (ScheduleCode) EvryDay (ScheduleCode) EvryWorkgDay (ScheduleCode) IntrvlDay:NoOfDay (ScheduleCode + NoOfDay) IntrvlWkDay:IntervalInWeeks:DayInWeek (ScheduleCode + IntervalInWeeks + DayInWeek) WkInMnthDay:WeekInMonth:DayInWeek (ScheduleCode + WeekInMonth + DayInWeek) IntrvlMnthDay:IntervalInMonths:DayInMonth (ScheduleCode + IntervalInMonths + DayInMonth) QtrDay: + either (ENGLISH, SCOTTISH or RECEIVED) ScheduleCode + QuarterDay The regular expression for this element combines five smaller versions for each permitted pattern. To aid legibility - the components are presented individually here: NotKnown EvryDay EvryWorkgDay IntrvlDay:((0[2-9])|([1-2][0-9])|3[0-1]) IntrvlWkDay:0[1-9]:0[1-7] WkInMnthDay:0[1-5]:0[1-7] IntrvlMnthDay:(0[1-6]|12|24):(-0[1-5]|0[1-9]|[12][0-9]|3[01]) QtrDay:(ENGLISH|SCOTTISH|RECEIVED) Full Regular Expression: ^(NotKnown)$|^(EvryDay)$|^(EvryWorkgDay)$|^(IntrvlDay:((0[2-9])|([1-2][0-9])|3[0-1]))$|^(IntrvlWkDay:0[1-9]:0[1-7])$|^(WkInMnthDay:0[1-5]:0[1-7])$|^(IntrvlMnthDay:(0[1-6]|12|24):(-0[1-5]|0[1-9]|[12][0-9]|3[01]))$|^(QtrDay:(ENGLISH|SCOTTISH|RECEIVED))$ |  |
|**reference** | **String** | Unique reference, as assigned by the creditor, to unambiguously refer to the payment transaction. Usage: If available, the initiating party should provide this reference in the structured remittance information, to enable reconciliation by the creditor upon receipt of the amount of money. If the business context requires the use of a creditor reference or a payment remit identification, and only one identifier can be passed through the end-to-end chain, the creditor&#39;s reference or payment remittance identification should be quoted in the end-to-end transaction identification. |  [optional] |
|**firstPaymentDateTime** | **OffsetDateTime** | The date on which the first payment for a Standing Order schedule will be made.All dates in the JSON payloads are represented in ISO 8601 date-time format.  All date-time fields in responses must include the timezone. An example is below: 2017-04-05T10:43:07+00:00 |  [optional] |
|**nextPaymentDateTime** | **OffsetDateTime** | The date on which the next payment for a Standing Order schedule will be made.All dates in the JSON payloads are represented in ISO 8601 date-time format.  All date-time fields in responses must include the timezone. An example is below: 2017-04-05T10:43:07+00:00 |  [optional] |
|**lastPaymentDateTime** | **OffsetDateTime** | The date on which the last (most recent) payment for a Standing Order schedule was made.All dates in the JSON payloads are represented in ISO 8601 date-time format.  All date-time fields in responses must include the timezone. An example is below: 2017-04-05T10:43:07+00:00 |  [optional] |
|**finalPaymentDateTime** | **OffsetDateTime** | The date on which the final payment for a Standing Order schedule will be made.All dates in the JSON payloads are represented in ISO 8601 date-time format.  All date-time fields in responses must include the timezone. An example is below: 2017-04-05T10:43:07+00:00 |  [optional] |
|**numberOfPayments** | **String** | Number of the payments that will be made in completing this frequency sequence including any executed since the sequence start date. |  [optional] |
|**standingOrderStatusCode** | **OBExternalStandingOrderStatus1Code** |  |  [optional] |
|**firstPaymentAmount** | [**OBActiveOrHistoricCurrencyAndAmount2**](OBActiveOrHistoricCurrencyAndAmount2.md) |  |  [optional] |
|**nextPaymentAmount** | [**OBActiveOrHistoricCurrencyAndAmount3**](OBActiveOrHistoricCurrencyAndAmount3.md) |  |  [optional] |
|**lastPaymentAmount** | [**OBActiveOrHistoricCurrencyAndAmount11**](OBActiveOrHistoricCurrencyAndAmount11.md) |  |  [optional] |
|**finalPaymentAmount** | [**OBActiveOrHistoricCurrencyAndAmount4**](OBActiveOrHistoricCurrencyAndAmount4.md) |  |  [optional] |
|**creditorAgent** | [**OBBranchAndFinancialInstitutionIdentification51**](OBBranchAndFinancialInstitutionIdentification51.md) |  |  [optional] |
|**creditorAccount** | [**OBCashAccount51**](OBCashAccount51.md) |  |  |
|**supplementaryData** | **Map&lt;String, Object&gt;** | Additional information that can not be captured in the structured fields and/or any other specific block. |  [optional] |



