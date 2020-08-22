package protocolsupport.protocol.packet.middleimpl.clientbound.play.v_4_5_6_7_8_9r1_9r2_10_11_12r1_12r2_13;

import protocolsupport.protocol.ConnectionImpl;
import protocolsupport.protocol.packet.middleimpl.clientbound.play.v_4_5_6_7_8_9r1_9r2_10_11_12r1_12r2_13_14r1_14r2_15.AbstractLegacyStartGame;
import protocolsupport.protocol.storage.netcache.chunk.ChunkCache;

public abstract class AbstractChunkCacheStartGame extends AbstractLegacyStartGame {

	protected final ChunkCache chunkCache = cache.getChunkCache();

	public AbstractChunkCacheStartGame(ConnectionImpl connection) {
		super(connection);
	}

	@Override
	protected void handleReadData() {
		super.handleReadData();
		chunkCache.clear();
	}

}
