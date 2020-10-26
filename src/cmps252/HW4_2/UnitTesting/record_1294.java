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

@Tag("48")
class Record_1294 {

	private static List<Customer> customers;

	@BeforeAll
	public static void init() throws FileNotFoundException {
		customers = FileParser.getCustomers(Configuration.CSV_File);
	}

	@Test
	@DisplayName("Record 1294: FirstName is Neva")
	void FirstNameOfRecord1294() {
		assertEquals("Neva", customers.get(1293).getFirstName());
	}

	@Test
	@DisplayName("Record 1294: LastName is Lowhorn")
	void LastNameOfRecord1294() {
		assertEquals("Lowhorn", customers.get(1293).getLastName());
	}

	@Test
	@DisplayName("Record 1294: Company is Geo F Kempf Supply Co Inc")
	void CompanyOfRecord1294() {
		assertEquals("Geo F Kempf Supply Co Inc", customers.get(1293).getCompany());
	}

	@Test
	@DisplayName("Record 1294: Address is 1540 E Edinger Ave")
	void AddressOfRecord1294() {
		assertEquals("1540 E Edinger Ave", customers.get(1293).getAddress());
	}

	@Test
	@DisplayName("Record 1294: City is Santa Ana")
	void CityOfRecord1294() {
		assertEquals("Santa Ana", customers.get(1293).getCity());
	}

	@Test
	@DisplayName("Record 1294: County is Orange")
	void CountyOfRecord1294() {
		assertEquals("Orange", customers.get(1293).getCounty());
	}

	@Test
	@DisplayName("Record 1294: State is CA")
	void StateOfRecord1294() {
		assertEquals("CA", customers.get(1293).getState());
	}

	@Test
	@DisplayName("Record 1294: ZIP is 92705")
	void ZIPOfRecord1294() {
		assertEquals("92705", customers.get(1293).getZIP());
	}

	@Test
	@DisplayName("Record 1294: Phone is 714-835-6109")
	void PhoneOfRecord1294() {
		assertEquals("714-835-6109", customers.get(1293).getPhone());
	}

	@Test
	@DisplayName("Record 1294: Fax is 714-835-7632")
	void FaxOfRecord1294() {
		assertEquals("714-835-7632", customers.get(1293).getFax());
	}

	@Test
	@DisplayName("Record 1294: Email is neva@lowhorn.com")
	void EmailOfRecord1294() {
		assertEquals("neva@lowhorn.com", customers.get(1293).getEmail());
	}

	@Test
	@DisplayName("Record 1294: Web is http://www.nevalowhorn.com")
	void WebOfRecord1294() {
		assertEquals("http://www.nevalowhorn.com", customers.get(1293).getWeb());
	}
}
