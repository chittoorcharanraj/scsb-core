package org.recap.model.submitcollection;

import org.junit.Test;
import org.marc4j.marc.Record;
import org.mockito.Mock;
import org.recap.BaseTestCase;
import org.recap.util.CommonUtil;
import org.recap.util.MarcUtil;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.Arrays;
import java.util.List;

import static org.junit.Assert.*;

/**
 * Created by rajeshbabuk on 17/Sep/2021
 */
public class BibMatchPointInfoTest extends BaseTestCase {

    @Autowired
    private CommonUtil commonUtil;

    @Autowired
    private MarcUtil marcUtil;

    private String marcXML = "<collection xmlns=\"http://www.loc.gov/MARC21/slim\">\n" +
            "          <record>\n" +
            "            <controlfield tag=\"001\">NYPG001000011-B</controlfield>\n" +
            "            <controlfield tag=\"005\">20001116192418.8</controlfield>\n" +
            "            <controlfield tag=\"008\">841106s1976    le       b    000 0 arax </controlfield>\n" +
            "            <datafield ind1=\" \" ind2=\" \" tag=\"010\">\n" +
            "              <subfield code=\"a\">79971032</subfield>\n" +
            "            </datafield>\n" +
            "            <datafield ind1=\" \" ind2=\" \" tag=\"035\">\n" +
            "              <subfield code=\"a\">NNSZ00100011</subfield>\n" +
            "            </datafield>\n" +
            "            <datafield ind1=\" \" ind2=\" \" tag=\"035\">\n" +
            "              <subfield code=\"a\">(WaOLN)nyp0200023</subfield>\n" +
            "            </datafield>\n" +
            "            <datafield ind1=\" \" ind2=\" \" tag=\"040\">\n" +
            "              <subfield code=\"c\">NN</subfield>\n" +
            "              <subfield code=\"d\">NN</subfield>\n" +
            "              <subfield code=\"d\">WaOLN</subfield>\n" +
            "            </datafield>\n" +
            "            <datafield ind1=\" \" ind2=\" \" tag=\"043\">\n" +
            "              <subfield code=\"a\">a-ba---</subfield>\n" +
            "            </datafield>\n" +
            "            <datafield ind1=\"0\" ind2=\"0\" tag=\"050\">\n" +
            "              <subfield code=\"a\">DS247.B28</subfield>\n" +
            "              <subfield code=\"b\">R85</subfield>\n" +
            "            </datafield>\n" +
            "            <datafield ind1=\"1\" ind2=\" \" tag=\"100\">\n" +
            "              <subfield code=\"a\">RumayhÌ£Ä«, MuhÌ£ammad GhÄ\u0081nim.</subfield>\n" +
            "            </datafield>\n" +
            "            <datafield ind1=\"1\" ind2=\"3\" tag=\"245\">\n" +
            "              <subfield code=\"a\">al-BahÌ£rayn :</subfield>\n" +
            "              <subfield code=\"b\">mushkilÄ\u0081t al-taghyÄ«r al-siyÄ\u0081sÄ« wa-al-ijtimÄ\u0081Ê»Ä« /</subfield>\n" +
            "              <subfield code=\"c\">MuhÌ£ammad al-RumayhÌ£Ä«.</subfield>\n" +
            "            </datafield>\n" +
            "            <datafield ind1=\" \" ind2=\" \" tag=\"250\">\n" +
            "              <subfield code=\"a\">al-TÌ£abÊ»ah 1.</subfield>\n" +
            "            </datafield>\n" +
            "            <datafield ind1=\" \" ind2=\" \" tag=\"260\">\n" +
            "              <subfield code=\"a\">[BayrÅ«t] :</subfield>\n" +
            "              <subfield code=\"b\">DÄ\u0081r Ibn KhaldÅ«n,</subfield>\n" +
            "              <subfield code=\"c\">1976.</subfield>\n" +
            "            </datafield>\n" +
            "            <datafield ind1=\" \" ind2=\" \" tag=\"300\">\n" +
            "              <subfield code=\"a\">264 p. ;</subfield>\n" +
            "              <subfield code=\"c\">24 cm.</subfield>\n" +
            "            </datafield>\n" +
            "            <datafield ind1=\" \" ind2=\" \" tag=\"504\">\n" +
            "              <subfield code=\"a\">Includes bibliographies.</subfield>\n" +
            "            </datafield>\n" +
            "            <datafield ind1=\" \" ind2=\" \" tag=\"546\">\n" +
            "              <subfield code=\"a\">In Arabic.</subfield>\n" +
            "            </datafield>\n" +
            "            <datafield ind1=\" \" ind2=\"0\" tag=\"651\">\n" +
            "              <subfield code=\"a\">Bahrain</subfield>\n" +
            "              <subfield code=\"x\">History</subfield>\n" +
            "              <subfield code=\"y\">20th century.</subfield>\n" +
            "            </datafield>\n" +
            "            <datafield ind1=\" \" ind2=\"0\" tag=\"651\">\n" +
            "              <subfield code=\"a\">Bahrain</subfield>\n" +
            "              <subfield code=\"x\">Economic conditions.</subfield>\n" +
            "            </datafield>\n" +
            "            <datafield ind1=\" \" ind2=\"0\" tag=\"651\">\n" +
            "              <subfield code=\"a\">Bahrain</subfield>\n" +
            "              <subfield code=\"x\">Social conditions.</subfield>\n" +
            "            </datafield>\n" +
            "            <datafield ind1=\" \" ind2=\" \" tag=\"907\">\n" +
            "              <subfield code=\"a\">.b100000241</subfield>\n" +
            "              <subfield code=\"c\">m</subfield>\n" +
            "              <subfield code=\"d\">a</subfield>\n" +
            "              <subfield code=\"e\">-</subfield>\n" +
            "              <subfield code=\"f\">ara</subfield>\n" +
            "              <subfield code=\"g\">le </subfield>\n" +
            "              <subfield code=\"h\">3</subfield>\n" +
            "              <subfield code=\"i\">1</subfield>\n" +
            "            </datafield>\n" +
            "            <datafield ind1=\" \" ind2=\" \" tag=\"952\">\n" +
            "              <subfield code=\"h\">*OFK 84-1944</subfield>\n" +
            "            </datafield>\n" +
            "          </record>\n" +
            "        </collection>";

