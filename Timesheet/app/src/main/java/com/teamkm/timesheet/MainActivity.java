package com.teamkm.timesheet;

import android.Manifest;
import android.content.Intent;
import android.net.Uri;
import android.os.Environment;
import android.os.StatFs;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

import com.itextpdf.text.Anchor;
import com.itextpdf.text.BadElementException;
import com.itextpdf.text.Chapter;
import com.itextpdf.text.Chunk;
import com.itextpdf.text.Document;
import com.itextpdf.text.DocumentException;
import com.itextpdf.text.Element;
import com.itextpdf.text.Paragraph;
import com.itextpdf.text.Phrase;
import com.itextpdf.text.Section;
import com.itextpdf.text.pdf.PdfPCell;
import com.itextpdf.text.pdf.PdfPTable;
import com.itextpdf.text.pdf.PdfWriter;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);



    }

    public void createPDF(View view)
    {
        //TextView txt = (TextView)findViewById(R.id.txt1);

        Document doc = new Document();

        String output =  Environment.getExternalStorageDirectory()+"/mypdf.pdf";

        String state = Environment.getExternalStorageState();

        StatFs statFsI = new StatFs(Environment.getRootDirectory().getAbsolutePath());

        StatFs statFsE = new StatFs(Environment.getExternalStorageDirectory().getAbsolutePath());

        String readperm = Manifest.permission.READ_EXTERNAL_STORAGE;
        String writeperm = Manifest.permission.WRITE_EXTERNAL_STORAGE;

        String[] perm = {writeperm,readperm};

            int i = 0;

        //requestPermissions(perm,200);



        try {
            PdfWriter.getInstance(doc, new FileOutputStream(output));
            doc.open();
            //doc.add(new Paragraph(txt.getText().toString()));

            EditText edEmpID = (EditText)findViewById(R.id.etEmpID);
            EditText edEmpName = (EditText)findViewById(R.id.etEmpName);
            EditText edPP    = (EditText)findViewById(R.id.etPP);

            String strEmpID = edEmpID.getText().toString();
            String strEmpName = edEmpName.getText().toString();
            String stredPP = edPP.getText().toString();

            //****************** Week 1 ***********************

            EditText edThurRegW1 = (EditText)findViewById(R.id.edThurRegW1);
            EditText edThurHolW1 = (EditText)findViewById(R.id.edThurHolW1);
            EditText edThurVacW1 = (EditText)findViewById(R.id.edThurVacW1);
            EditText edThurSicW1 = (EditText)findViewById(R.id.edThurSicW1);
            EditText edThurOCW1 = (EditText)findViewById(R.id.edThurOCW1);
            EditText edThurOHW1 = (EditText)findViewById(R.id.edThurOHW1);

            TimeReport trThursW1 = new TimeReport();
            trThursW1.setReg(edThurRegW1.getText().toString());
            trThursW1.setHol(edThurHolW1.getText().toString());
            trThursW1.setVac(edThurVacW1.getText().toString());
            trThursW1.setSic(edThurSicW1.getText().toString());
            trThursW1.setOc(edThurOCW1.getText().toString());
            trThursW1.setOh(edThurOHW1.getText().toString());
            trThursW1.setTot();

            EditText edFriRegW1 = (EditText)findViewById(R.id.edFriRegW1);
            EditText edFriHolW1 = (EditText)findViewById(R.id.edFriHolW1);
            EditText edFriVacW1 = (EditText)findViewById(R.id.edFriVacW1);
            EditText edFriSicW1 = (EditText)findViewById(R.id.edFriSicW1);
            EditText edFriOCW1 = (EditText)findViewById(R.id.edFriOCW1);
            EditText edFriOHW1 = (EditText)findViewById(R.id.edFriOHW1);

            TimeReport trFriW1 = new TimeReport();
            trFriW1.setReg(edFriRegW1.getText().toString());
            trFriW1.setHol(edFriHolW1.getText().toString());
            trFriW1.setVac(edFriVacW1.getText().toString());
            trFriW1.setSic(edFriSicW1.getText().toString());
            trFriW1.setOc(edFriOCW1.getText().toString());
            trFriW1.setOh(edFriOHW1.getText().toString());
            trFriW1.setTot();

            EditText edSatRegW1 = (EditText)findViewById(R.id.edSatRegW1);
            EditText edSatHolW1 = (EditText)findViewById(R.id.edSatHolW1);
            EditText edSatVacW1 = (EditText)findViewById(R.id.edSatVacW1);
            EditText edSatSicW1 = (EditText)findViewById(R.id.edSatSicW1);
            EditText edSatOCW1 = (EditText)findViewById(R.id.edSatOCW1);
            EditText edSatOHW1 = (EditText)findViewById(R.id.edSatOHW1);

            TimeReport trSatW1 = new TimeReport();
            trSatW1.setReg(edSatRegW1.getText().toString());
            trSatW1.setHol(edSatHolW1.getText().toString());
            trSatW1.setVac(edSatVacW1.getText().toString());
            trSatW1.setSic(edSatSicW1.getText().toString());
            trSatW1.setOc(edSatOCW1.getText().toString());
            trSatW1.setOh(edSatOHW1.getText().toString());
            trSatW1.setTot();

            EditText edSunRegw1 = (EditText)findViewById(R.id.edSunRegW1);
            EditText edSunHolW1 = (EditText)findViewById(R.id.edSunHolW1);
            EditText edSunVacW1 = (EditText)findViewById(R.id.edSunVacW1);
            EditText edSunSicW1 = (EditText)findViewById(R.id.edSunSicW1);
            EditText edSunOCW1 = (EditText)findViewById(R.id.edSunOCW1);
            EditText edSunOHW1 = (EditText)findViewById(R.id.edSunOHW1);

            TimeReport trSunW1 = new TimeReport();
            trSunW1.setReg(edSunRegw1.getText().toString());
            trSunW1.setHol(edSunHolW1.getText().toString());
            trSunW1.setVac(edSunVacW1.getText().toString());
            trSunW1.setSic(edSunSicW1.getText().toString());
            trSunW1.setOc(edSunOCW1.getText().toString());
            trSunW1.setOh(edSunOHW1.getText().toString());
            trSunW1.setTot();

            EditText edMonRegW1 = (EditText)findViewById(R.id.edMonRegW1);
            EditText edMonHolW1 = (EditText)findViewById(R.id.edMonHolW1);
            EditText edMonVacW1 = (EditText)findViewById(R.id.edMonVacW1);
            EditText edMonSicW1 = (EditText)findViewById(R.id.edMonSicW1);
            EditText edMonOCW1 = (EditText)findViewById(R.id.edMonOCW1);
            EditText edMonOHW1 = (EditText)findViewById(R.id.edMonOHW1);

            TimeReport trMonW1 = new TimeReport();
            trMonW1.setReg(edMonRegW1.getText().toString());
            trMonW1.setHol(edMonHolW1.getText().toString());
            trMonW1.setVac(edMonVacW1.getText().toString());
            trMonW1.setSic(edMonSicW1.getText().toString());
            trMonW1.setOc(edMonOCW1.getText().toString());
            trMonW1.setOh(edMonOHW1.getText().toString());
            trMonW1.setTot();

            EditText edTueRegW1 = (EditText)findViewById(R.id.edTueRegW1);
            EditText edTueHolW1 = (EditText)findViewById(R.id.edTueHolW1);
            EditText edTueVacW1 = (EditText)findViewById(R.id.edTueVacW1);
            EditText edTueSicW1 = (EditText)findViewById(R.id.edTueSicW1);
            EditText edTueOCW1 = (EditText)findViewById(R.id.edTueOCW1);
            EditText edTueOHW1 = (EditText)findViewById(R.id.edTueOHW1);

            TimeReport trTueW1 = new TimeReport();
            trTueW1.setReg(edTueRegW1.getText().toString());
            trTueW1.setHol(edTueHolW1.getText().toString());
            trTueW1.setVac(edTueVacW1.getText().toString());
            trTueW1.setSic(edTueSicW1.getText().toString());
            trTueW1.setOc(edTueOCW1.getText().toString());
            trTueW1.setOh(edTueOHW1.getText().toString());
            trTueW1.setTot();

            EditText edWedRegW1 = (EditText)findViewById(R.id.edWedRegW1);
            EditText edWedHolW1 = (EditText)findViewById(R.id.edWedHolW1);
            EditText edWedVacW1 = (EditText)findViewById(R.id.edWedVacW1);
            EditText edWedSicW1 = (EditText)findViewById(R.id.edWedSicW1);
            EditText edWedOCW1 = (EditText)findViewById(R.id.edWedOCW1);
            EditText edWedOHW1 = (EditText)findViewById(R.id.edWedOHW1);

            TimeReport trWedW1 = new TimeReport();
            trWedW1.setReg(edWedRegW1.getText().toString());
            trWedW1.setHol(edWedHolW1.getText().toString());
            trWedW1.setVac(edWedVacW1.getText().toString());
            trWedW1.setSic(edWedSicW1.getText().toString());
            trWedW1.setOc(edWedOCW1.getText().toString());
            trWedW1.setOh(edWedOHW1.getText().toString());
            trWedW1.setTot();

            EditText edpdRegW1 = (EditText)findViewById(R.id.edpdRegW1);
            EditText edpdHolW1 = (EditText)findViewById(R.id.edpdHolW1);
            EditText edpdVacW1 = (EditText)findViewById(R.id.edpdVacW1);
            EditText edpdSicW1 = (EditText)findViewById(R.id.edpdSicW1);
            EditText edpdOCW1 = (EditText)findViewById(R.id.edpdOCW1);
            EditText edpdOHW1 = (EditText)findViewById(R.id.edpdOHW1);

            TimeReport trPjtW1 = new TimeReport();
            trPjtW1.setReg(edpdRegW1.getText().toString());
            trPjtW1.setHol(edpdHolW1.getText().toString());
            trPjtW1.setVac(edpdVacW1.getText().toString());
            trPjtW1.setSic(edpdSicW1.getText().toString());
            trPjtW1.setOc(edpdOCW1.getText().toString());
            trPjtW1.setOh(edpdOHW1.getText().toString());
            trPjtW1.setTot();

            //****************** Week 2 ***********************



            EditText edThurRegW2 = (EditText)findViewById(R.id.edThurRegW2);
            EditText edThurHolW2 = (EditText)findViewById(R.id.edThurHolW2);
            EditText edThurVacW2 = (EditText)findViewById(R.id.edThurVacW2);
            EditText edThurSicW2 = (EditText)findViewById(R.id.edThurSicW2);
            EditText edThurOCW2 = (EditText)findViewById(R.id.edThurOCW2);
            EditText edThurOHW2 = (EditText)findViewById(R.id.edThurOHW2);

            TimeReport trThursW2 = new TimeReport();
            trThursW2.setReg(edThurRegW2.getText().toString());
            trThursW2.setHol(edThurHolW2.getText().toString());
            trThursW2.setVac(edThurVacW2.getText().toString());
            trThursW2.setSic(edThurSicW2.getText().toString());
            trThursW2.setOc(edThurOCW2.getText().toString());
            trThursW2.setOh(edThurOHW2.getText().toString());
            trThursW2.setTot();

            EditText edFriRegW2 = (EditText)findViewById(R.id.edFriRegW2);
            EditText edFriHolW2 = (EditText)findViewById(R.id.edFriHolW2);
            EditText edFriVacW2 = (EditText)findViewById(R.id.edFriVacW2);
            EditText edFriSicW2 = (EditText)findViewById(R.id.edFriSicW2);
            EditText edFriOCW2 = (EditText)findViewById(R.id.edFriOCW2);
            EditText edFriOHW2 = (EditText)findViewById(R.id.edFriOHW2);

            TimeReport trFriW2 = new TimeReport();
            trFriW2.setReg(edFriRegW2.getText().toString());
            trFriW2.setHol(edFriHolW2.getText().toString());
            trFriW2.setVac(edFriVacW2.getText().toString());
            trFriW2.setSic(edFriSicW2.getText().toString());
            trFriW2.setOc(edFriOCW2.getText().toString());
            trFriW2.setOh(edFriOHW2.getText().toString());
            trFriW2.setTot();

            EditText edSatRegW2 = (EditText)findViewById(R.id.edSatRegW2);
            EditText edSatHolW2 = (EditText)findViewById(R.id.edSatHolW2);
            EditText edSatVacW2 = (EditText)findViewById(R.id.edSatVacW2);
            EditText edSatSicW2 = (EditText)findViewById(R.id.edSatSicW2);
            EditText edSatOCW2 = (EditText)findViewById(R.id.edSatOCW2);
            EditText edSatOHW2 = (EditText)findViewById(R.id.edSatOHW2);

            TimeReport trSatW2 = new TimeReport();
            trSatW2.setReg(edSatRegW2.getText().toString());
            trSatW2.setHol(edSatHolW2.getText().toString());
            trSatW2.setVac(edSatVacW2.getText().toString());
            trSatW2.setSic(edSatSicW2.getText().toString());
            trSatW2.setOc(edSatOCW2.getText().toString());
            trSatW2.setOh(edSatOHW2.getText().toString());
            trSatW2.setTot();

            EditText edSunRegW2 = (EditText)findViewById(R.id.edSunRegW2);
            EditText edSunHolW2 = (EditText)findViewById(R.id.edSunHolW2);
            EditText edSunVacW2 = (EditText)findViewById(R.id.edSunVacW2);
            EditText edSunSicW2 = (EditText)findViewById(R.id.edSunSicW2);
            EditText edSunOCW2 = (EditText)findViewById(R.id.edSunOCW2);
            EditText edSunOHW2 = (EditText)findViewById(R.id.edSunOHW2);

            TimeReport trSunW2 = new TimeReport();
            trSunW2.setReg(edSunRegW2.getText().toString());
            trSunW2.setHol(edSunHolW2.getText().toString());
            trSunW2.setVac(edSunVacW2.getText().toString());
            trSunW2.setSic(edSunSicW2.getText().toString());
            trSunW2.setOc(edSunOCW2.getText().toString());
            trSunW2.setOh(edSunOHW2.getText().toString());
            trSunW2.setTot();

            EditText edMonRegW2 = (EditText)findViewById(R.id.edMonRegW2);
            EditText edMonHolW2 = (EditText)findViewById(R.id.edMonHolW2);
            EditText edMonVacW2 = (EditText)findViewById(R.id.edMonVacW2);
            EditText edMonSicW2 = (EditText)findViewById(R.id.edMonSicW2);
            EditText edMonOCW2 = (EditText)findViewById(R.id.edMonOCW2);
            EditText edMonOHW2 = (EditText)findViewById(R.id.edMonOHW2);

            TimeReport trMonW2 = new TimeReport();
            trMonW2.setReg(edMonRegW2.getText().toString());
            trMonW2.setHol(edMonHolW2.getText().toString());
            trMonW2.setVac(edMonVacW2.getText().toString());
            trMonW2.setSic(edMonSicW2.getText().toString());
            trMonW2.setOc(edMonOCW2.getText().toString());
            trMonW2.setOh(edMonOHW2.getText().toString());
            trMonW2.setTot();

            EditText edTueRegW2 = (EditText)findViewById(R.id.edTueRegW2);
            EditText edTueHolW2 = (EditText)findViewById(R.id.edTueHolW2);
            EditText edTueVacW2 = (EditText)findViewById(R.id.edTueVacW2);
            EditText edTueSicW2 = (EditText)findViewById(R.id.edTueSicW2);
            EditText edTueOCW2 = (EditText)findViewById(R.id.edTueOCW2);
            EditText edTueOHW2 = (EditText)findViewById(R.id.edTueOHW2);

            TimeReport trTueW2 = new TimeReport();
            trTueW2.setReg(edTueRegW2.getText().toString());
            trTueW2.setHol(edTueHolW2.getText().toString());
            trTueW2.setVac(edTueVacW2.getText().toString());
            trTueW2.setSic(edTueSicW2.getText().toString());
            trTueW2.setOc(edTueOCW2.getText().toString());
            trTueW2.setOh(edTueOHW2.getText().toString());
            trTueW2.setTot();

            EditText edWedRegW2 = (EditText)findViewById(R.id.edWedRegW2);
            EditText edWedHolW2 = (EditText)findViewById(R.id.edWedHolW2);
            EditText edWedVacW2 = (EditText)findViewById(R.id.edWedVacW2);
            EditText edWedSicW2 = (EditText)findViewById(R.id.edWedSicW2);
            EditText edWedOCW2 = (EditText)findViewById(R.id.edWedOCW2);
            EditText edWedOHW2 = (EditText)findViewById(R.id.edWedOHW2);

            TimeReport trWedW2 = new TimeReport();
            trWedW2.setReg(edWedRegW2.getText().toString());
            trWedW2.setHol(edWedHolW2.getText().toString());
            trWedW2.setVac(edWedVacW2.getText().toString());
            trWedW2.setSic(edWedSicW2.getText().toString());
            trWedW2.setOc(edWedOCW2.getText().toString());
            trWedW2.setOh(edWedOHW2.getText().toString());
            trWedW2.setTot();

            EditText edpdRegW2 = (EditText)findViewById(R.id.edpdRegW2);
            EditText edpdHolW2 = (EditText)findViewById(R.id.edpdHolW2);
            EditText edpdVacW2 = (EditText)findViewById(R.id.edpdVacW2);
            EditText edpdSicW2 = (EditText)findViewById(R.id.edpdSicW2);
            EditText edpdOCW2 = (EditText)findViewById(R.id.edpdOCW2);
            EditText edpdOHW2 = (EditText)findViewById(R.id.edpdOHW2);

            TimeReport trPjtW2 = new TimeReport();
            trPjtW2.setReg(edpdRegW2.getText().toString());
            trPjtW2.setHol(edpdHolW2.getText().toString());
            trPjtW2.setVac(edpdVacW2.getText().toString());
            trPjtW2.setSic(edpdSicW2.getText().toString());
            trPjtW2.setOc(edpdOCW2.getText().toString());
            trPjtW2.setOh(edpdOHW2.getText().toString());
            trPjtW2.setTot();


            TimeReport[] weekdays1 = {trThursW1, trFriW1, trSatW1, trSunW1, trMonW1, trTueW1, trWedW1, trPjtW1};
            TimeReport[] weekdays2 = {trThursW2, trFriW2, trSatW2, trSunW2, trMonW2, trTueW2, trWedW2, trPjtW2};
            String[] total1 = total(weekdays1);
            String[] total2 = total(weekdays2);
            String[] emp = {strEmpName,strEmpID,stredPP};
            setPage(doc, emp,weekdays1,total1,weekdays2,total2);
            doc.close();
            System.out.println("File created at"+ Environment.DIRECTORY_DOWNLOADS);
            sendMail(output);
            Toast.makeText(getApplicationContext(),"Send email successfully",Toast.LENGTH_SHORT);
            finishAffinity();
        }
        catch (DocumentException e)
        {
            e.printStackTrace();
        }
        catch (FileNotFoundException e)
        {
            e.printStackTrace();
        }
        catch (Exception e)
        {
            e.printStackTrace();
        }

    }



    public void sendMail(String path)
    {
        Intent email = new Intent(Intent.ACTION_SEND);
        email.putExtra(Intent.EXTRA_SUBJECT,"Hello, The timesheets for.");
        email.putExtra(Intent.EXTRA_TEXT, "Timesheet");
        Uri uri = Uri.parse("file://"+path);
        email.putExtra(Intent.EXTRA_STREAM, uri);
        email.setType("message/rfc822");
        startActivity(email);
    }





    public String[] total(TimeReport[] weeks)
    {

            int ireg = 0;
            int ihol = 0;
            int ivac = 0;
            int isic = 0;
            int ioh = 0;
            int ioc = 0;
            int itot = 0;


            for(int i = 0; i < weeks.length-1;i++)
            {
                ireg += Integer.parseInt(weeks[i].reg);
                ihol += Integer.parseInt(weeks[i].hol);
                isic += Integer.parseInt(weeks[i].sic);
                ivac += Integer.parseInt(weeks[i].vac);
                ioh  += Integer.parseInt(weeks[i].oh);
                ioc  += Integer.parseInt(weeks[i].oc);
                itot  += Integer.parseInt(weeks[i].tot);
            }


        String[] str =  {"Total Time Report",Integer.toString(ireg),Integer.toString(ihol),Integer.toString(ivac),
                Integer.toString(isic), Integer.toString(ioh),Integer.toString(ioc),
                Integer.toString(itot)};
            return str;
    }



    public static void setPage(Document document,String[] emp, TimeReport[] weektime, String[] tot, TimeReport[] weektime2, String[] tot2) throws BadElementException,DocumentException
    {
        String[] headers = {"Employee ID","Employee Name", "Pay Period Date"};
        String[] values = {emp[1],emp[0],emp[2]};

        Anchor anchor = new Anchor("BI WEEKLY DOCUMENT");
        anchor.setName("BI WEEKLY DOCUMENT");

        Chapter catPart = new Chapter(new Paragraph(anchor), 1);

        Paragraph subPara = new Paragraph("Details");
        Section subCatPart = catPart.addSection(subPara);
        subCatPart.add(new Paragraph(""));
        createTable(subCatPart,headers,values, 3 );

        String[] h2 = {"Pay Group Description","Bi-weekly Student"};
        String[] v2 = {};

        createTable(subCatPart,h2,v2,2);

        String[] h3 = {"Work Department Name/Mail Code","Computing, College of/0280"};
        String[] v3 = {};
        createTable(subCatPart,h3,v3,2);

        String[] h4 = {"Home Department Name/Mail Code","Computing, College of/0280"};
        String[] v4 = {};
        createTable(subCatPart,h4,v4,2);


        subCatPart.add(Chunk.NEWLINE);

        Paragraph subPara2 = new Paragraph("Week 1");
        Section subCatPart2 = catPart.addSection(subPara2);
        subCatPart2.add(new Paragraph(""));


        subCatPart2.add(Chunk.NEWLINE);


        String[] h5 = {"TIME REPORT"};
        String[] v5 = {};
        createTable(subCatPart2,h5,v5,1);


       // subCatPart.add(Chunk.NEWLINE);
        String[] h6 = {"BY DAY","Reg","Hol","Vac","Sick","Other Hours","Other Code","Total Hours"};
        String[] v6 = {};
        createTable(subCatPart2,h6,v6,8);

        String[] weeks = {"Thursday","Friday","Saturday","Sunday","Monday","Tuesday","Wednesday"};
        String[] v7 = {};
        for(int i = 0; i<7;i++) {

            String[] h7 = {weeks[i], weektime[i].reg, weektime[i].hol,
                    weektime[i].vac, weektime[i].sic, weektime[i].oh, weektime[i].oc, weektime[i].tot};
            createTable(subCatPart2,h7,v7,8);
        }
        //String[] h8 = {"Total Time Report","","","","","","",""};
        String[] h8 = tot;
        String[] v8 = {};
        createTable(subCatPart2,h8,v8,8);

        subCatPart2.add(Chunk.NEWLINE);


        String[] h9 = {"TIME DISTRIBUTION"};
        String[] v9 = {};
        createTable(subCatPart2,h9,v9,1);

        String[] h10 = {"BY PROJECT","Reg","Hol","Vac","Sick","Other Hours","Other Code","Total Hours"};
        String[] v10 = {};
        createTable(subCatPart2,h6,v6,8);

        String[] pjts = {"2301TUEXP"};
        String[] v11 = {};
        for(int i = 0; i<pjts.length;i++) {

            String[] h11 = {pjts[i], weektime[7].reg, weektime[7].hol,
                    weektime[7].vac, weektime[7].sic, weektime[7].oh, weektime[7].oc, weektime[7].tot};
            createTable(subCatPart2,h11,v11,8);
        }
        String[] h12 = {"Total Time Distribution", weektime[7].reg, weektime[7].hol,
                weektime[7].vac, weektime[7].sic, weektime[7].oh, weektime[7].oc, weektime[7].tot};
        String[] v12 = {};
        createTable(subCatPart2,h12,v12,8);

        subCatPart2.add(Chunk.NEWLINE);
        subCatPart2.add(Chunk.NEWLINE);
        subCatPart2.add(Chunk.NEWLINE);
        subCatPart2.add(Chunk.NEWLINE);
        subCatPart2.add(Chunk.NEWLINE);
        subCatPart2.add(Chunk.NEWLINE);

        //Week 2

        Paragraph subPara3 = new Paragraph("Week 2");
        Section subCatPart3 = catPart.addSection(subPara3);
        subCatPart3.add(new Paragraph(""));

        subCatPart3.add(Chunk.NEWLINE);

        String[] h13 = {"TIME REPORT"};
        String[] v13 = {};
        createTable(subCatPart3,h13,v13,1);





        // subCatPart.add(Chunk.NEWLINE);
        String[] h14 = {"BY PROJECT","Reg","Hol","Vac","Sick","Other Hours","Other Code","Total Hours"};
        String[] v14 = {};
        createTable(subCatPart3,h14,v14,8);

        String[] weeks2 = {"Thursday","Friday","Saturday","Sunday","Monday","Tuesday","Wednesday"};
        String[] v15 = {};
        for(int i = 0; i<7;i++) {

            String[] h15 = {weeks[i], weektime2[i].reg, weektime2[i].hol,
                    weektime2[i].vac, weektime2[i].sic, weektime2[i].oh, weektime2[i].oc, weektime2[i].tot};
            createTable(subCatPart3,h15,v15,8);
        }
       // String[] h16 = {"Total Time Report","","","","","","",""};
        String[] h16 =tot2;
        String[] v16 = {};
        createTable(subCatPart3,h16,v16,8);

        subCatPart3.add(Chunk.NEWLINE);


        String[] h17 = {"TIME DISTRIBUTION"};
        String[] v17 = {};
        createTable(subCatPart3,h17,v17,1);

        String[] h18 = {"BY PROJECT","Reg","Hol","Vac","Sick","Other Hours","Other Code","Total Hours"};
        String[] v18 = {};
        createTable(subCatPart3,h18,v18,8);

        String[] pjts2 = {"2301TUEXP"};
        String[] v19 = {};
        for(int i = 0; i<pjts2.length;i++) {

            String[] h19 = {pjts2[i], weektime2[7].reg, weektime2[7].hol,
                    weektime2[7].vac, weektime2[7].sic, weektime2[7].oh, weektime2[7].oc, weektime2[7].tot};
            createTable(subCatPart3,h19,v19,8);
        }
        String[] h20 = {"Total Time Distribution", weektime2[7].reg, weektime2[7].hol,
                weektime2[7].vac, weektime2[7].sic, weektime2[7].oh, weektime2[7].oc, weektime2[7].tot};
        String[] v20 = {};
        createTable(subCatPart3,h20,v20,8);

        subCatPart3.add(Chunk.NEWLINE);
        subCatPart3.add(Chunk.NEWLINE);


        //Week 2

        Paragraph subPara4 = new Paragraph("Signature");
        Section subCatPart4 = catPart.addSection(subPara4);
        subCatPart4.add(new Paragraph("I do hereby certify that the hours shown on the above time report are true and correct to the best of my knowledge and belief."));

        subCatPart4.add(Chunk.NEWLINE);
        subCatPart4.add(Chunk.NEWLINE);

        String[] h25 = {"   ","    "};
        String[] v25 = {"Employee's Signature/Date","Departmental Approval/Date"};
        createTable(subCatPart4,h25,v25,2);

        subCatPart4.add(Chunk.NEWLINE);
        subCatPart4.add(Chunk.NEWLINE);


        String[] h21 = {"Other Hours","Codes"};
        String[] v22 = {};
        String[] v21 = {"Campus Closed Day","CCD"};
        String[] h22 = {"Call Back Overtime","CLL"};
        String[] h23 = {"Jury Duty","JRY"};
        String[] h24 = {"Miltary Duty","MIL"};

        createTable(subCatPart4,h21,v21,2);
        createTable(subCatPart4,h22,v22,2);
        createTable(subCatPart4,h23,v22,2);
        createTable(subCatPart4,h24,v22,2);


        document.add(catPart);
    }

    public static  void createTable(Section sub, String[] values,String[] headers, int cols) throws BadElementException
    {



        PdfPTable pt = new PdfPTable(cols);

        if(headers.length > 0) {
            for (int i = 0; i < values.length; i++) {
                PdfPCell pc = new PdfPCell(new Phrase(headers[i].toString()));
                pc.setHorizontalAlignment(Element.ALIGN_CENTER);
                pc.setNoWrap(false);
                pt.addCell(pc);
            }
            pt.setHeaderRows(1);
        }
        if(values.length >0)
        {
            for(int i = 0; i < values.length;i++) {
                pt.addCell(values[i]);
            }
        }
        sub.add(pt);
    }

}
