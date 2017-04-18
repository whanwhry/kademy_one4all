/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package homework;

/**
 *
 * @author KARTOON
 */
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class TestDate {

    public static String dateInThai(String strDate) {
        String months[] = {"มกราคม", "กุมภาพันธ์", "มีนาคม", "เมษายน",
            "พฤษภาคม", "มิถุนายน", "กรกฎาคม", "สิงหาคม",
            "กันยายน", "ตุลาคม", "พฤศจิกายน", "ธันวาคม"};
        //สร้างตัวแปรชนิด String เป็นอาเรย์ชื่อ months ไว้เก็บค่าเดือนทั้ง 12 เดือน
        DateFormat datefmt = new SimpleDateFormat("yyyy-MM-dd");
        //DateFormat เป็นคลาสที่มีอยู่แล้วใน Java โดยต้องมีการ import เพื่อใช้งาน
        //สร้าง object จาก Class DateFormat ใช้ในการกำหนด format ให้กับวันที่
        int year = 0, month = 0, day = 0;
        //สร้างตัวแปรชนิด int เก็บค่าวันเดือนปีโดยกำหนดค่าเริ่มแรกให้ = 0

        try {
            //สร้างคำสั่ง try เพื่อ Run Statement ต่างๆ
            Date date = datefmt.parse(strDate);
            //เนื่องจากเรารับค่าจากพารามิเตอร์มาเป็น String จึงต้องมีการแปลงค่าโดยใช้คำสั่ง parse
            Calendar cld = Calendar.getInstance();
            //Calendar เป็นคลาสที่มีอยู่แล้วใน Java โดยต้องมีการ import เพื่อใช้งาน
            //สร้าง object cld เพื่อเก็บค่าา Calendar.getInstance(); เป็นเหมือน object ปฏิทิน
            cld.setTime(date);
            //set เวลาโดยใช้ข้อมูลจาก date ที่มีการแปลงมาจาก strDate ที่รับเข้ามาจากพารามิเตอร์อีกที
            year = cld.get(Calendar.YEAR);
            month = cld.get(Calendar.MONTH);
            day = cld.get(Calendar.DATE);
            //ทำการนำค่าวันเดือนปีที่เรียกผ่าน method ของคลาส Calendar มาเก็บในตัวแปรตามชื่อ
        } catch (ParseException e) {
            //สร้าง catch ดักจับ ParseException 
            //ParseException >>ความผิดพลาดในกรณีที่ไม่สามารถ parse ค่า String ให้กับ format ที่ระบุไว้ได้)
            e.printStackTrace();
        }
        return String.format("%s %s %s", day, months[month], year + 543);
        //ทำการคืนค่าเป็น  String โดยให้มีรูปแบบตามที่กำหนด
        //%s คือสั่งให้แสดงค่าออกมาตามที่กำหนดเช่น อยากให้แสดงทั้ง day ,months[month],year+543 ต้องมี %s 3 ตัว
        //ถ้าอยากแสดงแต่ day ก็มี %s ตัวเดียว
        //ถ้าไม่มี %s เลยค่าจะไม่ออก
    }

    public static void main(String[] args) {
        //ใน main class นี้ สร้างตัวแปรชนิด String เพื่อกำหนดวันเดือนปีแบบตัวเลข
        //แล้วใช้ method dateInThai ที่สร้างขึ้นในการแสดงผลให้ออกมาเป็นวันที่แบบไทย
        String date = "2017-04-06";
        System.out.println("Date in Thai : " + dateInThai(date));
    }
}
