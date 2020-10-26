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

@Tag("23")
class Record_3356 {

	private static List<Customer> customers;

	@BeforeAll
	public static void init() throws FileNotFoundException {
		customers = FileParser.getCustomers(Configuration.CSV_File);
	}

	@Test
	@DisplayName("Record 3356: FirstName is Marissa")
	void FirstNameOfRecord3356() {
		assertEquals("Marissa", customers.get(3355).getFirstName());
	}

	@Test
	@DisplayName("Record 3356: LastName is Gist")
	void LastNameOfRecord3356() {
		assertEquals("Gist", customers.get(3355).getLastName());
	}

	@Test
	@DisplayName("Record 3356: Company is Congdon Machine Works")
	void CompanyOfRecord3356() {
		assertEquals("Congdon Machine Works", customers.get(3355).getCompany());
	}

	@Test
	@DisplayName("Record 3356: Address is 2222 Kalakaua Ave  #-700")
	void AddressOfRecord3356() {
		assertEquals("2222 Kalakaua Ave  #-700", customers.get(3355).getAddress());
	}

	@Test
	@DisplayName("Record 3356: City is Honolulu")
	void CityOfRecord3356() {
		assertEquals("Honolulu", customers.get(3355).getCity());
	}

	@Test
	@DisplayName("Record 3356: County is Honolulu")
	void CountyOfRecord3356() {
		assertEquals("Honolulu", customers.get(3355).getCounty());
	}

	@Test
	@DisplayName("Record 3356: State is HI")
	void StateOfRecord3356() {
		assertEquals("HI", customers.get(3355).getState());
	}

	@Test
	@DisplayName("Record 3356: ZIP is 96815")
	void ZIPOfRecord3356() {
		assertEquals("96815", customers.get(3355).getZIP());
	}

	@Test
	@DisplayName("Record 3356: Phone is 808-922-7936")
	void PhoneOfRecord3356() {
		assertEquals("808-922-7936", customers.get(3355).getPhone());
	}

	@Test
	@DisplayName("Record 3356: Fax is 808-922-4723")
	void FaxOfRecord3356() {
		assertEquals("808-922-4723", customers.get(3355).getFax());
	}

	@Test
	@DisplayName("Record 3356: Email is marissa@gist.com")
	void EmailOfRecord3356() {
		assertEquals("marissa@gist.com", customers.get(3355).getEmail());
	}

	@Test
	@DisplayName("Record 3356: Web is http://www.marissagist.com")
	void WebOfRecord3356() {
		assertEquals("http://www.marissagist.com", customers.get(3355).getWeb());
	}
}
