package protocolsupport.protocol.typeremapper.entity.metadata.types.living.tameable;

import protocolsupport.protocol.typeremapper.entity.metadata.object.value.NetworkEntityMetadataIndexValueRemapperNoOp;
import protocolsupport.protocol.typeremapper.entity.metadata.types.base.TameableEntityMetadataRemapper;
import protocolsupport.protocol.types.networkentity.metadata.NetworkEntityMetadataObjectIndex;
import protocolsupport.protocol.utils.ProtocolVersionsHelper;

public class CatEntityMetadataRemapper extends TameableEntityMetadataRemapper {

	public static final CatEntityMetadataRemapper INSTANCE = new CatEntityMetadataRemapper();

	protected CatEntityMetadataRemapper() {
		addRemap(new NetworkEntityMetadataIndexValueRemapperNoOp(NetworkEntityMetadataObjectIndex.Cat.VARIANT, 18), ProtocolVersionsHelper.UP_1_15);
		addRemap(new NetworkEntityMetadataIndexValueRemapperNoOp(NetworkEntityMetadataObjectIndex.Cat.VARIANT, 17), ProtocolVersionsHelper.ALL_1_14);

		addRemap(new NetworkEntityMetadataIndexValueRemapperNoOp(NetworkEntityMetadataObjectIndex.Cat.UNKNOWN_1, 19), ProtocolVersionsHelper.UP_1_15);
		addRemap(new NetworkEntityMetadataIndexValueRemapperNoOp(NetworkEntityMetadataObjectIndex.Cat.UNKNOWN_1, 18), ProtocolVersionsHelper.ALL_1_14);

		addRemap(new NetworkEntityMetadataIndexValueRemapperNoOp(NetworkEntityMetadataObjectIndex.Cat.UNKNOWN_2, 20), ProtocolVersionsHelper.UP_1_15);
		addRemap(new NetworkEntityMetadataIndexValueRemapperNoOp(NetworkEntityMetadataObjectIndex.Cat.UNKNOWN_2, 19), ProtocolVersionsHelper.ALL_1_14);

		addRemap(new NetworkEntityMetadataIndexValueRemapperNoOp(NetworkEntityMetadataObjectIndex.Cat.COLLAR_COLOR, 21), ProtocolVersionsHelper.UP_1_15);
		addRemap(new NetworkEntityMetadataIndexValueRemapperNoOp(NetworkEntityMetadataObjectIndex.Cat.COLLAR_COLOR, 20), ProtocolVersionsHelper.ALL_1_14);
	}

}
