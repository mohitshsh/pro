package consumer;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import Entity.Reservation;
import reservationDAO.ReserveProcessDAOImpl;

@Controller
public class ReserveProcess {
	



		
		private String formatTime(int aHours,int aMins, int aSeconds){
			
			Calendar myCalendar = Calendar.getInstance();
			myCalendar.set(Calendar.HOUR, aHours);
			myCalendar.set(Calendar.MINUTE, aMins);
			myCalendar.set(Calendar.SECOND, aSeconds);

			SimpleDateFormat sdf =  new SimpleDateFormat("HH:mm:ss" );
			String rTime = sdf.format(  myCalendar.getTime() );  
			
			return rTime;
			
		}
		
		private Reservation createReservationInstance(){
			
			Reservation lReservation = new Reservation();
			
			DateFormat formatter = new SimpleDateFormat("yyyy-MM-dd");
			
			Date myDate = null;
			try {
				myDate = formatter.parse("2016-11-04");
			} catch (ParseException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			java.sql.Date reservDate = new java.sql.Date(myDate.getTime());
			
			lReservation.setReservDate(reservDate);
			lReservation.setCsPortid(123);
			lReservation.setReserveStartTime(formatTime(14,30,00));
			lReservation.setReserveEndTime(formatTime(13,30,00));
			lReservation.setElectricalVehicleid("E123");
			
			return lReservation;
			
			
			
		}
		@RequestMapping(value="/")
		public String home(){
			return "index";
			
			
		}
		
		
		@RequestMapping(value="/userInputPage", method =RequestMethod.POST)
		public String processed() {
	        
			//ReserveProcess lReserveProcess = new ReserveProcess();
			Reservation lReservationInstance =createReservationInstance();
			
			ReserveProcessDAOImpl ReserveDAO = new ReserveProcessDAOImpl();
			ReserveDAO.createReservation(lReservationInstance);
			System.out.println("Here");
			
			return "Home";
	    }


	}

