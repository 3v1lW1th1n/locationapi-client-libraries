//
// CellSchema.swift
//
// Generated by openapi-generator
// https://openapi-generator.tech
//

import Foundation


/** You can send 1 to 7 cell ID objects. If your device supports scanning for more than 7 cell objects, reach out to us and we’ll increase this limit on your account. The first cell object has to be that of the serving cell, i.e. the tower the device is connected to. The others are neighbouring cell objects that are visible to the device. Except lac and cid all other parameters mentioned below are optional. Parameters vary depending on the radio type. Supported radio types and their corresponding parameters are */

public struct CellSchema: Codable {

    /** the Location Area Code of your operator’s network. */
    public var lac: Int64?
    /** Cell ID */
    public var cid: Int64?
    public var radio: RadioSchema?
    /** \&quot;Mobile Country Code of your operator’s network represented by an integer (Optional). Range: 0 to 999.\&quot; */
    public var mcc: Int64?
    /** Mobile Network Code of your operator’s network represented by an integer (Optional). Range: 0 to 999. On CDMA, provide the System ID or SID, with range: 1 to 32767. */
    public var mnc: Int64?
    /** Signal Strength (RSSI) */
    public var signal: Int64?
    /** Primary Scrambling Code */
    public var psc: Int64?
    /** Arbitrary Strength Unit */
    public var asu: Int64?
    /** Timing Advance */
    public var ta: Int64?

    public init(lac: Int64?, cid: Int64?, radio: RadioSchema?, mcc: Int64?, mnc: Int64?, signal: Int64?, psc: Int64?, asu: Int64?, ta: Int64?) {
        self.lac = lac
        self.cid = cid
        self.radio = radio
        self.mcc = mcc
        self.mnc = mnc
        self.signal = signal
        self.psc = psc
        self.asu = asu
        self.ta = ta
    }


}

