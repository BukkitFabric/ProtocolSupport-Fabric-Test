package protocolsupport.protocol.packet.middleimpl.clientbound.play.v_7_8_9r1_9r2_10_11_12r1_12r2_13_14r1_14r2_15_16r1_16r2;

import protocolsupport.protocol.ConnectionImpl;
import protocolsupport.protocol.packet.PacketType;
import protocolsupport.protocol.packet.middle.clientbound.play.MiddleKickDisconnect;
import protocolsupport.protocol.packet.middleimpl.ClientBoundPacketData;
import protocolsupport.protocol.serializer.StringSerializer;
import protocolsupport.protocol.serializer.chat.ChatSerializer;

public class KickDisconnect extends MiddleKickDisconnect {

	public KickDisconnect(ConnectionImpl connection) {
		super(connection);
	}

	@Override
	protected void writeToClient() {
		ClientBoundPacketData kickdisconnect = ClientBoundPacketData.create(PacketType.CLIENTBOUND_PLAY_KICK_DISCONNECT);
		StringSerializer.writeVarIntUTF8String(kickdisconnect, ChatSerializer.serialize(version, cache.getClientCache().getLocale(), message));
		codec.write(kickdisconnect);
	}

}
