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

@Tag("38")
class Record_1965 {

	private static List<Customer> customers;

	@BeforeAll
	public static void init() throws FileNotFoundException {
		customers = FileParser.getCustomers(Configuration.CSV_File);
	}

	@Test
	@DisplayName("Record 1965: FirstName is Chester")
	void FirstNameOfRecord1965() {
		assertEquals("Chester", customers.get(1964).getFirstName());
	}

	@Test
	@DisplayName("Record 1965: LastName is Miska")
	void LastNameOfRecord1965() {
		assertEquals("Miska", customers.get(1964).getLastName());
	}

	@Test
	@DisplayName("Record 1965: Company is Jrd Development")
	void CompanyOfRecord1965() {
		assertEquals("Jrd Development", customers.get(1964).getCompany());
	}

	@Test
	@DisplayName("Record 1965: Address is 624 Boul")
	void AddressOfRecord1965() {
		assertEquals("624 Boul", customers.get(1964).getAddress());
	}

	@Test
	@DisplayName("Record 1965: City is Kenilworth")
	void CityOfRecord1965() {
		assertEquals("Kenilworth", customers.get(1964).getCity());
	}

	@Test
	@DisplayName("Record 1965: County is Union")
	void CountyOfRecord1965() {
		assertEquals("Union", customers.get(1964).getCounty());
	}

	@Test
	@DisplayName("Record 1965: State is NJ")
	void StateOfRecord1965() {
		assertEquals("NJ", customers.get(1964).getState());
	}

	@Test
	@DisplayName("Record 1965: ZIP is 7033")
	void ZIPOfRecord1965() {
		assertEquals("7033", customers.get(1964).getZIP());
	}

	@Test
	@DisplayName("Record 1965: Phone is 908-276-9119")
	void PhoneOfRecord1965() {
		assertEquals("908-276-9119", customers.get(1964).getPhone());
	}

	@Test
	@DisplayName("Record 1965: Fax is 908-276-2615")
	void FaxOfRecord1965() {
		assertEquals("908-276-2615", customers.get(1964).getFax());
	}

	@Test
	@DisplayName("Record 1965: Email is chester@miska.com")
	void EmailOfRecord1965() {
		assertEquals("chester@miska.com", customers.get(1964).getEmail());
	}

	@Test
	@DisplayName("Record 1965: Web is http://www.chestermiska.com")
	void WebOfRecord1965() {
		assertEquals("http://www.chestermiska.com", customers.get(1964).getWeb());
	}
}
