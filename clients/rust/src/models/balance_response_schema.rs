/* 
 * Location API
 *
 * Geolocation, Geocoding and Maps
 *
 * OpenAPI spec version: 2.0.0
 * 
 * Generated by: https://openapi-generator.tech
 */


#[allow(unused_imports)]
use serde_json::Value;

#[derive(Debug, Serialize, Deserialize)]
pub struct BalanceResponseSchema {
  /// If the request is successful, ok is returned. Otherwise error is returned
  #[serde(rename = "status")]
  status: Option<String>,
  /// Remaining balance left in the account for geolocation requests
  #[serde(rename = "balance_geolocation")]
  balance_geolocation: Option<i64>,
  /// Remaining balance left in the account for geocoding requests
  #[serde(rename = "balance_geocoding")]
  balance_geocoding: Option<i64>
}

impl BalanceResponseSchema {
  pub fn new() -> BalanceResponseSchema {
    BalanceResponseSchema {
      status: None,
      balance_geolocation: None,
      balance_geocoding: None
    }
  }

  pub fn set_status(&mut self, status: String) {
    self.status = Some(status);
  }

  pub fn with_status(mut self, status: String) -> BalanceResponseSchema {
    self.status = Some(status);
    self
  }

  pub fn status(&self) -> Option<&String> {
    self.status.as_ref()
  }

  pub fn reset_status(&mut self) {
    self.status = None;
  }

  pub fn set_balance_geolocation(&mut self, balance_geolocation: i64) {
    self.balance_geolocation = Some(balance_geolocation);
  }

  pub fn with_balance_geolocation(mut self, balance_geolocation: i64) -> BalanceResponseSchema {
    self.balance_geolocation = Some(balance_geolocation);
    self
  }

  pub fn balance_geolocation(&self) -> Option<&i64> {
    self.balance_geolocation.as_ref()
  }

  pub fn reset_balance_geolocation(&mut self) {
    self.balance_geolocation = None;
  }

  pub fn set_balance_geocoding(&mut self, balance_geocoding: i64) {
    self.balance_geocoding = Some(balance_geocoding);
  }

  pub fn with_balance_geocoding(mut self, balance_geocoding: i64) -> BalanceResponseSchema {
    self.balance_geocoding = Some(balance_geocoding);
    self
  }

  pub fn balance_geocoding(&self) -> Option<&i64> {
    self.balance_geocoding.as_ref()
  }

  pub fn reset_balance_geocoding(&mut self) {
    self.balance_geocoding = None;
  }

}



