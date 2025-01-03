/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import Controllers.Client;
import Controllers.Network;
import Controllers.Server;

/**
 *
 * @author Kerly Titus
 */
public class Driver {

    /**
     * main class
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        /*******************************************************************************************************************************************
         * TODO : implement all the operations of main class   																					*
         ******************************************************************************************************************************************/

        Network objNetwork = new Network("network");            /* Activate the network */
        objNetwork.start();

        Server objServer = new Server();
        objServer.start();

        Client objSendingClient = new Client("sending");

        Client objReceivingClient = new Client("receiving");

        objSendingClient.start();

        objReceivingClient.start();
    }
}