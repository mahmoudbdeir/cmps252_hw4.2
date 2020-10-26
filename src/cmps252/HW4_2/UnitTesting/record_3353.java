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

@Tag("46")
class Record_3353 {

	private static List<Customer> customers;

	@BeforeAll
	public static void init() throws FileNotFoundException {
		customers = FileParser.getCustomers(Configuration.CSV_File);
	}

	@Test
	@DisplayName("Record 3353: FirstName is Fredrick")
	void FirstNameOfRecord3353() {
		assertEquals("Fredrick", customers.get(3352).getFirstName());
	}

	@Test
	@DisplayName("Record 3353: LastName is Pace")
	void LastNameOfRecord3353() {
		assertEquals("Pace", customers.get(3352).getLastName());
	}

	@Test
	@DisplayName("Record 3353: Company is Sorrell Anderson Lehrman")
	void CompanyOfRecord3353() {
		assertEquals("Sorrell Anderson Lehrman", customers.get(3352).getCompany());
	}

	@Test
	@DisplayName("Record 3353: Address is 1233 Commonwealth Blvd")
	void AddressOfRecord3353() {
		assertEquals("1233 Commonwealth Blvd", customers.get(3352).getAddress());
	}

	@Test
	@DisplayName("Record 3353: City is Toms River")
	void CityOfRecord3353() {
		assertEquals("Toms River", customers.get(3352).getCity());
	}

	@Test
	@DisplayName("Record 3353: County is Ocean")
	void CountyOfRecord3353() {
		assertEquals("Ocean", customers.get(3352).getCounty());
	}

	@Test
	@DisplayName("Record 3353: State is NJ")
	void StateOfRecord3353() {
		assertEquals("NJ", customers.get(3352).getState());
	}

	@Test
	@DisplayName("Record 3353: ZIP is 8757")
	void ZIPOfRecord3353() {
		assertEquals("8757", customers.get(3352).getZIP());
	}

	@Test
	@DisplayName("Record 3353: Phone is 732-914-7494")
	void PhoneOfRecord3353() {
		assertEquals("732-914-7494", customers.get(3352).getPhone());
	}

	@Test
	@DisplayName("Record 3353: Fax is 732-914-7186")
	void FaxOfRecord3353() {
		assertEquals("732-914-7186", customers.get(3352).getFax());
	}

	@Test
	@DisplayName("Record 3353: Email is fredrick@pace.com")
	void EmailOfRecord3353() {
		assertEquals("fredrick@pace.com", customers.get(3352).getEmail());
	}

	@Test
	@DisplayName("Record 3353: Web is http://www.fredrickpace.com")
	void WebOfRecord3353() {
		assertEquals("http://www.fredrickpace.com", customers.get(3352).getWeb());
	}
}
