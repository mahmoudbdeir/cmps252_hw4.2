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
class Record_1269 {

	private static List<Customer> customers;

	@BeforeAll
	public static void init() throws FileNotFoundException {
		customers = FileParser.getCustomers(Configuration.CSV_File);
	}

	@Test
	@DisplayName("Record 1269: FirstName is Gerardo")
	void FirstNameOfRecord1269() {
		assertEquals("Gerardo", customers.get(1268).getFirstName());
	}

	@Test
	@DisplayName("Record 1269: LastName is Szerbin")
	void LastNameOfRecord1269() {
		assertEquals("Szerbin", customers.get(1268).getLastName());
	}

	@Test
	@DisplayName("Record 1269: Company is Silver Leaf Greenhouses")
	void CompanyOfRecord1269() {
		assertEquals("Silver Leaf Greenhouses", customers.get(1268).getCompany());
	}

	@Test
	@DisplayName("Record 1269: Address is 74390 Us Highway 111")
	void AddressOfRecord1269() {
		assertEquals("74390 Us Highway 111", customers.get(1268).getAddress());
	}

	@Test
	@DisplayName("Record 1269: City is Palm Desert")
	void CityOfRecord1269() {
		assertEquals("Palm Desert", customers.get(1268).getCity());
	}

	@Test
	@DisplayName("Record 1269: County is Riverside")
	void CountyOfRecord1269() {
		assertEquals("Riverside", customers.get(1268).getCounty());
	}

	@Test
	@DisplayName("Record 1269: State is CA")
	void StateOfRecord1269() {
		assertEquals("CA", customers.get(1268).getState());
	}

	@Test
	@DisplayName("Record 1269: ZIP is 92260")
	void ZIPOfRecord1269() {
		assertEquals("92260", customers.get(1268).getZIP());
	}

	@Test
	@DisplayName("Record 1269: Phone is 760-340-2955")
	void PhoneOfRecord1269() {
		assertEquals("760-340-2955", customers.get(1268).getPhone());
	}

	@Test
	@DisplayName("Record 1269: Fax is 760-340-7938")
	void FaxOfRecord1269() {
		assertEquals("760-340-7938", customers.get(1268).getFax());
	}

	@Test
	@DisplayName("Record 1269: Email is gerardo@szerbin.com")
	void EmailOfRecord1269() {
		assertEquals("gerardo@szerbin.com", customers.get(1268).getEmail());
	}

	@Test
	@DisplayName("Record 1269: Web is http://www.gerardoszerbin.com")
	void WebOfRecord1269() {
		assertEquals("http://www.gerardoszerbin.com", customers.get(1268).getWeb());
	}
}
