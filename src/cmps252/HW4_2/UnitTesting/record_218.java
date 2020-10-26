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
class Record_218 {

	private static List<Customer> customers;

	@BeforeAll
	public static void init() throws FileNotFoundException {
		customers = FileParser.getCustomers(Configuration.CSV_File);
	}

	@Test
	@DisplayName("Record 218: FirstName is Kyle")
	void FirstNameOfRecord218() {
		assertEquals("Kyle", customers.get(217).getFirstName());
	}

	@Test
	@DisplayName("Record 218: LastName is Savers")
	void LastNameOfRecord218() {
		assertEquals("Savers", customers.get(217).getLastName());
	}

	@Test
	@DisplayName("Record 218: Company is Van Esch Trading & Shipg B V")
	void CompanyOfRecord218() {
		assertEquals("Van Esch Trading & Shipg B V", customers.get(217).getCompany());
	}

	@Test
	@DisplayName("Record 218: Address is 1343 Justice Rd")
	void AddressOfRecord218() {
		assertEquals("1343 Justice Rd", customers.get(217).getAddress());
	}

	@Test
	@DisplayName("Record 218: City is Central Point")
	void CityOfRecord218() {
		assertEquals("Central Point", customers.get(217).getCity());
	}

	@Test
	@DisplayName("Record 218: County is Jackson")
	void CountyOfRecord218() {
		assertEquals("Jackson", customers.get(217).getCounty());
	}

	@Test
	@DisplayName("Record 218: State is OR")
	void StateOfRecord218() {
		assertEquals("OR", customers.get(217).getState());
	}

	@Test
	@DisplayName("Record 218: ZIP is 97502")
	void ZIPOfRecord218() {
		assertEquals("97502", customers.get(217).getZIP());
	}

	@Test
	@DisplayName("Record 218: Phone is 541-779-9597")
	void PhoneOfRecord218() {
		assertEquals("541-779-9597", customers.get(217).getPhone());
	}

	@Test
	@DisplayName("Record 218: Fax is 541-779-7336")
	void FaxOfRecord218() {
		assertEquals("541-779-7336", customers.get(217).getFax());
	}

	@Test
	@DisplayName("Record 218: Email is kyle@savers.com")
	void EmailOfRecord218() {
		assertEquals("kyle@savers.com", customers.get(217).getEmail());
	}

	@Test
	@DisplayName("Record 218: Web is http://www.kylesavers.com")
	void WebOfRecord218() {
		assertEquals("http://www.kylesavers.com", customers.get(217).getWeb());
	}
}
