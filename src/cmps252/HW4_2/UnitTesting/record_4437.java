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
class Record_4437 {

	private static List<Customer> customers;

	@BeforeAll
	public static void init() throws FileNotFoundException {
		customers = FileParser.getCustomers(Configuration.CSV_File);
	}

	@Test
	@DisplayName("Record 4437: FirstName is Frances")
	void FirstNameOfRecord4437() {
		assertEquals("Frances", customers.get(4436).getFirstName());
	}

	@Test
	@DisplayName("Record 4437: LastName is Gullage")
	void LastNameOfRecord4437() {
		assertEquals("Gullage", customers.get(4436).getLastName());
	}

	@Test
	@DisplayName("Record 4437: Company is Cbc Federal Credit Union")
	void CompanyOfRecord4437() {
		assertEquals("Cbc Federal Credit Union", customers.get(4436).getCompany());
	}

	@Test
	@DisplayName("Record 4437: Address is 1020 Pitney Rd")
	void AddressOfRecord4437() {
		assertEquals("1020 Pitney Rd", customers.get(4436).getAddress());
	}

	@Test
	@DisplayName("Record 4437: City is Absecon")
	void CityOfRecord4437() {
		assertEquals("Absecon", customers.get(4436).getCity());
	}

	@Test
	@DisplayName("Record 4437: County is Atlantic")
	void CountyOfRecord4437() {
		assertEquals("Atlantic", customers.get(4436).getCounty());
	}

	@Test
	@DisplayName("Record 4437: State is NJ")
	void StateOfRecord4437() {
		assertEquals("NJ", customers.get(4436).getState());
	}

	@Test
	@DisplayName("Record 4437: ZIP is 8201")
	void ZIPOfRecord4437() {
		assertEquals("8201", customers.get(4436).getZIP());
	}

	@Test
	@DisplayName("Record 4437: Phone is 609-646-2382")
	void PhoneOfRecord4437() {
		assertEquals("609-646-2382", customers.get(4436).getPhone());
	}

	@Test
	@DisplayName("Record 4437: Fax is 609-646-2858")
	void FaxOfRecord4437() {
		assertEquals("609-646-2858", customers.get(4436).getFax());
	}

	@Test
	@DisplayName("Record 4437: Email is frances@gullage.com")
	void EmailOfRecord4437() {
		assertEquals("frances@gullage.com", customers.get(4436).getEmail());
	}

	@Test
	@DisplayName("Record 4437: Web is http://www.francesgullage.com")
	void WebOfRecord4437() {
		assertEquals("http://www.francesgullage.com", customers.get(4436).getWeb());
	}
}
