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

@Tag("48")
class Record_3210 {

	private static List<Customer> customers;

	@BeforeAll
	public static void init() throws FileNotFoundException {
		customers = FileParser.getCustomers(Configuration.CSV_File);
	}

	@Test
	@DisplayName("Record 3210: FirstName is Lori")
	void FirstNameOfRecord3210() {
		assertEquals("Lori", customers.get(3209).getFirstName());
	}

	@Test
	@DisplayName("Record 3210: LastName is Hermenau")
	void LastNameOfRecord3210() {
		assertEquals("Hermenau", customers.get(3209).getLastName());
	}

	@Test
	@DisplayName("Record 3210: Company is Smith, Scott L")
	void CompanyOfRecord3210() {
		assertEquals("Smith, Scott L", customers.get(3209).getCompany());
	}

	@Test
	@DisplayName("Record 3210: Address is 73 Newton Rd")
	void AddressOfRecord3210() {
		assertEquals("73 Newton Rd", customers.get(3209).getAddress());
	}

	@Test
	@DisplayName("Record 3210: City is Plaistow")
	void CityOfRecord3210() {
		assertEquals("Plaistow", customers.get(3209).getCity());
	}

	@Test
	@DisplayName("Record 3210: County is Rockingham")
	void CountyOfRecord3210() {
		assertEquals("Rockingham", customers.get(3209).getCounty());
	}

	@Test
	@DisplayName("Record 3210: State is NH")
	void StateOfRecord3210() {
		assertEquals("NH", customers.get(3209).getState());
	}

	@Test
	@DisplayName("Record 3210: ZIP is 3865")
	void ZIPOfRecord3210() {
		assertEquals("3865", customers.get(3209).getZIP());
	}

	@Test
	@DisplayName("Record 3210: Phone is 603-382-9071")
	void PhoneOfRecord3210() {
		assertEquals("603-382-9071", customers.get(3209).getPhone());
	}

	@Test
	@DisplayName("Record 3210: Fax is 603-382-8778")
	void FaxOfRecord3210() {
		assertEquals("603-382-8778", customers.get(3209).getFax());
	}

	@Test
	@DisplayName("Record 3210: Email is lori@hermenau.com")
	void EmailOfRecord3210() {
		assertEquals("lori@hermenau.com", customers.get(3209).getEmail());
	}

	@Test
	@DisplayName("Record 3210: Web is http://www.lorihermenau.com")
	void WebOfRecord3210() {
		assertEquals("http://www.lorihermenau.com", customers.get(3209).getWeb());
	}
}
