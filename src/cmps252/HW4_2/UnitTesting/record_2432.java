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

@Tag("9")
class Record_2432 {

	private static List<Customer> customers;

	@BeforeAll
	public static void init() throws FileNotFoundException {
		customers = FileParser.getCustomers(Configuration.CSV_File);
	}

	@Test
	@DisplayName("Record 2432: FirstName is Patricia")
	void FirstNameOfRecord2432() {
		assertEquals("Patricia", customers.get(2431).getFirstName());
	}

	@Test
	@DisplayName("Record 2432: LastName is Buckley")
	void LastNameOfRecord2432() {
		assertEquals("Buckley", customers.get(2431).getLastName());
	}

	@Test
	@DisplayName("Record 2432: Company is Mirto Ketaineck & Barrett Pc")
	void CompanyOfRecord2432() {
		assertEquals("Mirto Ketaineck & Barrett Pc", customers.get(2431).getCompany());
	}

	@Test
	@DisplayName("Record 2432: Address is 1206 W Winton Ave")
	void AddressOfRecord2432() {
		assertEquals("1206 W Winton Ave", customers.get(2431).getAddress());
	}

	@Test
	@DisplayName("Record 2432: City is Hayward")
	void CityOfRecord2432() {
		assertEquals("Hayward", customers.get(2431).getCity());
	}

	@Test
	@DisplayName("Record 2432: County is Alameda")
	void CountyOfRecord2432() {
		assertEquals("Alameda", customers.get(2431).getCounty());
	}

	@Test
	@DisplayName("Record 2432: State is CA")
	void StateOfRecord2432() {
		assertEquals("CA", customers.get(2431).getState());
	}

	@Test
	@DisplayName("Record 2432: ZIP is 94545")
	void ZIPOfRecord2432() {
		assertEquals("94545", customers.get(2431).getZIP());
	}

	@Test
	@DisplayName("Record 2432: Phone is 510-783-0523")
	void PhoneOfRecord2432() {
		assertEquals("510-783-0523", customers.get(2431).getPhone());
	}

	@Test
	@DisplayName("Record 2432: Fax is 510-783-0984")
	void FaxOfRecord2432() {
		assertEquals("510-783-0984", customers.get(2431).getFax());
	}

	@Test
	@DisplayName("Record 2432: Email is patricia@buckley.com")
	void EmailOfRecord2432() {
		assertEquals("patricia@buckley.com", customers.get(2431).getEmail());
	}

	@Test
	@DisplayName("Record 2432: Web is http://www.patriciabuckley.com")
	void WebOfRecord2432() {
		assertEquals("http://www.patriciabuckley.com", customers.get(2431).getWeb());
	}
}
