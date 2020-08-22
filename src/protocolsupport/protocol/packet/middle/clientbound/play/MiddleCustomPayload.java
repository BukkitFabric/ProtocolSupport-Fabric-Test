package protocolsupport.protocol.packet.middle.clientbound.play;

import io.netty.buffer.ByteBuf;
import protocolsupport.protocol.packet.middle.ClientBoundMiddlePacket;
import protocolsupport.protocol.serializer.StringSerializer;

public abstract class MiddleCustomPayload extends ClientBoundMiddlePacket {

	public MiddleCustomPayload(MiddlePacketInit init) {
		super(init);
	}

	protected String tag;
	protected ByteBuf data;

	@Override
	protected void readServerData(ByteBuf serverdata) {
		tag = StringSerializer.readVarIntUTF8String(serverdata);
		data = serverdata.readSlice(serverdata.readableBytes());
	}

}
