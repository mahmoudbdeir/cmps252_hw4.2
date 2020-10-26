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
class Record_904 {

	private static List<Customer> customers;

	@BeforeAll
	public static void init() throws FileNotFoundException {
		customers = FileParser.getCustomers(Configuration.CSV_File);
	}

	@Test
	@DisplayName("Record 904: FirstName is Edmundo")
	void FirstNameOfRecord904() {
		assertEquals("Edmundo", customers.get(903).getFirstName());
	}

	@Test
	@DisplayName("Record 904: LastName is Adinolfi")
	void LastNameOfRecord904() {
		assertEquals("Adinolfi", customers.get(903).getLastName());
	}

	@Test
	@DisplayName("Record 904: Company is Vella, Michael W Esq")
	void CompanyOfRecord904() {
		assertEquals("Vella, Michael W Esq", customers.get(903).getCompany());
	}

	@Test
	@DisplayName("Record 904: Address is 5577 New Peachtree Rd")
	void AddressOfRecord904() {
		assertEquals("5577 New Peachtree Rd", customers.get(903).getAddress());
	}

	@Test
	@DisplayName("Record 904: City is Atlanta")
	void CityOfRecord904() {
		assertEquals("Atlanta", customers.get(903).getCity());
	}

	@Test
	@DisplayName("Record 904: County is Dekalb")
	void CountyOfRecord904() {
		assertEquals("Dekalb", customers.get(903).getCounty());
	}

	@Test
	@DisplayName("Record 904: State is GA")
	void StateOfRecord904() {
		assertEquals("GA", customers.get(903).getState());
	}

	@Test
	@DisplayName("Record 904: ZIP is 30341")
	void ZIPOfRecord904() {
		assertEquals("30341", customers.get(903).getZIP());
	}

	@Test
	@DisplayName("Record 904: Phone is 770-455-6494")
	void PhoneOfRecord904() {
		assertEquals("770-455-6494", customers.get(903).getPhone());
	}

	@Test
	@DisplayName("Record 904: Fax is 770-455-0876")
	void FaxOfRecord904() {
		assertEquals("770-455-0876", customers.get(903).getFax());
	}

	@Test
	@DisplayName("Record 904: Email is edmundo@adinolfi.com")
	void EmailOfRecord904() {
		assertEquals("edmundo@adinolfi.com", customers.get(903).getEmail());
	}

	@Test
	@DisplayName("Record 904: Web is http://www.edmundoadinolfi.com")
	void WebOfRecord904() {
		assertEquals("http://www.edmundoadinolfi.com", customers.get(903).getWeb());
	}
}
