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
class Record_414 {

	private static List<Customer> customers;

	@BeforeAll
	public static void init() throws FileNotFoundException {
		customers = FileParser.getCustomers(Configuration.CSV_File);
	}

	@Test
	@DisplayName("Record 414: FirstName is Benita")
	void FirstNameOfRecord414() {
		assertEquals("Benita", customers.get(413).getFirstName());
	}

	@Test
	@DisplayName("Record 414: LastName is Epler")
	void LastNameOfRecord414() {
		assertEquals("Epler", customers.get(413).getLastName());
	}

	@Test
	@DisplayName("Record 414: Company is Osborne, William G Esq")
	void CompanyOfRecord414() {
		assertEquals("Osborne, William G Esq", customers.get(413).getCompany());
	}

	@Test
	@DisplayName("Record 414: Address is 296 S Pauline St")
	void AddressOfRecord414() {
		assertEquals("296 S Pauline St", customers.get(413).getAddress());
	}

	@Test
	@DisplayName("Record 414: City is Memphis")
	void CityOfRecord414() {
		assertEquals("Memphis", customers.get(413).getCity());
	}

	@Test
	@DisplayName("Record 414: County is Shelby")
	void CountyOfRecord414() {
		assertEquals("Shelby", customers.get(413).getCounty());
	}

	@Test
	@DisplayName("Record 414: State is TN")
	void StateOfRecord414() {
		assertEquals("TN", customers.get(413).getState());
	}

	@Test
	@DisplayName("Record 414: ZIP is 38104")
	void ZIPOfRecord414() {
		assertEquals("38104", customers.get(413).getZIP());
	}

	@Test
	@DisplayName("Record 414: Phone is 901-527-7088")
	void PhoneOfRecord414() {
		assertEquals("901-527-7088", customers.get(413).getPhone());
	}

	@Test
	@DisplayName("Record 414: Fax is 901-527-0417")
	void FaxOfRecord414() {
		assertEquals("901-527-0417", customers.get(413).getFax());
	}

	@Test
	@DisplayName("Record 414: Email is benita@epler.com")
	void EmailOfRecord414() {
		assertEquals("benita@epler.com", customers.get(413).getEmail());
	}

	@Test
	@DisplayName("Record 414: Web is http://www.benitaepler.com")
	void WebOfRecord414() {
		assertEquals("http://www.benitaepler.com", customers.get(413).getWeb());
	}
}
