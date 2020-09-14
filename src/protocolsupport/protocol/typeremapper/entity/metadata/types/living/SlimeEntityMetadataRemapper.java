package protocolsupport.protocol.typeremapper.entity.metadata.types.living;

import protocolsupport.protocol.typeremapper.entity.metadata.object.value.NetworkEntityMetadataIndexValueRemapperNoOp;
import protocolsupport.protocol.typeremapper.entity.metadata.object.value.NetworkEntityMetadataIndexValueRemapperNumberToByte;
import protocolsupport.protocol.typeremapper.entity.metadata.types.base.InsentientEntityMetadataRemapper;
import protocolsupport.protocol.types.networkentity.metadata.NetworkEntityMetadataObjectIndex;
import protocolsupport.protocol.utils.ProtocolVersionsHelper;

public class SlimeEntityMetadataRemapper extends InsentientEntityMetadataRemapper {

	public static final SlimeEntityMetadataRemapper INSTANCE = new SlimeEntityMetadataRemapper();

	protected SlimeEntityMetadataRemapper() {
		addRemap(new NetworkEntityMetadataIndexValueRemapperNoOp(NetworkEntityMetadataObjectIndex.Slime.SIZE, 15), ProtocolVersionsHelper.UP_1_15);
		addRemap(new NetworkEntityMetadataIndexValueRemapperNoOp(NetworkEntityMetadataObjectIndex.Slime.SIZE, 14), ProtocolVersionsHelper.ALL_1_14);
		addRemap(new NetworkEntityMetadataIndexValueRemapperNoOp(NetworkEntityMetadataObjectIndex.Slime.SIZE, 12), ProtocolVersionsHelper.RANGE__1_10__1_13_2);
		addRemap(new NetworkEntityMetadataIndexValueRemapperNoOp(NetworkEntityMetadataObjectIndex.Slime.SIZE, 11), ProtocolVersionsHelper.ALL_1_9);
		addRemap(new NetworkEntityMetadataIndexValueRemapperNumberToByte(NetworkEntityMetadataObjectIndex.Slime.SIZE, 16), ProtocolVersionsHelper.DOWN_1_8);
	}

}
