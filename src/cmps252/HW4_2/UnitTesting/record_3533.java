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

@Tag("18")
class Record_3533 {

	private static List<Customer> customers;

	@BeforeAll
	public static void init() throws FileNotFoundException {
		customers = FileParser.getCustomers(Configuration.CSV_File);
	}

	@Test
	@DisplayName("Record 3533: FirstName is Erma")
	void FirstNameOfRecord3533() {
		assertEquals("Erma", customers.get(3532).getFirstName());
	}

	@Test
	@DisplayName("Record 3533: LastName is Buttler")
	void LastNameOfRecord3533() {
		assertEquals("Buttler", customers.get(3532).getLastName());
	}

	@Test
	@DisplayName("Record 3533: Company is Southland Container Inc Of Md")
	void CompanyOfRecord3533() {
		assertEquals("Southland Container Inc Of Md", customers.get(3532).getCompany());
	}

	@Test
	@DisplayName("Record 3533: Address is 1336 2nd Ave")
	void AddressOfRecord3533() {
		assertEquals("1336 2nd Ave", customers.get(3532).getAddress());
	}

	@Test
	@DisplayName("Record 3533: City is New York")
	void CityOfRecord3533() {
		assertEquals("New York", customers.get(3532).getCity());
	}

	@Test
	@DisplayName("Record 3533: County is New York")
	void CountyOfRecord3533() {
		assertEquals("New York", customers.get(3532).getCounty());
	}

	@Test
	@DisplayName("Record 3533: State is NY")
	void StateOfRecord3533() {
		assertEquals("NY", customers.get(3532).getState());
	}

	@Test
	@DisplayName("Record 3533: ZIP is 10021")
	void ZIPOfRecord3533() {
		assertEquals("10021", customers.get(3532).getZIP());
	}

	@Test
	@DisplayName("Record 3533: Phone is 212-288-1008")
	void PhoneOfRecord3533() {
		assertEquals("212-288-1008", customers.get(3532).getPhone());
	}

	@Test
	@DisplayName("Record 3533: Fax is 212-288-2935")
	void FaxOfRecord3533() {
		assertEquals("212-288-2935", customers.get(3532).getFax());
	}

	@Test
	@DisplayName("Record 3533: Email is erma@buttler.com")
	void EmailOfRecord3533() {
		assertEquals("erma@buttler.com", customers.get(3532).getEmail());
	}

	@Test
	@DisplayName("Record 3533: Web is http://www.ermabuttler.com")
	void WebOfRecord3533() {
		assertEquals("http://www.ermabuttler.com", customers.get(3532).getWeb());
	}
}
