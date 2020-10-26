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

@Tag("9")
class Record_1153 {

	private static List<Customer> customers;

	@BeforeAll
	public static void init() throws FileNotFoundException {
		customers = FileParser.getCustomers(Configuration.CSV_File);
	}

	@Test
	@DisplayName("Record 1153: FirstName is Millicent")
	void FirstNameOfRecord1153() {
		assertEquals("Millicent", customers.get(1152).getFirstName());
	}

	@Test
	@DisplayName("Record 1153: LastName is Honyumptewa")
	void LastNameOfRecord1153() {
		assertEquals("Honyumptewa", customers.get(1152).getLastName());
	}

	@Test
	@DisplayName("Record 1153: Company is Fleck, Jeffrey B Esq")
	void CompanyOfRecord1153() {
		assertEquals("Fleck, Jeffrey B Esq", customers.get(1152).getCompany());
	}

	@Test
	@DisplayName("Record 1153: Address is 8050 N Port Washington Rd")
	void AddressOfRecord1153() {
		assertEquals("8050 N Port Washington Rd", customers.get(1152).getAddress());
	}

	@Test
	@DisplayName("Record 1153: City is Milwaukee")
	void CityOfRecord1153() {
		assertEquals("Milwaukee", customers.get(1152).getCity());
	}

	@Test
	@DisplayName("Record 1153: County is Milwaukee")
	void CountyOfRecord1153() {
		assertEquals("Milwaukee", customers.get(1152).getCounty());
	}

	@Test
	@DisplayName("Record 1153: State is WI")
	void StateOfRecord1153() {
		assertEquals("WI", customers.get(1152).getState());
	}

	@Test
	@DisplayName("Record 1153: ZIP is 53217")
	void ZIPOfRecord1153() {
		assertEquals("53217", customers.get(1152).getZIP());
	}

	@Test
	@DisplayName("Record 1153: Phone is 414-352-4385")
	void PhoneOfRecord1153() {
		assertEquals("414-352-4385", customers.get(1152).getPhone());
	}

	@Test
	@DisplayName("Record 1153: Fax is 414-352-0109")
	void FaxOfRecord1153() {
		assertEquals("414-352-0109", customers.get(1152).getFax());
	}

	@Test
	@DisplayName("Record 1153: Email is millicent@honyumptewa.com")
	void EmailOfRecord1153() {
		assertEquals("millicent@honyumptewa.com", customers.get(1152).getEmail());
	}

	@Test
	@DisplayName("Record 1153: Web is http://www.millicenthonyumptewa.com")
	void WebOfRecord1153() {
		assertEquals("http://www.millicenthonyumptewa.com", customers.get(1152).getWeb());
	}
}
