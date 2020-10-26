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

@Tag("21")
class Record_2587 {

	private static List<Customer> customers;

	@BeforeAll
	public static void init() throws FileNotFoundException {
		customers = FileParser.getCustomers(Configuration.CSV_File);
	}

	@Test
	@DisplayName("Record 2587: FirstName is Dwain")
	void FirstNameOfRecord2587() {
		assertEquals("Dwain", customers.get(2586).getFirstName());
	}

	@Test
	@DisplayName("Record 2587: LastName is Surman")
	void LastNameOfRecord2587() {
		assertEquals("Surman", customers.get(2586).getLastName());
	}

	@Test
	@DisplayName("Record 2587: Company is Atkinson, William M Jr")
	void CompanyOfRecord2587() {
		assertEquals("Atkinson, William M Jr", customers.get(2586).getCompany());
	}

	@Test
	@DisplayName("Record 2587: Address is 907 S Broad St")
	void AddressOfRecord2587() {
		assertEquals("907 S Broad St", customers.get(2586).getAddress());
	}

	@Test
	@DisplayName("Record 2587: City is New Orleans")
	void CityOfRecord2587() {
		assertEquals("New Orleans", customers.get(2586).getCity());
	}

	@Test
	@DisplayName("Record 2587: County is Orleans")
	void CountyOfRecord2587() {
		assertEquals("Orleans", customers.get(2586).getCounty());
	}

	@Test
	@DisplayName("Record 2587: State is LA")
	void StateOfRecord2587() {
		assertEquals("LA", customers.get(2586).getState());
	}

	@Test
	@DisplayName("Record 2587: ZIP is 70125")
	void ZIPOfRecord2587() {
		assertEquals("70125", customers.get(2586).getZIP());
	}

	@Test
	@DisplayName("Record 2587: Phone is 504-822-4947")
	void PhoneOfRecord2587() {
		assertEquals("504-822-4947", customers.get(2586).getPhone());
	}

	@Test
	@DisplayName("Record 2587: Fax is 504-822-0678")
	void FaxOfRecord2587() {
		assertEquals("504-822-0678", customers.get(2586).getFax());
	}

	@Test
	@DisplayName("Record 2587: Email is dwain@surman.com")
	void EmailOfRecord2587() {
		assertEquals("dwain@surman.com", customers.get(2586).getEmail());
	}

	@Test
	@DisplayName("Record 2587: Web is http://www.dwainsurman.com")
	void WebOfRecord2587() {
		assertEquals("http://www.dwainsurman.com", customers.get(2586).getWeb());
	}
}
