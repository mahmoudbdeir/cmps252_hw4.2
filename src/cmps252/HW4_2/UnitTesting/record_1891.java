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
class Record_1891 {

	private static List<Customer> customers;

	@BeforeAll
	public static void init() throws FileNotFoundException {
		customers = FileParser.getCustomers(Configuration.CSV_File);
	}

	@Test
	@DisplayName("Record 1891: FirstName is Allene")
	void FirstNameOfRecord1891() {
		assertEquals("Allene", customers.get(1890).getFirstName());
	}

	@Test
	@DisplayName("Record 1891: LastName is Dahlin")
	void LastNameOfRecord1891() {
		assertEquals("Dahlin", customers.get(1890).getLastName());
	}

	@Test
	@DisplayName("Record 1891: Company is Cerullo, Martin J Esq")
	void CompanyOfRecord1891() {
		assertEquals("Cerullo, Martin J Esq", customers.get(1890).getCompany());
	}

	@Test
	@DisplayName("Record 1891: Address is 421 S 21st St")
	void AddressOfRecord1891() {
		assertEquals("421 S 21st St", customers.get(1890).getAddress());
	}

	@Test
	@DisplayName("Record 1891: City is Mattoon")
	void CityOfRecord1891() {
		assertEquals("Mattoon", customers.get(1890).getCity());
	}

	@Test
	@DisplayName("Record 1891: County is Coles")
	void CountyOfRecord1891() {
		assertEquals("Coles", customers.get(1890).getCounty());
	}

	@Test
	@DisplayName("Record 1891: State is IL")
	void StateOfRecord1891() {
		assertEquals("IL", customers.get(1890).getState());
	}

	@Test
	@DisplayName("Record 1891: ZIP is 61938")
	void ZIPOfRecord1891() {
		assertEquals("61938", customers.get(1890).getZIP());
	}

	@Test
	@DisplayName("Record 1891: Phone is 217-235-9414")
	void PhoneOfRecord1891() {
		assertEquals("217-235-9414", customers.get(1890).getPhone());
	}

	@Test
	@DisplayName("Record 1891: Fax is 217-235-8568")
	void FaxOfRecord1891() {
		assertEquals("217-235-8568", customers.get(1890).getFax());
	}

	@Test
	@DisplayName("Record 1891: Email is allene@dahlin.com")
	void EmailOfRecord1891() {
		assertEquals("allene@dahlin.com", customers.get(1890).getEmail());
	}

	@Test
	@DisplayName("Record 1891: Web is http://www.allenedahlin.com")
	void WebOfRecord1891() {
		assertEquals("http://www.allenedahlin.com", customers.get(1890).getWeb());
	}
}
