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

@Tag("4")
class Record_2547 {

	private static List<Customer> customers;

	@BeforeAll
	public static void init() throws FileNotFoundException {
		customers = FileParser.getCustomers(Configuration.CSV_File);
	}

	@Test
	@DisplayName("Record 2547: FirstName is Thaddeus")
	void FirstNameOfRecord2547() {
		assertEquals("Thaddeus", customers.get(2546).getFirstName());
	}

	@Test
	@DisplayName("Record 2547: LastName is Bernardino")
	void LastNameOfRecord2547() {
		assertEquals("Bernardino", customers.get(2546).getLastName());
	}

	@Test
	@DisplayName("Record 2547: Company is Rasmussen, Eric N Esq")
	void CompanyOfRecord2547() {
		assertEquals("Rasmussen, Eric N Esq", customers.get(2546).getCompany());
	}

	@Test
	@DisplayName("Record 2547: Address is 135 Greenwood Ave")
	void AddressOfRecord2547() {
		assertEquals("135 Greenwood Ave", customers.get(2546).getAddress());
	}

	@Test
	@DisplayName("Record 2547: City is Wyncote")
	void CityOfRecord2547() {
		assertEquals("Wyncote", customers.get(2546).getCity());
	}

	@Test
	@DisplayName("Record 2547: County is Montgomery")
	void CountyOfRecord2547() {
		assertEquals("Montgomery", customers.get(2546).getCounty());
	}

	@Test
	@DisplayName("Record 2547: State is PA")
	void StateOfRecord2547() {
		assertEquals("PA", customers.get(2546).getState());
	}

	@Test
	@DisplayName("Record 2547: ZIP is 19095")
	void ZIPOfRecord2547() {
		assertEquals("19095", customers.get(2546).getZIP());
	}

	@Test
	@DisplayName("Record 2547: Phone is 215-576-1767")
	void PhoneOfRecord2547() {
		assertEquals("215-576-1767", customers.get(2546).getPhone());
	}

	@Test
	@DisplayName("Record 2547: Fax is 215-576-9898")
	void FaxOfRecord2547() {
		assertEquals("215-576-9898", customers.get(2546).getFax());
	}

	@Test
	@DisplayName("Record 2547: Email is thaddeus@bernardino.com")
	void EmailOfRecord2547() {
		assertEquals("thaddeus@bernardino.com", customers.get(2546).getEmail());
	}

	@Test
	@DisplayName("Record 2547: Web is http://www.thaddeusbernardino.com")
	void WebOfRecord2547() {
		assertEquals("http://www.thaddeusbernardino.com", customers.get(2546).getWeb());
	}
}
