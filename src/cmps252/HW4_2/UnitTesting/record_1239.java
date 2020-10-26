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

@Tag("20")
class Record_1239 {

	private static List<Customer> customers;

	@BeforeAll
	public static void init() throws FileNotFoundException {
		customers = FileParser.getCustomers(Configuration.CSV_File);
	}

	@Test
	@DisplayName("Record 1239: FirstName is Leonor")
	void FirstNameOfRecord1239() {
		assertEquals("Leonor", customers.get(1238).getFirstName());
	}

	@Test
	@DisplayName("Record 1239: LastName is Derosier")
	void LastNameOfRecord1239() {
		assertEquals("Derosier", customers.get(1238).getLastName());
	}

	@Test
	@DisplayName("Record 1239: Company is Controlled Power Inc")
	void CompanyOfRecord1239() {
		assertEquals("Controlled Power Inc", customers.get(1238).getCompany());
	}

	@Test
	@DisplayName("Record 1239: Address is 2903 Southampton Rd")
	void AddressOfRecord1239() {
		assertEquals("2903 Southampton Rd", customers.get(1238).getAddress());
	}

	@Test
	@DisplayName("Record 1239: City is Philadelphia")
	void CityOfRecord1239() {
		assertEquals("Philadelphia", customers.get(1238).getCity());
	}

	@Test
	@DisplayName("Record 1239: County is Philadelphia")
	void CountyOfRecord1239() {
		assertEquals("Philadelphia", customers.get(1238).getCounty());
	}

	@Test
	@DisplayName("Record 1239: State is PA")
	void StateOfRecord1239() {
		assertEquals("PA", customers.get(1238).getState());
	}

	@Test
	@DisplayName("Record 1239: ZIP is 19154")
	void ZIPOfRecord1239() {
		assertEquals("19154", customers.get(1238).getZIP());
	}

	@Test
	@DisplayName("Record 1239: Phone is 215-934-0226")
	void PhoneOfRecord1239() {
		assertEquals("215-934-0226", customers.get(1238).getPhone());
	}

	@Test
	@DisplayName("Record 1239: Fax is 215-934-4232")
	void FaxOfRecord1239() {
		assertEquals("215-934-4232", customers.get(1238).getFax());
	}

	@Test
	@DisplayName("Record 1239: Email is leonor@derosier.com")
	void EmailOfRecord1239() {
		assertEquals("leonor@derosier.com", customers.get(1238).getEmail());
	}

	@Test
	@DisplayName("Record 1239: Web is http://www.leonorderosier.com")
	void WebOfRecord1239() {
		assertEquals("http://www.leonorderosier.com", customers.get(1238).getWeb());
	}
}
