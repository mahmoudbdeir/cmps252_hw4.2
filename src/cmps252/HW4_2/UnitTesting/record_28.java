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
class Record_28 {

	private static List<Customer> customers;

	@BeforeAll
	public static void init() throws FileNotFoundException {
		customers = FileParser.getCustomers(Configuration.CSV_File);
	}

	@Test
	@DisplayName("Record 28: FirstName is Fryda")
	void FirstNameOfRecord28() {
		assertEquals("Fryda", customers.get(27).getFirstName());
	}

	@Test
	@DisplayName("Record 28: LastName is Whitham")
	void LastNameOfRecord28() {
		assertEquals("Whitham", customers.get(27).getLastName());
	}

	@Test
	@DisplayName("Record 28: Company is Butler, Claudia B Esq")
	void CompanyOfRecord28() {
		assertEquals("Butler, Claudia B Esq", customers.get(27).getCompany());
	}

	@Test
	@DisplayName("Record 28: Address is 2767 Tulane Ave")
	void AddressOfRecord28() {
		assertEquals("2767 Tulane Ave", customers.get(27).getAddress());
	}

	@Test
	@DisplayName("Record 28: City is New Orleans")
	void CityOfRecord28() {
		assertEquals("New Orleans", customers.get(27).getCity());
	}

	@Test
	@DisplayName("Record 28: County is Orleans")
	void CountyOfRecord28() {
		assertEquals("Orleans", customers.get(27).getCounty());
	}

	@Test
	@DisplayName("Record 28: State is LA")
	void StateOfRecord28() {
		assertEquals("LA", customers.get(27).getState());
	}

	@Test
	@DisplayName("Record 28: ZIP is 70119")
	void ZIPOfRecord28() {
		assertEquals("70119", customers.get(27).getZIP());
	}

	@Test
	@DisplayName("Record 28: Phone is 504-822-2292")
	void PhoneOfRecord28() {
		assertEquals("504-822-2292", customers.get(27).getPhone());
	}

	@Test
	@DisplayName("Record 28: Fax is 504-822-0377")
	void FaxOfRecord28() {
		assertEquals("504-822-0377", customers.get(27).getFax());
	}

	@Test
	@DisplayName("Record 28: Email is fryda@whitham.com")
	void EmailOfRecord28() {
		assertEquals("fryda@whitham.com", customers.get(27).getEmail());
	}

	@Test
	@DisplayName("Record 28: Web is http://www.frydawhitham.com")
	void WebOfRecord28() {
		assertEquals("http://www.frydawhitham.com", customers.get(27).getWeb());
	}
}
