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

@Tag("19")
class Record_3722 {

	private static List<Customer> customers;

	@BeforeAll
	public static void init() throws FileNotFoundException {
		customers = FileParser.getCustomers(Configuration.CSV_File);
	}

	@Test
	@DisplayName("Record 3722: FirstName is Barton")
	void FirstNameOfRecord3722() {
		assertEquals("Barton", customers.get(3721).getFirstName());
	}

	@Test
	@DisplayName("Record 3722: LastName is Dake")
	void LastNameOfRecord3722() {
		assertEquals("Dake", customers.get(3721).getLastName());
	}

	@Test
	@DisplayName("Record 3722: Company is Plaza Signs")
	void CompanyOfRecord3722() {
		assertEquals("Plaza Signs", customers.get(3721).getCompany());
	}

	@Test
	@DisplayName("Record 3722: Address is 1160 State St")
	void AddressOfRecord3722() {
		assertEquals("1160 State St", customers.get(3721).getAddress());
	}

	@Test
	@DisplayName("Record 3722: City is Perth Amboy")
	void CityOfRecord3722() {
		assertEquals("Perth Amboy", customers.get(3721).getCity());
	}

	@Test
	@DisplayName("Record 3722: County is Middlesex")
	void CountyOfRecord3722() {
		assertEquals("Middlesex", customers.get(3721).getCounty());
	}

	@Test
	@DisplayName("Record 3722: State is NJ")
	void StateOfRecord3722() {
		assertEquals("NJ", customers.get(3721).getState());
	}

	@Test
	@DisplayName("Record 3722: ZIP is 8861")
	void ZIPOfRecord3722() {
		assertEquals("8861", customers.get(3721).getZIP());
	}

	@Test
	@DisplayName("Record 3722: Phone is 732-826-5057")
	void PhoneOfRecord3722() {
		assertEquals("732-826-5057", customers.get(3721).getPhone());
	}

	@Test
	@DisplayName("Record 3722: Fax is 732-826-6249")
	void FaxOfRecord3722() {
		assertEquals("732-826-6249", customers.get(3721).getFax());
	}

	@Test
	@DisplayName("Record 3722: Email is barton@dake.com")
	void EmailOfRecord3722() {
		assertEquals("barton@dake.com", customers.get(3721).getEmail());
	}

	@Test
	@DisplayName("Record 3722: Web is http://www.bartondake.com")
	void WebOfRecord3722() {
		assertEquals("http://www.bartondake.com", customers.get(3721).getWeb());
	}
}
