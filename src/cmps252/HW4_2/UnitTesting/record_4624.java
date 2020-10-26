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

@Tag("18")
class Record_4624 {

	private static List<Customer> customers;

	@BeforeAll
	public static void init() throws FileNotFoundException {
		customers = FileParser.getCustomers(Configuration.CSV_File);
	}

	@Test
	@DisplayName("Record 4624: FirstName is Antony")
	void FirstNameOfRecord4624() {
		assertEquals("Antony", customers.get(4623).getFirstName());
	}

	@Test
	@DisplayName("Record 4624: LastName is Davitt")
	void LastNameOfRecord4624() {
		assertEquals("Davitt", customers.get(4623).getLastName());
	}

	@Test
	@DisplayName("Record 4624: Company is Maupin Welding")
	void CompanyOfRecord4624() {
		assertEquals("Maupin Welding", customers.get(4623).getCompany());
	}

	@Test
	@DisplayName("Record 4624: Address is 9812 Falls Rd")
	void AddressOfRecord4624() {
		assertEquals("9812 Falls Rd", customers.get(4623).getAddress());
	}

	@Test
	@DisplayName("Record 4624: City is Potomac")
	void CityOfRecord4624() {
		assertEquals("Potomac", customers.get(4623).getCity());
	}

	@Test
	@DisplayName("Record 4624: County is Montgomery")
	void CountyOfRecord4624() {
		assertEquals("Montgomery", customers.get(4623).getCounty());
	}

	@Test
	@DisplayName("Record 4624: State is MD")
	void StateOfRecord4624() {
		assertEquals("MD", customers.get(4623).getState());
	}

	@Test
	@DisplayName("Record 4624: ZIP is 20854")
	void ZIPOfRecord4624() {
		assertEquals("20854", customers.get(4623).getZIP());
	}

	@Test
	@DisplayName("Record 4624: Phone is 301-299-6322")
	void PhoneOfRecord4624() {
		assertEquals("301-299-6322", customers.get(4623).getPhone());
	}

	@Test
	@DisplayName("Record 4624: Fax is 301-299-5139")
	void FaxOfRecord4624() {
		assertEquals("301-299-5139", customers.get(4623).getFax());
	}

	@Test
	@DisplayName("Record 4624: Email is antony@davitt.com")
	void EmailOfRecord4624() {
		assertEquals("antony@davitt.com", customers.get(4623).getEmail());
	}

	@Test
	@DisplayName("Record 4624: Web is http://www.antonydavitt.com")
	void WebOfRecord4624() {
		assertEquals("http://www.antonydavitt.com", customers.get(4623).getWeb());
	}
}
