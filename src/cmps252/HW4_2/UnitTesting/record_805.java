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

@Tag("11")
class Record_805 {

	private static List<Customer> customers;

	@BeforeAll
	public static void init() throws FileNotFoundException {
		customers = FileParser.getCustomers(Configuration.CSV_File);
	}

	@Test
	@DisplayName("Record 805: FirstName is Brenton")
	void FirstNameOfRecord805() {
		assertEquals("Brenton", customers.get(804).getFirstName());
	}

	@Test
	@DisplayName("Record 805: LastName is Pedone")
	void LastNameOfRecord805() {
		assertEquals("Pedone", customers.get(804).getLastName());
	}

	@Test
	@DisplayName("Record 805: Company is Laster, Alan M Esq")
	void CompanyOfRecord805() {
		assertEquals("Laster, Alan M Esq", customers.get(804).getCompany());
	}

	@Test
	@DisplayName("Record 805: Address is 106 Hoyt Ave")
	void AddressOfRecord805() {
		assertEquals("106 Hoyt Ave", customers.get(804).getAddress());
	}

	@Test
	@DisplayName("Record 805: City is Saginaw")
	void CityOfRecord805() {
		assertEquals("Saginaw", customers.get(804).getCity());
	}

	@Test
	@DisplayName("Record 805: County is Saginaw")
	void CountyOfRecord805() {
		assertEquals("Saginaw", customers.get(804).getCounty());
	}

	@Test
	@DisplayName("Record 805: State is MI")
	void StateOfRecord805() {
		assertEquals("MI", customers.get(804).getState());
	}

	@Test
	@DisplayName("Record 805: ZIP is 48607")
	void ZIPOfRecord805() {
		assertEquals("48607", customers.get(804).getZIP());
	}

	@Test
	@DisplayName("Record 805: Phone is 989-754-4360")
	void PhoneOfRecord805() {
		assertEquals("989-754-4360", customers.get(804).getPhone());
	}

	@Test
	@DisplayName("Record 805: Fax is 989-754-9748")
	void FaxOfRecord805() {
		assertEquals("989-754-9748", customers.get(804).getFax());
	}

	@Test
	@DisplayName("Record 805: Email is brenton@pedone.com")
	void EmailOfRecord805() {
		assertEquals("brenton@pedone.com", customers.get(804).getEmail());
	}

	@Test
	@DisplayName("Record 805: Web is http://www.brentonpedone.com")
	void WebOfRecord805() {
		assertEquals("http://www.brentonpedone.com", customers.get(804).getWeb());
	}
}
