# unwired.Model.GeolocationResponseSchema
## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**Status** | **string** | If the request is successful, ok is returned. Otherwise error is returned | [optional] 
**Message** | **string** | Any additional information from the server is returned here | [optional] 
**Balance** | **long?** | This represents the remaining balance on the API token. Requests that return error are not charged and do not affect balance | [optional] 
**BalanceSlots** | **long?** | This represents the remaining balance of device slots. Requests that return error are not charged and do not affect balance. If -1 is returned, then observe it as an error while calculating slots balance. This element will only exist if you are on a device plan. | [optional] 
**Lat** | **double?** | The latitude representing the location | [optional] 
**Lon** | **double?** | The longitude representing the location | [optional] 
**Accuracy** | **long?** | The accuracy of the position is returned in meters | [optional] 
**Address** | **string** | The physical address of the location | [optional] 
**AddressDetails** | [**AddressDetailsSchema**](AddressDetailsSchema.md) |  | [optional] 
**Aged** | **int?** | Shown when the location is based on a single measurement or those older than 90 days or is an LAC fallback | [optional] 
**Fallback** | [**FallbackSchema**](FallbackSchema.md) |  | [optional] 

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)

