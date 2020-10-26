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

@Tag("12")
class Record_2957 {

	private static List<Customer> customers;

	@BeforeAll
	public static void init() throws FileNotFoundException {
		customers = FileParser.getCustomers(Configuration.CSV_File);
	}

	@Test
	@DisplayName("Record 2957: FirstName is Sandi")
	void FirstNameOfRecord2957() {
		assertEquals("Sandi", customers.get(2956).getFirstName());
	}

	@Test
	@DisplayName("Record 2957: LastName is Wykal")
	void LastNameOfRecord2957() {
		assertEquals("Wykal", customers.get(2956).getLastName());
	}

	@Test
	@DisplayName("Record 2957: Company is Able Rolling Steel Door Inc")
	void CompanyOfRecord2957() {
		assertEquals("Able Rolling Steel Door Inc", customers.get(2956).getCompany());
	}

	@Test
	@DisplayName("Record 2957: Address is 7308 St Claude Ave")
	void AddressOfRecord2957() {
		assertEquals("7308 St Claude Ave", customers.get(2956).getAddress());
	}

	@Test
	@DisplayName("Record 2957: City is New Orleans")
	void CityOfRecord2957() {
		assertEquals("New Orleans", customers.get(2956).getCity());
	}

	@Test
	@DisplayName("Record 2957: County is Orleans")
	void CountyOfRecord2957() {
		assertEquals("Orleans", customers.get(2956).getCounty());
	}

	@Test
	@DisplayName("Record 2957: State is LA")
	void StateOfRecord2957() {
		assertEquals("LA", customers.get(2956).getState());
	}

	@Test
	@DisplayName("Record 2957: ZIP is 70117")
	void ZIPOfRecord2957() {
		assertEquals("70117", customers.get(2956).getZIP());
	}

	@Test
	@DisplayName("Record 2957: Phone is 504-277-9112")
	void PhoneOfRecord2957() {
		assertEquals("504-277-9112", customers.get(2956).getPhone());
	}

	@Test
	@DisplayName("Record 2957: Fax is 504-277-5336")
	void FaxOfRecord2957() {
		assertEquals("504-277-5336", customers.get(2956).getFax());
	}

	@Test
	@DisplayName("Record 2957: Email is sandi@wykal.com")
	void EmailOfRecord2957() {
		assertEquals("sandi@wykal.com", customers.get(2956).getEmail());
	}

	@Test
	@DisplayName("Record 2957: Web is http://www.sandiwykal.com")
	void WebOfRecord2957() {
		assertEquals("http://www.sandiwykal.com", customers.get(2956).getWeb());
	}
}
