package com.psa.flight_reservation_app_5.utilities;

import java.io.File;
import java.io.FileOutputStream;

import org.springframework.stereotype.Component;

import com.itextpdf.text.Document;
import com.itextpdf.text.Element;
import com.itextpdf.text.Font;
import com.itextpdf.text.Paragraph;
import com.itextpdf.text.Phrase;
import com.itextpdf.text.pdf.PdfPCell;
import com.itextpdf.text.pdf.PdfPTable;
import com.itextpdf.text.pdf.PdfWriter;
import com.psa.flight_reservation_app_5.entity.Reservation;

@Component
public class PDFGenerator {
	
	public void generateItinerary(Reservation reservation, String filePath) {
	
	Document document = new Document();
	try {

        PdfWriter.getInstance(document, new FileOutputStream(new File(filePath)));

        //open
        document.open();
        document.add(generateTable(reservation));
        document.close();
	}catch(Exception e) {
		e.printStackTrace();
		}
	}
	
	private PdfPTable generateTable(Reservation reservation) {
		
		Font f = new Font();
        f.setStyle(Font.BOLD);
        f.setSize(8);
		
		PdfPTable table = new PdfPTable(2);
		PdfPCell cell;
		
		cell = new PdfPCell(new Phrase("Flight Itinerary", f));
		cell.setColspan(2);
		table.addCell(cell);
		
		cell = new PdfPCell(new Phrase("Flight Details"));
		cell.setColspan(2);
		table.addCell(cell);
		
		table.addCell("Departure City");
		table.addCell(reservation.getFlight().getDepartureCity());//inside reservation it is one to one mapping now  get flight()  give me the flight object address using flight object address we are calling the departure city because this details are present in the flight table; But where ever reservation table details need to face we are fetching it directly  
		
		table.addCell("Arrival City");
		table.addCell(reservation.getFlight().getArrivalCity());
		
		table.addCell("Flight Number");
		table.addCell(reservation.getFlight().getFlightNumber());
		
		table.addCell("Operating Airlines");
		table.addCell(reservation.getFlight().getOperatingAirlines());
		
		table.addCell("Departure Date");
		table.addCell(reservation.getFlight().getDateOfDeparture().toString());
		
		table.addCell("Departure Time");
		table.addCell(reservation.getFlight().getEstimatedDepartureTime().toString());
	
		cell = new PdfPCell(new Phrase("Passenger Details"));
		cell.setColspan(2);
		table.addCell(cell);
		
		table.addCell("First Name");
		table.addCell(reservation.getPassenger().getFirstName());
		
		table.addCell("Last Name");
		table.addCell(reservation.getPassenger().getLastName());
		
		table.addCell("Middle Name");
		table.addCell(reservation.getPassenger().getMiddleName());
		
		table.addCell("Email");
		table.addCell(reservation.getPassenger().getEmail());
		
		table.addCell("Phone No.");
		table.addCell(reservation.getPassenger().getPhone());
		return table;
	}
}

