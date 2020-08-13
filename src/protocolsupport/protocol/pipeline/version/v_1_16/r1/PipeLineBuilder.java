package protocolsupport.protocol.pipeline.version.v_1_16.r1;

import io.netty.channel.Channel;
import io.netty.channel.ChannelPipeline;
import protocolsupport.protocol.ConnectionImpl;
import protocolsupport.protocol.pipeline.ChannelHandlers;
import protocolsupport.protocol.pipeline.version.util.builder.AbstractVarIntFramingPipeLineBuilder;

public class PipeLineBuilder extends AbstractVarIntFramingPipeLineBuilder {

	@Override
	public void buildCodec(Channel channel, ConnectionImpl connection) {
		ChannelPipeline pipeline = channel.pipeline();
		PacketDecoder decoder = new PacketDecoder(connection);
		PacketEncoder encoder = new PacketEncoder(connection);
		pipeline.addAfter(ChannelHandlers.RAW_CAPTURE_RECEIVE, ChannelHandlers.DECODER_TRANSFORMER, decoder);
		pipeline.addAfter(ChannelHandlers.RAW_CAPTURE_SEND, ChannelHandlers.ENCODER_TRANSFORMER, encoder);
		connection.initCodec(PacketCodec.instance, encoder, decoder);
	}

}
