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
class Record_178 {

	private static List<Customer> customers;

	@BeforeAll
	public static void init() throws FileNotFoundException {
		customers = FileParser.getCustomers(Configuration.CSV_File);
	}

	@Test
	@DisplayName("Record 178: FirstName is Dolores")
	void FirstNameOfRecord178() {
		assertEquals("Dolores", customers.get(177).getFirstName());
	}

	@Test
	@DisplayName("Record 178: LastName is Eadens")
	void LastNameOfRecord178() {
		assertEquals("Eadens", customers.get(177).getLastName());
	}

	@Test
	@DisplayName("Record 178: Company is J & J Towing")
	void CompanyOfRecord178() {
		assertEquals("J & J Towing", customers.get(177).getCompany());
	}

	@Test
	@DisplayName("Record 178: Address is 100 Glenn Way  #-5")
	void AddressOfRecord178() {
		assertEquals("100 Glenn Way  #-5", customers.get(177).getAddress());
	}

	@Test
	@DisplayName("Record 178: City is Belmont")
	void CityOfRecord178() {
		assertEquals("Belmont", customers.get(177).getCity());
	}

	@Test
	@DisplayName("Record 178: County is San Mateo")
	void CountyOfRecord178() {
		assertEquals("San Mateo", customers.get(177).getCounty());
	}

	@Test
	@DisplayName("Record 178: State is CA")
	void StateOfRecord178() {
		assertEquals("CA", customers.get(177).getState());
	}

	@Test
	@DisplayName("Record 178: ZIP is 94002")
	void ZIPOfRecord178() {
		assertEquals("94002", customers.get(177).getZIP());
	}

	@Test
	@DisplayName("Record 178: Phone is 650-592-3481")
	void PhoneOfRecord178() {
		assertEquals("650-592-3481", customers.get(177).getPhone());
	}

	@Test
	@DisplayName("Record 178: Fax is 650-592-2463")
	void FaxOfRecord178() {
		assertEquals("650-592-2463", customers.get(177).getFax());
	}

	@Test
	@DisplayName("Record 178: Email is dolores@eadens.com")
	void EmailOfRecord178() {
		assertEquals("dolores@eadens.com", customers.get(177).getEmail());
	}

	@Test
	@DisplayName("Record 178: Web is http://www.doloreseadens.com")
	void WebOfRecord178() {
		assertEquals("http://www.doloreseadens.com", customers.get(177).getWeb());
	}
}
