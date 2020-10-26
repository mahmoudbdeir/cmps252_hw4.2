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

@Tag("0")
class Record_3090 {

	private static List<Customer> customers;

	@BeforeAll
	public static void init() throws FileNotFoundException {
		customers = FileParser.getCustomers(Configuration.CSV_File);
	}

	@Test
	@DisplayName("Record 3090: FirstName is Marian")
	void FirstNameOfRecord3090() {
		assertEquals("Marian", customers.get(3089).getFirstName());
	}

	@Test
	@DisplayName("Record 3090: LastName is Bukhari")
	void LastNameOfRecord3090() {
		assertEquals("Bukhari", customers.get(3089).getLastName());
	}

	@Test
	@DisplayName("Record 3090: Company is Immgrtn Law Clnc Allan H Bell")
	void CompanyOfRecord3090() {
		assertEquals("Immgrtn Law Clnc Allan H Bell", customers.get(3089).getCompany());
	}

	@Test
	@DisplayName("Record 3090: Address is 3706 Us Highway 20w W")
	void AddressOfRecord3090() {
		assertEquals("3706 Us Highway 20w W", customers.get(3089).getAddress());
	}

	@Test
	@DisplayName("Record 3090: City is Monroeville")
	void CityOfRecord3090() {
		assertEquals("Monroeville", customers.get(3089).getCity());
	}

	@Test
	@DisplayName("Record 3090: County is Huron")
	void CountyOfRecord3090() {
		assertEquals("Huron", customers.get(3089).getCounty());
	}

	@Test
	@DisplayName("Record 3090: State is OH")
	void StateOfRecord3090() {
		assertEquals("OH", customers.get(3089).getState());
	}

	@Test
	@DisplayName("Record 3090: ZIP is 44847")
	void ZIPOfRecord3090() {
		assertEquals("44847", customers.get(3089).getZIP());
	}

	@Test
	@DisplayName("Record 3090: Phone is 419-465-6482")
	void PhoneOfRecord3090() {
		assertEquals("419-465-6482", customers.get(3089).getPhone());
	}

	@Test
	@DisplayName("Record 3090: Fax is 419-465-0726")
	void FaxOfRecord3090() {
		assertEquals("419-465-0726", customers.get(3089).getFax());
	}

	@Test
	@DisplayName("Record 3090: Email is marian@bukhari.com")
	void EmailOfRecord3090() {
		assertEquals("marian@bukhari.com", customers.get(3089).getEmail());
	}

	@Test
	@DisplayName("Record 3090: Web is http://www.marianbukhari.com")
	void WebOfRecord3090() {
		assertEquals("http://www.marianbukhari.com", customers.get(3089).getWeb());
	}
}
