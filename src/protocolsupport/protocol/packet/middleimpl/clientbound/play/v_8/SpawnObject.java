package protocolsupport.protocol.packet.middleimpl.clientbound.play.v_8;

import protocolsupport.protocol.packet.PacketType;
import protocolsupport.protocol.packet.middleimpl.ClientBoundPacketData;
import protocolsupport.protocol.packet.middleimpl.clientbound.play.v_4_5_6_7_8_9r1_9r2_10_11_12r1_12r2_13_14r1_14r2_15.AbstractThunderboltSpawnObject;
import protocolsupport.protocol.serializer.VarNumberSerializer;
import protocolsupport.protocol.typeremapper.legacy.LegacyEntityId;

public class SpawnObject extends AbstractThunderboltSpawnObject {

	public SpawnObject(MiddlePacketInit init) {
		super(init);
	}

	@Override
	protected void writeSpawnObject() {
		ClientBoundPacketData spawnobject = ClientBoundPacketData.create(PacketType.CLIENTBOUND_PLAY_SPAWN_OBJECT);
		VarNumberSerializer.writeVarInt(spawnobject, entity.getId());
		spawnobject.writeByte(LegacyEntityId.getObjectIntId(rType));
		spawnobject.writeInt((int) (x * 32));
		spawnobject.writeInt((int) (y * 32));
		spawnobject.writeInt((int) (z * 32));
		spawnobject.writeByte(pitch);
		spawnobject.writeByte(yaw);
		spawnobject.writeInt(rObjectdata);
		if (rObjectdata > 0) {
			spawnobject.writeShort(motX);
			spawnobject.writeShort(motY);
			spawnobject.writeShort(motZ);
		}
		codec.write(spawnobject);
	}

	@Override
	protected void writeSpawnThunderbolt() {
		ClientBoundPacketData spawnglobal = ClientBoundPacketData.create(PacketType.CLIENTBOUND_LEGACY_PLAY_SPAWN_GLOBAL);
		VarNumberSerializer.writeVarInt(spawnglobal, entity.getId());
		spawnglobal.writeByte(1);
		spawnglobal.writeInt((int) (x * 32));
		spawnglobal.writeInt((int) (y * 32));
		spawnglobal.writeInt((int) (z * 32));
		codec.write(spawnglobal);
	}

}
