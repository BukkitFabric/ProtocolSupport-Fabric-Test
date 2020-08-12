package protocolsupport.protocol.utils;

import java.util.Map.Entry;
import java.util.StringJoiner;

import protocolsupport.protocol.types.NetworkItemStack;
import protocolsupport.protocol.types.nbt.NBT;
import protocolsupport.protocol.types.nbt.NBTByte;
import protocolsupport.protocol.types.nbt.NBTCompound;
import protocolsupport.protocol.types.nbt.NBTList;
import protocolsupport.protocol.types.nbt.NBTNumber;
import protocolsupport.protocol.types.nbt.NBTString;
import protocolsupport.protocol.types.nbt.NBTType;
import protocolsupport.protocol.types.networkentity.NetworkEntityType;
import protocolsupport.protocol.utils.minecraftdata.MinecraftPotionData;

public class CommonNBT {

	public static NBTCompound getOrCreateRootTag(NetworkItemStack itemstack) {
		NBTCompound tag = itemstack.getNBT();
		if (tag == null) {
			tag = new NBTCompound();
			itemstack.setNBT(tag);
		}
		return tag;
	}


	public static final String BLOCK_TAG = "BlockEntityTag";


	public static final String DISPLAY = "display";
	public static final String DISPLAY_NAME = "Name";
	public static final String DISPLAY_LORE = "Lore";

	public static NBTCompound getOrCreateDisplayTag(NBTCompound rootTag) {
		NBTCompound display = rootTag.getTagOfType(DISPLAY, NBTType.COMPOUND);
		if (display == null) {
			display = new NBTCompound();
			rootTag.setTag(DISPLAY, display);
		}
		return display;
	}


	public static String[] getSignLines(NBTCompound tag) {
		String[] lines = new String[4];
		for (int i = 0; i < lines.length; i++) {
			lines[i] = NBTString.getValueOrDefault(tag.getTagOfType("Text" + (i + 1), NBTType.STRING), "");
		}
		return lines;
	}


	public static final String BOOK_ENCHANTMENTS = "StoredEnchantments";

	public static final String MODERN_ENCHANTMENTS = "Enchantments";

	public static final String LEGACY_ENCHANTMENTS = "ench";


	public static final String MOB_SPAWNER_SPAWNDATA = "SpawnData";

	public static NetworkEntityType getSpawnedMobType(NBTCompound spawndataTag) {
		return NetworkEntityType.getByRegistrySTypeId(NBTString.getValueOrNull(spawndataTag.getTagOfType("id", NBTType.STRING)));
	}


	public static final String POTION_TYPE = "Potion";

	public static String getPotionEffectType(NBTCompound tag) {
		NBTString potionType = tag.getTagOfType(POTION_TYPE, NBTType.STRING);
		if (potionType != null) {
			return potionType.getValue();
		}
		NBTList<NBTCompound> customPotionEffects = tag.getTagListOfType("CustomPotionEffects", NBTType.COMPOUND);
		for (NBTCompound customPotionEffect : customPotionEffects.getTags()) {
			NBTNumber potionId = customPotionEffect.getNumberTag("Id");
			if (potionId != null) {
				return MinecraftPotionData.getNameById(potionId.getAsInt());
			}
		}
		return null;
	}


	public static final String ITEM_DAMAGE = "Damage";


	public static final String MAP_ID = "map";


	public static final String BANNER_BASE = "Base";

	public static final String BANNER_PATTERNS = "Patterns";

	public static final String BANNER_PATTERN_COLOR = "Color";


	public static final String PLAYERHEAD_ITEM_PROFILE = "SkullOwner";

	public static final String PLAYERHEAD_TILE_PROFILE = "Owner";


	public static final String ITEMSTACK_STORAGE_ID = "id";
	public static final String ITEMSTACK_STORAGE_COUNT = "Count";
	public static final String ITEMSTACK_STORAGE_NBT = "tag";

	public static NetworkItemStack deserializeItemStackFromNBT(NBTCompound rootTag) {
		NetworkItemStack itemstack = new NetworkItemStack();
		NBTString idTag = rootTag.getTagOfType(ITEMSTACK_STORAGE_ID, NBTType.STRING);
		if (idTag != null) {
			itemstack.setTypeId(ItemMaterialLookup.getRuntimeId(ItemMaterialLookup.getByKey(idTag.getValue())));
		}
		NBTNumber countTag = rootTag.getNumberTag(ITEMSTACK_STORAGE_COUNT);
		if (countTag != null) {
			itemstack.setAmount(countTag.getAsInt());
		}
		NBTCompound tagTag = rootTag.getTagOfType(ITEMSTACK_STORAGE_NBT, NBTType.COMPOUND);
		if (tagTag != null) {
			itemstack.setNBT(tagTag);
		}
		return itemstack;
	}

	public static NBTCompound serializeItemStackToNBT(NetworkItemStack itemstack) {
		NBTCompound rootTag = new NBTCompound();
		rootTag.setTag(ITEMSTACK_STORAGE_ID, new NBTString(ItemMaterialLookup.getByRuntimeId(itemstack.getTypeId()).getKey().toString()));
		rootTag.setTag(ITEMSTACK_STORAGE_COUNT, new NBTByte((byte) itemstack.getAmount()));
		rootTag.setTag(ITEMSTACK_STORAGE_NBT, itemstack.getNBT());
		return rootTag;
	}

	public static String deserializeBlockDataFromNBT(NBTCompound compound) {
		String name = compound.getTagOfType("Name", NBTType.STRING).getValue();
		NBTCompound properties = compound.getTagOfType("Properties", NBTType.COMPOUND);
		if (properties == null) {
			return name;
		} else {
			StringJoiner joiner = new StringJoiner(",", name + "[", "]");
			for (Entry<String, NBT> entry : properties.getTags().entrySet()) {
				NBT value = entry.getValue();
				if (value instanceof NBTString) {
					joiner.add(entry.getKey() + "=" + ((NBTString) value).getValue());
				}
			}
			return joiner.toString();
		}
	}

}
