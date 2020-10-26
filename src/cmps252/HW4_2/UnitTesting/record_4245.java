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

@Tag("43")
class Record_4245 {

	private static List<Customer> customers;

	@BeforeAll
	public static void init() throws FileNotFoundException {
		customers = FileParser.getCustomers(Configuration.CSV_File);
	}

	@Test
	@DisplayName("Record 4245: FirstName is Numbers")
	void FirstNameOfRecord4245() {
		assertEquals("Numbers", customers.get(4244).getFirstName());
	}

	@Test
	@DisplayName("Record 4245: LastName is Patriarco")
	void LastNameOfRecord4245() {
		assertEquals("Patriarco", customers.get(4244).getLastName());
	}

	@Test
	@DisplayName("Record 4245: Company is Dorell Fabrics Co")
	void CompanyOfRecord4245() {
		assertEquals("Dorell Fabrics Co", customers.get(4244).getCompany());
	}

	@Test
	@DisplayName("Record 4245: Address is 857 Collier Rd Nw  #-19")
	void AddressOfRecord4245() {
		assertEquals("857 Collier Rd Nw  #-19", customers.get(4244).getAddress());
	}

	@Test
	@DisplayName("Record 4245: City is Atlanta")
	void CityOfRecord4245() {
		assertEquals("Atlanta", customers.get(4244).getCity());
	}

	@Test
	@DisplayName("Record 4245: County is Fulton")
	void CountyOfRecord4245() {
		assertEquals("Fulton", customers.get(4244).getCounty());
	}

	@Test
	@DisplayName("Record 4245: State is GA")
	void StateOfRecord4245() {
		assertEquals("GA", customers.get(4244).getState());
	}

	@Test
	@DisplayName("Record 4245: ZIP is 30318")
	void ZIPOfRecord4245() {
		assertEquals("30318", customers.get(4244).getZIP());
	}

	@Test
	@DisplayName("Record 4245: Phone is 404-351-8001")
	void PhoneOfRecord4245() {
		assertEquals("404-351-8001", customers.get(4244).getPhone());
	}

	@Test
	@DisplayName("Record 4245: Fax is 404-351-7178")
	void FaxOfRecord4245() {
		assertEquals("404-351-7178", customers.get(4244).getFax());
	}

	@Test
	@DisplayName("Record 4245: Email is numbers@patriarco.com")
	void EmailOfRecord4245() {
		assertEquals("numbers@patriarco.com", customers.get(4244).getEmail());
	}

	@Test
	@DisplayName("Record 4245: Web is http://www.numberspatriarco.com")
	void WebOfRecord4245() {
		assertEquals("http://www.numberspatriarco.com", customers.get(4244).getWeb());
	}
}
