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

@Tag("30")
class Record_2469 {

	private static List<Customer> customers;

	@BeforeAll
	public static void init() throws FileNotFoundException {
		customers = FileParser.getCustomers(Configuration.CSV_File);
	}

	@Test
	@DisplayName("Record 2469: FirstName is Marvin")
	void FirstNameOfRecord2469() {
		assertEquals("Marvin", customers.get(2468).getFirstName());
	}

	@Test
	@DisplayName("Record 2469: LastName is Deerman")
	void LastNameOfRecord2469() {
		assertEquals("Deerman", customers.get(2468).getLastName());
	}

	@Test
	@DisplayName("Record 2469: Company is Oak Grove Printing")
	void CompanyOfRecord2469() {
		assertEquals("Oak Grove Printing", customers.get(2468).getCompany());
	}

	@Test
	@DisplayName("Record 2469: Address is 5247 N Clark St")
	void AddressOfRecord2469() {
		assertEquals("5247 N Clark St", customers.get(2468).getAddress());
	}

	@Test
	@DisplayName("Record 2469: City is Chicago")
	void CityOfRecord2469() {
		assertEquals("Chicago", customers.get(2468).getCity());
	}

	@Test
	@DisplayName("Record 2469: County is Cook")
	void CountyOfRecord2469() {
		assertEquals("Cook", customers.get(2468).getCounty());
	}

	@Test
	@DisplayName("Record 2469: State is IL")
	void StateOfRecord2469() {
		assertEquals("IL", customers.get(2468).getState());
	}

	@Test
	@DisplayName("Record 2469: ZIP is 60640")
	void ZIPOfRecord2469() {
		assertEquals("60640", customers.get(2468).getZIP());
	}

	@Test
	@DisplayName("Record 2469: Phone is 773-275-2509")
	void PhoneOfRecord2469() {
		assertEquals("773-275-2509", customers.get(2468).getPhone());
	}

	@Test
	@DisplayName("Record 2469: Fax is 773-275-0943")
	void FaxOfRecord2469() {
		assertEquals("773-275-0943", customers.get(2468).getFax());
	}

	@Test
	@DisplayName("Record 2469: Email is marvin@deerman.com")
	void EmailOfRecord2469() {
		assertEquals("marvin@deerman.com", customers.get(2468).getEmail());
	}

	@Test
	@DisplayName("Record 2469: Web is http://www.marvindeerman.com")
	void WebOfRecord2469() {
		assertEquals("http://www.marvindeerman.com", customers.get(2468).getWeb());
	}
}
