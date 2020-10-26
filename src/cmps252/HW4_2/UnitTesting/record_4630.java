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

@Tag("2")
class Record_4630 {

	private static List<Customer> customers;

	@BeforeAll
	public static void init() throws FileNotFoundException {
		customers = FileParser.getCustomers(Configuration.CSV_File);
	}

	@Test
	@DisplayName("Record 4630: FirstName is Lynn")
	void FirstNameOfRecord4630() {
		assertEquals("Lynn", customers.get(4629).getFirstName());
	}

	@Test
	@DisplayName("Record 4630: LastName is Llopis")
	void LastNameOfRecord4630() {
		assertEquals("Llopis", customers.get(4629).getLastName());
	}

	@Test
	@DisplayName("Record 4630: Company is Tri K Industries Inc")
	void CompanyOfRecord4630() {
		assertEquals("Tri K Industries Inc", customers.get(4629).getCompany());
	}

	@Test
	@DisplayName("Record 4630: Address is 103 Monroe Rd")
	void AddressOfRecord4630() {
		assertEquals("103 Monroe Rd", customers.get(4629).getAddress());
	}

	@Test
	@DisplayName("Record 4630: City is Paragould")
	void CityOfRecord4630() {
		assertEquals("Paragould", customers.get(4629).getCity());
	}

	@Test
	@DisplayName("Record 4630: County is Greene")
	void CountyOfRecord4630() {
		assertEquals("Greene", customers.get(4629).getCounty());
	}

	@Test
	@DisplayName("Record 4630: State is AR")
	void StateOfRecord4630() {
		assertEquals("AR", customers.get(4629).getState());
	}

	@Test
	@DisplayName("Record 4630: ZIP is 72450")
	void ZIPOfRecord4630() {
		assertEquals("72450", customers.get(4629).getZIP());
	}

	@Test
	@DisplayName("Record 4630: Phone is 870-236-1701")
	void PhoneOfRecord4630() {
		assertEquals("870-236-1701", customers.get(4629).getPhone());
	}

	@Test
	@DisplayName("Record 4630: Fax is 870-236-6073")
	void FaxOfRecord4630() {
		assertEquals("870-236-6073", customers.get(4629).getFax());
	}

	@Test
	@DisplayName("Record 4630: Email is lynn@llopis.com")
	void EmailOfRecord4630() {
		assertEquals("lynn@llopis.com", customers.get(4629).getEmail());
	}

	@Test
	@DisplayName("Record 4630: Web is http://www.lynnllopis.com")
	void WebOfRecord4630() {
		assertEquals("http://www.lynnllopis.com", customers.get(4629).getWeb());
	}
}
