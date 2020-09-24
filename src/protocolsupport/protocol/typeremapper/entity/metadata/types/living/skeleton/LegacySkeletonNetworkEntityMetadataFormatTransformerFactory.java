package protocolsupport.protocol.typeremapper.entity.metadata.types.living.skeleton;

import protocolsupport.api.ProtocolVersion;
import protocolsupport.protocol.typeremapper.entity.metadata.object.value.NetworkEntityMetadataInsentientAttackingToLegacySwingingHandsTransformer;
import protocolsupport.protocol.typeremapper.entity.metadata.types.base.InsentientNetworkEntityMetadataFormatTransformerFactory;
import protocolsupport.protocol.utils.ProtocolVersionsHelper;

public class LegacySkeletonNetworkEntityMetadataFormatTransformerFactory extends InsentientNetworkEntityMetadataFormatTransformerFactory {

	public static final LegacySkeletonNetworkEntityMetadataFormatTransformerFactory INSTANCE = new LegacySkeletonNetworkEntityMetadataFormatTransformerFactory();

	protected LegacySkeletonNetworkEntityMetadataFormatTransformerFactory() {
		addTransformer(new NetworkEntityMetadataInsentientAttackingToLegacySwingingHandsTransformer(12), ProtocolVersionsHelper.RANGE__1_11__1_13_2);
		addTransformer(new NetworkEntityMetadataInsentientAttackingToLegacySwingingHandsTransformer(13), ProtocolVersion.MINECRAFT_1_10);
		addTransformer(new NetworkEntityMetadataInsentientAttackingToLegacySwingingHandsTransformer(12), ProtocolVersionsHelper.ALL_1_9);
	}

}