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
class Record_2631 {

	private static List<Customer> customers;

	@BeforeAll
	public static void init() throws FileNotFoundException {
		customers = FileParser.getCustomers(Configuration.CSV_File);
	}

	@Test
	@DisplayName("Record 2631: FirstName is Teddy")
	void FirstNameOfRecord2631() {
		assertEquals("Teddy", customers.get(2630).getFirstName());
	}

	@Test
	@DisplayName("Record 2631: LastName is Borglum")
	void LastNameOfRecord2631() {
		assertEquals("Borglum", customers.get(2630).getLastName());
	}

	@Test
	@DisplayName("Record 2631: Company is Roberson, M Richbourg Esq")
	void CompanyOfRecord2631() {
		assertEquals("Roberson, M Richbourg Esq", customers.get(2630).getCompany());
	}

	@Test
	@DisplayName("Record 2631: Address is 45618 Kamehameha Hwy")
	void AddressOfRecord2631() {
		assertEquals("45618 Kamehameha Hwy", customers.get(2630).getAddress());
	}

	@Test
	@DisplayName("Record 2631: City is Kaneohe")
	void CityOfRecord2631() {
		assertEquals("Kaneohe", customers.get(2630).getCity());
	}

	@Test
	@DisplayName("Record 2631: County is Honolulu")
	void CountyOfRecord2631() {
		assertEquals("Honolulu", customers.get(2630).getCounty());
	}

	@Test
	@DisplayName("Record 2631: State is HI")
	void StateOfRecord2631() {
		assertEquals("HI", customers.get(2630).getState());
	}

	@Test
	@DisplayName("Record 2631: ZIP is 96744")
	void ZIPOfRecord2631() {
		assertEquals("96744", customers.get(2630).getZIP());
	}

	@Test
	@DisplayName("Record 2631: Phone is 808-247-4773")
	void PhoneOfRecord2631() {
		assertEquals("808-247-4773", customers.get(2630).getPhone());
	}

	@Test
	@DisplayName("Record 2631: Fax is 808-247-2913")
	void FaxOfRecord2631() {
		assertEquals("808-247-2913", customers.get(2630).getFax());
	}

	@Test
	@DisplayName("Record 2631: Email is teddy@borglum.com")
	void EmailOfRecord2631() {
		assertEquals("teddy@borglum.com", customers.get(2630).getEmail());
	}

	@Test
	@DisplayName("Record 2631: Web is http://www.teddyborglum.com")
	void WebOfRecord2631() {
		assertEquals("http://www.teddyborglum.com", customers.get(2630).getWeb());
	}
}
