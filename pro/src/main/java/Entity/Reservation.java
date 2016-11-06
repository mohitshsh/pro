package Entity;
// Generated 6-Nov-2016 1:07:45 AM by Hibernate Tools 4.3.1.Final

import java.util.Date;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import static javax.persistence.GenerationType.IDENTITY;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

/**
 * Reservation generated by hbm2java
 */
@Entity
@Table(name = "reservation")
public class Reservation implements java.io.Serializable {

	private Integer idReservation;
	private Integer csPortid;
	private Integer csNumber;
	private Date reservDate;
	private String reserveStartTime;
	private String reserveEndTime;
	private String porttype;
	private String csSiteid;
	private String electricalVehicleid;
	private String reservestatus;
	private String timecreated;
	private String timecancelation;
	private String reserveprice;
	private String reservetax;

	public Reservation() {
	}

	public Reservation(Integer csPortid, Integer csNumber, Date reservDate, String reserveStartTime,
			String reserveEndTime, String porttype, String csSiteid, String electricalVehicleid, String reservestatus,
			String timecreated, String timecancelation, String reserveprice, String reservetax) {
		this.csPortid = csPortid;
		this.csNumber = csNumber;
		this.reservDate = reservDate;
		this.reserveStartTime = reserveStartTime;
		this.reserveEndTime = reserveEndTime;
		this.porttype = porttype;
		this.csSiteid = csSiteid;
		this.electricalVehicleid = electricalVehicleid;
		this.reservestatus = reservestatus;
		this.timecreated = timecreated;
		this.timecancelation = timecancelation;
		this.reserveprice = reserveprice;
		this.reservetax = reservetax;
	}

	@Id
	@GeneratedValue(strategy = IDENTITY)

	@Column(name = "idReservation", unique = true, nullable = false)
	public Integer getIdReservation() {
		return this.idReservation;
	}

	public void setIdReservation(Integer idReservation) {
		this.idReservation = idReservation;
	}

	@Column(name = "CS_PORTID")
	public Integer getCsPortid() {
		return this.csPortid;
	}

	public void setCsPortid(Integer csPortid) {
		this.csPortid = csPortid;
	}

	@Column(name = "CS_NUMBER")
	public Integer getCsNumber() {
		return this.csNumber;
	}

	public void setCsNumber(Integer csNumber) {
		this.csNumber = csNumber;
	}

	@Temporal(TemporalType.DATE)
	@Column(name = "RESERV_DATE", length = 10)
	public Date getReservDate() {
		return this.reservDate;
	}

	public void setReservDate(Date reservDate) {
		this.reservDate = reservDate;
	}

	@Column(name = "RESERVE_START_TIME", length = 45)
	public String getReserveStartTime() {
		return this.reserveStartTime;
	}

	public void setReserveStartTime(String reserveStartTime) {
		this.reserveStartTime = reserveStartTime;
	}

	@Column(name = "RESERVE_END_TIME", length = 45)
	public String getReserveEndTime() {
		return this.reserveEndTime;
	}

	public void setReserveEndTime(String reserveEndTime) {
		this.reserveEndTime = reserveEndTime;
	}

	@Column(name = "PORTTYPE", length = 45)
	public String getPorttype() {
		return this.porttype;
	}

	public void setPorttype(String porttype) {
		this.porttype = porttype;
	}

	@Column(name = "CS_SITEID", length = 45)
	public String getCsSiteid() {
		return this.csSiteid;
	}

	public void setCsSiteid(String csSiteid) {
		this.csSiteid = csSiteid;
	}

	@Column(name = "ELECTRICAL_VEHICLEID", length = 45)
	public String getElectricalVehicleid() {
		return this.electricalVehicleid;
	}

	public void setElectricalVehicleid(String electricalVehicleid) {
		this.electricalVehicleid = electricalVehicleid;
	}

	@Column(name = "RESERVESTATUS", length = 45)
	public String getReservestatus() {
		return this.reservestatus;
	}

	public void setReservestatus(String reservestatus) {
		this.reservestatus = reservestatus;
	}

	@Column(name = "TIMECREATED", length = 45)
	public String getTimecreated() {
		return this.timecreated;
	}

	public void setTimecreated(String timecreated) {
		this.timecreated = timecreated;
	}

	@Column(name = "TIMECANCELATION", length = 45)
	public String getTimecancelation() {
		return this.timecancelation;
	}

	public void setTimecancelation(String timecancelation) {
		this.timecancelation = timecancelation;
	}

	@Column(name = "RESERVEPRICE", length = 45)
	public String getReserveprice() {
		return this.reserveprice;
	}

	public void setReserveprice(String reserveprice) {
		this.reserveprice = reserveprice;
	}

	@Column(name = "RESERVETAX", length = 45)
	public String getReservetax() {
		return this.reservetax;
	}

	public void setReservetax(String reservetax) {
		this.reservetax = reservetax;
	}

}
