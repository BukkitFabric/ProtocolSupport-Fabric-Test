package protocolsupport.zplatform.impl.spigot.network.handler;

import java.security.GeneralSecurityException;
import java.security.PrivateKey;

import javax.crypto.SecretKey;

import org.bukkit.Bukkit;

import net.minecraft.server.v1_16_R3.CryptographyException;
import net.minecraft.server.v1_16_R3.IChatBaseComponent;
import net.minecraft.server.v1_16_R3.NetworkManager;
import net.minecraft.server.v1_16_R3.PacketLoginInCustomPayload;
import net.minecraft.server.v1_16_R3.PacketLoginInEncryptionBegin;
import net.minecraft.server.v1_16_R3.PacketLoginInListener;
import net.minecraft.server.v1_16_R3.PacketLoginInStart;
import protocolsupport.protocol.packet.handler.AbstractLoginListener;
import protocolsupport.zplatform.impl.spigot.network.SpigotNetworkManagerWrapper;
import protocolsupport.zplatform.network.NetworkManagerWrapper;

public class SpigotLoginListener extends AbstractLoginListener implements PacketLoginInListener {

	public SpigotLoginListener(NetworkManagerWrapper networkmanager) {
		super(networkmanager);
	}

	@Override
	public void a(IChatBaseComponent msg) {
		Bukkit.getLogger().info(getConnectionRepr() + " lost connection: " + msg.getText());
	}

	@Override
	public void a(PacketLoginInStart packet) {
		handleLoginStart(packet.b().getName());
	}

	@Override
	public void a(PacketLoginInEncryptionBegin packet) {
		handleEncryption(new EncryptionPacketWrapper() {
			@Override
			public SecretKey getSecretKey(PrivateKey key) throws GeneralSecurityException {
				try {
					return packet.a(key);
				} catch (CryptographyException e) {
					throw new GeneralSecurityException(e);
				}
			}
			@Override
			public byte[] getNonce(PrivateKey key) throws GeneralSecurityException {
				try {
					return packet.b(key);
				} catch (CryptographyException e) {
					throw new GeneralSecurityException(e);
				}
			}
		});
	}

	@Override
	protected SpigotLoginListenerPlay getLoginListenerPlay() {
		return new SpigotLoginListenerPlay(networkManager);
	}

	@Override
	public void a(PacketLoginInCustomPayload var1) {
	}

	@Override
	public NetworkManager a() {
		return ((SpigotNetworkManagerWrapper) this.networkManager).unwrap();
	}

}
