package protocolsupport.protocol.typeremapper.entity.metadata.types.living;

import protocolsupport.protocol.typeremapper.entity.metadata.object.value.NetworkEntityMetadataIndexValueRemapperNoOp;
import protocolsupport.protocol.typeremapper.entity.metadata.object.value.NetworkEntityMetadataIndexValueRemapperNumberToInt;
import protocolsupport.protocol.typeremapper.entity.metadata.types.base.InsentientEntityMetadataRemapper;
import protocolsupport.protocol.types.networkentity.metadata.NetworkEntityMetadataObjectIndex;
import protocolsupport.protocol.utils.ProtocolVersionsHelper;

public class WitherEntityMetadataRemapper extends InsentientEntityMetadataRemapper {

	public static final WitherEntityMetadataRemapper INSTANCE = new WitherEntityMetadataRemapper();

	protected WitherEntityMetadataRemapper() {
		addRemap(new NetworkEntityMetadataIndexValueRemapperNoOp(NetworkEntityMetadataObjectIndex.Wither.TARGET1, 15), ProtocolVersionsHelper.UP_1_15);
		addRemap(new NetworkEntityMetadataIndexValueRemapperNoOp(NetworkEntityMetadataObjectIndex.Wither.TARGET1, 14), ProtocolVersionsHelper.ALL_1_14);
		addRemap(new NetworkEntityMetadataIndexValueRemapperNoOp(NetworkEntityMetadataObjectIndex.Wither.TARGET1, 12), ProtocolVersionsHelper.RANGE__1_10__1_13_2);
		addRemap(new NetworkEntityMetadataIndexValueRemapperNoOp(NetworkEntityMetadataObjectIndex.Wither.TARGET1, 11), ProtocolVersionsHelper.ALL_1_9);
		addRemap(new NetworkEntityMetadataIndexValueRemapperNumberToInt(NetworkEntityMetadataObjectIndex.Wither.TARGET1, 17), ProtocolVersionsHelper.DOWN_1_8);

		addRemap(new NetworkEntityMetadataIndexValueRemapperNoOp(NetworkEntityMetadataObjectIndex.Wither.TARGET2, 16), ProtocolVersionsHelper.UP_1_15);
		addRemap(new NetworkEntityMetadataIndexValueRemapperNoOp(NetworkEntityMetadataObjectIndex.Wither.TARGET2, 15), ProtocolVersionsHelper.ALL_1_14);
		addRemap(new NetworkEntityMetadataIndexValueRemapperNoOp(NetworkEntityMetadataObjectIndex.Wither.TARGET2, 13), ProtocolVersionsHelper.RANGE__1_10__1_13_2);
		addRemap(new NetworkEntityMetadataIndexValueRemapperNoOp(NetworkEntityMetadataObjectIndex.Wither.TARGET2, 12), ProtocolVersionsHelper.ALL_1_9);
		addRemap(new NetworkEntityMetadataIndexValueRemapperNumberToInt(NetworkEntityMetadataObjectIndex.Wither.TARGET2, 18), ProtocolVersionsHelper.DOWN_1_8);

		addRemap(new NetworkEntityMetadataIndexValueRemapperNoOp(NetworkEntityMetadataObjectIndex.Wither.TARGET3, 17), ProtocolVersionsHelper.UP_1_15);
		addRemap(new NetworkEntityMetadataIndexValueRemapperNoOp(NetworkEntityMetadataObjectIndex.Wither.TARGET3, 16), ProtocolVersionsHelper.ALL_1_14);
		addRemap(new NetworkEntityMetadataIndexValueRemapperNoOp(NetworkEntityMetadataObjectIndex.Wither.TARGET3, 14), ProtocolVersionsHelper.RANGE__1_10__1_13_2);
		addRemap(new NetworkEntityMetadataIndexValueRemapperNoOp(NetworkEntityMetadataObjectIndex.Wither.TARGET3, 13), ProtocolVersionsHelper.ALL_1_9);
		addRemap(new NetworkEntityMetadataIndexValueRemapperNumberToInt(NetworkEntityMetadataObjectIndex.Wither.TARGET3, 19), ProtocolVersionsHelper.DOWN_1_8);

		addRemap(new NetworkEntityMetadataIndexValueRemapperNoOp(NetworkEntityMetadataObjectIndex.Wither.INVULNERABLE_TIME, 18), ProtocolVersionsHelper.UP_1_15);
		addRemap(new NetworkEntityMetadataIndexValueRemapperNoOp(NetworkEntityMetadataObjectIndex.Wither.INVULNERABLE_TIME, 17), ProtocolVersionsHelper.ALL_1_14);
		addRemap(new NetworkEntityMetadataIndexValueRemapperNoOp(NetworkEntityMetadataObjectIndex.Wither.INVULNERABLE_TIME, 15), ProtocolVersionsHelper.RANGE__1_10__1_13_2);
		addRemap(new NetworkEntityMetadataIndexValueRemapperNoOp(NetworkEntityMetadataObjectIndex.Wither.INVULNERABLE_TIME, 14), ProtocolVersionsHelper.ALL_1_9);
		addRemap(new NetworkEntityMetadataIndexValueRemapperNumberToInt(NetworkEntityMetadataObjectIndex.Wither.INVULNERABLE_TIME, 20), ProtocolVersionsHelper.DOWN_1_8);
	}

}
