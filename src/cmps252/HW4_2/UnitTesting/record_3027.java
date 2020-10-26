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

@Tag("29")
class Record_3027 {

	private static List<Customer> customers;

	@BeforeAll
	public static void init() throws FileNotFoundException {
		customers = FileParser.getCustomers(Configuration.CSV_File);
	}

	@Test
	@DisplayName("Record 3027: FirstName is Corine")
	void FirstNameOfRecord3027() {
		assertEquals("Corine", customers.get(3026).getFirstName());
	}

	@Test
	@DisplayName("Record 3027: LastName is Cose")
	void LastNameOfRecord3027() {
		assertEquals("Cose", customers.get(3026).getLastName());
	}

	@Test
	@DisplayName("Record 3027: Company is Keck, Don")
	void CompanyOfRecord3027() {
		assertEquals("Keck, Don", customers.get(3026).getCompany());
	}

	@Test
	@DisplayName("Record 3027: Address is 2081 Rene Ave  #-c")
	void AddressOfRecord3027() {
		assertEquals("2081 Rene Ave  #-c", customers.get(3026).getAddress());
	}

	@Test
	@DisplayName("Record 3027: City is Sacramento")
	void CityOfRecord3027() {
		assertEquals("Sacramento", customers.get(3026).getCity());
	}

	@Test
	@DisplayName("Record 3027: County is Sacramento")
	void CountyOfRecord3027() {
		assertEquals("Sacramento", customers.get(3026).getCounty());
	}

	@Test
	@DisplayName("Record 3027: State is CA")
	void StateOfRecord3027() {
		assertEquals("CA", customers.get(3026).getState());
	}

	@Test
	@DisplayName("Record 3027: ZIP is 95838")
	void ZIPOfRecord3027() {
		assertEquals("95838", customers.get(3026).getZIP());
	}

	@Test
	@DisplayName("Record 3027: Phone is 916-929-0872")
	void PhoneOfRecord3027() {
		assertEquals("916-929-0872", customers.get(3026).getPhone());
	}

	@Test
	@DisplayName("Record 3027: Fax is 916-929-8556")
	void FaxOfRecord3027() {
		assertEquals("916-929-8556", customers.get(3026).getFax());
	}

	@Test
	@DisplayName("Record 3027: Email is corine@cose.com")
	void EmailOfRecord3027() {
		assertEquals("corine@cose.com", customers.get(3026).getEmail());
	}

	@Test
	@DisplayName("Record 3027: Web is http://www.corinecose.com")
	void WebOfRecord3027() {
		assertEquals("http://www.corinecose.com", customers.get(3026).getWeb());
	}
}
