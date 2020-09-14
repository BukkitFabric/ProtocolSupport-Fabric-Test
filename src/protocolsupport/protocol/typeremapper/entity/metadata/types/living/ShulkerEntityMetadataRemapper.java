package protocolsupport.protocol.typeremapper.entity.metadata.types.living;

import protocolsupport.protocol.typeremapper.entity.metadata.object.value.NetworkEntityMetadataIndexValueRemapperNoOp;
import protocolsupport.protocol.typeremapper.entity.metadata.types.base.InsentientEntityMetadataRemapper;
import protocolsupport.protocol.types.networkentity.metadata.NetworkEntityMetadataObjectIndex;
import protocolsupport.protocol.utils.ProtocolVersionsHelper;

public class ShulkerEntityMetadataRemapper extends InsentientEntityMetadataRemapper {

	public static final ShulkerEntityMetadataRemapper INSTANCE = new ShulkerEntityMetadataRemapper();

	protected ShulkerEntityMetadataRemapper() {
		addRemap(new NetworkEntityMetadataIndexValueRemapperNoOp(NetworkEntityMetadataObjectIndex.Shulker.DIRECTION, 15), ProtocolVersionsHelper.UP_1_15);
		addRemap(new NetworkEntityMetadataIndexValueRemapperNoOp(NetworkEntityMetadataObjectIndex.Shulker.DIRECTION, 14), ProtocolVersionsHelper.ALL_1_14);
		addRemap(new NetworkEntityMetadataIndexValueRemapperNoOp(NetworkEntityMetadataObjectIndex.Shulker.DIRECTION, 12), ProtocolVersionsHelper.RANGE__1_10__1_13_2);
		addRemap(new NetworkEntityMetadataIndexValueRemapperNoOp(NetworkEntityMetadataObjectIndex.Shulker.DIRECTION, 11), ProtocolVersionsHelper.ALL_1_9);

		addRemap(new NetworkEntityMetadataIndexValueRemapperNoOp(NetworkEntityMetadataObjectIndex.Shulker.ATTACHMENT_POS, 16), ProtocolVersionsHelper.UP_1_15);
		addRemap(new NetworkEntityMetadataIndexValueRemapperNoOp(NetworkEntityMetadataObjectIndex.Shulker.ATTACHMENT_POS, 15), ProtocolVersionsHelper.ALL_1_14);
		addRemap(new NetworkEntityMetadataIndexValueRemapperNoOp(NetworkEntityMetadataObjectIndex.Shulker.ATTACHMENT_POS, 13), ProtocolVersionsHelper.RANGE__1_10__1_13_2);
		addRemap(new NetworkEntityMetadataIndexValueRemapperNoOp(NetworkEntityMetadataObjectIndex.Shulker.ATTACHMENT_POS, 12), ProtocolVersionsHelper.ALL_1_9);

		addRemap(new NetworkEntityMetadataIndexValueRemapperNoOp(NetworkEntityMetadataObjectIndex.Shulker.SHIELD_HEIGHT, 17), ProtocolVersionsHelper.UP_1_15);
		addRemap(new NetworkEntityMetadataIndexValueRemapperNoOp(NetworkEntityMetadataObjectIndex.Shulker.SHIELD_HEIGHT, 16), ProtocolVersionsHelper.ALL_1_14);
		addRemap(new NetworkEntityMetadataIndexValueRemapperNoOp(NetworkEntityMetadataObjectIndex.Shulker.SHIELD_HEIGHT, 14), ProtocolVersionsHelper.RANGE__1_10__1_13_2);
		addRemap(new NetworkEntityMetadataIndexValueRemapperNoOp(NetworkEntityMetadataObjectIndex.Shulker.SHIELD_HEIGHT, 13), ProtocolVersionsHelper.ALL_1_9);

		addRemap(new NetworkEntityMetadataIndexValueRemapperNoOp(NetworkEntityMetadataObjectIndex.Shulker.COLOR, 18), ProtocolVersionsHelper.UP_1_15);
		addRemap(new NetworkEntityMetadataIndexValueRemapperNoOp(NetworkEntityMetadataObjectIndex.Shulker.COLOR, 17), ProtocolVersionsHelper.ALL_1_14);
		addRemap(new NetworkEntityMetadataIndexValueRemapperNoOp(NetworkEntityMetadataObjectIndex.Shulker.COLOR, 15), ProtocolVersionsHelper.RANGE__1_11__1_13_2);
	}

}
