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

@Tag("36")
class Record_3259 {

	private static List<Customer> customers;

	@BeforeAll
	public static void init() throws FileNotFoundException {
		customers = FileParser.getCustomers(Configuration.CSV_File);
	}

	@Test
	@DisplayName("Record 3259: FirstName is Wyatt")
	void FirstNameOfRecord3259() {
		assertEquals("Wyatt", customers.get(3258).getFirstName());
	}

	@Test
	@DisplayName("Record 3259: LastName is Tada")
	void LastNameOfRecord3259() {
		assertEquals("Tada", customers.get(3258).getLastName());
	}

	@Test
	@DisplayName("Record 3259: Company is D P Associates")
	void CompanyOfRecord3259() {
		assertEquals("D P Associates", customers.get(3258).getCompany());
	}

	@Test
	@DisplayName("Record 3259: Address is 15 A Aven")
	void AddressOfRecord3259() {
		assertEquals("15 A Aven", customers.get(3258).getAddress());
	}

	@Test
	@DisplayName("Record 3259: City is New York")
	void CityOfRecord3259() {
		assertEquals("New York", customers.get(3258).getCity());
	}

	@Test
	@DisplayName("Record 3259: County is New York")
	void CountyOfRecord3259() {
		assertEquals("New York", customers.get(3258).getCounty());
	}

	@Test
	@DisplayName("Record 3259: State is NY")
	void StateOfRecord3259() {
		assertEquals("NY", customers.get(3258).getState());
	}

	@Test
	@DisplayName("Record 3259: ZIP is 10009")
	void ZIPOfRecord3259() {
		assertEquals("10009", customers.get(3258).getZIP());
	}

	@Test
	@DisplayName("Record 3259: Phone is 212-473-3952")
	void PhoneOfRecord3259() {
		assertEquals("212-473-3952", customers.get(3258).getPhone());
	}

	@Test
	@DisplayName("Record 3259: Fax is 212-473-0865")
	void FaxOfRecord3259() {
		assertEquals("212-473-0865", customers.get(3258).getFax());
	}

	@Test
	@DisplayName("Record 3259: Email is wyatt@tada.com")
	void EmailOfRecord3259() {
		assertEquals("wyatt@tada.com", customers.get(3258).getEmail());
	}

	@Test
	@DisplayName("Record 3259: Web is http://www.wyatttada.com")
	void WebOfRecord3259() {
		assertEquals("http://www.wyatttada.com", customers.get(3258).getWeb());
	}
}
