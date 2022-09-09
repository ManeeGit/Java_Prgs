public boolean portIsOpen(String ip, int port, int timeout) {
    try {
        Socket socket = new Socket();
        socket.connect(new InetSocketAddress(ip, port), timeout);
        socket.close();
        return true;
    } catch (Exception ex) {
        return false;
    }
}