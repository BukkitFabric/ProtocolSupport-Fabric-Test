package protocolsupport.protocol.typeremapper.entity.metadata.types.living;

import protocolsupport.protocol.typeremapper.entity.metadata.object.value.NetworkEntityMetadataIndexValueRemapperNoOp;
import protocolsupport.protocol.typeremapper.entity.metadata.types.base.RaidParticipantEntityMetadataRemapper;
import protocolsupport.protocol.types.networkentity.metadata.NetworkEntityMetadataObjectIndex;
import protocolsupport.protocol.utils.ProtocolVersionsHelper;

public class PillagerEntityMetadataRemapper extends RaidParticipantEntityMetadataRemapper {

	public static final PillagerEntityMetadataRemapper INSTANCE = new PillagerEntityMetadataRemapper();

	protected PillagerEntityMetadataRemapper() {
		addRemap(new NetworkEntityMetadataIndexValueRemapperNoOp(NetworkEntityMetadataObjectIndex.Pillager.USING_CROSSBOW, 16), ProtocolVersionsHelper.UP_1_15);
		addRemap(new NetworkEntityMetadataIndexValueRemapperNoOp(NetworkEntityMetadataObjectIndex.Pillager.USING_CROSSBOW, 15), ProtocolVersionsHelper.ALL_1_14);
	}

}
