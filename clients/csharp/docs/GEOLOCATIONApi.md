# unwired.Api.GEOLOCATIONApi

All URIs are relative to *https://us1.unwiredlabs.com/v2*

Method | HTTP request | Description
------------- | ------------- | -------------
[**Geolocation**](GEOLOCATIONApi.md#geolocation) | **POST** /process.php | Geolocation


<a name="geolocation"></a>
# **Geolocation**
> Object Geolocation (GeolocationSchema geolocationSchema)

Geolocation

The Geolocation API helps developers locate IoT, M2M and other connected devices anywhere in the world without GPS. The device first sends the API data about which Cellular networks and WiFi networks it can see nearby. The API then uses Unwired Labs’ large datasets of Cell towers, WiFi networks backed by numerous algorithms to calculate and return the device’s location

### Example
```csharp
using System;
using System.Diagnostics;
using unwired.Api;
using unwired.Client;
using unwired.Model;

namespace Example
{
    public class GeolocationExample
    {
        public void main()
        {
            var apiInstance = new GEOLOCATIONApi();
            var geolocationSchema = new GeolocationSchema(); // GeolocationSchema | 

            try
            {
                // Geolocation
                Object result = apiInstance.Geolocation(geolocationSchema);
                Debug.WriteLine(result);
            }
            catch (Exception e)
            {
                Debug.Print("Exception when calling GEOLOCATIONApi.Geolocation: " + e.Message );
            }
        }
    }
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **geolocationSchema** | [**GeolocationSchema**](GeolocationSchema.md)|  | 

### Return type

**Object**

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

