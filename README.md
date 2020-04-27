# PacketLib
 Makes working with Sockets easier

# How to use
First you will need a Server.
```java
ServerHandler sh = new ServerHandler(new ServerSocket(12345));
```
You can add 2 types of Listeners a ServerEvent, which activates whenever something with the Server happens
or a PacketEvent which gets called when the Server recieves a Packet.

Now to the Client Part:
```java
ConnectionHandler ch = new ConnectionHandler(new Socket(12345));
```
Here you can add only one Event, which activates whenever you recieve a Packet.

# Packets
Every Packet has the ID of the Sender and a Version ID.
Create a new Packet and let it extend from Packet

#### MCPfannkuchenYT