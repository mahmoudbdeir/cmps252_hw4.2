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

@Tag("8")
class Record_231 {

	private static List<Customer> customers;

	@BeforeAll
	public static void init() throws FileNotFoundException {
		customers = FileParser.getCustomers(Configuration.CSV_File);
	}

	@Test
	@DisplayName("Record 231: FirstName is Annie")
	void FirstNameOfRecord231() {
		assertEquals("Annie", customers.get(230).getFirstName());
	}

	@Test
	@DisplayName("Record 231: LastName is Kamrath")
	void LastNameOfRecord231() {
		assertEquals("Kamrath", customers.get(230).getLastName());
	}

	@Test
	@DisplayName("Record 231: Company is State St Rsrch Invstmnt Svc")
	void CompanyOfRecord231() {
		assertEquals("State St Rsrch Invstmnt Svc", customers.get(230).getCompany());
	}

	@Test
	@DisplayName("Record 231: Address is 3001 W Cornelia Ave")
	void AddressOfRecord231() {
		assertEquals("3001 W Cornelia Ave", customers.get(230).getAddress());
	}

	@Test
	@DisplayName("Record 231: City is Chicago")
	void CityOfRecord231() {
		assertEquals("Chicago", customers.get(230).getCity());
	}

	@Test
	@DisplayName("Record 231: County is Cook")
	void CountyOfRecord231() {
		assertEquals("Cook", customers.get(230).getCounty());
	}

	@Test
	@DisplayName("Record 231: State is IL")
	void StateOfRecord231() {
		assertEquals("IL", customers.get(230).getState());
	}

	@Test
	@DisplayName("Record 231: ZIP is 60618")
	void ZIPOfRecord231() {
		assertEquals("60618", customers.get(230).getZIP());
	}

	@Test
	@DisplayName("Record 231: Phone is 773-267-8256")
	void PhoneOfRecord231() {
		assertEquals("773-267-8256", customers.get(230).getPhone());
	}

	@Test
	@DisplayName("Record 231: Fax is 773-267-9481")
	void FaxOfRecord231() {
		assertEquals("773-267-9481", customers.get(230).getFax());
	}

	@Test
	@DisplayName("Record 231: Email is annie@kamrath.com")
	void EmailOfRecord231() {
		assertEquals("annie@kamrath.com", customers.get(230).getEmail());
	}

	@Test
	@DisplayName("Record 231: Web is http://www.anniekamrath.com")
	void WebOfRecord231() {
		assertEquals("http://www.anniekamrath.com", customers.get(230).getWeb());
	}
}
