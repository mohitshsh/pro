package reservationDAO;

import Entity.Reservation;
import Entity.ReservationHome;

public class ReserveProcessDAOImpl {
	
	
	

		public void createReservation(Reservation aReservationInstance) {
			// TODO Auto-generated method stub
			
			
			ReservationHome lReservationHome = new ReservationHome();
			lReservationHome.persist(aReservationInstance);
			
			
			
		}


	}

