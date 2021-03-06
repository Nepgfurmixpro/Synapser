package com.neothedeveloper.synapser.handlers;

import com.neothedeveloper.synapser.datatypes.ClientState;
import com.neothedeveloper.synapser.datatypes.LogType;
import com.neothedeveloper.synapser.decoders.InboundPacketDecoder;
import com.neothedeveloper.synapser.server.PlayerSocket;
import com.neothedeveloper.synapser.utils.Logger;

public class PacketHandler {
    private final ClientState m_runOnState;
    public PacketHandler(ClientState state) {
        this.m_runOnState = state;
    }
    public void handle(PlayerSocket socket, InboundPacketDecoder packet) {

    }

    public final ClientState allowedState() {
        return m_runOnState;
    }
}
