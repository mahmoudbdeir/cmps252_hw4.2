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
class Record_2423 {

	private static List<Customer> customers;

	@BeforeAll
	public static void init() throws FileNotFoundException {
		customers = FileParser.getCustomers(Configuration.CSV_File);
	}

	@Test
	@DisplayName("Record 2423: FirstName is Margaret")
	void FirstNameOfRecord2423() {
		assertEquals("Margaret", customers.get(2422).getFirstName());
	}

	@Test
	@DisplayName("Record 2423: LastName is Carreras")
	void LastNameOfRecord2423() {
		assertEquals("Carreras", customers.get(2422).getLastName());
	}

	@Test
	@DisplayName("Record 2423: Company is National City Bank Indiana")
	void CompanyOfRecord2423() {
		assertEquals("National City Bank Indiana", customers.get(2422).getCompany());
	}

	@Test
	@DisplayName("Record 2423: Address is 4437 N Lauber Way")
	void AddressOfRecord2423() {
		assertEquals("4437 N Lauber Way", customers.get(2422).getAddress());
	}

	@Test
	@DisplayName("Record 2423: City is Tampa")
	void CityOfRecord2423() {
		assertEquals("Tampa", customers.get(2422).getCity());
	}

	@Test
	@DisplayName("Record 2423: County is Hillsborough")
	void CountyOfRecord2423() {
		assertEquals("Hillsborough", customers.get(2422).getCounty());
	}

	@Test
	@DisplayName("Record 2423: State is FL")
	void StateOfRecord2423() {
		assertEquals("FL", customers.get(2422).getState());
	}

	@Test
	@DisplayName("Record 2423: ZIP is 33614")
	void ZIPOfRecord2423() {
		assertEquals("33614", customers.get(2422).getZIP());
	}

	@Test
	@DisplayName("Record 2423: Phone is 813-876-2325")
	void PhoneOfRecord2423() {
		assertEquals("813-876-2325", customers.get(2422).getPhone());
	}

	@Test
	@DisplayName("Record 2423: Fax is 813-876-8548")
	void FaxOfRecord2423() {
		assertEquals("813-876-8548", customers.get(2422).getFax());
	}

	@Test
	@DisplayName("Record 2423: Email is margaret@carreras.com")
	void EmailOfRecord2423() {
		assertEquals("margaret@carreras.com", customers.get(2422).getEmail());
	}

	@Test
	@DisplayName("Record 2423: Web is http://www.margaretcarreras.com")
	void WebOfRecord2423() {
		assertEquals("http://www.margaretcarreras.com", customers.get(2422).getWeb());
	}
}
