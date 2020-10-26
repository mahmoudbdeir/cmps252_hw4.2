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

@Tag("40")
class Record_4204 {

	private static List<Customer> customers;

	@BeforeAll
	public static void init() throws FileNotFoundException {
		customers = FileParser.getCustomers(Configuration.CSV_File);
	}

	@Test
	@DisplayName("Record 4204: FirstName is Guillermina")
	void FirstNameOfRecord4204() {
		assertEquals("Guillermina", customers.get(4203).getFirstName());
	}

	@Test
	@DisplayName("Record 4204: LastName is Gostomski")
	void LastNameOfRecord4204() {
		assertEquals("Gostomski", customers.get(4203).getLastName());
	}

	@Test
	@DisplayName("Record 4204: Company is Kathleen M Womack Pc")
	void CompanyOfRecord4204() {
		assertEquals("Kathleen M Womack Pc", customers.get(4203).getCompany());
	}

	@Test
	@DisplayName("Record 4204: Address is 1900 E 9th St")
	void AddressOfRecord4204() {
		assertEquals("1900 E 9th St", customers.get(4203).getAddress());
	}

	@Test
	@DisplayName("Record 4204: City is Cleveland")
	void CityOfRecord4204() {
		assertEquals("Cleveland", customers.get(4203).getCity());
	}

	@Test
	@DisplayName("Record 4204: County is Cuyahoga")
	void CountyOfRecord4204() {
		assertEquals("Cuyahoga", customers.get(4203).getCounty());
	}

	@Test
	@DisplayName("Record 4204: State is OH")
	void StateOfRecord4204() {
		assertEquals("OH", customers.get(4203).getState());
	}

	@Test
	@DisplayName("Record 4204: ZIP is 44114")
	void ZIPOfRecord4204() {
		assertEquals("44114", customers.get(4203).getZIP());
	}

	@Test
	@DisplayName("Record 4204: Phone is 216-696-0819")
	void PhoneOfRecord4204() {
		assertEquals("216-696-0819", customers.get(4203).getPhone());
	}

	@Test
	@DisplayName("Record 4204: Fax is 216-696-5158")
	void FaxOfRecord4204() {
		assertEquals("216-696-5158", customers.get(4203).getFax());
	}

	@Test
	@DisplayName("Record 4204: Email is guillermina@gostomski.com")
	void EmailOfRecord4204() {
		assertEquals("guillermina@gostomski.com", customers.get(4203).getEmail());
	}

	@Test
	@DisplayName("Record 4204: Web is http://www.guillerminagostomski.com")
	void WebOfRecord4204() {
		assertEquals("http://www.guillerminagostomski.com", customers.get(4203).getWeb());
	}
}
