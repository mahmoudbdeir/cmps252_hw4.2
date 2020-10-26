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

@Tag("31")
class Record_2904 {

	private static List<Customer> customers;

	@BeforeAll
	public static void init() throws FileNotFoundException {
		customers = FileParser.getCustomers(Configuration.CSV_File);
	}

	@Test
	@DisplayName("Record 2904: FirstName is Douglas")
	void FirstNameOfRecord2904() {
		assertEquals("Douglas", customers.get(2903).getFirstName());
	}

	@Test
	@DisplayName("Record 2904: LastName is Selan")
	void LastNameOfRecord2904() {
		assertEquals("Selan", customers.get(2903).getLastName());
	}

	@Test
	@DisplayName("Record 2904: Company is Drake, John W Esq")
	void CompanyOfRecord2904() {
		assertEquals("Drake, John W Esq", customers.get(2903).getCompany());
	}

	@Test
	@DisplayName("Record 2904: Address is 2920 De La")
	void AddressOfRecord2904() {
		assertEquals("2920 De La", customers.get(2903).getAddress());
	}

	@Test
	@DisplayName("Record 2904: City is Santa Barbara")
	void CityOfRecord2904() {
		assertEquals("Santa Barbara", customers.get(2903).getCity());
	}

	@Test
	@DisplayName("Record 2904: County is Santa Barbara")
	void CountyOfRecord2904() {
		assertEquals("Santa Barbara", customers.get(2903).getCounty());
	}

	@Test
	@DisplayName("Record 2904: State is CA")
	void StateOfRecord2904() {
		assertEquals("CA", customers.get(2903).getState());
	}

	@Test
	@DisplayName("Record 2904: ZIP is 93105")
	void ZIPOfRecord2904() {
		assertEquals("93105", customers.get(2903).getZIP());
	}

	@Test
	@DisplayName("Record 2904: Phone is 805-563-5557")
	void PhoneOfRecord2904() {
		assertEquals("805-563-5557", customers.get(2903).getPhone());
	}

	@Test
	@DisplayName("Record 2904: Fax is 805-563-3197")
	void FaxOfRecord2904() {
		assertEquals("805-563-3197", customers.get(2903).getFax());
	}

	@Test
	@DisplayName("Record 2904: Email is douglas@selan.com")
	void EmailOfRecord2904() {
		assertEquals("douglas@selan.com", customers.get(2903).getEmail());
	}

	@Test
	@DisplayName("Record 2904: Web is http://www.douglasselan.com")
	void WebOfRecord2904() {
		assertEquals("http://www.douglasselan.com", customers.get(2903).getWeb());
	}
}
