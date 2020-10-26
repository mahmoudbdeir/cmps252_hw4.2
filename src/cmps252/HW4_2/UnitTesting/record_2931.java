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

@Tag("35")
class Record_2931 {

	private static List<Customer> customers;

	@BeforeAll
	public static void init() throws FileNotFoundException {
		customers = FileParser.getCustomers(Configuration.CSV_File);
	}

	@Test
	@DisplayName("Record 2931: FirstName is Maxwell")
	void FirstNameOfRecord2931() {
		assertEquals("Maxwell", customers.get(2930).getFirstName());
	}

	@Test
	@DisplayName("Record 2931: LastName is Ponzo")
	void LastNameOfRecord2931() {
		assertEquals("Ponzo", customers.get(2930).getLastName());
	}

	@Test
	@DisplayName("Record 2931: Company is Ilonaco Inc")
	void CompanyOfRecord2931() {
		assertEquals("Ilonaco Inc", customers.get(2930).getCompany());
	}

	@Test
	@DisplayName("Record 2931: Address is 981247 Kaahumanu St  #-115")
	void AddressOfRecord2931() {
		assertEquals("981247 Kaahumanu St  #-115", customers.get(2930).getAddress());
	}

	@Test
	@DisplayName("Record 2931: City is Aiea")
	void CityOfRecord2931() {
		assertEquals("Aiea", customers.get(2930).getCity());
	}

	@Test
	@DisplayName("Record 2931: County is Honolulu")
	void CountyOfRecord2931() {
		assertEquals("Honolulu", customers.get(2930).getCounty());
	}

	@Test
	@DisplayName("Record 2931: State is HI")
	void StateOfRecord2931() {
		assertEquals("HI", customers.get(2930).getState());
	}

	@Test
	@DisplayName("Record 2931: ZIP is 96701")
	void ZIPOfRecord2931() {
		assertEquals("96701", customers.get(2930).getZIP());
	}

	@Test
	@DisplayName("Record 2931: Phone is 808-487-6654")
	void PhoneOfRecord2931() {
		assertEquals("808-487-6654", customers.get(2930).getPhone());
	}

	@Test
	@DisplayName("Record 2931: Fax is 808-487-6402")
	void FaxOfRecord2931() {
		assertEquals("808-487-6402", customers.get(2930).getFax());
	}

	@Test
	@DisplayName("Record 2931: Email is maxwell@ponzo.com")
	void EmailOfRecord2931() {
		assertEquals("maxwell@ponzo.com", customers.get(2930).getEmail());
	}

	@Test
	@DisplayName("Record 2931: Web is http://www.maxwellponzo.com")
	void WebOfRecord2931() {
		assertEquals("http://www.maxwellponzo.com", customers.get(2930).getWeb());
	}
}
