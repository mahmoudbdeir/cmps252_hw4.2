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

@Tag("14")
class Record_3942 {

	private static List<Customer> customers;

	@BeforeAll
	public static void init() throws FileNotFoundException {
		customers = FileParser.getCustomers(Configuration.CSV_File);
	}

	@Test
	@DisplayName("Record 3942: FirstName is Reed")
	void FirstNameOfRecord3942() {
		assertEquals("Reed", customers.get(3941).getFirstName());
	}

	@Test
	@DisplayName("Record 3942: LastName is Pilling")
	void LastNameOfRecord3942() {
		assertEquals("Pilling", customers.get(3941).getLastName());
	}

	@Test
	@DisplayName("Record 3942: Company is Berger, Stuart Cpa")
	void CompanyOfRecord3942() {
		assertEquals("Berger, Stuart Cpa", customers.get(3941).getCompany());
	}

	@Test
	@DisplayName("Record 3942: Address is 54 State St")
	void AddressOfRecord3942() {
		assertEquals("54 State St", customers.get(3941).getAddress());
	}

	@Test
	@DisplayName("Record 3942: City is North Haven")
	void CityOfRecord3942() {
		assertEquals("North Haven", customers.get(3941).getCity());
	}

	@Test
	@DisplayName("Record 3942: County is New Haven")
	void CountyOfRecord3942() {
		assertEquals("New Haven", customers.get(3941).getCounty());
	}

	@Test
	@DisplayName("Record 3942: State is CT")
	void StateOfRecord3942() {
		assertEquals("CT", customers.get(3941).getState());
	}

	@Test
	@DisplayName("Record 3942: ZIP is 6473")
	void ZIPOfRecord3942() {
		assertEquals("6473", customers.get(3941).getZIP());
	}

	@Test
	@DisplayName("Record 3942: Phone is 203-234-9605")
	void PhoneOfRecord3942() {
		assertEquals("203-234-9605", customers.get(3941).getPhone());
	}

	@Test
	@DisplayName("Record 3942: Fax is 203-234-2116")
	void FaxOfRecord3942() {
		assertEquals("203-234-2116", customers.get(3941).getFax());
	}

	@Test
	@DisplayName("Record 3942: Email is reed@pilling.com")
	void EmailOfRecord3942() {
		assertEquals("reed@pilling.com", customers.get(3941).getEmail());
	}

	@Test
	@DisplayName("Record 3942: Web is http://www.reedpilling.com")
	void WebOfRecord3942() {
		assertEquals("http://www.reedpilling.com", customers.get(3941).getWeb());
	}
}
