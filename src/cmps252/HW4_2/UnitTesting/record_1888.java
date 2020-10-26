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
class Record_1888 {

	private static List<Customer> customers;

	@BeforeAll
	public static void init() throws FileNotFoundException {
		customers = FileParser.getCustomers(Configuration.CSV_File);
	}

	@Test
	@DisplayName("Record 1888: FirstName is Myles")
	void FirstNameOfRecord1888() {
		assertEquals("Myles", customers.get(1887).getFirstName());
	}

	@Test
	@DisplayName("Record 1888: LastName is Huggins")
	void LastNameOfRecord1888() {
		assertEquals("Huggins", customers.get(1887).getLastName());
	}

	@Test
	@DisplayName("Record 1888: Company is Pl Publications")
	void CompanyOfRecord1888() {
		assertEquals("Pl Publications", customers.get(1887).getCompany());
	}

	@Test
	@DisplayName("Record 1888: Address is 15 Tucks Rd")
	void AddressOfRecord1888() {
		assertEquals("15 Tucks Rd", customers.get(1887).getAddress());
	}

	@Test
	@DisplayName("Record 1888: City is Brookfield")
	void CityOfRecord1888() {
		assertEquals("Brookfield", customers.get(1887).getCity());
	}

	@Test
	@DisplayName("Record 1888: County is Fairfield")
	void CountyOfRecord1888() {
		assertEquals("Fairfield", customers.get(1887).getCounty());
	}

	@Test
	@DisplayName("Record 1888: State is CT")
	void StateOfRecord1888() {
		assertEquals("CT", customers.get(1887).getState());
	}

	@Test
	@DisplayName("Record 1888: ZIP is 6804")
	void ZIPOfRecord1888() {
		assertEquals("6804", customers.get(1887).getZIP());
	}

	@Test
	@DisplayName("Record 1888: Phone is 203-775-2571")
	void PhoneOfRecord1888() {
		assertEquals("203-775-2571", customers.get(1887).getPhone());
	}

	@Test
	@DisplayName("Record 1888: Fax is 203-775-2159")
	void FaxOfRecord1888() {
		assertEquals("203-775-2159", customers.get(1887).getFax());
	}

	@Test
	@DisplayName("Record 1888: Email is myles@huggins.com")
	void EmailOfRecord1888() {
		assertEquals("myles@huggins.com", customers.get(1887).getEmail());
	}

	@Test
	@DisplayName("Record 1888: Web is http://www.myleshuggins.com")
	void WebOfRecord1888() {
		assertEquals("http://www.myleshuggins.com", customers.get(1887).getWeb());
	}
}
