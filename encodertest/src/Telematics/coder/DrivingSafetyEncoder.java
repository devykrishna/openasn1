/*  
 *   This file was generated by openASN.1 - an open source ASN.1 toolkit for java
 *
 *   openASN.1 is Copyright (C) 2007 Clayton Hoss, Marc Weyland
 *
 *   openASN.1 is free software: you can redistribute it and/or modify
 *   it under the terms of the GNU Lesser General Public License as 
 *   published by the Free Software Foundation, either version 3 of 
 *   the License, or (at your option) any later version.
 *
 *   openASN.1 is distributed in the hope that it will be useful,
 *   but WITHOUT ANY WARRANTY; without even the implied warranty of
 *   MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE. See the
 *   GNU Lesser General Public License for more details.
 *
 *   You should have received a copy of the GNU Lesser General Public License
 *   along with openASN.1. If not, see <http://www.gnu.org/licenses/>.
 * 
 */
package Telematics.coder;

import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;

import org.openasn1.codec.coder.ASN1Encoder;
import org.openasn1.codec.coder.typecoder.*;
import Telematics.om.*;

public class DrivingSafetyEncoder extends TypeEncoder<DrivingSafety> {
	public DrivingSafetyEncoder(DrivingSafety encodable, TypeInformation typeInformation) {
		super(encodable, typeInformation);
	}
	HashMap<SrsStatus, EnumeratedItemTypeInformation> enumTypeMapSrsStatus = SrsStatusTypeInformation.getEnumTypeMap();
	HashMap<DoorStatus, EnumeratedItemTypeInformation> enumTypeMapDoorStatusD = DoorStatusTypeInformation.getEnumTypeMap();
	HashMap<DoorStatus, EnumeratedItemTypeInformation> enumTypeMapDoorStatusDR = DoorStatusTypeInformation.getEnumTypeMap();
	HashMap<DoorStatus, EnumeratedItemTypeInformation> enumTypeMapDoorStatusPR = DoorStatusTypeInformation.getEnumTypeMap();
	HashMap<DoorStatus, EnumeratedItemTypeInformation> enumTypeMapDoorStatusP = DoorStatusTypeInformation.getEnumTypeMap();
	HashMap<DoorLockedStatus, EnumeratedItemTypeInformation> enumTypeMapDoorLockedStatusD = DoorLockedStatusTypeInformation.getEnumTypeMap();
	HashMap<DoorLockedStatus, EnumeratedItemTypeInformation> enumTypeMapDoorLockedStatusDR = DoorLockedStatusTypeInformation.getEnumTypeMap();
	HashMap<DoorLockedStatus, EnumeratedItemTypeInformation> enumTypeMapDoorLockedStatusP = DoorLockedStatusTypeInformation.getEnumTypeMap();
	HashMap<DoorLockedStatus, EnumeratedItemTypeInformation> enumTypeMapDoorLockedStatusPR = DoorLockedStatusTypeInformation.getEnumTypeMap();
	HashMap<HandBrakeStatus, EnumeratedItemTypeInformation> enumTypeMapHandBrakeStatus = HandBrakeStatusTypeInformation.getEnumTypeMap();	
	HashMap<ElectricParkBrakeStatus, EnumeratedItemTypeInformation> enumTypeMapElectricParkBrake = ElectricParkBrakeStatusTypeInformation.getEnumTypeMap();
	HashMap<TrunkStatus, EnumeratedItemTypeInformation> enumTypeMapTrunkStatus = TrunkStatusTypeInformation.getEnumTypeMap();
	HashMap<EngineHoodStatus, EnumeratedItemTypeInformation> enumTypeMapEngineHoodStatus = EngineHoodStatusTypeInformation.getEnumTypeMap();
	HashMap<CentralLockingStatus, EnumeratedItemTypeInformation> enumTypeMapCentralLockingStatus = CentralLockingStatusTypeInformation.getEnumTypeMap();
	@Override
	public void encode(ASN1Encoder encoder) throws IOException {
		ArrayList<TypeEncoder> componentEncoderList = new ArrayList<TypeEncoder>();

		componentEncoderList.add(
new SrsStatusEncoder(enumTypeMapSrsStatus, getEncodable().getSrsStatus(), DrivingSafetyTypeInformation._srsStatusTypeInformation.getTypeInformation())
);
		componentEncoderList.add(
new DoorStatusEncoder(enumTypeMapDoorStatusD, getEncodable().getDoorOpenStatusDriver(), DrivingSafetyTypeInformation._doorOpenStatusDriverTypeInformation.getTypeInformation())
);
		componentEncoderList.add(
new DoorStatusEncoder(enumTypeMapDoorStatusP, getEncodable().getDoorOpenStatusPassenger(), DrivingSafetyTypeInformation._doorOpenStatusPassengerTypeInformation.getTypeInformation())
);
		componentEncoderList.add(
new DoorStatusEncoder(enumTypeMapDoorStatusDR, getEncodable().getDoorOpenStatusDriverRear(), DrivingSafetyTypeInformation._doorOpenStatusDriverRearTypeInformation.getTypeInformation())
);
		componentEncoderList.add(
new DoorStatusEncoder(enumTypeMapDoorStatusPR, getEncodable().getDoorOpenStatusPassengerRear(), DrivingSafetyTypeInformation._doorOpenStatusPassengerRearTypeInformation.getTypeInformation())
);
		componentEncoderList.add(
new DoorLockedStatusEncoder(enumTypeMapDoorLockedStatusD, getEncodable().getDoorLockStatusDriver(), DrivingSafetyTypeInformation._doorLockStatusDriverTypeInformation.getTypeInformation())
);
		componentEncoderList.add(
new DoorLockedStatusEncoder(enumTypeMapDoorLockedStatusP, getEncodable().getDoorLockStatusPassenger(), DrivingSafetyTypeInformation._doorLockStatusPassengerTypeInformation.getTypeInformation())
);
		componentEncoderList.add(
new DoorLockedStatusEncoder(enumTypeMapDoorLockedStatusDR, getEncodable().getDoorLockStatusDriverRear(), DrivingSafetyTypeInformation._doorLockStatusDriverRearTypeInformation.getTypeInformation())
);
		componentEncoderList.add(
new DoorLockedStatusEncoder(enumTypeMapDoorLockedStatusPR, getEncodable().getDoorLockStatusPassengerRear(), DrivingSafetyTypeInformation._doorLockStatusPassengerRearTypeInformation.getTypeInformation())
);
		componentEncoderList.add(
new BooleanEncoder(getEncodable().getSeatBeltStatusDriver(), DrivingSafetyTypeInformation._seatBeltStatusDriverTypeInformation.getTypeInformation())
);
		componentEncoderList.add(
new BooleanEncoder(getEncodable().getSeatBeltStatusPassenger(), DrivingSafetyTypeInformation._seatBeltStatusPassengerTypeInformation.getTypeInformation())
);
		componentEncoderList.add(
new BooleanEncoder(getEncodable().getSeatBeltStatusDriverRear(), DrivingSafetyTypeInformation._seatBeltStatusDriverRearTypeInformation.getTypeInformation())
);
		componentEncoderList.add(
new BooleanEncoder(getEncodable().getSeatBeltStatusPassengerRear(), DrivingSafetyTypeInformation._seatBeltStatusPassengerRearTypeInformation.getTypeInformation())
);
		componentEncoderList.add(
new HandBrakeStatusEncoder(enumTypeMapHandBrakeStatus, getEncodable().getHandBrakeStatus(), DrivingSafetyTypeInformation._handBrakeStatusTypeInformation.getTypeInformation())
);
		componentEncoderList.add(
new ElectricParkBrakeStatusEncoder(enumTypeMapElectricParkBrake, getEncodable().getElectricParkBrakeStatus(), DrivingSafetyTypeInformation._electricParkBrakeStatusTypeInformation.getTypeInformation())
);
		componentEncoderList.add(
new TimeStampEncoder(getEncodable().getTimeStamp(), DrivingSafetyTypeInformation._timeStampTypeInformation.getTypeInformation())
);
		componentEncoderList.add(
new TrunkStatusEncoder(enumTypeMapTrunkStatus, getEncodable().getTrunkOpenStatus(), DrivingSafetyTypeInformation._trunkOpenStatusTypeInformation.getTypeInformation())
);
		componentEncoderList.add(
new EngineHoodStatusEncoder(enumTypeMapEngineHoodStatus, getEncodable().getEngineHoodOpenStatus(), DrivingSafetyTypeInformation._engineHoodOpenStatusTypeInformation.getTypeInformation())
);
		componentEncoderList.add(
new CentralLockingStatusEncoder(enumTypeMapCentralLockingStatus, getEncodable().getCentralLockingStatus(), DrivingSafetyTypeInformation._centralLockingStatusTypeInformation.getTypeInformation())
);

		encoder.encodeAsSequence(componentEncoderList, getTypeInformation());
	}
}
