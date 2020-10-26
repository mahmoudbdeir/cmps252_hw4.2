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

@Tag("25")
class Record_303 {

	private static List<Customer> customers;

	@BeforeAll
	public static void init() throws FileNotFoundException {
		customers = FileParser.getCustomers(Configuration.CSV_File);
	}

	@Test
	@DisplayName("Record 303: FirstName is Ollie")
	void FirstNameOfRecord303() {
		assertEquals("Ollie", customers.get(302).getFirstName());
	}

	@Test
	@DisplayName("Record 303: LastName is Ausley")
	void LastNameOfRecord303() {
		assertEquals("Ausley", customers.get(302).getLastName());
	}

	@Test
	@DisplayName("Record 303: Company is Mail Boxes Etc")
	void CompanyOfRecord303() {
		assertEquals("Mail Boxes Etc", customers.get(302).getCompany());
	}

	@Test
	@DisplayName("Record 303: Address is 5344 Jackman Rd")
	void AddressOfRecord303() {
		assertEquals("5344 Jackman Rd", customers.get(302).getAddress());
	}

	@Test
	@DisplayName("Record 303: City is Toledo")
	void CityOfRecord303() {
		assertEquals("Toledo", customers.get(302).getCity());
	}

	@Test
	@DisplayName("Record 303: County is Lucas")
	void CountyOfRecord303() {
		assertEquals("Lucas", customers.get(302).getCounty());
	}

	@Test
	@DisplayName("Record 303: State is OH")
	void StateOfRecord303() {
		assertEquals("OH", customers.get(302).getState());
	}

	@Test
	@DisplayName("Record 303: ZIP is 43613")
	void ZIPOfRecord303() {
		assertEquals("43613", customers.get(302).getZIP());
	}

	@Test
	@DisplayName("Record 303: Phone is 419-476-8153")
	void PhoneOfRecord303() {
		assertEquals("419-476-8153", customers.get(302).getPhone());
	}

	@Test
	@DisplayName("Record 303: Fax is 419-476-8689")
	void FaxOfRecord303() {
		assertEquals("419-476-8689", customers.get(302).getFax());
	}

	@Test
	@DisplayName("Record 303: Email is ollie@ausley.com")
	void EmailOfRecord303() {
		assertEquals("ollie@ausley.com", customers.get(302).getEmail());
	}

	@Test
	@DisplayName("Record 303: Web is http://www.ollieausley.com")
	void WebOfRecord303() {
		assertEquals("http://www.ollieausley.com", customers.get(302).getWeb());
	}
}
