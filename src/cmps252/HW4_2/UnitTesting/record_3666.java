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

@Tag("34")
class Record_3666 {

	private static List<Customer> customers;

	@BeforeAll
	public static void init() throws FileNotFoundException {
		customers = FileParser.getCustomers(Configuration.CSV_File);
	}

	@Test
	@DisplayName("Record 3666: FirstName is Michaela")
	void FirstNameOfRecord3666() {
		assertEquals("Michaela", customers.get(3665).getFirstName());
	}

	@Test
	@DisplayName("Record 3666: LastName is Corazza")
	void LastNameOfRecord3666() {
		assertEquals("Corazza", customers.get(3665).getLastName());
	}

	@Test
	@DisplayName("Record 3666: Company is Daniel R Barrett")
	void CompanyOfRecord3666() {
		assertEquals("Daniel R Barrett", customers.get(3665).getCompany());
	}

	@Test
	@DisplayName("Record 3666: Address is 22 Journal Sq  #-3")
	void AddressOfRecord3666() {
		assertEquals("22 Journal Sq  #-3", customers.get(3665).getAddress());
	}

	@Test
	@DisplayName("Record 3666: City is Jersey City")
	void CityOfRecord3666() {
		assertEquals("Jersey City", customers.get(3665).getCity());
	}

	@Test
	@DisplayName("Record 3666: County is Hudson")
	void CountyOfRecord3666() {
		assertEquals("Hudson", customers.get(3665).getCounty());
	}

	@Test
	@DisplayName("Record 3666: State is NJ")
	void StateOfRecord3666() {
		assertEquals("NJ", customers.get(3665).getState());
	}

	@Test
	@DisplayName("Record 3666: ZIP is 7306")
	void ZIPOfRecord3666() {
		assertEquals("7306", customers.get(3665).getZIP());
	}

	@Test
	@DisplayName("Record 3666: Phone is 201-222-5159")
	void PhoneOfRecord3666() {
		assertEquals("201-222-5159", customers.get(3665).getPhone());
	}

	@Test
	@DisplayName("Record 3666: Fax is 201-222-9386")
	void FaxOfRecord3666() {
		assertEquals("201-222-9386", customers.get(3665).getFax());
	}

	@Test
	@DisplayName("Record 3666: Email is michaela@corazza.com")
	void EmailOfRecord3666() {
		assertEquals("michaela@corazza.com", customers.get(3665).getEmail());
	}

	@Test
	@DisplayName("Record 3666: Web is http://www.michaelacorazza.com")
	void WebOfRecord3666() {
		assertEquals("http://www.michaelacorazza.com", customers.get(3665).getWeb());
	}
}
