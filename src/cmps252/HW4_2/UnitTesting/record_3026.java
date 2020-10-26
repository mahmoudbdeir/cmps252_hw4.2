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

@Tag("13")
class Record_3026 {

	private static List<Customer> customers;

	@BeforeAll
	public static void init() throws FileNotFoundException {
		customers = FileParser.getCustomers(Configuration.CSV_File);
	}

	@Test
	@DisplayName("Record 3026: FirstName is Miles")
	void FirstNameOfRecord3026() {
		assertEquals("Miles", customers.get(3025).getFirstName());
	}

	@Test
	@DisplayName("Record 3026: LastName is Kjellsen")
	void LastNameOfRecord3026() {
		assertEquals("Kjellsen", customers.get(3025).getLastName());
	}

	@Test
	@DisplayName("Record 3026: Company is Little Professor Book Center")
	void CompanyOfRecord3026() {
		assertEquals("Little Professor Book Center", customers.get(3025).getCompany());
	}

	@Test
	@DisplayName("Record 3026: Address is 105 Flex Ave")
	void AddressOfRecord3026() {
		assertEquals("105 Flex Ave", customers.get(3025).getAddress());
	}

	@Test
	@DisplayName("Record 3026: City is Portland")
	void CityOfRecord3026() {
		assertEquals("Portland", customers.get(3025).getCity());
	}

	@Test
	@DisplayName("Record 3026: County is Sumner")
	void CountyOfRecord3026() {
		assertEquals("Sumner", customers.get(3025).getCounty());
	}

	@Test
	@DisplayName("Record 3026: State is TN")
	void StateOfRecord3026() {
		assertEquals("TN", customers.get(3025).getState());
	}

	@Test
	@DisplayName("Record 3026: ZIP is 37148")
	void ZIPOfRecord3026() {
		assertEquals("37148", customers.get(3025).getZIP());
	}

	@Test
	@DisplayName("Record 3026: Phone is 615-325-6836")
	void PhoneOfRecord3026() {
		assertEquals("615-325-6836", customers.get(3025).getPhone());
	}

	@Test
	@DisplayName("Record 3026: Fax is 615-325-2252")
	void FaxOfRecord3026() {
		assertEquals("615-325-2252", customers.get(3025).getFax());
	}

	@Test
	@DisplayName("Record 3026: Email is miles@kjellsen.com")
	void EmailOfRecord3026() {
		assertEquals("miles@kjellsen.com", customers.get(3025).getEmail());
	}

	@Test
	@DisplayName("Record 3026: Web is http://www.mileskjellsen.com")
	void WebOfRecord3026() {
		assertEquals("http://www.mileskjellsen.com", customers.get(3025).getWeb());
	}
}
