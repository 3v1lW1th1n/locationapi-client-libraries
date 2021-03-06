# unwired - the C# library for the Location API

Geolocation, Geocoding and Maps

This C# SDK is automatically generated by the [OpenAPI Generator](https://openapi-generator.tech) project:

- API version: 2.0.0
- SDK version: 1.0.0
- Build package: org.openapitools.codegen.languages.CSharpClientCodegen

<a name="frameworks-supported"></a>
## Frameworks supported
- .NET 4.0 or later
- Windows Phone 7.1 (Mango)

<a name="dependencies"></a>
## Dependencies
- [RestSharp](https://www.nuget.org/packages/RestSharp) - 105.1.0 or later
- [Json.NET](https://www.nuget.org/packages/Newtonsoft.Json/) - 7.0.0 or later
- [JsonSubTypes](https://www.nuget.org/packages/JsonSubTypes/) - 1.2.0 or later

The DLLs included in the package may not be the latest version. We recommend using [NuGet](https://docs.nuget.org/consume/installing-nuget) to obtain the latest version of the packages:
```
Install-Package RestSharp
Install-Package Newtonsoft.Json
Install-Package JsonSubTypes
```

NOTE: RestSharp versions greater than 105.1.0 have a bug which causes file uploads to fail. See [RestSharp#742](https://github.com/restsharp/RestSharp/issues/742)

<a name="installation"></a>
## Installation
Run the following command to generate the DLL
- [Mac/Linux] `/bin/sh build.sh`
- [Windows] `build.bat`

Then include the DLL (under the `bin` folder) in the C# project, and use the namespaces:
```csharp
using unwired.Api;
using unwired.Client;
using unwired.Model;
```
<a name="packaging"></a>
## Packaging

A `.nuspec` is included with the project. You can follow the Nuget quickstart to [create](https://docs.microsoft.com/en-us/nuget/quickstart/create-and-publish-a-package#create-the-package) and [publish](https://docs.microsoft.com/en-us/nuget/quickstart/create-and-publish-a-package#publish-the-package) packages.

This `.nuspec` uses placeholders from the `.csproj`, so build the `.csproj` directly:

```
nuget pack -Build -OutputDirectory out unwired.csproj
```

Then, publish to a [local feed](https://docs.microsoft.com/en-us/nuget/hosting-packages/local-feeds) or [other host](https://docs.microsoft.com/en-us/nuget/hosting-packages/overview) and consume the new package via Nuget as usual.

<a name="getting-started"></a>
## Getting Started

```csharp
using System;
using System.Diagnostics;
using unwired.Api;
using unwired.Client;
using unwired.Model;

namespace Example
{
    public class Example
    {
        public void main()
        {

            // Configure API key authorization: token
            Configuration.Default.ApiKey.Add("token", "YOUR_API_KEY");
            // Uncomment below to setup prefix (e.g. Bearer) for API key, if needed
            // Configuration.Default.ApiKeyPrefix.Add("token", "Bearer");

            var apiInstance = new BALANCEApi();

            try
            {
                // balance
                Object result = apiInstance.Balance();
                Debug.WriteLine(result);
            }
            catch (Exception e)
            {
                Debug.Print("Exception when calling BALANCEApi.Balance: " + e.Message );
            }

        }
    }
}
```

<a name="documentation-for-api-endpoints"></a>
## Documentation for API Endpoints

All URIs are relative to *https://us1.unwiredlabs.com/v2*

Class | Method | HTTP request | Description
------------ | ------------- | ------------- | -------------
*BALANCEApi* | [**Balance**](docs/BALANCEApi.md#balance) | **GET** /balance.php | balance
*GEOLOCATIONApi* | [**Geolocation**](docs/GEOLOCATIONApi.md#geolocation) | **POST** /process.php | Geolocation
*REVERSEApi* | [**Reverse**](docs/REVERSEApi.md#reverse) | **GET** /reverse.php | Reverse Geocoding
*SEARCHApi* | [**Search**](docs/SEARCHApi.md#search) | **GET** /search.php | Forward Geocoding
*TimezoneApi* | [**Timezone**](docs/TimezoneApi.md#timezone) | **GET** /timezone.php | timezone


<a name="documentation-for-models"></a>
## Documentation for Models

 - [Model.AddressDetailsSchema](docs/AddressDetailsSchema.md)
 - [Model.AddressSchema](docs/AddressSchema.md)
 - [Model.AllSchema](docs/AllSchema.md)
 - [Model.BalanceResponseSchema](docs/BalanceResponseSchema.md)
 - [Model.BtSchema](docs/BtSchema.md)
 - [Model.CellSchema](docs/CellSchema.md)
 - [Model.ErrorSchema](docs/ErrorSchema.md)
 - [Model.FallbackSchema](docs/FallbackSchema.md)
 - [Model.GeolocationAddressSchema](docs/GeolocationAddressSchema.md)
 - [Model.GeolocationErrorSchema](docs/GeolocationErrorSchema.md)
 - [Model.GeolocationResponseSchema](docs/GeolocationResponseSchema.md)
 - [Model.GeolocationSchema](docs/GeolocationSchema.md)
 - [Model.IpfSchema](docs/IpfSchema.md)
 - [Model.LacfSchema](docs/LacfSchema.md)
 - [Model.RadioSchema](docs/RadioSchema.md)
 - [Model.ReverseResponseSchema](docs/ReverseResponseSchema.md)
 - [Model.ScfSchema](docs/ScfSchema.md)
 - [Model.SearchResponseSchema](docs/SearchResponseSchema.md)
 - [Model.TimezoneResponseSchema](docs/TimezoneResponseSchema.md)
 - [Model.TimezoneSchema](docs/TimezoneSchema.md)
 - [Model.WifiSchema](docs/WifiSchema.md)


<a name="documentation-for-authorization"></a>
## Documentation for Authorization

<a name="token"></a>
### token

- **Type**: API key
- **API key parameter name**: token
- **Location**: URL query string

