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
class Record_4669 {

	private static List<Customer> customers;

	@BeforeAll
	public static void init() throws FileNotFoundException {
		customers = FileParser.getCustomers(Configuration.CSV_File);
	}

	@Test
	@DisplayName("Record 4669: FirstName is Chong")
	void FirstNameOfRecord4669() {
		assertEquals("Chong", customers.get(4668).getFirstName());
	}

	@Test
	@DisplayName("Record 4669: LastName is Sheppard")
	void LastNameOfRecord4669() {
		assertEquals("Sheppard", customers.get(4668).getLastName());
	}

	@Test
	@DisplayName("Record 4669: Company is American Iron And Metal Co Inc")
	void CompanyOfRecord4669() {
		assertEquals("American Iron And Metal Co Inc", customers.get(4668).getCompany());
	}

	@Test
	@DisplayName("Record 4669: Address is 60 Bailey Blvd")
	void AddressOfRecord4669() {
		assertEquals("60 Bailey Blvd", customers.get(4668).getAddress());
	}

	@Test
	@DisplayName("Record 4669: City is Haverhill")
	void CityOfRecord4669() {
		assertEquals("Haverhill", customers.get(4668).getCity());
	}

	@Test
	@DisplayName("Record 4669: County is Essex")
	void CountyOfRecord4669() {
		assertEquals("Essex", customers.get(4668).getCounty());
	}

	@Test
	@DisplayName("Record 4669: State is MA")
	void StateOfRecord4669() {
		assertEquals("MA", customers.get(4668).getState());
	}

	@Test
	@DisplayName("Record 4669: ZIP is 1830")
	void ZIPOfRecord4669() {
		assertEquals("1830", customers.get(4668).getZIP());
	}

	@Test
	@DisplayName("Record 4669: Phone is 978-373-5977")
	void PhoneOfRecord4669() {
		assertEquals("978-373-5977", customers.get(4668).getPhone());
	}

	@Test
	@DisplayName("Record 4669: Fax is 978-373-8934")
	void FaxOfRecord4669() {
		assertEquals("978-373-8934", customers.get(4668).getFax());
	}

	@Test
	@DisplayName("Record 4669: Email is chong@sheppard.com")
	void EmailOfRecord4669() {
		assertEquals("chong@sheppard.com", customers.get(4668).getEmail());
	}

	@Test
	@DisplayName("Record 4669: Web is http://www.chongsheppard.com")
	void WebOfRecord4669() {
		assertEquals("http://www.chongsheppard.com", customers.get(4668).getWeb());
	}
}
