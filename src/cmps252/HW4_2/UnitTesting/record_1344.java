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
class Record_1344 {

	private static List<Customer> customers;

	@BeforeAll
	public static void init() throws FileNotFoundException {
		customers = FileParser.getCustomers(Configuration.CSV_File);
	}

	@Test
	@DisplayName("Record 1344: FirstName is Joni")
	void FirstNameOfRecord1344() {
		assertEquals("Joni", customers.get(1343).getFirstName());
	}

	@Test
	@DisplayName("Record 1344: LastName is Linz")
	void LastNameOfRecord1344() {
		assertEquals("Linz", customers.get(1343).getLastName());
	}

	@Test
	@DisplayName("Record 1344: Company is Rain Or Shine Tent Co")
	void CompanyOfRecord1344() {
		assertEquals("Rain Or Shine Tent Co", customers.get(1343).getCompany());
	}

	@Test
	@DisplayName("Record 1344: Address is 140 Richmond St")
	void AddressOfRecord1344() {
		assertEquals("140 Richmond St", customers.get(1343).getAddress());
	}

	@Test
	@DisplayName("Record 1344: City is Philadelphia")
	void CityOfRecord1344() {
		assertEquals("Philadelphia", customers.get(1343).getCity());
	}

	@Test
	@DisplayName("Record 1344: County is Philadelphia")
	void CountyOfRecord1344() {
		assertEquals("Philadelphia", customers.get(1343).getCounty());
	}

	@Test
	@DisplayName("Record 1344: State is PA")
	void StateOfRecord1344() {
		assertEquals("PA", customers.get(1343).getState());
	}

	@Test
	@DisplayName("Record 1344: ZIP is 19125")
	void ZIPOfRecord1344() {
		assertEquals("19125", customers.get(1343).getZIP());
	}

	@Test
	@DisplayName("Record 1344: Phone is 215-425-0228")
	void PhoneOfRecord1344() {
		assertEquals("215-425-0228", customers.get(1343).getPhone());
	}

	@Test
	@DisplayName("Record 1344: Fax is 215-425-7519")
	void FaxOfRecord1344() {
		assertEquals("215-425-7519", customers.get(1343).getFax());
	}

	@Test
	@DisplayName("Record 1344: Email is joni@linz.com")
	void EmailOfRecord1344() {
		assertEquals("joni@linz.com", customers.get(1343).getEmail());
	}

	@Test
	@DisplayName("Record 1344: Web is http://www.jonilinz.com")
	void WebOfRecord1344() {
		assertEquals("http://www.jonilinz.com", customers.get(1343).getWeb());
	}
}
