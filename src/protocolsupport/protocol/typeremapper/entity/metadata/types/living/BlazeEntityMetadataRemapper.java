package protocolsupport.protocol.typeremapper.entity.metadata.types.living;

import protocolsupport.protocol.typeremapper.entity.metadata.object.value.NetworkEntityMetadataIndexValueRemapperNoOp;
import protocolsupport.protocol.typeremapper.entity.metadata.types.base.InsentientEntityMetadataRemapper;
import protocolsupport.protocol.types.networkentity.metadata.NetworkEntityMetadataObjectIndex;
import protocolsupport.protocol.utils.ProtocolVersionsHelper;

public class BlazeEntityMetadataRemapper extends InsentientEntityMetadataRemapper {

	public static final BlazeEntityMetadataRemapper INSTANCE = new BlazeEntityMetadataRemapper();

	protected BlazeEntityMetadataRemapper() {
		addRemap(new NetworkEntityMetadataIndexValueRemapperNoOp(NetworkEntityMetadataObjectIndex.Blaze.ON_FIRE, 15), ProtocolVersionsHelper.UP_1_15);
		addRemap(new NetworkEntityMetadataIndexValueRemapperNoOp(NetworkEntityMetadataObjectIndex.Blaze.ON_FIRE, 14), ProtocolVersionsHelper.ALL_1_14);
		addRemap(new NetworkEntityMetadataIndexValueRemapperNoOp(NetworkEntityMetadataObjectIndex.Blaze.ON_FIRE, 12), ProtocolVersionsHelper.RANGE__1_10__1_13_2);
		addRemap(new NetworkEntityMetadataIndexValueRemapperNoOp(NetworkEntityMetadataObjectIndex.Blaze.ON_FIRE, 11), ProtocolVersionsHelper.ALL_1_9);
		addRemap(new NetworkEntityMetadataIndexValueRemapperNoOp(NetworkEntityMetadataObjectIndex.Blaze.ON_FIRE, 16), ProtocolVersionsHelper.DOWN_1_8);
	}

}
