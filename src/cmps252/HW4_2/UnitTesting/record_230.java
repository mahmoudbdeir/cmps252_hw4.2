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

@Tag("39")
class Record_230 {

	private static List<Customer> customers;

	@BeforeAll
	public static void init() throws FileNotFoundException {
		customers = FileParser.getCustomers(Configuration.CSV_File);
	}

	@Test
	@DisplayName("Record 230: FirstName is Mildred")
	void FirstNameOfRecord230() {
		assertEquals("Mildred", customers.get(229).getFirstName());
	}

	@Test
	@DisplayName("Record 230: LastName is Hamara")
	void LastNameOfRecord230() {
		assertEquals("Hamara", customers.get(229).getLastName());
	}

	@Test
	@DisplayName("Record 230: Company is West End Efficiency Apts Inc")
	void CompanyOfRecord230() {
		assertEquals("West End Efficiency Apts Inc", customers.get(229).getCompany());
	}

	@Test
	@DisplayName("Record 230: Address is 1100 4th Ave E  #-240")
	void AddressOfRecord230() {
		assertEquals("1100 4th Ave E  #-240", customers.get(229).getAddress());
	}

	@Test
	@DisplayName("Record 230: City is Shakopee")
	void CityOfRecord230() {
		assertEquals("Shakopee", customers.get(229).getCity());
	}

	@Test
	@DisplayName("Record 230: County is Scott")
	void CountyOfRecord230() {
		assertEquals("Scott", customers.get(229).getCounty());
	}

	@Test
	@DisplayName("Record 230: State is MN")
	void StateOfRecord230() {
		assertEquals("MN", customers.get(229).getState());
	}

	@Test
	@DisplayName("Record 230: ZIP is 55379")
	void ZIPOfRecord230() {
		assertEquals("55379", customers.get(229).getZIP());
	}

	@Test
	@DisplayName("Record 230: Phone is 952-496-7837")
	void PhoneOfRecord230() {
		assertEquals("952-496-7837", customers.get(229).getPhone());
	}

	@Test
	@DisplayName("Record 230: Fax is 952-496-1249")
	void FaxOfRecord230() {
		assertEquals("952-496-1249", customers.get(229).getFax());
	}

	@Test
	@DisplayName("Record 230: Email is mildred@hamara.com")
	void EmailOfRecord230() {
		assertEquals("mildred@hamara.com", customers.get(229).getEmail());
	}

	@Test
	@DisplayName("Record 230: Web is http://www.mildredhamara.com")
	void WebOfRecord230() {
		assertEquals("http://www.mildredhamara.com", customers.get(229).getWeb());
	}
}
