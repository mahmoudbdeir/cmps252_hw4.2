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

@Tag("2")
class Record_563 {

	private static List<Customer> customers;

	@BeforeAll
	public static void init() throws FileNotFoundException {
		customers = FileParser.getCustomers(Configuration.CSV_File);
	}

	@Test
	@DisplayName("Record 563: FirstName is Giovanni")
	void FirstNameOfRecord563() {
		assertEquals("Giovanni", customers.get(562).getFirstName());
	}

	@Test
	@DisplayName("Record 563: LastName is Fenstermaker")
	void LastNameOfRecord563() {
		assertEquals("Fenstermaker", customers.get(562).getLastName());
	}

	@Test
	@DisplayName("Record 563: Company is Mcconkey Gleason Inc")
	void CompanyOfRecord563() {
		assertEquals("Mcconkey Gleason Inc", customers.get(562).getCompany());
	}

	@Test
	@DisplayName("Record 563: Address is 1630 S Beckley St")
	void AddressOfRecord563() {
		assertEquals("1630 S Beckley St", customers.get(562).getAddress());
	}

	@Test
	@DisplayName("Record 563: City is Lancaster")
	void CityOfRecord563() {
		assertEquals("Lancaster", customers.get(562).getCity());
	}

	@Test
	@DisplayName("Record 563: County is Dallas")
	void CountyOfRecord563() {
		assertEquals("Dallas", customers.get(562).getCounty());
	}

	@Test
	@DisplayName("Record 563: State is TX")
	void StateOfRecord563() {
		assertEquals("TX", customers.get(562).getState());
	}

	@Test
	@DisplayName("Record 563: ZIP is 75146")
	void ZIPOfRecord563() {
		assertEquals("75146", customers.get(562).getZIP());
	}

	@Test
	@DisplayName("Record 563: Phone is 972-293-6873")
	void PhoneOfRecord563() {
		assertEquals("972-293-6873", customers.get(562).getPhone());
	}

	@Test
	@DisplayName("Record 563: Fax is 972-293-6984")
	void FaxOfRecord563() {
		assertEquals("972-293-6984", customers.get(562).getFax());
	}

	@Test
	@DisplayName("Record 563: Email is giovanni@fenstermaker.com")
	void EmailOfRecord563() {
		assertEquals("giovanni@fenstermaker.com", customers.get(562).getEmail());
	}

	@Test
	@DisplayName("Record 563: Web is http://www.giovannifenstermaker.com")
	void WebOfRecord563() {
		assertEquals("http://www.giovannifenstermaker.com", customers.get(562).getWeb());
	}
}
