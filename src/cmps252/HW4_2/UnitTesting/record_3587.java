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

@Tag("32")
class Record_3587 {

	private static List<Customer> customers;

	@BeforeAll
	public static void init() throws FileNotFoundException {
		customers = FileParser.getCustomers(Configuration.CSV_File);
	}

	@Test
	@DisplayName("Record 3587: FirstName is Antoinette")
	void FirstNameOfRecord3587() {
		assertEquals("Antoinette", customers.get(3586).getFirstName());
	}

	@Test
	@DisplayName("Record 3587: LastName is Kuennen")
	void LastNameOfRecord3587() {
		assertEquals("Kuennen", customers.get(3586).getLastName());
	}

	@Test
	@DisplayName("Record 3587: Company is Abramson Church & Stave")
	void CompanyOfRecord3587() {
		assertEquals("Abramson Church & Stave", customers.get(3586).getCompany());
	}

	@Test
	@DisplayName("Record 3587: Address is 2024 Champlain St")
	void AddressOfRecord3587() {
		assertEquals("2024 Champlain St", customers.get(3586).getAddress());
	}

	@Test
	@DisplayName("Record 3587: City is Toledo")
	void CityOfRecord3587() {
		assertEquals("Toledo", customers.get(3586).getCity());
	}

	@Test
	@DisplayName("Record 3587: County is Lucas")
	void CountyOfRecord3587() {
		assertEquals("Lucas", customers.get(3586).getCounty());
	}

	@Test
	@DisplayName("Record 3587: State is OH")
	void StateOfRecord3587() {
		assertEquals("OH", customers.get(3586).getState());
	}

	@Test
	@DisplayName("Record 3587: ZIP is 43611")
	void ZIPOfRecord3587() {
		assertEquals("43611", customers.get(3586).getZIP());
	}

	@Test
	@DisplayName("Record 3587: Phone is 419-726-8814")
	void PhoneOfRecord3587() {
		assertEquals("419-726-8814", customers.get(3586).getPhone());
	}

	@Test
	@DisplayName("Record 3587: Fax is 419-726-2112")
	void FaxOfRecord3587() {
		assertEquals("419-726-2112", customers.get(3586).getFax());
	}

	@Test
	@DisplayName("Record 3587: Email is antoinette@kuennen.com")
	void EmailOfRecord3587() {
		assertEquals("antoinette@kuennen.com", customers.get(3586).getEmail());
	}

	@Test
	@DisplayName("Record 3587: Web is http://www.antoinettekuennen.com")
	void WebOfRecord3587() {
		assertEquals("http://www.antoinettekuennen.com", customers.get(3586).getWeb());
	}
}
