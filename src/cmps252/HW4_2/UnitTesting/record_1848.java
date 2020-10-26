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

@Tag("7")
class Record_1848 {

	private static List<Customer> customers;

	@BeforeAll
	public static void init() throws FileNotFoundException {
		customers = FileParser.getCustomers(Configuration.CSV_File);
	}

	@Test
	@DisplayName("Record 1848: FirstName is Lanny")
	void FirstNameOfRecord1848() {
		assertEquals("Lanny", customers.get(1847).getFirstName());
	}

	@Test
	@DisplayName("Record 1848: LastName is Nissalke")
	void LastNameOfRecord1848() {
		assertEquals("Nissalke", customers.get(1847).getLastName());
	}

	@Test
	@DisplayName("Record 1848: Company is Soebbing, Ralph K Esq")
	void CompanyOfRecord1848() {
		assertEquals("Soebbing, Ralph K Esq", customers.get(1847).getCompany());
	}

	@Test
	@DisplayName("Record 1848: Address is 275 Leverington Ave")
	void AddressOfRecord1848() {
		assertEquals("275 Leverington Ave", customers.get(1847).getAddress());
	}

	@Test
	@DisplayName("Record 1848: City is Philadelphia")
	void CityOfRecord1848() {
		assertEquals("Philadelphia", customers.get(1847).getCity());
	}

	@Test
	@DisplayName("Record 1848: County is Philadelphia")
	void CountyOfRecord1848() {
		assertEquals("Philadelphia", customers.get(1847).getCounty());
	}

	@Test
	@DisplayName("Record 1848: State is PA")
	void StateOfRecord1848() {
		assertEquals("PA", customers.get(1847).getState());
	}

	@Test
	@DisplayName("Record 1848: ZIP is 19127")
	void ZIPOfRecord1848() {
		assertEquals("19127", customers.get(1847).getZIP());
	}

	@Test
	@DisplayName("Record 1848: Phone is 215-487-0104")
	void PhoneOfRecord1848() {
		assertEquals("215-487-0104", customers.get(1847).getPhone());
	}

	@Test
	@DisplayName("Record 1848: Fax is 215-487-1791")
	void FaxOfRecord1848() {
		assertEquals("215-487-1791", customers.get(1847).getFax());
	}

	@Test
	@DisplayName("Record 1848: Email is lanny@nissalke.com")
	void EmailOfRecord1848() {
		assertEquals("lanny@nissalke.com", customers.get(1847).getEmail());
	}

	@Test
	@DisplayName("Record 1848: Web is http://www.lannynissalke.com")
	void WebOfRecord1848() {
		assertEquals("http://www.lannynissalke.com", customers.get(1847).getWeb());
	}
}
