#import <Foundation/Foundation.h>
#import "OAIObject.h"

/**
* Location API
* Geolocation, Geocoding and Maps
*
* OpenAPI spec version: 2.0.0
* 
*
* NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
* https://openapi-generator.tech
* Do not edit the class manually.
*/





@protocol OAITimezoneSchema
@end

@interface OAITimezoneSchema : OAIObject

/* Short name of the Timezone [optional]
 */
@property(nonatomic) NSString* shortName;
/* The offset from UTC (in seconds) for the given location. Considers DST savings. [optional]
 */
@property(nonatomic) NSNumber* offsetSec;
/* Represents whether the zone currently observing DST or not [optional]
 */
@property(nonatomic) NSString* nowInDst;
/* Timezone name of the Location [optional]
 */
@property(nonatomic) NSString* name;

@end
