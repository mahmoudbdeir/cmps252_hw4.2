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

@Tag("41")
class Record_2072 {

	private static List<Customer> customers;

	@BeforeAll
	public static void init() throws FileNotFoundException {
		customers = FileParser.getCustomers(Configuration.CSV_File);
	}

	@Test
	@DisplayName("Record 2072: FirstName is Gerard")
	void FirstNameOfRecord2072() {
		assertEquals("Gerard", customers.get(2071).getFirstName());
	}

	@Test
	@DisplayName("Record 2072: LastName is Poladian")
	void LastNameOfRecord2072() {
		assertEquals("Poladian", customers.get(2071).getLastName());
	}

	@Test
	@DisplayName("Record 2072: Company is Isaacs, Dorothy Esq")
	void CompanyOfRecord2072() {
		assertEquals("Isaacs, Dorothy Esq", customers.get(2071).getCompany());
	}

	@Test
	@DisplayName("Record 2072: Address is 3500 Davisville Rd")
	void AddressOfRecord2072() {
		assertEquals("3500 Davisville Rd", customers.get(2071).getAddress());
	}

	@Test
	@DisplayName("Record 2072: City is Hatboro")
	void CityOfRecord2072() {
		assertEquals("Hatboro", customers.get(2071).getCity());
	}

	@Test
	@DisplayName("Record 2072: County is Montgomery")
	void CountyOfRecord2072() {
		assertEquals("Montgomery", customers.get(2071).getCounty());
	}

	@Test
	@DisplayName("Record 2072: State is PA")
	void StateOfRecord2072() {
		assertEquals("PA", customers.get(2071).getState());
	}

	@Test
	@DisplayName("Record 2072: ZIP is 19040")
	void ZIPOfRecord2072() {
		assertEquals("19040", customers.get(2071).getZIP());
	}

	@Test
	@DisplayName("Record 2072: Phone is 215-674-6427")
	void PhoneOfRecord2072() {
		assertEquals("215-674-6427", customers.get(2071).getPhone());
	}

	@Test
	@DisplayName("Record 2072: Fax is 215-674-0108")
	void FaxOfRecord2072() {
		assertEquals("215-674-0108", customers.get(2071).getFax());
	}

	@Test
	@DisplayName("Record 2072: Email is gerard@poladian.com")
	void EmailOfRecord2072() {
		assertEquals("gerard@poladian.com", customers.get(2071).getEmail());
	}

	@Test
	@DisplayName("Record 2072: Web is http://www.gerardpoladian.com")
	void WebOfRecord2072() {
		assertEquals("http://www.gerardpoladian.com", customers.get(2071).getWeb());
	}
}
