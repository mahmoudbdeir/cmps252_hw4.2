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

@Tag("17")
class Record_928 {

	private static List<Customer> customers;

	@BeforeAll
	public static void init() throws FileNotFoundException {
		customers = FileParser.getCustomers(Configuration.CSV_File);
	}

	@Test
	@DisplayName("Record 928: FirstName is Elvis")
	void FirstNameOfRecord928() {
		assertEquals("Elvis", customers.get(927).getFirstName());
	}

	@Test
	@DisplayName("Record 928: LastName is Swabb")
	void LastNameOfRecord928() {
		assertEquals("Swabb", customers.get(927).getLastName());
	}

	@Test
	@DisplayName("Record 928: Company is French Translation Center")
	void CompanyOfRecord928() {
		assertEquals("French Translation Center", customers.get(927).getCompany());
	}

	@Test
	@DisplayName("Record 928: Address is 303 Rysterstown Rd")
	void AddressOfRecord928() {
		assertEquals("303 Rysterstown Rd", customers.get(927).getAddress());
	}

	@Test
	@DisplayName("Record 928: City is Pikesville")
	void CityOfRecord928() {
		assertEquals("Pikesville", customers.get(927).getCity());
	}

	@Test
	@DisplayName("Record 928: County is Baltimore")
	void CountyOfRecord928() {
		assertEquals("Baltimore", customers.get(927).getCounty());
	}

	@Test
	@DisplayName("Record 928: State is MD")
	void StateOfRecord928() {
		assertEquals("MD", customers.get(927).getState());
	}

	@Test
	@DisplayName("Record 928: ZIP is 21208")
	void ZIPOfRecord928() {
		assertEquals("21208", customers.get(927).getZIP());
	}

	@Test
	@DisplayName("Record 928: Phone is 410-484-0178")
	void PhoneOfRecord928() {
		assertEquals("410-484-0178", customers.get(927).getPhone());
	}

	@Test
	@DisplayName("Record 928: Fax is 410-484-8769")
	void FaxOfRecord928() {
		assertEquals("410-484-8769", customers.get(927).getFax());
	}

	@Test
	@DisplayName("Record 928: Email is elvis@swabb.com")
	void EmailOfRecord928() {
		assertEquals("elvis@swabb.com", customers.get(927).getEmail());
	}

	@Test
	@DisplayName("Record 928: Web is http://www.elvisswabb.com")
	void WebOfRecord928() {
		assertEquals("http://www.elvisswabb.com", customers.get(927).getWeb());
	}
}
