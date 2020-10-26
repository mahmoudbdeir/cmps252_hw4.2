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

@Tag("29")
class Record_561 {

	private static List<Customer> customers;

	@BeforeAll
	public static void init() throws FileNotFoundException {
		customers = FileParser.getCustomers(Configuration.CSV_File);
	}

	@Test
	@DisplayName("Record 561: FirstName is Janette")
	void FirstNameOfRecord561() {
		assertEquals("Janette", customers.get(560).getFirstName());
	}

	@Test
	@DisplayName("Record 561: LastName is Giberson")
	void LastNameOfRecord561() {
		assertEquals("Giberson", customers.get(560).getLastName());
	}

	@Test
	@DisplayName("Record 561: Company is F A Davis Co")
	void CompanyOfRecord561() {
		assertEquals("F A Davis Co", customers.get(560).getCompany());
	}

	@Test
	@DisplayName("Record 561: Address is 9805 Harwin Dr  #-a")
	void AddressOfRecord561() {
		assertEquals("9805 Harwin Dr  #-a", customers.get(560).getAddress());
	}

	@Test
	@DisplayName("Record 561: City is Houston")
	void CityOfRecord561() {
		assertEquals("Houston", customers.get(560).getCity());
	}

	@Test
	@DisplayName("Record 561: County is Harris")
	void CountyOfRecord561() {
		assertEquals("Harris", customers.get(560).getCounty());
	}

	@Test
	@DisplayName("Record 561: State is TX")
	void StateOfRecord561() {
		assertEquals("TX", customers.get(560).getState());
	}

	@Test
	@DisplayName("Record 561: ZIP is 77036")
	void ZIPOfRecord561() {
		assertEquals("77036", customers.get(560).getZIP());
	}

	@Test
	@DisplayName("Record 561: Phone is 713-789-3548")
	void PhoneOfRecord561() {
		assertEquals("713-789-3548", customers.get(560).getPhone());
	}

	@Test
	@DisplayName("Record 561: Fax is 713-789-0228")
	void FaxOfRecord561() {
		assertEquals("713-789-0228", customers.get(560).getFax());
	}

	@Test
	@DisplayName("Record 561: Email is janette@giberson.com")
	void EmailOfRecord561() {
		assertEquals("janette@giberson.com", customers.get(560).getEmail());
	}

	@Test
	@DisplayName("Record 561: Web is http://www.janettegiberson.com")
	void WebOfRecord561() {
		assertEquals("http://www.janettegiberson.com", customers.get(560).getWeb());
	}
}
