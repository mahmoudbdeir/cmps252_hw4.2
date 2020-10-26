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

@Tag("44")
class Record_3316 {

	private static List<Customer> customers;

	@BeforeAll
	public static void init() throws FileNotFoundException {
		customers = FileParser.getCustomers(Configuration.CSV_File);
	}

	@Test
	@DisplayName("Record 3316: FirstName is Diana")
	void FirstNameOfRecord3316() {
		assertEquals("Diana", customers.get(3315).getFirstName());
	}

	@Test
	@DisplayName("Record 3316: LastName is Stumer")
	void LastNameOfRecord3316() {
		assertEquals("Stumer", customers.get(3315).getLastName());
	}

	@Test
	@DisplayName("Record 3316: Company is Huntingdon Leasing Corp")
	void CompanyOfRecord3316() {
		assertEquals("Huntingdon Leasing Corp", customers.get(3315).getCompany());
	}

	@Test
	@DisplayName("Record 3316: Address is 116 Hillsboro St")
	void AddressOfRecord3316() {
		assertEquals("116 Hillsboro St", customers.get(3315).getAddress());
	}

	@Test
	@DisplayName("Record 3316: City is Pittsboro")
	void CityOfRecord3316() {
		assertEquals("Pittsboro", customers.get(3315).getCity());
	}

	@Test
	@DisplayName("Record 3316: County is Chatham")
	void CountyOfRecord3316() {
		assertEquals("Chatham", customers.get(3315).getCounty());
	}

	@Test
	@DisplayName("Record 3316: State is NC")
	void StateOfRecord3316() {
		assertEquals("NC", customers.get(3315).getState());
	}

	@Test
	@DisplayName("Record 3316: ZIP is 27312")
	void ZIPOfRecord3316() {
		assertEquals("27312", customers.get(3315).getZIP());
	}

	@Test
	@DisplayName("Record 3316: Phone is 919-542-1412")
	void PhoneOfRecord3316() {
		assertEquals("919-542-1412", customers.get(3315).getPhone());
	}

	@Test
	@DisplayName("Record 3316: Fax is 919-542-9234")
	void FaxOfRecord3316() {
		assertEquals("919-542-9234", customers.get(3315).getFax());
	}

	@Test
	@DisplayName("Record 3316: Email is diana@stumer.com")
	void EmailOfRecord3316() {
		assertEquals("diana@stumer.com", customers.get(3315).getEmail());
	}

	@Test
	@DisplayName("Record 3316: Web is http://www.dianastumer.com")
	void WebOfRecord3316() {
		assertEquals("http://www.dianastumer.com", customers.get(3315).getWeb());
	}
}
