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
class Record_4777 {

	private static List<Customer> customers;

	@BeforeAll
	public static void init() throws FileNotFoundException {
		customers = FileParser.getCustomers(Configuration.CSV_File);
	}

	@Test
	@DisplayName("Record 4777: FirstName is Wayne")
	void FirstNameOfRecord4777() {
		assertEquals("Wayne", customers.get(4776).getFirstName());
	}

	@Test
	@DisplayName("Record 4777: LastName is Allsbrooks")
	void LastNameOfRecord4777() {
		assertEquals("Allsbrooks", customers.get(4776).getLastName());
	}

	@Test
	@DisplayName("Record 4777: Company is Medway Cntry Mnr Skilled Nurse")
	void CompanyOfRecord4777() {
		assertEquals("Medway Cntry Mnr Skilled Nurse", customers.get(4776).getCompany());
	}

	@Test
	@DisplayName("Record 4777: Address is 15320 S Broadway St")
	void AddressOfRecord4777() {
		assertEquals("15320 S Broadway St", customers.get(4776).getAddress());
	}

	@Test
	@DisplayName("Record 4777: City is Gardena")
	void CityOfRecord4777() {
		assertEquals("Gardena", customers.get(4776).getCity());
	}

	@Test
	@DisplayName("Record 4777: County is Los Angeles")
	void CountyOfRecord4777() {
		assertEquals("Los Angeles", customers.get(4776).getCounty());
	}

	@Test
	@DisplayName("Record 4777: State is CA")
	void StateOfRecord4777() {
		assertEquals("CA", customers.get(4776).getState());
	}

	@Test
	@DisplayName("Record 4777: ZIP is 90248")
	void ZIPOfRecord4777() {
		assertEquals("90248", customers.get(4776).getZIP());
	}

	@Test
	@DisplayName("Record 4777: Phone is 310-329-4048")
	void PhoneOfRecord4777() {
		assertEquals("310-329-4048", customers.get(4776).getPhone());
	}

	@Test
	@DisplayName("Record 4777: Fax is 310-329-8338")
	void FaxOfRecord4777() {
		assertEquals("310-329-8338", customers.get(4776).getFax());
	}

	@Test
	@DisplayName("Record 4777: Email is wayne@allsbrooks.com")
	void EmailOfRecord4777() {
		assertEquals("wayne@allsbrooks.com", customers.get(4776).getEmail());
	}

	@Test
	@DisplayName("Record 4777: Web is http://www.wayneallsbrooks.com")
	void WebOfRecord4777() {
		assertEquals("http://www.wayneallsbrooks.com", customers.get(4776).getWeb());
	}
}
