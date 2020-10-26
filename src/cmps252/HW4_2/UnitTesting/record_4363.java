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

@Tag("23")
class Record_4363 {

	private static List<Customer> customers;

	@BeforeAll
	public static void init() throws FileNotFoundException {
		customers = FileParser.getCustomers(Configuration.CSV_File);
	}

	@Test
	@DisplayName("Record 4363: FirstName is Bradly")
	void FirstNameOfRecord4363() {
		assertEquals("Bradly", customers.get(4362).getFirstName());
	}

	@Test
	@DisplayName("Record 4363: LastName is Kalkman")
	void LastNameOfRecord4363() {
		assertEquals("Kalkman", customers.get(4362).getLastName());
	}

	@Test
	@DisplayName("Record 4363: Company is Abell, Richard T Esq")
	void CompanyOfRecord4363() {
		assertEquals("Abell, Richard T Esq", customers.get(4362).getCompany());
	}

	@Test
	@DisplayName("Record 4363: Address is Texaco")
	void AddressOfRecord4363() {
		assertEquals("Texaco", customers.get(4362).getAddress());
	}

	@Test
	@DisplayName("Record 4363: City is New Orleans")
	void CityOfRecord4363() {
		assertEquals("New Orleans", customers.get(4362).getCity());
	}

	@Test
	@DisplayName("Record 4363: County is Orleans")
	void CountyOfRecord4363() {
		assertEquals("Orleans", customers.get(4362).getCounty());
	}

	@Test
	@DisplayName("Record 4363: State is LA")
	void StateOfRecord4363() {
		assertEquals("LA", customers.get(4362).getState());
	}

	@Test
	@DisplayName("Record 4363: ZIP is 70130")
	void ZIPOfRecord4363() {
		assertEquals("70130", customers.get(4362).getZIP());
	}

	@Test
	@DisplayName("Record 4363: Phone is 504-568-8108")
	void PhoneOfRecord4363() {
		assertEquals("504-568-8108", customers.get(4362).getPhone());
	}

	@Test
	@DisplayName("Record 4363: Fax is 504-568-3371")
	void FaxOfRecord4363() {
		assertEquals("504-568-3371", customers.get(4362).getFax());
	}

	@Test
	@DisplayName("Record 4363: Email is bradly@kalkman.com")
	void EmailOfRecord4363() {
		assertEquals("bradly@kalkman.com", customers.get(4362).getEmail());
	}

	@Test
	@DisplayName("Record 4363: Web is http://www.bradlykalkman.com")
	void WebOfRecord4363() {
		assertEquals("http://www.bradlykalkman.com", customers.get(4362).getWeb());
	}
}
