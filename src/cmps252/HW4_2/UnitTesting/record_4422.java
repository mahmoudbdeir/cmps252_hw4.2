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

@Tag("36")
class Record_4422 {

	private static List<Customer> customers;

	@BeforeAll
	public static void init() throws FileNotFoundException {
		customers = FileParser.getCustomers(Configuration.CSV_File);
	}

	@Test
	@DisplayName("Record 4422: FirstName is Mellisa")
	void FirstNameOfRecord4422() {
		assertEquals("Mellisa", customers.get(4421).getFirstName());
	}

	@Test
	@DisplayName("Record 4422: LastName is Miessler")
	void LastNameOfRecord4422() {
		assertEquals("Miessler", customers.get(4421).getLastName());
	}

	@Test
	@DisplayName("Record 4422: Company is Gray Stefani & Mitvalsky Plc")
	void CompanyOfRecord4422() {
		assertEquals("Gray Stefani & Mitvalsky Plc", customers.get(4421).getCompany());
	}

	@Test
	@DisplayName("Record 4422: Address is 1 Mcalister Farm Rd")
	void AddressOfRecord4422() {
		assertEquals("1 Mcalister Farm Rd", customers.get(4421).getAddress());
	}

	@Test
	@DisplayName("Record 4422: City is Portland")
	void CityOfRecord4422() {
		assertEquals("Portland", customers.get(4421).getCity());
	}

	@Test
	@DisplayName("Record 4422: County is Cumberland")
	void CountyOfRecord4422() {
		assertEquals("Cumberland", customers.get(4421).getCounty());
	}

	@Test
	@DisplayName("Record 4422: State is ME")
	void StateOfRecord4422() {
		assertEquals("ME", customers.get(4421).getState());
	}

	@Test
	@DisplayName("Record 4422: ZIP is 4103")
	void ZIPOfRecord4422() {
		assertEquals("4103", customers.get(4421).getZIP());
	}

	@Test
	@DisplayName("Record 4422: Phone is 207-622-1133")
	void PhoneOfRecord4422() {
		assertEquals("207-622-1133", customers.get(4421).getPhone());
	}

	@Test
	@DisplayName("Record 4422: Fax is 207-622-6599")
	void FaxOfRecord4422() {
		assertEquals("207-622-6599", customers.get(4421).getFax());
	}

	@Test
	@DisplayName("Record 4422: Email is mellisa@miessler.com")
	void EmailOfRecord4422() {
		assertEquals("mellisa@miessler.com", customers.get(4421).getEmail());
	}

	@Test
	@DisplayName("Record 4422: Web is http://www.mellisamiessler.com")
	void WebOfRecord4422() {
		assertEquals("http://www.mellisamiessler.com", customers.get(4421).getWeb());
	}
}
