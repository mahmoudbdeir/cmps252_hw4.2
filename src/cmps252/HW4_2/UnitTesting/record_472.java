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

@Tag("15")
class Record_472 {

	private static List<Customer> customers;

	@BeforeAll
	public static void init() throws FileNotFoundException {
		customers = FileParser.getCustomers(Configuration.CSV_File);
	}

	@Test
	@DisplayName("Record 472: FirstName is Carroll")
	void FirstNameOfRecord472() {
		assertEquals("Carroll", customers.get(471).getFirstName());
	}

	@Test
	@DisplayName("Record 472: LastName is Pestronk")
	void LastNameOfRecord472() {
		assertEquals("Pestronk", customers.get(471).getLastName());
	}

	@Test
	@DisplayName("Record 472: Company is Girl Scouts Farthest N Cncl")
	void CompanyOfRecord472() {
		assertEquals("Girl Scouts Farthest N Cncl", customers.get(471).getCompany());
	}

	@Test
	@DisplayName("Record 472: Address is 1315 Lamar St")
	void AddressOfRecord472() {
		assertEquals("1315 Lamar St", customers.get(471).getAddress());
	}

	@Test
	@DisplayName("Record 472: City is Denver")
	void CityOfRecord472() {
		assertEquals("Denver", customers.get(471).getCity());
	}

	@Test
	@DisplayName("Record 472: County is Jefferson")
	void CountyOfRecord472() {
		assertEquals("Jefferson", customers.get(471).getCounty());
	}

	@Test
	@DisplayName("Record 472: State is CO")
	void StateOfRecord472() {
		assertEquals("CO", customers.get(471).getState());
	}

	@Test
	@DisplayName("Record 472: ZIP is 80214")
	void ZIPOfRecord472() {
		assertEquals("80214", customers.get(471).getZIP());
	}

	@Test
	@DisplayName("Record 472: Phone is 303-237-3823")
	void PhoneOfRecord472() {
		assertEquals("303-237-3823", customers.get(471).getPhone());
	}

	@Test
	@DisplayName("Record 472: Fax is 303-237-5968")
	void FaxOfRecord472() {
		assertEquals("303-237-5968", customers.get(471).getFax());
	}

	@Test
	@DisplayName("Record 472: Email is carroll@pestronk.com")
	void EmailOfRecord472() {
		assertEquals("carroll@pestronk.com", customers.get(471).getEmail());
	}

	@Test
	@DisplayName("Record 472: Web is http://www.carrollpestronk.com")
	void WebOfRecord472() {
		assertEquals("http://www.carrollpestronk.com", customers.get(471).getWeb());
	}
}
