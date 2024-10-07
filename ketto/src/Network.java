/*
* File: Network.java
* Author: Szamosfalvi Szonja
* Copyright: 2024, Szamosfalvi Szonja
* Group: Szoft II-1-N
* Date: 2024-10-05
* Github: https://github.com/szonia/
* Licenc: GNU GPL
*/



public class Network implements Connectable {
    
    @Override
    public void connectToNetwork(String networkName){
        System.out.println("Sikeres csatlakozás" + networkName);
    }
    
    @Override
    public void disconnectFromNetwork(){
        System.out.println("A csatlakozás nem sikerült.");
    }

}
