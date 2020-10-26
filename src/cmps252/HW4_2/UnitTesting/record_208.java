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

@Tag("27")
class Record_208 {

	private static List<Customer> customers;

	@BeforeAll
	public static void init() throws FileNotFoundException {
		customers = FileParser.getCustomers(Configuration.CSV_File);
	}

	@Test
	@DisplayName("Record 208: FirstName is Lesa")
	void FirstNameOfRecord208() {
		assertEquals("Lesa", customers.get(207).getFirstName());
	}

	@Test
	@DisplayName("Record 208: LastName is Brandler")
	void LastNameOfRecord208() {
		assertEquals("Brandler", customers.get(207).getLastName());
	}

	@Test
	@DisplayName("Record 208: Company is Conser, Janet A Esq")
	void CompanyOfRecord208() {
		assertEquals("Conser, Janet A Esq", customers.get(207).getCompany());
	}

	@Test
	@DisplayName("Record 208: Address is 2110 Hartel Ave")
	void AddressOfRecord208() {
		assertEquals("2110 Hartel Ave", customers.get(207).getAddress());
	}

	@Test
	@DisplayName("Record 208: City is Levittown")
	void CityOfRecord208() {
		assertEquals("Levittown", customers.get(207).getCity());
	}

	@Test
	@DisplayName("Record 208: County is Bucks")
	void CountyOfRecord208() {
		assertEquals("Bucks", customers.get(207).getCounty());
	}

	@Test
	@DisplayName("Record 208: State is PA")
	void StateOfRecord208() {
		assertEquals("PA", customers.get(207).getState());
	}

	@Test
	@DisplayName("Record 208: ZIP is 19057")
	void ZIPOfRecord208() {
		assertEquals("19057", customers.get(207).getZIP());
	}

	@Test
	@DisplayName("Record 208: Phone is 215-943-3150")
	void PhoneOfRecord208() {
		assertEquals("215-943-3150", customers.get(207).getPhone());
	}

	@Test
	@DisplayName("Record 208: Fax is 215-943-4955")
	void FaxOfRecord208() {
		assertEquals("215-943-4955", customers.get(207).getFax());
	}

	@Test
	@DisplayName("Record 208: Email is lesa@brandler.com")
	void EmailOfRecord208() {
		assertEquals("lesa@brandler.com", customers.get(207).getEmail());
	}

	@Test
	@DisplayName("Record 208: Web is http://www.lesabrandler.com")
	void WebOfRecord208() {
		assertEquals("http://www.lesabrandler.com", customers.get(207).getWeb());
	}
}