    @Test
    public void testBibMatchInfoFromMarcRecord() {
        BibMatchPointInfo bibMatchPointInfo = commonUtil.getBibMatchPointInfoForMarcRecord(getMarcRecord());
        assertNotNull(bibMatchPointInfo);
        assertNotNull(bibMatchPointInfo.getTitle());
    }

    private Record getMarcRecord() {
        List<Record> marcRecords = marcUtil.convertMarcXmlToRecord(marcXML);
        return marcRecords.get(0);
    }

    @Test
    public void testMatchPoints() {
        BibMatchPointInfo bibMatchPointInfo1 = commonUtil.getBibMatchPointInfoForMarcRecord(getMarcRecord());
        bibMatchPointInfo1.setTitle("Title Changed");
        BibMatchPointInfo bibMatchPointInfo2 = commonUtil.getBibMatchPointInfoForMarcRecord(getMarcRecord());

        assertTrue(bibMatchPointInfo1.equals(bibMatchPointInfo2));
    }

    @Test
    public void testToCompare() {
        BibMatchPointInfo bibMatchPointInfo1 = new BibMatchPointInfo();
        bibMatchPointInfo1.setTitle("This is the Title 1");
        bibMatchPointInfo1.setLccn("This is the LCCN 1");
        bibMatchPointInfo1.setIsbn(Arrays.asList("123", "345", "678"));
        bibMatchPointInfo1.setIssn(Arrays.asList("123", "345", "678"));
        bibMatchPointInfo1.setOclc(Arrays.asList("123", "345", "678"));

        BibMatchPointInfo bibMatchPointInfo2 = new BibMatchPointInfo();
        bibMatchPointInfo2.setTitle("This is the Title 2 - Updated");
        bibMatchPointInfo2.setLccn("This is the LCCN 1");
        bibMatchPointInfo2.setIsbn(Arrays.asList("345", "678", "123"));
        bibMatchPointInfo2.setIssn(Arrays.asList("345", "678", "123"));
        bibMatchPointInfo2.setOclc(Arrays.asList("345", "678", "123"));

        assertTrue(bibMatchPointInfo1.equals(bibMatchPointInfo2));
    }

}