package protocolsupport.protocol.packet.middle;

import io.netty.buffer.ByteBuf;

public abstract class ServerBoundMiddlePacket extends MiddlePacket {

	public ServerBoundMiddlePacket(MiddlePacketInit init) {
		super(init);
	}

	public void decode(ByteBuf clientdata) {
		decode0(clientdata);
		cleanup();
	}

	private void decode0(ByteBuf serverdata) {
		try {
			readClientData(serverdata);
			handleReadData();
		} catch (CancelMiddlePacketException e) {
			return;
		}
		writeToServer();
	}

	protected abstract void readClientData(ByteBuf clientdata);

	protected void handleReadData() {
	}

	protected abstract void writeToServer();

	protected void cleanup() {
	}

}
