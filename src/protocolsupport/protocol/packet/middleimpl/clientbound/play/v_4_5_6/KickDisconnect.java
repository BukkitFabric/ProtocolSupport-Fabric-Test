package protocolsupport.protocol.packet.middleimpl.clientbound.play.v_4_5_6;

import protocolsupport.protocol.ConnectionImpl;
import protocolsupport.protocol.packet.PacketType;
import protocolsupport.protocol.packet.middle.clientbound.play.MiddleKickDisconnect;
import protocolsupport.protocol.packet.middleimpl.ClientBoundPacketData;
import protocolsupport.protocol.serializer.StringSerializer;
import protocolsupport.protocol.typeremapper.legacy.LegacyChat;

public class KickDisconnect extends MiddleKickDisconnect {

	public KickDisconnect(ConnectionImpl connection) {
		super(connection);
	}

	@Override
	protected void writeToClient() {
		ClientBoundPacketData kickdisconnect = ClientBoundPacketData.create(PacketType.CLIENTBOUND_PLAY_KICK_DISCONNECT);
		StringSerializer.writeShortUTF16BEString(kickdisconnect, LegacyChat.clampLegacyText(message.toLegacyText(cache.getClientCache().getLocale()), 256));
		codec.write(kickdisconnect);
	}

}
