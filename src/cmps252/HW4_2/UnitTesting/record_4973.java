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

@Tag("33")
class Record_4973 {

	private static List<Customer> customers;

	@BeforeAll
	public static void init() throws FileNotFoundException {
		customers = FileParser.getCustomers(Configuration.CSV_File);
	}

	@Test
	@DisplayName("Record 4973: FirstName is Mari")
	void FirstNameOfRecord4973() {
		assertEquals("Mari", customers.get(4972).getFirstName());
	}

	@Test
	@DisplayName("Record 4973: LastName is Mach")
	void LastNameOfRecord4973() {
		assertEquals("Mach", customers.get(4972).getLastName());
	}

	@Test
	@DisplayName("Record 4973: Company is Fred Horn Inc")
	void CompanyOfRecord4973() {
		assertEquals("Fred Horn Inc", customers.get(4972).getCompany());
	}

	@Test
	@DisplayName("Record 4973: Address is 420 Minnisink Rd")
	void AddressOfRecord4973() {
		assertEquals("420 Minnisink Rd", customers.get(4972).getAddress());
	}

	@Test
	@DisplayName("Record 4973: City is Totowa")
	void CityOfRecord4973() {
		assertEquals("Totowa", customers.get(4972).getCity());
	}

	@Test
	@DisplayName("Record 4973: County is Passaic")
	void CountyOfRecord4973() {
		assertEquals("Passaic", customers.get(4972).getCounty());
	}

	@Test
	@DisplayName("Record 4973: State is NJ")
	void StateOfRecord4973() {
		assertEquals("NJ", customers.get(4972).getState());
	}

	@Test
	@DisplayName("Record 4973: ZIP is 7512")
	void ZIPOfRecord4973() {
		assertEquals("7512", customers.get(4972).getZIP());
	}

	@Test
	@DisplayName("Record 4973: Phone is 973-256-7654")
	void PhoneOfRecord4973() {
		assertEquals("973-256-7654", customers.get(4972).getPhone());
	}

	@Test
	@DisplayName("Record 4973: Fax is 973-256-0083")
	void FaxOfRecord4973() {
		assertEquals("973-256-0083", customers.get(4972).getFax());
	}

	@Test
	@DisplayName("Record 4973: Email is mari@mach.com")
	void EmailOfRecord4973() {
		assertEquals("mari@mach.com", customers.get(4972).getEmail());
	}

	@Test
	@DisplayName("Record 4973: Web is http://www.marimach.com")
	void WebOfRecord4973() {
		assertEquals("http://www.marimach.com", customers.get(4972).getWeb());
	}
}
