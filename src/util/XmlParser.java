package util;

import dto.CurrentValue;
import dto.DataStream;
import org.jdom2.Document;
import org.jdom2.Element;
import org.jdom2.JDOMException;
import org.jdom2.input.SAXBuilder;

import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.LinkedList;
import java.util.List;


/**
 * Created by dubilyer on 11/20/16.
 */
public class XmlParser {
    public static LinkedList<DataStream> xmlToObj(String response) throws ParseException {
        SAXBuilder builder = new SAXBuilder();
        LinkedList<DataStream> sensor = new LinkedList<>();
        SimpleDateFormat format = new SimpleDateFormat("yyyy-MM-dd'T'HH:mm:ss.SSS'Z'");
        try {
            Document document = builder.build(new ByteArrayInputStream(response.getBytes("UTF-8")));
            Element rootNode = document.getRootElement();
            Element node = rootNode.getChild("resultSize");
            List streams = rootNode.getChildren("DataStream");
            for (int i = 0; i < (Integer.parseInt(node.getText())); i++) {
                Element stream = (Element) streams.get(i);
                Element currentValue = stream.getChild("currentValue");
                sensor.add(new DataStream(
                        stream.getChildText("cstId"),
                        stream.getChildText("streamId"),
                        stream.getChildText("dataType"),
                        stream.getChildText("forwardTo"),
                        new CurrentValue(
                                currentValue.getChildText("id"),
                                Long.parseLong(currentValue.getChildText("timestamp")),
                                format.parse(currentValue.getChildText("timestampISO")),
                                Long.parseLong(currentValue.getChildText("serverTimestamp")),
                                format.parse(currentValue.getChildText("serverTimestampISO")),
                                currentValue.getChildText("data"),
                                currentValue.getChildText("description"),
                                Double.parseDouble(currentValue.getChildText("quality"))),
                        stream.getChildText("forwardTo"),
                        stream.getChildText("units"),
                        Long.parseLong(stream.getChildText("dataTtl")),
                        Long.parseLong(stream.getChildText("rollupTtl"))
                        )
                );
            }
        } catch (IOException io) {
            System.out.println(io.getMessage());
        } catch (JDOMException jdomex) {
            System.out.println(jdomex.getMessage());
        }
        return sensor;
    }
}
