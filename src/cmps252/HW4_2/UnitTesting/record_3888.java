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
class Record_3888 {

	private static List<Customer> customers;

	@BeforeAll
	public static void init() throws FileNotFoundException {
		customers = FileParser.getCustomers(Configuration.CSV_File);
	}

	@Test
	@DisplayName("Record 3888: FirstName is Guadalupe")
	void FirstNameOfRecord3888() {
		assertEquals("Guadalupe", customers.get(3887).getFirstName());
	}

	@Test
	@DisplayName("Record 3888: LastName is Espinoza")
	void LastNameOfRecord3888() {
		assertEquals("Espinoza", customers.get(3887).getLastName());
	}

	@Test
	@DisplayName("Record 3888: Company is J C Bennington Co")
	void CompanyOfRecord3888() {
		assertEquals("J C Bennington Co", customers.get(3887).getCompany());
	}

	@Test
	@DisplayName("Record 3888: Address is 1410 Forest Dr")
	void AddressOfRecord3888() {
		assertEquals("1410 Forest Dr", customers.get(3887).getAddress());
	}

	@Test
	@DisplayName("Record 3888: City is Annapolis")
	void CityOfRecord3888() {
		assertEquals("Annapolis", customers.get(3887).getCity());
	}

	@Test
	@DisplayName("Record 3888: County is Anne Arundel")
	void CountyOfRecord3888() {
		assertEquals("Anne Arundel", customers.get(3887).getCounty());
	}

	@Test
	@DisplayName("Record 3888: State is MD")
	void StateOfRecord3888() {
		assertEquals("MD", customers.get(3887).getState());
	}

	@Test
	@DisplayName("Record 3888: ZIP is 21403")
	void ZIPOfRecord3888() {
		assertEquals("21403", customers.get(3887).getZIP());
	}

	@Test
	@DisplayName("Record 3888: Phone is 410-269-7543")
	void PhoneOfRecord3888() {
		assertEquals("410-269-7543", customers.get(3887).getPhone());
	}

	@Test
	@DisplayName("Record 3888: Fax is 410-269-6311")
	void FaxOfRecord3888() {
		assertEquals("410-269-6311", customers.get(3887).getFax());
	}

	@Test
	@DisplayName("Record 3888: Email is guadalupe@espinoza.com")
	void EmailOfRecord3888() {
		assertEquals("guadalupe@espinoza.com", customers.get(3887).getEmail());
	}

	@Test
	@DisplayName("Record 3888: Web is http://www.guadalupeespinoza.com")
	void WebOfRecord3888() {
		assertEquals("http://www.guadalupeespinoza.com", customers.get(3887).getWeb());
	}
}
