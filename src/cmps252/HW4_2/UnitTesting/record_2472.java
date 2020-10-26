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

@Tag("32")
class Record_2472 {

	private static List<Customer> customers;

	@BeforeAll
	public static void init() throws FileNotFoundException {
		customers = FileParser.getCustomers(Configuration.CSV_File);
	}

	@Test
	@DisplayName("Record 2472: FirstName is Megan")
	void FirstNameOfRecord2472() {
		assertEquals("Megan", customers.get(2471).getFirstName());
	}

	@Test
	@DisplayName("Record 2472: LastName is Langfield")
	void LastNameOfRecord2472() {
		assertEquals("Langfield", customers.get(2471).getLastName());
	}

	@Test
	@DisplayName("Record 2472: Company is John Crane Inc")
	void CompanyOfRecord2472() {
		assertEquals("John Crane Inc", customers.get(2471).getCompany());
	}

	@Test
	@DisplayName("Record 2472: Address is 541 Dyer Ave")
	void AddressOfRecord2472() {
		assertEquals("541 Dyer Ave", customers.get(2471).getAddress());
	}

	@Test
	@DisplayName("Record 2472: City is Cranston")
	void CityOfRecord2472() {
		assertEquals("Cranston", customers.get(2471).getCity());
	}

	@Test
	@DisplayName("Record 2472: County is Providence")
	void CountyOfRecord2472() {
		assertEquals("Providence", customers.get(2471).getCounty());
	}

	@Test
	@DisplayName("Record 2472: State is RI")
	void StateOfRecord2472() {
		assertEquals("RI", customers.get(2471).getState());
	}

	@Test
	@DisplayName("Record 2472: ZIP is 2920")
	void ZIPOfRecord2472() {
		assertEquals("2920", customers.get(2471).getZIP());
	}

	@Test
	@DisplayName("Record 2472: Phone is 401-942-1847")
	void PhoneOfRecord2472() {
		assertEquals("401-942-1847", customers.get(2471).getPhone());
	}

	@Test
	@DisplayName("Record 2472: Fax is 401-942-2367")
	void FaxOfRecord2472() {
		assertEquals("401-942-2367", customers.get(2471).getFax());
	}

	@Test
	@DisplayName("Record 2472: Email is megan@langfield.com")
	void EmailOfRecord2472() {
		assertEquals("megan@langfield.com", customers.get(2471).getEmail());
	}

	@Test
	@DisplayName("Record 2472: Web is http://www.meganlangfield.com")
	void WebOfRecord2472() {
		assertEquals("http://www.meganlangfield.com", customers.get(2471).getWeb());
	}
}
