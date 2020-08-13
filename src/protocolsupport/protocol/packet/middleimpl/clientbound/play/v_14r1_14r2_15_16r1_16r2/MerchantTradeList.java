package protocolsupport.protocol.packet.middleimpl.clientbound.play.v_14r1_14r2_15_16r1_16r2;

import protocolsupport.protocol.ConnectionImpl;
import protocolsupport.protocol.packet.PacketType;
import protocolsupport.protocol.packet.middle.clientbound.play.MiddleMerchantTradeList;
import protocolsupport.protocol.packet.middleimpl.ClientBoundPacketData;
import protocolsupport.protocol.serializer.MerchantDataSerializer;

public class MerchantTradeList extends MiddleMerchantTradeList {

	public MerchantTradeList(ConnectionImpl connection) {
		super(connection);
	}

	@Override
	protected void writeToClient() {
		ClientBoundPacketData merchanttradelist = ClientBoundPacketData.create(PacketType.CLIENTBOUND_PLAY_MERCHANT_TRADE_LIST);
		MerchantDataSerializer.writeMerchantData(merchanttradelist, version, cache.getClientCache().getLocale(), merchantData);
		codec.write(merchanttradelist);
	}

}
