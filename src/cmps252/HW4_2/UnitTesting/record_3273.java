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

@Tag("47")
class Record_3273 {

	private static List<Customer> customers;

	@BeforeAll
	public static void init() throws FileNotFoundException {
		customers = FileParser.getCustomers(Configuration.CSV_File);
	}

	@Test
	@DisplayName("Record 3273: FirstName is Sadie")
	void FirstNameOfRecord3273() {
		assertEquals("Sadie", customers.get(3272).getFirstName());
	}

	@Test
	@DisplayName("Record 3273: LastName is Tabian")
	void LastNameOfRecord3273() {
		assertEquals("Tabian", customers.get(3272).getLastName());
	}

	@Test
	@DisplayName("Record 3273: Company is Staff One")
	void CompanyOfRecord3273() {
		assertEquals("Staff One", customers.get(3272).getCompany());
	}

	@Test
	@DisplayName("Record 3273: Address is 9208 Eden Ave")
	void AddressOfRecord3273() {
		assertEquals("9208 Eden Ave", customers.get(3272).getAddress());
	}

	@Test
	@DisplayName("Record 3273: City is Hudson")
	void CityOfRecord3273() {
		assertEquals("Hudson", customers.get(3272).getCity());
	}

	@Test
	@DisplayName("Record 3273: County is Pasco")
	void CountyOfRecord3273() {
		assertEquals("Pasco", customers.get(3272).getCounty());
	}

	@Test
	@DisplayName("Record 3273: State is FL")
	void StateOfRecord3273() {
		assertEquals("FL", customers.get(3272).getState());
	}

	@Test
	@DisplayName("Record 3273: ZIP is 34667")
	void ZIPOfRecord3273() {
		assertEquals("34667", customers.get(3272).getZIP());
	}

	@Test
	@DisplayName("Record 3273: Phone is 727-863-8409")
	void PhoneOfRecord3273() {
		assertEquals("727-863-8409", customers.get(3272).getPhone());
	}

	@Test
	@DisplayName("Record 3273: Fax is 727-863-5819")
	void FaxOfRecord3273() {
		assertEquals("727-863-5819", customers.get(3272).getFax());
	}

	@Test
	@DisplayName("Record 3273: Email is sadie@tabian.com")
	void EmailOfRecord3273() {
		assertEquals("sadie@tabian.com", customers.get(3272).getEmail());
	}

	@Test
	@DisplayName("Record 3273: Web is http://www.sadietabian.com")
	void WebOfRecord3273() {
		assertEquals("http://www.sadietabian.com", customers.get(3272).getWeb());
	}
}
