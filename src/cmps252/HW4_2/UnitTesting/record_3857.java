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

@Tag("12")
class Record_3857 {

	private static List<Customer> customers;

	@BeforeAll
	public static void init() throws FileNotFoundException {
		customers = FileParser.getCustomers(Configuration.CSV_File);
	}

	@Test
	@DisplayName("Record 3857: FirstName is Mohamed")
	void FirstNameOfRecord3857() {
		assertEquals("Mohamed", customers.get(3856).getFirstName());
	}

	@Test
	@DisplayName("Record 3857: LastName is Creasman")
	void LastNameOfRecord3857() {
		assertEquals("Creasman", customers.get(3856).getLastName());
	}

	@Test
	@DisplayName("Record 3857: Company is Joes Office Equipment Supply")
	void CompanyOfRecord3857() {
		assertEquals("Joes Office Equipment Supply", customers.get(3856).getCompany());
	}

	@Test
	@DisplayName("Record 3857: Address is 100 S 1st Ave")
	void AddressOfRecord3857() {
		assertEquals("100 S 1st Ave", customers.get(3856).getAddress());
	}

	@Test
	@DisplayName("Record 3857: City is Reading")
	void CityOfRecord3857() {
		assertEquals("Reading", customers.get(3856).getCity());
	}

	@Test
	@DisplayName("Record 3857: County is Berks")
	void CountyOfRecord3857() {
		assertEquals("Berks", customers.get(3856).getCounty());
	}

	@Test
	@DisplayName("Record 3857: State is PA")
	void StateOfRecord3857() {
		assertEquals("PA", customers.get(3856).getState());
	}

	@Test
	@DisplayName("Record 3857: ZIP is 19611")
	void ZIPOfRecord3857() {
		assertEquals("19611", customers.get(3856).getZIP());
	}

	@Test
	@DisplayName("Record 3857: Phone is 610-376-0370")
	void PhoneOfRecord3857() {
		assertEquals("610-376-0370", customers.get(3856).getPhone());
	}

	@Test
	@DisplayName("Record 3857: Fax is 610-376-7587")
	void FaxOfRecord3857() {
		assertEquals("610-376-7587", customers.get(3856).getFax());
	}

	@Test
	@DisplayName("Record 3857: Email is mohamed@creasman.com")
	void EmailOfRecord3857() {
		assertEquals("mohamed@creasman.com", customers.get(3856).getEmail());
	}

	@Test
	@DisplayName("Record 3857: Web is http://www.mohamedcreasman.com")
	void WebOfRecord3857() {
		assertEquals("http://www.mohamedcreasman.com", customers.get(3856).getWeb());
	}
}
