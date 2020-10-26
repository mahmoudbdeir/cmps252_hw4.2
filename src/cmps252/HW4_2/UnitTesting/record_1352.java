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
class Record_1352 {

	private static List<Customer> customers;

	@BeforeAll
	public static void init() throws FileNotFoundException {
		customers = FileParser.getCustomers(Configuration.CSV_File);
	}

	@Test
	@DisplayName("Record 1352: FirstName is Rodrigo")
	void FirstNameOfRecord1352() {
		assertEquals("Rodrigo", customers.get(1351).getFirstName());
	}

	@Test
	@DisplayName("Record 1352: LastName is Oinonen")
	void LastNameOfRecord1352() {
		assertEquals("Oinonen", customers.get(1351).getLastName());
	}

	@Test
	@DisplayName("Record 1352: Company is Lazenby, R Blake Esq")
	void CompanyOfRecord1352() {
		assertEquals("Lazenby, R Blake Esq", customers.get(1351).getCompany());
	}

	@Test
	@DisplayName("Record 1352: Address is 725 K St")
	void AddressOfRecord1352() {
		assertEquals("725 K St", customers.get(1351).getAddress());
	}

	@Test
	@DisplayName("Record 1352: City is Anchorage")
	void CityOfRecord1352() {
		assertEquals("Anchorage", customers.get(1351).getCity());
	}

	@Test
	@DisplayName("Record 1352: County is Anchorage")
	void CountyOfRecord1352() {
		assertEquals("Anchorage", customers.get(1351).getCounty());
	}

	@Test
	@DisplayName("Record 1352: State is AK")
	void StateOfRecord1352() {
		assertEquals("AK", customers.get(1351).getState());
	}

	@Test
	@DisplayName("Record 1352: ZIP is 99501")
	void ZIPOfRecord1352() {
		assertEquals("99501", customers.get(1351).getZIP());
	}

	@Test
	@DisplayName("Record 1352: Phone is 907-258-8825")
	void PhoneOfRecord1352() {
		assertEquals("907-258-8825", customers.get(1351).getPhone());
	}

	@Test
	@DisplayName("Record 1352: Fax is 907-258-5543")
	void FaxOfRecord1352() {
		assertEquals("907-258-5543", customers.get(1351).getFax());
	}

	@Test
	@DisplayName("Record 1352: Email is rodrigo@oinonen.com")
	void EmailOfRecord1352() {
		assertEquals("rodrigo@oinonen.com", customers.get(1351).getEmail());
	}

	@Test
	@DisplayName("Record 1352: Web is http://www.rodrigooinonen.com")
	void WebOfRecord1352() {
		assertEquals("http://www.rodrigooinonen.com", customers.get(1351).getWeb());
	}
}
