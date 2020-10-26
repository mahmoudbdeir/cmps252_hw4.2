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

@Tag("25")
class Record_1681 {

	private static List<Customer> customers;

	@BeforeAll
	public static void init() throws FileNotFoundException {
		customers = FileParser.getCustomers(Configuration.CSV_File);
	}

	@Test
	@DisplayName("Record 1681: FirstName is Kent")
	void FirstNameOfRecord1681() {
		assertEquals("Kent", customers.get(1680).getFirstName());
	}

	@Test
	@DisplayName("Record 1681: LastName is Hallin")
	void LastNameOfRecord1681() {
		assertEquals("Hallin", customers.get(1680).getLastName());
	}

	@Test
	@DisplayName("Record 1681: Company is Robinson Technical Prod Corp")
	void CompanyOfRecord1681() {
		assertEquals("Robinson Technical Prod Corp", customers.get(1680).getCompany());
	}

	@Test
	@DisplayName("Record 1681: Address is 300 E Lombard St")
	void AddressOfRecord1681() {
		assertEquals("300 E Lombard St", customers.get(1680).getAddress());
	}

	@Test
	@DisplayName("Record 1681: City is Baltimore")
	void CityOfRecord1681() {
		assertEquals("Baltimore", customers.get(1680).getCity());
	}

	@Test
	@DisplayName("Record 1681: County is Baltimore City")
	void CountyOfRecord1681() {
		assertEquals("Baltimore City", customers.get(1680).getCounty());
	}

	@Test
	@DisplayName("Record 1681: State is MD")
	void StateOfRecord1681() {
		assertEquals("MD", customers.get(1680).getState());
	}

	@Test
	@DisplayName("Record 1681: ZIP is 21202")
	void ZIPOfRecord1681() {
		assertEquals("21202", customers.get(1680).getZIP());
	}

	@Test
	@DisplayName("Record 1681: Phone is 410-783-3107")
	void PhoneOfRecord1681() {
		assertEquals("410-783-3107", customers.get(1680).getPhone());
	}

	@Test
	@DisplayName("Record 1681: Fax is 410-783-0417")
	void FaxOfRecord1681() {
		assertEquals("410-783-0417", customers.get(1680).getFax());
	}

	@Test
	@DisplayName("Record 1681: Email is kent@hallin.com")
	void EmailOfRecord1681() {
		assertEquals("kent@hallin.com", customers.get(1680).getEmail());
	}

	@Test
	@DisplayName("Record 1681: Web is http://www.kenthallin.com")
	void WebOfRecord1681() {
		assertEquals("http://www.kenthallin.com", customers.get(1680).getWeb());
	}
}
