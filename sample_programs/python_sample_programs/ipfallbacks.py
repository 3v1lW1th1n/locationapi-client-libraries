from __future__ import print_function
import time
import unwired
from unwired.rest import ApiException
from pprint import pprint

# create an instance of the API class
api_instance = unwired.GEOLOCATIONApi()

#Fallback Schema
f=unwired.FallbackSchema(ipf=1)

# GeolocationSchema | 
geolocation_schema = unwired.GeolocationSchema(token="YOUR_API_KEY",
    ip="49.204.218.106",fallbacks=f,
    address=1) 

try:
    # Geolocation
    api_response = api_instance.geolocation(geolocation_schema)
    pprint(api_response)
except ApiException as e:
    print("Exception when calling GEOLOCATIONApi->geolocation: %s\n" % e)
