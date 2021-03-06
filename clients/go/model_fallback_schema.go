/*
 * Location API
 *
 * Geolocation, Geocoding and Maps
 *
 * API version: 2.0.0
 * Generated by: OpenAPI Generator (https://openapi-generator.tech)
 */

package unwired

// An array of fallback options to enable or disable.
type FallbackSchema struct {
	All AllSchema `json:"all,omitempty"`
	Ipf IpfSchema `json:"ipf,omitempty"`
	Lacf LacfSchema `json:"lacf,omitempty"`
	Scf ScfSchema `json:"scf,omitempty"`
}
