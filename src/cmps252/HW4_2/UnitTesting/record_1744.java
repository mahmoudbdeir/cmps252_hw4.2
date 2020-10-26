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
class Record_1744 {

	private static List<Customer> customers;

	@BeforeAll
	public static void init() throws FileNotFoundException {
		customers = FileParser.getCustomers(Configuration.CSV_File);
	}

	@Test
	@DisplayName("Record 1744: FirstName is Hydi")
	void FirstNameOfRecord1744() {
		assertEquals("Hydi", customers.get(1743).getFirstName());
	}

	@Test
	@DisplayName("Record 1744: LastName is Casella")
	void LastNameOfRecord1744() {
		assertEquals("Casella", customers.get(1743).getLastName());
	}

	@Test
	@DisplayName("Record 1744: Company is George Mason Bank")
	void CompanyOfRecord1744() {
		assertEquals("George Mason Bank", customers.get(1743).getCompany());
	}

	@Test
	@DisplayName("Record 1744: Address is 315 New Rd")
	void AddressOfRecord1744() {
		assertEquals("315 New Rd", customers.get(1743).getAddress());
	}

	@Test
	@DisplayName("Record 1744: City is Wilmington")
	void CityOfRecord1744() {
		assertEquals("Wilmington", customers.get(1743).getCity());
	}

	@Test
	@DisplayName("Record 1744: County is New Castle")
	void CountyOfRecord1744() {
		assertEquals("New Castle", customers.get(1743).getCounty());
	}

	@Test
	@DisplayName("Record 1744: State is DE")
	void StateOfRecord1744() {
		assertEquals("DE", customers.get(1743).getState());
	}

	@Test
	@DisplayName("Record 1744: ZIP is 19805")
	void ZIPOfRecord1744() {
		assertEquals("19805", customers.get(1743).getZIP());
	}

	@Test
	@DisplayName("Record 1744: Phone is 302-998-5495")
	void PhoneOfRecord1744() {
		assertEquals("302-998-5495", customers.get(1743).getPhone());
	}

	@Test
	@DisplayName("Record 1744: Fax is 302-998-4358")
	void FaxOfRecord1744() {
		assertEquals("302-998-4358", customers.get(1743).getFax());
	}

	@Test
	@DisplayName("Record 1744: Email is hydi@casella.com")
	void EmailOfRecord1744() {
		assertEquals("hydi@casella.com", customers.get(1743).getEmail());
	}

	@Test
	@DisplayName("Record 1744: Web is http://www.hydicasella.com")
	void WebOfRecord1744() {
		assertEquals("http://www.hydicasella.com", customers.get(1743).getWeb());
	}
}
