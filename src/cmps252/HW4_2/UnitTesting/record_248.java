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
class Record_248 {

	private static List<Customer> customers;

	@BeforeAll
	public static void init() throws FileNotFoundException {
		customers = FileParser.getCustomers(Configuration.CSV_File);
	}

	@Test
	@DisplayName("Record 248: FirstName is Edwin")
	void FirstNameOfRecord248() {
		assertEquals("Edwin", customers.get(247).getFirstName());
	}

	@Test
	@DisplayName("Record 248: LastName is Plympton")
	void LastNameOfRecord248() {
		assertEquals("Plympton", customers.get(247).getLastName());
	}

	@Test
	@DisplayName("Record 248: Company is Promotions Plus")
	void CompanyOfRecord248() {
		assertEquals("Promotions Plus", customers.get(247).getCompany());
	}

	@Test
	@DisplayName("Record 248: Address is 204 Huntingdon Dr")
	void AddressOfRecord248() {
		assertEquals("204 Huntingdon Dr", customers.get(247).getAddress());
	}

	@Test
	@DisplayName("Record 248: City is Irving")
	void CityOfRecord248() {
		assertEquals("Irving", customers.get(247).getCity());
	}

	@Test
	@DisplayName("Record 248: County is Dallas")
	void CountyOfRecord248() {
		assertEquals("Dallas", customers.get(247).getCounty());
	}

	@Test
	@DisplayName("Record 248: State is TX")
	void StateOfRecord248() {
		assertEquals("TX", customers.get(247).getState());
	}

	@Test
	@DisplayName("Record 248: ZIP is 75061")
	void ZIPOfRecord248() {
		assertEquals("75061", customers.get(247).getZIP());
	}

	@Test
	@DisplayName("Record 248: Phone is 972-986-2356")
	void PhoneOfRecord248() {
		assertEquals("972-986-2356", customers.get(247).getPhone());
	}

	@Test
	@DisplayName("Record 248: Fax is 972-986-3509")
	void FaxOfRecord248() {
		assertEquals("972-986-3509", customers.get(247).getFax());
	}

	@Test
	@DisplayName("Record 248: Email is edwin@plympton.com")
	void EmailOfRecord248() {
		assertEquals("edwin@plympton.com", customers.get(247).getEmail());
	}

	@Test
	@DisplayName("Record 248: Web is http://www.edwinplympton.com")
	void WebOfRecord248() {
		assertEquals("http://www.edwinplympton.com", customers.get(247).getWeb());
	}
}
