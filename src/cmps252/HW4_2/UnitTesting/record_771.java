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

@Tag("10")
class Record_771 {

	private static List<Customer> customers;

	@BeforeAll
	public static void init() throws FileNotFoundException {
		customers = FileParser.getCustomers(Configuration.CSV_File);
	}

	@Test
	@DisplayName("Record 771: FirstName is Thad")
	void FirstNameOfRecord771() {
		assertEquals("Thad", customers.get(770).getFirstName());
	}

	@Test
	@DisplayName("Record 771: LastName is Loosle")
	void LastNameOfRecord771() {
		assertEquals("Loosle", customers.get(770).getLastName());
	}

	@Test
	@DisplayName("Record 771: Company is V Med Inc")
	void CompanyOfRecord771() {
		assertEquals("V Med Inc", customers.get(770).getCompany());
	}

	@Test
	@DisplayName("Record 771: Address is 1 Auto Club Dr")
	void AddressOfRecord771() {
		assertEquals("1 Auto Club Dr", customers.get(770).getAddress());
	}

	@Test
	@DisplayName("Record 771: City is Dearborn")
	void CityOfRecord771() {
		assertEquals("Dearborn", customers.get(770).getCity());
	}

	@Test
	@DisplayName("Record 771: County is Wayne")
	void CountyOfRecord771() {
		assertEquals("Wayne", customers.get(770).getCounty());
	}

	@Test
	@DisplayName("Record 771: State is MI")
	void StateOfRecord771() {
		assertEquals("MI", customers.get(770).getState());
	}

	@Test
	@DisplayName("Record 771: ZIP is 48126")
	void ZIPOfRecord771() {
		assertEquals("48126", customers.get(770).getZIP());
	}

	@Test
	@DisplayName("Record 771: Phone is 313-336-9783")
	void PhoneOfRecord771() {
		assertEquals("313-336-9783", customers.get(770).getPhone());
	}

	@Test
	@DisplayName("Record 771: Fax is 313-336-7824")
	void FaxOfRecord771() {
		assertEquals("313-336-7824", customers.get(770).getFax());
	}

	@Test
	@DisplayName("Record 771: Email is thad@loosle.com")
	void EmailOfRecord771() {
		assertEquals("thad@loosle.com", customers.get(770).getEmail());
	}

	@Test
	@DisplayName("Record 771: Web is http://www.thadloosle.com")
	void WebOfRecord771() {
		assertEquals("http://www.thadloosle.com", customers.get(770).getWeb());
	}
}
