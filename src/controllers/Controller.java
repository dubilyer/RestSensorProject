package controllers;

import dto.DataStream;
import util.RestClient;
import util.XmlParser;

import java.util.LinkedList;

/**
 * Created by dubilyer on 11/20/16.
 */
public class Controller {
    public final static String getAllDataStreams = "/ws/DataStream";
    public static void main(String[] args) {
        RestClient client = new RestClient();
        LinkedList<DataStream> sensor = new LinkedList<>();
        try {
            sensor = XmlParser.xmlToObj(client.doGet(getAllDataStreams));
        } catch (Exception e) {
            e.printStackTrace();
        }
        System.out.println(sensor);
    }
}
