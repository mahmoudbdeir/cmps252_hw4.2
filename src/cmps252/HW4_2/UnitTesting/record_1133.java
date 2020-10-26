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

@Tag("44")
class Record_1133 {

	private static List<Customer> customers;

	@BeforeAll
	public static void init() throws FileNotFoundException {
		customers = FileParser.getCustomers(Configuration.CSV_File);
	}

	@Test
	@DisplayName("Record 1133: FirstName is Lucinda")
	void FirstNameOfRecord1133() {
		assertEquals("Lucinda", customers.get(1132).getFirstName());
	}

	@Test
	@DisplayName("Record 1133: LastName is Borchardt")
	void LastNameOfRecord1133() {
		assertEquals("Borchardt", customers.get(1132).getLastName());
	}

	@Test
	@DisplayName("Record 1133: Company is City Rubber Stamp Co")
	void CompanyOfRecord1133() {
		assertEquals("City Rubber Stamp Co", customers.get(1132).getCompany());
	}

	@Test
	@DisplayName("Record 1133: Address is 6550 Chase Rd")
	void AddressOfRecord1133() {
		assertEquals("6550 Chase Rd", customers.get(1132).getAddress());
	}

	@Test
	@DisplayName("Record 1133: City is Dearborn")
	void CityOfRecord1133() {
		assertEquals("Dearborn", customers.get(1132).getCity());
	}

	@Test
	@DisplayName("Record 1133: County is Wayne")
	void CountyOfRecord1133() {
		assertEquals("Wayne", customers.get(1132).getCounty());
	}

	@Test
	@DisplayName("Record 1133: State is MI")
	void StateOfRecord1133() {
		assertEquals("MI", customers.get(1132).getState());
	}

	@Test
	@DisplayName("Record 1133: ZIP is 48126")
	void ZIPOfRecord1133() {
		assertEquals("48126", customers.get(1132).getZIP());
	}

	@Test
	@DisplayName("Record 1133: Phone is 313-846-6253")
	void PhoneOfRecord1133() {
		assertEquals("313-846-6253", customers.get(1132).getPhone());
	}

	@Test
	@DisplayName("Record 1133: Fax is 313-846-9077")
	void FaxOfRecord1133() {
		assertEquals("313-846-9077", customers.get(1132).getFax());
	}

	@Test
	@DisplayName("Record 1133: Email is lucinda@borchardt.com")
	void EmailOfRecord1133() {
		assertEquals("lucinda@borchardt.com", customers.get(1132).getEmail());
	}

	@Test
	@DisplayName("Record 1133: Web is http://www.lucindaborchardt.com")
	void WebOfRecord1133() {
		assertEquals("http://www.lucindaborchardt.com", customers.get(1132).getWeb());
	}
}
