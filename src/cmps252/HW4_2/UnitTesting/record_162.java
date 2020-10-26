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

@Tag("14")
class Record_162 {

	private static List<Customer> customers;

	@BeforeAll
	public static void init() throws FileNotFoundException {
		customers = FileParser.getCustomers(Configuration.CSV_File);
	}

	@Test
	@DisplayName("Record 162: FirstName is August")
	void FirstNameOfRecord162() {
		assertEquals("August", customers.get(161).getFirstName());
	}

	@Test
	@DisplayName("Record 162: LastName is Slack")
	void LastNameOfRecord162() {
		assertEquals("Slack", customers.get(161).getLastName());
	}

	@Test
	@DisplayName("Record 162: Company is Gullivers Travel")
	void CompanyOfRecord162() {
		assertEquals("Gullivers Travel", customers.get(161).getCompany());
	}

	@Test
	@DisplayName("Record 162: Address is 9170 Davenport St Ne")
	void AddressOfRecord162() {
		assertEquals("9170 Davenport St Ne", customers.get(161).getAddress());
	}

	@Test
	@DisplayName("Record 162: City is Minneapolis")
	void CityOfRecord162() {
		assertEquals("Minneapolis", customers.get(161).getCity());
	}

	@Test
	@DisplayName("Record 162: County is Anoka")
	void CountyOfRecord162() {
		assertEquals("Anoka", customers.get(161).getCounty());
	}

	@Test
	@DisplayName("Record 162: State is MN")
	void StateOfRecord162() {
		assertEquals("MN", customers.get(161).getState());
	}

	@Test
	@DisplayName("Record 162: ZIP is 55449")
	void ZIPOfRecord162() {
		assertEquals("55449", customers.get(161).getZIP());
	}

	@Test
	@DisplayName("Record 162: Phone is 763-786-5867")
	void PhoneOfRecord162() {
		assertEquals("763-786-5867", customers.get(161).getPhone());
	}

	@Test
	@DisplayName("Record 162: Fax is 763-786-5417")
	void FaxOfRecord162() {
		assertEquals("763-786-5417", customers.get(161).getFax());
	}

	@Test
	@DisplayName("Record 162: Email is august@slack.com")
	void EmailOfRecord162() {
		assertEquals("august@slack.com", customers.get(161).getEmail());
	}

	@Test
	@DisplayName("Record 162: Web is http://www.augustslack.com")
	void WebOfRecord162() {
		assertEquals("http://www.augustslack.com", customers.get(161).getWeb());
	}
}
