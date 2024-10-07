/*
* File: App.java
* Author: Szamosfalvi Szonja
* Copyright: 2024, Szamosfalvi Szonja
* Group: Szoft II-1-N
* Date: 2024-10-05
* Github: https://github.com/szonia/
* Licenc: GNU GPL
*/


public class App {
    public static void main(String[] args) throws Exception {
        Network network = new Network();
        network.connectToNetwork("A csatlakozás sikerült.");
        network.disconnectFromNetwork();

    }
}
