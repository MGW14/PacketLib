package work.mgnet.packetlib.example;

import work.mgnet.packetlib.uses.Packet;

public class ExamplePacket extends Packet {
	
	/**
	 * @author MCPfannkuchenYT
	 * @category Library
	 * @since v1.0-b1
	 * @param packet
	 */
	private static final long serialVersionUID = 4990669865513166864L;
	public String exampleString;
	
	public ExamplePacket(String exampleString) {
		super(1, "ExamplePacket");
		this.exampleString = exampleString;
	}
	
}
