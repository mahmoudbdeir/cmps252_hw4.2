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

@Tag("12")
class Record_165 {

	private static List<Customer> customers;

	@BeforeAll
	public static void init() throws FileNotFoundException {
		customers = FileParser.getCustomers(Configuration.CSV_File);
	}

	@Test
	@DisplayName("Record 165: FirstName is Gus")
	void FirstNameOfRecord165() {
		assertEquals("Gus", customers.get(164).getFirstName());
	}

	@Test
	@DisplayName("Record 165: LastName is Prather")
	void LastNameOfRecord165() {
		assertEquals("Prather", customers.get(164).getLastName());
	}

	@Test
	@DisplayName("Record 165: Company is Njw & Associates Inc")
	void CompanyOfRecord165() {
		assertEquals("Njw & Associates Inc", customers.get(164).getCompany());
	}

	@Test
	@DisplayName("Record 165: Address is 41770 12th St W  #-f")
	void AddressOfRecord165() {
		assertEquals("41770 12th St W  #-f", customers.get(164).getAddress());
	}

	@Test
	@DisplayName("Record 165: City is Palmdale")
	void CityOfRecord165() {
		assertEquals("Palmdale", customers.get(164).getCity());
	}

	@Test
	@DisplayName("Record 165: County is Los Angeles")
	void CountyOfRecord165() {
		assertEquals("Los Angeles", customers.get(164).getCounty());
	}

	@Test
	@DisplayName("Record 165: State is CA")
	void StateOfRecord165() {
		assertEquals("CA", customers.get(164).getState());
	}

	@Test
	@DisplayName("Record 165: ZIP is 93551")
	void ZIPOfRecord165() {
		assertEquals("93551", customers.get(164).getZIP());
	}

	@Test
	@DisplayName("Record 165: Phone is 661-940-2742")
	void PhoneOfRecord165() {
		assertEquals("661-940-2742", customers.get(164).getPhone());
	}

	@Test
	@DisplayName("Record 165: Fax is 661-940-0529")
	void FaxOfRecord165() {
		assertEquals("661-940-0529", customers.get(164).getFax());
	}

	@Test
	@DisplayName("Record 165: Email is gus@prather.com")
	void EmailOfRecord165() {
		assertEquals("gus@prather.com", customers.get(164).getEmail());
	}

	@Test
	@DisplayName("Record 165: Web is http://www.gusprather.com")
	void WebOfRecord165() {
		assertEquals("http://www.gusprather.com", customers.get(164).getWeb());
	}
}
