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

@Tag("26")
class Record_4511 {

	private static List<Customer> customers;

	@BeforeAll
	public static void init() throws FileNotFoundException {
		customers = FileParser.getCustomers(Configuration.CSV_File);
	}

	@Test
	@DisplayName("Record 4511: FirstName is Mariana")
	void FirstNameOfRecord4511() {
		assertEquals("Mariana", customers.get(4510).getFirstName());
	}

	@Test
	@DisplayName("Record 4511: LastName is Leflores")
	void LastNameOfRecord4511() {
		assertEquals("Leflores", customers.get(4510).getLastName());
	}

	@Test
	@DisplayName("Record 4511: Company is Anderson Graphics")
	void CompanyOfRecord4511() {
		assertEquals("Anderson Graphics", customers.get(4510).getCompany());
	}

	@Test
	@DisplayName("Record 4511: Address is 64 Washington St")
	void AddressOfRecord4511() {
		assertEquals("64 Washington St", customers.get(4510).getAddress());
	}

	@Test
	@DisplayName("Record 4511: City is Bloomfield")
	void CityOfRecord4511() {
		assertEquals("Bloomfield", customers.get(4510).getCity());
	}

	@Test
	@DisplayName("Record 4511: County is Essex")
	void CountyOfRecord4511() {
		assertEquals("Essex", customers.get(4510).getCounty());
	}

	@Test
	@DisplayName("Record 4511: State is NJ")
	void StateOfRecord4511() {
		assertEquals("NJ", customers.get(4510).getState());
	}

	@Test
	@DisplayName("Record 4511: ZIP is 7003")
	void ZIPOfRecord4511() {
		assertEquals("7003", customers.get(4510).getZIP());
	}

	@Test
	@DisplayName("Record 4511: Phone is 973-680-0163")
	void PhoneOfRecord4511() {
		assertEquals("973-680-0163", customers.get(4510).getPhone());
	}

	@Test
	@DisplayName("Record 4511: Fax is 973-680-1745")
	void FaxOfRecord4511() {
		assertEquals("973-680-1745", customers.get(4510).getFax());
	}

	@Test
	@DisplayName("Record 4511: Email is mariana@leflores.com")
	void EmailOfRecord4511() {
		assertEquals("mariana@leflores.com", customers.get(4510).getEmail());
	}

	@Test
	@DisplayName("Record 4511: Web is http://www.marianaleflores.com")
	void WebOfRecord4511() {
		assertEquals("http://www.marianaleflores.com", customers.get(4510).getWeb());
	}
}
