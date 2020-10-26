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

@Tag("23")
class Record_3202 {

	private static List<Customer> customers;

	@BeforeAll
	public static void init() throws FileNotFoundException {
		customers = FileParser.getCustomers(Configuration.CSV_File);
	}

	@Test
	@DisplayName("Record 3202: FirstName is Valerie")
	void FirstNameOfRecord3202() {
		assertEquals("Valerie", customers.get(3201).getFirstName());
	}

	@Test
	@DisplayName("Record 3202: LastName is Virock")
	void LastNameOfRecord3202() {
		assertEquals("Virock", customers.get(3201).getLastName());
	}

	@Test
	@DisplayName("Record 3202: Company is A 1 Rubber Stamp")
	void CompanyOfRecord3202() {
		assertEquals("A 1 Rubber Stamp", customers.get(3201).getCompany());
	}

	@Test
	@DisplayName("Record 3202: Address is 4630 Exchange Service Dr")
	void AddressOfRecord3202() {
		assertEquals("4630 Exchange Service Dr", customers.get(3201).getAddress());
	}

	@Test
	@DisplayName("Record 3202: City is Dallas")
	void CityOfRecord3202() {
		assertEquals("Dallas", customers.get(3201).getCity());
	}

	@Test
	@DisplayName("Record 3202: County is Dallas")
	void CountyOfRecord3202() {
		assertEquals("Dallas", customers.get(3201).getCounty());
	}

	@Test
	@DisplayName("Record 3202: State is TX")
	void StateOfRecord3202() {
		assertEquals("TX", customers.get(3201).getState());
	}

	@Test
	@DisplayName("Record 3202: ZIP is 75236")
	void ZIPOfRecord3202() {
		assertEquals("75236", customers.get(3201).getZIP());
	}

	@Test
	@DisplayName("Record 3202: Phone is 214-337-5079")
	void PhoneOfRecord3202() {
		assertEquals("214-337-5079", customers.get(3201).getPhone());
	}

	@Test
	@DisplayName("Record 3202: Fax is 214-337-6166")
	void FaxOfRecord3202() {
		assertEquals("214-337-6166", customers.get(3201).getFax());
	}

	@Test
	@DisplayName("Record 3202: Email is valerie@virock.com")
	void EmailOfRecord3202() {
		assertEquals("valerie@virock.com", customers.get(3201).getEmail());
	}

	@Test
	@DisplayName("Record 3202: Web is http://www.valerievirock.com")
	void WebOfRecord3202() {
		assertEquals("http://www.valerievirock.com", customers.get(3201).getWeb());
	}
}
