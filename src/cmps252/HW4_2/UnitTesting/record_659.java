package cmps252.HW4_2.UnitTesting;

import static org.junit.jupiter.api.Assertions.*;
import java.io.FileNotFoundException;
import java.util.List;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import cmps252.HW4_2.Customer;
import cmps252.HW4_2.FileParser;

@Tag("31")
class Record_659 {

	private static List<Customer> customers;

	@BeforeAll
	public static void init() throws FileNotFoundException {
		customers = FileParser.getCustomers(Configuration.CSV_File);
	}

	@Test
	@DisplayName("Record 659: FirstName is Hilary")
	void FirstNameOfRecord659() {
		assertEquals("Hilary", customers.get(658).getFirstName());
	}

	@Test
	@DisplayName("Record 659: LastName is Slygh")
	void LastNameOfRecord659() {
		assertEquals("Slygh", customers.get(658).getLastName());
	}

	@Test
	@DisplayName("Record 659: Company is Interstate Bearing")
	void CompanyOfRecord659() {
		assertEquals("Interstate Bearing", customers.get(658).getCompany());
	}

	@Test
	@DisplayName("Record 659: Address is 272 Meridian St")
	void AddressOfRecord659() {
		assertEquals("272 Meridian St", customers.get(658).getAddress());
	}

	@Test
	@DisplayName("Record 659: City is Boston")
	void CityOfRecord659() {
		assertEquals("Boston", customers.get(658).getCity());
	}

	@Test
	@DisplayName("Record 659: County is Suffolk")
	void CountyOfRecord659() {
		assertEquals("Suffolk", customers.get(658).getCounty());
	}

	@Test
	@DisplayName("Record 659: State is MA")
	void StateOfRecord659() {
		assertEquals("MA", customers.get(658).getState());
	}

	@Test
	@DisplayName("Record 659: ZIP is 2128")
	void ZIPOfRecord659() {
		assertEquals("2128", customers.get(658).getZIP());
	}

	@Test
	@DisplayName("Record 659: Phone is 617-561-0586")
	void PhoneOfRecord659() {
		assertEquals("617-561-0586", customers.get(658).getPhone());
	}

	@Test
	@DisplayName("Record 659: Fax is 617-561-1497")
	void FaxOfRecord659() {
		assertEquals("617-561-1497", customers.get(658).getFax());
	}

	@Test
	@DisplayName("Record 659: Email is hilary@slygh.com")
	void EmailOfRecord659() {
		assertEquals("hilary@slygh.com", customers.get(658).getEmail());
	}

	@Test
	@DisplayName("Record 659: Web is http://www.hilaryslygh.com")
	void WebOfRecord659() {
		assertEquals("http://www.hilaryslygh.com", customers.get(658).getWeb());
	}
}
