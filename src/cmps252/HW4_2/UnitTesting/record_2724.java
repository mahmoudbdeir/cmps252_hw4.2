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

@Tag("1")
class Record_2724 {

	private static List<Customer> customers;

	@BeforeAll
	public static void init() throws FileNotFoundException {
		customers = FileParser.getCustomers(Configuration.CSV_File);
	}

	@Test
	@DisplayName("Record 2724: FirstName is Antonia")
	void FirstNameOfRecord2724() {
		assertEquals("Antonia", customers.get(2723).getFirstName());
	}

	@Test
	@DisplayName("Record 2724: LastName is Heart")
	void LastNameOfRecord2724() {
		assertEquals("Heart", customers.get(2723).getLastName());
	}

	@Test
	@DisplayName("Record 2724: Company is Maryland Tool & Die Co")
	void CompanyOfRecord2724() {
		assertEquals("Maryland Tool & Die Co", customers.get(2723).getCompany());
	}

	@Test
	@DisplayName("Record 2724: Address is 19 W 44th")
	void AddressOfRecord2724() {
		assertEquals("19 W 44th", customers.get(2723).getAddress());
	}

	@Test
	@DisplayName("Record 2724: City is New York")
	void CityOfRecord2724() {
		assertEquals("New York", customers.get(2723).getCity());
	}

	@Test
	@DisplayName("Record 2724: County is New York")
	void CountyOfRecord2724() {
		assertEquals("New York", customers.get(2723).getCounty());
	}

	@Test
	@DisplayName("Record 2724: State is NY")
	void StateOfRecord2724() {
		assertEquals("NY", customers.get(2723).getState());
	}

	@Test
	@DisplayName("Record 2724: ZIP is 10036")
	void ZIPOfRecord2724() {
		assertEquals("10036", customers.get(2723).getZIP());
	}

	@Test
	@DisplayName("Record 2724: Phone is 212-354-4052")
	void PhoneOfRecord2724() {
		assertEquals("212-354-4052", customers.get(2723).getPhone());
	}

	@Test
	@DisplayName("Record 2724: Fax is 212-354-8292")
	void FaxOfRecord2724() {
		assertEquals("212-354-8292", customers.get(2723).getFax());
	}

	@Test
	@DisplayName("Record 2724: Email is antonia@heart.com")
	void EmailOfRecord2724() {
		assertEquals("antonia@heart.com", customers.get(2723).getEmail());
	}

	@Test
	@DisplayName("Record 2724: Web is http://www.antoniaheart.com")
	void WebOfRecord2724() {
		assertEquals("http://www.antoniaheart.com", customers.get(2723).getWeb());
	}
}
