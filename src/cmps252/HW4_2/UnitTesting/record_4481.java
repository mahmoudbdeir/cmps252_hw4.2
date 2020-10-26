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

@Tag("24")
class Record_4481 {

	private static List<Customer> customers;

	@BeforeAll
	public static void init() throws FileNotFoundException {
		customers = FileParser.getCustomers(Configuration.CSV_File);
	}

	@Test
	@DisplayName("Record 4481: FirstName is Ernest")
	void FirstNameOfRecord4481() {
		assertEquals("Ernest", customers.get(4480).getFirstName());
	}

	@Test
	@DisplayName("Record 4481: LastName is Velilla")
	void LastNameOfRecord4481() {
		assertEquals("Velilla", customers.get(4480).getLastName());
	}

	@Test
	@DisplayName("Record 4481: Company is Contact Lens Associates")
	void CompanyOfRecord4481() {
		assertEquals("Contact Lens Associates", customers.get(4480).getCompany());
	}

	@Test
	@DisplayName("Record 4481: Address is Nc")
	void AddressOfRecord4481() {
		assertEquals("Nc", customers.get(4480).getAddress());
	}

	@Test
	@DisplayName("Record 4481: City is Mooresville")
	void CityOfRecord4481() {
		assertEquals("Mooresville", customers.get(4480).getCity());
	}

	@Test
	@DisplayName("Record 4481: County is Iredell")
	void CountyOfRecord4481() {
		assertEquals("Iredell", customers.get(4480).getCounty());
	}

	@Test
	@DisplayName("Record 4481: State is NC")
	void StateOfRecord4481() {
		assertEquals("NC", customers.get(4480).getState());
	}

	@Test
	@DisplayName("Record 4481: ZIP is 28115")
	void ZIPOfRecord4481() {
		assertEquals("28115", customers.get(4480).getZIP());
	}

	@Test
	@DisplayName("Record 4481: Phone is 704-663-4900")
	void PhoneOfRecord4481() {
		assertEquals("704-663-4900", customers.get(4480).getPhone());
	}

	@Test
	@DisplayName("Record 4481: Fax is 704-663-7877")
	void FaxOfRecord4481() {
		assertEquals("704-663-7877", customers.get(4480).getFax());
	}

	@Test
	@DisplayName("Record 4481: Email is ernest@velilla.com")
	void EmailOfRecord4481() {
		assertEquals("ernest@velilla.com", customers.get(4480).getEmail());
	}

	@Test
	@DisplayName("Record 4481: Web is http://www.ernestvelilla.com")
	void WebOfRecord4481() {
		assertEquals("http://www.ernestvelilla.com", customers.get(4480).getWeb());
	}
}
