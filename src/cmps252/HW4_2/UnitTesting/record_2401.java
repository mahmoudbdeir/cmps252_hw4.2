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

@Tag("5")
class Record_2401 {

	private static List<Customer> customers;

	@BeforeAll
	public static void init() throws FileNotFoundException {
		customers = FileParser.getCustomers(Configuration.CSV_File);
	}

	@Test
	@DisplayName("Record 2401: FirstName is Kelley")
	void FirstNameOfRecord2401() {
		assertEquals("Kelley", customers.get(2400).getFirstName());
	}

	@Test
	@DisplayName("Record 2401: LastName is Laubhan")
	void LastNameOfRecord2401() {
		assertEquals("Laubhan", customers.get(2400).getLastName());
	}

	@Test
	@DisplayName("Record 2401: Company is Associates Iii Inc")
	void CompanyOfRecord2401() {
		assertEquals("Associates Iii Inc", customers.get(2400).getCompany());
	}

	@Test
	@DisplayName("Record 2401: Address is 128 Newbury St")
	void AddressOfRecord2401() {
		assertEquals("128 Newbury St", customers.get(2400).getAddress());
	}

	@Test
	@DisplayName("Record 2401: City is Boston")
	void CityOfRecord2401() {
		assertEquals("Boston", customers.get(2400).getCity());
	}

	@Test
	@DisplayName("Record 2401: County is Suffolk")
	void CountyOfRecord2401() {
		assertEquals("Suffolk", customers.get(2400).getCounty());
	}

	@Test
	@DisplayName("Record 2401: State is MA")
	void StateOfRecord2401() {
		assertEquals("MA", customers.get(2400).getState());
	}

	@Test
	@DisplayName("Record 2401: ZIP is 2116")
	void ZIPOfRecord2401() {
		assertEquals("2116", customers.get(2400).getZIP());
	}

	@Test
	@DisplayName("Record 2401: Phone is 617-266-8371")
	void PhoneOfRecord2401() {
		assertEquals("617-266-8371", customers.get(2400).getPhone());
	}

	@Test
	@DisplayName("Record 2401: Fax is 617-266-3608")
	void FaxOfRecord2401() {
		assertEquals("617-266-3608", customers.get(2400).getFax());
	}

	@Test
	@DisplayName("Record 2401: Email is kelley@laubhan.com")
	void EmailOfRecord2401() {
		assertEquals("kelley@laubhan.com", customers.get(2400).getEmail());
	}

	@Test
	@DisplayName("Record 2401: Web is http://www.kelleylaubhan.com")
	void WebOfRecord2401() {
		assertEquals("http://www.kelleylaubhan.com", customers.get(2400).getWeb());
	}
}
