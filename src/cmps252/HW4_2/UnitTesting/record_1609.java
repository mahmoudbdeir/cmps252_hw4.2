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

@Tag("46")
class Record_1609 {

	private static List<Customer> customers;

	@BeforeAll
	public static void init() throws FileNotFoundException {
		customers = FileParser.getCustomers(Configuration.CSV_File);
	}

	@Test
	@DisplayName("Record 1609: FirstName is Dianna")
	void FirstNameOfRecord1609() {
		assertEquals("Dianna", customers.get(1608).getFirstName());
	}

	@Test
	@DisplayName("Record 1609: LastName is Lougee")
	void LastNameOfRecord1609() {
		assertEquals("Lougee", customers.get(1608).getLastName());
	}

	@Test
	@DisplayName("Record 1609: Company is Brent, Gill W Esq")
	void CompanyOfRecord1609() {
		assertEquals("Brent, Gill W Esq", customers.get(1608).getCompany());
	}

	@Test
	@DisplayName("Record 1609: Address is 1519 Colorado Ave")
	void AddressOfRecord1609() {
		assertEquals("1519 Colorado Ave", customers.get(1608).getAddress());
	}

	@Test
	@DisplayName("Record 1609: City is Santa Monica")
	void CityOfRecord1609() {
		assertEquals("Santa Monica", customers.get(1608).getCity());
	}

	@Test
	@DisplayName("Record 1609: County is Los Angeles")
	void CountyOfRecord1609() {
		assertEquals("Los Angeles", customers.get(1608).getCounty());
	}

	@Test
	@DisplayName("Record 1609: State is CA")
	void StateOfRecord1609() {
		assertEquals("CA", customers.get(1608).getState());
	}

	@Test
	@DisplayName("Record 1609: ZIP is 90404")
	void ZIPOfRecord1609() {
		assertEquals("90404", customers.get(1608).getZIP());
	}

	@Test
	@DisplayName("Record 1609: Phone is 310-394-5379")
	void PhoneOfRecord1609() {
		assertEquals("310-394-5379", customers.get(1608).getPhone());
	}

	@Test
	@DisplayName("Record 1609: Fax is 310-394-1943")
	void FaxOfRecord1609() {
		assertEquals("310-394-1943", customers.get(1608).getFax());
	}

	@Test
	@DisplayName("Record 1609: Email is dianna@lougee.com")
	void EmailOfRecord1609() {
		assertEquals("dianna@lougee.com", customers.get(1608).getEmail());
	}

	@Test
	@DisplayName("Record 1609: Web is http://www.diannalougee.com")
	void WebOfRecord1609() {
		assertEquals("http://www.diannalougee.com", customers.get(1608).getWeb());
	}
}
